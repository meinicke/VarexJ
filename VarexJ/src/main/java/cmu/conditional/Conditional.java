package cmu.conditional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.IteratorInt;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import de.fosd.typechef.featureexpr.SingleFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureModel;
import scala.Tuple2;
import scala.collection.Iterator;

/**
 * Representation of a values that depend on {@link FeatureExpr}.
 * 
 * @author Jens Meinicke
 *
 */
public abstract class Conditional<T> {

	public static BDDFeatureModel fm = null;
	public static BDDFeatureExpr bddFM;
	public static final Map<String, SingleFeatureExpr> features = new HashMap<>(); 
	private static Map<FeatureExpr, Boolean> cache = new HashMap<>();
	
	public static void setFM(final String fmfile) {
		cache.clear();
		features.clear();
		fm = (BDDFeatureModel) (fmfile.isEmpty() ? null : FeatureExprFactory.bdd().featureModelFactory().createFromDimacsFile(fmfile));
		if (fm != null) {
			createBDDFeatureModel();
		} else {
			bddFM = (BDDFeatureExpr) FeatureExprFactory.True();
		}
	}

	/**
	 * Creates a BDD from the given feature model.
	 */
	private static void createBDDFeatureModel() {
		@SuppressWarnings("rawtypes")//Gradle compiler bug
		final IVec clauses = fm.clauses();
		final scala.collection.immutable.Map<String, Object> vars = fm.variables();
		
		java.util.Map<Integer, String> map = new HashMap<>();
		Iterator<Tuple2<String, Object>> varsIterator = vars.iterator();
		while (varsIterator.hasNext()) {
			Tuple2<String, Object> next = varsIterator.next();
			map.put((Integer)next._2, next._1);
		}
		final int size = clauses.size();
		FeatureExpr construction = FeatureExprFactory.True();
		for (int i = 0; i < size; i++) {
			IVecInt c = (IVecInt) clauses.get(i);
			IteratorInt iterator = c.iterator();
			FeatureExpr clause = FeatureExprFactory.False();
			while (iterator.hasNext()) {
				int value = iterator.next();
				boolean selection2 = value > 0;
				String feature = map.get(Math.abs(value));
				SingleFeatureExpr featureExpr = features.get(feature);
				if (featureExpr == null) {
					featureExpr = FeatureExprFactory.createDefinedExternal(feature);
					features.put(featureExpr.feature(), featureExpr);
				}
				if (selection2) {
					clause = clause.or(featureExpr);
				} else {
					clause = clause.orNot(featureExpr);
				}
			}
			construction = construction.and(clause);
		}
		bddFM = (BDDFeatureExpr) construction;
	}
	
	public static SingleFeatureExpr createFeature(String fname) {
		final SingleFeatureExpr feature = FeatureExprFactory.createDefinedExternal("CONFIG_" + fname);
		features.put(fname, feature);
		return feature;
	}

	public static boolean isContradiction(final FeatureExpr f) {
		if (!cache.containsKey(f)) {
			if (f.isContradiction()) {
				cache.put(f, Boolean.TRUE);
			} else if (f.isTautology()) {
				cache.put(f, Boolean.FALSE);
			} else if (fm != null) {
				cache.put(f, f.isContradiction(fm));
			} else {
				cache.put(f, Boolean.FALSE);
			}
		}
		return cache.get(f);
	}

	public static boolean isTautology(final FeatureExpr f) {
		return isContradiction(f.not());
	}

	public abstract T getValue();

	public abstract T getValue(boolean ignore);

	// protected static final FeatureExpr True = FeatureExprFactory.True();

	// def map[U](f: T => U): Conditional[U] = mapr(x => One(f(x)))
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <U> Conditional<U> map(final Function<T, U> f) {
		return mapfr(null, new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(final FeatureExpr c, T x) {
				return new One(f.apply(x));
			}

		});
	}

	// def mapr[U](f: T => Conditional[U]): Conditional[U] = mapfr(True, (c, x)
	// => f(x))
	public <U> Conditional<U> mapr(final Function<T, Conditional<U>> f) {
		return mapfr(FeatureExprFactory.True(), new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(final FeatureExpr c, final T x) {
				return f.apply(x);
			}

		});
	}

	// def mapf[U](inFeature: FeatureExpr, f: (FeatureExpr, T) => U):
	// Conditional[U] = mapfr(inFeature, (c, x) => One(f(c, x)))
	public <U> Conditional<U> mapf(FeatureExpr inFeature, final BiFunction<FeatureExpr, T, Conditional<U>> f) {
		return mapfr(inFeature, new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(final FeatureExpr c, final T x) {
				return f.apply(c, x);
			}

		});
	}

	public void mapf(FeatureExpr inFeature, final VoidBiFunction<FeatureExpr, T> f) {
		mapfr(inFeature, new VoidBiFunction<FeatureExpr, T>() {

			public void apply(final FeatureExpr c, final T x) {
				f.apply(c, x);
			}

		});
	}

	// def mapfr[U](inFeature: FeatureExpr, f: (FeatureExpr, T) =>
	// Conditional[U]): Conditional[U]
	public abstract <U> Conditional<U> mapfr(FeatureExpr inFeature, BiFunction<FeatureExpr, T, Conditional<U>> f);

	public abstract void mapfr(FeatureExpr inFeature, VoidBiFunction<FeatureExpr, T> f);

	public abstract Conditional<T> simplifyValues();

	public Conditional<T> simplify() {
		return simplify(FeatureExprFactory.True());
	}

	public abstract Conditional<T> simplify(FeatureExpr ctx);

	public abstract List<T> toList();

	public Map<T, FeatureExpr> toMap() {
		Map<T, FeatureExpr> map = new HashMap<>();
		toMap(FeatureExprFactory.True(), map);
		return map;
	}

	protected abstract void toMap(FeatureExpr f, Map<T, FeatureExpr> map);

	@Override
	public abstract Conditional<T> clone() throws CloneNotSupportedException;

	public static String getCTXString(FeatureExpr ctx) {
		final FeatureExpr originalCTX = ctx;
		ctx = simplifyCondition(ctx);
		int start = ctx.toString().length();
		ctx = simplifyCondition(ctx);
		int end = ctx.toString().length();
		
		if (start > end) {
			System.out.println("---------------");
			System.out.println("reduced by " + (start - end));
			System.out.println(originalCTX);
			System.out.println(ctx);
			if (!ctx.equivalentTo(originalCTX, fm)) {
				throw new RuntimeException();
			}
			System.out.println("---------------");
		}
		
		boolean oneSample = ctx instanceof BDDFeatureExpr && ((BDDFeatureExpr) ctx).bdd().pathCount() > 1000;
		if (oneSample) {
			ctx = new BDDFeatureExpr(((BDDFeatureExpr) ctx).bdd().satOne());
		}
		String context = ctx.toString().replaceAll("CONFIG_", "").replaceAll("__SELECTED_FEATURE_", "")
				.replaceAll("def\\(", "").replaceAll("\\)", "").replaceAll("\\(", "");
		if (oneSample) {
			context = context + " | ...";
		} else if ((context.length() > 300 && context.contains("|"))) {
			context = (context.substring(0, context.indexOf('|')) + " | ...");
		}

		return context;
	}
	
	public static FeatureExpr simplifyCondition(FeatureExpr ctx) {
			return ctx.simplify(bddFM);
	}
	
	public static FeatureExpr simplifyCondition(FeatureExpr ctx, FeatureExpr additionalConmstraint) {
		return ctx.simplify(bddFM.and(additionalConmstraint));
	}

	public abstract int size();

	public boolean isOne() {
		return false;
	}
	
}
