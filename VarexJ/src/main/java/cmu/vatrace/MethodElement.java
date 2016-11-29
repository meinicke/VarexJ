package cmu.vatrace;

import java.io.PrintWriter;

import cmu.vatrace.filters.StatementFilter;
import de.fosd.typechef.featureexpr.FeatureExpr;

public interface MethodElement {

	public void printLabel(PrintWriter pw);

	/**
	 * Keeps only elements that fulfill the filter and<br>
	 * removes all sub-elements that should not be shown in the trace.
	 * 
	 * @return false if the element should be removed. 
	 */
	boolean filterExecution(StatementFilter statementFilter);
	
	public void addStatements(Trace trace);
	
	public int size();
	
	public FeatureExpr getCTX();
}
