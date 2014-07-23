package gov.nasa.jpf.jvm.bytecode.extended;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class One<T> extends Conditional<T> implements Cloneable {

	private T value;
	
	public One(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public T getValue(boolean ignore) {
		return getValue();
	}

	@Override
	public <U> Conditional<U> mapfr(FeatureExpr inFeature,
			BiFunction<FeatureExpr, T, Conditional<U>> f) {
		return f.apply(inFeature, value);
	}
	
	@Override
	public String toString() {
		String s= "One(";
		if (value instanceof int[]) {
			for (int x : (int[])value) {
				s+= x + ", ";
			}
		} else if (value instanceof long[]) {
			for (long x : (long[])value) {
				s+= x + "l, ";
			}
		} else if (value instanceof double[]) {
			for (double x : (double[])value) {
				s+= x + "d, ";
			}
		} else if (value instanceof float[]) {
			for (float x : (float[])value) {
				s+= x + "f, ";
			}
		} else if (value instanceof char[]) {
			s += new String((char[])value);
		} else {
			s+=value;
		}
		return s + ")";
	}

	@SuppressWarnings("unchecked")
	@Override
	public Conditional<T> simplify(FeatureExpr ctx) {
		if (value instanceof Conditional) {
			((Conditional<?>) value).simplify(ctx);
		}
		if (value instanceof One) {
			value = (T) ((One<?>) value).getValue();
		}
		return this;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if (obj instanceof One) {
			 if (value == ((One<?>)obj).value) {
				 return true;
			 }
			 if (((One<?>)obj).value != null && value != null && ((One<?>)obj).value.equals(value))
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
	public Conditional<T> clone() throws CloneNotSupportedException {
		return new One<>(value);
	}

	@Override
	public Conditional<T> simplifyValues() {
		return this;
	}

}