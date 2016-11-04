package cmu.vatrace;

import org.eclipse.jdt.annotation.NonNull;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class Edge {

	FeatureExpr ctx;
	Statement from, to;

	public Edge(@NonNull FeatureExpr ctx, @NonNull Statement from, @NonNull Statement to) {
		this.ctx = ctx;
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString() {
		if (from == null) {
			System.out.println();
		}
		if (to == null) {
			System.out.println();
		}
		StringBuilder edge = new StringBuilder(); 
		edge.append(from.getID()).append(" -> ").append(to.getID());
		if (!Conditional.isTautology(ctx)) {
			edge.append(" [label=\"").append(Conditional.getCTXString(ctx)).append("\"");
			edge.append(", color=\"red\"").append("]");
		}
		return edge.toString();
	}
}
