package cmu.conditional;

import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Abstract class for choices.
 * 
 * @author Jens Meinicke
 * 
 * @param <T>
 */
public abstract class IChoice<T> extends Conditional<T> {

	IChoice(FeatureExpr ctx, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		assert ctx != null : "argument is null";
	}

	IChoice(Map<T, FeatureExpr> m) {
	};
}