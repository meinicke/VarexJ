package gov.nasa.jpf.jvm.bytecode.extended;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class One<T> extends Conditional<T> {

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
		if (value == null) {// TODO might be no good idea
			return new One<>(null);
		}
		return f.apply(inFeature, value);
	}
	
	@Override
	public String toString() {
		String s= "One(";
		if (value instanceof int[]) {
			for (int x : (int[])value) {
				s+= x + ", ";
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
		 if (obj != null && obj instanceof One) {
			 if (((One<?>)obj).value == null && value == null) {
				 return true;
			 }
			 if (((One<?>)obj).value != null && value != null && ((One<?>)obj).value.equals(value))
				 return true;
		 }
		 return false;
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
	public Object clone() throws CloneNotSupportedException {
		return new One<>(value);
	}

}