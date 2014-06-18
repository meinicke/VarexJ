package gov.nasa.jpf.jvm.bytecode.extended;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.bdd.SatSolver;

public class Choice<T> extends Conditional<T> {

	private Conditional<T> thenBranch;
	private Conditional<T> elseBranch;
	private FeatureExpr featureExpr;

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
	public Conditional<T> simplify(FeatureExpr ctx) {
		if ((ctx.and(featureExpr)).isContradiction()) {
			return elseBranch.simplify(ctx.andNot(featureExpr));
		}
		if ((ctx.andNot(featureExpr)).isContradiction()) {
			return thenBranch.simplify(ctx.and(featureExpr));
		}

		final Conditional<T> tb = thenBranch == null ? null : thenBranch.simplify(ctx.and(featureExpr));
		final Conditional<T> eb = elseBranch == null ? null : elseBranch.simplify(ctx.andNot(featureExpr));
		
		if (tb.equals(eb)) {
			return tb;
		}
		
		
		// TODO revise, causes huge formulas
//		if (tb instanceof One)             {
//			if (eb instanceof Choice) {
//				if (((Choice<T>) eb).thenBranch.equals(tb)) {
//					return new Choice<>(featureExpr.or(((Choice<T>) eb).featureExpr), tb, ((Choice<T>) eb).elseBranch);
//				}
//				if (((Choice<T>) eb).elseBranch.equals(tb)) {
//					return new Choice<>(featureExpr.orNot(((Choice<T>) eb).featureExpr), tb, ((Choice<T>) eb).thenBranch);
//				}
//			}
//		}
//		if (eb instanceof One) {
//			if (tb instanceof Choice) {
//				if (((Choice<T>) tb).thenBranch.equals(eb)) {
//					return new Choice<>(featureExpr.andNot(((Choice<T>) tb).featureExpr), ((Choice<T>) tb).elseBranch, eb);
//				}
//				if (((Choice<T>) tb).elseBranch.equals(eb)) {
//					return new Choice<>(featureExpr.and(((Choice<T>) tb).featureExpr), ((Choice<T>) tb).thenBranch, eb);
//				}
//			}
//		}
		
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
//		System.out.println("___________________________________________________");
//		System.out.println("Get value of choice called: " + toString());
//		for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
//			System.out.println(e);
//		}
//		System.out.println("---------------------------------------------------");
//		return thenBranch.getValue();
		throw new RuntimeException("Get value of choice called: " +  toString());
	}
	
	@Override
	public T getValue(boolean ignore) {
		if (ignore) {
			return thenBranch.getValue(ignore);
		}
		return getValue();
	}

	@Override
	public List<T> toList() {
		List<T> list = new LinkedList<>();
		list.addAll(thenBranch.toList());
		list.addAll(elseBranch.toList());
		return list;
	}

	@Override
	protected void toMap(FeatureExpr ctx, Map<T, FeatureExpr> map) {
		thenBranch.toMap(ctx.and(featureExpr), map);
		elseBranch.toMap(ctx.andNot(featureExpr), map);
	}
	
}