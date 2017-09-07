package cmu.vatrace;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;

public class FieldGetStatement extends VarexJStatement {

	private Conditional value;
	private FieldInfo fi;

	public FieldGetStatement(Instruction op, Conditional value, Method method, FieldInfo fi, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.fi = fi;
		this.value = value.mapf(ctx, f).simplify(ctx);
	}

	@Override
	public String toString() {
		return fi.getFullName();
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
	
	@Override
	public Conditional getValue() {
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
		return fi;
	}
}
