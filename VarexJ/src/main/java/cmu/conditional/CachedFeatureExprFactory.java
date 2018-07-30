package cmu.conditional;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

public class CachedFeatureExprFactory {

	public static FeatureExpr createDefinedExternal(String feature) {
		return CachedBDDFeatureExpr.features.computeIfAbsent(feature, (x) -> new CachedBDDFeatureExpr(FeatureExprFactory.createDefinedExternal(feature)));
	}

	private static final FeatureExpr TRUE = new CachedBDDFeatureExpr(FeatureExprFactory.True());
	private static final FeatureExpr FALSE = new CachedBDDFeatureExpr(FeatureExprFactory.False());
	
	public static FeatureExpr True() {
		return TRUE;
	}

	public static FeatureExpr False() {
		return FALSE;
	}
}
