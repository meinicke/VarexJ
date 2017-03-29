package cmu.vatrace;

import java.util.function.BiFunction;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
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

	public FieldPutStatement(Instruction op, Conditional<Integer> oldValue, Conditional<Integer> newValue, Method m, FieldInfo fi, FeatureExpr ctx) {
		super(op, m, op.getLineNumber(), ctx);
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.fi = fi;
		this.oldString = oldValue.mapf(ctx, f);
		this.newString = newValue.mapf(ctx, f).simplify();

		if (fi.getAnnotation(gov.nasa.jpf.annotation.Conditional.class.getName()) == null) {
			if (oldValue.toMap().size() < newValue.toMap().size()) {
				setColor(NodeColor.darkorange);
			} else if (oldValue.toMap().size() > newValue.toMap().size()) {
				setColor(NodeColor.limegreen);
			}
		}
	}

	private final BiFunction<FeatureExpr, Integer, Conditional<String>> f = (ctx, val) -> {
		if (fi.isBooleanField()) {
			return new One<>(Boolean.toString(val == 1));
		}
		if (fi.isReference()) {
			if (val == 0) {
				return new One<>("null");
			}
			if (fi.getClassInfo().isEnum()) {
				TraceUtils.enums.put(val, fi.getName());
				return new One<>(fi.getName());
			}
			if (fi.getTypeClassInfo().isEnum()) {
				return new One<>(TraceUtils.enums.get(val));
			}
			ElementInfo ei = ThreadInfo.getCurrentThread().getEnv().getElementInfo(val);
			if (ei.isArray()) {
				return new One<>('@' + val.toString() + "[" + ThreadInfo.getCurrentThread().getEnv().getArrayLength(ctx, val) + "]");
			}
			if ((Integer) val == 0) {
				return new One<>("null");
			}
			if (ei.getClassInfo().getName().equals(String.class.getCanonicalName())) {
				Conditional<Integer> cref = ei.getReferenceField("value");
				return cref.mapf(ctx, (ctx2, ref) -> {
					Conditional<char[]> values = ThreadInfo.getCurrentThread().getEnv().getCharArrayObject(ref);
					return values.mapf(ctx2, (ctx3, v) -> {
						return new One<>("\"" + new String(v) + "\"");
					});
				}).simplify();
			}
			return new One<>('@' + val.toString());
		}
		return new One<>(val.toString());
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
