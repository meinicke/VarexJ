package cmu.conditional;

import java.util.HashMap;
import java.util.Map;

import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.IteratorInt;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import de.fosd.typechef.featureexpr.FeatureModel;
import de.fosd.typechef.featureexpr.SingleFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureModel;
import net.sf.javabdd.BDD;
import scala.Tuple2;

public class CachedBDDFeatureExpr extends BDDFeatureExpr {
	
	static {
		FeatureExprFactory.setDefault(FeatureExprFactory.bdd());
	}
	
	public static BDDFeatureModel fm = null;
	public static BDDFeatureExpr bddFM;
	
	public static final Map<String, FeatureExpr> features = new HashMap<>();
	public static void setFM(final String fmfile) {
		features.clear();
		cacheNot.clear();
		cacheAnd.clear();
		
		fm = (BDDFeatureModel) (fmfile.isEmpty() ? null : FeatureExprFactory.bdd().featureModelFactory().createFromDimacsFile(fmfile));
		if (fm != null) {
			createBDDFeatureModel();
		} else {
			bddFM = (BDDFeatureExpr) FeatureExprFactory.bdd().True();
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
		for (Tuple2<String, Object> tuple : scala.collection.JavaConversions.asJavaCollection(vars)) {
			map.put((Integer)tuple._2, tuple._1);
		}
		final int size = clauses.size();
		FeatureExpr construction = CachedFeatureExprFactory.True();
		for (int i = 0; i < size; i++) {
			IVecInt c = (IVecInt) clauses.get(i);
			IteratorInt iterator = c.iterator();
			FeatureExpr clause = CachedFeatureExprFactory.False();
			while (iterator.hasNext()) {
				int value = iterator.next();
				boolean selection2 = value > 0;
				String feature = map.get(Math.abs(value));
				FeatureExpr featureExpr = features.get(feature);
				if (!features.containsKey(feature)) {
					SingleFeatureExpr singleFeatureExpr = FeatureExprFactory.createDefinedExternal(feature);
					featureExpr = new CachedBDDFeatureExpr(singleFeatureExpr);
					features.put(singleFeatureExpr.feature(), featureExpr);
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
	
	public static FeatureExpr createFeature(String fname) {
		final FeatureExpr feature = new CachedBDDFeatureExpr(FeatureExprFactory.createDefinedExternal("CONFIG_" + fname));
		features.put(fname, feature);
		return feature;
	}

	public CachedBDDFeatureExpr(BDD bdd) {
		super(bdd);
	}
	
	public CachedBDDFeatureExpr(FeatureExpr featureExpr) {
		super(((BDDFeatureExpr)featureExpr).bdd());
	}

	private static final long serialVersionUID = -8311123596466345306L;

	private static final Map<BDD, Map<BDD, FeatureExpr>> cacheAnd = new HashMap<>();
	
	private Boolean isSatisfiable = null;
			
	@Override
	public boolean isSatisfiable(FeatureModel arg) {
		if (isSatisfiable == null) {
			isSatisfiable = super.isSatisfiable(arg);
		}
		return isSatisfiable;
	}
		
	@Override
	public boolean isContradiction(FeatureModel arg) {
		if (isSatisfiable == null) {
			isSatisfiable = !super.isContradiction(arg);
		}
		return !isSatisfiable;
	}
	
	@Override
	public FeatureExpr and(FeatureExpr that) {
		if (this.hashCode() == that.hashCode()) {
			return this;
		}
		if (this.hashCode() > that.hashCode()) {
			return that.and(this);
		}
		
		BDD bddA = this.bdd();
		BDD bddB = ((BDDFeatureExpr)that).bdd();
		
		Map<BDD, FeatureExpr> aMap = cacheAnd.get(bddA);
		if (aMap == null) {
			aMap = new HashMap<>();
			cacheAnd.put(bddA, aMap);
		}
		if (aMap.containsKey(bddB)) {
			return aMap.get(bddB);
		}
		return aMap.computeIfAbsent(bddB, x -> new CachedBDDFeatureExpr(super.and(that)));
	}
	
	@Override
	public String toString() {
		FeatureExpr ctx = simplifyCondition(this);
		boolean oneSample = ctx instanceof BDDFeatureExpr && ((BDDFeatureExpr) ctx).bdd().pathCount() > 1000;
		if (oneSample) {
			ctx = new BDDFeatureExpr(((BDDFeatureExpr) ctx).bdd().satOne());
		}
		String context = ctx instanceof CachedBDDFeatureExpr ? ((CachedBDDFeatureExpr) ctx).toSuperString() : ctx.toString();
		context = context.replaceAll("CONFIG_", "").replaceAll("__SELECTED_FEATURE_", "").replaceAll("def\\(", "(");
		context = trimExpression(context);
		if (oneSample) {
			context = context + " | ...";
		} else if ((context.length() > 300 && context.contains("|"))) {
			context = (context.substring(0, context.indexOf('|')) + " | ...");
		}

		return context;
	}
	
	private String toSuperString() {
		return super.toString();
	}
	
	private static final String PATTERN = "\\((\\w*)\\)";

	/**
	 * Replaces all "(Feature)" by "Feature"
	 */
	private static String trimExpression(String ctx) {
		return ctx.replaceAll(PATTERN, "$1");
	}

	public static FeatureExpr simplifyCondition(FeatureExpr ctx) {
		if (bddFM != null) {
			return ctx.simplify(bddFM);
		}
		return ctx;
	}
	
	
	private static final Map<BDD, FeatureExpr> cacheNot = new HashMap<>();

	@Override
	public FeatureExpr not() {
		return cacheNot.computeIfAbsent((this).bdd(), x -> new CachedBDDFeatureExpr(super.not()));
	}
	
	@Override
	public FeatureExpr or(final FeatureExpr that) {
		if (this.bdd() == ((BDDFeatureExpr)that).bdd()) {
			return this;
		}
		return not().and(that.not()).not();
	}

}
