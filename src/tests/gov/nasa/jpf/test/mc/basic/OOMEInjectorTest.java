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

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

public class OOMEInjectorTest extends TestJPF {

  @Test
  public void testDirectLoc () {
    if (verifyUnhandledException("java.lang.OutOfMemoryError", "+listener=.listener.OOMEInjector",
                                  "+oome.locations=OOMEInjectorTest.java:32")){
      Object o = new Integer(42);
    }
  }
  
  
  static int bar(int y){
    Integer res = new Integer(y);  // this should fail
    return res;
  }
  
  static int foo (int x){
    int res = x + bar(42);
    return res;
  }
  
  @Test
  public void testScope(){
    if (verifyUnhandledException("java.lang.OutOfMemoryError", "+listener=.listener.OOMEInjector",
        "+oome.locations=OOMEInjectorTest.java:52-53")){
      bar(4200); // this should be Ok
      int res = foo(42);  // this should cause an OOME
      System.out.println("should never get here!");
    }    
  }
  
  static class DontAllocateMe {}
  static class X extends DontAllocateMe {}
  
  @Test
  public void testType(){
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }
    
    if (verifyNoPropertyViolation("+listener=.listener.OOMEInjector",
        "+oome.types=*DontAllocateMe+")){
      try {
        X x = new X(); // that should trip an OOME
      } catch (OutOfMemoryError oome){
        oome.printStackTrace();
        Verify.incrementCounter(0);
      }
    }
    
    if (!isJPFRun()){
      assertEquals(1, Verify.getCounter(0));
    }
  }
}
