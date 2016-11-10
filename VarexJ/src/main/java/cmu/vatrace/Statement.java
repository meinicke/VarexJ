package cmu.vatrace;

import java.io.PrintWriter;

import org.eclipse.jdt.annotation.NonNull;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.JPF;

public class Statement implements MethodElement {

	private static int ID = 0;

	private final int id = ID++;
	Object op;
	Method m;

	public Statement(@NonNull Object op, Method m, FeatureExpr ctx) {
		if (m != null) {
			m.addMethodElement(this);
		}
		this.m = m;
		this.op = op;
		JPF.vatrace.addStatement(ctx, this);
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
			out.print(",color=\"" + color + '\"');
		}
		if (shape != null) {
			out.print(",shape=" + shape);
		}
		out.println(']');
	}
	
	enum NodeColor {
		firebrick1, red, tomato
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

}
