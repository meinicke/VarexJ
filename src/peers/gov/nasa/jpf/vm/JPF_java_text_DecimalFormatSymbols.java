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

import java.text.DecimalFormatSymbols;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * MJI NativePeer class for java.text.DecimalFormatSymbols library abstraction
 * 
 * we need to intercept the initialization because it is requires
 * file io (properties) based on the Locale
 */
public class JPF_java_text_DecimalFormatSymbols extends NativePeer {
  @MJI
  public void initialize__Ljava_util_Locale_2__V (MJIEnv env, int objRef, int localeRef, FeatureExpr ctx) {
    DecimalFormatSymbols dfs = new DecimalFormatSymbols();
    
    env.setCharField(ctx,objRef, "patternSeparator", new One<>(dfs.getPatternSeparator()));
    env.setCharField(ctx,objRef, "percent", new One<>(dfs.getPercent()));
    env.setCharField(ctx,objRef, "digit", new One<>(dfs.getDigit()));
    env.setCharField(ctx,objRef, "minusSign", new One<>(dfs.getMinusSign()));
    env.setCharField(ctx,objRef, "perMill", new One<>(dfs.getPerMill()));
    env.setReferenceField(ctx, objRef,"infinity", env.newString(ctx, dfs.getInfinity()));
    env.setReferenceField(ctx, objRef,"NaN", env.newString(ctx, dfs.getNaN()));
    env.setReferenceField(ctx, objRef,"currencySymbol", env.newString(ctx, dfs.getCurrencySymbol()));
    env.setCharField(ctx,objRef, "monetarySeparator", new One<>(dfs.getMonetaryDecimalSeparator()));

    env.setCharField(ctx,objRef, "decimalSeparator", new One<>(dfs.getDecimalSeparator()));
    env.setCharField(ctx,objRef, "groupingSeparator", new One<>(dfs.getGroupingSeparator()));
    env.setCharField(ctx,objRef, "exponential", new One<>('E')); // getExponentialSymbol() is not public
  }
}

