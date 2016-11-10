package cmu.vatrace;

import java.util.function.Function;

import org.eclipse.jdt.annotation.NonNull;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.FieldInfo;

public class FieldGetStatement extends Statement {

	private Conditional<Integer> value;
	private FieldInfo fi;

	private FieldGetStatement(@NonNull Object op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public FieldGetStatement(Conditional<Integer> value, Method method, FieldInfo fi, FeatureExpr ctx) {
		this(null, method, ctx);
		this.value = value;
		this.fi = fi;
	}

	// TODO remove code clone
	private final Function<Integer, String> f = val -> {
		if (fi.isBooleanField()) {
			return Boolean.toString(val == 1);
		}
		if (fi.isReference()) {
			if (val == 0) {
				return "null";
			}
			if (TraceUtils.enums.containsKey(val)) {
				return TraceUtils.enums.get(val);
			}
			return '@' + val.toString();
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		Conditional<String> valueString = value.map(f);
		return "\"" + fi.getFullName() + ": " + valueString + '\"';
	}
}
