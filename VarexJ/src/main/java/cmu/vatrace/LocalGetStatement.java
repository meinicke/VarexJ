package cmu.vatrace;

import java.util.Collection;
import java.util.Iterator;

import cmu.conditional.Conditional;
import cmu.varviz.trace.IFStatement;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.MethodElement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;

public class LocalGetStatement extends VarexJStatement {

	private Conditional<String> value;
	private LocalVarInfo li;

	public LocalGetStatement(Instruction op, Conditional value, Method method,LocalVarInfo li, FeatureExpr ctx) {
		super(op, method, op.getLineNumber(), ctx);
		this.li = li;
		this.value = value.mapf(method.getCTX(), f).simplify(ctx);
	}
	
	@Override
	public String toString() {
		String type = li.getType();
		if (type.contains(".")) {
			type = type.substring(type.lastIndexOf('.') + 1);
		}
		return type + " " + li.getName();
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

	@Override
	protected Object getInfo() {
		return li;
	}
}
