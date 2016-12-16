package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;

public class FieldGetStatement extends Statement {

	private Conditional value;
	private FieldInfo fi;

	public FieldGetStatement(Instruction op, Conditional value, Method method, FieldInfo fi, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.value = value;
		this.fi = fi;
	}

	// TODO remove code clone
	private final Function<Object, String> f = val -> {
		if (val instanceof Integer) {
			if (fi.isBooleanField()) {
				return Boolean.toString((Integer)val == 1);
			}
			if (fi.isReference()) {
				if ((Integer)val == 0) {
					return "null";
				}
				if (TraceUtils.enums.containsKey(val)) {
					return TraceUtils.enums.get(val);
				}
				return '@' + val.toString();
			}
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		try {
			Conditional<String> valueString = value.map(f);
			return fi.getFullName() + ": " + valueString;
		} catch (Exception e) {
			return fi.getFullName()+ ": " + value;
		}
	}
	
	@Override
	public boolean affectsIdentifier(String fieldName) {
		return fi.getName().equals(fieldName);
	}
	
	@Override
	public boolean affectsref(int ref) {
		if (fi.isReference()) {
			return value.toMap().containsKey(ref);
		}
		return false;
	}
}
