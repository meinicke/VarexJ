package gov.nasa.jpf.vm.va;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class StackHandlerFactory {
	
	static Factory f = new DefaultStackHandlerFactory();

	public static IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
		return f.createStack(ctx, nLocals, nOperands);
	}
	
	public static IStackHandler createStack() {
		return f.createStack();
	}

}

interface Factory {
	IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands);
	IStackHandler createStack();
}

class DefaultStackHandlerFactory implements Factory {
	@Override
	public IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
		return new StackHandler(ctx, nLocals, nOperands);
	}
	@Override
	public IStackHandler createStack() {
		return new StackHandler();
	}
}

