//
// Copyright (C) 2007 United States Government as represented by the
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
package gov.nasa.jpf.test.java.lang;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

/**
 * raw test for java.lang.System functionality
 */
public class SystemTest extends TestJPF {

  final Object lock = new Object(); // need a shared object
  boolean exitCalled;

  @Test
  public void testExit() {
    if (verifyNoPropertyViolation()) {
      Thread t = new Thread(new Runnable() {

        public void run() {
          while (true) {
            assert !exitCalled : "thread not stopped by System.exit()";

            synchronized (lock) {
              try {
                lock.wait();
              } catch (InterruptedException x) {
                System.out.println("wait interrupted");
              }
            }
          }
        }
      });

      t.start();

      synchronized (lock) {
        exitCalled = true;
        System.out.println("calling System.exit(0)");
        System.exit(0);
      }

      assert false : "main not stopped by System.exit()";
    }
  }

  /**
   * just needs a gazillion more cases (different sizes, slices, overruns,
   * incompatible types etc.)
   */
  @Test
  public void testSimpleArrayCopy() {
    if (verifyNoPropertyViolation()) {
      int[] a = {0, 1, 2, 3, 4, 5, 6, 7};
      int[] b = new int[a.length];

      System.arraycopy(a, 0, b, 0, a.length);

      for (int i = 0; i < a.length; i++) {
        assert b[i] == i;
      }
    }
  }

  @Test
  public void testSelfArrayCopy(){
    if (verifyNoPropertyViolation()){
      int[] a = {0, 1, 2, 3, 4, 5, 6, 7};

      System.arraycopy(a, 3, a, 0, 5);

      // the overwritten ones
      assertTrue(a[0] == 3);
      assertTrue(a[1] == 4);
      assertTrue(a[2] == 5);
      assertTrue(a[3] == 6);
      assertTrue(a[4] == 7);

      // the old ones
      assertTrue(a[5] == 5);
      assertTrue(a[6] == 6);
      assertTrue(a[7] == 7);
    }
  }

  @Test
  public void testOverlappingSelfArrayCopy(){
    if (verifyNoPropertyViolation()){
      int[] a = {0, 1, 2, 3, 4, 5, 6, 7};

      System.arraycopy(a, 0, a, 2, 3);

      // copying should proceed as if using a temporary destination
      assertTrue(a[0] == 0);
      assertTrue(a[1] == 1);
      assertTrue(a[2] == 0);
      assertTrue(a[3] == 1);
      assertTrue(a[4] == 2);
      assertTrue(a[5] == 5);
      assertTrue(a[6] == 6);
      assertTrue(a[7] == 7);
    }
  }

  @Test
  public void testIncompatibleReferencesArrayCopy(){
    if (verifyUnhandledException("java.lang.ArrayStoreException")){
      String[] dst = new String[2];
      Object[] src = { "one", new Integer(2) };

      System.arraycopy(src,0,dst,0,src.length);
    }
  }

  @Test
  public void testRestoredArrayCopy(){
    if (verifyNoPropertyViolation()){
      Object[] src = { "one", "two" };
      Object[] dst = new Object[2];

      int n = Verify.getInt(0, 1);
      System.out.println("processing choice: " + n);

      if (n == 0){
        System.out.println("copying array");
        System.arraycopy(src,0,dst,0,src.length);
      } else if (n == 1){
        System.out.println("checking if non-copied dst[0] is still null");
        assertTrue( dst[0] == null);
      }
    }
  }
}
