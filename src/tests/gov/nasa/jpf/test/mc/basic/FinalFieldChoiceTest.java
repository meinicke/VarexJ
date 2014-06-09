//
// Copyright (C) 2013 United States Government as represented by the
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
 * test non-deterministic init of final fields
 */
public class FinalFieldChoiceTest extends TestJPF {

  
  //--- instance fields
  
  static class X {
    final boolean a;
    final boolean b;
    
    X(){
      a = Verify.getBoolean();
      b = Verify.getBoolean();
    }
  }
  
  @Test
  public void testFinalInstanceFields(){
    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
    }
    
    if (verifyNoPropertyViolation()){
      X x = new X();
      System.out.print("a=");
      System.out.print(x.a);
      System.out.print(", b=");
      System.out.println(x.b);
      
      Verify.incrementCounter(0);
      
      int n = Verify.getCounter(1);
      if (x.a && x.b) Verify.setCounter(1, n+3);
      else if (x.a) Verify.setCounter(1, n+2);
      else if (x.b) Verify.setCounter(1, n+1);
    }
    
    if (!isJPFRun()){
      assertTrue( "wrong number of choices", Verify.getCounter(0) == 4);
      assertTrue( "wrong choice values", Verify.getCounter(1) == 6);
    }    
  }
  
  //--- static fields
  static class Y {
    static final boolean a = Verify.getBoolean();
    static final boolean b = Verify.getBoolean();
  }
  
  @Test 
  public void testFinalStaticFields(){
    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
    }
    
    if (verifyNoPropertyViolation()){
      boolean a = Y.a;
      boolean b = Y.b;
      
      System.out.print("Y.a=");
      System.out.print(a);
      System.out.print(", Y.b=");
      System.out.println(b);
      
      Verify.incrementCounter(0);
      
      int n = Verify.getCounter(1);
      if (Y.a && Y.b) Verify.setCounter(1, n+3);
      else if (Y.a) Verify.setCounter(1, n+2);
      else if (Y.b) Verify.setCounter(1, n+1);
    }
    
    if (!isJPFRun()){
      assertTrue( "wrong number of choices", Verify.getCounter(0) == 4);
      assertTrue( "wrong choice values", Verify.getCounter(1) == 6);
    }  
  }
}
