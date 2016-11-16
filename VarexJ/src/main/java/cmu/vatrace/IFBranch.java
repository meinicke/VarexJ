package cmu.vatrace;

import java.util.Map.Entry;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.jvm.bytecode.IfInstruction;

public class IFBranch extends Statement {

	private Conditional<Integer> targets;

	private IFBranch(Object op, Method m, FeatureExpr ctx) {
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
		return "?";
//		return "if (" + Conditional.getCTXString(getTargetContext()) + ')';
	}

	private FeatureExpr getTargetContext() {
		int min = Integer.MAX_VALUE;
		FeatureExpr ctx = FeatureExprFactory.True();
		for (Entry<Integer, FeatureExpr> e : targets.toMap().entrySet()) {
			if (e.getKey() < min) {
				min = e.getKey();
				ctx = e.getValue();
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
}
