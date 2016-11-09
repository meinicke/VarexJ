package cmu.vatrace;

import java.util.function.Function;

import org.eclipse.jdt.annotation.NonNull;

import cmu.conditional.Conditional;
import gov.nasa.jpf.vm.LocalVarInfo;

public class LocalGetStatement extends Statement {

	private Conditional<Integer> value;
	private LocalVarInfo li;

	private LocalGetStatement(@NonNull Object op, Method m) {
		super(op, m);
	}

	public LocalGetStatement(Conditional<Integer> value, Method method,LocalVarInfo li) {
		this(null, method);
		this.value = value;
		this.li = li;
	}

	// TODO remove code clone
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
		Conditional<String> valueString = value.map(f);
		return "\"" + li.getType() + ' ' + li.getName() + ": " + valueString + '\"';
	}
}
