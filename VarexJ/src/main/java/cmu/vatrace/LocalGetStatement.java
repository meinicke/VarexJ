package cmu.vatrace;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;

public class LocalGetStatement extends VarexJStatement {

	private Conditional<String> value;
	private LocalVarInfo li;

	public LocalGetStatement(Instruction op, Conditional value, Method method,LocalVarInfo li, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.li = li;
		this.value = value.mapf(method.getCTX(), f).simplify(ctx);
	}
	
	@Override
	public String toString() {
		String type = li.getType();
		if (type.contains(".")) {
			type = type.substring(type.lastIndexOf('.') + 1);
		}
		return type + " " + li.getName();
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
	
	@Override
	public Conditional<?> getValue() {
		return value;
	}
	
	@Override
	public boolean isInteraction(int degree) {
		return true;
	}
	
	@Override
	public boolean canBeRemoved(int line) {
		return line != lineNumber;
	}

	@Override
	protected Object getInfo() {
		return li;
	}
}
