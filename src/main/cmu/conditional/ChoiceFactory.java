package cmu.conditional;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class ChoiceFactory {
	
	private static Factory f = new DefaultChoiceFactory();
//	private static Factory f = new MapChoiceFactory();
	
	public static <T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		return f.create(featureExpr, thenBranch, elseBranch);
	}
}

interface Factory {
	<T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch); 
}

class DefaultChoiceFactory implements Factory {

	@Override
	public <T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		return new Choice<>(featureExpr, thenBranch, elseBranch);
	}
}

class MapChoiceFactory implements Factory {

	@Override
	public <T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		return new MapChoice<>(featureExpr, thenBranch, elseBranch);
	}
}


