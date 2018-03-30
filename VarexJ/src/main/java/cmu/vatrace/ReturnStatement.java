package cmu.vatrace;

import java.util.HashSet;
import java.util.Set;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.MethodElement;
import cmu.varviz.trace.NodeColor;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.Types;

public class ReturnStatement extends VarexJStatement {


	public ReturnStatement(Instruction op, Method<MethodInfo> method, Conditional returnValue, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		value = returnValue.mapf(ctx, f);
		setColor(NodeColor.darkorange);
	}

	private MethodInfo getParentMethodInfo() {
		@SuppressWarnings("unchecked")
		Method<MethodInfo> parent = (Method<MethodInfo>) getParent();
		MethodInfo mi = parent.getContent();
		return mi;
	}
	
	@Override
	public String toString() {
		String type = Types.getTypeName(getParentMethodInfo().getReturnType());
		if (type.contains(".")) {
			type = type.substring(type.lastIndexOf('.') + 1);
		}
		return "return " + type;
	}
		
	
	@Override
	public boolean isInteraction(int degree) {
		Set<?> allReturnValues = new HashSet<>();
		for (MethodElement<?> child : parent.getChildren()) {
			if (child instanceof ReturnStatement) {
				allReturnValues.addAll(((Conditional)((ReturnStatement) child).value).toMap().keySet());
			}
		}
		if (allReturnValues.size() >= degree) {
			setColor(NodeColor.darkorange);
		}
		return allReturnValues.size() >= degree;
	}
	

	@Override
	protected Object getInfo() {
		return getParentMethodInfo();
	}
}