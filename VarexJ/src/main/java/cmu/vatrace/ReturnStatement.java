package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.Types;

public class ReturnStatement extends Statement {

	private Conditional returnValue;

	private ReturnStatement(Instruction op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public ReturnStatement(Instruction op, Method method, Conditional returnValue, FeatureExpr ctx) {
		this(op, method, ctx);
		this.returnValue = returnValue.simplify(ctx);
		if (returnValue.toMap().size() > 1) {
			setColor(NodeColor.darkorange);
		}
	}
	
	private final Function<Object, String> f = val -> {
		switch (m.mi.getReturnType()) {
			case "Z":
				return Boolean.toString((Integer)val == 1);
		}
		if (TraceUtils.enums.containsKey(val)) {
			return TraceUtils.enums.get(val);
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		return "return " + Types.getTypeName(m.mi.getReturnType());
	}
		
	
	@Override
	public boolean isInteraction(int degree) {
		return returnValue.toMap().size() >= degree;
	}
	
	@Override
	public Conditional<String> getNewValue() {
		return returnValue.map(f);
	}
}