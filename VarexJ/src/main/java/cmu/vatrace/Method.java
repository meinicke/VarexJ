package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import cmu.vatrace.filters.StatementFilter;
import gov.nasa.jpf.vm.MethodInfo;

public class Method implements MethodElement {

	private static int ID = 0;
	private final int id = ID++;
	
	private final List<MethodElement> execution = new ArrayList<>();
	MethodInfo mi;
	
	public Method(MethodInfo mi) {
		this.mi = mi;
	}
	
	public void addMethodElement(MethodElement e) {
		execution.add(e);
	}
	
	public boolean filterExecution(StatementFilter... filter) {
		execution.removeIf(e -> e.filterExecution(filter));
		return execution.isEmpty();
	}
	
	public void printLabel(PrintWriter pw) {
		pw.println("subgraph \"cluster_" + TraceUtils.toShortID(id) + "\" {");
		pw.println("label = \"" + mi.getFullName() + "\";");
		execution.forEach(e -> e.printLabel(pw));
		pw.println("}");
	}

	public void traverseStatements(Trace trace) {
		execution.forEach(e -> e.traverseStatements(trace));
	}
	
	@Override
	public String toString() {
		return mi.getName();
	}

	@Override
	public int size() {
		int size = 0;
		for (MethodElement methodElement : execution) {
			size += methodElement.size();
		}
		return size;
	}

}
