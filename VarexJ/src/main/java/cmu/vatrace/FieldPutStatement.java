package cmu.vatrace;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;

public class FieldPutStatement extends VarexJStatement {

	private FieldInfo fi;
	private Conditional<String> newString;
	private Conditional<String> oldString;
	private final FeatureExpr ownerCtx;

	public FieldPutStatement(Instruction op, Conditional oldValue, Conditional newValue, Method m, FieldInfo fi, FeatureExpr ctx,
			FeatureExpr ownerCtx) {
		super(op, m, op.getLineNumber(), ctx);
		
		this.oldValue = oldValue;
		this.value = newValue;
		this.fi = fi;
		this.ownerCtx = ownerCtx;
		this.oldString = oldValue.mapf(ownerCtx, f);
		this.newString = newValue.mapf(ownerCtx, f).simplify();

		setColor(NodeColor.darkorange);
	}

	@Override
	public String toString() {
		String type = fi.getType();
		if (type.contains(".")) {
			type = type.substring(type.lastIndexOf('.') + 1);
		}
		return type + " " + fi.getClassInfo().getSimpleName() + "." + fi.getName() + " = ";
	}

	@Override
	public Conditional<String> getOldValue() {
		return oldString;
	}

	@Override
	public Conditional<String> getValue() {
		return newString;
	}
	
	@Override
	public void setValue(Conditional value) {
		super.setValue(value);
		newString = value;
		
	}
	
	@Override
	public void setOldValue(Conditional oldValue) {
		super.setOldValue(oldValue);
		oldString = oldValue;
	}

	@Override
	public boolean affectsIdentifier(String fieldName) {
		return fi.getName().equals(fieldName);
	}

	@Override
	public boolean affectsref(int ref) {
		if (fi.isReference()) {
			return oldValue.toMap().containsKey(ref) || value.toMap().containsKey(ref);
		}
		return false;
	}

	@Override
	public boolean isInteraction(int degree) {
		return value.toMap().size() >= degree || oldValue.toMap().size() >= degree;
		/* oldValue.toMap().size() != newValue.toMap().size() &&*/
	}

	@Override
	protected Object getInfo() {
		return fi;
	}

	@Override
	public boolean isModificationStatement() {
		return true;
	}
}
