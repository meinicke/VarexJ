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

/**
 * MJI NativePeer class for java.lang.Double library abstraction
 */
public class JPF_java_lang_Double extends NativePeer {
  @MJI
  public long doubleToLongBits__D__J (MJIEnv env, int rcls, double v0) {
    return Double.doubleToLongBits(v0);
  }

  @MJI
  public long doubleToRawLongBits__D__J (MJIEnv env, int rcls, double v0) {
    return Double.doubleToRawLongBits(v0);
  }

  @MJI
  public double longBitsToDouble__J__D (MJIEnv env, int rcls, long v0) {
    return Double.longBitsToDouble(v0);
  }

  @MJI
  public int toString__D__Ljava_lang_String_2 (MJIEnv env, int objref, double d) {
    return env.newString(Double.toString(d));
  }
  
  // we need to intercept this because it compares double values, which might
  // cause an ArithmeticException to be raised if -check-fp-compare is set (default)
  // but -check-fp isn't, and Double.isInfinit is used to handle the cases
  // explicitly in the program (which is supposed to be the right way)
  @MJI
  public boolean isInfinite__D__Z (MJIEnv env, int rcls, double v) {
    return Double.isInfinite(v);
  }
  
  // ditto (see isInfinite)
  @MJI
  public boolean isNaN__D__Z (MJIEnv env, int rcls, double v) {
    return Double.isNaN(v);
  }
}
