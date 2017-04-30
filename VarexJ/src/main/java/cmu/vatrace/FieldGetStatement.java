package cmu.vatrace;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiFunction;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.IFStatement;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.MethodElement;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

public class FieldGetStatement extends Statement {

	private Conditional value;
	private FieldInfo fi;

	public FieldGetStatement(Instruction op, Conditional value, Method method, FieldInfo fi, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.fi = fi;
		this.value = value.mapf(ctx, f).simplify(ctx);
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
	public boolean canBeRemoved() {
		if (fi.getName().contains("$assertionsDisabled")) {
			return true;
		}
		
		Collection<MethodElement<?>> instructions = getParent().getChildren();
		Iterator<MethodElement<?>> iterator = instructions.iterator();
		
		// scroll to this instruction
		while (iterator.next() != this);
		if (!iterator.hasNext()) {
			return true;
		}
		
		// scroll to next if statement
		MethodElement<?> statement = iterator.next();
		while (!(statement instanceof IFStatement)) {
			if (!iterator.hasNext()) {
				return true;
			}
			statement = iterator.next();
		}
		// check if line is the same
		return statement.getLineNumber() != lineNumber;
	}
}
