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
/**
 * JPF_java_lang_Shortjava.java
 *
 * @author Created by Omnicore CodeGuide
 */
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

/**
 * MJI NativePeer class for java.lang.Short library abstraction
 */
public class JPF_java_lang_Short extends NativePeer {
  // <2do> at this point we deliberately do not override clinit

  @MJI
  public short parseShort__Ljava_lang_String_2__S (MJIEnv env, 
                                                          int clsObjRef, 
                                                          int strRef) {
    try {
      return Short.parseShort(env.getStringObject(strRef));
    } catch (NumberFormatException e) {
      env.throwException("java.lang.NumberFormatException");

      return 0;
    }
  }

  @MJI
  public short parseShort__Ljava_lang_String_2I__S (MJIEnv env, 
                                                            int clsObjRef, 
                                                            int strRef, int radix) {
    try {
      return Short.parseShort(env.getStringObject(strRef), radix);
    } catch (NumberFormatException e) {
      env.throwException("java.lang.NumberFormatException");

      return 0;
    }
  }

  @MJI
  public int toString__S__Ljava_lang_String_2 (MJIEnv env, int objref, short val) {
    return env.newString(Short.toString(val));
  }

  @MJI
  public int valueOf__S__Ljava_lang_Short_2 (MJIEnv env, int clsRef, short val) {
    return env.valueOfShort(val);
  }
}
