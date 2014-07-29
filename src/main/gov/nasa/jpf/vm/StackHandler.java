package gov.nasa.jpf.vm;

import gov.nasa.jpf.jvm.bytecode.extended.BiFunction;
import gov.nasa.jpf.jvm.bytecode.extended.Choice;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.Function;
import gov.nasa.jpf.jvm.bytecode.extended.One;

import java.util.Arrays;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

// TODO replace by interface
public class StackHandler implements Cloneable {

	enum Type {
		INT, FLOAT, LONG, DOUBLE
	}

	enum StackInstruction {
		DUP_X1, DUP2_X2, DUP2_X1, DUP2, DUP, DUP_X2, SWAP
	}

	/** Locals are directly accessed with index **/
	private Conditional<Entry>[] locals;

	public Conditional<Stack> stack;

	public int length = 0;

	public FeatureExpr stackCTX;
	
	public int getStackWidth() {
		return stack.toList().size();
	}

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
		return string.toString();
	}
	
	private static final One<Entry> nullValue = new One<>(new Entry(MJIEnv.NULL, false)); 

	@SuppressWarnings("unchecked")
	public StackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		if (ctx == null) {
			throw new RuntimeException("CTX == NULL");
		}
		length = nLocals + nOperands;
		locals = new Conditional[nLocals];
		Arrays.fill(locals, nullValue);
		stack = new One<>(new Stack(nOperands));
		stackCTX = ctx;
	}

	@SuppressWarnings("unchecked")
	public StackHandler() {
		stack = new One<>(new Stack(0));
		locals = new Conditional[0];
		stackCTX = FeatureExprFactory.True();
	}

	@SuppressWarnings("unchecked")
	public StackHandler clone() {
		StackHandler clone = new StackHandler();
		clone.length = length;
		clone.locals = new Conditional[locals.length];
		for (int i = 0; i < locals.length; i++) {
			Conditional<Entry> local = locals[i];
			if (local != null) {
				clone.locals[i] = local.map(new CopyEntry());
			}
		}

		clone.stack = stack.map(new CopyStack());
		return clone;
	}
	
	private static final class CopyEntry implements Function<Entry, Entry> {
		@Override
		public Entry apply(final Entry entry) {
			return entry.copy();
		}
	}
	
	private static final class CopyStack implements Function<Stack, Stack> {
		@Override
		public Stack apply(final Stack stack) {
			return stack.copy();
		}
	}

	/*
	 * ############################################################
	 * Handling of local variables
	 * ############################################################
	 */

	/**
	 * Pushes the local variable at the index position to the stack.
	 * 
	 * @param index
	 *            The index of the local variable
	 */
	public void pushLocal(final FeatureExpr ctx, final int index) {
		Conditional<Entry> value = locals[index];
		if (value == null) {
			value = new One<>(new Entry(MJIEnv.NULL, false));
		}
		value.mapf(ctx, new BiFunction<FeatureExpr, Entry, Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(final FeatureExpr ctx, final Entry entry) {
				push(ctx, entry.value, entry.isRef);
				return null;
			}
		});
	}

	public void pushLongLocal(FeatureExpr ctx, int index) {
		Conditional<Entry> value = locals[index];
		if (value == null) {
			value = new One<>(new Entry(0, false));
		}
		value.mapf(ctx, new BiFunction<FeatureExpr, Entry, Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(final FeatureExpr ctx, final Entry entry) {
				push(ctx, entry.value, false);
				return null;
			}
		});
		value = locals[index + 1];
		if (value == null) {
			value = new One<>(new Entry(0, false));
		}
		value.mapf(ctx, new BiFunction<FeatureExpr, Entry, Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(final FeatureExpr ctx, final Entry entry) {
				push(ctx, entry.value, false);
				return null;
			}
		});
	}

	/**
	 * Pops the top value and saves it at the index position.
	 * 
	 * @param ctx
	 * @param index
	 *            The index of the local variable
	 */
	public void storeOperand(final FeatureExpr ctx, final int index) {
		if (Conditional.isTautology(ctx)) {
			locals[index] = popEntry(ctx);
		} else {
			if (locals[index] == null) {
				locals[index] = new One<>(new Entry(MJIEnv.NULL, false));
			}
			locals[index] = new Choice<>(ctx, popEntry(ctx), locals[index]).simplify();
		}
	}

	private Conditional<Entry> popEntry(FeatureExpr ctx) {
		Conditional<Entry> result = stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Entry>>() {

			@Override
			public Conditional<Entry> apply(final FeatureExpr f, final Stack s) {
				Stack clone = s.copy();
				boolean ref = clone.isRef(0);
				int res = clone.pop();
				if (stackCTX.equivalentTo(f)) {
					stack = new One<>(clone);
				} else {
					stack = new Choice<>(f, new One<>(clone), stack);
				}
				return new One<>(new Entry(res, ref));
			}
			
		}).simplify();
		stack = stack.simplify();
		return result;
	}

	public void storeLongOperand(final FeatureExpr ctx, final int index) {
		stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Entry>>() {

			@Override
			public Conditional<Entry> apply(final FeatureExpr f, final Stack stack) {
				if (Conditional.isContradiction(f)) {
					return null;
				}
				locals[index + 1] = new Choice<>(f, new One<>(new Entry(stack.pop(), false)), locals[index + 1]);
				locals[index] = new Choice<>(f, new One<>(new Entry(stack.pop(), false)), locals[index]);
				return null;
			}
		});
		locals[index] = locals[index].simplify();
		locals[index + 1] = locals[index + 1].simplify();
		stack = stack.simplify();
	}

	// TODO remove
	public void setLocal(final int index, final int value, final boolean isRef) {
		locals[index] = new One<>(new Entry(value, isRef));
	}

	public void setLocal(FeatureExpr ctx, final int index, final Conditional<Integer> value, final boolean isRef) {
		value.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(final FeatureExpr x, final Integer value) {
				setLocal(x, index, value, isRef);
				return null;
			}

		});
	}

	public void setLocal(final FeatureExpr ctx, final int index, final int value, final boolean isRef) {
		if (Conditional.isTautology(ctx)) {
			locals[index] = new One<>(new Entry(value, isRef));
		} else {
			if (locals[index] == null) {
				locals[index] = new One<>(new Entry(0, false));
			}
			locals[index] = new Choice<>(ctx, new One<>(new Entry(value, isRef)), locals[index]).simplify();
		}
	}

	public Conditional<Integer> getLocal(FeatureExpr ctx, final int index) {
		if (index < 0) {
			return new One<>(-1);
		}
		if (index < locals.length) {
			if (locals[index] == null) {
				return new One<>(MJIEnv.NULL);
			}
			return locals[index].simplify(ctx).map(new GetLocal()).simplifyValues();
		} else {
			final int i = index - locals.length;
			return stack.map(new Function<Stack, Integer>() {

				@Override
				public Integer apply(final Stack stack) {
					return stack.get(i);
				}

			});
		}
	}
	
	private static final class GetLocal implements Function<Entry, Integer> {
		@Override
		public Integer apply(final Entry x) {
			if (x == null) {
				return MJIEnv.NULL;
			}
			return x.value;
		}
	}

	// TODO remove
	public boolean isRefLocal(final int index) {
		if (index < 0) {
			return false;
		}

		if (index < locals.length) {
			if (locals[index] == null) {
				return false;
			}
			return locals[index].mapf(FeatureExprFactory.True(), new IsRefLocal()).simplifyValues().getValue();
		} else {
			final int i = index - locals.length;
			return stack.map(new Function<Stack, Boolean>() {

				@Override
				public Boolean apply(final Stack stack) {
					return stack.isRefIndex(i);
				}

			}).simplify().getValue();
		}
	}
	
	private static final class IsRefLocal implements BiFunction<FeatureExpr, Entry, Conditional<Boolean>> {
		@Override
		public Conditional<Boolean> apply(final FeatureExpr x, final Entry y) {
			return new One<>(y.isRef);
		}
	}

	// TODO check calls, might iterate over stack, too.
	// TODO change to conditional
	public boolean isRefLocal(FeatureExpr ctx, final int index) {
		if (index < 0) {
			return false;
		}

		if (index < locals.length) {
			if (locals[index] == null) {
				return false;
			}
			return locals[index].simplify(ctx).map(new IsRefLocal2()).simplifyValues().getValue(true);// TODO bad simplify
		} else {
			final int i = index - locals.length;
			return stack.simplify(ctx).map(new Function<Stack, Boolean>() {

				@Override
				public Boolean apply(final Stack stack) {
					return stack.isRefIndex(i);
				}

			}).simplifyValues().getValue();
		}
	}
	
	private static final class IsRefLocal2 implements Function<Entry, Boolean> {
		@Override
		public Boolean apply(final Entry y) {
			return y.isRef;
		}
	}

	/*
	 * #######################################################
	 * Handling of the stack
	 * ########################################################
	 */

	public <T> void push(final FeatureExpr ctx, final T value) {
		push(ctx, value, false);
	}

	/**
	 * 
	 * @param ctx
	 * @param value Can be a {@link Conditional}, or an int, double, or long.
	 * @param isRef Sets the new value to be a reference or not.
	 */
	@SuppressWarnings("unchecked")
	public void push(final FeatureExpr ctx, final Object value, final boolean isRef) {
		if (value instanceof Conditional) {
			((Conditional<Object>) value).mapf(ctx, new BiFunction<FeatureExpr, Object, Conditional<Object>>() {

				@Override
				public Conditional<Object> apply(final FeatureExpr ctx, final Object value) {
					push(ctx, value, isRef);
					return null;
				}

			});
			return;
		}

		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(final FeatureExpr f, final Stack stack) {
				if (Conditional.isContradiction(f)) {
					return new One<>(stack);
				}

				Stack clone = stack.copy();
				if (value instanceof Integer) {
					clone.push((Integer) value, isRef);
				} else if (value instanceof Long) {
					long v = ((Long) value).longValue();
					clone.push((int) (v >> 32), isRef);
					clone.push((int) v, isRef);
				} else if (value instanceof Double) {
					long l = Double.doubleToLongBits((Double) value);
					clone.push((int) (l >> 32), isRef);
					clone.push((int) l, isRef);
				} else if (value instanceof Float) {
					float v = (Float) value;
					clone.push(Float.floatToIntBits(v), isRef);
				} else if (value instanceof Byte) {
					clone.push(((Byte)value).intValue(), isRef);
				} else {
					throw new RuntimeException(value + " cannot be pushed to the stack.");
				}
				
				if (stackCTX.equivalentTo(f)) {
					return new One<>(clone);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	public Conditional<Integer> pop(final FeatureExpr ctx) {
		return pop(ctx, Type.INT);
	}

	public Conditional<Long> popLong(final FeatureExpr ctx) {
		return pop(ctx, Type.LONG);
	}

	public Conditional<Double> popDouble(final FeatureExpr ctx) {
		return pop(ctx, Type.DOUBLE);
	}

	public Conditional<Float> popFloat(final FeatureExpr ctx) {
		return pop(ctx, Type.FLOAT);
	}

	public <T> Conditional<T> pop(final FeatureExpr ctx, final Type t) {
		Conditional<T> result = stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<T>>() {

			@SuppressWarnings("unchecked")
			@Override
			public Conditional<T> apply(final FeatureExpr f, final Stack s) {
				Stack clone = s.copy();
				Number res = null;
				switch (t) {
				case INT:
					res = clone.pop();
					break;
				case DOUBLE:
					int lo = clone.pop();
					int hi = clone.pop();
					res = Types.intsToDouble(lo, hi);
					break;
				case FLOAT:
					int i = clone.pop();
					res = Types.intToFloat(i);
					break;
				case LONG:
					int lo2 = clone.pop();
					int hi2 = clone.pop();
					res = Types.intsToLong(lo2, hi2);
					break;
				default:
					return null;
				}
				if (stackCTX.equivalentTo(f)) {
					stack = new One<>(clone);
				} else {
					stack = new Choice<>(f, new One<>(clone), stack);
				}
				return (Conditional<T>) new One<>(res);

			}
		}).simplifyValues();
		stack = stack.simplify();// TODO can be avoided
		return result;
	}

	public void pop(final FeatureExpr ctx, final int n) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(final FeatureExpr f, final Stack s) {
				if (Conditional.isContradiction(f)) {
					return new One<>(s);
				}

				Stack clone = s.copy();
				int i = n;
				while (i > 0) {
					clone.pop();
					i--;
				}

				if (Conditional.isTautology(f)) {
					return new One<>(clone);
				}
				if (ctx.equals(f)) {
					return new One<>(clone); 
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(s));
			}
		}).simplifyValues();
	}

	public Conditional<Integer> peek(FeatureExpr ctx) {
		return peek(ctx, 0);
	}

	public Conditional<Integer> peek(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.INT);
	}

	public Conditional<Double> peekDouble(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.DOUBLE);
	}

	public Conditional<Long> peekLong(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.LONG);
	}

	public Conditional<Float> peekFloat(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.FLOAT);
	}

	private <T> Conditional<T> peek(FeatureExpr ctx, final int offset, final Type t) {
		return stack.simplify(ctx).map(new Function<Stack, T>() {

			@SuppressWarnings("unchecked")
			@Override
			public T apply(final Stack stack) {
				switch (t) {
				case DOUBLE:
					return (T) (Double) Types.intsToDouble(stack.peek(offset), stack.peek(offset + 1));
				case FLOAT:
					return (T) (Float) Types.intToFloat(stack.peek(offset));
				case INT:
					return (T) stack.peek(offset);
				case LONG:
					return (T) (Long) Types.intsToLong(stack.peek(offset), stack.peek(offset + 1));
				default:
					return null;
				}
			}

		}).simplifyValues();
	}

	public boolean isRef(final FeatureExpr ctx, final int offset) {// change to Conditional<Boolean>
		return stack.simplify(ctx).map(new Function<Stack, Boolean>() {

			@Override
			public Boolean apply(final Stack y) {
				return y.isRef(offset);
			}

		}).simplifyValues().getValue();
	}

	// TODO remove
	public void set(final int offset, final int value, final boolean isRef) {
		stack.map(new Function<Stack, Object>() {

			@Override
			public Object apply(final Stack y) {
				y.set(offset, value, isRef);
				return null;
			}
		});
	}

	public Conditional<Integer> getTop() {
		return stack.map(new GetTop());
	}
	
	private static final class GetTop implements Function<Stack, Integer> {
		@Override
		public Integer apply(final Stack y) {
			return y.top;
		}
	}

	public void setTop(final FeatureExpr ctx, final int i) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(final FeatureExpr f, final Stack stack) {
				if (Conditional.isContradiction(f)) {
					return new One<>(stack);
				}
				Stack clone = stack.copy();
				clone.top = i;
				
				if (ctx.equals(f)) {
					return new One<>(clone); 
				}
				if (Conditional.isTautology(f)) {
					return new One<>(clone);
				}
				
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	public void clear(final FeatureExpr ctx) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(final FeatureExpr f, final Stack stack) {
				if (Conditional.isContradiction(f)) {
					return new One<>(stack);
				}
				Stack clone = stack.copy();
				clone.clear();
				
				if (Conditional.isTautology(f)) {
					return new One<>(clone);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	public int[] getSlots() {
		return getSlots(FeatureExprFactory.True());
	}

	public int[] getSlots(FeatureExpr ctx) {
		int[] slots = new int[length];
		int i = 0;
		for (Conditional<Entry> l : locals) {
			if (l == null) {
				slots[i++] = MJIEnv.NULL;
				continue;
			}
			slots[i++] = l.simplify(ctx).getValue(true).value;
		}
		for (int o : stack.simplify(ctx).getValue(true).getSlots()) {
			slots[i++] = o;
		}

		return slots;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof StackHandler)) {
			return false;
		}
		StackHandler other = (StackHandler) o;
		for (int i = 0; i < locals.length; i++) {
			Conditional<Entry> l1 = locals[i];
			Conditional<Entry> l2 = other.locals[i];
			if (l1 == l2) {
				continue;
			}
			if (l1 == null) {
				return false;
			}
			if (!l1.equals(l2)) {
				return false;
			}
		}
		if (!other.stack.equals(stack)) {
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		throw new RuntimeException("hashCode not designed");
	}

	public boolean hasAnyRef(FeatureExpr ctx) {
		for (Conditional<Entry> local : locals) {
			if (local == null) {
				continue;
			}
			for (Entry entry : local.simplify(ctx).toList()) {
				if (entry.isRef) {
					return true;
				}
			}
		}

		for (Stack s : stack.simplify(ctx).toList()) {
			if (s.hasAnyRef()) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Stack Instructions
	 */

	/**
	 * .. A B => .. B A B
	 */
	public void dup_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X1);
	}

	/**
	 * .. A B C D => .. C D A B C D
	 */
	public void dup2_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X2);
	}

	/**
	 * .. A B C => .. B C A B C
	 */
	public void dup2_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X1);
	}

	/**
	 * .. A B => .. A B A B
	 */
	public void dup2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2);
	}

	/**
	 * .. A => .. A A
	 */
	public void dup(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP);
	}

	/**
	 * .. A B C => .. C A B C
	 */
	public void dup_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X2);
	}

	/**
	 * .. A B => .. B A
	 */
	public void swap(final FeatureExpr ctx) {
		function(ctx, StackInstruction.SWAP);
	}

	void function(final FeatureExpr ctx, final StackInstruction instruction) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(final FeatureExpr f, final Stack stack) {
				if (Conditional.isContradiction(f)) {
					return new One<>(stack);
				}
				Stack clone = stack.copy();
				switch (instruction) {
				case DUP_X1:
					clone.dup_x1();
					break;
				case DUP2_X2:
					clone.dup2_x2();
					break;
				case DUP:
					clone.dup();
					break;
				case DUP2:
					clone.dup2();
					break;
				case DUP2_X1:
					clone.dup2_x1();
					break;
				case DUP_X2:
					clone.dup_x2();
					break;
				case SWAP:
					clone.swap();
					break;
				default:
					throw new RuntimeException(instruction + "not supported");
				}

				if (Conditional.isTautology(f)) {
					return new One<>(clone);
				}
				
				if (stackCTX.equivalentTo(f)) {
					return new One<>(clone);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

}
