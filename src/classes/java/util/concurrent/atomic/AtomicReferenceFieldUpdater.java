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

package java.util.concurrent.atomic;

/**
 * model class for the AtomicReferenceFieldUpdater
 * in reality it's an abstract class, but this here is merely a stub anyways
 */
public class AtomicReferenceFieldUpdater<T,V> {

  int fieldId;

  public static <O,F> AtomicReferenceFieldUpdater<O,F> newUpdater (Class<O> objClass, Class<F> fieldClass,
                                                                   String fieldName) {
    return new AtomicReferenceFieldUpdater<O,F>(objClass, fieldClass, fieldName);
  }

  protected AtomicReferenceFieldUpdater(Class<T> objClass, Class<V> fieldClass, String fieldName){
    // direct Object subclass, so we can directly intercept the ctor
    // w/o having to call a parent ctor
  }

  public native boolean compareAndSet(T obj, V expect, V update);
  public native V       get(T obj);
  public native V       getAndSet(T obj, V newValue);
  public native void    lazySet(T obj, V newValue);
  public native void    set(T obj, V newValue);
  public native boolean weakCompareAndSet(T obj, V expect, V update);
}
