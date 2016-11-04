package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import gov.nasa.jpf.vm.MethodInfo;

public class Method implements MethodElement {

	private static int ID = 0;
	private final int id = ID++;
	
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
	
	public void printLabel(PrintWriter pw) {
		pw.println("subgraph \"cluster_" + TraceUtils.toShortID(id) + "\" {");
		for (MethodElement element : execution) {
			element.printLabel(pw);
		}
		pw.println("label = \"" + mi.getFullName() + "\";");
		pw.println("}");
	}

}
