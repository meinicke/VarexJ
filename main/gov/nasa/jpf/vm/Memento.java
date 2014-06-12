//
// Copyright (C) 2010 United States Government as represented by the
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

/**
 * generic interface for objects that are used to restore previous states from
 * within a context that holds the references to the objects to restore (e.g. a
 * container), i.e. the caller knows where to restore the objects in question.
 * The caller can provide a cached object the memento can update. However, its
 * up to the memento if it uses this (optional) argument object to restore
 * in-situ, the only guarantee it makes is that it returns a restored object
 */
public interface Memento<T> {

  /**
   * note that there is no guarantee the restored object will be the same that
   * is (optionally) passed in.
   * 
   * Implementations are free to restore in-situ or create a new object if a
   * non-null reference is provided. Callers are responsible for identity
   * integrity if they do provide in-situ objects
   * 
   * The caller does not guarantee the provided in-situ object was the one the
   * Memento was created from
   */
  T restore(T inSitu);
}
