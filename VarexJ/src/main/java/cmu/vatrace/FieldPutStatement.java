package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

public class FieldPutStatement extends Statement {

	private Conditional<Integer> oldValue;
	private Conditional<Integer> newValue;
	private FieldInfo fi;
	private Conditional<String> newString;
	private Conditional<String> oldString;

	private FieldPutStatement(Instruction op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public FieldPutStatement(Instruction op, Conditional<Integer> oldValue, Conditional<Integer> newValue, Method m, FieldInfo fi, FeatureExpr ctx) {
		this(op, m, ctx);
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.fi = fi;
		this.oldString = oldValue.map(f);
		this.newString = newValue.map(f);

		if (fi.getAnnotation(gov.nasa.jpf.annotation.Conditional.class.getName()) == null) {
			if (oldValue.toMap().size() < newValue.toMap().size()) {
				setColor(NodeColor.darkorange);
			} else if (oldValue.toMap().size() > newValue.toMap().size()) {
				setColor(NodeColor.limegreen);
			}
		}
	}

	private final Function<Integer, String> f = val -> {
		if (fi.isBooleanField()) {
			return Boolean.toString(val == 1);
		}
		if (fi.isReference()) {
			if (val == 0) {
				return "null";
			}
			if (fi.getClassInfo().isEnum()) {
				TraceUtils.enums.put(val, fi.getName());
				return fi.getName();
			}
			if (fi.getTypeClassInfo().isEnum()) {
				return TraceUtils.enums.get(val);
			}
			ElementInfo ei = ThreadInfo.getCurrentThread().getEnv().getElementInfo(val);
			if (ei.isArray()) {
				return '@' + val.toString() + "[" + ThreadInfo.getCurrentThread().getEnv().getArrayLength(FeatureExprFactory.True(), val) + "]";
			}
			return '@' + val.toString();
		}
		return val.toString();
	};

	@Override
	public String toString() {
		return fi.getFullName() + " = ";
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
		return oldValue.toMap().size() != newValue.toMap().size() && newValue.toMap().size() >= degree; 
	}
}
