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

import java.util.function.BiConsumer;
import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.StringBuffer library abstraction
 */
public class JPF_java_lang_StringBuffer extends NativePeer {

	boolean hasSharedField = false; // Java 1.4 has, 1.5 doesn't

	@MJI
	public void $clinit____V(MJIEnv env, int clsObjRef, FeatureExpr ctx) {
		// apparently, Java 1.5 has changed the implementation of class
		// StringBuffer so that it doesn't use the 'shared' state anymore
		// (which was a performance hack to avoid copying the char array
		// data when creating String objects from subsequently unmodified
		// StringBuffers
		// adding this little extra logic here also serves the purpose of
		// avoiding a native ObjectStreamClass method which is called during
		// the static StringBuffer init
		ClassInfo ci = env.getClassInfo();
		if (ci.getInstanceField("shared") != null) {
			hasSharedField = true;
		}
	}

	@Deprecated
	int appendString(MJIEnv env, int objref, String s, FeatureExpr ctx) {
		return appendString(env, objref, new One<>(s), ctx);
	}

	int appendString(final MJIEnv env, final int objref, final Conditional<String> s, FeatureExpr ctx) {
		try {
			final Conditional<Integer> aref = env.getReferenceField(ctx, objref, "value");
			aref.mapf(ctx, new BiConsumer<FeatureExpr, Integer>() {
	
				@Override
				public void accept(FeatureExpr ctx, final Integer aref) {
					final int alen = env.getArrayLength(ctx, aref);
					s.mapf(ctx, new BiConsumer<FeatureExpr, String>() {
	
						@Override
						public void accept(FeatureExpr ctx, final String s) {
							final int slen = s.length();
							Conditional<Integer> count = env.getIntField(objref, "count");
							count.mapf(ctx, new BiConsumer<FeatureExpr, Integer>() {
	
								@Override
								public void accept(FeatureExpr ctx, Integer count) {
									if (Conditional.isContradiction(ctx)) {
										return;
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
	
									if (hasSharedField) {
										env.setBooleanField(ctx, objref, "shared", One.FALSE);
									}
									env.setIntField(ctx, objref, "count", new One<>(n));
								}
	
							});
						}
	
					});
				}
	
			});
		} catch (Exception e) {
			System.out.println("JPF_java_lang_StringBuffer.appendString()");
			System.out.println(e);
			for (StackTraceElement t : e.getStackTrace()) {
				System.out.println(t);
			}
			
		}

		return objref;
	}

	/*
	 * public static int append__Ljava_lang_StringBuffer_2 (MJIEnv env, int objref, int sbref) {
	 * int vref = env.getReferenceField(sbref, "value");
	 * int sbCount = env.getIntField(sbref, "count");
	 * // how braindead, how lazy
	 * char[] b = env.getCharArrayObject(vref);
	 * String s = new String(b, 0, sbCount);
	 * return appendString(env, objref, s);
	 * }
	 */

	@MJI
	public int append__Ljava_lang_String_2__Ljava_lang_StringBuffer_2(final MJIEnv env, int objref, Conditional<Integer> sref, FeatureExpr ctx) {
		Conditional<String> s = sref.mapr(new Function<Integer, Conditional<String>>() {

			@Override
			public Conditional<String> apply(Integer sref) {
				return env.getConditionalStringObject(sref);
			}

		});
		s = s.simplify(ctx).map(new Function<String, String>() {

			@Override
			public String apply(final String s) {
				if (s == null) {
					return "null";
				}
				return s;
			}
		}).simplifyValues();
		return appendString(env, objref, s, ctx);
	}

	@MJI
	public int append__I__Ljava_lang_StringBuffer_2(MJIEnv env, int objref, int i, FeatureExpr ctx) {
		String s = Integer.toString(i);

		return appendString(env, objref, s, ctx);
	}

	@MJI
	public int append__F__Ljava_lang_StringBuffer_2(MJIEnv env, int objref, float f, FeatureExpr ctx) {
		String s = Float.toString(f);

		return appendString(env, objref, s, ctx);
	}

	@MJI
	public int append__D__Ljava_lang_StringBuffer_2(MJIEnv env, int objref, double d, FeatureExpr ctx) {
		String s = Double.toString(d);

		return appendString(env, objref, s, ctx);
	}

	@MJI
	public int append__J__Ljava_lang_StringBuffer_2(MJIEnv env, int objref, long l, FeatureExpr ctx) {
		String s = Long.toString(l);

		return appendString(env, objref, s, ctx);
	}

	@MJI
	public int append__Z__Ljava_lang_StringBuffer_2(MJIEnv env, int objref, boolean b, FeatureExpr ctx) {
		String s = b ? "true" : "false";

		return appendString(env, objref, s, ctx);
	}

	/*
	 * public static int append__B__Ljava_lang_StringBuffer_2 (MJIEnv env, int objref, byte b) {
	 * return append__C__Ljava_lang_StringBuffer_2(env, objref, (char)b);
	 * }
	 */

	@MJI
	public int append__C__Ljava_lang_StringBuffer_2(MJIEnv env, int objref, char c, FeatureExpr ctx) {
		return appendString(env, objref, "" + c, ctx);
		// int aref = env.getReferenceField(ctx, objref, "value").getValue();
		// int alen = env.getArrayLength(ctx, aref);
		//
		// int count = env.getIntField(objref, "count").getValue().intValue();
		// int n = count + 1;
		//
		// if (n < alen) {
		// env.setCharArrayElement(ctx, aref, count, new One<>(c));
		// } else {
		// int m = 3 * alen / 2;
		// int arefNew = env.newCharArray(ctx, m);
		// for (int i = 0; i < count; i++) {
		// env.setCharArrayElement(ctx, arefNew, i, env.getCharArrayElement(aref, i));
		// }
		// env.setCharArrayElement(ctx, arefNew, count, new One<>(c));
		// env.setReferenceField(ctx, objref, "value", arefNew);
		// }
		//
		// if (hasSharedField) {
		// env.setBooleanField(ctx, objref, "shared", new One<>(false));
		// }
		// env.setIntField(ctx, objref, "count", new One<>(n));
		//
		// return objref;

	}
}
