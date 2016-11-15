package cmu.vatrace;

import java.io.PrintWriter;

import cmu.vatrace.filters.StatementFilter;

public interface MethodElement {

	public void printLabel(PrintWriter pw);

	/**
	 * Removes all sub-elements that should not be shown in the trace.
	 * 
	 * @return true if the element should be removed itself. 
	 */
	boolean filterExecution(StatementFilter... statementFilter);
	
	public void addStatements(Trace trace);
	
	public int size();
}
