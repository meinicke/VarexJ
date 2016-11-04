package cmu.vatrace;

import java.io.PrintWriter;

import org.eclipse.jdt.annotation.NonNull;

public class Statement implements MethodElement {

	private static int ID = 0;

	private final int id = ID++;
	Object op;
	Method m;

	public Statement(@NonNull Object op, Method m) {
		this.m = m;
		this.op = op;
	}

	@Override
	public String toString() {
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
