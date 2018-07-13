package cmu.conditional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

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
	public <U> Conditional<U> map(Function<T, U> f) {
		Conditional<U> newResultA = thenBranch.map(f);
		Conditional<U> newResultB = elseBranch.map(f);
		return new TreeChoice<>(featureExpr, newResultA, newResultB);
	}
	
	@Override
	public <U> Conditional<U> mapr(Function<T, Conditional<U>> f) {
		Conditional<U> newResultA = thenBranch.mapr(f);
		Conditional<U> newResultB = elseBranch.mapr(f);
		return new TreeChoice<>(featureExpr, newResultA, newResultB);
	}

	@Override
	public <U> Conditional<U> mapfr(final FeatureExpr inFeature, final BiFunction<FeatureExpr, T, Conditional<U>> f) {
		if (inFeature == null) {
			Conditional<U> newResultA = thenBranch.mapfr(null, f);
			Conditional<U> newResultB = elseBranch.mapfr(null, f);
			return new TreeChoice<>(featureExpr, newResultA, newResultB);
		}

		Conditional<U> newResultA = thenBranch.mapfr(and(inFeature, featureExpr), f);
		Conditional<U> newResultB = elseBranch.mapfr(and(inFeature, not(featureExpr)), f);
		return new TreeChoice<>(featureExpr, newResultA, newResultB);
	}
	
	@Override
	public void mapfr(final FeatureExpr inFeature, final BiConsumer<FeatureExpr, T> f) {
		if (inFeature == null) {
			thenBranch.mapfr(null, f);
			elseBranch.mapfr(null, f);
			return;
		}

		thenBranch.mapfr(and(inFeature, featureExpr), f);
		elseBranch.mapfr(and(inFeature, not(featureExpr)), f);
	}

	@Override
	public Conditional<T> simplify(FeatureExpr ctx) {
		FeatureExpr and = and(ctx, featureExpr);
		if (isContradiction(and)) {
			return elseBranch.simplify(and(ctx, not(featureExpr)));
		}

		FeatureExpr andNot = and(ctx, not(featureExpr));
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
					return new TreeChoice<>(or(featureExpr, and(not(featureExpr), ((TreeChoice<T>) eb).featureExpr)), tb, ((TreeChoice<T>) eb).elseBranch);
				}
				if (((TreeChoice<T>) eb).elseBranch.equals(tb)) {
					return new TreeChoice<>(or(featureExpr, and(not(featureExpr), not(((TreeChoice<T>) eb).featureExpr))), tb, ((TreeChoice<T>) eb).thenBranch);
				}
			}
		}
		if (eb instanceof One) {
			if (tb instanceof TreeChoice) {
				if (((TreeChoice<T>) tb).thenBranch.equals(eb)) {
					return new TreeChoice<>(or(not(featureExpr), and(featureExpr, ((TreeChoice<T>) tb).featureExpr)), eb, ((TreeChoice<T>) tb).elseBranch);
				}
				if (((TreeChoice<T>) tb).elseBranch.equals(eb)) {
					return new TreeChoice<>(or(not(featureExpr), and(featureExpr, not(((TreeChoice<T>) tb).featureExpr))), eb, ((TreeChoice<T>) tb).thenBranch);
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
			return c.thenBranch.equals(thenBranch) && c.elseBranch.equals(elseBranch) && Conditional.equivalentTo(c.featureExpr, featureExpr);
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elseBranch == null) ? 0 : elseBranch.hashCode());
		result = prime * result + ((featureExpr == null) ? 0 : featureExpr.hashCode());
		result = prime * result + ((thenBranch == null) ? 0 : thenBranch.hashCode());
		return result;
	}

	@Override
	public T getValue() {
		 System.out.println("___________________________________________________");
		 System.out.println("Get value of choice called: " + this);
		 for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
		 System.out.println(e);
		 }
		 System.out.println("---------------------------------------------------");
		// return thenBranch.getValue(true);
		throw new GetValueOfChoiceException("Get value of choice called: " + toString());
	}

	@Override
	public T getValue(boolean ignore) {
		if (ignore) {
			return thenBranch.getValue(ignore);
		}
		return getValue();
	}

	@Override
	protected void toList(List<T> list) {
		thenBranch.toList(list);
		elseBranch.toList(list);
	}

	@Override
	protected void toMap(FeatureExpr ctx, Map<T, FeatureExpr> map) {
		thenBranch.toMap(and(ctx, featureExpr), map);
		elseBranch.toMap(and(ctx, not(featureExpr)), map);
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
					return new TreeChoice<>(or(featureExpr, and(not(featureExpr), ((TreeChoice<T>) eb).featureExpr)), tb, ((TreeChoice<T>) eb).elseBranch);
				}
				if (((TreeChoice<T>) eb).elseBranch.equals(tb)) {
					return new TreeChoice<>(or(featureExpr, and(not(featureExpr), not(((TreeChoice<T>) eb).featureExpr))), tb, ((TreeChoice<T>) eb).thenBranch);
				}
			}
		}
		if (eb instanceof One) {
			if (tb instanceof TreeChoice) {
				if (((TreeChoice<T>) tb).thenBranch.equals(eb)) {
					return new TreeChoice<>(or(not(featureExpr), and(featureExpr, ((TreeChoice<T>) tb).featureExpr)), eb, ((TreeChoice<T>) tb).elseBranch);
				}
				if (((TreeChoice<T>) tb).elseBranch.equals(eb)) {
					return new TreeChoice<>(or(not(featureExpr), and(featureExpr, not(((TreeChoice<T>) tb).featureExpr))), eb, ((TreeChoice<T>) tb).thenBranch);
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
