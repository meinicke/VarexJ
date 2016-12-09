package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;

public class LocalStoreStatement extends Statement {

	private Conditional oldValue;
	private Conditional newValue;
	private LocalVarInfo li;

	private LocalStoreStatement(Instruction op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public LocalStoreStatement(Instruction op, Method method, Conditional oldValue, Conditional newValue, LocalVarInfo li, FeatureExpr ctx) {
		this(op, method, ctx);
		this.oldValue = oldValue == null ? null : oldValue.simplify(method.getCTX());
		this.newValue = newValue.simplify(method.getCTX());
		this.li = li;
	}

	private final Function<Object, String> f = val -> {
		if (li.isBoolean()) {
			return Boolean.toString((Integer)val == 1);
		}
		if (li.getType().equals("char")) {
			return "0x" + String.format("%02x", ((Integer)val));
		}
		
		if (!li.isNumeric()) {
			if ((Integer)val == 0) {
				return "null";
			}
			return '@' + val.toString();
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		if (li == null) {
			return "set unknown: ";
		}
//		if (oldValue == null) {
//			return li.getType() + " " + li.getName() + " \u2192 " + newValue.map(f);
//		}
			
		return li.getType() + " " + li.getName() + ":";
	}
	
	@Override
	public boolean affectsIdentifier(String identifier) {
		return li == null ? false : li.getName().equals(identifier);
	}
	
	@Override
	public boolean isInteraction(int degree) {
		return oldValue != null && oldValue.toMap().size() != newValue.toMap().size() && newValue.toMap().size() >= degree; 
	}
	
	@Override
	public Conditional<String> getOldValue() {
		if (oldValue == null) {
			return new One<>("null");
		}
		return oldValue.map(f);
	}
	
	@Override
	public Conditional<String> getValue() {
		return newValue.map(f);
	}
}