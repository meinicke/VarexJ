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
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * MJI NativePeer class for java.lang.Math library abstraction
 */
public class JPF_java_lang_Math extends NativePeer {

	// <2do> those are here to hide their implementation from traces, not to
	// increase performance. If we want to do that, we should probably inline
	// their real implementation here, instead of delegating (just a compromise)
	@MJI
	public double abs__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		// return Math.abs(a);

		return (a <= .0) ? (.0 - a) : a;
	}

	@MJI
	public float abs__F__F(MJIEnv env, int clsObjRef, float a, FeatureExpr ctx) {
		return Math.abs(a);
	}

	@MJI
	public int abs__I__I(MJIEnv env, int clsObjRef, int a, FeatureExpr ctx) {
		// return Math.abs(a);
		return (a < 0) ? -a : a; // that's probably slightly faster
	}

	@MJI
	public long abs__J__J(MJIEnv env, int clsObjRef, long a, FeatureExpr ctx) {
		// return Math.abs(a);

		return (a < 0) ? -a : a;
	}

	@MJI
	public Conditional<Double> max__DD__D(MJIEnv env, int clsObjRef, final Conditional<Double> a, final Conditional<Double> b, FeatureExpr ctx) {
		return a.mapr(new Function<Double, Conditional<Double>>() {

			@Override
			public Conditional<Double> apply(final Double a) {
				return b.mapr(new Function<Double, Conditional<Double>>() {

					@Override
					public Conditional<Double> apply(Double b) {
						return new One<>(Math.max(a, b));
					}

				});
			}
		}).simplify();
	}

	@MJI
	public Conditional<Float> max__FF__F(MJIEnv env, int clsObjRef, Conditional<Float> a, final Conditional<Float> b, FeatureExpr ctx) {
		return a.mapr(new Function<Float, Conditional<Float>>() {

			@Override
			public Conditional<Float> apply(final Float a) {
				return b.mapr(new Function<Float, Conditional<Float>>() {

					@Override
					public Conditional<Float> apply(Float b) {
						return new One<>(Math.max(a, b));
					}

				});
			}
		}).simplify();
	}

	@MJI
	public Conditional<Integer> max__II__I(MJIEnv env, int clsObjRef, Conditional<Integer> a, final Conditional<Integer> b, FeatureExpr ctx) {
		return a.mapr(new Function<Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(final Integer a) {
				return b.mapr(new Function<Integer, Conditional<Integer>>() {

					@Override
					public Conditional<Integer> apply(Integer b) {
						return new One<>((a >= b) ? a : b);
					}

				});
			}
		}).simplify();
	}

	@MJI
	public Conditional<Long> max__JJ__J(MJIEnv env, int clsObjRef, Conditional<Long> a, final Conditional<Long> b, FeatureExpr ctx) {
		return a.mapr(new Function<Long, Conditional<Long>>() {

			@Override
			public Conditional<Long> apply(final Long a) {
				return b.mapr(new Function<Long, Conditional<Long>>() {

					@Override
					public Conditional<Long> apply(Long b) {
						return new One<>(Math.max(a, b));
					}

				});
			}
		}).simplify();
	}

	@MJI
	public Conditional<Double> min__DD__D(MJIEnv env, int clsObjRef, Conditional<Double> a, final Conditional<Double> b, FeatureExpr ctx) {
		return a.mapr(new Function<Double, Conditional<Double>>() {

			@Override
			public Conditional<Double> apply(final Double a) {
				return b.mapr(new Function<Double, Conditional<Double>>() {

					@Override
					public Conditional<Double> apply(Double b) {
						return new One<>(Math.min(a, b));
					}

				});
			}
		}).simplify();
	}

	@MJI
	public Conditional<Float> min__FF__F(MJIEnv env, int clsObjRef, Conditional<Float> a, final Conditional<Float> b, FeatureExpr ctx) {
		return a.mapr(new Function<Float, Conditional<Float>>() {

			@Override
			public Conditional<Float> apply(final Float a) {
				return b.mapr(new Function<Float, Conditional<Float>>() {

					@Override
					public Conditional<Float> apply(Float b) {
						return new One<>(Math.min(a, b));
					}

				});
			}
		}).simplify();
	}

	@MJI
	public Conditional<Integer> min__II__I(MJIEnv env, int clsObjRef, Conditional<Integer> a, final Conditional<Integer> b, FeatureExpr ctx) {
		return a.mapr(new Function<Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(final Integer a) {
				return b.mapr(new Function<Integer, Conditional<Integer>>() {

					@Override
					public Conditional<Integer> apply(Integer b) {
						return new One<>(Math.min(a, b));
					}

				});
			}
		}).simplify();
	}

	@MJI
	public Conditional<Long> min__JJ__J(MJIEnv env, int clsObjRef, Conditional<Long> a, final Conditional<Long> b, FeatureExpr ctx) {
		return a.mapr(new Function<Long, Conditional<Long>>() {

			@Override
			public Conditional<Long> apply(final Long a) {
				return b.mapr(new Function<Long, Conditional<Long>>() {

					@Override
					public Conditional<Long> apply(Long b) {
						return new One<>(Math.min(a, b));
					}

				});
			}
		}).simplify();
	}

	@MJI
	public double pow__DD__D(MJIEnv env, int clsObjRef, double a, double b, FeatureExpr ctx) {
		return Math.pow(a, b);
	}

	@MJI
	public double sqrt__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.sqrt(a);
	}

	@MJI
	public double random____D(MJIEnv env, int clsObjRef, FeatureExpr ctx) {
		return Math.random();
	}

	@MJI
	public long round__D__J(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.round(a);
	}

	@MJI
	public double exp__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.exp(a);
	}

	@MJI
	public double asin__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.asin(a);
	}

	@MJI
	public double acos__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.acos(a);
	}

	@MJI
	public double atan__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.atan(a);
	}

	@MJI
	public double atan2__DD__D(MJIEnv env, int clsObjRef, double a, double b, FeatureExpr ctx) {
		return Math.atan2(a, b);
	}

	@MJI
	public double ceil__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.ceil(a);
	}

	@MJI
	public double cos__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.cos(a);
	}

	@MJI
	public double floor__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.floor(a);
	}

	@MJI
	public double log10__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.log10(a);
	}

	@MJI
	public double log__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.log(a);
	}

	@MJI
	public double rint__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.rint(a);
	}

	@MJI
	public double sin__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.sin(a);
	}

	@MJI
	public double tan__D__D(MJIEnv env, int clsObjRef, double a, FeatureExpr ctx) {
		return Math.tan(a);
	}
}
