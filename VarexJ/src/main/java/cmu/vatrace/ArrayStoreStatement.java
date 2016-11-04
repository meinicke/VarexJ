package cmu.vatrace;

import java.util.function.Function;

import cmu.conditional.Conditional;
import gov.nasa.jpf.vm.ElementInfo;

public class ArrayStoreStatement extends Statement {

	private Conditional<Object> oldValue;
	private Conditional<Object> newValue;
	private int index;
	private ElementInfo ei;

	private ArrayStoreStatement(Object op, Method m) {
		super(op, m);
	}

	public ArrayStoreStatement(Method method, int index, Conditional oldValue, Conditional newValue, ElementInfo ei) {
		this(null, method);
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.index = index;
		this.ei = ei;
	}
	
	private final Function<Object, String> f = val -> {
		if (ei.getArrayType().equals("C")) {
			return "0x" + String.format("%02x", (int)((Character)val).charValue());
		}
		
		return val.toString();
	};
	
	@Override
	public String toString() {
		return "\"[" + ei.getArrayType() + " [" + index + "] : " + oldValue.map(f) + " \u2192 " + newValue.map(f) + '\"';
	}
}
