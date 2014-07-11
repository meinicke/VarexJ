package gov.nasa.jpf.jvm.bytecode.extended;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

public abstract class Conditional<T> {
	
	public abstract T getValue();
	public abstract T getValue(boolean ignore);
	
	protected static final FeatureExpr True = FeatureExprFactory.True();
	
//  def map[U](f: T => U): Conditional[U] = mapr(x => One(f(x)))
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <U> Conditional<U> map(final Function<T,U> f) {
		return mapfr(null, new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(FeatureExpr c, T x) {
				return new One(f.apply(x));
			}
			
		});
	}
	
//  def mapr[U](f: T => Conditional[U]): Conditional[U] = mapfr(True, (c, x) => f(x))
	public<U, C> Conditional<U> mapr(final Function<T, Conditional<U>> f) {
		return mapfr(True, new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(FeatureExpr c, T x) {
				return f.apply(x);
			}
			
		});
	}

	
//	def mapf[U](inFeature: FeatureExpr, f: (FeatureExpr, T) => U): Conditional[U] = mapfr(inFeature, (c, x) => One(f(c, x)))
	public <U> Conditional<U> mapf(FeatureExpr inFeature, final BiFunction<FeatureExpr, T, Conditional<U>> f) {
		return mapfr(inFeature, new BiFunction<FeatureExpr, T, Conditional<U>>() {

			public Conditional<U> apply(FeatureExpr c, T x) {
				return f.apply(c, x);
			}
			
		});
	}
	
//	def mapfr[U](inFeature: FeatureExpr, f: (FeatureExpr, T) => Conditional[U]): Conditional[U]
	public abstract <U> Conditional<U> mapfr(FeatureExpr inFeature, BiFunction<FeatureExpr, T, Conditional<U>> f);
	
	public Conditional<T> simplify(){
		return simplify(True);
	}
	
	public abstract Conditional<T> simplify(FeatureExpr ctx);
	
	public abstract List<T> toList();
	
	public Map<T, FeatureExpr> toMap() {
		Map<T,FeatureExpr> map = new HashMap<>();
		toMap(True, map);
		return map;
	}
    
    protected abstract void toMap(FeatureExpr f, Map<T, FeatureExpr> map);
	
    @Override
    protected abstract Object clone() throws CloneNotSupportedException;
    
}