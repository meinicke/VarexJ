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
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.ThreadInfo;

public class LocalGetStatement extends Statement {

	private Conditional<String> value;
	private LocalVarInfo li;

	public LocalGetStatement(Instruction op, Conditional<Integer> value, Method method,LocalVarInfo li, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.li = li;
		this.value = value.mapf(method.getCTX(), f).simplify(ctx);
	}

	// TODO remove code clone
	private final BiFunction<FeatureExpr, Integer, Conditional<String>> f = (ctx, val) -> {
		if (Conditional.isContradiction(ctx)) {
			return new One<>("");
		}
		if (li.isBoolean()) {
			return new One<>(Boolean.toString((Integer) val == 1));
		}
		if (li.getType().equals("char")) {
			if (Character.isJavaIdentifierPart((Integer)val)) {
				return new One<>(val.toString());
			}
			return new One<>("0x" + String.format("%02x", ((Integer)val)));
		}

		if (!li.isNumeric()) {
			if ((Integer) val == 0) {
				return new One<>("null");
			}
			ElementInfo ei = ThreadInfo.getCurrentThread().getEnv().getElementInfo((Integer) val);
			if (ei == null) {
				return new One<>("null @" + val);// should never happen
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
				});
			}
			return new One<>('@' + val.toString());
		}
		return new One<>(val.toString());
	};
	
	@Override
	public String toString() {
		return li.getType() + ' ' + li.getName();
	}
	
	@Override
	public boolean affectsref(int ref) {
		if (!li.isNumeric() && !li.isBoolean()) {
			return value.toMap().containsKey(ref);
		}
		return false;
	}
	
	@Override
	public boolean affectsIdentifier(String identifier) {
		return li.getName().equals(identifier);
	}
	
	@Override
	public Conditional<?> getValue() {
		return value;
	}
	
	@Override
	public boolean isInteraction(int degree) {
		return true;
	}
	
	@Override
	public boolean canBeRemoved() {
		Collection<MethodElement<?>> instructions = getParent().getChildren();
		Iterator<MethodElement<?>> iterator = instructions.iterator();
		
		// scroll to this instruction
		while (iterator.next() != this);
		if (!iterator.hasNext()) {
			return true;
		}
		
		final Instruction instruction = (Instruction) getContent();
		final int index = instruction.getInstructionIndex();
				
		// scroll to next if statement
		MethodElement<?> statement = iterator.next();
		while (!(statement instanceof IFStatement) && !(statement instanceof ExceptionStatement)) {
			final Object otherContent = statement.getContent();
			if (otherContent instanceof Instruction) {
				final int otherIndex = ((Instruction) otherContent).getInstructionIndex();
				if (otherIndex <= index) {
					return true;
				}
			}		
			if (!iterator.hasNext()) {
				return true;
			}
			
			statement = iterator.next();
		}
		// check if line is the same
		return statement.getLineNumber() != lineNumber;
	}
}
