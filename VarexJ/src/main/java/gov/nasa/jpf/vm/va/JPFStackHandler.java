package gov.nasa.jpf.vm.va;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.MethodNotImplementedException;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Types;

/**
 * Similar stack implementation as originally from JPF.
 * Not variability aware. 
 * 
 * @see HybridStackHandler
 * 
 * @author Jens Meinicke
 *
 */
public class JPFStackHandler implements Cloneable, IStackHandler {

	protected int top;
	protected @Nonnull int[] slots;
	protected int length = 0;
	protected @Nonnull boolean[] isRef;
	protected int nLocals = 0;
	private int nOperands = 0;
	
	public @Nonnull FeatureExpr stackCTX;
	
	public JPFStackHandler(@Nonnull FeatureExpr ctx, int nLocals, int nOperands) {
		this.nLocals = nLocals;
		this.nOperands = nOperands;
		length = nLocals + nOperands;
		slots = new int[length];
		isRef = new boolean[length];
		this.nLocals = nLocals;
		stackCTX = ctx;
		top = nLocals - 1;
	}

	public JPFStackHandler(JPFStackHandler oneStackHandler) {
		length = oneStackHandler.length;
		this.nLocals = oneStackHandler.nLocals;
		this.nOperands = oneStackHandler.nOperands;
		slots = new int [length];
		isRef = new boolean[length];
		top = oneStackHandler.top;
		System.arraycopy(oneStackHandler.slots, 0, slots, 0, top + 1);
		System.arraycopy(oneStackHandler.isRef, 0, isRef, 0, top + 1);
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
		return new JPFStackHandler(this);
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		push(slots[index], isRef[index]);
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		push(slots[index], false);
		push(slots[index + 1], false);
	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		assert top >= nLocals;
		isRef[index] = isRef[top];
		slots[index] = slots[top--];
		
	}
	

	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		assert top >= nLocals;
		slots[index + 1] = slots[top--];
		assert top >= nLocals;
		slots[index] = slots[top--];
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		slots[index] = value.getValue();
		this.isRef[index] = isRef;
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		slots[index] = value;
		this.isRef[index] = isRef;
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		if (index < 0) {
			return One.valueOf(-1);
		}
		return One.valueOf(slots[index]);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		if (index < nLocals) {
			return isRef[index];
		}
		return false;
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
			slots[++top] = ((Integer) value);
			this.isRef[top] = isRef;
		} else if (value instanceof Long) {
			long v = ((Long) value).longValue();
			slots[++top] = ((int) (v >> 32));
			this.isRef[top] = isRef;
			slots[++top] = ((int) v);
			this.isRef[top] = isRef;
		} else if (value instanceof Double) {
			long v = Double.doubleToLongBits((Double) value);
			slots[++top] = ((int) (v >> 32));
			this.isRef[top] = isRef;
			slots[++top] = ((int) v);
			this.isRef[top] = isRef;
		} else {
			slots[++top] = (Float.floatToIntBits((Float) value));
			this.isRef[top] = isRef;
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

	/* (non-Javadoc)
	 * @see gov.nasa.jpf.vm.IStackHandler#popFloat(de.fosd.typechef.featureexpr.FeatureExpr)
	 */
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
			assert top >= nLocals; 
			this.isRef[top] = false;
			res = Integer.valueOf(slots[top--]);
			break;
		case DOUBLE:
			assert top -1 >= nLocals; 
			this.isRef[top] = false;
			res = Types.intsToDouble(slots[top--], slots[top--]);
			break;
		case FLOAT:
			assert top >= nLocals; 
			this.isRef[top] = false;
			res = Types.intToFloat(slots[top--]);
			break;
		case LONG:
			assert top - 1 >= nLocals; 
			this.isRef[top] = false;
			res = Types.intsToLong(slots[top--], slots[top--]);
			break;
		default:
			return null;
		}
		return (Conditional<T>) new One<>(res);
	}

	@Override
	public void pop(FeatureExpr ctx, int n) {
		assert top - n >= nLocals - 1;
		top -= n;
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		return peek(ctx, 0);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, int offset) {
		if (top - offset < nLocals) {
			return One.valueOf(-1);
		}
		return new One<>(slots[top - offset]);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		final int lo = top - offset < nLocals ? -1 : slots[top - offset];
		final int hi = top - offset - 1 < nLocals ? -1 : slots[top - offset - 1];
		return new One<>(Types.intsToDouble(lo, hi));
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		final int lo = top - offset < nLocals ? -1 : slots[top - offset];
		final int hi = top - offset - 1 < nLocals ? -1 : slots[top - offset - 1];
		return new One<>(Types.intsToLong(lo, hi));
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		if (top - offset < nLocals) {
			return new One<>(Types.intToFloat(-1));
		}
		return new One<>(Types.intToFloat(slots[top - offset]));
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		assert top - offset >= nLocals;
		return this.isRef[top - offset];
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		assert top - offset >= nLocals; 
		slots[top - offset] = value;
		this.isRef[top - offset] = isRef;
	}

	@Override
	public Conditional<Integer> getTop() {
		return One.valueOf(top - nLocals);
	}

	@Override
	public void clear(FeatureExpr ctx) {
		top = nLocals - 1;
	}

	@Override
	public int[] getSlots() {
		int[] copy = new int[slots.length];
		for (int i = 0; i <= top; i++) {
			copy[i] = slots[i];
		}
		return copy;
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		return getSlots();
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		for (int i = 0; i <= top;i++) {
			if (isRef[i]) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void dup_x1(FeatureExpr ctx) {
		assert top > nLocals;
		int A = slots[top - 1];
		int B = slots[top];
		boolean bA = isRef[top - 1];
		boolean bB = isRef[top];
		
		slots[top - 1] = B;
		isRef[top - 1] = bB;
		slots[top] = A;
		isRef[top] = bA;
		slots[top + 1] = B;
		isRef[top + 1] = bB;
		top++;
	}
	
	/**
	 * .. A B C D => .. C D A B C D
	 */
	@Override
	public void dup2_x2(FeatureExpr ctx) {
		assert top - 3 >= nLocals;
		final int s0 = top - 3;
		final int s1 = s0 + 1;
		final int s2 = s0 + 2;
		final int s3 = s0 + 3;
		final int s4 = s0 + 4;
		final int s5 = s0 + 5;
		final int A = slots[s0];
 		final int B = slots[s1];
		final int C = slots[s2];
		final int D = slots[s3];

		slots[s0] = C;
		slots[s1] = D;
		slots[s2] = A;
		slots[s3] = B;
		slots[s4] = C;
		slots[s5] = D;

		final boolean refA = isRef[s0];
 		final boolean refB = isRef[s1];
		final boolean refC = isRef[s2];
		final boolean refD = isRef[s3];

		isRef[s0] = refC;
		isRef[s1] = refD;
		isRef[s2] = refA;
		isRef[s3] = refB;
		isRef[s4] = refC;
		isRef[s5] = refD;
		
		top += 2;
	}
	

	@Override
	public void dup2_x1(FeatureExpr ctx) {
		assert top - 2 >= nLocals;
		int A = slots[top - 2];
		int B = slots[top - 1];
		int C = slots[top];

		slots[top - 2] = B;
		slots[top - 1] = C;
		slots[top] = A;
		slots[top + 1] = B;
		slots[top + 2] = C;
		
		boolean refA = isRef[top - 2];
		boolean refB = isRef[top - 1];
		boolean refC = isRef[top];

		isRef[top - 2] = refB;
		isRef[top - 1] = refC;
		isRef[top] = refA;
		isRef[top + 1] = refB;
		isRef[top + 2] = refC;

		top += 2;
	}

	@Override
	public void dup2(FeatureExpr ctx) {
		assert top > nLocals;
		slots[top + 1] = slots[top - 1];
		slots[top + 2] = slots[top];

		isRef[top + 1] = isRef[top - 1];
		isRef[top + 2] = isRef[top];
		
		top += 2;
	}

	@Override
	public void dup(FeatureExpr ctx) {
		assert top >= nLocals;
		slots[top + 1] = slots[top];
		isRef[top + 1] = isRef[top];
		this.top++;
	}

	@Override
	public void dup_x2(FeatureExpr ctx) {
		assert top >= nLocals + 2;
		int A = slots[top - 2];
		int B = slots[top - 1];
		int C = slots[top];

		slots[top - 2] = C;
		slots[top - 1] = A;
		slots[top] = B;
		slots[top + 1] = C;

		boolean refA = isRef[top - 2];
		boolean refB = isRef[top - 1];
		boolean refC = isRef[top];

		isRef[top - 2] = refC;
		isRef[top - 1] = refA;
		isRef[top] = refB;
		isRef[top + 1] = refC;
		
		top++;
	}
	
	@Override
	public void swap(FeatureExpr ctx) {
		assert top > nLocals;
		final int A = slots[top - 1];
		slots[top - 1] = slots[top];
		slots[top] = A;
		
		final boolean ref = isRef[top - 1];
		isRef[top - 1] = isRef[top];
		isRef[top] = ref;
	}

	@Override
	public void setCtx(FeatureExpr ctx) {
		stackCTX = ctx;
	}

	@Override
	public Collection<Integer> getAllReferences() {
		Set<Integer> references = new HashSet<>();
		for (int i = 0; i <= top; i++) {
			if (isRef[i]) {
				references.add(slots[i]);
			}
		}
		return references;
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, int increment) {
		slots[index] += increment;
	}

	@Override
	public Object getLocal(int index) {
		return slots[index];
	}
	
	@Override
	public int hashCode() {
		throw new MethodNotImplementedException();
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		JPFStackHandler other = (JPFStackHandler) obj;
		if (length != other.length)
			return false;
		if (nLocals != other.nLocals) {
			return false;
		}
		if (top != other.top) {
			return false;
		}
		for (int i = 0; i <= top; i++) {
			if (slots[i] != other.slots[i] || isRef[i] != other.isRef[i]) {
				return false;
			}
		}
		return stackCTX.equals(other.stackCTX);
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(stackCTX);
		string.append("\nLocals: [");
		int i = 0;
		for (; i < nLocals; i++) {
			string.append(slots[i]);
			string.append(" ");
		}
		string.append("] \nStack: ");
		for (; i <= top; i++) {
			string.append(slots[i]);
			string.append(" ");
		}
		for (; i < slots.length; i++) {
			string.append("_ ");
		}
		return string.toString();
	}
}
