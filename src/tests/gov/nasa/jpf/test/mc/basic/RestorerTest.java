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

/**
 * regression test for on-demand state restoration by means of
 * ClosedMementos
 */
public class RestorerTest extends TestJPF {

  static class X {
    int id;
    public void whoami() {
      System.out.print("I am X #");
      System.out.println(id);
    }
  }
  
  @Test
  public void testRestoredInsnCount (){
    if (verifyNoPropertyViolation()){
      
      boolean b = Verify.getBoolean();
      System.out.println( "--- 1. CG: " + b);
      
      for (int i=1; i<=5; i++){
        X x = new X();
        x.whoami();
        assert x.id == i;
      }

      b = Verify.getBoolean();
      System.out.println( "--- 2. CG: " + b);
      
      X x = new X();
      x.whoami();
      assert x.id == 1; // different location, so we restart with 1
    }
  }
  
  @Test
  public void testRestoredInsnCountBFS (){
    if (verifyNoPropertyViolation("+search.class=.search.heuristic.BFSHeuristic")){
      
      boolean b = Verify.getBoolean();
      System.out.println( "--- 1. CG: " + b);
      
      for (int i=1; i<=5; i++){
        X x = new X();
        x.whoami();
        assert x.id == i;
      }

      b = Verify.getBoolean();
      System.out.println( "--- 2. CG: " + b);
      
      X x = new X();
      x.whoami();
      assert x.id == 1; // different location, so we restart with 1
    }
  }
}
