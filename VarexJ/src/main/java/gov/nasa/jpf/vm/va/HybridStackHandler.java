package gov.nasa.jpf.vm.va;

import java.util.Collection;

import cmu.conditional.Conditional;
import cmu.conditional.IChoice;
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
	public FeatureExpr stackCTX;
	private final int nLocals;
	private final int nOperands;
	
	public HybridStackHandler(FeatureExpr ctx, int nLocals, int nOperands) {
		stackHandler = createNomalStack(ctx, nLocals, nOperands);
		stackCTX = ctx;
		this.nLocals = nLocals;
		this.nOperands = nOperands;
	}
	
	/**
	 * Copy constructor
	 */
	public HybridStackHandler(HybridStackHandler stackHandler) {
		this.stackHandler = stackHandler.stackHandler.clone();
		this.stackCTX= this.stackHandler.getCtx();
		this.nLocals = stackHandler.nLocals;
		this.nOperands = stackHandler.nOperands;
		this.lifted = stackHandler.lifted;
	}

	public HybridStackHandler() {
		stackHandler = createNomalStack(FeatureExprFactory.True(), 0, 0);
		stackCTX = FeatureExprFactory.True();
		this.nLocals = 0;
		this.nOperands = 0;
		this.lifted = false;
	}

	@Override
	public FeatureExpr getCtx() {
		return stackCTX;
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
		stackHandler.pushLongLocal(ctx, index);
	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		checkCTX(ctx);
		stackHandler.storeOperand(ctx, index);
	}

	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
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
	public <T> void push(FeatureExpr ctx, T value) {
		stackHandler.push(ctx, value);
	}

	@Override
	public void push(FeatureExpr ctx, Object value, boolean isRef) {
		checkCTX(ctx);
		checkValueO(value, ctx);
		stackHandler.push(ctx, value, isRef);
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
		return stackHandler.peek(ctx);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, int offset) {
		return stackHandler.peek(ctx, offset);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		return stackHandler.peekDouble(ctx, offset);
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		return stackHandler.peekLong(ctx, offset);
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		return stackHandler.peekFloat(ctx, offset);
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		checkCTX(ctx);
		return stackHandler.isRef(ctx, offset);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
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
		return stackHandler.getSlots(ctx);
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
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
		stackCTX = ctx;
		stackHandler.setCtx(ctx);
	}

	@Override
	public Collection<Integer> getAllReferences() {
		return stackHandler.getAllReferences();
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, int increment) {
		stackHandler.IINC(ctx, index, increment);
	}

	@Override
	public Object getLocal(int index) {
		return stackHandler.getLocal(index);
	}
	
	private void checkCTX(FeatureExpr ctx) {
		if (!lifted && !Conditional.equals(stackCTX,ctx)) {
			createNewStackHandler();
		}
	}
	
	private void checkValue(Conditional<?> value) {
		if (!lifted && !value.isOne()) {
			if (!((Conditional<?>)value).simplify(stackCTX).isOne()) {
				createNewStackHandler();
			}
		}
	}
	
	private void checkValueO(Object value, FeatureExpr ctx) {
		if (!lifted && value instanceof IChoice<?>) {
			if (!((Conditional<?>)value).simplify(ctx).simplify(stackCTX).isOne()) {
				createNewStackHandler();
			}
		}
	}

	private void createNewStackHandler() {
		lifted = true;
		final IStackHandler newStackHandler = createLiftedStack(stackCTX, nLocals, nOperands);
		int i = 0; 
		final int[] slots = stackHandler.getSlots();
		for (;i < nLocals;i++) {
			newStackHandler.setLocal(stackCTX, i, slots[i], stackHandler.isRefLocal(FeatureExprFactory.True(), i));
		}
		for (;i <= nLocals + stackHandler.getTop().getValue();i++) {
			newStackHandler.push(stackCTX, slots[i], stackHandler.isRefLocal(FeatureExprFactory.True(), i));
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
		final HybridStackHandler other = (HybridStackHandler) obj;
		if (stackHandler == null) {
			if (other.stackHandler != null)
				return false;
		} else if (!stackHandler.equals(other.stackHandler))
			return false;
		return true;
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
