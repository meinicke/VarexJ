package gov.nasa.jpf.vm.va;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import javax.annotation.Nonnull;

import cmu.conditional.CachedFeatureExprFactory;
import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.MethodNotImplementedException;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.Types;

/**
 * Stack implementation where locals are separated from stack.<br>
 * Locals: Conditional[]<br>
 * Stack: Conditional -Stack-
 * 
 * @author Jens Meinicke
 *
 */
public class StackHandler implements Cloneable, IStackHandler {

	/** Locals are directly accessed with index **/
	protected Conditional<Entry>[] locals;

	protected Conditional<Stack> stack;

	protected int length = 0;

	protected FeatureExpr stackCTX;
	
	@Override
	public int getStackWidth() {
		return stack.toList().size();
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Locals: [");

		for (int i = 0; i < locals.length; i++) {
			string.append(locals[i]);
			string.append(" ");
		}
		string.append("] \nStack: ");
		string.append(stack);
		return string.toString();
	}
	
	protected static final One<Entry> nullValue = new One<>(new Entry(MJIEnv.NULL, false)); 

	@SuppressWarnings("unchecked")
	public StackHandler(@Nonnull FeatureExpr ctx, int nLocals, int nOperands) {
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
		stackCTX = CachedFeatureExprFactory.True();
	}
	
	@Override
	public FeatureExpr getCtx() {
		return stackCTX;
	}
	
	@Override
	public void setCtx(FeatureExpr ctx) {
		stackCTX = ctx;
		stack = stack.simplify(stackCTX);
		for (int i = 0; i < locals.length; i++) {
			locals[i] = locals[i].simplify(stackCTX);
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public StackHandler clone() {
		StackHandler clone = new StackHandler();
//		clone.setCtx(stackCTX); // TODO ThreadStopTest.testStopRunning() fails
		clone.length = length;
		clone.locals = new Conditional[locals.length];
		for (int i = 0; i < locals.length; i++) {
			Conditional<Entry> local = locals[i];
			clone.locals[i] = local.map(entry -> entry.copy());
		}

		clone.stack = stack.map(stack -> stack.copy());
		return clone;
	}
	
	

	/*
	 * ############################################################
	 * Handling of local variables
	 * ############################################################
	 */

	@Override
	public void pushLocal(final FeatureExpr ctx, final int index) {
		Conditional<Entry> value = locals[index];
		value.mapf(ctx, (FeatureExpr ctx1, Entry entry) -> push(ctx1, entry.value, entry.isRef));
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		Conditional<Entry> value = locals[index];
		value.mapf(ctx, (FeatureExpr ctx1, Entry entry) -> push(ctx1, entry.value, false));
		value = locals[index + 1];
		value.mapf(ctx, (FeatureExpr ctx1, Entry entry) -> push(ctx1, entry.value, false));
	}

	@Override
	public void storeOperand(final FeatureExpr ctx, final int index) {
		if (Conditional.isTautology(ctx)) {
			locals[index] = popEntry(ctx, true);
		} else {
			locals[index] = ChoiceFactory.create(ctx, popEntry(ctx, true), locals[index]).simplify();
		}
	}

	private Conditional<Entry> popEntry(FeatureExpr ctx, final boolean copyRef) {
		Conditional<Entry> result = stack.simplify(Conditional.and(ctx, stackCTX)).mapf(ctx, (FeatureExpr f, Stack s) -> {
			if (Conditional.isContradiction(Conditional.and(ctx, stackCTX))) {
				return null;
			}
			Stack clone = s.copy();
			boolean ref = copyRef ? clone.isRef(0) : false;
			int res = clone.pop();
			if (stackCTX.equivalentTo(f)) {
				stack = new One<>(clone);
			} else {
				stack = ChoiceFactory.create(f, new One<>(clone), stack);
			}
			return new One<>(new Entry(res, ref));
		}).simplify();
		stack = stack.simplify();
		return result;
	}

	@Override
	public void storeLongOperand(final FeatureExpr ctx, final int index) {
		stack.mapf(ctx, (FeatureExpr f, Stack stack) -> {
			if (Conditional.isContradiction(f)) {
				return;
			}
			locals[index + 1] = ChoiceFactory.create(f, popEntry(f, false), locals[index + 1]);
			locals[index] = ChoiceFactory.create(f, popEntry(f, false), locals[index]);
		});
		locals[index] = locals[index].simplify();
		locals[index + 1] = locals[index + 1].simplify();
		stack = stack.simplify();
	}

	@Override
	public void setLocal(FeatureExpr ctx, final int index, final Conditional<Integer> value, final boolean isRef) {
		value.mapf(ctx, (FeatureExpr x, Integer value1) -> setLocal(x, index, value1, isRef));
	}

	@Override
	public void setLocal(final FeatureExpr ctx, final int index, final int value, final boolean isRef) {
		if (Conditional.isTautology(ctx)) {
			locals[index] = new One<>(new Entry(value, isRef));
		} else {
			locals[index] = ChoiceFactory.create(ctx, new One<>(new Entry(value, isRef)), locals[index]).simplify();
		}
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, final int index) {
		if (index < 0) {
			return new One<>(-1);
		}
		if (index < locals.length) {
			return locals[index].simplify(ctx).map(x -> {
				return x.value;
			}).simplifyValues();
		} else {
			final int i = index - locals.length;
			return stack.map(stack -> stack.slots[i] == null ? 0 : stack.slots[i].value);
		}
	}

	@Override
	public Object getLocal(int index) {
		return locals[index].simplify(getCtx());
	}
	
	// TODO change to conditional
	@Override
	public boolean isRefLocal(FeatureExpr ctx, final int index) {
		assert index < locals.length : "index larger than locals";
		return locals[index].simplify(ctx).map(y -> y.isRef).toMap().containsKey(Boolean.TRUE);
	}
	
	/*
	 * #######################################################
	 * Handling of the stack
	 * ########################################################
	 */
	@Override
	public void pushFloat(FeatureExpr ctx, Conditional<Float> value) {
		value.mapf(ctx, (FeatureExpr ctx1, Float value1) -> push(ctx1, (Number) value1, false));
	}

	@Override
	public void pushLong(FeatureExpr ctx, Conditional<Long> value) {
		value.mapf(ctx, (FeatureExpr ctx1, Long value1) -> push(ctx1, (Number) value1, false));
	}

	@Override
	public void pushDouble(FeatureExpr ctx, Conditional<Double> value) {
		value.mapf(ctx, (FeatureExpr ctx1, Double value1) -> push(ctx1, (Number) value1, false));
	}
	@Override
	public void push(final FeatureExpr ctx, final Conditional<Integer> value) {
		push(ctx, value, false);
	}

	@Override
	public void push(final FeatureExpr ctx, final Conditional<Integer> value, final boolean isRef) {
		value.mapf(ctx, (FeatureExpr ctx1, Integer value1) -> push(ctx1, (Number) value1, isRef));
	}
	
	public void push(final FeatureExpr ctx, final Number value, final boolean isRef) {
		stack = stack.mapf(ctx, (FeatureExpr f, Stack stack) -> {
			if (Conditional.isContradiction(f)) {
				return new One<>(stack);
			}
			final Stack clone = stack.copy();
			if (value instanceof Integer) {
				clone.push((Integer) value, isRef);
			} else if (value instanceof Long) {
				long v1 = ((Long) value).longValue();
				clone.push((int) (v1 >> 32), isRef);
				clone.push((int) v1, isRef);
			} else if (value instanceof Double) {
				long v2 = Double.doubleToLongBits((Double) value);
				clone.push((int) (v2 >> 32), isRef);
				clone.push((int) v2, isRef);
			} else {
				clone.push(Float.floatToIntBits((Float) value), isRef);
			}
			if (stackCTX.equivalentTo(f)) {
				return new One<>(clone);
			}
			return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
		}).simplify();
	}

	@Override
	public Conditional<Integer> pop(final FeatureExpr ctx) {
		return pop(ctx, Type.INT);
	}

	@Override
	public Conditional<Long> popLong(final FeatureExpr ctx) {
		return pop(ctx, Type.LONG);
	}

	@Override
	public Conditional<Double> popDouble(final FeatureExpr ctx) {
		return pop(ctx, Type.DOUBLE);
	}

	@Override
	public Conditional<Float> popFloat(final FeatureExpr ctx) {
		return pop(ctx, Type.FLOAT);
	}

	@Override
	public <T> Conditional<T> pop(final FeatureExpr ctx, final Type t) {
		@SuppressWarnings("unchecked")
		Conditional<T> result = stack.simplify(Conditional.and(stackCTX, ctx)).mapf(ctx, (FeatureExpr f, Stack s) -> {
			if (Conditional.isContradiction(ctx)) {
				return null;
			}
			Stack clone = s.copy();
			Number res;
			final int lo = clone.pop();

			switch (t) {
			case INT:
				res = Integer.valueOf(lo);
				break;
			case DOUBLE:
				res = Types.intsToDouble(lo, clone.pop());
				break;
			case FLOAT:
				res = Types.intToFloat(lo);
				break;
			case LONG:
				res = Types.intsToLong(lo, clone.pop());
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

		}).simplifyValues();
		stack = stack.simplify();
		return result;
	}

	@Override
	public void pop(FeatureExpr ctx, final int n) {
		stack = stack.mapf(ctx,  (FeatureExpr f, Stack s) -> {
			if (Conditional.isContradiction(f)) {
				return new One<>(s);
			}

			Stack clone = s.copy();
			for (int i = n; i > 0; i--) {
				clone.pop();
			}

			if (Conditional.isTautology(f)) {
				return new One<>(clone);
			}
			return ChoiceFactory.create(f, new One<>(clone), new One<>(s));
		}).simplify(stackCTX);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		return peek(ctx, 0);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.INT);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.DOUBLE);
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.LONG);
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.FLOAT);
	}

	protected <T> Conditional<T> peek(FeatureExpr ctx, final int offset, final Type t) {
		assert !Conditional.isContradiction(Conditional.and(stackCTX, ctx));
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
				default:
					return (T) (Long) Types.intsToLong(stack.peek(offset), stack.peek(offset + 1));
				}
			}

		}).simplify(stackCTX);
	}

	@Override
	public boolean isRef(final FeatureExpr ctx, final int offset) {// change to Conditional<Boolean> - should always be the same
		return stack.simplify(ctx).map(y -> y.isRef(offset)).simplifyValues().getValue();
	}

	@Override
	public void set(final FeatureExpr ctx, final int offset, final int value, final boolean isRef) {
		stack = stack.mapf(ctx, (FeatureExpr f, Stack stack) -> {
			if (Conditional.isContradiction(f)) {
				return new One<>(stack);
			}
			Stack clone = stack.copy();
			clone.set(offset, value, isRef);
			if (Conditional.isTautology(f)) {
				return new One<>(clone);
			}
			return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
		}).simplify();

	}

	@Override
	public Conditional<Integer> getTop() {
		return stack.map(y -> y.top).simplify(stackCTX);
	}
	
	@Override
	public void clear(final FeatureExpr ctx) {
		stack = stack.mapf(ctx, (FeatureExpr f, Stack stack) -> {
			if (Conditional.isContradiction(f)) {
				return new One<>(stack);
			}
			Stack clone = stack.copy();
			clone.clear();
			
			if (Conditional.isTautology(f)) {
				return new One<>(clone);
			}
			return ChoiceFactory.create(ctx, new One<>(clone), new One<>(stack));
		}).simplify();
	}

	@Override
	public int[] getSlots() {
		return getSlots(CachedFeatureExprFactory.True());
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		int[] slots = new int[length];
		if (Conditional.isContradiction(Conditional.and(ctx, stackCTX))) {
			return slots;
		}
		int i = 0;
		for (Conditional<Entry> l : locals) {
			slots[i++] = l.simplify(Conditional.and(stackCTX, ctx)).getValue(true).value;
		}
		for (int o : stack.simplify(Conditional.and(stackCTX, ctx)).getValue(true).getSlots()) {
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
		if (locals.length != other.locals.length) {
			return false;
		}
		for (int i = 0; i < locals.length; i++) {
			Conditional<Entry> l1 = locals[i];
			Conditional<Entry> l2 = other.locals[i];
			if (l1 == l2) {
				continue;
			}
			if (!l1.equals(l2)) {
				return false;
			}
		}
		return  other.stack.equals(stack);
	}
	
	@Override
	public int hashCode() {
		throw new MethodNotImplementedException();
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		if (Conditional.isContradiction(Conditional.and(stackCTX, ctx))) {
			return false;
		}
		for (Conditional<Entry> local : locals) {
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

	@Override
	public void dup_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X1);
	}

	@Override
	public void dup2_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X2);
	}

	@Override
	public void dup2_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X1);
	}

	@Override
	public void dup2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2);
	}

	@Override
	public void dup(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP);
	}

	@Override
	public void dup_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X2);
	}

	@Override
	public void swap(final FeatureExpr ctx) {
		function(ctx, StackInstruction.SWAP);
	}

	void function(final FeatureExpr ctx, final StackInstruction instruction) {
		assert !Conditional.isContradiction(Conditional.and(ctx, stackCTX));
		stack = stack.mapf(ctx, (FeatureExpr f, Stack stack) -> {
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
		}).simplify();
	}

	@Override
	public int getLength() {
		return length;
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

	@Override
	public int getLocalWidth() {
		int width = -locals.length;
		for (Conditional<Entry> local : locals) {
			width += local.simplify(getCtx()).toMap().size();
		}
		return width;
	}
	
	@Override
	public String getMaxLocal() {
		StringBuilder builder = new StringBuilder();
		for (Conditional<Entry> local : locals) {		
			int size = local.simplify(getCtx()).toMap().size();
			builder.append(local.simplify(getCtx()));
			builder.append(":");
			builder.append(size);
			builder.append('\n');
		}
		return builder.toString();
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, final int increment) {
		locals[index] = locals[index].mapf(ctx, (FeatureExpr ctx1, Entry y) -> {
			if (Conditional.isContradiction(ctx1)) {
				return new One<>(y);
			}
			Entry copy = new Entry(y.value + increment, y.isRef);
			if (Conditional.isTautology(ctx1)) {
				return new One<>(copy);
			}
			return ChoiceFactory.create(ctx1, new One<>(copy), new One<>(y));
		}).simplify();
	}

}
