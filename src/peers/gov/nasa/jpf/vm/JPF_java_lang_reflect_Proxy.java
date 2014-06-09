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


public class JPF_java_lang_reflect_Proxy extends NativePeer {
  @MJI
  public int defineClass0 (MJIEnv env, int clsObjRef, int classLoaderRef, int nameRef, int bufferRef, int offset, int length) {  
    String clsName = env.getStringObject(nameRef);
    byte[] buffer = env.getByteArrayObject(bufferRef);
    
    try {
      ClassInfo ci = ClassLoaderInfo.getCurrentClassLoader().getResolvedClassInfo( clsName, buffer, offset, length);
      if (!ci.isRegistered()) {
        ThreadInfo ti = env.getThreadInfo();
        ci.registerClass(ti);
      }
      return ci.getClassObjectRef();
      
    } catch (ClassInfoException cix){
      env.throwException("java.lang.ClassFormatError", clsName); // <2do> check if this is the right one
      return MJIEnv.NULL;
    }
  }
}

