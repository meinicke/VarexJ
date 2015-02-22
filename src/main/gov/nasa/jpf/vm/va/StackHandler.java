package gov.nasa.jpf.vm.va;

import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.Types;

import java.util.Arrays;
import java.util.HashSet;
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
public class StackHandler implements Cloneable, IStackHandler {

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
	
	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#getStackWidth()
	 */
	@Override
	public int getStackWidth() {
		return stack.toList().size();
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#toString()
	 */
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
	
	@Override
	public FeatureExpr getCtx() {
		return stackCTX;
	}
	
	@Override
	public void setCtx(FeatureExpr ctx) {
		stackCTX = ctx;
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#clone()
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#pushLocal(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#pushLongLocal(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#storeOperand(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
	public void storeOperand(final FeatureExpr ctx, final int index) {
		if (Conditional.isTautology(ctx)) {
			locals[index] = popEntry(ctx, true);
		} else {
			if (locals[index] == null) {
				locals[index] = new One<>(new Entry(MJIEnv.NULL, false));
			}
			locals[index] = ChoiceFactory.create(ctx, popEntry(ctx, true), locals[index]).simplify();
		}
	}

	private Conditional<Entry> popEntry(FeatureExpr ctx, final boolean copyRef) {
		Conditional<Entry> result = stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Entry>>() {

			@Override
			public Conditional<Entry> apply(final FeatureExpr f, final Stack s) {
				Stack clone = s.copy();
				boolean ref = copyRef ? clone.isRef(0) : false;
				int res = clone.pop();
				if (stackCTX.equivalentTo(f)) {
					stack = new One<>(clone);
				} else {
					stack = ChoiceFactory.create(f, new One<>(clone), stack);
				}
				return new One<>(new Entry(res, ref));
			}
			
		}).simplify();
		stack = stack.simplify();
		return result;
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#storeLongOperand(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
	public void storeLongOperand(final FeatureExpr ctx, final int index) {
		stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Entry>>() {

			@Override
			public Conditional<Entry> apply(final FeatureExpr f, final Stack stack) {
				if (Conditional.isContradiction(f)) {
					return null;
				}
				locals[index + 1] = ChoiceFactory.create(f, popEntry(f, false), locals[index + 1]);
				locals[index] = ChoiceFactory.create(f, popEntry(f, false), locals[index]);
				return null;
			}
		});
		locals[index] = locals[index].simplify();
		locals[index + 1] = locals[index + 1].simplify();
		stack = stack.simplify();
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#setLocal(de.fosd.typechef.featureexpr.FeatureExpr, int, cmu.conditional.Conditional, boolean)
	 */
	@Override
	public void setLocal(FeatureExpr ctx, final int index, final Conditional<Integer> value, final boolean isRef) {
		value.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(final FeatureExpr x, final Integer value) {
				setLocal(x, index, value, isRef);
				return null;
			}

		});
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#setLocal(de.fosd.typechef.featureexpr.FeatureExpr, int, int, boolean)
	 */
	@Override
	public void setLocal(final FeatureExpr ctx, final int index, final int value, final boolean isRef) {
		if (Conditional.isTautology(ctx)) {
			locals[index] = new One<>(new Entry(value, isRef));
		} else {
			if (locals[index] == null) {
				locals[index] = new One<>(new Entry(0, false));
			}
			locals[index] = ChoiceFactory.create(ctx, new One<>(new Entry(value, isRef)), locals[index]).simplify();
		}
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#getLocal(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
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

	// TODO change to conditional
	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#isRefLocal(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
	public boolean isRefLocal(FeatureExpr ctx, final int index) {
		if (index < 0) {
			return false;
		}

		if (index < locals.length) {
			if (locals[index] == null) {
				return false;
			}
			// TODO check calls of isRefLocal
			for (boolean b : locals[index].simplify(ctx).map(new IsRefLocal()).toList()) {
				if (b) {
					return true;
				}
			}
			return false;
//			return locals[index].simplify(ctx).map(new IsRefLocal()).simplifyValues().getValue();
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
	
	private static final class IsRefLocal implements Function<Entry, Boolean> {
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#push(de.fosd.typechef.featureexpr.FeatureExpr, T)
	 */
	@Override
	public <T> void push(final FeatureExpr ctx, final T value) {
		push(ctx, value, false);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#push(de.fosd.typechef.featureexpr.FeatureExpr, java.lang.Object, boolean)
	 */
	@Override
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
				} else if (value instanceof Short) {
					clone.push((int)(Short)value, isRef);
				} else if (value == null) {
					clone.push(MJIEnv.NULL, isRef);
				} else {
					throw new RuntimeException(value + " of type " + value.getClass() + " cannot be pushed to the stack.");
				}
				
				if (stackCTX.equivalentTo(f)) {
					return new One<>(clone);
				}
				return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#pop(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public Conditional<Integer> pop(final FeatureExpr ctx) {
		return pop(ctx, Type.INT);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#popLong(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public Conditional<Long> popLong(final FeatureExpr ctx) {
		return pop(ctx, Type.LONG);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#popDouble(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public Conditional<Double> popDouble(final FeatureExpr ctx) {
		return pop(ctx, Type.DOUBLE);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#popFloat(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public Conditional<Float> popFloat(final FeatureExpr ctx) {
		return pop(ctx, Type.FLOAT);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#pop(de.fosd.typechef.featureexpr.FeatureExpr, gov.nasa.jpf.vm.StackHandler.Type)
	 */
	@Override
	public <T> Conditional<T> pop(final FeatureExpr ctx, final Type t) {
//		if (ThreadInfo.debug) {
//			System.out.println(stack);
//		}
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
					stack = ChoiceFactory.create(f, new One<>(clone), stack);
				}
				return (Conditional<T>) new One<>(res);

			}
		}).simplifyValues();
		stack = stack.simplify();
		return result;
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#pop(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
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
				return ChoiceFactory.create(ctx, new One<>(clone), new One<>(s));
			}
		}).simplify();
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#peek(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		return peek(ctx, 0);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#peek(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.INT);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#peekDouble(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.DOUBLE);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#peekLong(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.LONG);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#peekFloat(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#isRef(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
	public boolean isRef(final FeatureExpr ctx, final int offset) {// change to Conditional<Boolean>
		return stack.simplify(ctx).map(new Function<Stack, Boolean>() {

			@Override
			public Boolean apply(final Stack y) {
				return y.isRef(offset);
			}

		}).simplifyValues().getValue();
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#set(de.fosd.typechef.featureexpr.FeatureExpr, int, int, boolean)
	 */
	@Override
	public void set(final FeatureExpr ctx, final int offset, final int value, final boolean isRef) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr f, Stack stack) {
				if (f.isContradiction()) {
					return new One<>(stack);
				}
				Stack clone = stack.copy();
				clone.set(offset, value, isRef);
				if (f.isTautology()) {
					return new One<>(clone);
				}
				return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
			}
			
		}).simplify();

	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#getTop()
	 */
	@Override
	public Conditional<Integer> getTop() {
		return stack.map(new GetTop());
	}
	
	private static final class GetTop implements Function<Stack, Integer> {
		@Override
		public Integer apply(final Stack y) {
			return y.top;
		}
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#setTop(de.fosd.typechef.featureexpr.FeatureExpr, int)
	 */
	@Override
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
				
				return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#clear(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
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
				return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#getSlots()
	 */
	@Override
	public int[] getSlots() {
		return getSlots(FeatureExprFactory.True());
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#getSlots(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#equals(java.lang.Object)
	 */
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
	
	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#hashCode()
	 */
	@Override
	public int hashCode() {
		throw new RuntimeException("hashCode not designed");
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#hasAnyRef(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#dup_x1(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public void dup_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X1);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#dup2_x2(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public void dup2_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X2);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#dup2_x1(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public void dup2_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X1);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#dup2(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public void dup2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#dup(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public void dup(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#dup_x2(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
	public void dup_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X2);
	}

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#swap(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
	@Override
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
				return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public Conditional<Stack> getStack() {
		return stack;
	}

	@Override
	public Set<Integer> getAllReferences() {
		Set<Integer> references = new HashSet<>();
		for (Conditional<Entry> cl : locals) {
			for (Entry l: cl.toList()) {
				if (l.isRef) {
					references.add(l.value);
				}
			}
		}
		
		for (Stack s: stack.toList()) {
			references.addAll(s.getReferences());
		}
		
		return references;
	}

}
