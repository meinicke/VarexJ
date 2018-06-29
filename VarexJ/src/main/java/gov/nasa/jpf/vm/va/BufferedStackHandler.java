package gov.nasa.jpf.vm.va;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.Types;

/**
 * Alternative stack implementations based on {@link StackHandler}.<br>
 * Values are cached until it is necessary to push them into a variability-aware {@link Stack}. 
 * 
 * @author Jens Meinicke
 *
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class BufferedStackHandler extends StackHandler implements Cloneable, IStackHandler {

	private LinkedList<Tuple> buffer = new LinkedList<>();
	private FeatureExpr bufferCTX = FeatureExprFactory.True();
	private int maxStackSize;

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Locals: [");

		for (int i = 0; i < locals.length; i++) {
			if (locals[i] == null) {
				string.append("null");
			} else {
				string.append(locals[i]);
			}
			string.append(" ");
		}
		string.append("] \nStack: ");
		string.append(stack);

		string.append("\nBuffered: " + bufferCTX);
		int i = buffer.size();
		for (Tuple e : buffer) {
			string.append('\n');
			string.append(--i);
			string.append(':');
			string.append(e);
		}

		return string.toString();
	}
	
	@Override
	public void setCtx(FeatureExpr ctx) {
		debufferAll();
		super.setCtx(ctx);
	}

	public BufferedStackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		if (ctx == null) {
			throw new RuntimeException("CTX == NULL");
		}
		length = nLocals + nOperands;
		maxStackSize = nOperands;
		locals = new Conditional[nLocals];
		Arrays.fill(locals, nullValue);
		stack = new One<>(new Stack(nOperands));
		stackCTX = ctx;
	}

	public BufferedStackHandler() {
		super();
		maxStackSize = 0;
	}

	@Override
	public BufferedStackHandler clone() {
		BufferedStackHandler clone = new BufferedStackHandler();
		clone.maxStackSize = maxStackSize;
		clone.length = length;
		clone.locals = new Conditional[locals.length];
		for (int i = 0; i < locals.length; i++) {
			Conditional<Entry> local = locals[i];
			if (local != null) {
				clone.locals[i] = local.map(new CopyEntry());
			}
		}
		clone.buffer = (LinkedList<Tuple>) buffer.clone();
		clone.bufferCTX = bufferCTX;

		clone.stack = stack.map(new CopyStack());
		return clone;
	}

	static final class CopyEntry implements Function<Entry, Entry> {
		@Override
		public Entry apply(final Entry entry) {
			return entry.copy();
		}
	}

	static final class CopyStack implements Function<Stack, Stack> {
		@Override
		public Stack apply(final Stack stack) {
			return stack.copy();
		}
	}

	/*
	 * ####################################################### Handling of the
	 * stack ########################################################
	 */

	public void debufferAll() {
		final FeatureExpr ctx = bufferCTX;
		bufferCTX = FeatureExprFactory.False();
		while (!buffer.isEmpty()) {
			final Tuple value = buffer.removeLast();
			value.value.mapf(ctx, new BiConsumer<FeatureExpr, Object>() {

				@Override
				public void accept(final FeatureExpr ctx, final Object v) {
					superPush(ctx, v, value.isRef);
				}

			});
		}
		bufferCTX = FeatureExprFactory.True();
	}
	
	public void superPush(FeatureExpr ctx, Object value, boolean isRef) {
		super.push(ctx, value, isRef);
	}

	void addToBuffer(Conditional<?> value, boolean isRef) {
		buffer.push(new Tuple(value, isRef));
	}

	class Tuple {
		
		final Conditional value;
		final boolean isRef;

		private Tuple(Conditional value, boolean isRef) {
			this.value = value;
			this.isRef = isRef;
		}

		@Override
		public String toString() {
			return "Tuple [value=" + value + ", isRef=" + isRef + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (isRef ? 1231 : 1237);
			return prime * result + ((value == null) ? 0 : value.hashCode());
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tuple other = (Tuple) obj;
			if (isRef != other.isRef)
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				final Tuple entry = buffer.peek();
				Object value = entry.value.getValue(true);
				if (value instanceof Integer || value instanceof Byte 
						|| value instanceof Short|| value instanceof Float) {
					Conditional newValue = buffer.pop().value.map(new Function<Number, Entry>() {

						@Override
						public Entry apply(Number x) {
							if (x instanceof Float) {
								return Entry.create(Types.floatToInt((Float)x), entry.isRef);								
							}
							return Entry.create(x.intValue(), entry.isRef);
						}

					});
					if (Conditional.isTautology(ctx)) {
						locals[index] = newValue;
					} else {
						if (locals[index] == null) {
							locals[index] = new One<>(Entry.create(MJIEnv.NULL, false));
						}
						locals[index] = ChoiceFactory.create(ctx, newValue, locals[index]).simplify();
					}
					return;
				} else if (value instanceof Double|| value instanceof Long) {
					// TODO implement
				} else {
					throw new RuntimeException("Type " + value.getClass() + " not supported ");
				}
			}
			debufferAll();
		}
		super.storeOperand(ctx, index);
	}

	@Override
	public void push(FeatureExpr ctx, Object value, boolean isRef) {
		if (Conditional.isContradiction(Conditional.and(ctx, stackCTX))) {
			return;
		}
		if (!(value instanceof Conditional)) {
			push(ctx, new One<>(value), isRef);
			return;
		}
		assert !isRef || ((Conditional) value).getValue(true) instanceof Integer;  
		if (buffer.isEmpty()) {
			bufferCTX = Conditional.and(stackCTX, ctx);
			addToBuffer(((Conditional) value).simplify(ctx), isRef);
		} else if (Conditional.equivalentTo(bufferCTX, Conditional.and(stackCTX, ctx))) {
			addToBuffer(((Conditional) value).simplify(ctx), isRef);
		} else {
			debufferAll();
			bufferCTX = Conditional.and(stackCTX, ctx);
			addToBuffer(((Conditional) value).simplify(ctx), isRef);
		}
		
	}

	@Override
	public <T> Conditional<T> pop(FeatureExpr ctx, Type t) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				final Object value = buffer.peek().value.getValue(true);
				switch (t) {
				case DOUBLE:
					if (value instanceof Double) {
						return buffer.pop().value;
					}
					if (value instanceof Long) {
						return buffer.pop().value.map(x -> Types.longToDouble((Long) x));
					}
					if (value instanceof Integer) {
						if (buffer.size() >= 2) {
							final Object value2 = buffer.get(1).value.getValue(true);
							if (value2 instanceof Integer) {
								final Conditional pop1 = buffer.pop().value;
								final Conditional pop2 = buffer.pop().value;
								return pop1.mapr(x1 -> pop2.map(x2 -> Types.intsToDouble((Integer) x1, (Integer) x2))).simplify();
							}
						}
						break;
					}
					break;
				case FLOAT:
					if (value instanceof Float) {
						return buffer.pop().value;
					}
					if (value instanceof Integer) {
						return  buffer.pop().value.map(x -> Types.intToFloat((Integer) x));
					}
					if (value == null) {
						buffer.pop();
						return (Conditional<T>) new One<>((float)0.0);
					}
					break;
				case INT:
					if (value instanceof Integer) {
						return buffer.pop().value;
					}
					if (value instanceof Byte ||
						value instanceof Short) {
						return buffer.pop().value.map(x -> ((Number) x).intValue());
					}
					if (value instanceof Float) {
						return buffer.pop().value.map(x -> Types.floatToInt((Float) x));
					}
					break;
				case LONG:
					if (value instanceof Long) {
						return buffer.pop().value;
					}
					if (value instanceof Double) {
						return buffer.pop().value.map(x -> Types.doubleToLong((Double) x));
					}
					if (value instanceof Integer || value instanceof Byte || value instanceof Short || value instanceof Float) {
						if (buffer.size() >= 2) {
							final Object value2 = buffer.get(1).value.getValue(true);
							if (value2 instanceof Integer) {
								final Conditional pop1 = buffer.pop().value;
								final Conditional pop2 = buffer.pop().value;
								return pop1.mapr(x1 -> pop2.map(x2 -> Types.intsToLong(NumberToInt((Number)x1), NumberToInt((Number)x2)))).simplify();
							}
						} else {
							debufferAll();
							return super.pop(ctx, t);
						}
						break;
					}
					throw new RuntimeException("Type " + value.getClass() + " not supported " + t);
				default:
					throw new RuntimeException("Type " + value.getClass() + " not supported " + t);
				}
				
				debufferAll();
			} else {
				debufferAll();
			}
		}
		return super.pop(ctx, t);
	}
	
	private static int NumberToInt(Number n) {
		if (n instanceof Float) {
			return Types.floatToInt((Float)n);
		}
		return n.intValue();
	}

	@Override
	public void pop(FeatureExpr ctx, int n) {
		if (n == 0) {
			return;
		}
		if (!buffer.isEmpty()) {
			if (buffer.size() >= n && Conditional.equivalentTo(bufferCTX, ctx)) {
				while (n > 0) {
					Object value = buffer.peek().value.getValue(true);
					if (value instanceof Integer || 
						value instanceof Float || 
						value instanceof Byte || 
						value instanceof Short ||
						value == null) {
						buffer.removeFirst();
						n--;
						continue;
					}
					if (value instanceof Double || value instanceof Long) {
						if (n > 1) {
							buffer.removeFirst();
							buffer.removeFirst();
							n = n - 2;
							continue;
						} else {
							debufferAll();
							super.pop(ctx, n);
							return;
						}

					}
					throw new RuntimeException("type " + value.getClass() + " missed");
				}
			} else {
				debufferAll();
				super.pop(ctx, n);
			}
		} else {
			super.pop(ctx, n);
		}
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				Conditional<Integer> peek = buffer.peek().value;
				if (peek.getValue(true) instanceof Integer) {
					return peek;
				}
			}
			debufferAll();
		}
		return super.peek(ctx);
	}
	
	private int getBufferSize() {
		int size = 0;
		for (Tuple entry : buffer) {
			Object type = entry.value.getValue(true);
			if (type instanceof Integer ||
				type instanceof Float ||
				type instanceof Byte ||
				type instanceof Short || 
				type == null) {
				size++;
			} else {
				size += 2;
			}
		}
		
		
		return size;
	}
	
	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, final int offset) {
		if (!buffer.isEmpty()) {
			if (getBufferSize() > offset && Conditional.equivalentTo(bufferCTX, ctx)) {
				int pointer = offset;
				int n = 0;
				while (n <= pointer) {
					Conditional value = buffer.get(n).value;
					Object type = value.getValue(true);
					if (type instanceof Integer) {
						if (n == offset) {
							return value;
						}
						n++;
						continue;
					}
					if (type instanceof Float) {
						if (n == offset) {
							return value.map(x -> Types.floatToInt(((Float) x).floatValue()));
						}
						n++;
						continue;
					}
					if (type instanceof Double || type instanceof Long) {
						if (n - pointer > 1) {
							n++;
							pointer--;
							continue;
						} else {
							debufferAll();
							return super.peek(ctx, offset);
						}
					}
					if (type instanceof Byte) {
						if (n == offset) {
							return value.map(x -> (int)((Byte)x).byteValue());
						}
						n++;
						continue;
					}
					if (type instanceof Short) {
						if (n == offset) {
							return value.map(x -> (int)(short)x);
						}
						n++;
						continue;
					}
					throw new RuntimeException("type " + type.getClass() + " missed");
					
				}
			}
			debufferAll();
		}
		return super.peek(ctx, offset);
	}

	// TODO simplify this method!!
	@Override
	public <T> Conditional<T> peek(FeatureExpr ctx, final int offset, Type t) {
		if (!buffer.isEmpty()) {
			if (getBufferSize() > offset && Conditional.equivalentTo(bufferCTX, ctx)) {
				int pointer = offset;
				int n = 0;
				while (n <= pointer) {
					Conditional value = buffer.get(n).value;
					Object type = value.getValue(true);
					if (type instanceof Integer) {
						if (n == offset) {
							switch (t) {
							case LONG:
								if (buffer.size() > n + 1) { 
									final Conditional value2 = buffer.get(n + 1).value;
									if (value2.getValue(true) instanceof Double || value2.getValue(true) instanceof Long) {
										debufferAll();
										return super.peek(ctx, offset, t);
									}
									return value.mapr(x1 -> value2.map(x2 -> Types.intsToLong(NumberToInt((Number)x1), NumberToInt((Number)x2))));
								} else {
									break;
								}
							case DOUBLE:
								if (buffer.size() > n + 1) { 
									final Conditional value2 = buffer.get(n + 1).value;
									if (value2.getValue(true) instanceof Double || value2.getValue(true) instanceof Long) {
										debufferAll();
										return super.peek(ctx, offset, t);
									}
									return value.mapr(x1 -> value2.map(x2 -> Types.intsToDouble(NumberToInt((Number)x1), NumberToInt((Number)x2))));
								} else {
									break;
								}
							case FLOAT:
								return value.map(x1 -> Types.intToFloat((int)x1));
							default:
								throw new RuntimeException("type " + type.getClass() + " missed" + t);
							}
						}
						n++;
						continue;
					}
					if (type instanceof Float) {
						if (n == offset) {
							switch (t) {
							case FLOAT:
								return value;
							case INT:
								return value.map(x -> Types.floatToInt(((Float) x).floatValue()));
							default:
								break;
							}
							
						}
						n++;
						continue;
					}
					if (type instanceof Double || type instanceof Long) {
						if (n - pointer > 1) {
							n++;
							pointer--;
							continue;
						} else {
							debufferAll();
							return super.peek(ctx, offset, t);
						}
					}
					if (type instanceof Byte) {
						if (n == offset) {
							switch (t) {
							case FLOAT:
								return value.map(x1 -> Types.intToFloat((byte) x1));
							case DOUBLE:
								break;
							case INT:
								return value.map(x -> (int) ((Byte) x).byteValue());
							case LONG:
								break;
							default:
								break;

							}

						}
						n++;
						continue;
					}
					if (type instanceof Short) {
						if (n == offset) {
							switch (t) {
							case FLOAT:
								return value.map(x1 -> Types.intToFloat((short) x1));
							case DOUBLE:
								break;
							case INT:
								return value.map(x1 -> (short) x1);
							case LONG:
								break;
							}
						}
						n++;
						continue;
					}
					if (type == null) {
						debufferAll();
						break;
					}
					throw new RuntimeException("type " + type.getClass() + " missed");
					
				}
			}
			debufferAll();
		}
		return super.peek(ctx, offset, t);
	}
	
	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		debufferAll();// TODO improve
		super.storeLongOperand(ctx, index);
	}

	@Override
	public void clear(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				buffer.clear();
				bufferCTX = FeatureExprFactory.True();
			} else {
				debufferAll();
			}
		}
		super.clear(ctx);
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				for (Tuple entry : buffer) {
					if (entry.isRef) {
						return true;
					}
				}
				return super.hasAnyRef(ctx);
			}
			debufferAll();
		}
		return super.hasAnyRef(ctx);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		debufferAll();
		super.set(ctx, offset, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		super.setLocal(ctx, index, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		super.setLocal(ctx, index, value, isRef);
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		if (Conditional.isContradiction(Conditional.and(ctx, stackCTX))) {
			return;
		}
		Conditional<Entry> value = locals[index].simplify(Conditional.and(ctx, stackCTX));
		if (value == null) {
			value = new One<>(Entry.create(MJIEnv.NULL, false));
		}
		
		Boolean isRef = null;
		for (Entry v : value.toList()) {
			if (isRef == null) {
				isRef = v.isRef;
			} else if (isRef != v.isRef) {
				debufferAll();
				value.mapf(ctx, (BiFunction<FeatureExpr, Entry, Conditional<Object>>) (ctx1, entry) -> {
					push(ctx1, entry.value, entry.isRef);
					return null;
				});
				return;
			}
		}
		Conditional<Integer> pushValue = value.map(x -> x.value);
		
		if (buffer.isEmpty()) {
			bufferCTX = ctx;
			addToBuffer(( pushValue), isRef);
			return;
		}
		if (Conditional.equivalentTo(bufferCTX, ctx)) {
			addToBuffer((pushValue), isRef);
			return;
		} else {
			debufferAll();
			bufferCTX = ctx;
			addToBuffer(( pushValue), isRef);
			return;
		}
		
	}
	
	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		Conditional<Entry> entry = locals[index];
		if (entry == null) {
			entry = new One<>(new Entry(0, false));
		}
		
		push(ctx, entry.mapf(ctx, (BiFunction<FeatureExpr, Entry, Conditional<Integer>>) (ctx1, entry1) -> new One<>(entry1.value)), false);
		
		entry = locals[index + 1];
		if (entry == null) {
			entry = new One<>(new Entry(0, false));
		}
		push(ctx, entry.mapf(ctx, (BiFunction<FeatureExpr, Entry, Conditional<Integer>>) (ctx1, entry1) -> new One<>(entry1.value)), false);
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				for (Tuple entry : buffer) {
					Object type = entry.value.getValue(true);
					if (type instanceof Integer ||
						type instanceof Float ||
						type instanceof Byte ||
						type instanceof Short || 
						type == null) {
						if (offset == 0) {
							return entry.isRef;
						}
						offset--;
					} else {
						if (offset == 0) {
							return false;
						}
						if (offset == 1) {
							return entry.isRef;
						}
						offset -= 2;
					}
				}
				return super.isRef(ctx, offset);
			}
			debufferAll();
		}
		return super.isRef(ctx, offset);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		if (index >= locals.length) {
			debufferAll();
		}
		return super.isRefLocal(ctx, index);
	}

	@Override
	public Conditional<Integer> getTop() {
		if (!buffer.isEmpty()) {
			int size = -1;
			for (Tuple entry : buffer) {
				Conditional value = entry.value;
				if (value.getValue(true) instanceof Integer) {
					size++;
					continue;
				}
				if (value.getValue(true) instanceof Float) {
					size++;
					continue;
				}
				if (value.getValue(true) instanceof Long) {
					size += 2;
					continue;
				}
				if (value.getValue(true) instanceof Double) {
					size += 2;
					continue;
				}
				if (value.getValue(true) instanceof Byte) {
					size++;
					continue;
				}
				if (value.getValue(true) instanceof Short) {
					size++;
					continue;
				}
				if (value.getValue(true) == null) {
					size++;
					continue;
				}
			}

			Conditional<Integer> stackTop = super.getTop();
			if (stackTop.equals(One.valueOf(-1))) {
				if (Conditional.isTautology(bufferCTX)) {
					return One.valueOf(size);
				}
				return ChoiceFactory.create(bufferCTX, new One<>(size), new One<>(-1)).simplify(stackCTX);
			}
			final int finalSize = size;
			return stackTop.mapf(FeatureExprFactory.True(), (ctx, y) -> {
				FeatureExpr context = Conditional.and(bufferCTX, ctx);
				if (Conditional.isContradiction(context)) {
					return One.valueOf(y);
				}
				return ChoiceFactory.create(context, new One<>(y + finalSize + 1), new One<>(y));
			}).simplify(stackCTX);
		}
		return super.getTop();
	}
	
	// A => A A
	@Override
	public void dup(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				Tuple peek = buffer.peek();
				if (peek.value.getValue(true) instanceof Integer) {
					buffer.push(peek);
					return;
				}
				debufferAll();
			} else {
				debufferAll();
			}
		}

		super.dup(ctx);
	}

	// A B => A B A B
	@Override
	public void dup2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 2 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer &&
						buffer.get(1).value.getValue(true) instanceof Integer) {
					buffer.push(buffer.get(1));
					buffer.push(buffer.get(1));
					return;
				}
			}
			debufferAll();
		}
		super.dup2(ctx);
	}

	// A B => B A
	@Override
	public void swap(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 2 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer &&
					buffer.get(1).value.getValue(true) instanceof Integer) {
					buffer.add(1, buffer.pop());
					return;
				}
			}
			debufferAll();
		}
		super.swap(ctx);
	}

	// A B C => .. B C A B C
	@Override
	public void dup2_x1(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 3 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer && buffer.get(1).value.getValue(true) instanceof Integer && buffer.get(2).value.getValue(true) instanceof Integer) {
					buffer.add(3, buffer.get(1));
					buffer.add(3, buffer.peek());
					return;
				}
			}
			debufferAll();
		}
		super.dup2_x1(ctx);
	}

	// A B C D => .. C D A B C D
	@Override
	public void dup2_x2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 4 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer && buffer.get(1).value.getValue(true) instanceof Integer && buffer.get(2).value.getValue(true) instanceof Integer
						&& buffer.get(3).value.getValue(true) instanceof Integer) {
					buffer.add(4, buffer.get(1));
					buffer.add(4, buffer.peek());
					return;
				}
			}
			debufferAll();
		}
		super.dup2_x2(ctx);
	}

	// A B => .. B A B
	@Override
	public void dup_x1(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 2) {
				if (Conditional.equivalentTo(bufferCTX, ctx)) {
					if (buffer.peek().value.getValue(true) instanceof Integer && buffer.get(1).value.getValue(true) instanceof Integer) {
						buffer.add(2, buffer.peek());
						return;
					}
				}
			}
			debufferAll();
		}
		super.dup_x1(ctx);
	}

	// A B C => .. C A B C
	@Override
	public void dup_x2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 3 && Conditional.equivalentTo(bufferCTX, ctx)) {
				buffer.add(3, buffer.peek());
				return;
			} else {
				debufferAll();
			}
		}
		super.dup_x2(ctx);
	}


	@Override
	public Set<Integer> getAllReferences() {
		Set<Integer> references = super.getAllReferences();
		for (Tuple entry : buffer) {
			if (entry.isRef) {
				references.addAll(entry.value.toList());
			}
		}
		return references;
	}

	@Override
	public boolean equals(Object o) {
		debufferAll();
		if (o instanceof BufferedStackHandler) {
			((BufferedStackHandler) o).debufferAll();
		}
		return super.equals(o);
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		if (index >= locals.length) {
			debufferAll();
		}
		return super.getLocal(ctx, index);
	}

	@Override
	public int[] getSlots() {
		debufferAll();
		return super.getSlots();
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		debufferAll();
		return super.getSlots(ctx);
	}


	@Override
	public int getStackWidth() {
		debufferAll();
		return super.getStackWidth();
	}

}
