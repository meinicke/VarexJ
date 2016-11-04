package cmu.vatrace;

import java.io.PrintWriter;

import org.eclipse.jdt.annotation.NonNull;

public class Statement implements MethodElement {
	
	static int ID = 0;
	
	int id = ID++;
	Object op;
	Method m;

	public Statement(@NonNull Object op, Method m) {
		if (op == null) {
			System.out.println();
		}
		this.m = m;
		this.op = op;
	}
	
	@Override
	public String toString() {
		return "\"" + op.toString() + "-" +id + "\"";
	}

	@Override
	public void print(PrintWriter out) {
		out.println(this);
	}
}
