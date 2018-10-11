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

import java.util.function.BiFunction;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.Long library abstraction
 */
@SuppressWarnings("deprecation")
public class JPF_java_lang_Long extends NativePeer {
  // <2do> at this point we deliberately do not override clinit

	@MJI
	public Conditional<Long> parseLong__Ljava_lang_String_2I__J(MJIEnv env, int clsObjRef, int strRef, int radix,
			FeatureExpr ctx) {
		Conditional<String> string = env.getStringObjectNew(ctx, strRef);
		return string.mapf(ctx, new BiFunction<FeatureExpr, String, Conditional<Long>>() {

			@Override
			public Conditional<Long> apply(FeatureExpr ctx, String s) {
				try {
					return new One<>(Long.parseLong(s, radix));
				} catch (NumberFormatException e) {
					env.throwException(ctx, "java.lang.NumberFormatException");

					return new One<>(0l);
				}
			}

		});
    
  }

  @MJI
  public long parseLong__Ljava_lang_String_2__J (MJIEnv env, int clsObjRef, 
                                                     int strRef, FeatureExpr ctx) {
    try {
      return Long.parseLong(env.getStringObject(ctx, strRef));
    } catch (NumberFormatException e) {
      env.throwException(ctx, "java.lang.NumberFormatException");

      return 0;
    }
  }

  @MJI
  public int toBinaryString__J__Ljava_lang_String_2 (MJIEnv env, int objref, long val, FeatureExpr ctx) {
    return env.newString(ctx, Long.toBinaryString(val));
  }

  @MJI
  public int toHexString__J__Ljava_lang_String_2 (MJIEnv env, int objref, long val, FeatureExpr ctx) {
    return env.newString(ctx, Long.toHexString(val));
  }

  @MJI
  public int toOctalString__J__Ljava_lang_String_2 (MJIEnv env, int objref, long val, FeatureExpr ctx) {
    return env.newString(ctx, Long.toOctalString(val));
  }

  @MJI
  public int toString__J__Ljava_lang_String_2 (MJIEnv env, int objref, long val, FeatureExpr ctx) {
    return env.newString(ctx, Long.toString(val));
  }

  @MJI
  public int toString__JI__Ljava_lang_String_2 (MJIEnv env, int objref, long val, int radix, FeatureExpr ctx) {
    return env.newString(ctx, Long.toString(val, radix));
  }

//  @MJI
  public int valueOf__J__Ljava_lang_Long_2 (MJIEnv env, int clsRef, long val, FeatureExpr ctx) {
    return env.valueOfLong(ctx, val);
  }
}
