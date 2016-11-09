package cmu.vatrace;

import java.io.PrintWriter;
import java.util.function.Function;

import cmu.conditional.Conditional;
import gov.nasa.jpf.vm.Types;

public class ReturnStatement extends Statement {

	private Conditional<Integer> returnValue;

	private ReturnStatement(Object op, Method m) {
		super(op, m);
	}

	public ReturnStatement(Method method, Conditional<Integer> returnValue) {
		this(null, method);
		this.returnValue = returnValue;
	}
	
	private final Function<Integer, String> f = val -> {
		switch (m.mi.getReturnType()) {
			case "Z":
				return Boolean.toString(val == 1);
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		return "\"return " + Types.getTypeName(m.mi.getReturnType()) + " " + returnValue.map(f) + '\"';
	}
	
	@Override
	public void printLabel(PrintWriter out) {
		out.print(getID());
		out.print("[label=");
		out.print(this);
		if (returnValue.toMap().size() > 1) {
			out.print(", color=tomato");
		}
		out.println(']');
	}
	
}