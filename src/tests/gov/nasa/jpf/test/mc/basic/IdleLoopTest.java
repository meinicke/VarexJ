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
package gov.nasa.jpf.test.mc.basic;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * JPF test driver for the IdleFilter listener
 */
public class IdleLoopTest extends TestJPF {

  static final String LISTENER = "+listener=.listener.IdleFilter";

  @Test public void testBreak () {
    if (verifyNoPropertyViolation(LISTENER, "+idle.action=break", 
                                  "+log.warning=gov.nasa.jpf.listener.IdleFilter",
                                  "+vm.max_transition_length=MAX")) {
      int y = 4;
      int x = 0;

      while (x != y) { // JPF should state match on the backjump
        x = x + 1;
        if (x > 3) {
          x = 0;
        }
      }

      assert false : "we should never get here";
    }
  }

  @Test public void testPrune () {
    if (verifyNoPropertyViolation(LISTENER, "+idle.action=prune",
                                  "+log.warning=gov.nasa.jpf.listener.IdleFilter",
                                  "+vm.max_transition_length=MAX")) {
      int y = 4;
      int x = 0;

      int loopCount = 0;

      while (x != y) { // JPF should prune on the backjump despite of changed 'loopCount'
        loopCount++;
        x = x + 1;
        if (x > 3) {
          x = 0;
        }
      }

      assert false : "we should never get here";
    }
  }

  @Test public void testJump () {
    if (verifyNoPropertyViolation(LISTENER, "+idle.action=jump",
                                  "+idle.max_backjumps=100",
                                  "+log.warning=gov.nasa.jpf.listener.IdleFilter",
                                  "+vm.max_transition_length=MAX")) {

      for (int i=0; i<1000; i++){
        assert i < 500 : "JPF failed to jump past idle loop";
      }

      System.out.println("Ok, jumped past loop");
    }
  }

}
