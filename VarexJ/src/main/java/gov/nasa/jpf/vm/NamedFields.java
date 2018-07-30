//
// Copyright (C) 2010 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
//
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//

package gov.nasa.jpf.vm;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import cmu.conditional.CachedFeatureExprFactory;
import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.IntVector;

/**
 * value container for non-array classes
 */
public class NamedFields extends Fields {

	private static final One<Integer> nullValue = One.valueOf(0);
	/**
	 * this is where we store the instance data. Since field types are
	 * heterogenous, we have to map everything into int
	 */
	protected Conditional<Integer>[] values;

	@SuppressWarnings("unchecked")
	public NamedFields(int dataSize) {
		values = new Conditional[dataSize];
		Arrays.fill(values, nullValue);
	}
	
	@Override
	public int[] asFieldSlots() {
		int[] array = new int[values.length];
		int i = 0;
		for (Conditional<Integer> v : values) {
			array[i++] = v.getValue(true);
		}

		return array;
	}

	/**
	 * give an approximation of the heap size in bytes - we assume fields are word
	 * aligned, hence the number of values*4 should be good. Note that this is
	 * overridden by ArrayFields (arrays would be packed)
	 */
	public int getHeapSize() {
		return values.length * 4;
	}

	@Override
	public Conditional<Integer> getIntValue(int index) {
		return values[index];
	}

	public boolean isEqual(Fields o, int off, int len, int otherOff) {
		if (o instanceof NamedFields) {
			NamedFields other = (NamedFields) o;
			int iEnd = off + len;
			int jEnd = otherOff + len;
			Conditional<Integer>[] v = other.values;

			if ((iEnd > values.length) || (jEnd > v.length)) {
				return false;
			}

			for (int i = off, j = otherOff; i < iEnd; i++, j++) {
				if (values[i] != v[j]) {
					return false;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@Override
	public Conditional<Integer> getReferenceValue(int index) {
		return values[index];
	}

	@Override
	public Conditional<Long> getLongValue(final int index) {
		return values[index + 1].mapr(new Function<Integer, Conditional<Long>>() {

			@Override
			public Conditional<Long> apply(final Integer l) {
				return values[index].mapr(new Function<Integer, Conditional<Long>>() {

					@Override
					public Conditional<Long> apply(final Integer h) {
						return new One<>(Types.intsToLong(l, h));
					}

				});
			}

		});
	}

	@Override
	public Conditional<Boolean> getBooleanValue(int index) {
		return values[index].mapr(new Function<Integer, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(Integer v) {
				return One.valueOf(Types.intToBoolean(v));
			}
			
		});
	}

	@Override
	public Conditional<Byte> getByteValue(int index) {
		return values[index].mapr(new Function<Integer, Conditional<Byte>>() {

			@Override
			public Conditional<Byte> apply(Integer x) {
				return One.valueOf(x.byteValue());
			}
			
		}).simplify();
	}

	@Override
	public Conditional<Character> getCharValue(int index) {
		return values[index].map(GetCharValue);
	}

	private static final Function<Integer, Character> GetCharValue = new Function<Integer, Character>() {
		@Override
		public Character apply(final Integer x) {
			return (char) x.intValue();
		}
	};

	@Override
	public Conditional<Short> getShortValue(int index) {
		return values[index].map(new Function<Integer, Short>() {

			@Override
			public Short apply(Integer v) {
				return (short)v.intValue();
			}
			
		});
	}

	// <2do> get rid of it!! this is only for internal use, to increase efficiency
	public int[] getValues() {
		return asFieldSlots();
	}

	@Override
	public void setReferenceValue(FeatureExpr ctx, int index, Conditional<Integer> newValue) {
		if (Conditional.isTautology(ctx)) {
			values[index] = newValue;
		} else {
			values[index] = ChoiceFactory.create(ctx, newValue, values[index]).simplify();
		}
	}

	@Override
	public void setBooleanValue(FeatureExpr ctx, int index, Conditional<Boolean> newValue) {
		if (Conditional.isTautology(ctx)) {
			values[index] = One.valueOf(newValue.getValue() ? 1 : 0);
		} else {
			values[index] = ChoiceFactory.create(ctx, newValue.mapr(new Function<Boolean, Conditional<Integer>>() {
	
				@Override
				public Conditional<Integer> apply(Boolean v) {
					return One.valueOf(v ? 1 : 0);
				}
				
			}), values[index]).simplify();
		}
	}

	@Override
	public void setByteValue(FeatureExpr ctx, int index, Conditional<Byte> newValue) {
		if (Conditional.isTautology(ctx)) {
			values[index] = One.valueOf((int)newValue.getValue());	
		} else {
			values[index] = ChoiceFactory.create(ctx, newValue.mapr(new Function<Byte, Conditional<Integer>>() {
	
				@Override
				public Conditional<Integer> apply(Byte x) {
					return One.valueOf((int) x);
				}
				
			}), values[index]).simplify();
		}
	}

	@Override
	public void setCharValue(FeatureExpr ctx, int index, Conditional<Character> newValue) {
		values[index] = ChoiceFactory.create(ctx, newValue.mapr(SetCharValue), values[index]).simplify();
	}
	
	private static final Function<Character, Conditional<Integer>> SetCharValue = new Function<Character, Conditional<Integer>>() {
		@Override
		public Conditional<Integer> apply(final Character newValue) {
			return new One<>((int) newValue.charValue());
		}
	};

	@Override
	public void setShortValue(FeatureExpr ctx, int index, Conditional<Short> newValue) {
		
		if (Conditional.isTautology(ctx)) {
			values[index] = new One<>((int)(newValue.getValue()));	
		} else {
			values[index] = ChoiceFactory.create(ctx, newValue.mapr(new Function<Short, Conditional<Integer>>() {
	
				@Override
				public Conditional<Integer> apply(Short v) {
					return new One<>((int)v);
				}
				
			}), values[index]).simplify();
		}
	}

	@Override
	public void setFloatValue(FeatureExpr ctx, int index, Conditional<Float> newValue) {
		if (Conditional.isTautology(ctx)) {
			values[index] = new One<>(Types.floatToInt(newValue.getValue()));	
		} else {
			values[index] = ChoiceFactory.create(ctx, newValue.map(new Function<Float, Integer>() {
	
				@Override
				public Integer apply(Float v) {
					return Types.floatToInt(v);
				}
				
			}), values[index]).simplify();
		}
	}

	@Override
	public void setIntValue(FeatureExpr ctx, int pos, Conditional<Integer> newValue) {
		 if (Conditional.isTautology(ctx)) {
			  values[pos] = newValue;	  
		  } else {
			  values[pos] = ChoiceFactory.create(ctx, newValue, values[pos]).simplify();
		  }
	}

	@Override
	public void setLongValue(FeatureExpr ctx, final int index, Conditional<Long> newValue) {
		newValue.mapf(ctx, new BiConsumer<FeatureExpr, Long>() {

			@Override
			public void accept(FeatureExpr ctx, Long newValue) {
				if (Conditional.isTautology(ctx)) {
					values[index] = new One<>(Types.hiLong(newValue));
					values[index + 1] = new One<>(Types.loLong(newValue));
				} else if (!Conditional.isContradiction(ctx)) {
					values[index] = ChoiceFactory.create(ctx, new One<>(Types.hiLong(newValue)), values[index]);
					values[index + 1] = ChoiceFactory.create(ctx, new One<>(Types.loLong(newValue)), values[index + 1]);
				}
			}

		});
		values[index] = values[index].simplify();
		values[index + 1] = values[index + 1].simplify();
	}

	@Override
	public void setDoubleValue(FeatureExpr ctx, final int index, Conditional<Double> newValue) {
		newValue.mapf(ctx, new BiConsumer<FeatureExpr, Double>() {

			@Override
			public void accept(FeatureExpr ctx, Double newValue) {
				if (Conditional.isTautology(ctx)) {
					values[index] = new One<>(Types.hiDouble(newValue));
					values[index + 1] = new One<>(Types.loDouble(newValue));
				} else if (!Conditional.isContradiction(ctx)) {
					values[index] = ChoiceFactory.create(ctx, new One<>(Types.hiDouble(newValue)), values[index]);
					values[index + 1] = ChoiceFactory.create(ctx, new One<>(Types.loDouble(newValue)), values[index + 1]);
				}
			}

		});
		values[index] = values[index].simplify();
		values[index + 1] = values[index + 1].simplify();
		
	}

	@Override
	public Conditional<Float> getFloatValue(int index) {
		return values[index].map(new Function<Integer, Float>() {
			
			@Override
			public Float apply(Integer v) {
				return Types.intToFloat(v);
			}
		});
	}

	@Override
	public Conditional<Double> getDoubleValue(final int index) {
		return values[index + 1].mapf(CachedFeatureExprFactory.True(), new BiFunction<FeatureExpr, Integer, Conditional<Double>>() {

			@Override
			public Conditional<Double> apply(FeatureExpr ctx, final Integer y) {
				return values[index].mapf(CachedFeatureExprFactory.True(), new BiFunction<FeatureExpr, Integer, Conditional<Double>>() {

					@Override
					public Conditional<Double> apply(FeatureExpr ctx, final Integer x) {
						return new One<>(Types.intsToDouble(y, x));						
					}
				});
			}
		}).simplify();
	}

	/**
	 * Creates a clone.
	 */
	public NamedFields clone() {
		NamedFields f = (NamedFields) cloneFields();
		f.values = values.clone();
		return f;
	}

	/**
	 * Checks for equality.
	 */
	public boolean equals(Object o) {
		if (o instanceof NamedFields) {
			NamedFields other = (NamedFields) o;

			// --- check values
			Conditional<Integer>[] v1 = values;
			Conditional<Integer>[] v2 = other.values;
			int l = v1.length;
			if (l != v2.length) {
				return false;
			}
			for (int i = 0; i < l; i++) {
				if (!v1[i].equals(v2[i])) {
					return false;
				}
			}

			return super.compareAttrs(other);

		} else {
			return false;
		}
	}
	
	public int hashCode() {
		throw new RuntimeException("hashCode not designed");
	}

	// serialization interface
	public void appendTo(IntVector v) {
		v.append(getValues());
		// v.append(values);
	}

	/**
	 * Adds some data to the computation of an hashcode.
	 */
	public void hash(HashData hd) {
		int[] v = getValues();
		for (int i = 0, l = v.length; i < l; i++) {
			hd.add(v[i]);
		}
	}

	/**
	 * Size of the fields.
	 */
	public int size() {
		return values.length;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("NamedFields[");

		sb.append("values=");
		sb.append('[');

		for (int i = 0; i < values.length; i++) {
			if (i != 0) {
				sb.append(',');
			}

			sb.append(values[i]);
		}

		sb.append(']');
		sb.append(',');

		sb.append(']');

		return sb.toString();
	}

	// <2do> replace with copyTo() !!
	public int[] getRawValues() {// TODO jens
		return getValues();
	}

	public void copyFrom(Fields other) {
		System.arraycopy(((NamedFields) other).values, 0, this.values, 0, values.length);
		super.copyAttrs(other);
	}

}
