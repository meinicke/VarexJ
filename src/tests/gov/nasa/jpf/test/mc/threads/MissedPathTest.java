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
package gov.nasa.jpf.test.mc.threads;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

/**
 * test for missed paths in concurrent threads with very little interaction
 */
public class MissedPathTest extends TestJPF {

  static class X {
    boolean pass;
  }
  
  static class InstanceFieldPropagation extends Thread {
    X myX; // initially not set

    public void run() {
      if (myX != null){
        System.out.println("T: accessed global myX");
        if (!myX.pass){  // (2) won't fail unless main is between (0) and (1)
          throw new AssertionError("gotcha");
        }
      }
    }    
  }

  @Test
  public void testInstanceFieldPropagation () {
    if (verifyAssertionErrorDetails("gotcha", "+vm.por.break_on_exposure=true")) {
      InstanceFieldPropagation mp = new InstanceFieldPropagation();
      mp.start();
      
      X x = new X();
      System.out.println("M: new " + x);
      mp.myX = x;        // (0) x not shared until this GOT executed
     
      //Thread.yield();  // this would expose the error
      System.out.println("M: x.pass=true");
      x.pass = true;     // (1) need to break BEFORE assignment or no error
    }
  }
  
  //----------------------------------------------------------------------------------
  
  static class Y {
    X x;
  }
  
  static Y globalY; // initially not set
  
  static class StaticFieldPropagation extends Thread {
    public void run(){
      if (globalY != null){
        if (!globalY.x.pass){  // (2) won't fail unless main is between (0) and (1)
          throw new AssertionError("gotcha");
        }
      }
    }
  }
  
  @Test
  public void testStaticFieldPropagation () {
    if (verifyAssertionErrorDetails("gotcha", "+vm.por.break_on_exposure=true")) {
      StaticFieldPropagation mp = new StaticFieldPropagation();
      mp.start();

      X x = new X();
      Y y = new Y();
      y.x = x;
      
      globalY = y;       // (0) x not shared until this GOT executed

      //Thread.yield();  // this would expose the error
      x.pass = true;     // (1) need to break BEFORE assignment or no error
    }    
  }
  
  //-------------------------------------------------------------------------------
  
  static class PutContender extends Thread {
    X myX;

    public void run () {
      myX = new X();  // competing put with exposure

      if (myX != null) {  // doesn't matter, we just want to GET myX
        System.out.println("T: accessed global myX");
      }
    }
  }
  
  // this does not really belong here since it doesn't test not missing paths, but
  // if the exposure CGs we use to avoid missing paths are not causing infinite loops.
  // NOTE: turning off state matching is crucial here
  @Test
  public void testCompetingExposures(){
    if (verifyNoPropertyViolation("+vm.storage.class=nil")){
      PutContender mp = new PutContender();
      mp.start();

      X x = new X();
      System.out.println("M: new " + x);
      mp.myX = x;    // this is one of the competing PUTs

      System.out.println("M: x.pass=true");
      x.pass = true; // irrelevant in this case
    }
  }
}
