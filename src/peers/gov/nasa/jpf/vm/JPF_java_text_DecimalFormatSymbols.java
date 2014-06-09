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
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.text.DecimalFormatSymbols;

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
    
    env.setCharField(objRef,"patternSeparator", dfs.getPatternSeparator());
    env.setCharField(objRef,"percent", dfs.getPercent());
    env.setCharField(objRef,"digit", dfs.getDigit());
    env.setCharField(objRef,"minusSign", dfs.getMinusSign());
    env.setCharField(objRef,"perMill", dfs.getPerMill());
    env.setReferenceField(objRef,"infinity", env.newString(dfs.getInfinity()));
    env.setReferenceField(objRef,"NaN", env.newString(dfs.getNaN()));
    env.setReferenceField(objRef,"currencySymbol", env.newString(dfs.getCurrencySymbol()));
    env.setCharField(objRef,"monetarySeparator", dfs.getMonetaryDecimalSeparator());

    env.setCharField(objRef,"decimalSeparator", dfs.getDecimalSeparator());
    env.setCharField(objRef,"groupingSeparator", dfs.getGroupingSeparator());
    env.setCharField(objRef,"exponential", 'E'); // getExponentialSymbol() is not public
  }
}

