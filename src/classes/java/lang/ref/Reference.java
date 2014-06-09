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
package java.lang.ref;

/**
 * MJI model class for java.lang.ref.Reference library abstraction
 * we model this so that we can rely on our WeakRefence implementation
 */
public abstract class Reference<T> {
  
  /**
   * the object we reference
   * NOTE: this has to be the *first* field, or we break WeakReference handling in
   * the garbage collection!!
   */
  T ref;

  /** the optional queue for us */
  ReferenceQueue<? super T> queue;

  /** link to enqueue w/o additional memory requirements */
  Reference<T> next;

  Reference (T r) {
    ref = r;
  }
  
  Reference (T r, ReferenceQueue<? super T> q) {
    ref = r;
    queue = q;
  }
  
  /** is the referenced object enqueued */
  public boolean isEnqueued () {
    // <2do>
    return false;
  }

  /** clear, but do not enqueue the referenced object */
  public void clear () {
    ref = null;
  }

  /** add the referenced object to its queue */
  public void enqueue () {
  }

  /** return the referenced object */
  public T get () {
    return ref;
  }
}
