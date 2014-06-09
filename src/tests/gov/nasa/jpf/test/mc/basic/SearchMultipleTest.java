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

package gov.nasa.jpf.test.mc.basic;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

/**
 * regression test for search.multiple_errors test
 */
public class SearchMultipleTest extends TestJPF {

  @Test
  public void testSimple() {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyAssertionError("+search.multiple_errors")){
      boolean b = Verify.getBoolean();
      System.out.println("## b = " + b);

      Verify.incrementCounter(0);
      
      assert false : "blow up here";

      fail("should never get here");
    }

    if (!isJPFRun()){
      assertTrue( Verify.getCounter(0) == 2);
    }
  }

  @Test
  public void testSimpleBFS() {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyAssertionError("+search.multiple_errors", "+search.class=.search.heuristic.BFSHeuristic")){
      boolean b = Verify.getBoolean();
      System.out.println("## b = " + b);

      Verify.incrementCounter(0);

      assert false : "blow up here";
    }

    if (!isJPFRun()){
      assertTrue( Verify.getCounter(0) == 2);
    }
  }

  @Test
  public void testDeadlock(){
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyDeadlock("+search.multiple_errors", "+cg.boolean.false_first")){
      Object lock = new Object();
      boolean b = Verify.getBoolean();
      boolean c = Verify.getBoolean();
      System.out.println("b=" + b + ", c=" + c);

      if (!b){
        synchronized(lock){
          try {
            System.out.println("now deadlocking");
            lock.wait(); // this should always deadlock
          } catch (InterruptedException ix){
            System.out.println("got interrupted");
          }
        }
      }

      System.out.println("should get here for b=true");
      Verify.incrementCounter(0);
    }

    if (!isJPFRun()){
      assertTrue( Verify.getCounter(0) == 2);
    }
  }
}
