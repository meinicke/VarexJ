package cmu.vatrace;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.MethodElement;
import cmu.varviz.trace.NodeColor;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

public class ReturnStatement extends Statement<Instruction> {

	private final Conditional returnValue;

	public ReturnStatement(Instruction op, Method<MethodInfo> method, Conditional returnValue, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.returnValue = returnValue.mapf(ctx, f);
		setColor(NodeColor.darkorange);
	}
	
	private final BiFunction<FeatureExpr, Object, Conditional<String>> f = (ctx, val) -> {
		switch (getParentMethodInfo().getReturnTypeCode()) {
			case Types.T_BOOLEAN:
				return new One<>(Boolean.toString((Integer)val == 1));
			case Types.T_REFERENCE:
				if ((Integer) val == 0) {
					return new One<>("null");
				}
				if (TraceUtils.enums.containsKey(val)) {
					return new One<>(TraceUtils.enums.get(val));
				}
				ElementInfo ei = ThreadInfo.getCurrentThread().getEnv().getElementInfo((Integer) val); 
				if (ei == null) {
					return new One<>("null @" + val);// should never happen
				}
				if (ei.getClassInfo().getName().equals(String.class.getCanonicalName())) {
					Conditional<Integer> cref = ei.getReferenceField("value");
					return cref.mapf(ctx, (ctx2, ref) -> {
						Conditional<char[]> values = ThreadInfo.getCurrentThread().getEnv().getCharArrayObject(ref);
						return values.mapf(ctx2, (ctx3, v) -> {
							return new One<>("\"" + new String(v) + "\"");
						});
					}).simplify(ctx);
				}
				if (ei.getClassInfo().getName().equals(Integer.class.getCanonicalName())) {
					Conditional<Integer> values = ei.getIntField("value");
					return values.mapf(ctx, (ctx2, v) -> {
						return new One<>(v.toString());
					});
				}
				return new One<>('@' + val.toString());
			case Types.T_CHAR:
				if (Character.isJavaIdentifierPart((Integer)val)) {
					return new One<>(Character.toString((char)((Integer)val).intValue()));
				}
				return new One<>("0x" + String.format("%02x", ((Integer)val)));
		}
		return new One<>(val.toString());
	};

	private MethodInfo getParentMethodInfo() {
		@SuppressWarnings("unchecked")
		Method<MethodInfo> parent = (Method<MethodInfo>) getParent();
		MethodInfo mi = parent.getContent();
		return mi;
	}
	
	@Override
	public String toString() {
		String type = Types.getTypeName(getParentMethodInfo().getReturnType());
		if (type.contains(".")) {
			type = type.substring(type.lastIndexOf('.') + 1);
		}
		return "return " + type;
	}
		
	
	@Override
	public boolean isInteraction(int degree) {
		Set<?> allReturnValues = new HashSet<>();
		for (MethodElement<?> child : parent.getChildren()) {
			if (child instanceof ReturnStatement) {
				allReturnValues.addAll(((ReturnStatement) child).returnValue.toMap().keySet());
			}
		}
		if (allReturnValues.size() >= degree) {
			setColor(NodeColor.darkorange);
		}
		return allReturnValues.size() >= degree;
	}
	
	@Override
	public Conditional<String> getValue() {
		return returnValue;
	}
}