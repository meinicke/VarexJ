package cmu.vatrace;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.Types;

public class ArrayStoreStatement extends VarexJStatement {

	private int index;
	private ElementInfo ei;

	public ArrayStoreStatement(Instruction op, Method method, int index, Conditional oldValue, Conditional newValue, ElementInfo ei, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		if (oldValue != null) {
			oldValue = oldValue.simplify(method.getCTX());
			this.oldValue = oldValue.mapf(method.getCTX(), f).simplify(method.getCTX());
		}

		newValue = newValue.simplify(method.getCTX());
		this.value = newValue.mapf(method.getCTX(), f).simplify(ctx);
		if (this.oldValue != null) {
			this.value = ChoiceFactory.create(ctx, (Conditional<String>)this.value, (Conditional<String>)this.oldValue).simplify(method.getCTX()).simplifyValues();
		}
		this.index = index;
		this.ei = ei;
		
		if (oldValue.toMap().size() < newValue.toMap().size()) {
			setColor(NodeColor.darkorange);
		} else if (oldValue.toMap().size() > newValue.toMap().size()) {
			setColor(NodeColor.limegreen);
		}
	}
	
	@Override
	public String toString() {
		return Types.getTypeName(ei.getArrayType()) + "[" + index + "]";
	}
	
	@Override
	public boolean affectsref(int ref) {
		return ei.getObjectRef() == ref;
	}
	
	@Override
	public boolean isInteraction(int degree) {
		if (oldValue != null) {
			if (oldValue.equals(value)) {
				return false;
			}
			if (value.toMap().size() >= degree) {
				return true;
			}
			if (Math.abs(oldValue.toMap().size() - value.toMap().size()) >= degree - 1) {
				return true;
			}
		} else {
			if (value.toMap().size() >= degree) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Conditional<String> getOldValue() {
		if (oldValue == null) {
			return new One<>("null");
		}
		return (Conditional<String>) oldValue;
	}

	@Override
	public Conditional<String> getValue() {
		return (Conditional<String>) value;
	}
	
	@Override
	protected Object getInfo() {
		return ei;
	}
}
