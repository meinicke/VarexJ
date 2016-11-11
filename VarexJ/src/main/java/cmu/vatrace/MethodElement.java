package cmu.vatrace;

import java.io.PrintWriter;

public interface MethodElement {

	public void printLabel(PrintWriter pw);

	/**
	 * Removes all sub-elements that should not be shown in the trace.
	 * 
	 * @return true if the element should be removed itself. 
	 */
	boolean filterExecution();
	
	public void traverseStatements(Trace trace);
}
