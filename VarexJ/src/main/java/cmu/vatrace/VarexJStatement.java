package cmu.vatrace;

import java.util.function.BiFunction;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

public abstract class VarexJStatement extends Statement<Instruction> {

	public VarexJStatement(Instruction operation, Method method, int line, FeatureExpr ctx) {
		super(operation, method, line, ctx);
	}

	protected abstract Object getInfo();
	
	private boolean isBoolean() {
		final Object info = getInfo();
		if (info instanceof FieldInfo) {
			return ((FieldInfo) info).isBooleanField();
		}
		if (info instanceof LocalVarInfo) {
			return ((LocalVarInfo) info).isBoolean();
		}
		if (info instanceof MethodInfo) {
			return ((MethodInfo) info).getReturnTypeCode() == Types.T_BOOLEAN;
		}
		return false;
	}
	
	private boolean isReference() {
		final Object info = getInfo();
		if (info instanceof FieldInfo) {
			return ((FieldInfo) info).isReference();
		}
		if (info instanceof LocalVarInfo) {
			return !((LocalVarInfo) info).isNumeric();
		}
		if (info instanceof MethodInfo) {
			return ((MethodInfo) info).getReturnTypeCode() == Types.T_REFERENCE;
		}
		return false;
	}
	
	private boolean isEnum() {
		final Object info = getInfo();
		if (info instanceof FieldInfo) {
			return ((FieldInfo) info).getClassInfo().isEnum();
		}
		return false;
	}
	
	private boolean isEnum2() {
		final Object info = getInfo();
		if (info instanceof FieldInfo) {
			return ((FieldInfo) info).getTypeClassInfo().isEnum();
		}
		return false;
	}
	
	
	private String getName() {
		final Object info = getInfo();
		if (info instanceof FieldInfo) {
			return ((FieldInfo) info).getName();
		}
		if (info instanceof LocalVarInfo) {
			return ((LocalVarInfo) info).getName();
		}
		if (info instanceof MethodInfo) {
			return ((MethodInfo) info).getName();
		}
		return "";
	}
	
	private boolean isChar() {
		final Object info = getInfo();
		if (info instanceof FieldInfo) {
			return ((FieldInfo) info).isCharField();
		}
		if (info instanceof LocalVarInfo) {
			return "char".equals(((LocalVarInfo) info).getType());
		}
		if (info instanceof MethodInfo) {
			return ((MethodInfo) info).getReturnTypeCode() == Types.T_CHAR;
		}
		return false;
	}
	
	protected final BiFunction<FeatureExpr, Object, Conditional<String>> f = (ctx, val) -> {
		if (isBoolean()) {
			return new One<>(Boolean.toString((Integer)val == 1));
		}
		
		if (isChar()) {
			if (Character.isJavaIdentifierPart((Integer)val)) {
				return new One<>(val.toString());
			}
			return new One<>("0x" + String.format("%02x", ((Integer)val)));
		}
		
		if (isReference()) {
			if ((Integer)val == 0) {
				return new One<>("null");
			}
			if (TraceUtils.enums.containsKey(val)) {
				return new One<>(TraceUtils.enums.get(val));
			}
			if (isEnum()) {
				TraceUtils.enums.put((Integer)val, getName());
				return new One<>(getName());
			}
			if (isEnum2()) {
				return new One<>(TraceUtils.enums.get(val));
			}
			
			ElementInfo ei = ThreadInfo.getCurrentThread().getEnv().getElementInfo((Integer)val);
			if ((Integer) val == 0) {
				return new One<>("null");
			}
			
			if (ei.isArray()) {
				return new One<>('@' + val.toString() + "[" + ThreadInfo.getCurrentThread().getEnv().getArrayLength(ctx, (Integer)val) + "]");
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
			if (ei.getClassInfo().getName().equals(Integer.class.getCanonicalName())) {
				Conditional<Integer> values = ei.getIntField("value");
				return values.mapf(ctx, (ctx2, v) -> {
					return new One<>(v.toString());
				});
			}
			return new One<>('@' + val.toString());
		}
		return new One<>(val.toString());
	};

}
