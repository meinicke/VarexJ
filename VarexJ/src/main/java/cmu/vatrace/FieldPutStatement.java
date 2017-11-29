package cmu.vatrace;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;

public class FieldPutStatement extends VarexJStatement {

	private Conditional oldValue;
	private Conditional newValue;
	private FieldInfo fi;
	private Conditional<String> newString;
	private Conditional<String> oldString;

	public FieldPutStatement(Instruction op, Conditional oldValue, Conditional newValue, Method m, FieldInfo fi, FeatureExpr ctx,
			FeatureExpr ownerCtx) {
		super(op, m, op.getLineNumber(), ctx);
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.fi = fi;
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
	public boolean affectsIdentifier(String fieldName) {
		return fi.getName().equals(fieldName);
	}

	@Override
	public boolean affectsref(int ref) {
		if (fi.isReference()) {
			return oldValue.toMap().containsKey(ref) || newValue.toMap().containsKey(ref);
		}
		return false;
	}

	@Override
	public boolean isInteraction(int degree) {
		return newValue.toMap().size() >= degree || oldValue.toMap().size() >= degree;
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
