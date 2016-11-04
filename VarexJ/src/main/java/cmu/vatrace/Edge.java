package cmu.vatrace;

import java.io.PrintWriter;

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
		StringBuilder edge = new StringBuilder(); 
		edge.append(from.getID()).append("->").append(to.getID());
		if (!Conditional.isTautology(ctx)) {
			edge.append("[label=\"").append(Conditional.getCTXString(ctx)).append("\"");
			edge.append(",color=\"red\"").append("]\n");
		}
		return edge.toString();
	}
	
	public void print(PrintWriter pw, Edge previous) {
		StringBuilder edge = new StringBuilder(); 
		if (previous == null || previous.hasLabel()) {
			edge.append(from.getID());
		} else {
			if (previous.to != from) {
				pw.println();
				edge.append(from.getID());
			}	
		}
			
		edge.append("->").append(to.getID());
		if (!Conditional.isTautology(ctx)) {
			edge.append("[label=\"").append(Conditional.getCTXString(ctx)).append("\"");
			edge.append(",color=\"red\"").append("]");
			pw.println(edge);
		} else {
			pw.print(edge);
		}
	}

	private boolean hasLabel() {
		return !Conditional.isTautology(ctx);
	}
}
