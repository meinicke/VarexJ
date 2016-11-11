package cmu.vatrace;

import java.io.PrintWriter;

import org.eclipse.jdt.annotation.NonNull;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class Statement implements MethodElement {

	private static int ID = 0;

	private final int id = ID++;
	Object op;
	Method m;

	private final FeatureExpr ctx;
	
	public FeatureExpr getCtx() {
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
		out.print("[label=");
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
	
	enum NodeColor {
		firebrick1, red, tomato, limegreen, white, black
	}
	
	private NodeColor color = null;
	
	void setColor(NodeColor color) {
		this.color = color;
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
	public boolean filterExecution() {
		return color == null || color == NodeColor.white;
	}

	@Override
	public void traverseStatements(Trace trace) {
		trace.addStatement(this);
	}
	
}
