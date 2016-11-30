package cmu.vatrace.filters;

import cmu.vatrace.Statement;

public class ReferenceFilter implements StatementFilter {

	private final int ref;

	public ReferenceFilter(int ref) {
		this.ref = ref;
	}

	@Override
	public boolean filter(Statement s) {
		return s.affectsref(ref);
	}
}
