package cmu.vatrace.filters;

import cmu.vatrace.Statement;

public class And implements StatementFilter {

	private final StatementFilter[] filter;
	public And(StatementFilter... filter) {
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
