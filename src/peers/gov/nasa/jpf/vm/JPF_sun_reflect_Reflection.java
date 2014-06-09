//
// Copyright (C) 2011 United States Government as represented by the
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

public class JPF_sun_reflect_Reflection extends NativePeer {

  @MJI
  public int getCallerClass__I__Ljava_lang_Class_2(MJIEnv env, int clsObjRef, int offset){
    ThreadInfo ti = env.getThreadInfo();
    
    StackFrame frame = ti.getTopFrame();
    MethodInfo mi = frame.getMethodInfo();
    
    while (offset > 0){
      frame = frame.getPrevious();
      if (frame == null){
        return MJIEnv.NULL; // <2do> maybe this throws an exception
      }
      
      if (frame.isDirectCallFrame()){
        continue; // does not count
      }
      
      mi = frame.getMethodInfo();
      if (mi.getName().equals("invoke") && mi.getClassName().equals("java.lang.reflect.Method")){
        continue; // does not count
      }
      
      offset--;
    }
 
    ClassInfo ci = mi.getClassInfo();
    return ci.getClassObjectRef();
  }
}
