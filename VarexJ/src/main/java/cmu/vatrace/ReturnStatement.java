package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Types;

public class ReturnStatement extends Statement {

	private Conditional<Integer> returnValue;

	private ReturnStatement(Object op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public ReturnStatement(Method method, Conditional<Integer> returnValue, FeatureExpr ctx) {
		this(null, method, ctx);
		this.returnValue = returnValue;
		if (returnValue.toMap().size() > 1) {
			setColor(NodeColor.darkorange);
		}
	}
	
	private final Function<Integer, String> f = val -> {
		switch (m.mi.getReturnType()) {
			case "Z":
				return Boolean.toString(val == 1);
		}
		if (TraceUtils.enums.containsKey(val)) {
			return TraceUtils.enums.get(val);
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		return "return " + Types.getTypeName(m.mi.getReturnType()) + " " + returnValue.map(f);
	}
		
	
	@Override
	public boolean isInteraction(int degree) {
		return returnValue.toMap().size() >= degree;
	}
}