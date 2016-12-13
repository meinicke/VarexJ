package cmu.vatrace;

import java.util.Map.Entry;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import cmu.varviz.trace.Shape;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.jvm.bytecode.IfInstruction;
import gov.nasa.jpf.vm.Instruction;

public class IFBranch extends Statement {

	private Conditional<Integer> targets;

	private IFBranch(Instruction op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}
	
	public IFBranch(IfInstruction op, Method m, Conditional<Integer> targets, FeatureExpr ctx) {
		this(op, m, ctx);
		this.targets = targets;
		setShape(Shape.Mdiamond);
		setColor(NodeColor.white);
	}
		
	@Override
	public String toString() {
		return "if (" + Conditional.getCTXString(getTargetContext()) + ')';
	}

	private FeatureExpr getTargetContext() {
		int minPc = Integer.MAX_VALUE;
		FeatureExpr ctx = null;
		for (Entry<Integer, FeatureExpr> entry : targets.toMap().entrySet()) {
			int pc = entry.getKey();
			if (pc < minPc) {
				ctx = entry.getValue();
				minPc = pc;
			}
		}
		return ctx;
	}

	@Override
	public boolean affectsIdentifier(String identifier) {
		return true;
	}
	
	@Override
	public boolean affectsref(int ref) {
		return true;
	}
	
	@Override
	public boolean isInteraction(int degree) {
		return true;
	}
	
	public Conditional<Integer> getTargets() {
		return targets;
	}
	
}
