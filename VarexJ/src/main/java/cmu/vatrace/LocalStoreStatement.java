package cmu.vatrace;

import java.io.PrintWriter;
import java.util.function.Function;

import cmu.conditional.Conditional;
import gov.nasa.jpf.vm.LocalVarInfo;

public class LocalStoreStatement extends Statement {

	private Conditional<Integer> oldValue;
	private Conditional<Integer> newValue;
	private LocalVarInfo li;

	private LocalStoreStatement(Object op, Method m) {
		super(op, m);
	}

	public LocalStoreStatement(Method method, Conditional<Integer> oldValue, Conditional<Integer> newValue, LocalVarInfo li) {
		this(null, method);
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.li = li;
	}
	
	private final Function<Integer, String> f = val -> {
		if (li.isBoolean()) {
			return Boolean.toString(val == 1);
		}
		if (!li.isNumeric()) {
			if (val == 0) {
				return "null";
			}
			return '@' + val.toString();
		}
		return val.toString();
	};
	
	@Override
	public String toString() {
		if (li == null) {
			return "\"set unknown: " + oldValue + " \u2192 " + newValue + '\"';
		}
		return "\"" + li.getType() + " " + li.getName() + ": " + oldValue.map(f) + " \u2192 " + newValue.map(f) + '\"';
	}
	
	@Override
	public void printLabel(PrintWriter out) {
		if (oldValue.equals(newValue)) {
			out.print(getID());// TODO dont create this node
			out.print("[label=X]");
			return; 
		}
		super.printLabel(out);
	}
}