package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.Types;

public class ReturnStatement extends Statement<Instruction> {

	private Conditional returnValue;

	private ReturnStatement(Instruction op, Method<MethodInfo> m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public ReturnStatement(Instruction op, Method<MethodInfo> method, Conditional returnValue, FeatureExpr ctx) {
		this(op, method, ctx);
		this.returnValue = returnValue.simplify(ctx);
		if (returnValue.toMap().size() > 1) {
			setColor(NodeColor.darkorange);
		}
	}
	
	private final Function<Object, String> f = val -> {
		switch (getParentMethodInfo().getReturnTypeCode()) {
			case Types.T_BOOLEAN:
				return Boolean.toString((Integer)val == 1);
			case Types.T_REFERENCE:
				if (TraceUtils.enums.containsKey(val)) {
					return TraceUtils.enums.get(val);
				}
				if ((Integer)val == 0) {
					return "null";
				}
				return "@" + val;
		}
		return val.toString();
	};

	private MethodInfo getParentMethodInfo() {
		@SuppressWarnings("unchecked")
		Method<MethodInfo> parent = (Method<MethodInfo>) getParent();
		MethodInfo mi = parent.getContent();
		return mi;
	}
	
	@Override
	public String toString() {
		return "return " + Types.getTypeName(getParentMethodInfo().getReturnType());
	}
		
	
	@Override
	public boolean isInteraction(int degree) {
		return returnValue.toMap().size() >= degree;
	}
	
	@Override
	public Conditional<String> getValue() {
		return returnValue.map(f);
	}
}