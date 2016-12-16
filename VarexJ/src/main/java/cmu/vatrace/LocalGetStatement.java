package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;

public class LocalGetStatement extends Statement {

	private Conditional<Integer> value;
	private LocalVarInfo li;

	public LocalGetStatement(Instruction op, Conditional<Integer> value, Method method,LocalVarInfo li, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.value = value;
		this.li = li;
	}

	// TODO remove code clone
	private final Function<Integer, String> f = val -> {
		if (li.isBoolean()) {
			return Boolean.toString(val == 1);
		}
		if (!li.isNumeric()) {
			if (val == 0) {
				return "null";
			}
			return '@' + val.toString();
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		Conditional<String> valueString = value.map(f);
		return li.getType() + ' ' + li.getName() + ": " + valueString;
	}
	
	@Override
	public boolean affectsref(int ref) {
		if (!li.isNumeric() && !li.isBoolean()) {
			return value.toMap().containsKey(ref);
		}
		return false;
	}
	
	@Override
	public boolean affectsIdentifier(String identifier) {
		return li.getName().equals(identifier);
	}
}
