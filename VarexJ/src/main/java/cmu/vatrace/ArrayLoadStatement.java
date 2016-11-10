package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Types;

public class ArrayLoadStatement extends Statement {

	private Conditional<Object> value;
	private int index;
	private ElementInfo ei;

	private ArrayLoadStatement(Object op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public ArrayLoadStatement(Method method, int index, Conditional value,  ElementInfo ei, FeatureExpr ctx) {
		this(null, method, ctx);
		this.value = value;
		this.index = index;
		this.ei = ei;
	}
	
	private final Function<Object, String> f = val -> {
		if (ei.getArrayType().equals("C")) {
			return "0x" + String.format("%02x", val);
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		return "\"" +  Types.getTypeName(ei.getArrayType()) + "[" + index + "] : " + value.map(f) + '\"';
	}
	
}
