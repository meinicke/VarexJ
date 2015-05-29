package cmu.conditional;

import gov.nasa.jpf.vm.MJIEnv;

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

	public static final One<?> NULL = new One<>(null);
	public static final One<Boolean> FALSE = new One<>(Boolean.FALSE);
	public static final One<Boolean> TRUE = new One<>(Boolean.TRUE);
	public static final One<Integer> MJIEnvNULL = new One<>(MJIEnv.NULL);
	
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
		if (obj == this) {
			return true;
		}
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
		return value.hashCode();
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
	
	public static One<Boolean> valueOf(boolean value) {
		return value ? TRUE : FALSE;
	}
	
	public static One<Integer> valueOf(int value) {
		if (value >= IntegerCache.low && value <= IntegerCache.high) {
			return IntegerCache.cache[value - IntegerCache.low];
		}
		return new One<>(value);
	}

	@SuppressWarnings("unchecked")
	private static class IntegerCache {
		static final int low = -128;
		static final int high = 1024;
		static final One<Integer>[] cache;

		static {
			cache = new One[high - low + 1];
			int j = low;
			for (int k = 0; k < cache.length; ++k)
				cache[k] = new One<>(Integer.valueOf(j++));
		}
	}
}