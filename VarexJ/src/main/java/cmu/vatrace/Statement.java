package cmu.vatrace;

import java.io.PrintWriter;

import org.eclipse.jdt.annotation.NonNull;

import cmu.vatrace.filters.StatementFilter;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class Statement implements MethodElement {

	private static int ID = 0;

	private final int id = ID++;
	Object op;
	Method m;

	private final FeatureExpr ctx;
	
	@Override
	public FeatureExpr getCTX() {
		return ctx;
	}

	public Statement(@NonNull Object op, Method m, FeatureExpr ctx) {
		if (m != null) {
			m.addMethodElement(this);
		}
		this.ctx = ctx;
		this.m = m;
		this.op = op;
	}

	@Override
	public String toString() {
		return op.toString();
	}

	@Override
	public final void printLabel(PrintWriter out) {
		out.print(getID());
		out.print("[penwidth=" + width);
		out.print(",label=");
		out.print("\"" + this + "\"");
		if (color != null) {
			if (color == NodeColor.white) {
				out.print(",fillcolor=\"" + color + '\"');
			} else {
				out.print(",color=\"" + color + '\"');
			}
		}
		if (shape != null) {
			out.print(",shape=" + shape);
		}
		out.println(']');
	}

	private NodeColor color = null;

	private int width = 1;

	void setColor(NodeColor color) {
		this.color = color;
	}

	public void setWidth(int width) {
		this.width = Math.max(1, width);
	}

	enum Shape {
		Mdiamond, Msquare
	}

	private Shape shape = null;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String getID() {
		return TraceUtils.toShortID(id);
	}

	@Override
	public boolean filterExecution(StatementFilter filter) {
		return filter.filter(this);
	}

	@Override
	public void addStatements(Trace trace) {
		trace.addStatement(this);
	}

	public boolean affectsIdentifier(String identifier) {
		return false;
	}

	public boolean affectsref(int ref) {
		return false;
	}

	public boolean isInteraction(int degree) {
		return false;
	}

	@Override
	public int size() {
		return 1;
	}
}
