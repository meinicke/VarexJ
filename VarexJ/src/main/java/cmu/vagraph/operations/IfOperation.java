package cmu.vagraph.operations;

import cmu.conditional.Conditional;
import cmu.vagraph.GraphOperation;
import cmu.vagraph.VANode;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.jvm.bytecode.IfInstruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;

public class IfOperation extends VANode {

	private Conditional<Integer> condition;

	public IfOperation(MethodInfo callee, FeatureExpr ctx) {
		super(callee, ctx);
	}

	public IfOperation(VANode parent, FeatureExpr ctx, IfInstruction ifInstruction, Conditional<Integer> targets) {
		super(parent.methodInfo, ctx);
		this.setInstruction(ifInstruction);
		this.condition = targets;
		this.parent = parent;
	}

	@Override
	public void print(int depth, String... filter) {
		String output = depth + "\t" + new String(new char[depth]) + "if " + Conditional.getCTXString(ctx)+ " " + instruction.getClass().getSimpleName();
		System.out.println(output + "\t" + getEclipseConsoleLink() + " " + condition);
		for (GraphOperation vaNode : operations) {
			vaNode.print(depth + 1, filter);
		}
	}
	
	@Override
	public String toString() {
		return instruction.getClass().getSimpleName() + " " + super.toString();
	}

	@Override
	public void addOperation(Operation op, StackFrame frame) {
		if (op.instruction.getPosition() >= condition.simplify(op.ctx.not()).getValue(true)) {
			frame.node = parent;
			parent.addOperation(op, frame);
			return;
		}
		
		super.addOperation(op, frame);
	}
	
	@Override
	protected VANode getSimpleClone(VANode parent) {
		return new IfOperation(parent, ctx, (IfInstruction) instruction, condition);
	}

	@Override
	public String toGraphString() {
		return "if " + condition;
	}
}
