package gov.nasa.jpf.vm.va;

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
// TODO simplify (remove Byte and Short)
@SuppressWarnings({"unchecked", "rawtypes"})
public class BufferedStackHandler implements Cloneable, IStackHandler {

	private LinkedList<Tuple> buffer = new LinkedList<>();
	private FeatureExpr bufferCTX = FeatureExprFactory.True();
	private int maxStackSize;
	
	private final StackHandler stackHandler;

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Locals: [");

		for (int i = 0; i < stackHandler.locals.length; i++) {
			string.append(stackHandler.locals[i]);
			string.append(" ");
		}
		string.append("] \nStack: ");
		string.append(stackHandler.stack);

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
		stackHandler.setCtx(ctx);
	}

	public BufferedStackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		if (ctx == null) {
			throw new RuntimeException("CTX == NULL");
		}
		stackHandler = new StackHandler(ctx, nLocals, nOperands);
		maxStackSize = nOperands;
	}

	public BufferedStackHandler() {
		maxStackSize = 0;
		stackHandler = new StackHandler();
	}

	@Override
	public BufferedStackHandler clone() {
		BufferedStackHandler clone = new BufferedStackHandler();
		clone.maxStackSize = maxStackSize;
		clone.stackHandler.length = stackHandler.length;
		clone.stackHandler.locals = new Conditional[stackHandler.locals.length];
		for (int i = 0; i < stackHandler.locals.length; i++) {
			Conditional<Entry> local = stackHandler.locals[i];
			clone.stackHandler.locals[i] = local.map(new CopyEntry());
		}
		clone.buffer = (LinkedList<Tuple>) buffer.clone();
		clone.bufferCTX = bufferCTX;

		clone.stackHandler.stack = stackHandler.stack.map(new CopyStack());
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
	 * ####################################################### 
	 * Handling of the stack 
	 * ########################################################
	 */
	public void debufferAll() {
		final FeatureExpr ctx = bufferCTX;
		bufferCTX = FeatureExprFactory.False();
		while (!buffer.isEmpty()) {
			final Tuple value = buffer.removeLast();
			value.value.mapf(ctx, (BiConsumer<FeatureExpr, Object>) (ctx1, v) ->  {
				stackHandler.push(ctx1, (Number) v, value.isRef);
			});
		}
		bufferCTX = FeatureExprFactory.True();
	}
	
	void addToBuffer(Conditional<?> value, boolean isRef, Type t) {
		buffer.push(new Tuple(value, isRef, t));
	}

	class Tuple {
		
		final Conditional value;
		final boolean isRef;
		final Type t;
		final int size;

		private Tuple(Conditional value, boolean isRef, Type t) {
			this.value = value;
			this.isRef = isRef;
			this.t = t;
			if (t == Type.DOUBLE || t == Type.LONG) {
				size = 2;
			} else {
				size = 1;
			}
		}
		
		public int getSize() {
			return size;
		}

		@Override
		public String toString() {
			return "Tuple [value=" + value + ", isRef=" + isRef + "]";
		}

	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				final Tuple entry = buffer.peek();
				if (entry.size == 1) {
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
						stackHandler.locals[index] = newValue;
					} else {
						if (stackHandler.locals[index] == null) {
							stackHandler.locals[index] = new One<>(Entry.create(MJIEnv.NULL, false));
						}
						stackHandler.locals[index] = ChoiceFactory.create(ctx, newValue, stackHandler.locals[index]).simplify();
					}
					return;
				} else {
					// TODO implement
				}
			}
			debufferAll();
		}
		stackHandler.storeOperand(ctx, index);
	}
	
	@Override
	public void push(FeatureExpr ctx, Conditional<Integer> value) {
		push(ctx, value, false, Type.INT);
	}

	@Override
	public void pushFloat(FeatureExpr ctx, Conditional<Float> value) {
		push(ctx, value, false, Type.FLOAT);
	}

	@Override
	public void pushLong(FeatureExpr ctx, Conditional<Long> value) {
		push(ctx, value, false, Type.LONG);
	}

	@Override
	public void pushDouble(FeatureExpr ctx, Conditional<Double> value) {
		push(ctx, value, false, Type.DOUBLE);
	}

	@Override
	public Conditional<Integer> pop(FeatureExpr ctx) {
		return pop(ctx, Type.INT);
	}

	@Override
	public Conditional<Long> popLong(FeatureExpr ctx) {
		return pop(ctx, Type.LONG);
	}

	@Override
	public Conditional<Double> popDouble(FeatureExpr ctx) {
		return pop(ctx, Type.DOUBLE);
	}

	@Override
	public Conditional<Float> popFloat(FeatureExpr ctx) {
		return pop(ctx, Type.FLOAT);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		return peek(ctx, offset, Type.DOUBLE);
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		return peek(ctx, offset, Type.LONG);
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		return peek(ctx, offset, Type.FLOAT);
	}
	
	@Override
	public void push(FeatureExpr ctx,  Conditional<Integer> value, boolean isRef) {
		push(ctx, value, isRef, Type.INT);
	}
	
	public void push(FeatureExpr ctx, Conditional value, boolean isRef, Type t) {
		if (Conditional.isContradiction(Conditional.and(ctx, stackHandler.stackCTX))) {
			return;
		}
		if (buffer.isEmpty()) {
			bufferCTX = Conditional.and(stackHandler.stackCTX, ctx);
			addToBuffer(value.simplify(bufferCTX), isRef, t);
		} else if (Conditional.equivalentTo(bufferCTX, Conditional.and(stackHandler.stackCTX, ctx))) {
			addToBuffer(value.simplify(ctx), isRef, t);
		} else {
			debufferAll();
			bufferCTX = Conditional.and(stackHandler.stackCTX, ctx);
			addToBuffer(value.simplify(ctx), isRef, t);
		}
		
	}

	// TODO simplify
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
					if (value instanceof Float) {
						return buffer.pop().value.map(x -> Types.floatToInt((Float) x));
					}
					break;
				case LONG:
					if (value instanceof Long) {
						return buffer.pop().value;
					} else if (value instanceof Double) {
						return buffer.pop().value.map(x -> Types.doubleToLong((Double) x));
					} else {
						if (buffer.size() >= 2) {
							final Object value2 = buffer.get(1).value.getValue(true);
							if (value2 instanceof Integer) {
								final Conditional pop1 = buffer.pop().value;
								final Conditional pop2 = buffer.pop().value;
								return pop1.mapr(x1 -> pop2.map(x2 -> Types.intsToLong(NumberToInt((Number)x1), NumberToInt((Number)x2)))).simplify();
							}
						} else {
							debufferAll();
							return stackHandler.pop(ctx, t);
						}
						break;
					}
				default:
					throw new RuntimeException("Type " + value.getClass() + " not supported " + t);
				}
				
				debufferAll();
			} else {
				debufferAll();
			}
		}
		return stackHandler.pop(ctx, t);
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
					if (buffer.peek().size == 1) {
						buffer.removeFirst();
						n--;
						continue;
					} else {
						if (n > 1) {
							buffer.removeFirst();
							buffer.removeFirst();
							n = n - 2;
							continue;
						} else {
							debufferAll();
							stackHandler.pop(ctx, n);
							return;
						}
					}
				}
			} else {
				debufferAll();
				stackHandler.pop(ctx, n);
			}
		} else {
			stackHandler.pop(ctx, n);
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
		return stackHandler.peek(ctx);
	}
	
	private int getBufferSize() {
		int size = 0;
		for (Tuple entry : buffer) {
			if (entry.size == 1) {
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
					} else if (type instanceof Float) {
						if (n == offset) {
							return value.map(x -> Types.floatToInt(((Float) x).floatValue()));
						}
						n++;
						continue;
					} else {
						if (n - pointer > 1) {
							n++;
							pointer--;
							continue;
						} else {
							debufferAll();
							return stackHandler.peek(ctx, offset);
						}
					}
					
				}
			}
			debufferAll();
		}
		return stackHandler.peek(ctx, offset);
	}

	// TODO simplify this method!!
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
										return stackHandler.peek(ctx, offset, t);
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
										return stackHandler.peek(ctx, offset, t);
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
					} else if (type instanceof Float) {
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
					} else {
						if (n - pointer > 1) {
							n++;
							pointer--;
							continue;
						} else {
							debufferAll();
							return stackHandler.peek(ctx, offset, t);
						}
					}
				}
			}
			debufferAll();
		}
		return stackHandler.peek(ctx, offset, t);
	}
	
	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		debufferAll();// TODO improve
		stackHandler.storeLongOperand(ctx, index);
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
		stackHandler.clear(ctx);
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
				return stackHandler.hasAnyRef(ctx);
			}
			debufferAll();
		}
		return stackHandler.hasAnyRef(ctx);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		debufferAll();
		stackHandler.set(ctx, offset, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		stackHandler.setLocal(ctx, index, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		stackHandler.setLocal(ctx, index, value, isRef);
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		if (Conditional.isContradiction(Conditional.and(ctx, stackHandler.stackCTX))) {
			return;
		}
		Conditional<Entry> value = stackHandler.locals[index].simplify(Conditional.and(ctx, stackHandler.stackCTX));
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
					stackHandler.push(ctx1, entry.value, entry.isRef);
					return null;
				});
				return;
			}
		}
		Conditional<Integer> pushValue = value.map(x -> x.value);
		
		if (buffer.isEmpty()) {
			bufferCTX = ctx;
			addToBuffer(( pushValue), isRef, Type.INT);
			return;
		}
		if (Conditional.equivalentTo(bufferCTX, ctx)) {
			addToBuffer((pushValue), isRef, Type.INT);
			return;
		} else {
			debufferAll();
			bufferCTX = ctx;
			addToBuffer(( pushValue), isRef, Type.INT);
			return;
		}
		
	}
	
	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		Conditional<Entry> entry = stackHandler.locals[index];
		if (entry == null) {
			entry = new One<>(new Entry(0, false));
		}
		
		push(ctx, entry.mapf(ctx, (BiFunction<FeatureExpr, Entry, Conditional<Integer>>) (ctx1, entry1) -> new One<>(entry1.value)), false, Type.INT);
		
		entry = stackHandler.locals[index + 1];
		if (entry == null) {
			entry = new One<>(new Entry(0, false));
		}
		push(ctx, entry.mapf(ctx, (BiFunction<FeatureExpr, Entry, Conditional<Integer>>) (ctx1, entry1) -> new One<>(entry1.value)), false, Type.INT);
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				for (Tuple entry : buffer) {
					if (entry.size == 1) {
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
				return stackHandler.isRef(ctx, offset);
			}
			debufferAll();
		}
		return stackHandler.isRef(ctx, offset);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		if (index >= stackHandler.locals.length) {
			debufferAll();
		}
		return stackHandler.isRefLocal(ctx, index);
	}

	@Override
	public Conditional<Integer> getTop() {
		if (!buffer.isEmpty()) {
			int size = -1;
			for (Tuple entry : buffer) {
				size += entry.size;
			}

			Conditional<Integer> stackTop = stackHandler.getTop();
			if (stackTop.equals(One.valueOf(-1))) {
				if (Conditional.isTautology(bufferCTX)) {
					return One.valueOf(size);
				}
				return ChoiceFactory.create(bufferCTX, new One<>(size), new One<>(-1)).simplify(stackHandler.stackCTX);
			}
			final int finalSize = size;
			return stackTop.mapf(FeatureExprFactory.True(), (ctx, y) -> {
				FeatureExpr context = Conditional.and(bufferCTX, ctx);
				if (Conditional.isContradiction(context)) {
					return One.valueOf(y);
				}
				return ChoiceFactory.create(context, new One<>(y + finalSize), new One<>(y));
			}).simplify(stackHandler.stackCTX);
		}
		return stackHandler.getTop();
	}
	
	// A => A A
	@Override
	public void dup(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				Tuple peek = buffer.peek();
				if (peek.size == 1) {
					buffer.push(peek);
					return;
				}
				debufferAll();
			} else {
				debufferAll();
			}
		}

		stackHandler.dup(ctx);
	}

	// A B => A B A B
	@Override
	public void dup2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 2 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().size == 1 &&
						buffer.get(1).size == 1) {
					buffer.push(buffer.get(1));
					buffer.push(buffer.get(1));
					return;
				}
			}
			debufferAll();
		}
		stackHandler.dup2(ctx);
	}

	// A B => B A
	@Override
	public void swap(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 2 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().size == 1 &&
					buffer.get(1).size == 1) {
					buffer.add(1, buffer.pop());
					return;
				}
			}
			debufferAll();
		}
		stackHandler.swap(ctx);
	}

	// A B C => .. B C A B C
	@Override
	public void dup2_x1(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 3 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().size == 1 && buffer.get(1).size == 1 && buffer.get(2).size == 1) {
					buffer.add(3, buffer.get(1));
					buffer.add(3, buffer.peek());
					return;
				}
			}
			debufferAll();
		}
		stackHandler.dup2_x1(ctx);
	}

	// A B C D => .. C D A B C D
	@Override
	public void dup2_x2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 4 && Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.peek().size == 1 && buffer.get(1).size == 1 && buffer.get(2).size == 1
						&& buffer.get(3).size == 1) {
					buffer.add(4, buffer.get(1));
					buffer.add(4, buffer.peek());
					return;
				}
			}
			debufferAll();
		}
		stackHandler.dup2_x2(ctx);
	}

	// A B => .. B A B
	@Override
	public void dup_x1(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 2) {
				if (Conditional.equivalentTo(bufferCTX, ctx)) {
					if (buffer.peek().getSize() == 1 && buffer.get(1).size == 1) {
						buffer.add(2, buffer.peek());
						return;
					}
				}
			}
			debufferAll();
		}
		stackHandler.dup_x1(ctx);
	}

	// A B C => .. C A B C
	// {A B} can be a Long or Double
	@Override
	public void dup_x2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (Conditional.equivalentTo(bufferCTX, ctx)) {
				if (buffer.size() >= 2) {
					if (buffer.peek().size == 1) {
						if (buffer.get(1).getSize() == 2) {
							buffer.add(2, buffer.peek());
							return;
						} else if (buffer.size() >= 3) {
							buffer.add(3, buffer.peek());
							return;
						}
					}
				}
				
			}
			debufferAll();
		}
		stackHandler.dup_x2(ctx);
	}


	@Override
	public Set<Integer> getAllReferences() {
		Set<Integer> references = stackHandler.getAllReferences();
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
			return stackHandler.equals(((BufferedStackHandler) o).stackHandler);
		}
		return false;
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		if (index >= stackHandler.locals.length) {
			debufferAll();
		}
		return stackHandler.getLocal(ctx, index);
	}

	@Override
	public int[] getSlots() {
		debufferAll();
		return stackHandler.getSlots();
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		debufferAll();
		return stackHandler.getSlots(ctx);
	}


	@Override
	public int getStackWidth() {
		debufferAll();
		return stackHandler.getStackWidth();
	}

	@Override
	public FeatureExpr getCtx() {
		return stackHandler.getCtx();
	}

	@Override
	public int getLocalWidth() {
		return stackHandler.getLocalWidth();
	}

	@Override
	public String getMaxLocal() {
		return stackHandler.getMaxLocal();
	}

	@Override
	public int getLength() {
		return stackHandler.getLength();
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, int increment) {
		stackHandler.IINC(ctx, index, increment);
	}

	@Override
	public Object getLocal(int index) {
		return stackHandler.getLocal(index);
	}

}
