package cmu.conditional;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class Choice<T> extends Conditional<T> implements Cloneable {

	private Conditional<T> thenBranch;
	private Conditional<T> elseBranch;
	private FeatureExpr featureExpr;

	public Choice(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		if (featureExpr == null) {
			throw new RuntimeException("ctx = null");
		}
		this.featureExpr = featureExpr;
		this.thenBranch = thenBranch;
		this.elseBranch = elseBranch;
	}

	@Override
	public <U> Conditional<U> mapfr(FeatureExpr inFeature, BiFunction<FeatureExpr, T, Conditional<U>> f) {
		if (inFeature == null) {
			Conditional<U> newResultA = thenBranch.mapfr(null, f);
			Conditional<U> newResultB = elseBranch.mapfr(null, f);
			return new Choice<>(featureExpr, newResultA, newResultB);
		}

		Conditional<U> newResultA = thenBranch.mapfr(inFeature.and(featureExpr), f);
		Conditional<U> newResultB = elseBranch.mapfr(inFeature.and(featureExpr.not()), f);
		return new Choice<>(featureExpr, newResultA, newResultB);

	}

	@Override
	public Conditional<T> simplify(FeatureExpr ctx) {
		if (ctx == null) {
			throw new RuntimeException("ctx == null");
		}

		FeatureExpr and = ctx.and(featureExpr);
		if (isContradiction(and)) {
			return elseBranch.simplify(ctx.andNot(featureExpr));
		}

		FeatureExpr andNot = ctx.andNot(featureExpr);
		if (isContradiction(andNot)) {
			return thenBranch.simplify(and);
		}

		final Conditional<T> tb = thenBranch.simplify(and);
		final Conditional<T> eb = elseBranch.simplify(andNot);

		if (tb.equals(eb)) {
			return tb;
		}

		// TODO somehow causes errors (see BankAccount test)
		
		if (tb instanceof One) {
			if (eb instanceof Choice) {
				if (((Choice<T>) eb).elseBranch instanceof One && ((Choice<T>) eb).thenBranch instanceof One) {// TODO remove
					if (((Choice<T>) eb).thenBranch.equals(tb)) {
						return new Choice<>(featureExpr.or(featureExpr.not().and(((Choice<T>) eb).featureExpr)), tb, ((Choice<T>) eb).elseBranch);
					}
					if (((Choice<T>) eb).elseBranch.equals(tb)) {
						return new Choice<>(featureExpr.or(featureExpr.not().and(((Choice<T>) eb).featureExpr.not())), tb, ((Choice<T>) eb).thenBranch);
					}
				}
			}
		}
		if (eb instanceof One) {
			if (tb instanceof Choice) {
				if (((Choice<T>) tb).elseBranch instanceof One && ((Choice<T>) tb).thenBranch instanceof One) {// TODO remove
					if (((Choice<T>) tb).thenBranch.equals(eb)) {
						return new Choice<>(featureExpr.not().or(featureExpr.and(((Choice<T>) tb).featureExpr)), eb, ((Choice<T>) tb).elseBranch);
					}
					if (((Choice<T>) tb).elseBranch.equals(eb)) {
						return new Choice<>(featureExpr.not().or(featureExpr.and(((Choice<T>) tb).featureExpr.not())), eb, ((Choice<T>) tb).thenBranch);
					}
				}
			}
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
			Choice<T> c = (Choice<T>) obj;
			return c.thenBranch.equals(thenBranch) && c.elseBranch.equals(elseBranch) && c.featureExpr.equivalentTo(featureExpr);
		}
		return false;
	}

	public int hashCode() {
		throw new RuntimeException("hashCode not designed");
	}

	@Override
	public T getValue() {
		// System.out.println("___________________________________________________");
		// System.out.println("Get value of choice called: " + toList());
		// for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
		// System.out.println(e);
		// }
		// System.out.println("---------------------------------------------------");
		// return thenBranch.getValue(true);
		throw new RuntimeException("Get value of choice called: " + toString());
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
		for (T e : thenBranch.toList()) {
			if (!list.contains(e)) {
				list.add(e);
			}
		}
		
		for (T e : elseBranch.toList()) {
			if (!list.contains(e)) {
				list.add(e);
			}
		}
		return list;
	}

	@Override
	protected void toMap(FeatureExpr ctx, Map<T, FeatureExpr> map) {
		thenBranch.toMap(ctx.and(featureExpr), map);
		elseBranch.toMap(ctx.andNot(featureExpr), map);
	}

	@Override
	public Conditional<T> clone() throws CloneNotSupportedException {
		return new Choice<>(featureExpr, thenBranch.clone(), elseBranch.clone());
	}

	@Override
	public Conditional<T> simplifyValues() {
		final Conditional<T> tb = thenBranch.simplifyValues();
		final Conditional<T> eb = elseBranch.simplifyValues();

		if (tb.equals(eb)) {
			return tb;
		}
		
		// TODO somehow causes errors (see BankAccount test)
		if (tb instanceof One) {
			if (eb instanceof Choice) {
				if (((Choice<T>) eb).elseBranch instanceof One && ((Choice<T>) eb).thenBranch instanceof One) {// TODO remove
					if (((Choice<T>) eb).thenBranch.equals(tb)) {
						return new Choice<>(featureExpr.or(featureExpr.not().and(((Choice<T>) eb).featureExpr)), tb, ((Choice<T>) eb).elseBranch);
					}
					if (((Choice<T>) eb).elseBranch.equals(tb)) {
						return new Choice<>(featureExpr.or(featureExpr.not().and(((Choice<T>) eb).featureExpr.not())), tb, ((Choice<T>) eb).thenBranch);
					}
				}
			}
		}
		if (eb instanceof One) {
			if (tb instanceof Choice) {
				if (((Choice<T>) tb).elseBranch instanceof One && ((Choice<T>) tb).thenBranch instanceof One) {// TODO remove
					if (((Choice<T>) tb).thenBranch.equals(eb)) {
						return new Choice<>(featureExpr.not().or(featureExpr.and(((Choice<T>) tb).featureExpr)), eb, ((Choice<T>) tb).elseBranch);
					}
					if (((Choice<T>) tb).elseBranch.equals(eb)) {
						return new Choice<>(featureExpr.not().or(featureExpr.and(((Choice<T>) tb).featureExpr.not())), eb, ((Choice<T>) tb).thenBranch);
					}
				}
			}
		}

		return new Choice<>(featureExpr, tb, eb);
	}

}
