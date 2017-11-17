package cmu.vatrace;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;

public class LocalStoreStatement extends VarexJStatement {

	private Conditional<String> oldValue;
	private Conditional<String> newValue;
	private LocalVarInfo li;

	public LocalStoreStatement(Instruction op, Method method, Conditional oldValue, Conditional newValue, LocalVarInfo li, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.li = li;
		if (oldValue != null) {
			oldValue = oldValue.simplify(method.getCTX());
			this.oldValue = oldValue.mapf(method.getCTX(), f).simplify(method.getCTX());
		}

		newValue = newValue.simplify(method.getCTX());
		this.newValue = newValue.mapf(method.getCTX(), f).simplify(ctx);
		if (this.oldValue != null) {
			this.newValue = ChoiceFactory.create(ctx, this.newValue, this.oldValue).simplify(method.getCTX()).simplifyValues();
		}
		setColor(NodeColor.darkorange);
	}

	@Override
	public String toString() {
		if (li == null) {
			return "set unknown: ";
		}
		String type = li.getType();
		if (type.contains(".")) {
			type = type.substring(type.lastIndexOf('.') + 1);
		}
		return type + " " + li.getName() + " = ";
	}

	@Override
	public boolean affectsIdentifier(String identifier) {
		return li == null ? false : li.getName().equals(identifier);
	}

	@Override
	public boolean isInteraction(int degree) {
		if (oldValue != null) {
			if (oldValue.equals(newValue)) {
				return false;
			}
			if (newValue.toMap().size() >= degree) {
				return true;
			}
			if (Math.abs(oldValue.toMap().size() - newValue.toMap().size()) >= degree - 1) {
				return true;
			}
		} else {
			if (newValue.toMap().size() >= degree) {
				return true;
			}
		}
		return false;
//		return oldValue != null && /*oldValue.toMap().size() != newValue.toMap().size() &&*/ newValue.toMap().size() >= degree;
	}

	@Override
	public Conditional<String> getOldValue() {
		if (oldValue == null) {
			return new One<>("null");
		}
		return oldValue;
	}

	@Override
	public Conditional<String> getValue() {
		return newValue;
	}

	@Override
	protected Object getInfo() {
		return li;
	}

	@Override
	public boolean isModificationStatement() {
		return true;
	}
}