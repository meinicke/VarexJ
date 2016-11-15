package cmu.vatrace.filters;

import cmu.conditional.Conditional;
import cmu.vatrace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class ContextFilter implements StatementFilter {
	
	private final FeatureExpr ctx;

	public ContextFilter(FeatureExpr ctx) {
		this.ctx = ctx;
	}
	
	public boolean filter(Statement s) {
		return Conditional.isContradiction(s.getCtx().and(ctx));
	}
	
}
