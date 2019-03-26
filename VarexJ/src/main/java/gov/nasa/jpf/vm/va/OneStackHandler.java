package gov.nasa.jpf.vm.va;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.MethodNotImplementedException;
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
	protected @Nonnull Entry[] locals;

	protected @Nonnull Stack stack;

	protected int length = 0;

	public @Nonnull FeatureExpr stackCTX;
	
	private static final Entry NULL_ENTRY = new Entry(MJIEnv.NULL, false);

	public OneStackHandler(@Nonnull FeatureExpr ctx, int nLocals, int nOperands) {
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
		stackCTX = oneStackHandler.stackCTX;
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
		assert index < locals.length : "index larger than locals";
		return locals[index].isRef;
	}
	
	@Override
	public void push(FeatureExpr ctx, Conditional<Integer> value) {
		push(value.simplify(stackCTX).getValue(), false);
	}

	@Override
	public void pushFloat(FeatureExpr ctx, Conditional<Float> value) {
		push(value.simplify(stackCTX).getValue(), false);
	}

	@Override
	public void pushLong(FeatureExpr ctx, Conditional<Long> value) {
		push(value.simplify(stackCTX).getValue(), false);
	}

	@Override
	public void pushDouble(FeatureExpr ctx, Conditional<Double> value) {
		push(value.simplify(stackCTX).getValue(), false);
	}

	@Override
	public void push(FeatureExpr ctx, Conditional<Integer> value, boolean isRef) {
		push(value.simplify(stackCTX).getValue(), isRef);
	}

	public void push(Number value, boolean isRef) {
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
		} else {
			stack.push(Float.floatToIntBits((Float) value), isRef);
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
		default:
			assert stack.top >= 1;
			res = Types.intsToLong(stack.pop(), stack.pop());
			break;
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
		if (Conditional.isContradiction(stackCTX)) {
			clear(FeatureExprFactory.True());
		}
	}

	@Override
	public Collection<Integer> getAllReferences() {
		if (Conditional.isContradiction(getCtx())) {
			return Collections.emptySet();
		}
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
		throw new MethodNotImplementedException();
	}


	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		OneStackHandler other = (OneStackHandler) obj;
		if (length != other.length)
			return false;
		if (!Arrays.equals(locals, other.locals))
			return false;
		if (!stack.equals(other.stack)) {
			return false;
		}
		return Conditional.equals(stackCTX, other.stackCTX);
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
