package gov.nasa.jpf.vm.va;

import java.lang.reflect.Method;
import java.util.Collection;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.StackFrame;

public class MeasuringStackHandler implements IStackHandler {
	
	private final IStackHandler handler;
	private StackFrame frame;
	
	private static int index = 0;
	private int id = index++;
	
	public MeasuringStackHandler(FeatureExpr ctx, int nLocals, int nOperands, StackFrame frame) {
		this.frame = frame;
		Store.add(this, frame.getMethodName(), null, ctx, nLocals, nOperands);
		handler = StackHandlerFactory.createStack2(ctx, nLocals, nOperands);// TODO
	}

	@Override
	public int hashCode() {
		return id;
	}
	
	public MeasuringStackHandler(IStackHandler handler, StackFrame frame) {
		Store.add(this, frame.getMethodName(), null, FeatureExprFactory.True(), 0, 0);
		this.frame = frame;
		this.handler = handler.clone();
	}

		private void log(Method method, Object... args) {
		Store.add(this, frame.getMethodName(), method, args);
	}
	
	@Override
	public FeatureExpr getCtx() {
		return handler.getCtx();
	}

	@Override
	public int getStackWidth() {
		return handler.getStackWidth();
	}

	@Override
	public int getLocalWidth() {
		return handler.getLocalWidth();
	}

	@Override
	public String getMaxLocal() {
		return handler.getMaxLocal();
	}

	@Override
	public IStackHandler clone() {
		return new MeasuringStackHandler(handler, frame);
	}

	@Override
	public int getLength() {
		return handler.getLength();
	}

	@Override
	public Conditional<Stack> getStack() {
		return handler.getStack();
	}

	@Override
	public void pushLocal(FeatureExpr ctx, int index) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, index);
		handler.pushLocal(ctx, index);
	}

	@Override
	public void pushLongLocal(FeatureExpr ctx, int index) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, index);
		handler.pushLongLocal(ctx, index);
	}

	@Override
	public void storeOperand(FeatureExpr ctx, int index) {
		log(new Object(){}.getClass().getEnclosingMethod(),ctx,  index);
		handler.storeOperand(ctx, index);
	}

	@Override
	public void storeLongOperand(FeatureExpr ctx, int index) {
		log(new Object(){}.getClass().getEnclosingMethod(),ctx,  index);
		handler.storeLongOperand(ctx, index);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, index, value, isRef);
		handler.setLocal(ctx, index, value, isRef);
	}

	@Override
	public void setLocal(FeatureExpr ctx, int index, int value, boolean isRef) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, index, value, isRef);
		handler.setLocal(ctx, index, value, isRef);
	}

	@Override
	public Conditional<Integer> getLocal(FeatureExpr ctx, int index) {
		log(new Object(){}.getClass().getEnclosingMethod(),ctx,  index);
		return handler.getLocal(ctx, index);
	}

	@Override
	public boolean isRefLocal(FeatureExpr ctx, int index) {
		log(new Object(){}.getClass().getEnclosingMethod(),ctx,  index);
		return handler.isRefLocal(ctx, index);
	}

	@Override
	public <T> void push(FeatureExpr ctx, T value) {
		log(new Object(){}.getClass().getEnclosingMethod(),ctx,  value);
		handler.push(ctx, value);
		
	}

	@Override
	public void push(FeatureExpr ctx, Object value, boolean isRef) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, value, isRef);
		handler.push(ctx, value, isRef);
	}

	@Override
	public Conditional<Integer> pop(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		return handler.pop(ctx);
	}

	@Override
	public Conditional<Long> popLong(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		return handler.popLong(ctx);
	}

	@Override
	public Conditional<Double> popDouble(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		return handler.popDouble(ctx);
	}

	@Override
	public Conditional<Float> popFloat(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		return handler.popFloat(ctx);
	}

	@Override
	public <T> Conditional<T> pop(FeatureExpr ctx, Type t) {
		log(new Object(){}.getClass().getEnclosingMethod(),ctx,  t);
		return handler.pop(ctx, t);
	}

	@Override
	public void pop(FeatureExpr ctx, int n) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, n);
		handler.pop(ctx, n);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		return handler.peek(ctx);
	}

	@Override
	public Conditional<Integer> peek(FeatureExpr ctx, int offset) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, offset);
		return handler.peek(ctx, offset);
	}

	@Override
	public Conditional<Double> peekDouble(FeatureExpr ctx, int offset) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, offset);
		return handler.peekDouble(ctx, offset);
	}

	@Override
	public Conditional<Long> peekLong(FeatureExpr ctx, int offset) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, offset);
		return handler.peekLong(ctx, offset);
	}

	@Override
	public Conditional<Float> peekFloat(FeatureExpr ctx, int offset) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, offset);
		return handler.peekFloat(ctx, offset);
	}

	@Override
	public boolean isRef(FeatureExpr ctx, int offset) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, offset);
		return handler.isRef(ctx, offset);
	}

	@Override
	public void set(FeatureExpr ctx, int offset, int value, boolean isRef) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, offset, value, isRef);
		handler.set(ctx, offset, value, isRef);
	}

	@Override
	public Conditional<Integer> getTop() {
		log(new Object(){}.getClass().getEnclosingMethod());
		return handler.getTop();
	}

	@Override
	public void setTop(FeatureExpr ctx, int i) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, i);
		handler.setTop(ctx, i);
	}

	@Override
	public void clear(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.clear(ctx);
	}

	@Override
	public int[] getSlots() {
		return handler.getSlots();
	}

	@Override
	public int[] getSlots(FeatureExpr ctx) {
		return handler.getSlots(ctx);
	}

	@Override
	public boolean hasAnyRef(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		return handler.hasAnyRef(ctx);
	}

	@Override
	public void dup_x1(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.dup_x1(ctx);
	}

	@Override
	public void dup2_x2(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.dup2_x2(ctx);
	}

	@Override
	public void dup2_x1(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.dup2_x1(ctx);
	}

	@Override
	public void dup2(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.dup2(ctx);
	}

	@Override
	public void dup(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.dup(ctx);
	}

	@Override
	public void dup_x2(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.dup_x2(ctx);
	}

	@Override
	public void swap(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.swap(ctx);
	}

	@Override
	public void setCtx(FeatureExpr ctx) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx);
		handler.setCtx(ctx);
	}

	@Override
	public Collection<Integer> getAllReferences() {
		log(new Object(){}.getClass().getEnclosingMethod());
		return handler.getAllReferences();
	}

	@Override
	public void IINC(FeatureExpr ctx, int index, int increment) {
		log(new Object(){}.getClass().getEnclosingMethod(), ctx, index, increment);
		handler.IINC(ctx, index, increment);
	}

	@Override
	public Object getLocal(int index) {
		log(new Object(){}.getClass().getEnclosingMethod(), index);
		return handler.getLocal(index);
	}

}
