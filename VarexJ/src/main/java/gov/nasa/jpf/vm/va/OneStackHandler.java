package gov.nasa.jpf.vm.va;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.Types;

/**
 * Stack implementation where locals are separated from stack.<br>
 * Locals: Entry[]<br>
 * Stack: -Stack-
 * 
 * @author Jens Meinicke
 *
 */
public class OneStackHandler implements Cloneable, IStackHandler {

	/** Locals are directly accessed with index **/
	protected Entry[] locals;

	protected Stack stack;

	protected int length = 0;

	public FeatureExpr stackCTX;
	
	private static final Entry NULL_ENTRY = new Entry(MJIEnv.NULL, false);

	public OneStackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		length = nLocals + nOperands;
		locals = new Entry[nLocals];
		Arrays.fill(locals, NULL_ENTRY);
		stack = new Stack(nOperands);
		stackCTX = ctx;
	}

	public OneStackHandler(OneStackHandler oneStackHandler) {
		length = oneStackHandler.length;
		locals = new Entry[oneStackHandler.locals.length];
		for (int i = 0; i < locals.length; i++) {
			locals[i] = oneStackHandler.locals[i].copy();
		}
		stack = oneStackHandler.stack.copy();
//		stackCTX = oneStackHandler.stackCTX; // TODO this needs to be fixed (see StackHandler)
		stackCTX = FeatureExprFactory.True();
	}

	@Override
	public FeatureExpr getCtx() {
		return stackCTX;
	}

	@Override
	public int getStackWidth() {
		return 1;
	}

	@Override
	public int getLocalWidth() {
		return 1;
	}

	@Override
	public String getMaxLocal() {
		return "";
	}

	@Override
	public IStackHandler clone() {
		return new OneStackHandler(this);
	}

	@Override
	public int getLength() {
		return stack.slots.length + locals.length;
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		stack.push(locals[index]);
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		stack.push(locals[index].value, false);
		stack.push(locals[index + 1].value, false);
	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		locals[index] = stack.popEntry();
	}

	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		locals[index + 1] = stack.popEntry();
		locals[index + 1].isRef = false;
		locals[index] = stack.popEntry();
		locals[index].isRef = false;
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		locals[index] = new Entry(value.getValue(), isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		locals[index] = new Entry(value, isRef);
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		if (index < 0) {
			return One.valueOf(-1);
		}
		if (index < locals.length) {
			return One.valueOf(locals[index].value);
		}
		return One.valueOf(stack.slots[index - locals.length].value);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		if (index < 0) {
			return false;
		}
		if (index < locals.length) {
			return locals[index].isRef;
		}
		return stack.slots[index - locals.length].isRef;
	}

	@Override
	public <T> void push(FeatureExpr ctx, T value) {
		push(ctx, value, false);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void push(FeatureExpr ctx, Object value, boolean isRef) {
		if (value instanceof Conditional) {
			push(ctx, ((Conditional) value).simplify(stackCTX).getValue(true), isRef);
			return;
		}
		assert !isRef || value instanceof Integer;
		if (value instanceof Integer) {
			stack.push((Integer) value, isRef);
		} else if (value instanceof Long) {
			long v = ((Long) value).longValue();
			stack.push((int) (v >> 32), isRef);
			stack.push((int) v, isRef);
		} else if (value instanceof Double) {
			long v = Double.doubleToLongBits((Double) value);
			stack.push((int) (v >> 32), isRef);
			stack.push((int) v, isRef);
		} else if (value instanceof Float) {
			stack.push(Float.floatToIntBits((Float) value), isRef);
		} else if (value instanceof Byte) {
			stack.push(((Byte) value).intValue(), isRef);
		} else if (value instanceof Short) {
			stack.push((int) (Short) value, isRef);
		} else if (value == null) {
			stack.push(MJIEnv.NULL, isRef);
		} else {
			throw new RuntimeException(value + " of type " + value.getClass() + " cannot be pushed to the stack.");
		}
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

	@SuppressWarnings("unchecked")
	@Override
	public <T> Conditional<T> pop(FeatureExpr ctx, Type t) {
		Number res;
		switch (t) {
		case INT:
			res = Integer.valueOf(stack.pop());
			break;
		case DOUBLE:
			assert stack.top >= 1;
			res = Types.intsToDouble(stack.pop(), stack.pop());
			break;
		case FLOAT:
			res = Types.intToFloat(stack.pop());
			break;
		case LONG:
			assert stack.top >= 1;
			res = Types.intsToLong(stack.pop(), stack.pop());
			break;
		default:
			return null;
		}
		return (Conditional<T>) new One<>(res);
	}

	@Override
	public void pop(FeatureExpr ctx, int n) {
		for (int i = n; i > 0; i--) {
			stack.pop();
		}
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		return peek(ctx, 0);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, int offset) {
		return new One<>(stack.peek(offset));
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		return new One<>(Types.intsToDouble(stack.peek(offset), stack.peek(offset + 1)));
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		return new One<>(Types.intsToLong(stack.peek(offset), stack.peek(offset + 1)));
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		return new One<>(Types.intToFloat(stack.peek(offset)));
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		return stack.isRef(offset);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		stack.set(offset, value, isRef);
	}

	@Override
	public Conditional<Integer> getTop() {
		return One.valueOf(stack.top);
	}

	@Override
	public void clear(FeatureExpr ctx) {
		stack.clear();
	}

	@Override
	public int[] getSlots() {
		return getSlots(null);
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		final int[] slots = new int[length];
		int j = 0;
		for (int i = 0; i < locals.length; i++) {
			slots[j++] = locals[i].value; 
		}
		
		for (int i = 0; i <= stack.top; i++) {
			slots[j++] = stack.slots[i].value;
		}
		return slots;
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		for (Entry local: locals) {
			if (local.isRef) {
				return true;
			}
		}
		for (int i = 0; i <= stack.top; i++) {
			if (stack.slots[i].isRef) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void dup_x1(FeatureExpr ctx) {
		stack.dup_x1();
	}

	@Override
	public void dup2_x2(FeatureExpr ctx) {
		stack.dup2_x2();
	}

	@Override
	public void dup2_x1(FeatureExpr ctx) {
		stack.dup2_x1();
	}

	@Override
	public void dup2(FeatureExpr ctx) {
		stack.dup2();		
	}

	@Override
	public void dup(FeatureExpr ctx) {
		stack.dup();
	}

	@Override
	public void dup_x2(FeatureExpr ctx) {
		stack.dup_x2();
	}

	@Override
	public void swap(FeatureExpr ctx) {
		stack.swap();
	}

	@Override
	public void setCtx(FeatureExpr ctx) {
		stackCTX = ctx;
	}

	@Override
	public Collection<Integer> getAllReferences() {
		Set<Integer> references = new HashSet<>();
		for (Entry l : locals) {
				if (l.isRef) {
					references.add(l.value);
				}
		}
		references.addAll(stack.getReferences());
		return references;
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, int increment) {
		locals[index] = new Entry(locals[index].value + increment, locals[index].isRef);
	}

	@Override
	public Object getLocal(int index) {
		return locals[index];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + Arrays.hashCode(locals);
		result = prime * result + ((stack == null) ? 0 : stack.hashCode());
		result = prime * result + ((stackCTX == null) ? 0 : stackCTX.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OneStackHandler other = (OneStackHandler) obj;
		if (length != other.length)
			return false;
		if (!Arrays.equals(locals, other.locals))
			return false;
		if (stack == null) {
			if (other.stack != null)
				return false;
		} else if (!stack.equals(other.stack))
			return false;
		if (stackCTX == null) {
			if (other.stackCTX != null)
				return false;
		} else if (!stackCTX.equals(other.stackCTX))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(stackCTX);
		string.append("\nLocals: [");

		for (int i = 0; i < locals.length; i++) {
			string.append(locals[i]);
			string.append(" ");
		}
		string.append("] \nStack: ");
		string.append(stack);
		return string.toString();
	}
}
