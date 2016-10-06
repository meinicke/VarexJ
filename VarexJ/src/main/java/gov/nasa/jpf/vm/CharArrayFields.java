//
// Copyright (C) 2008 United States Government as represented by the
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

import java.io.PrintStream;
import java.util.Arrays;

import cmu.conditional.BiFunction;
import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.IntVector;
import gov.nasa.jpf.util.PrintUtils;

/**
 * element values for char[] objects
 */
public class CharArrayFields extends ArrayFields {

	private Conditional<char[]> values;

	public CharArrayFields(int length) {
		values = new One<>(new char[length]);
	}

	public Conditional<char[]> asCharArray() {
		return values;
	}

	@Override
	protected void printValue(PrintStream ps, int idx) {
		PrintUtils.printCharLiteral(ps, values.getValue()[idx]);
	}

	@Override
	public void printElements(PrintStream ps, int max) {
		PrintUtils.printStringLiteral(ps, values.getValue(), max);
	}

	public char[] asCharArray(int offset, int length) {
		char[] result = new char[length];
		System.arraycopy(values.getValue(), offset, result, 0, length);

		return result;
	}

	public Conditional<?> getValues() {
		return values;
	}

	public Conditional<Integer> arrayLength() {
		return values.mapr(ArrayLength).simplifyValues();
	}
	
	private static final Function<char[], Conditional<Integer>> ArrayLength = new Function<char[], Conditional<Integer>>() {
		@Override
		public Conditional<Integer> apply(char[] values) {
			return new One<>(values.length);
		}
	};

	public int getHeapSize() { // in bytes
		return values.getValue().length * 2;
	}

	public void appendTo(IntVector v) {// TODO Jens seems to be no good idea 
		for (char[] value : values.toList()) {
			v.appendPacked(value);
		}
	}

	public CharArrayFields clone() {
		CharArrayFields f = (CharArrayFields) cloneFields();
		try {
			f.values = values.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return f;
	}

	public boolean equals(Object o) {
		if (o instanceof CharArrayFields) {
			CharArrayFields other = (CharArrayFields) o;

			char[] v = values.getValue();
			char[] vOther = other.values.getValue();
			if (v.length != vOther.length) {
				return false;
			}

			for (int i = 0; i < v.length; i++) {
				if (v[i] != vOther[i]) {
					return false;
				}
			}

			return compareAttrs(other);

		} else {
			return false;
		}
	}

	public Conditional<Character> getCharValue(final int pos) {
		return values.map(new Function<char[], Character>() {

			@Override
			public Character apply(char[] values) {
				return values[pos];
			}

		});
	}

	@Override
	public void setCharValue(final FeatureExpr ctx, final int pos, final Conditional<Character> newValue) {
		values = values.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<char[]>>() {

			@Override
			public Conditional<char[]> apply(final FeatureExpr ctx2, final char[] values) {
				if (Conditional.isContradiction(ctx2)) {
					return new One<>(values);
				}
				return newValue.mapf(ctx2, new BiFunction<FeatureExpr, Character, Conditional<char[]>>() {

					@Override
					public Conditional<char[]> apply(FeatureExpr f, Character newValue) {
						if (Conditional.isContradiction(f)) {
							return new One<>(values);
						}
						if (Conditional.isTautology(f)) {
							values[pos] = newValue;
							return new One<>(values);
						}
						char[] clone = new char[values.length];
						System.arraycopy(values, 0, clone, 0, clone.length);
						clone[pos] = newValue;
						return ChoiceFactory.create(ctx, new One<>(clone), new One<>(values));
					}

				});

			}
		}).simplify();

	}

	public void setCharValues(FeatureExpr ctx, char[] v) {
		char[] newValues = new char[v.length];
		System.arraycopy(v, 0, newValues, 0, v.length);
		if (ctx == null) {
			throw new RuntimeException("ctx == null");
		}
		if (Conditional.isTautology(ctx)) {
			values = new One<>(newValues);
		} else {
			values = ChoiceFactory.create(ctx, new One<>(newValues), values).simplify();
		}
	}

	// --- some methods to ease native String operations

	public String asString(int offset, int length) {
		return new String(values.getValue(), offset, length);
	}

	// a special string compare utility
	public boolean equals(int offset, int length, String s) {
		char[] v = values.getValue();

		if (offset + length > v.length) {
			return false;
		}

		for (int i = offset, j = 0; j < length; i++, j++) {
			if (v[i] != s.charAt(j)) {
				return false;
			}
		}

		return true;
	}

	public void hash(HashData hd) {
		char[] v = values.getValue();
		for (int i = 0; i < v.length; i++) {
			hd.add(v[i]);
		}
	}

	@Override
	public void fill(FeatureExpr ctx, final Conditional<?> value) {
		if (Conditional.isTautology(ctx) && value.isOne()) {
			final char[] newArray = new char[values.getValue(true).length];
			Arrays.fill(newArray, (Character) value.getValue());
			values = new One<char[]>(newArray);
		}
		values = values.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<char[]>>() {

			@Override
			public Conditional<char[]> apply(FeatureExpr ctx, char[] y) {
				final Character c = (Character) value.simplify(ctx).getValue();
				final char[] newArray = new char[y.length];
				Arrays.fill(newArray, c);
				if (Conditional.isTautology(ctx)) {
					return new One<char[]>(newArray);
				}
				return ChoiceFactory.create(ctx, new One<char[]>(newArray), new One<char[]>(y));
			}

		});
	}

}
