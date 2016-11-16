package cmu.vatrace.filters;

import cmu.vatrace.ExceptionStatement;
import cmu.vatrace.Statement;

public class ExceptionFilter implements StatementFilter {

	@Override
	public boolean filter(Statement s) {
		return s instanceof ExceptionStatement;
	}
}
