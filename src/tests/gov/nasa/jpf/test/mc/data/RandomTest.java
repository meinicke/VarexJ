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
package gov.nasa.jpf.test.mc.data;


import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import java.util.Random;

import org.junit.Test;

/**
 * test of gov.nasa.jpf.vm.Verify nondeterministic data initailization
 */
public class RandomTest extends TestJPF {
  private void run (int n){
    int i = Verify.getInt(0,n); // we should backtrack 0..n times to this location
    Verify.incrementCounter(0); // counter '0' should have value (n+1) after JPF is done
    System.out.println(i);
  }

  @Test public void testRandom () {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }
    if (verifyNoPropertyViolation()){
      run(3);
    }
    if (!isJPFRun()){
      if (Verify.getCounter(0) != 4){
        fail("wrong number of paths");
      }
    }
  }

  @Test public void testRandomBFS () {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }
    if (verifyNoPropertyViolation("+search.class=gov.nasa.jpf.search.heuristic.BFSHeuristic")){
      run(3);
    }
    if (!isJPFRun()){
      if (Verify.getCounter(0) != 4){
        fail("wrong number of paths");
      }
    }
  }


  
  @Test public void testJavaUtilRandom () {

    if (verifyUnhandledException("java.lang.ArithmeticException", "+cg.enumerate_random=true")) {
      Random random = new Random(42);      // (1)

      int a = random.nextInt(4);           // (2)
      System.out.print("a=");
      System.out.println(a);

      //... lots of code here

      int b = random.nextInt(3);           // (3)
      System.out.print("a=");
      System.out.print(a);
      System.out.print(",b=");
      System.out.println(b);


      int c = a / (b + a - 2);                  // (4)
      System.out.print("a=");
      System.out.print(a);
      System.out.print(",b=");
      System.out.print(b);
      System.out.print(",c=");
      System.out.println(c);
    }
  }
}
