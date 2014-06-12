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

import gov.nasa.jpf.util.SparseObjVector;

/**
 * a SharedObjectPolicy that uses search global ThreadInfoSets, i.e.
 * we remember thread access of all previously executed paths.
 * 
 * For instances, we use the object reference value to retrieve cached values
 * For static fields, we just use the corresponding class object reference
 * 
 * Note that this policy requires search global object ids (SGOID), i.e. only works
 * with Heap implementations providing SGOIDs
 */
public class GlobalTrackingPolicy extends SharedObjectPolicy {

  // our global ThreadInfoSet cache
  protected SparseObjVector<ThreadInfoSet> globalCache = new SparseObjVector<ThreadInfoSet>(1024);
  
  protected ThreadInfoSet getRegisteredSet (int key, ThreadInfo allocThread) {
    ThreadInfoSet tis = globalCache.get(key);
    if (tis == null) {
      tis = new TidSet(allocThread);
      globalCache.set(key, tis);
    }
    
    return tis;    
  }
  
  @Override
  public ThreadInfoSet getThreadInfoSet(ThreadInfo allocThread, DynamicElementInfo ei) {
    return getRegisteredSet( ei.getObjectRef(), allocThread);
  }

  @Override
  public ThreadInfoSet getThreadInfoSet(ThreadInfo allocThread, StaticElementInfo ei) {
    int clsObjRef = ei.getClassObjectRef();
    if (clsObjRef == MJIEnv.NULL) { // startup class, we don't have a class object yet
      // note that we don't have to store this in our globalCache since we can never
      // backtrack to a point where the startup classes were not initialized yet.
      // note also that we still can't use a single PersistentTidSet instance for this since
      // startup class references can change individually
      return new TidSet(allocThread); 
    } else {
      return getRegisteredSet( ei.getClassObjectRef(), allocThread);
    }
  }

  @Override
  public boolean isShared (ThreadInfo ti, ElementInfo ei, ThreadInfoSet set) {
    return set.hasMultipleLiveThreads();
  }

  @Override
  public Memento<ThreadInfoSet> getMemento(ThreadInfoSet set) {
    return set.getMemento();
  }

  @Override
  public void cleanupThreadTermination(ThreadInfo ti) {
    // nothing
  }

}
