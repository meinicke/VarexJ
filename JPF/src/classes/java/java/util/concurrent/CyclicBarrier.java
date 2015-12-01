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
package java.util.concurrent;

/**
 * a simplistic CyclicBarrier implementation, required because the real one
 * relies heavily on Sun infrastructure (including native methods)
 */
public class CyclicBarrier {

  private Runnable action;
  private int parties;
  private int count;
  private boolean isBroken;

  // make sure nobody from the outside can interfere with our locking
  private final Object lock = new Object();

  
  public CyclicBarrier (int parties) {
    this(parties, null);
  }

  public CyclicBarrier (int parties, Runnable action) {
    this.parties = parties;
    count = parties;
    
    this.action = action;
  }
  
  public int await () throws InterruptedException, BrokenBarrierException {
    synchronized (lock) {
      int arrival = parties - count;

      if (--count == 0) {
        if (action != null) {
          action.run();
        }
        count = parties; // reset barrier
        lock.notifyAll();
      } else {
        try {
          lock.wait();
          if (isBroken) {
            throw new BrokenBarrierException();
          }
        } catch (InterruptedException ix) {
          if (count > 0) {
            isBroken = true;
            lock.notifyAll();
          }

          throw ix;
        }
      }

      return arrival;
    }
  }

  public int getParties () {
    return parties;
  }

  public void reset () {
    synchronized (lock) {
      if ((count != parties) && (count != 0)) {
        // there are waiters
        isBroken = true;
        lock.notifyAll();
      } else {
        count = parties;
        isBroken = false;
      }
    }
  }

  public boolean isBroken () {
    // true if one of the parties got out of an await by being
    // interrupted
    return isBroken;
  }

  public int getNumberWaiting () {
    synchronized (lock) {
      return (parties - count);
    }
  }
}
