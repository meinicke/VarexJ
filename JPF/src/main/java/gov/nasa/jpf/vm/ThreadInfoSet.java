//
// Copyright (C) 2012 United States Government as represented by the
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
 * interface to abstract the referencing set of threadinfos per object/class
 * Used to detect shared objects/classes 
 * Instances are created through a configured factory (SharedObjectPolicy)
 * 
 * We abstract the container so that the way we identify threads is not exposed
 * to the client, and implementations can use either ThreadInfo references or
 * global ids.
 */
public interface ThreadInfoSet extends Cloneable {

  /**
   * @return true if the thread wasn't in the set yet and was added
   */
  ThreadInfoSet add (ThreadInfo ti);
  
  ThreadInfoSet remove (ThreadInfo ti);
  
  boolean contains (ThreadInfo ti);
  
  boolean isShared (ThreadInfo ti, ElementInfo ei);
  
  
  boolean hasMultipleLiveThreads ();
  boolean hasMultipleRunnableThreads ();
  
  Memento<ThreadInfoSet> getMemento();
  
  int size();
}
