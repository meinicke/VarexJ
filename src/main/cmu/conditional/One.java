package cmu.conditional;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Non conditional value.
 * 
 * @author Jens Meinicke
 *
 * @param <T>
 */
public class One<T> extends Conditional<T> implements Cloneable {

	private T value;

	public One(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public T getValue(final boolean ignore) {
		return getValue();
	}

	@Override
	public <U> Conditional<U> mapfr(FeatureExpr inFeature, BiFunction<FeatureExpr, T, Conditional<U>> f) {
		return f.apply(inFeature, value);
	}

	@Override
	public void mapfr(FeatureExpr inFeature, VoidBiFunction<FeatureExpr, T> f) {
		f.apply(inFeature, value);
	}

	@Override
	public String toString() {
		String s = "One(";
		if (value instanceof int[]) {
			s += Arrays.toString((int[]) value);
		} else if (value instanceof long[]) {
			s += Arrays.toString((long[]) value);
		} else if (value instanceof double[]) {
			s += Arrays.toString((double[]) value);
		} else if (value instanceof float[]) {
			s += Arrays.toString((float[]) value);
		} else if (value instanceof char[]) {
			s += Arrays.toString((char[]) value);
		} else {
			s += value;
		}
		return s + ")";
	}

	@Override
	public Conditional<T> simplify(FeatureExpr ctx) {
		if (ctx == null) {
			throw new RuntimeException("ctx == null");
		}
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof One) {
			if (value == ((One<?>) obj).value) {
				return true;
			}
			if (value instanceof char[]) {
				Arrays.equals((char[]) value, (char[]) ((One<?>) obj).value);
			}

			if (((One<?>) obj).value != null && value != null && ((One<?>) obj).value.equals(value))
				return true;
		}
		return false;
	}

	public int hashCode() {
		throw new RuntimeException("hashCode not designed");
	}

	@Override
	public List<T> toList() {
		List<T> list = new LinkedList<>();
		list.add(value);
		return list;
	}

	@Override
	protected void toMap(FeatureExpr f, Map<T, FeatureExpr> map) {
		FeatureExpr ctx = map.get(value);
		if (ctx == null) {
			map.put(value, f);
		} else {
			map.put(value, f.or(ctx));
		}
	}

	@Override
	public Conditional<T> clone() {
		return new One<>(value);
	}

	@Override
	public Conditional<T> simplifyValues() {
		return this;
	}

	@Override
	public int size() {
		return 1;
	}

}