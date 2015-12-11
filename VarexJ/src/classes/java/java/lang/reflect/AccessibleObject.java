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
package java.lang.reflect;

import java.lang.annotation.Annotation;

public class AccessibleObject {
  boolean isAccessible = true;

  public void setAccessible (boolean flag)  throws SecurityException {
    isAccessible = flag;
  }
  
  public static void setAccessible (AccessibleObject[] accessibles, boolean flag) throws SecurityException {
    for (int i=0; i<accessibles.length; i++) {
      accessibles[i].isAccessible = flag;
    }
  }
  
  public boolean isAccessible() {
    return isAccessible;
  }
    
  public native <T extends Annotation> T getAnnotation (Class<T> cls); // <2do> Implement in JPF_java_lang_reflect_Constructor

  public boolean isAnnotationPresent (Class<? extends Annotation> cls) {
    return getAnnotation(cls) != null;
  }

  public native Annotation[] getAnnotations(); // <2do> Implement in JPF_java_lang_reflect_Constructor

  public native Annotation[] getDeclaredAnnotations(); // <2do> Implement in JPF_java_lang_reflect_Method, JPF_java_lang_reflect_Class and JPF_java_lang_reflect_Constructor
}
