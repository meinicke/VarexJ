//
// Administrator of the National Aeronautics and Space Administration
// Copyright (C) 2006 United States Government as represented by the
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
package gov.nasa.jpf.test.vm.threads;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * Tests the functionality of gov.nasa.jpf.listener.LockedStackDepth
 *
 * It would be very difficult to put asserts in the test.  Hence, asserts are
 * added to LockedStackDepth.
 *
 * Run all of the JPF tests with 
 * listener+=,gov.nasa.jpf.listener.LockedStackDepth to take advantage of the 
 * various tests.
 */
public class LockedStackDepthTest extends TestJPF {

  private static final String LISTENER = "+listener+=,.listener.LockedStackDepth";

  @Test
  public void recursiveLock() {
    if (verifyNoPropertyViolation(LISTENER)) {
      synchronized (this) {
        synchronized (this) {
        }
      }
    }
  }

  @Test
  public void waitRetainsDepth() throws InterruptedException {
    if (verifyNoPropertyViolation(LISTENER)) {
      synchronized (this) {
        synchronized (this) {
          wait(1);
        }
      }
    }
  }

  @Test
  public void breadthFirstSearch() throws InterruptedException {
    if (verifyNoPropertyViolation(LISTENER, "+search.class=gov.nasa.jpf.search.heuristic.BFSHeuristic")) {
      synchronized (this) {
        synchronized (this) {
          wait(1);
        }
      }
    }
  }

  @Test
  public void randomHeuristicSearch() throws InterruptedException {
    if (verifyNoPropertyViolation(LISTENER, "+search.class=gov.nasa.jpf.search.heuristic.RandomHeuristic")) {
      synchronized (this) {
        synchronized (this) {
          wait(1);
        }
      }
    }
  }

  @Test
  public void hitSameStateThroughDifferentSearchPaths() {
    if (verifyNoPropertyViolation(LISTENER)) {
      Verify.getBoolean();

      synchronized (this) {
      }

      Verify.getBoolean();
    }
  }
}
