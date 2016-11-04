package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import gov.nasa.jpf.vm.MethodInfo;

public class Method implements MethodElement {

	List<MethodElement> execution = new ArrayList<>();
	MethodInfo mi;
	
	public Method() {
		this.mi = null;
	}
	
	public Method(MethodInfo mi) {
		this.mi = mi;
	}
	
	public void addMethodElement(MethodElement e) {
		if (e instanceof Method) {
			Method m = (Method)e;
			if (m.mi.getClassName().startsWith("java.") ||
					m.mi.getClassName().startsWith("java.") ||
					m.mi.getClassName().startsWith("sun.") || 
					m.mi.getClassName().startsWith("gov.")) {
				return;
			}
		}
		execution.add(e);
	}

	public void print(PrintWriter pw) {
		pw.println("subgraph \"cluster_" + mi.getName() + "\" {");
		for (MethodElement element : execution) {
			element.print(pw);
		}
		pw.println("label = \"" + mi.getName() + "\";");
		pw.println("}");
	}
}
