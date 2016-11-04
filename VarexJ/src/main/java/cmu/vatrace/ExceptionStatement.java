package cmu.vatrace;

import java.io.PrintWriter;

import org.eclipse.jdt.annotation.NonNull;

public class ExceptionStatement extends Statement {
	
	private String cname;
	private String details;

	public ExceptionStatement(@NonNull Object op, Method m) {
		super(op, m);
	}
	
	public ExceptionStatement(String cname, String details, Method method) {
		this(null, method);
		this.cname = cname;
		this.details = details;
	}

	@Override
	public String toString() {
		if (details == null) {
			return "\"" + cname + "\"";
		}
		return "\"" + cname +": " + details + "\"";
	}
	
	@Override
	public void printLabel(PrintWriter out) {
		out.print(getID());
		out.print(" [label=");
		out.print(this);
		out.print(",color=firebrick1");
		out.println(']');
	}
	
}
