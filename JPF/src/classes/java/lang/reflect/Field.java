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

public final class Field extends AccessibleObject implements Member {
  int regIdx; // the link to the corresponding FieldInfo
  String name; // deferred set by the NativePeer getName()

  public String toGenericString() {
	  // TODO: return real generic string
	  return toString();
  }
  
  public native boolean getBoolean (Object o) throws IllegalAccessException;
  public native void setBoolean (Object o, boolean v) throws IllegalAccessException;

  public native byte getByte (Object o) throws IllegalAccessException;
  public native void setByte (Object o, byte v) throws IllegalAccessException;

  public native short getShort (Object o) throws IllegalAccessException;
  public native void setShort (Object o, short v) throws IllegalAccessException;
  
  public native char getChar (Object o) throws IllegalAccessException;
  public native void setChar (Object o, char v) throws IllegalAccessException;

  public native int getInt (Object o) throws IllegalAccessException;
  public native void setInt (Object o, int val) throws IllegalAccessException;

  public native long getLong (Object o) throws IllegalAccessException;
  public native void setLong (Object o, long v) throws IllegalAccessException;

  public native float getFloat (Object o) throws IllegalAccessException;
  public native void setFloat (Object o, float v) throws IllegalAccessException;

  public native double getDouble (Object o) throws IllegalAccessException;
  public native void setDouble (Object o, double v) throws IllegalAccessException;

  public native Class<?> getType ();
  
  public native Object get (Object o) throws IllegalAccessException;
    
  public native void set (Object o, Object v) throws IllegalArgumentException, IllegalAccessException;
  // the member interface
  public native String getName();
  
  public native int getModifiers();
  
  public native Annotation[] getAnnotations();

  public native <T extends Annotation> T getAnnotation( Class<T> annotationCls);
  
  public native Class<?> getDeclaringClass ();
  
  public native boolean isSynthetic ();

  public native boolean equals (Object obj);

  public native String toString ();

  public boolean isEnumConstant (){
    return (getModifiers() & Modifier.ENUM) != 0;
  }

  public native int hashCode ();

  public native Annotation[] getDeclaredAnnotations ();
}
