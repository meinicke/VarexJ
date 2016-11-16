package cmu.vatrace.filters;

import cmu.vatrace.Statement;

public class NameFilter implements StatementFilter {

	private final String name[];
	
	public NameFilter(String... name) {
		this.name = name;
	}

	@Override
	public boolean filter(Statement s) {
		for (String n : name) {
			if (s.affectsIdentifier(n)) {
				return true;
			}
		}
		return false;
	}
}
