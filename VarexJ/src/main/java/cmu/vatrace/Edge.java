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
		if (previous == null) {
			pw.print(from.getID() + "->" + to.getID());
			return;
		}
		if (!previous.ctx.equals(ctx)) {
			if (!Conditional.isTautology(previous.ctx)) {
				previous.printLabel(pw);
			} else {
				pw.println();
			}
			pw.print(from.getID() + "->" + to.getID());
			return;
		} else {
			pw.print("->" + to.getID());
			return;
		}
	}

	public void printLabel(PrintWriter pw) {
		pw.println("[label=\"" + Conditional.getCTXString(ctx) + "\",color=\"red\"]");
	}

}
