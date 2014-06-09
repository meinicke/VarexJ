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

package gov.nasa.jpf.test.mc.threads;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * high order data race
 */
public class HORaceTest extends TestJPF {

  static class D {
    int a;
    int b;

    D (int x, int y){
      a = x;
      b = y;
    }

    D (D other){
      setA( other.getA());
      Thread.yield(); // give the 2nd thread a chance to interfere
      setB( other.getB());
    }

    synchronized int getA() { return a; }
    synchronized int getB() { return b; }
    synchronized void setA(int x){ a = x; }
    synchronized void setB(int x){ b = x; }

    synchronized void change(int delta) {
      a += delta;
      b += delta;
    }

    synchronized boolean isConsistent() {
      return a == b;
    }
  }

  static D d1;
  static D d2;

  @Test
  public void testHighOrderRace() {

    if (verifyAssertionErrorDetails("inconsistent d2")) {
      d1 = new D(42, 42);

      Thread t1 = new Thread() {

        public void run() {
          d2 = new D(d1);
        }
      };
      Thread t2 = new Thread() {

        public void run() {
          d1.change(-1);
        }
      };

      t1.start();
      t2.start();

      try {
        t1.join();
        t2.join();
      } catch (InterruptedException ix) {
        fail("unexpected interrupt during {t1,t2}.join()");
      }

      System.out.print("d2 = ");
      System.out.print(d2.a);
      System.out.print(',');
      System.out.println(d2.b);

      assert d2.isConsistent() : "inconsistent d2";
    }
  }

}
