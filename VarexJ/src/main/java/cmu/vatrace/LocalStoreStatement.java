package cmu.vatrace;

import java.util.function.BiFunction;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class LocalStoreStatement extends Statement {

	private Conditional oldValue;
	private Conditional newValue;
	private LocalVarInfo li;

	public LocalStoreStatement(Instruction op, Method method, Conditional oldValue, Conditional newValue, LocalVarInfo li, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.li = li;
		if (oldValue != null) {
			this.oldValue = oldValue.simplify(method.getCTX());
			this.oldValue = this.oldValue.mapf(method.getCTX(), f).simplify(method.getCTX());
		}
		
		this.newValue = newValue.simplify(method.getCTX());
		this.newValue = this.newValue.mapf(method.getCTX(), f).simplify(method.getCTX());
		
	}

	private final BiFunction<FeatureExpr, Object, Conditional<String>> f = (ctx, val) -> {
		if (Conditional.isContradiction(ctx)) {
			return new One<>("");
		}
		if (li.isBoolean()) {
			return new One<>(Boolean.toString((Integer) val == 1));
		}
		if (li.getType().equals("char")) {
			if (Character.isJavaIdentifierPart((Character)val)) {
				return new One<>(val.toString());
			}
			return new One<>("0x" + String.format("%02x", ((Integer)val)));
		}

		if (!li.isNumeric()) {
			if ((Integer) val == 0) {
				return new One<>("null");
			}
			ElementInfo ei = ThreadInfo.getCurrentThread().getEnv().getElementInfo((Integer) val);// TODO this is affected by garbage collection 
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
				});
			}
			return new One<>('@' + val.toString());
		}
		return new One<>(val.toString());
	};

	@Override
	public String toString() {
		if (li == null) {
			return "set unknown: ";
		}
		// if (oldValue == null) {
		// return li.getType() + " " + li.getName() + " \u2192 " +
		// newValue.map(f);
		// }

		return li.getType() + " " + li.getName() + ":";
	}

	@Override
	public boolean affectsIdentifier(String identifier) {
		return li == null ? false : li.getName().equals(identifier);
	}

	@Override
	public boolean isInteraction(int degree) {
		if (oldValue != null) {
			if (newValue.toMap().size() >= degree) {
				return true;
			}
			if (Math.abs(oldValue.toMap().size() - newValue.toMap().size()) >= degree - 1) {
				return true;
			}
		}
		return false;
//		return oldValue != null && /*oldValue.toMap().size() != newValue.toMap().size() &&*/ newValue.toMap().size() >= degree;
	}

	@Override
	public Conditional<String> getOldValue() {
		if (oldValue == null) {
			return new One<>("null");
		}
		return oldValue;
	}

	@Override
	public Conditional<String> getValue() {
		return newValue;
	}
}