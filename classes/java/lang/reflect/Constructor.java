//
// Copyright (C) 2007 United States Government as represented by the
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

/**
 * (incomplete) support for consructor reflection
 * 
 * pretty stupid - this is almost identical to Method, but we can't derive,
 * and the delegation happens at the peer level anyways.
 * 
 * NOTE: 'regIdx' and 'name' need to be like Method, or the peer delegation
 * fails (this is the hack'ish part)
 * 
 * NOTE: we ditch the 'final' modifier so that we can provide our
 * own serialization ctor objects - that's probably going away
 * once we replace ObjectStreamClass
 */
public /*final*/ class Constructor <T> extends AccessibleObject implements Member {
  
  protected int regIdx;
  protected String name;

  public native String getName();
  public native T newInstance (Object... args)
        throws IllegalAccessException, InvocationTargetException, InstantiationException;
  
  public native int getModifiers();
  public native Class<?> getReturnType();
  public native Class<?>[] getParameterTypes();
  
  public native Class<T> getDeclaringClass();
  
  public native Annotation[] getAnnotations();
  public native Annotation[] getDeclaredAnnotations();
  public native <T extends Annotation> T getAnnotation( Class<T> annotationCls);
  public native Annotation[][] getParameterAnnotations();
  
  public boolean isSynthetic () {
    return false;
  }
  
  public native String toString();
  
  public native boolean equals (Object obj);

  public boolean isVarArgs (){
    return (getModifiers() & Modifier.VARARGS) != 0;
  }

  public native int hashCode ();

  public native String toGenericString ();
}
