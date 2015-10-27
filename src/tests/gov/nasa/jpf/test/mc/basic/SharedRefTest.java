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
package gov.nasa.jpf.test.mc.basic;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * test case for the shared object attribute detection, which is required by POR
 * NOTE: these test cases only make sense when executed under JPF, since they
 * depend on race conditions that are most likely not experienced when running on
 * a normal VM
 *
 */
public class SharedRefTest extends TestJPF implements Runnable {
  
  static class SharedOrNot {
    boolean changed;
  }
  
  SharedOrNot o;

  public SharedRefTest () {
    // only for JUnit
  }

  SharedRefTest (SharedOrNot o) {
    // don't make this public or JUnit will choke
    this.o = o;
  }
  
  public void run () {
    boolean b = o.changed;
    o.changed = !b;
    assert o.changed != b : "Argh, data race for o";
  }
  
  /**
   * this on should produce an AssertionError under JPF
   */
  @Test public void testShared () {
    if (verifyAssertionError()) {
      SharedOrNot s = new SharedOrNot();

      Thread t1 = new Thread(new SharedRefTest(s));
      Thread t2 = new Thread(new SharedRefTest(s));

      t1.start();
      t2.start();
    }
  }
  
  /**
   * and this one shouldn't
   */
  @Test public void testNonShared () {
    if (verifyNoPropertyViolation()) {
      SharedOrNot s = new SharedOrNot();
      Thread t1 = new Thread(new SharedRefTest(s));

      s = new SharedOrNot();
      Thread t2 = new Thread(new SharedRefTest(s));

      t1.start();
      t2.start();
    }
  }

  static SharedRefTest rStatic = new SharedRefTest( new SharedOrNot());
  
  @Test
  public void testSharedStaticRoot () {
    if (verifyAssertionError()) {
      Thread t = new Thread(rStatic);

      t.start();

      rStatic.o.changed = false; // why wouldn't 'true' trigger an assertion :)
    }
  }
  
  //--- test explicit sharedness management
  
  static class Global {
    public static Global x = new Global();
   
    int d;
  }
  
  @Test
  public void testShareControl () {
    if (verifyNoPropertyViolation()) {
      Verify.setShared( Global.class, false);
      Verify.freezeSharedness( Global.class, true);

      Verify.setShared( Global.x, false);
      Verify.freezeSharedness( Global.x, true);
      
      // now references to Global.x should not break anymore
     
      Thread t = new Thread() {
        public void run() {
          System.out.println("T inc");
          Global.x.d++;
          System.out.println("T dec");
          Global.x.d--;
          assertTrue( Global.x.d == 0);
        }
      };
      
      t.start();
      
      System.out.println("M inc");
      Global.x.d++;
      System.out.println("M dec");
      Global.x.d--;
      assertTrue( Global.x.d == 0);
    }
  }

}
