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

import cmu.conditional.BiFunction;
import cmu.conditional.Function;
import cmu.conditional.One;
import gov.nasa.jpf.annotation.MJI;
import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import org.hamcrest.Condition;

/**
 * MJI NativePeer class for java.lang.Double library abstraction
 */
public class JPF_java_lang_Double extends NativePeer {
  @MJI
  public Conditional<Long> doubleToLongBits__D__J (MJIEnv env, int rcls, Conditional<Double> v0, FeatureExpr ctx) {
//    return Double.doubleToLongBits(v0.getValue());
    return v0.map(new Function<Double, Long>() {
      @Override
      public Long apply(Double x) {
        return Double.doubleToLongBits(x);
      }
    });
  }

  @MJI
  public long doubleToRawLongBits__D__J (MJIEnv env, int rcls, Conditional<Double> v0, FeatureExpr ctx) {
    return Double.doubleToRawLongBits(v0.getValue());
  }

  @MJI
  public Conditional<Double> longBitsToDouble__J__D (MJIEnv env, int rcls, Conditional<Long> v0, FeatureExpr ctx) {
	  return v0.map(new Function<Long, Double>() {

			@Override
			public Double apply(Long v0) {
				return Double.longBitsToDouble(v0);
			}
	  });
  }

//  @MJI
//  public int toString__D__Ljava_lang_String_2 (MJIEnv env, int objref, Conditional<Double> d, FeatureExpr ctx) {
//    return env.newString(ctx, Double.toString(d.getValue()));
//  }

  @MJI
  public Conditional<Integer> toString__D__Ljava_lang_String_2 (final MJIEnv env, int objref, Conditional<Double> d, final FeatureExpr ctx) {
//    final MJIEnv envFinal = env;
//    final FeatureExpr ctxFinal = ctx;
    return d.mapf(ctx, new BiFunction<FeatureExpr, Double, Conditional<Integer>>() {
      @Override
      public Conditional<Integer> apply(FeatureExpr ctx, Double x) {
        return new One(env.newString(ctx, Double.toString(x)));
      }
    });
  }

  // we need to intercept this because it compares double values, which might
  // cause an ArithmeticException to be raised if -check-fp-compare is set (default)
  // but -check-fp isn't, and Double.isInfinit is used to handle the cases
  // explicitly in the program (which is supposed to be the right way)
  @MJI
  public Conditional<Boolean> isInfinite__D__Z (MJIEnv env, int rcls, Conditional<Double> v, FeatureExpr ctx) {
//    return Double.isInfinite(v.getValue());
    return v.map(new Function<Double, Boolean>() {
      @Override
      public Boolean apply(Double x) {
        return Double.isInfinite(x);
      }
    });
  }
  
  // ditto (see isInfinite)
  @MJI
  public Conditional<Boolean> isNaN__D__Z (MJIEnv env, int rcls, Conditional<Double> v, FeatureExpr ctx) {
    return v.map(new Function<Double, Boolean>() {
      @Override
      public Boolean apply(Double x) {
        return Double.isNaN(x);
      }
    });
//    return Double.isNaN(v.getValue());
  }
}
