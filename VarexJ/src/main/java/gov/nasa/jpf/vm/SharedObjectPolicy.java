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

import gov.nasa.jpf.Config;

/**
 * abstraction for configured policy object that is responsible for detecting shared objects and classes
 * The interface has to support both
 * <ul>
 *   <li> tracking (actual access) based policies
 *        ("what <em>is</em> shared")</li>
 *   <li> conservative reachability based policies
 *        ("what <em>could be</em> shared")</li>
 * </ul> 
 * 
 * The interface is intentionally kept generic to support both policies since tracking - while being
 * far more efficient in terms of states and speed - can either miss some paths or cause state spaces
 * to depend on search history, thus leading to different search graphs for randomized searches.
 * Missed paths only happen in cases where there is very little interaction between threads and
 * defects only happen along single paths. The second case is mostly of interest for comparative
 * studies and not very relevant for bug finding
 */
public abstract class SharedObjectPolicy {

  protected static SharedObjectPolicy singleton;
  
  public static boolean init (Config config) {
    singleton = config.getEssentialInstance("vm.por.shared.class", SharedObjectPolicy.class);
    return true;
  }

  public static SharedObjectPolicy getPolicy() {
    return singleton;
  }
  
  //--- creators
  public abstract ThreadInfoSet getThreadInfoSet (ThreadInfo allocThread, DynamicElementInfo ei);
  public abstract ThreadInfoSet getThreadInfoSet (ThreadInfo allocThread, StaticElementInfo ei);
  
  //--- sharedness check
  public abstract boolean isShared (ThreadInfo ti, ElementInfo ei, ThreadInfoSet set);
  
  //--- state management
  public abstract Memento<ThreadInfoSet> getMemento (ThreadInfoSet set);
  
  //--- housekeeping
  public abstract void cleanupThreadTermination (ThreadInfo ti);
  
}
