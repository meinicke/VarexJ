package cmu.vatrace.filters;

import cmu.vatrace.Statement;

public class InteractionFilter implements StatementFilter {

	@Override
	public boolean filter(Statement s) {
		return !s.isInteraction();
	}
}
