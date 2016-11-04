package cmu.vatrace;

import java.io.PrintWriter;

public class IFBranch extends Method {

	private String name;

	public IFBranch(String name) {
		super();
		this.name = name;
	}
	
	public void print(PrintWriter pw) {
		pw.println("subgraph \"cluster_" + name + "\" {");
		for (MethodElement element : execution) {
			element.print(pw);
		}
		pw.println("label = \"" + name + "\";");
		pw.println("color = red;");
		pw.println("}");
	}
}
