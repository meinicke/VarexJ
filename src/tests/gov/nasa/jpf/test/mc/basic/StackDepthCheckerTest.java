//
// Copyright (C) 2012 United States Government as represented by the
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
 * regression test for StackDepthChecker listener
 */
public class StackDepthCheckerTest extends TestJPF {
  
  int n;
  
  void foo(){
    n++;
    System.out.print("entered foo() at level ");
    System.out.println(n);
    
    foo();
    
    n--; // not that we ever get here
    System.out.print("exited foo() at level ");
    System.out.println(n);
  }
  
  @Test 
  @SuppressWarnings("deprecation")
  public void testInfiniteRecursion (){
    if (verifyUnhandledException("java.lang.StackOverflowError", 
        "+listener=.listener.StackDepthChecker", "+sdc.max_stack_depth=42")){
      Thread t = Thread.currentThread();
      n = t.countStackFrames(); // it's deprecated, but we just want to make the printout more readable
      foo();
    }
  }

}
