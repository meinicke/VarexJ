package gov.nasa.jpf.jvm.bytecode.extended;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class Choice<T> extends Conditional<T> {

	private Conditional<T> thenBranch;
	private Conditional<T> elseBranch;
	private FeatureExpr featureExpr;;

	public Choice(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		this.featureExpr = featureExpr;
		this.thenBranch = thenBranch;
		this.elseBranch = elseBranch;
	}

	@Override
	public <U> Conditional<U> mapfr(FeatureExpr inFeature,
			BiFunction<FeatureExpr, T, Conditional<U>> f) {
		Conditional<U> newResultA = thenBranch.mapfr(inFeature.and(featureExpr), f);
		Conditional<U> newResultB = elseBranch.mapfr(inFeature.and(featureExpr.not()), f);
		return new Choice<>((featureExpr), newResultA, newResultB);
		
	}

	@Override
	protected Conditional<T> simplify(FeatureExpr ctx) {
		if ((ctx.and(featureExpr)).isContradiction()) {
			return elseBranch.simplify(ctx.andNot(featureExpr));
		}
		if ((ctx.andNot(featureExpr)).isContradiction()) {
			return thenBranch.simplify(ctx.and(featureExpr));
		}

		final Conditional<T> eb = elseBranch.simplify(ctx.andNot(featureExpr));
		final Conditional<T> tb = thenBranch.simplify(ctx.and(featureExpr));
		if (tb.equals(eb)) {
			return tb;
		}
		return new Choice<>((featureExpr), tb, eb);
	}
	
	@Override
	public String toString() {
		return "Choice(" + featureExpr + ", " + thenBranch + ", " + elseBranch + ")";
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Choice) {
			Choice<T> c = (Choice<T>)obj;
			return c.featureExpr.equivalentTo(featureExpr) &&
				   c.thenBranch.equals(thenBranch) &&
				   c.elseBranch.equals(elseBranch);
		}
		return false;
	}

	@Override
	public T getValue() {
		System.out.println("___________________________________________________");
		System.out.println("Get value of choice called: " + toString());
		for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
			System.out.println(e);
		}
		System.out.println("---------------------------------------------------");
		return thenBranch.getValue();
//		throw new RuntimeException("Get value of choice called");
	}
}