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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.util.HashData;


/**
 * this is the mutable Thread data we have to keep track of for storing/restoring states
 */
public class ThreadData {
  /**
   * Current state of the thread.
   */
  ThreadInfo.State state;

  /** the scheduler priority of this thread */
  int priority;

  /**
   * the name of this thread
   * (only temporarily unset, between NEW and INVOKESPECIAL)
   */
  String name = "?";

  /** is this a daemon thread */
  boolean isDaemon;

  /**
   * The lock counter when the object got into a wait. This value
   * is used to restore the object lock count once this thread
   * gets notified
   */
  int lockCount;

  /**
   * The suspend count of the thread. See ThreadInfo.suspend() for a discussion
   * of how faithful this is (it is an over approximation)
   */
  int suspendCount;


  public ThreadData clone () {
    ThreadData t = new ThreadData();

    t.state = state;
    t.lockCount = lockCount;
    t.suspendCount = suspendCount;

    t.priority = priority;
    t.name = name;
    t.isDaemon = isDaemon;

    return t;
  }

  public boolean equals (Object o) {
    if ((o == null) || !(o instanceof ThreadData)) {
      return false;
    }

    ThreadData t = (ThreadData) o;

    return ((state == t.state) && 
            (priority == t.priority) &&
            (isDaemon == t.isDaemon) && 
            (lockCount == t.lockCount) &&
            (suspendCount == t.suspendCount) && 
            (name.equals(t.name)));
  }

  public void hash (HashData hd) {
    hd.add(state);
    hd.add(lockCount);
    hd.add(suspendCount);
    hd.add(priority);
    hd.add(isDaemon);
    hd.add(name);
  }

  public int hashCode () {
    HashData hd = new HashData();

    hash(hd);

    return hd.getValue();
  }

  public String toString () {
    return ("ThreadData{" + getFieldValues() + '}');
  }

  public String getFieldValues () {
    StringBuilder sb = new StringBuilder("name:");

    sb.append(name);
    sb.append(",status:");
    sb.append(state.name());
    sb.append(",priority:");
    sb.append(priority);
    sb.append(",lockCount:");
    sb.append(lockCount);
    sb.append(",suspendCount:");
    sb.append(suspendCount);

    return sb.toString();
  }

  public ThreadInfo.State getState() { return state; }
}
