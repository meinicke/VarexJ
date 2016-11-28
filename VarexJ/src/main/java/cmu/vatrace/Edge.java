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

	private NodeColor color = NodeColor.black;
	private int width = 1;;
	
	public void setColor(NodeColor color) {
		this.color = color;
	}
	
	public void setWidth(int width) {
		this.width  = width;
	}
	
	public void print(PrintWriter pw, Edge previous) {
		if (previous == null) {
			pw.print(from.getID() + "->" + to.getID());
			return;
		}
		if (!previous.ctx.equals(ctx)) {
				previous.printLabel(pw);
			pw.print(from.getID() + "->" + to.getID());
			return;
		} else {
			pw.print("->" + to.getID());
			return;
		}
	}

	public void printLabel(PrintWriter pw) {
		pw.print("[penwidth=" + width + ",");
		if (!Conditional.isTautology(ctx)) {
			pw.print("label=\"" + Conditional.getCTXString(ctx) + "\",");
		}
		pw.println("color=\""+ color +"\"]");
	}

	public Statement getFrom() {
		return from;
	}
	
	public Statement getTo() {
		return to;
	}
	
	public FeatureExpr getCtx() {
		return ctx;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + from + " -> " + to;
	}
}
