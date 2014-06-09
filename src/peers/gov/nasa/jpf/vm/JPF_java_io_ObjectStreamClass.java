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
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativePeer;

public class JPF_java_io_ObjectStreamClass extends NativePeer {
  @MJI
  public void initNative____V (MJIEnv env, int clsObjRef) {
    // cut off
  }
  
  // why is this here??
  @MJI
  public boolean hasStaticInitializer__Ljava_lang_Class_2__Z (MJIEnv env, int objRef, int clsRef){
    ClassInfo ci = env.getReferredClassInfo(clsRef);
    MethodInfo mi = ci.getMethod("<clinit>()V", false);          
    return (mi != null);
  }

  // just a little accelerator
  @MJI
  public int getDeclaredSUID__Ljava_lang_Class_2__Ljava_lang_Long_2 (MJIEnv env, int objRef, int clsRef){
    ClassInfo ci = env.getReferredClassInfo(clsRef);
    FieldInfo fi = ci.getDeclaredStaticField("serialVersionUID");
    if (fi != null){
      ElementInfo ei = ci.getStaticElementInfo();
      long l = ei.getLongField(fi);
      return env.newLong(l);
    } else {
      return MJIEnv.NULL;
    }
  }
}
