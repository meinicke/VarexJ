//
// Copyright (C) 2009 United States Government as represented by the
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
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativePeer;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

import java.util.List;

/**
 * native peer for ResourceBundle
 */
public class JPF_java_util_ResourceBundle extends NativePeer {

  @MJI
  public int getClassContext_____3Ljava_lang_Class_2 (MJIEnv env, int clsRef){
    ThreadInfo ti = env.getThreadInfo();

    List<StackFrame> list = ti.getInvokedStackFrames();
    int aRef = env.newObjectArray("java.lang.Class", list.size());

    int j=0;
    for (StackFrame frame : list){
      MethodInfo mi = frame.getMethodInfo();
      ClassInfo ci = mi.getClassInfo();
      int clsObjRef = ci.getClassObjectRef();
      env.setReferenceArrayElement(aRef, j++, clsObjRef);
    }

    return aRef;
  }
}
