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
package gov.nasa.jpf.test.mc.threads;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;


public class AtomicTest extends TestJPF {
  
  static int data = 42;
  
  @Test public void testNoRace () {
    if (verifyNoPropertyViolation("+cg.enable_atomic")) {
      Runnable r = new Runnable() {

        public void run() {
          System.out.println("  enter run in Thread-0");
          assert data == 42;
          data += 1;
          assert data == 43;
          data -= 1;
          assert data == 42;
          System.out.println("  exit run in Thread-0");
        }
      };

      Thread t = new Thread(r);

      Verify.beginAtomic();
      System.out.println("enter atomic section in main");
      t.start();
      assert data == 42;
      data += 2;
      assert data == 44;
      data -= 2;
      assert data == 42;
      System.out.println("exit atomic section in main");
      Verify.endAtomic();
    }
  }
  
  @Test 
  public void testDataCG () {
    if (verifyNoPropertyViolation("+cg.enable_atomic")) {
      Runnable r = new Runnable() {

        public void run() {
          data += 10;
        }
      };

      Thread t = new Thread(r);

      Verify.beginAtomic();
      t.start();
      int i = Verify.getInt(1, 2);
      data += i;
      assert data < 45 : "data got incremented: " + data;
      Verify.incrementCounter(0);
      assert i == Verify.getCounter(0);
      Verify.endAtomic();
    }
  }

  @Test public void testBlockedInAtomic () {
    if (verifyDeadlock("+cg.enable_atomic")){
      Runnable r = new Runnable() {

        public synchronized void run() {
          System.out.println("T notifying..");
          this.notify();
        }
      };

      Thread t = new Thread(r);

      synchronized (r){
        System.out.println("main going atomic, holding r lock");
        Verify.beginAtomic();
        t.start();

        try {
          System.out.println("main waiting on r");
          r.wait();
        } catch (InterruptedException x){
          System.out.println("main got interrupted");
        }
        System.out.println("main leaving atomic");
        Verify.endAtomic();
      }
    }
  }
}
