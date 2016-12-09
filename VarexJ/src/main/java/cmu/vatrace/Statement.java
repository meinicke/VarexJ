package cmu.vatrace;

import java.io.PrintWriter;

import cmu.conditional.Conditional;
import cmu.vatrace.filters.StatementFilter;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class Statement implements MethodElement {

	private static int ID = 0;

	private final int id = ID++;
	Instruction op;
	Method m;

	private final FeatureExpr ctx;
	
	@Override
	public FeatureExpr getCTX() {
		return ctx;
	}

	public Statement(Instruction op, Method m, FeatureExpr ctx) {
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
	
	public int getWidth() {
		return width;
	}

	private Shape shape = null;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
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
	
	public NodeColor getColor() {
		return color;
	}
	
	public Instruction getInstruction() {
		return op;
	}
	
	public Method getMethod() {
		return m;
	}
	
	public Conditional<String> getOldValue() {
		return null;
	}
	
	public Conditional<String> getValue() {
		return null;
	}
}
