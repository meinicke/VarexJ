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
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

public class FieldGetStatement extends VarexJStatement {

	private Conditional value;
	private FieldInfo fi;

	public FieldGetStatement(Instruction op, Conditional value, Method method, FieldInfo fi, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.fi = fi;
		this.value = value.mapf(ctx, f).simplify(ctx);
	}

	@Override
	public String toString() {
		return fi.getFullName();
	}
	
	@Override
	public boolean affectsIdentifier(String fieldName) {
		return fi.getName().equals(fieldName);
	}
	
	@Override
	public boolean affectsref(int ref) {
		if (fi.isReference()) {
			return value.toMap().containsKey(ref);
		}
		return false;
	}
	
	@Override
	public Conditional getValue() {
		return value;
	}
	
	@Override
	public boolean isInteraction(int degree) {
		return true;
	}
	
	@Override
	public boolean canBeRemoved() {
		if (fi.getName().contains("$assertionsDisabled")) {
			return true;
		}
		
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

	@Override
	protected Object getInfo() {
		return fi;
	}
}
