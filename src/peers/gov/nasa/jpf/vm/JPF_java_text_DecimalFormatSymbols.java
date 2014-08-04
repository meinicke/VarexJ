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

/**
 * MJI NativePeer class for java.text.DecimalFormatSymbols library abstraction
 * 
 * we need to intercept the initialization because it is requires
 * file io (properties) based on the Locale
 */
public class JPF_java_text_DecimalFormatSymbols extends NativePeer {
  @MJI
  public void initialize__Ljava_util_Locale_2__V (MJIEnv env, int objRef, int localeRef) {
    DecimalFormatSymbols dfs = new DecimalFormatSymbols();
    
    env.setCharField(NativeMethodInfo.CTX,objRef, "patternSeparator", new One<>(dfs.getPatternSeparator()));
    env.setCharField(NativeMethodInfo.CTX,objRef, "percent", new One<>(dfs.getPercent()));
    env.setCharField(NativeMethodInfo.CTX,objRef, "digit", new One<>(dfs.getDigit()));
    env.setCharField(NativeMethodInfo.CTX,objRef, "minusSign", new One<>(dfs.getMinusSign()));
    env.setCharField(NativeMethodInfo.CTX,objRef, "perMill", new One<>(dfs.getPerMill()));
    env.setReferenceField(NativeMethodInfo.CTX, objRef,"infinity", env.newString(NativeMethodInfo.CTX, dfs.getInfinity()));
    env.setReferenceField(NativeMethodInfo.CTX, objRef,"NaN", env.newString(NativeMethodInfo.CTX, dfs.getNaN()));
    env.setReferenceField(NativeMethodInfo.CTX, objRef,"currencySymbol", env.newString(NativeMethodInfo.CTX, dfs.getCurrencySymbol()));
    env.setCharField(NativeMethodInfo.CTX,objRef, "monetarySeparator", new One<>(dfs.getMonetaryDecimalSeparator()));

    env.setCharField(NativeMethodInfo.CTX,objRef, "decimalSeparator", new One<>(dfs.getDecimalSeparator()));
    env.setCharField(NativeMethodInfo.CTX,objRef, "groupingSeparator", new One<>(dfs.getGroupingSeparator()));
    env.setCharField(NativeMethodInfo.CTX,objRef, "exponential", new One<>('E')); // getExponentialSymbol() is not public
  }
}

