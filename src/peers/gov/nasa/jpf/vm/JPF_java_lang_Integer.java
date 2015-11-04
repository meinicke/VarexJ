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

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.Integer library abstraction
 */
@SuppressWarnings("deprecation")
public class JPF_java_lang_Integer extends NativePeer {
  // <2do> at this point we deliberately do not override clinit

  @MJI
  public int parseInt__Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, 
                                                   int strRef, FeatureExpr ctx) {
    try {
      return Integer.parseInt(env.getStringObject(ctx, strRef));
    } catch (NumberFormatException e) {
      env.throwException(ctx, "java.lang.NumberFormatException");

      return 0;
    }
  }

  @MJI
  public int parseInt__Ljava_lang_String_2I__I (MJIEnv env, int clsObjRef, 
                                                    int strRef, int radix, FeatureExpr ctx) {
    try {
      return Integer.parseInt(env.getStringObject(ctx, strRef), radix);
    } catch (NumberFormatException e) {
      env.throwException(ctx, "java.lang.NumberFormatException");

      return 0;
    }
  }

  @MJI
  public int toBinaryString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val, FeatureExpr ctx) {
    return env.newString(ctx, Integer.toBinaryString(val));
  }

  @MJI
  public int toHexString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val, FeatureExpr ctx) {
    return env.newString(ctx, Integer.toHexString(val));
  }

  @MJI
  public int toOctalString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val, FeatureExpr ctx) {
    return env.newString(ctx, Integer.toOctalString(val));
  }

  @MJI
  public int toString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val, FeatureExpr ctx) {
    return env.newString(ctx, Integer.toString(val));
  }

  @MJI
  public int toString__II__Ljava_lang_String_2 (MJIEnv env, int objref, int val, int radix, FeatureExpr ctx) {
    return env.newString(ctx, Integer.toString(val, radix));
  }

  @MJI
  public Conditional<Integer> valueOf__I__Ljava_lang_Integer_2 (MJIEnv env, int clsRef, Conditional<Integer> val, FeatureExpr ctx) {
	  return env.valueOfInteger(ctx, val);
  }
}
