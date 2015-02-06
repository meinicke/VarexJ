package cmu.conditional;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Choice implementation as tree. 
 * Each node represents a decision as {@link FeatureExpr} between two conditionals. 
 * 
 * @author Jens Meinicke
 *
 */
class TreeChoice<T> extends IChoice<T> implements Cloneable {

	private Conditional<T> thenBranch;
	private Conditional<T> elseBranch;
	private FeatureExpr featureExpr;
	
	TreeChoice(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		super(featureExpr, thenBranch, elseBranch);
		this.featureExpr = featureExpr;
		this.thenBranch = thenBranch;
		this.elseBranch = elseBranch;
		
	}

	@Override
	public <U> Conditional<U> mapfr(final FeatureExpr inFeature, final BiFunction<FeatureExpr, T, Conditional<U>> f) {
		if (inFeature == null) {
			Conditional<U> newResultA = thenBranch.mapfr(null, f);
			Conditional<U> newResultB = elseBranch.mapfr(null, f);
			return new TreeChoice<>(featureExpr, newResultA, newResultB);
		}

		Conditional<U> newResultA = thenBranch.mapfr(inFeature.and(featureExpr), f);
		Conditional<U> newResultB = elseBranch.mapfr(inFeature.and(featureExpr.not()), f);
		return new TreeChoice<>(featureExpr, newResultA, newResultB);

	}

	@Override
	public Conditional<T> simplify(FeatureExpr ctx) {
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

		if (tb instanceof One) {
			if (eb instanceof TreeChoice) {
				if (((TreeChoice<T>) eb).thenBranch.equals(tb)) {
					return new TreeChoice<>(featureExpr.or(featureExpr.not().and(((TreeChoice<T>) eb).featureExpr)), tb, ((TreeChoice<T>) eb).elseBranch);
				}
				if (((TreeChoice<T>) eb).elseBranch.equals(tb)) {
					return new TreeChoice<>(featureExpr.or(featureExpr.not().and(((TreeChoice<T>) eb).featureExpr.not())), tb, ((TreeChoice<T>) eb).thenBranch);
				}
			}
		}
		if (eb instanceof One) {
			if (tb instanceof TreeChoice) {
				if (((TreeChoice<T>) tb).thenBranch.equals(eb)) {
					return new TreeChoice<>(featureExpr.not().or(featureExpr.and(((TreeChoice<T>) tb).featureExpr)), eb, ((TreeChoice<T>) tb).elseBranch);
				}
				if (((TreeChoice<T>) tb).elseBranch.equals(eb)) {
					return new TreeChoice<>(featureExpr.not().or(featureExpr.and(((TreeChoice<T>) tb).featureExpr.not())), eb, ((TreeChoice<T>) tb).thenBranch);
				}
			}
		}

		return new TreeChoice<>(featureExpr, tb, eb);
	}

	@Override
	public String toString() {
		return "Choice(" + getCTXString(featureExpr) + ", " + thenBranch + ", " + elseBranch + ")";
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TreeChoice) {
			TreeChoice<T> c = (TreeChoice<T>) obj;
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
		return new TreeChoice<>(featureExpr, thenBranch.clone(), elseBranch.clone());
	}

	@Override
	public Conditional<T> simplifyValues() {
		final Conditional<T> tb = thenBranch.simplifyValues();
		final Conditional<T> eb = elseBranch.simplifyValues();

		if (tb.equals(eb)) {
			return tb;
		}

		if (tb instanceof One) {
			if (eb instanceof TreeChoice) {
				if (((TreeChoice<T>) eb).thenBranch.equals(tb)) {
					return new TreeChoice<>(featureExpr.or(featureExpr.not().and(((TreeChoice<T>) eb).featureExpr)), tb, ((TreeChoice<T>) eb).elseBranch);
				}
				if (((TreeChoice<T>) eb).elseBranch.equals(tb)) {
					return new TreeChoice<>(featureExpr.or(featureExpr.not().and(((TreeChoice<T>) eb).featureExpr.not())), tb, ((TreeChoice<T>) eb).thenBranch);
				}
			}
		}
		if (eb instanceof One) {
			if (tb instanceof TreeChoice) {
				if (((TreeChoice<T>) tb).thenBranch.equals(eb)) {
					return new TreeChoice<>(featureExpr.not().or(featureExpr.and(((TreeChoice<T>) tb).featureExpr)), eb, ((TreeChoice<T>) tb).elseBranch);
				}
				if (((TreeChoice<T>) tb).elseBranch.equals(eb)) {
					return new TreeChoice<>(featureExpr.not().or(featureExpr.and(((TreeChoice<T>) tb).featureExpr.not())), eb, ((TreeChoice<T>) tb).thenBranch);
				}
			}
		}

		return new TreeChoice<>(featureExpr, tb, eb);
	}
	
	@Override
	public int size() {
		return thenBranch.size() + elseBranch.size();
	}

}
