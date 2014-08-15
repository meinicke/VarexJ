//
// Copyright (C) 2006 United States Government as represented by the
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

import gov.nasa.jpf.annotation.MJI;
import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class JPF_java_lang_StringBuilder extends NativePeer {

	@Deprecated
	int appendString(FeatureExpr ctx, MJIEnv env, int objref, String s) {
		return appendString(ctx, env, objref, new One<>(s));
	}

	int appendString(FeatureExpr ctx, final MJIEnv env, final int objref, final Conditional<String> conditionalS) {
		Conditional<Integer> condAref = env.getReferenceField(ctx, objref, "value");

		condAref.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(FeatureExpr ctx, final Integer aref) {
				conditionalS.mapf(ctx, new BiFunction<FeatureExpr, String, Conditional<Object>>() {

					@Override
					public Conditional<Object> apply(FeatureExpr ctx, final String s) {
						final int slen = s.length();
						final int alen = env.getArrayLength(ctx, aref);
						Conditional<Integer> count = env.getIntField(objref, "count");
						count.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Object>>() {

							@Override
							public Conditional<Object> apply(FeatureExpr ctx, Integer count) {
								if (Conditional.isContradiction(ctx)) {
									return null;
								}
								int i, j;
								int n = count + slen;

								if (n < alen) {
									for (i = count, j = 0; i < n; i++, j++) {
										env.setCharArrayElement(ctx, aref, i, new One<>(s.charAt(j)));
									}
								} else {
									int m = 3 * alen / 2;
									if (m < n) {
										m = n;
									}
									int arefNew = env.newCharArray(ctx, m);
									for (i = 0; i < count; i++) {
										env.setCharArrayElement(ctx, arefNew, i, env.getCharArrayElement(aref, i));
									}
									for (j = 0; i < n; i++, j++) {
										env.setCharArrayElement(ctx, arefNew, i, new One<>(s.charAt(j)));
									}
									env.setReferenceField(ctx, objref, "value", arefNew);
								}

								env.setIntField(ctx, objref, "count", new One<>(n));

								return null;
							}

						});

						return null;
					}

				});

				return null;
			}
		});
		return objref;
	}

	// we skip the AbstractStringBuilder ctor here, which is a bit dangerous
	// This is only justified because StringBuilders are used everywhere (implicitly)
	@MJI
	public void $init____V(MJIEnv env, int objref, FeatureExpr ctx) {
		int aref = env.newCharArray(ctx, 16);
		env.setReferenceField(ctx, objref, "value", aref);
	}

	@MJI
	public void $init__I__V(MJIEnv env, int objref, int len, FeatureExpr ctx) {
		int aref = env.newCharArray(ctx, len);
		env.setReferenceField(ctx, objref, "value", aref);
	}

	@MJI// TODO can be improved
	public void $init__Ljava_lang_String_2__V(final MJIEnv env, final int objref, Conditional<Integer> sRef, FeatureExpr ctx) {
		sRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Object>>() {

			@Override
			public Conditional<Object> apply(FeatureExpr ctx, Integer sRef) {
				if (sRef.intValue() == MJIEnv.NULL) {
					env.throwException(ctx, "java.lang.NullPointerException");
					return null;
				}

				Conditional<char[]> src = env.getStringChars(sRef);

				src.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<Object>>() {

					@Override
					public Conditional<Object> apply(final FeatureExpr ctx, final char[] src) {
						if (Conditional.isContradiction(ctx)) {
							return null;
						}
						int aref = env.newCharArray(ctx, src.length + 16);
						// char[] dst = env.getCharArrayObject(aref).getValue();
						for (int i = 0; i < src.length; i++) {
							env.setCharArrayElement(ctx, aref, i, new One<>(src[i]));
						}
						// System.arraycopy(src, 0, dst, 0, src.length);
						env.setReferenceField(ctx, objref, "value", aref);
						env.setIntField(ctx, objref, "count", new One<>(src.length));
						return null;
					}

				});
				return null;
			}

		});
	}

	@MJI
	public int append__Ljava_lang_String_2__Ljava_lang_StringBuilder_2(final MJIEnv env, int objref, Conditional<Integer> sref, FeatureExpr ctx) {
		Conditional<String> s = sref.mapr(new Function<Integer, Conditional<String>>() {

			@Override
			public Conditional<String> apply(Integer sref) {
				return env.getConditionalStringObject(sref);
			}

		});
		s = s.simplify(ctx).map(new ReplaceNull()).simplifyValues();
		return appendString(ctx, env, objref, s);
	}

	private static final class ReplaceNull implements Function<String, String> {
		@Override
		public String apply(final String s) {
			if (s == null) {
				return "null";
			}
			return s;
		}
	}

	@MJI
	public int append__I__Ljava_lang_StringBuilder_2(MJIEnv env, int objref, Conditional<Integer> i, FeatureExpr ctx) {
		Conditional<String> s = i.map(new Function<Integer, String>() {

			@Override
			public String apply(Integer i) {
				return Integer.toString(i);
			}

		});

		return appendString(ctx, env, objref, s);
	}

	@MJI
	public int append__F__Ljava_lang_StringBuilder_2(MJIEnv env, int objref, float f, FeatureExpr ctx) {
		String s = Float.toString(f);

		return appendString(ctx, env, objref, s);
	}

	@MJI
	public int append__D__Ljava_lang_StringBuilder_2(MJIEnv env, int objref, Conditional<Double> d, FeatureExpr ctx) {
		Conditional<String> s = d.map(new Function<Double, String>() {

			@Override
			public String apply(Double d) {
				return Double.toString(d);
			}

		});

		return appendString(ctx, env, objref, s);
	}

	@MJI
	public int append__J__Ljava_lang_StringBuilder_2(MJIEnv env, int objref, Conditional<Long> l, FeatureExpr ctx) {
		Conditional<String> s = l.map(new Function<Long, String>() {

			@Override
			public String apply(Long l) {
				return Long.toString(l);
			}

		});

		return appendString(ctx, env, objref, s);
	}

	@MJI
	public int append__Z__Ljava_lang_StringBuilder_2(MJIEnv env, int objref, Conditional<Boolean> b, FeatureExpr ctx) {
		Conditional<String> s = b.map(new Function<Boolean, String>() {

			@Override
			public String apply(Boolean b) {
				return b ? "true" : "false";
			}

		});

		return appendString(ctx, env, objref, s);
	}

	@MJI
	public int append__C__Ljava_lang_StringBuilder_2(MJIEnv env, int objref, char c, FeatureExpr ctx) {
		return appendString(ctx, env, objref, c + "");
		//
		// int aref = env.getReferenceField(ctx, objref, "value").getValue();
		// int alen = env.getArrayLength(aref);
		//
		// int count = env.getIntField(ctx, objref, "count").getValue().intValue();
		// int i;
		// int n = count +1;
		//
		// if (n < alen) {
		// env.setCharArrayElement(ctx, aref, count, c);
		// } else {
		// int m = 3 * alen / 2;
		// int arefNew = env.newCharArray(ctx, m);
		// for (i=0; i<count; i++) {
		// env.setCharArrayElement(ctx, arefNew, i, env.getCharArrayElement(aref, i).getValue());
		// }
		// env.setCharArrayElement(ctx, arefNew, count, c);
		// env.setReferenceField(ctx, objref, "value", arefNew);
		// }
		//
		// env.setIntField(ctx, objref, "count", n);
		//
		// return objref;

	}

	@MJI
	public int toString____Ljava_lang_String_2(final MJIEnv env, final int objref, FeatureExpr ctx) {

		Conditional<Integer> aref = env.getReferenceField(ctx, objref, "value");
		Conditional<String> s = aref.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

			@Override
			public Conditional<String> apply(FeatureExpr ctx, Integer aref) {
				Conditional<char[]> buf = env.getCharArrayObject(aref).simplify(ctx);
				return buf.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<String>>() {

					@Override
					public Conditional<String> apply(FeatureExpr ctx, final char[] buf) {
						final Conditional<Integer> count = env.getIntField(objref, "count").simplify(ctx);
						return count.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<String>>() {

							@Override
							public Conditional<String> apply(FeatureExpr ctx, Integer count) {
								return new One<>(new String(buf, 0, count));
							}

						});

					}
				});
			}
		}).simplify();

		return env.newString(ctx, s);
	}
}
