package cmu.conditional;

import java.util.ArrayList;
import java.util.List;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Factory to set the implementation of {@link IChoice}.
 * 
 * @author Jens Meinicke
 *
 */
public class ChoiceFactory {
	
	public enum Factory{
		TreeChoice, MapChoice
	}
	
	private static IChoiceFactory f = new TreeChoiceFactory();
	
	public static IChoiceFactory getCurrent() {
		return f;
	}
	
	public static <T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		return f.create(featureExpr, thenBranch, elseBranch);
	}
	
	public static void setDefault(Factory factory) {
		switch (factory) {
		case MapChoice:
			f = new MapChoiceFactory();
			break;
		case TreeChoice:
			f = new TreeChoiceFactory();
			break;
		default:
			throw new RuntimeException("Choice type: " + factory + " not supported");
		}
	}
	
	public static List<Object[]> asParameter() {
		List<Object[]> factorys = new ArrayList<>();
		for (Factory f : Factory.values()) {
			factorys.add(new Object[]{f});
		}
		return factorys;
	}
}

interface IChoiceFactory {
	<T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch); 
}

class TreeChoiceFactory implements IChoiceFactory {

	@Override
	public <T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		return new Choice<>(featureExpr, thenBranch, elseBranch);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}

class MapChoiceFactory implements IChoiceFactory {

	@Override
	public <T> IChoice<T> create(FeatureExpr featureExpr, Conditional<T> thenBranch, Conditional<T> elseBranch) {
		return new MapChoice<>(featureExpr, thenBranch, elseBranch);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}


