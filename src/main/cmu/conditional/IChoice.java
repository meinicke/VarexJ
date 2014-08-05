package cmu.conditional;

import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;


public abstract class IChoice<T> extends Conditional<T> {

	IChoice(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		if (featureExpr == null) {
			throw new RuntimeException("ctx = null");
		}
	}
	
	IChoice(Map<T, FeatureExpr> m) {};
}