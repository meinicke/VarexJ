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

import cmu.conditional.BiFunction;
import cmu.conditional.Choice;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.IntVector;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * value container for non-array classes
 */
public class NamedFields extends Fields {

	/**
	 * this is where we store the instance data. Since field types are
	 * heterogenous, we have to map everything into int
	 */
	protected Conditional<Integer>[] values;

	public NamedFields(int dataSize) {
		values = new Conditional[dataSize];

		for (int i = 0; i < values.length; i++) {
			values[i] = new One<>(0);
		}
	}

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

	public Conditional<Integer> getReferenceValue(int index) {
		return values[index];
	}

	// same as above, just here to make intentions clear
	public Conditional<Integer> getReferenceValue2(int index) {
		return values[index];
	}

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

	public boolean getBooleanValue(int index) {
		return Types.intToBoolean(values[index].getValue());
	}

	public Conditional<Byte> getByteValue(int index) {
		return values[index].map(new Function<Integer, Byte>() {

			@Override
			public Byte apply(Integer x) {
				return x.byteValue();
			}
			
		});
	}

	public Conditional<Character> getCharValue(int index) {
		return values[index].map(new GetCharValue());
	}

	private static final class GetCharValue implements Function<Integer, Character> {
		@Override
		public Character apply(final Integer x) {
			return (char) x.intValue();
		}
	}

	public short getShortValue(int index) {
		return (short) values[index].getValue().intValue();
	}

	// <2do> get rid of it!! this is only for internal use, to increase efficiency
	public int[] getValues() {
		return asFieldSlots();
	}

	// --- the field modifier methods (both instance and static)

	public void setReferenceValue(int index, int newValue) {
		setReferenceValue(FeatureExprFactory.True(), index, new One<>(newValue));// TODO jens add ctx
	}

	public void setReferenceValue(FeatureExpr ctx, int index, Conditional<Integer> newValue) {
		if (Conditional.isTautology(ctx)) {
			values[index] = newValue;
		} else {
			values[index] = new Choice<>(ctx, newValue, values[index]).simplify();
		}
	}

	public void setBooleanValue(int index, boolean newValue) {
		values[index] = new One<>(newValue ? 1 : 0);
	}

	public void setByteValue(FeatureExpr ctx, int index, Conditional<Byte> newValue) {
		if (Conditional.isTautology(ctx)) {
			values[index] = new One<>((int)newValue.getValue());	
		} else {
			values[index] = new Choice<>(ctx, newValue.map(new Function<Byte, Integer>() {
	
				@Override
				public Integer apply(Byte x) {
					return (int) x;
				}
				
			}), values[index]).simplify();
		}
	}

	public void setCharValue(FeatureExpr ctx, int index, Conditional<Character> newValue) {
		values[index] = newValue.map(new SetCharValue());
	}
	
	private static final class SetCharValue implements Function<Character, Integer> {
		@Override
		public Integer apply(final Character newValue) {
			return (int) newValue.charValue();
		}
	}

	public void setShortValue(int index, short newValue) {
		values[index] = new One<>((int) newValue);
	}

	public void setFloatValue(int index, float newValue) {
		values[index] = new One<>(Types.floatToInt(newValue));
	}

	public void setIntValue(FeatureExpr ctx, int index, int newValue) {
		if (Conditional.isTautology(ctx)) {
			values[index] = new One<>(newValue);
		} else {
			values[index] = new Choice<>(ctx, new One<>(newValue), values[index]).simplify();
		}
	}

	public void setIntValue(FeatureExpr ctx, int index, Conditional<Integer> newValue) {
		values[index] = new Choice<>(ctx, newValue, values[index]).simplify();;
	}

	@Override
	public void setLongValue(FeatureExpr ctx, final int index, Conditional<Long> newValue) {
		newValue.mapf(ctx, new BiFunction<FeatureExpr, Long, Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(FeatureExpr ctx, Long newValue) {
				if (Conditional.isTautology(ctx)) {
					values[index] = new One<>(Types.hiLong(newValue));
					values[index + 1] = new One<>(Types.loLong(newValue));
				} else if (!Conditional.isContradiction(ctx)) {
					values[index] = new Choice<>(ctx, new One<>(Types.hiLong(newValue)), values[index]);
					values[index + 1] = new Choice<>(ctx, new One<>(Types.loLong(newValue)), values[index + 1]);
				}
				return null;
			}

		});
		values[index] = values[index].simplify();
		values[index + 1] = values[index + 1].simplify();
	}

	@Override
	public void setDoubleValue(FeatureExpr ctx, final int index, Conditional<Double> newValue) {
		newValue.mapf(ctx, new BiFunction<FeatureExpr, Double, Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(FeatureExpr ctx, Double newValue) {
				if (Conditional.isTautology(ctx)) {
					values[index] = new One<>(Types.hiDouble(newValue));
					values[index + 1] = new One<>(Types.loDouble(newValue));
				} else if (!Conditional.isContradiction(ctx)) {
					values[index] = new Choice<>(ctx, new One<>(Types.hiDouble(newValue)), values[index]);
					values[index + 1] = new Choice<>(ctx, new One<>(Types.loDouble(newValue)), values[index + 1]);
				}
				return null;
			}

		});
		values[index] = values[index].simplify();
		values[index + 1] = values[index + 1].simplify();
		
	}

	public float getFloatValue(int index) {
		return Types.intToFloat(values[index].getValue());
	}

	public Conditional<Double> getDoubleValue(int index) {
		return new One<>(Types.intsToDouble(values[index + 1].getValue(), values[index].getValue()));
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
				if (v1[i].equals(v2[i])) {
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
	public int[] getRawValues() {
		return getValues();
	}

	public void copyFrom(Fields other) {
		System.arraycopy(((NamedFields) other).values, 0, this.values, 0, values.length);
		super.copyAttrs(other);
	}

}
