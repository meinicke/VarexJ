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
		if (op == null) {
			System.out.println();
		}
		this.m = m;
		this.op = op;
		JPF.vatrace.addStatement(ctx, this);
	}

	@Override
	public String toString() {
		if (op == null) {
			System.out.println();
		}
		return "\"" + op.toString() + "\"";
	}

	@Override
	public void printLabel(PrintWriter out) {
		out.print(getID());
		out.print("[label=");
		out.print(this);
		out.println(']');
	}

	public String getID() {
		return TraceUtils.toShortID(id);
	}

}
