package cmu.vatrace.filters;

import cmu.vatrace.Statement;

public interface StatementFilter {
	
	public boolean filter(Statement s);
	
}
