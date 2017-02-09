package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.Types;

public class ArrayLoadStatement extends Statement<Instruction> {

	private Conditional<Object> value;
	private int index;
	private ElementInfo ei;


	public ArrayLoadStatement(Instruction op, Method method, int index, Conditional value,  ElementInfo ei, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.value = value;
		this.index = index;
		this.ei = ei;
	}
	
	private final Function<Object, String> f = val -> {
		if (ei.getArrayType().equals("C")) {
			return "0x" + String.format("%02x", val);
		} else if (ei.getArrayType().equals("Z")) {
			if (val instanceof Byte) {
				return Boolean.valueOf(((Byte)val) != 0).toString();
			} else {
				return val.toString();
			}
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		return Types.getTypeName(ei.getArrayType()) + "[" + index + "]";
	}
	
	@Override
	public boolean affectsref(int ref) {
		return ei.getObjectRef() == ref;
	}
	
	@Override
	public Conditional<?> getValue() {
		return value.map(f);
	}
}
