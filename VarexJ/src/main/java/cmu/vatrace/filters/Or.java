package cmu.vatrace.filters;

import cmu.vatrace.Statement;

public class Or implements StatementFilter {

	private final StatementFilter[] filter;
	public Or(StatementFilter... filter) {
		this.filter = filter;
	}
	
	@Override
	public boolean filter(Statement s) {
		for (StatementFilter f : filter) {
			if (!f.filter(s)) {
				return false;
			}
		}
		return true;
	}
}
