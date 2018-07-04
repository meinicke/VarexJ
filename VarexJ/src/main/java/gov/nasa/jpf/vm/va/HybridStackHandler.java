package gov.nasa.jpf.vm.va;

import java.util.Collection;

import cmu.conditional.Conditional;
import cmu.conditional.IChoice;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * Uses two different kinsd of {@link StackHandler}.
 * One stack for unconditional values to avoid map.
 * Another stack for conditional values.
 * 
 * The HybridStackHandler checks when to use which {@link StackHandler} and may transform on stack to the other.
 * 
 * @author Jens Meinicke
 *
 */
public class HybridStackHandler implements Cloneable, IStackHandler {
	
	/** Locals are directly accessed with index **/
	private IStackHandler stackHandler;
	public IStackHandler getStackHandler() {
		return stackHandler;
	}
	
	public static NormalStack normalStack = NormalStack.OneStack;
	public enum NormalStack {
		JPFStack, OneStack;
	}
	
	public static LiftedStack liftedStack = LiftedStack.Buffered;
	public enum LiftedStack {
		Default, Buffered
	}
	
	private static IStackHandler createNomalStack(FeatureExpr ctx, int nLocals, int nOperands) {
		switch (normalStack) {
		case JPFStack:
			return new JPFStackHandler(ctx, nLocals, nOperands);
		case OneStack:
			return new OneStackHandler(ctx, nLocals, nOperands);
		default:
			throw new RuntimeException(normalStack + " not supported");
		}
	}
	
	private static IStackHandler createLiftedStack(FeatureExpr ctx, int nLocals, int nOperands) {
		switch (liftedStack) {
		case Buffered:
			return new BufferedStackHandler(ctx, nLocals, nOperands);
		case Default:
			return new StackHandler(ctx, nLocals, nOperands);
		default:
			throw new RuntimeException(liftedStack + " not supported");
		}
	}

	protected int length = 0;
	private boolean lifted = false;
	public boolean isLifted() {
		return lifted;
	}
	private final int nLocals;
	private final int nOperands;
	
	public HybridStackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		stackHandler = createNomalStack(ctx, nLocals, nOperands);
		this.nLocals = nLocals;
		this.nOperands = nOperands;
	}
	
	/**
	 * Copy constructor
	 */
	public HybridStackHandler(HybridStackHandler stackHandler) {
		this.stackHandler = stackHandler.stackHandler.clone();
		this.nLocals = stackHandler.nLocals;
		this.nOperands = stackHandler.nOperands;
		this.lifted = stackHandler.lifted;
	}

	@Override
	public FeatureExpr getCtx() {
		return stackHandler.getCtx();
	}

	@Override
	public int getStackWidth() {
		return stackHandler.getStackWidth();
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
	public IStackHandler clone() {
		return new HybridStackHandler(this);
	}

	@Override
	public int getLength() {
		return stackHandler.getLength();
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		checkCTX(ctx);
		stackHandler.pushLocal(ctx, index);
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		checkCTX(ctx);
		stackHandler.pushLongLocal(ctx, index);
	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		checkCTX(ctx);
		stackHandler.storeOperand(ctx, index);
	}

	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		checkCTX(ctx);
		stackHandler.storeLongOperand(ctx, index);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		checkCTX(ctx);
		checkValue(value);
		stackHandler.setLocal(ctx, index, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		checkCTX(ctx);
		stackHandler.setLocal(ctx, index, value, isRef);
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		return stackHandler.getLocal(ctx, index);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		return stackHandler.isRefLocal(ctx, index);
	}
	
	@Override
	public void pushFloat(FeatureExpr ctx, Conditional<Float> value) {
		checkCTX(ctx);
		checkValueO(value, ctx);
		stackHandler.pushFloat(ctx, value);
	}

	@Override
	public void pushLong(FeatureExpr ctx, Conditional<Long> value) {
		checkCTX(ctx);
		checkValueO(value, ctx);
		stackHandler.pushLong(ctx, value);
	}

	@Override
	public void pushDouble(FeatureExpr ctx, Conditional<Double> value) {
		checkCTX(ctx);
		checkValueO(value, ctx);
		stackHandler.pushDouble(ctx, value);
	}

	@Override
	public void push(FeatureExpr ctx, Conditional<Integer> value) {
		checkCTX(ctx);
		checkValueO(value, ctx);
		stackHandler.push(ctx, value);
	}

	@Override
	public void push(FeatureExpr ctx, Conditional<Integer> value, boolean isRef) {
		checkCTX(ctx);
		checkValueO(value, ctx);
		stackHandler.push(ctx, value, isRef);
	}

	@Override
	public Conditional<Integer> pop(final FeatureExpr ctx) {
		checkCTX(ctx);
		return stackHandler.pop(ctx);
	}

	@Override
	public Conditional<Long> popLong(final FeatureExpr ctx) {
		checkCTX(ctx);
		return stackHandler.popLong(ctx);
	}

	@Override
	public Conditional<Double> popDouble(final FeatureExpr ctx) {
		checkCTX(ctx);
		return stackHandler.popDouble(ctx);
	}

	@Override
	public Conditional<Float> popFloat(final FeatureExpr ctx) {
		checkCTX(ctx);
		return stackHandler.popFloat(ctx);
	}

	@Override
	public <T> Conditional<T> pop(FeatureExpr ctx, Type t) {
		checkCTX(ctx);
		return stackHandler.pop(ctx, t);
	}

	@Override
	public void pop(FeatureExpr ctx, int n) {
		checkCTX(ctx);
		stackHandler.pop(ctx, n);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		checkCTX(ctx);
		return stackHandler.peek(ctx);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, int offset) {
		checkCTX(ctx);
		return stackHandler.peek(ctx, offset);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		checkCTX(ctx);
		return stackHandler.peekDouble(ctx, offset);
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		checkCTX(ctx);
		return stackHandler.peekLong(ctx, offset);
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		checkCTX(ctx);
		return stackHandler.peekFloat(ctx, offset);
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		checkCTX(ctx);
		return stackHandler.isRef(ctx, offset);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		checkCTX(ctx);
		stackHandler.set(ctx, offset, value, isRef);
	}

	@Override
	public Conditional<Integer> getTop() {
		return stackHandler.getTop();
	}

	@Override
	public void clear(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.clear(ctx);
	}

	@Override
	public int[] getSlots() {
		return stackHandler.getSlots();
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		checkCTX(ctx);
		return stackHandler.getSlots(ctx);
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		checkCTX(ctx);
		return stackHandler.hasAnyRef(ctx);
	}

	@Override
	public void dup_x1(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.dup_x1(ctx);
	}

	@Override
	public void dup2_x2(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.dup2_x2(ctx);
	}

	@Override
	public void dup2_x1(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.dup2_x1(ctx);
	}

	@Override
	public void dup2(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.dup2(ctx);		
	}

	@Override
	public void dup(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.dup(ctx);
	}

	@Override
	public void dup_x2(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.dup_x2(ctx);
	}

	@Override
	public void swap(FeatureExpr ctx) {
		checkCTX(ctx);
		stackHandler.swap(ctx);
	}

	@Override
	public void setCtx(FeatureExpr ctx) {
		stackHandler.setCtx(ctx);
	}

	@Override
	public Collection<Integer> getAllReferences() {
		return stackHandler.getAllReferences();
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, int increment) {
		checkCTX(ctx);
		stackHandler.IINC(ctx, index, increment);
	}

	@Override
	public Object getLocal(int index) {
		return stackHandler.getLocal(index);
	}
	
	private void checkCTX(FeatureExpr ctx) {
		if (!lifted && !Conditional.equals(stackHandler.getCtx(),ctx)) {
			createNewStackHandler();
		}
	}
	
	private void checkValue(Conditional<?> value) {
		if (!lifted && !value.isOne()) {
			if (!((Conditional<?>)value).simplify(stackHandler.getCtx()).isOne()) {
				createNewStackHandler();
			}
		}
	}
	
	private void checkValueO(Object value, FeatureExpr ctx) {
		if (!lifted && value instanceof IChoice<?>) {
			if (!((Conditional<?>)value).simplify(ctx).simplify(stackHandler.getCtx()).isOne()) {
				createNewStackHandler();
			}
		}
	}

	private void createNewStackHandler() {
		lifted = true;
		final IStackHandler newStackHandler = createLiftedStack(stackHandler.getCtx(), nLocals, nOperands);
		int i = 0; 
		final int[] slots = stackHandler.getSlots();
		for (;i < nLocals;i++) {
			newStackHandler.setLocal(stackHandler.getCtx(), i, slots[i], stackHandler.isRefLocal(FeatureExprFactory.True(), i));
		}
		for (;i <= nLocals + stackHandler.getTop().getValue();i++) {
			newStackHandler.push(stackHandler.getCtx(), One.valueOf(slots[i]), stackHandler.isRefLocal(FeatureExprFactory.True(), i));
		}
		stackHandler = newStackHandler;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return stackHandler.equals(((HybridStackHandler) obj).stackHandler);
	}
	
	@Override
	public int hashCode() {
		return stackHandler.hashCode();
	}
	
	@Override
	public String toString() {
		return stackHandler.toString();
	}
	
}
