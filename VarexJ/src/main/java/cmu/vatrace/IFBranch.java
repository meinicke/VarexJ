package cmu.vatrace;

import java.io.PrintWriter;
import java.util.Map.Entry;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.jvm.bytecode.IfInstruction;

public class IFBranch extends Statement {

	private Conditional<Integer> targets;

	private IFBranch(Object op, Method m) {
		super(op, m);
	}
	
	public IFBranch(IfInstruction op, Method m, Conditional<Integer> targets) {
		super(op, m);
		this.targets = targets;
	}
	
	@Override
	public void printLabel(PrintWriter out) {
		out.print(getID());
		out.print("[label=\"");
		
		final FeatureExpr ctx = getTargetContext();
		out.print("if (" + Conditional.getCTXString(ctx));
		out.println(")\",shape=Mdiamond]");
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
}
