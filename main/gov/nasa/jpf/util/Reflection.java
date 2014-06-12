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
package gov.nasa.jpf.util;

import gov.nasa.jpf.JPFException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * reflection utilities
 */
public class Reflection {

  /**
   * find callers class
   *
   * @param up levels upwards from our caller (NOT counting ourselves)
   * @return caller class, null if illegal 'up' value
   */
  public static Class<?> getCallerClass(int up) {
    int idx = up + 1; // don't count this stackframe

    StackTraceElement[] st = (new Throwable()).getStackTrace();
    if ((up < 0) || (idx >= st.length)) {
      return null;
    } else {
      try {
        return Class.forName(st[idx].getClassName());
      } catch (Throwable t) {
        return null;
      }
    }
  }

  public static Class<?> getCallerClass () {
    return getCallerClass(2);
  }

  public static <T> Class<? extends T>  getCallerClass (Class<T> type){
    Class<?> cls = getCallerClass(2);

    if (cls != null) {
      if (type.isAssignableFrom(cls)) {
        return cls.asSubclass(type);
      } else {
        throw new JPFException("caller class: " + cls.getName() + " not of type: " + type.getName());
      }
    }
    return null;
  }

  public static StackTraceElement getCallerElement (int up){
    int idx = up + 1; // don't count this stackframe

    StackTraceElement[] st = (new Throwable()).getStackTrace();
    if ((up < 0) || (idx >= st.length)) {
      return null;
    } else {
      return st[idx];
    }
  }
  public static StackTraceElement getCallerElement () {
    StackTraceElement[] st = (new Throwable()).getStackTrace();
    if (st.length > 2){
      return st[2]; // '0' is this method itself
    } else {
      return null;
    }
  }

  public static boolean tryCallMain(Class<?> cls, String[] args) throws InvocationTargetException {
    try {
      Method method = cls.getDeclaredMethod("main", String[].class);
      int modifiers = method.getModifiers();

      if ((modifiers & (Modifier.PUBLIC | Modifier.STATIC | Modifier.ABSTRACT)) == (Modifier.PUBLIC | Modifier.STATIC)) {
        method.invoke(null, (Object)args);
        return true;
      }

    } catch (NoSuchMethodException nsmx) {
      //System.out.println(nsmx);
      // just return false
    } catch (IllegalAccessException iax){
      //System.out.println(iax);
      // can't happen, we checked for it before invoking
    } catch (IllegalArgumentException iargx){
      //System.out.println(iargx);
      // can't happen, we checked for it before invoking
    }

    return false;
  }

}
