package cmu.vatrace;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.MethodElement;
import cmu.varviz.trace.NodeColor;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

public class ReturnStatement extends VarexJStatement {

	private final Conditional returnValue;

	public ReturnStatement(Instruction op, Method<MethodInfo> method, Conditional returnValue, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.returnValue = returnValue.mapf(ctx, f);
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
				allReturnValues.addAll(((ReturnStatement) child).returnValue.toMap().keySet());
			}
		}
		if (allReturnValues.size() >= degree) {
			setColor(NodeColor.darkorange);
		}
		return allReturnValues.size() >= degree;
	}
	
	@Override
	public Conditional<String> getValue() {
		return returnValue;
	}

	@Override
	protected Object getInfo() {
		return getParentMethodInfo();
	}
}