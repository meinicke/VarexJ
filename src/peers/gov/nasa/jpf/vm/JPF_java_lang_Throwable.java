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
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;
import gov.nasa.jpf.vm.ThreadInfo;

import java.io.PrintWriter;
import java.io.StringWriter;


/**
 * MJI NativePeer class for java.lang.Throwable library abstraction
 */
public class JPF_java_lang_Throwable extends NativePeer {    
  /**
   * return array of StackTraceElement elements from the snapshot stored in the Throwable
   */
  @MJI
  public int createStackTrace_____3Ljava_lang_StackTraceElement_2 (MJIEnv env, int objref) {
    int aref = env.getReferenceField(objref, "snapshot");
    int[] snap = env.getIntArrayObject(aref);
    
    return env.getThreadInfo().createStackTraceElements(snap);
  }
  
  @MJI
  public int fillInStackTrace____Ljava_lang_Throwable_2 (MJIEnv env, int objref) {
    ThreadInfo ti = env.getThreadInfo();
    int[] snap = ti.getSnapshot(objref);
    
    int aref = env.newIntArray(snap);
    env.setReferenceField(objref, "snapshot", aref);
    
    return objref;
  }
    
  // native because we don't want to waste states
  @MJI
  public void printStackTrace____V (MJIEnv env, int objRef) {
    env.getThreadInfo().printStackTrace(objRef);
  }
  
  // a helper method to get a string representation of the stacktrace
  @MJI
  public int getStackTraceAsString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    ThreadInfo ti = env.getThreadInfo();
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    
    ti.printStackTrace(pw, objRef);
    String stackTrace = sw.toString();
    pw.close();
    
    return env.newString(stackTrace);
  }
  
  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int objRef){
    ClassInfo ci = env.getClassInfo(objRef);
    int msgRef = env.getReferenceField(objRef, "detailMessage");
    
    String s = ci.getName();
    if (msgRef != MJIEnv.NULL){
      s += ": " + env.getStringObject(msgRef);
    }
    
    return env.newString(s);
  }
}
