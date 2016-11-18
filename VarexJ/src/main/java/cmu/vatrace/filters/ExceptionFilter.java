package cmu.vatrace.filters;

import cmu.vatrace.ExceptionStatement;
import cmu.vatrace.Statement;

public class ExceptionFilter implements StatementFilter {

	private final String exceptionName;

	public ExceptionFilter(String exceptionName) {
		this.exceptionName = exceptionName;
	}
	
	public ExceptionFilter() {
		this.exceptionName = null;
	}
	
	@Override
	public boolean filter(Statement s) {
		if (s instanceof ExceptionStatement) {
			if (exceptionName == null) {
				return false;
			}
			if (((ExceptionStatement)s).cname.contains(exceptionName)) {
				return false;
			}
			return true;
		}
		return false;  
	}
}
