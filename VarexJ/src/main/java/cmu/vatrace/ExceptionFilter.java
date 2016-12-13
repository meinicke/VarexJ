package cmu.vatrace;

import cmu.varviz.trace.Statement;
import cmu.varviz.trace.filters.StatementFilter;

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
				return true;
			}
			if (((ExceptionStatement)s).cname.contains(exceptionName)) {
				return false;
			}
			return true;
		}
		return false;  
	}
}
