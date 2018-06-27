package gov.nasa.jpf.vm.va;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class StackHandlerFactory {

	private StackHandlerFactory() {
		// nothing here
	}

	public enum SHFactory {
		Default, Buffered, Hybid
	}

	public static void setFactory(SHFactory factory) {
		switch (factory) {
		case Buffered:
			activateBufferedStackHandler();
			break;
		case Default:
			activateDefaultStackHandler();
			break;
		case Hybid:
			activateHybridStackHandler();
			break;
		default:
			throw new RuntimeException(factory + " not supported");
		}
	}

	static Factory f = new HybridStackHandlerFactory();

	public static Factory getCurrent() {
		return f;
	}

	public static IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
		return f.createStack(ctx, nLocals, nOperands);
	}

	public static void activateBufferedStackHandler() {
		f = new BufferedStackHandlerFactory();
	}

	public static void activateHybridStackHandler() {
		f = new HybridStackHandlerFactory();
	}

	public static void activateDefaultStackHandler() {
		f = new DefaultStackHandlerFactory();
	}
}

interface Factory {
	IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands);
}

class DefaultStackHandlerFactory implements Factory {
	@Override
	public IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
		return new StackHandler(ctx, nLocals, nOperands);
	}

	@Override
	public String toString() {
		return StackHandler.class.getSimpleName();
	}
}

class BufferedStackHandlerFactory implements Factory {
	@Override
	public IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
		return new BufferedStackHandler(ctx, nLocals, nOperands);
	}

}

class HybridStackHandlerFactory implements Factory {
	@Override
	public IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
		return new HybridStackHandler(ctx, nLocals, nOperands);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + HybridStackHandler.normalStack + " -> " + HybridStackHandler.liftedStack + ")";
	}
}