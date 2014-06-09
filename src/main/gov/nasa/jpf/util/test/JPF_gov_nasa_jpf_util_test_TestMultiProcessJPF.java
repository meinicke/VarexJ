//
// Copyright (C) 2013 United States Government as represented by the
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

package gov.nasa.jpf.util.test;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * This is a native peer for multiprocess test class root
 */
public class JPF_gov_nasa_jpf_util_test_TestMultiProcessJPF 
  extends JPF_gov_nasa_jpf_util_test_TestJPF {

  @MJI
  public int getProcessId____I (MJIEnv env, int objRef) {
    return ThreadInfo.getCurrentThread().getApplicationContext().getId();
  }

  @MJI
  public static boolean mpVerifyAssertionErrorDetails__ILjava_lang_String_2_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int rString1, int rString2) {
    return true;
  }

  @MJI
  public static boolean mpVerifyAssertionError__I_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int argsRef) {
    return true;
  }

  @MJI
  public static boolean mpVerifyNoPropertyViolation__I_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int argsRef) {
    return true;
  }

  @MJI
  public static boolean mpVerifyUnhandledExceptionDetails__ILjava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int clsRef, int details, int argsRef) {
    return true;
  }

  @MJI
  public static boolean mpVerifyUnhandledException__ILjava_lang_String_2_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int clsRef, int argsRef) {
    return true;
  }

  @MJI
  public static boolean mpVerifyJPFException__ILgov_nasa_jpf_util_TypeRef_2_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int typeRef, int argsRef) {
    return true;
  }

  @MJI
  public static boolean mpVerifyPropertyViolation__ILgov_nasa_jpf_util_TypeRef_2_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int typeRef, int argsRef) {
    return true;
  }

  @MJI
  public static boolean mpVerifyDeadlock__I_3Ljava_lang_String_2__Z (MJIEnv env, int objRef, int numOfPrc, int argsRef) {
    return true;
  }
}
