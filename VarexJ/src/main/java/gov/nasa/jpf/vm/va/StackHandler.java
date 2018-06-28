package gov.nasa.jpf.vm.va;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
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

	public FeatureExpr stackCTX;
	
	@Override
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
	
	protected static final One<Entry> nullValue = new One<>(new Entry(MJIEnv.NULL, false)); 

	@SuppressWarnings("unchecked")
	public StackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		if (ctx == null) {
			// if loading class inside jetty, the ctx is null
			System.err.println("CAUTIOUS! CTX == NULL, creating True");
			ctx = FeatureExprFactory.True();
//			throw new RuntimeException("CTX == NULL");
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
	public StackHandler(FeatureExpr ctx, Stack stack, Entry[] locals) {
		stackCTX = ctx;
		this.stack = new One<>(stack);
		this.locals = new Conditional[locals.length];
		for (int i = 0; i < locals.length; i++) {
			this.locals[i] = new One<>(locals[i]);
		}
		length = stack.slots.length + locals.length;
	}
	
	@Override
	public FeatureExpr getCtx() {
		return stackCTX;
	}
	
	@Override
	public void setCtx(FeatureExpr ctx) {
		stackCTX = ctx;
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
			if (local != null) {
				clone.locals[i] = local.map(entry -> entry.copy());
			}
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
		if (value == null) {
			value = new One<>(new Entry(MJIEnv.NULL, false));
		}
		value.mapf(ctx, (FeatureExpr ctx1, Entry entry) -> push(ctx1, entry.value, entry.isRef));
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		Conditional<Entry> value = locals[index];
		if (value == null) {
			value = new One<>(new Entry(0, false));
		}
		value.mapf(ctx, (FeatureExpr ctx1, Entry entry) -> push(ctx1, entry.value, false));
		value = locals[index + 1];
		if (value == null) {
			value = new One<>(new Entry(0, false));
		}
		value.mapf(ctx, (FeatureExpr ctx1, Entry entry) -> push(ctx1, entry.value, false));
	}

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
		Conditional<Entry> result = stack.simplify(ctx).mapf(ctx, (FeatureExpr f, Stack s) -> {
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
			if (locals[index] == null) {
				locals[index] = new One<>(new Entry(0, false));
			}
			locals[index] = ChoiceFactory.create(ctx, new One<>(new Entry(value, isRef)), locals[index]).simplify();
		}
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, final int index) {
		if (index < 0) {
			return new One<>(-1);
		}
		if (index < locals.length) {
			if (locals[index] == null) {
				return One.MJIEnvNULL;
			}
			return locals[index].simplify(ctx).map(x -> {
				if (x == null) {
					return MJIEnv.NULL;
				}
				return x.value;
			}).simplifyValues();
		} else {
			final int i = index - locals.length;
			return stack.map(stack -> stack.get(i));
		}
	}

	@Override
	public Object getLocal(int index) {
		return locals[index].simplify(getCtx());
	}
	
	// TODO change to conditional
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
			for (boolean b : locals[index].simplify(ctx).map(y -> y.isRef).toList()) {
				if (b) {
					return true;
				}
			}
			return false;
//			return locals[index].simplify(ctx).map(new IsRefLocal()).simplifyValues().getValue();
		} else {
			final int i = index - locals.length;
			return stack.simplify(ctx).map(stack -> stack.isRefIndex(i)).simplifyValues().getValue();
		}
	}
	
	/*
	 * #######################################################
	 * Handling of the stack
	 * ########################################################
	 */

	@Override
	public <T> void push(final FeatureExpr ctx, final T value) {
		push(ctx, value, false);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void push(final FeatureExpr ctx, final Object value, final boolean isRef) {
		if (value instanceof Conditional) {
			((Conditional<Object>) value).mapf(ctx, (FeatureExpr ctx1, Object value1) -> push(ctx1, value1, isRef));
			return;
		}
		assert !isRef || value instanceof Integer;
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
			} else if (value instanceof Float) {
				clone.push(Float.floatToIntBits((Float) value), isRef);
			} else if (value instanceof Byte) {
				clone.push(((Byte) value).intValue(), isRef);
			} else if (value instanceof Short) {
				clone.push((int) (Short) value, isRef);
			} else if (value == null) {
				clone.push(MJIEnv.NULL, isRef);
			} else {
				throw new RuntimeException(value + " of type " + value.getClass() + " cannot be pushed to the stack.");
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
		Conditional<T> result = stack.simplify(ctx).mapf(ctx, (FeatureExpr f, Stack s) -> {
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
		}).simplify();
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

	@Override
	public boolean isRef(final FeatureExpr ctx, final int offset) {// change to Conditional<Boolean>
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
		return stack.map(y -> y.top);
	}
	
	@Override
	public void setTop(final FeatureExpr ctx, final int i) {
		stack = stack.mapf(ctx, (FeatureExpr f, Stack stack) -> {
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
		}).simplify();
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
		return getSlots(FeatureExprFactory.True());
	}

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
	
	@Override
	public int hashCode() {
		return 42;
	}

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
