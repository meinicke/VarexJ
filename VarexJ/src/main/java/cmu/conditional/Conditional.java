package cmu.conditional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.IteratorInt;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import de.fosd.typechef.featureexpr.SingleFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureModel;
import net.sf.javabdd.BDD;
import scala.Tuple2;

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
	
	private static final Map<BDD, Boolean> cacheIsSat = new HashMap<>();
	
	private static final Map<BDD, Map<BDD, FeatureExpr>> cacheAnd = new HashMap<>();
	
	private static final Map<BDD, FeatureExpr> cacheNot = new HashMap<>();
	
	public static void setFM(final String fmfile) {
		cacheIsSat.clear();
		features.clear();
		cacheNot.clear();
		cacheIsSat.clear();
		cacheAnd.clear();
		
		fm = (BDDFeatureModel) (fmfile.isEmpty() ? null : FeatureExprFactory.bdd().featureModelFactory().createFromDimacsFile(fmfile));
		if (fm != null) {
			createBDDFeatureModel();
		} else {
			bddFM = (BDDFeatureExpr) FeatureExprFactory.bdd().True();
		}
	}
	
	public static FeatureExpr not(FeatureExpr a) {
		return cacheNot.computeIfAbsent(((BDDFeatureExpr)a).bdd(), x -> a.not());
	}
	
	public static FeatureExpr or(final FeatureExpr a, final FeatureExpr b) {
		return not(and(not(a), not(b)));
	}
	
	public static FeatureExpr and(final FeatureExpr a, final FeatureExpr b) {
		final BDD bddA = ((BDDFeatureExpr)a).bdd();
		final BDD bddB = ((BDDFeatureExpr)b).bdd();
		Map<BDD, FeatureExpr> aMap = cacheAnd.get(bddA);
		if (aMap == null) {
			aMap = new HashMap<>();
			cacheAnd.put(bddA, aMap);
		}
		return aMap.computeIfAbsent(bddB, x -> a.and(b));
	}
	
	public static boolean equals(FeatureExpr a, FeatureExpr b) {
		if (a == b) return true;
		return ((BDDFeatureExpr)a).bdd().equals(((BDDFeatureExpr)b).bdd());
	}
	
	public static boolean equivalentTo(FeatureExpr a, FeatureExpr b) {
		return a.equals(b) || isTautology(equiv(a, b));
	}
	
	private static FeatureExpr equiv(FeatureExpr a, FeatureExpr b) {
		return or(and(a, b), and(not(a), not(b)));
	}

	/**
	 * Creates a BDD from the given feature model.
	 */
	private static void createBDDFeatureModel() {
		@SuppressWarnings("rawtypes")//Gradle compiler bug
		final IVec clauses = fm.clauses();
		final scala.collection.immutable.Map<String, Object> vars = fm.variables();
		java.util.Map<Integer, String> map = new HashMap<>();
		for (Tuple2<String, Object> tuple : scala.collection.JavaConversions.asJavaCollection(vars)) {
			map.put((Integer)tuple._2, tuple._1);
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

	public static final boolean isContradiction(final FeatureExpr f) {
		final BDD bdd = ((BDDFeatureExpr)f).bdd();
		final Boolean value = cacheIsSat.get(bdd);
		if (value != null) {
			return !value;
		}
		return !cacheIsSat.computeIfAbsent(bdd, x -> f.isSatisfiable(fm));
	}

	public static final boolean isTautology(final FeatureExpr f) {
		return !cacheIsSat.computeIfAbsent(((BDDFeatureExpr)f).bdd().not(), x -> f.not().isSatisfiable(fm));
	}

	public abstract T getValue();

	public abstract T getValue(boolean ignore);

	// def map[U](f: T => U): Conditional[U] = mapr(x => One(f(x)))
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <U> Conditional<U> map(final Function<T, U> f) {
		return mapfr(null, (FeatureExpr c, T x) -> new One(f.apply(x)));
	}

	// def mapr[U](f: T => Conditional[U]): Conditional[U] = mapfr(True, (c, x)
	// => f(x))
	public <U> Conditional<U> mapr(final Function<T, Conditional<U>> f) {
		return mapfr(FeatureExprFactory.True(), (FeatureExpr c, T x) -> f.apply(x));
	}

	// def mapf[U](inFeature: FeatureExpr, f: (FeatureExpr, T) => U):
	// Conditional[U] = mapfr(inFeature, (c, x) => One(f(c, x)))
	public <U> Conditional<U> mapf(FeatureExpr inFeature, final BiFunction<FeatureExpr, T, Conditional<U>> f) {
		return mapfr(inFeature, f::apply);
	}

	public void mapf(FeatureExpr inFeature, final BiConsumer<FeatureExpr, T> f) {
		mapfr(inFeature, f::accept);
	}

	// def mapfr[U](inFeature: FeatureExpr, f: (FeatureExpr, T) =>
	// Conditional[U]): Conditional[U]
	public abstract <U> Conditional<U> mapfr(FeatureExpr inFeature, BiFunction<FeatureExpr, T, Conditional<U>> f);

	public abstract void mapfr(FeatureExpr inFeature, BiConsumer<FeatureExpr, T> f);

	public abstract Conditional<T> simplifyValues();

	public Conditional<T> simplify() {
		return simplify(FeatureExprFactory.True());
	}

	public abstract Conditional<T> simplify(FeatureExpr ctx);

	public final List<T> toList() {
		final List<T> list = new NoCheckArrayList(size());
		toList(list);
		return list;
	}
	
	final class NoCheckArrayList extends ArrayList<T> {
		private static final long serialVersionUID = 1L;

		public NoCheckArrayList(int initialSize) {
			super(initialSize);
		}
		
		@Override
		public void ensureCapacity(int minCapacity) {
			// avoid checking for capacity
		}
	}
	
	protected abstract void toList(List<T> list);

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
