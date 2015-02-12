package gov.nasa.jpf.vm.va;

import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.Types;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

import cmu.conditional.BiFunction;
import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * Stack implementation where locals are separated from stack.<br>
 * Locals: Conditional[]<br>
 * Stack: Conditional -Stack-
 * 
 * @author Jens Meinicke
 *
 */
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
		for (Tuple e : buffer) {
			string.append('\n');
			string.append(e);
		}

		return string.toString();
	}

	public BufferedStackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		// super(ctx, nLocals, nOperands);

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

	/*
	 * ####################################################### Handling of the
	 * stack ########################################################
	 */

	public void debufferAll() {
		final FeatureExpr ctx = bufferCTX;
		bufferCTX = FeatureExprFactory.False();
		while (!buffer.isEmpty()) {
			Tuple value = buffer.removeLast();
			super.push(ctx, value.value, value.isRef);
		}
		bufferCTX = FeatureExprFactory.True();
	}

	void addToBuffer(Conditional value, boolean isRef) {
		buffer.push(new Tuple(value, isRef));
	}

	class Tuple {
		final Conditional value;
		final boolean isRef;

		private Tuple(Conditional value, boolean isRef) {
			if (value instanceof Conditional) {
				this.value = value;
			} else {
				this.value = new One<>(value);
			}
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

	@SuppressWarnings("unchecked")
	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		if (!buffer.isEmpty()) {
			if (bufferCTX.equivalentTo(ctx)) {
				// TODO improve this
				final Tuple value = buffer.peek();
				if (value.value.getValue(true) instanceof Integer) {
					Conditional newValue = buffer.pop().value.map(new Function<Object, Entry>() {

						@Override
						public Entry apply(Object x) {
							if (x instanceof Integer) {
								return Entry.create((int) x, value.isRef);
							} else {
								throw new RuntimeException("Sometinh went wrong!");
							}
						}

					});
					if (locals[index] == null) {
						new One<>(Entry.create(MJIEnv.NULL, false));
					}

					if (Conditional.isTautology(ctx)) {
						locals[index] = newValue;
					} else {
						locals[index] = ChoiceFactory.create(ctx, newValue, locals[index]).simplify();
					}
					return;
				}
			}
			debufferAll();
		}
		super.storeOperand(ctx, index);
	}

	@Override
	public void push(FeatureExpr ctx, Conditional value, boolean isRef) {
		
		if (buffer.isEmpty()) {
			bufferCTX = ctx;
			addToBuffer(((Conditional) value).simplify(ctx), isRef);
			return;
		}
		if (ctx.equivalentTo(bufferCTX)) {
			addToBuffer(((Conditional) value).simplify(ctx), isRef);
			return;
		} else {
			debufferAll();
			bufferCTX = ctx;
			addToBuffer(((Conditional) value).simplify(ctx), isRef);
			return;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> Conditional<T> pop(FeatureExpr ctx, Type t) {
		if (!buffer.isEmpty()) {
			if (bufferCTX.equivalentTo(ctx)) {
				switch (t) {
				case DOUBLE:
					if (buffer.peek().value.getValue(true) instanceof Double) {
						return buffer.pop().value;
					}
					break;
				case FLOAT:
					if (buffer.peek().value.getValue(true) instanceof Float) {
						return buffer.pop().value;
					}
					break;
				case INT:
					if (buffer.peek().value.getValue(true) instanceof Integer) {
						return buffer.pop().value;
					}
					break;
				case LONG:
					if (buffer.peek().value.getValue(true) instanceof Long) {
						return buffer.pop().value;
					}
					break;
				default:
					throw new RuntimeException("Type " + t + " not supported.");
				}
				debufferAll();
			} else {
				debufferAll();
			}
		}
		return super.pop(ctx, t);
	}

	@Override
	public void popN(FeatureExpr ctx, int n) {
		if (n == 0) {
			return;
		}
		if (!buffer.isEmpty()) {
			if (buffer.size() >= n && bufferCTX.equivalentTo(ctx)) {
				while (n > 0) {
					Object value = buffer.peek().value.getValue(true);
					if (value instanceof Integer || value instanceof Float) {
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
							super.popN(ctx, n);
						}

					}
				}
			} else {
				debufferAll();
				super.popN(ctx, n);
			}
		} else {
			super.popN(ctx, n);
		}

	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (bufferCTX.equivalentTo(ctx)) {
				Conditional peek = buffer.peek().value;
				if (peek.getValue(true) instanceof Integer) {
					return peek;
				}
			}
			debufferAll();
		}
		return super.peek(ctx);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, final int offset) {
		if (!buffer.isEmpty()) {
			if (buffer.size() > offset && bufferCTX.equivalentTo(ctx)) {
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
							return value.map(new Function<Float, Integer>() {

								@Override
								public Integer apply(Float x) {
									return Types.floatToInt(x.floatValue());
								}

							});
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
				}
			}
			debufferAll();
		}
		return super.peek(ctx, offset);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		debufferAll();
		return super.peekLong(ctx, offset);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		debufferAll();// TODO improve
		return super.peekDouble(ctx, offset);
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		debufferAll();// TODO improve
		return super.peekFloat(ctx, offset);
	}

	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		debufferAll();// TODO improve
		super.storeLongOperand(ctx, index);
	}

	@Override
	public void clear(FeatureExpr ctx) {
		debufferAll();
		// if (!buffer.isEmpty()) {
		// if (bufferCTX.equivalentTo(ctx)) {
		// buffer.clear();
		// return;
		// } else {
		// debufferAll();
		// }
		// }
		super.clear(ctx);
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		// if (bufferCTX.equivalentTo(ctx)) {
		// for (Tuple value: buffer) {
		// if (value.isRef) {
		// return true;
		// }
		// }
		// } else {
		// TODO imporve
		debufferAll();
		// }
		return super.hasAnyRef(ctx);
	}

	@Override
	public void dup(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (bufferCTX.equivalentTo(ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer) {
					buffer.push(buffer.getFirst());
					return;
				}
				debufferAll();
			} else {
				debufferAll();
			}
		}

		super.dup(ctx);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		debufferAll();
		super.set(ctx, offset, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		debufferAll();
		super.setLocal(ctx, index, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		debufferAll();
		super.setLocal(ctx, index, value, isRef);
	}

	@Override
	public Conditional<Integer> pop(FeatureExpr ctx) {
		debufferAll();
		return super.pop(ctx);
	}

	@Override
	public Conditional<Double> popDouble(FeatureExpr ctx) {
		debufferAll();
		return super.popDouble(ctx);
	}

	@Override
	public Conditional<Float> popFloat(FeatureExpr ctx) {
		debufferAll();
		return super.popFloat(ctx);
	}

	@Override
	public Conditional<Long> popLong(FeatureExpr ctx) {
		debufferAll();
		return super.popLong(ctx);
	}

	@Override
	public <T> void push(FeatureExpr ctx, T value) {
		debufferAll();
		super.push(ctx, value);
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		
		Conditional<Entry> value = locals[index].simplify(ctx);
		if (value == null) {
			value = new One<>(Entry.create(MJIEnv.NULL, false));
		}

		Boolean isRef = null;
		for (Entry v : value.toList()) {
			if (isRef == null) {
				isRef = v.isRef;
			} else if (isRef != v.isRef) {
				debufferAll();
				value.mapf(ctx, new BiFunction<FeatureExpr, Entry, Conditional<Object>>() {

					@Override
					public Conditional<Object> apply(final FeatureExpr ctx, final Entry entry) {
						push(ctx, entry.value, entry.isRef);
						return null;
					}
				});
				return;
			}
		}

		Conditional<Integer> pushValue = value.map(new Function<Entry, Integer>() {

			@Override
			public Integer apply(Entry x) {
				return x.value;
			}

		});

		if (buffer.isEmpty()) {
			bufferCTX = ctx;
			addToBuffer(pushValue, isRef);
			return;
		}
		if (ctx.equivalentTo(bufferCTX)) {
			addToBuffer(pushValue, isRef);
			return;
		} else {
			debufferAll();
			bufferCTX = ctx;
			addToBuffer(pushValue, isRef);
			return;
		}
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		debufferAll();
		super.pushLongLocal(ctx, index);
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		debufferAll();
		return super.isRef(ctx, offset);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		debufferAll();
		return super.isRefLocal(ctx, index);
	}

	@Override
	public Conditional<Integer> getTop() {
		debufferAll();
		return super.getTop();
	}

	// TODO improve all these methods
	@Override
	public void dup2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (bufferCTX.equivalentTo(ctx)) {
				if (buffer.size() < 2) {
					debufferAll();
				} else {
					Tuple last = buffer.peek();
					Tuple preLast = buffer.get(1);
					buffer.push(preLast);
					buffer.push(last);
					return;
				}
			} else {
				debufferAll();
			}
		}
		super.dup2(ctx);
	}

	@Override
	public void swap(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 2 && bufferCTX.equivalentTo(ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer &&
					buffer.get(1).value.getValue(true) instanceof Integer) {
					Tuple pop1 = buffer.pop();
					Tuple pop2 = buffer.pop();
					buffer.push(pop1);
					buffer.push(pop2);
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
			if (buffer.size() >= 3 && bufferCTX.equivalentTo(ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer && buffer.get(1).value.getValue(true) instanceof Integer && buffer.get(2).value.getValue(true) instanceof Integer) {
					Tuple C = buffer.pop();
					Tuple B = buffer.pop();
					Tuple A = buffer.pop();
					buffer.push(B);
					buffer.push(C);
					buffer.push(A);
					buffer.push(B);
					buffer.push(C);
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
			if (buffer.size() >= 4 && bufferCTX.equivalentTo(ctx)) {
				if (buffer.peek().value.getValue(true) instanceof Integer && buffer.get(1).value.getValue(true) instanceof Integer && buffer.get(2).value.getValue(true) instanceof Integer
						&& buffer.get(3).value.getValue(true) instanceof Integer) {
					Tuple D = buffer.pop();
					Tuple C = buffer.pop();
					Tuple B = buffer.pop();
					Tuple A = buffer.pop();
					buffer.push(C);
					buffer.push(D);
					buffer.push(A);
					buffer.push(B);
					buffer.push(C);
					buffer.push(D);
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
			if (bufferCTX.equivalentTo(ctx)) {
				if (buffer.size() >= 2) {
					if (buffer.peek().value.getValue(true) instanceof Integer && buffer.get(1).value.getValue(true) instanceof Integer) {
						Tuple B = buffer.pop();
						Tuple A = buffer.pop();
						buffer.push(B);
						buffer.push(A);
						buffer.push(B);
						return;
					}
				}
				debufferAll();
			} else {
				debufferAll();
			}
		}
		super.dup_x1(ctx);
	}

	// A B C => .. C A B C
	@Override
	public void dup_x2(FeatureExpr ctx) {
		if (!buffer.isEmpty()) {
			if (buffer.size() >= 3 && bufferCTX.equivalentTo(ctx)) {
				for (int top : super.getTop().simplify(ctx).toList()) {
					if (top + buffer.size() + 1 >= maxStackSize) {
						throw new ArrayIndexOutOfBoundsException(maxStackSize);
					}	
				}
				Tuple C = buffer.pop();
				Tuple B = buffer.pop();
				Tuple A = buffer.pop();
				buffer.push(C);
				buffer.push(A);
				buffer.push(B);
				buffer.push(C);
				return;
			} else {
				debufferAll();
			}
		}
		super.dup_x2(ctx);
	}

	@Override
	public Set<Integer> getAllReferences() {
		debufferAll();
		return super.getAllReferences();
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		debufferAll();
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
	public Conditional<Stack> getStack() {
		debufferAll();
		return super.getStack();
	}

}
