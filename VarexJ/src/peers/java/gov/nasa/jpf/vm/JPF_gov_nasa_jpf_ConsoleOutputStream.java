//
// Copyright (C) 2007 United States Government as represented by the
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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.RuntimeConstants;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class to intercept all System.out and System.err
 * printing. We handle all of this native, since it's already slow enough
 */
public class JPF_gov_nasa_jpf_ConsoleOutputStream extends NativePeer {

	/****************************************************************************
	 * these are the native methods we intercept
	 */

	@MJI
	public void $init____V(MJIEnv env, int objref, FeatureExpr ctx) {
		// that's just a dummy because we have no OutputStream, which would cause
		// an exception in the PrintStream ctor
	}

	@MJI
	public void print__C__V(final MJIEnv env, final int objref, Conditional<Character> c, FeatureExpr ctx) {
		c.mapf(ctx, new BiConsumer<FeatureExpr, Character>() {

			@Override
			public void accept(FeatureExpr ctx, Character c) {
				if (RuntimeConstants.ctxOutput) {
					env.getVM().print("(<" + c + "> : " + Conditional.getCTXString(ctx) + ")");
				} else {
					env.getVM().print(c);
				}
			}

		});
	}
	
	@MJI
	public void print__B__V(MJIEnv env, int objref, byte b, FeatureExpr ctx) {
		if (RuntimeConstants.ctxOutput) {
			env.getVM().print("(<" + b + "> : " + Conditional.getCTXString(ctx) + ")");
		} else {
			env.getVM().print(b);
		}
	}

	@MJI
	public void print__D__V(MJIEnv env, int objref, double d, FeatureExpr ctx) {
		env.getVM().print(d);
	}

	@MJI
	public void print__F__V(MJIEnv env, int objref, float f, FeatureExpr ctx) {
		env.getVM().print(f);
	}

	@MJI
	public void print__I__V(MJIEnv env, int objref, int i, FeatureExpr ctx) {
		if (RuntimeConstants.ctxOutput) {
			env.getVM().print("(<" + i + "> : " + Conditional.getCTXString(ctx) + ")");
		} else {
			env.getVM().print(i);
		}
	}

	@MJI
	public void print__J__V(MJIEnv env, int objref, long j, FeatureExpr ctx) {
		env.getVM().print(j);
	}

	@MJI
	public void print__Ljava_lang_String_2__V(final MJIEnv env, int objRef, Conditional<Integer> strRef, FeatureExpr ctx) {
		Conditional<String> strings = strRef.mapr(new Function<Integer, Conditional<String>>() {

			@Override
			public Conditional<String> apply(Integer strRef) {
				return env.getConditionalStringObject(strRef);
			}
			
		});
		Map<String, FeatureExpr> map = strings.toMap();
		for (Entry<String, FeatureExpr> s : map.entrySet()) {
			if (RuntimeConstants.ctxOutput) {
				if (!Conditional.isContradiction(Conditional.and(s.getValue(),ctx))) {
					env.getVM().print("(<" + s.getKey() + "> : " + Conditional.getCTXString(Conditional.and(s.getValue(), ctx)) + ')');
				}
			} else {
				env.getVM().print(s.getKey());
			}
		}
		
	}

	@MJI
	public void print__Z__V(MJIEnv env, int objref, boolean z, FeatureExpr ctx) {
		env.getVM().print(z);
	}

	@MJI
	public void println____V(MJIEnv env, int objRef, FeatureExpr ctx) {
		if (RuntimeConstants.ctxOutput) {
			env.getVM().println("<> : " + Conditional.getCTXString(ctx));
		} else {
			env.getVM().println();
		}
	}

	@MJI
	public void println__C__V(MJIEnv env, int objref, char c, FeatureExpr ctx) {
		env.getVM().print(c);
		env.getVM().println();
	}

	@MJI
	public void println__D__V(final MJIEnv env, int objref, Conditional<Double> d, FeatureExpr ctx) {
		d.mapf(ctx, new BiConsumer<FeatureExpr, Double>() {

			@Override
			public void accept(FeatureExpr ctx, Double d) {
				if (RuntimeConstants.ctxOutput) {
					env.getVM().println("<" + d + "> : " + Conditional.getCTXString(ctx));
				} else {
					env.getVM().print(d);
					env.getVM().println();

				}
			}

		});
	}

	@MJI
	public void println__F__V(final MJIEnv env, int objref, Conditional<Float> f, FeatureExpr ctx) {
		f.mapf(ctx, new BiConsumer<FeatureExpr, Float>() {

			@Override
			public void accept(FeatureExpr ctx, Float f) {
				if (RuntimeConstants.ctxOutput) {
					env.getVM().println("<" + f + "> : " + Conditional.getCTXString(ctx));
				} else {
					env.getVM().print(f);
					env.getVM().println();

				}
			}

		});
	}

	@MJI
	public void println__I__V(final MJIEnv env, int objref, Conditional<Integer> i, FeatureExpr ctx) {
		i.mapf(ctx, new BiConsumer<FeatureExpr, Integer>() {

			@Override
			public void accept(FeatureExpr ctx, Integer i) {
				if (RuntimeConstants.ctxOutput) {
					env.getVM().println("<" + i + "> : " + Conditional.getCTXString(ctx));
				} else {
					env.getVM().print(i);
					env.getVM().println();

				}
			}

		});
	}

	@MJI
	public void println__J__V(final MJIEnv env, int objref, Conditional<Long> l, FeatureExpr ctx) {
		l.mapf(ctx, new BiConsumer<FeatureExpr, Long>() {

			@Override
			public void accept(FeatureExpr ctx, Long l) {
				if (RuntimeConstants.ctxOutput) {
					env.getVM().println("<" + l + "> : " + Conditional.getCTXString(ctx));
				} else {
					env.getVM().print(l);
					env.getVM().println();
				}
			}

		});
	}
	
	public static String testIdentifyer = "test";
	public static Map<String, BDDFeatureExpr> testExpressions = new HashMap<>(); 

	@MJI
	public void println__Ljava_lang_String_2__V(final MJIEnv env, int objRef, Conditional<Integer> strRef, FeatureExpr ctx) {
		Conditional<String> strings = strRef.mapr(new Function<Integer, Conditional<String>>() {

			@Override
			public Conditional<String> apply(Integer strRef) {
				return env.getConditionalStringObject(strRef);
			}
		});
		Map<String, FeatureExpr> map = strings.toMap();
		for (Entry<String, FeatureExpr> s : map.entrySet()) {
			if (RuntimeConstants.ctxOutput) {
				final FeatureExpr and = Conditional.and(s.getValue(), ctx);
				if (!Conditional.isContradiction(and)) {
					if (s.getKey().startsWith("test")) {
						testExpressions.put(s.getKey(), (BDDFeatureExpr) and);
					} else {
						env.getVM().println('{' + s.getKey() + "} : " + Conditional.getCTXString(and));
					}
				}
			} else {
				env.getVM().println(s.getKey());
			}
		}
	}

	@MJI
	public void write__I__V(MJIEnv env, int objRef, int b, FeatureExpr ctx) {
		try {
			env.getVM().print('<' + ((char) (byte) b) + "> : " + Conditional.getCTXString(ctx));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@MJI
	public void write___3BII__V(MJIEnv env, int objRef, int bufRef, int off, int len, FeatureExpr ctx) {
		final Conditional<Byte>[] buffer = env.getByteArrayObject(ctx, bufRef);

		final StringBuilder sb = new StringBuilder(len);
		while (len > 0) {
			Conditional<Byte> value = buffer[off++].simplify(ctx);
			if (value instanceof One) {
				sb.append((char) value.getValue().byteValue());
			} else {
				sb.append(value.map(new Function<Byte, Character>() {

					@Override
					public Character apply(Byte b) {
						return Character.valueOf((char) b.byteValue());
					}
				}));
			}
			len--;
		}
		env.getVM().println('<' + sb.toString() + "> : " + Conditional.getCTXString(ctx));
	}

	@MJI
	public void println__Z__V(final MJIEnv env, int objref, Conditional<Boolean> z, FeatureExpr ctx) {
		z.mapf(ctx, new BiConsumer<FeatureExpr, Boolean>() {

			@Override
			public void accept(FeatureExpr ctx, Boolean z) {
				if (RuntimeConstants.ctxOutput) {
					env.getVM().println("<" + z + "> : " + Conditional.getCTXString(ctx));
				} else {
					env.getVM().print(z);
					env.getVM().println();

				}
			}

		});
	}

	@MJI
	public int printf__Ljava_lang_String_2_3Ljava_lang_Object_2__Ljava_io_PrintStream_2(MJIEnv env, int objref, int fmtRef, int argRef, FeatureExpr ctx) {
		Conditional<String> formatedString = env.format(ctx, fmtRef, argRef);
		for (Entry<String, FeatureExpr> s : formatedString.toMap().entrySet()) {
			if (RuntimeConstants.ctxOutput) {
				final FeatureExpr and = Conditional.and(s.getValue(), ctx);
				if (!Conditional.isContradiction(and)) {
					env.getVM().println('{' + s.getKey() + "} : " + Conditional.getCTXString(and));
				}
			} else {
				env.getVM().println(s.getKey());
			}
		}
		return objref;
	}

}
