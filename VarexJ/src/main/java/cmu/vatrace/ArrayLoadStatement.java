package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import gov.nasa.jpf.vm.ElementInfo;

public class ArrayLoadStatement extends Statement {

	private Conditional<Object> value;
	private int index;
	private ElementInfo ei;

	private ArrayLoadStatement(Object op, Method m) {
		super(op, m);
	}

	public ArrayLoadStatement(Method method, int index, Conditional value,  ElementInfo ei) {
		this(null, method);
		this.value = value;
		this.index = index;
		this.ei = ei;
	}
	
	private final Function<Object, String> f = val -> {
		if (ei.getArrayType().equals("C")) {
			return "0x" + String.format("%02x", val);
		}
		
		return val.toString();
	};
	
	@Override
	public String toString() {
		return "\"[" + ei.getArrayType() + " [" + index + "] : " + value.map(f) + '\"';
	}
}
