package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Types;

public class ArrayStoreStatement extends Statement {

	private Conditional<Object> oldValue;
	private Conditional<Object> newValue;
	private int index;
	private ElementInfo ei;

	private ArrayStoreStatement(Object op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public ArrayStoreStatement(Method method, int index, Conditional oldValue, Conditional newValue, ElementInfo ei, FeatureExpr ctx) {
		this(null, method, ctx);
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.index = index;
		this.ei = ei;
		
		if (oldValue.toMap().size() < newValue.toMap().size()) {
			setColor(NodeColor.tomato);
		} else if (oldValue.toMap().size() > newValue.toMap().size()) {
			setColor(NodeColor.limegreen);
		}
	}
	
	private final Function<Object, String> f = val -> {
		if (ei.getArrayType().equals("C")) {
			return "0x" + String.format("%02x", (int)((Character)val).charValue());
		}
		if (ei.isReferenceArray()) {
			if ((Integer)val == 0) {
				return "null";
			}
			if (TraceUtils.enums.containsKey(val)) {
				return TraceUtils.enums.get(val);
			}
			if (ei.getClassInfo().isEnum()) {
				return TraceUtils.enums.get(val);
			}
			return '@' + val.toString();
		}
		
		return val.toString();
	};
	
	@Override
	public String toString() {
		return Types.getTypeName(ei.getArrayType()) + "[" + index + "] : " + oldValue.map(f) + " \u2192 " + newValue.map(f);
	}
	
	@Override
	public boolean affectsref(int ref) {
		return ei.getObjectRef() == ref;
	}
}
