package gov.nasa.jpf.jvm.bytecode.extended;

import java.util.LinkedList;
import java.util.List;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class One<T> extends Conditional<T> {

	private T value;
	public One(T value) {
		this.value = value;
		if (value instanceof Conditional) {
			System.out.println("One with conditional value: " + toString());
			for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
				System.out.println(e);
			}
		}
	}
	
	public T getValue() {
		if (value instanceof Conditional) {
			return ((Conditional<T>) value).getValue();
		}
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
		} else {
			s+=value;
		}
		return s + ")";
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Conditional<T> simplify(FeatureExpr ctx) {
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
		 return (obj != null && obj instanceof One && ((One<?>)obj).value == value);
	}

	@Override
	public List<T> toList() {
		List<T> list = new LinkedList<>();
		list.add(value);
		return list;
	}

}