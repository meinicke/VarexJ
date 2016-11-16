package cmu.vatrace.filters;

import cmu.vatrace.Statement;

public interface StatementFilter {
	
	/**
	 * @return true if the element fulfills the predicate.
	 */
	public boolean filter(Statement s);
	
}
