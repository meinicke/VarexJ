package cmu.conditional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import de.fosd.typechef.featureexpr.FeatureModel;

/**
 * Representation of a values that depend on {@link FeatureExpr}.
 * 
 * @author Jens Meinicke
 *
 */
public abstract class Conditional<T> {
	
	public static FeatureModel fm = null;
	
	public static void setFM(final String fmfile) {
		fm = fmfile.isEmpty() ? null : FeatureExprFactory.dflt().featureModelFactory().createFromDimacsFile(fmfile);
		map.clear();
	}
 	
	private static Map<FeatureExpr, Boolean> map = new HashMap<>();
	
	
	public static boolean isContradiction(final FeatureExpr f) {
		if (!map.containsKey(f)) {
			if (f.isContradiction()) {
				map.put(f, Boolean.TRUE);
			} else if (f.isTautology()) {
				map.put(f, Boolean.FALSE);
			} else if (fm != null) {
				map.put(f, f.isContradiction(fm));
			} else {
				map.put(f, Boolean.FALSE);
			}
		}
		return map.get(f);
	}
	
	public static boolean isTautology(final FeatureExpr f) {
		return isContradiction(f.not());
	}
	
	public abstract T getValue();
	public abstract T getValue(boolean ignore);
	
//	protected static final FeatureExpr True = FeatureExprFactory.True();
	
//  def map[U](f: T => U): Conditional[U] = mapr(x => One(f(x)))
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <U> Conditional<U> map(final Function<T,U> f) {
		return mapfr(null, new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(final FeatureExpr c, T x) {
				return new One(f.apply(x));
			}
			
		});
	}
	
//  def mapr[U](f: T => Conditional[U]): Conditional[U] = mapfr(True, (c, x) => f(x))
	public<U> Conditional<U> mapr(final Function<T, Conditional<U>> f) {
		return mapfr(FeatureExprFactory.True(), new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(final FeatureExpr c, final T x) {
				return f.apply(x);
			}
			
		});
	}

	
//	def mapf[U](inFeature: FeatureExpr, f: (FeatureExpr, T) => U): Conditional[U] = mapfr(inFeature, (c, x) => One(f(c, x)))
	public <U> Conditional<U> mapf(FeatureExpr inFeature, final BiFunction<FeatureExpr, T, Conditional<U>> f) {
		return mapfr(inFeature, new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(final FeatureExpr c, final T x) {
				return f.apply(c, x);
			}
			
		});
	}
	
//	def mapfr[U](inFeature: FeatureExpr, f: (FeatureExpr, T) => Conditional[U]): Conditional[U]
	public abstract <U> Conditional<U> mapfr(FeatureExpr inFeature, BiFunction<FeatureExpr, T, Conditional<U>> f);
	
	public abstract Conditional<T> simplifyValues();
	
	public Conditional<T> simplify(){
		return simplify(FeatureExprFactory.True());
	}
		
	public abstract Conditional<T> simplify(FeatureExpr ctx);
	
	public abstract List<T> toList();
	
	public Map<T, FeatureExpr> toMap() {
		Map<T,FeatureExpr> map = new HashMap<>();
		toMap(FeatureExprFactory.True(), map);
		return map;
	}
    
    protected abstract void toMap(FeatureExpr f, Map<T, FeatureExpr> map);
	
    @Override
	public abstract Conditional<T> clone() throws CloneNotSupportedException;
    
    public static String getCTXString(FeatureExpr ctx) {
  	  return ("" + ctx).replaceAll("CONFIG_", "").replaceAll("__SELECTED_FEATURE_", "").replaceAll("def\\(", "").replaceAll("\\)", "").replaceAll("\\(", "");
    }
    
}
