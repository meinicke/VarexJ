package gov.nasa.jpf.vm.va;

import java.util.ArrayList;
import java.util.List;

import cmu.conditional.ChoiceFactory.Factory;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class StackHandlerFactory {
	
	public enum STACK_HANDLER {
		StackHandler, BufferedStackHandler
	}
	
	static Factory f = new DefaultStackHandlerFactory();

	public static IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
		return f.createStack(ctx, nLocals, nOperands);
	}
	
	public static IStackHandler createStack() {
		return f.createStack();
	}

	public static void setStackHandler(STACK_HANDLER stackHandler) {
		switch (stackHandler) {
		case BufferedStackHandler:
			f = new BufferedStackHandlerFactory();
			break;
		case StackHandler:
			f = new DefaultStackHandlerFactory();
			break;
		default:
			throw new RuntimeException("invalid command for stack handler: " + stackHandler);
		}
	}
	
	public static void setStackHandler(String name) {
		if (name.equals(StackHandler.class.getSimpleName())) {
			f = new DefaultStackHandlerFactory();
		} else if (name.equals(BufferedStackHandler.class.getSimpleName())) {
			f = new BufferedStackHandlerFactory();
		} else {
			throw new RuntimeException("invalid command for stack handler: " + name);
		}
	}
	
	private static interface Factory {
		IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands);
		IStackHandler createStack();
	}
	
	private static class DefaultStackHandlerFactory implements Factory {
		@Override
		public IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
			return new StackHandler(ctx, nLocals, nOperands);
		}
		@Override
		public IStackHandler createStack() {
			return new StackHandler();
		}
	}

	private static class BufferedStackHandlerFactory implements Factory {
		@Override
		public IStackHandler createStack(FeatureExpr ctx, int nLocals, int nOperands) {
			return new BufferedStackHandler(ctx, nLocals, nOperands);
		}
		@Override
		public IStackHandler createStack() {
			return new BufferedStackHandler();
		}
	}

	public static List<Object[]> asParameter() {
		List<Object[]> factorys = new ArrayList<>();
		for (STACK_HANDLER f : STACK_HANDLER.values()) {
			factorys.add(new Object[]{f});
		}
		return factorys;
	}

}




