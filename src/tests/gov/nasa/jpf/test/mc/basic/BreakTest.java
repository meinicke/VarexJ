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

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.PUTFIELD;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.SystemState;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.Verify;


/**
 * simple test application to break transitions from listeners
 */
public class BreakTest extends TestJPF {

  static final String LISTENER = "+listener=.test.mc.basic.BreakTestListener";

  static class BreakListener extends ListenerAdapter {
    public static int nCG; // braindead, just to check from outside

    public BreakListener() {
      nCG = 0;
    }

    @Override
    public void choiceGeneratorSet (VM vm, ChoiceGenerator<?> newCG) {
      System.out.println("CG set: " + newCG);
      nCG++;
    }

    @Override
    public void choiceGeneratorAdvanced (VM vm, ChoiceGenerator<?> currentCG) {
      System.out.println("CG advanced: " + currentCG);
    }
  }


  int data;
  
  //--- test setIgnored

  public static class FieldIgnorer extends BreakListener {
    public void instructionExecuted(VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
      SystemState ss = vm.getSystemState();

      if (executedInsn instanceof PUTFIELD) {  // break on field access
        FieldInfo fi = ((PUTFIELD) executedInsn).getFieldInfo(null);
        if (fi.getClassInfo().getName().endsWith(".BreakTest")) {
          System.out.println("# ignoring after: " + executedInsn);
          ss.setIgnored(true);
        }
      }
    }
  }

  @Test
  public void testSimpleIgnore () {
    if (verifyNoPropertyViolation("+listener=.test.mc.basic.BreakTest$FieldIgnorer",
                                  "+vm.max_transition_length=1000000")) { 
      int i = 42;
      data = i; // we ignore here
      fail("should never get here");

    } else {
      if (BreakListener.nCG != 1) { // that's really simplistic
        fail("wrong number of CGs: " + BreakListener.nCG);
      }
    }
  }


  //--- testSimpleBreak

  public static class FieldBreaker extends BreakListener {
    public void instructionExecuted(VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
      SystemState ss = vm.getSystemState();

      if (executedInsn instanceof PUTFIELD) {  // break on field access
        FieldInfo fi = ((PUTFIELD) executedInsn).getFieldInfo(null);
        if (fi.getClassInfo().getName().endsWith(".BreakTest")) {
          System.out.println("# breaking after: " + executedInsn);
          ti.breakTransition("breakTest");
        }
      }
    }
  }

  @Test 
  public void testSimpleBreak () {
    if (verifyNoPropertyViolation("+listener=.test.mc.basic.BreakTest$FieldBreaker",
                                  "+vm.max_transition_length=1000000")) { 
      int i = 42;
      data = i; // we break after that
      i = 0;

    } else {
      if (BreakListener.nCG != 2) { // that's really simplistic
        fail("wrong number of CGs: " + BreakListener.nCG);
      }
    }
  }


  //--- test CG chain break

  public static class FooCallBreaker extends BreakListener {
    public void instructionExecuted(VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
      SystemState ss = vm.getSystemState();

      if (executedInsn instanceof InvokeInstruction) { // break on method call
        InvokeInstruction call = (InvokeInstruction) executedInsn;

        if ("foo()V".equals(call.getInvokedMethodName())) {
          System.out.println("# breaking & pruning after: " + executedInsn);
          System.out.println("# registered (ignored) CG: " + ss.getNextChoiceGenerator());
          ti.breakTransition("breakTest"); // not required since we ignore
          ss.setIgnored(true);
        }
      }
    }
  }

  void foo () {
    System.out.println("foo");
  }

  void bar () {
    System.out.println("bar");
  }

  @Test 
  public void testDeepCGBreak () {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+listener=.test.mc.basic.BreakTest$FooCallBreaker")) {
      if (Verify.getBoolean(false)) {
        System.out.println("foo,bar branch");
        foo(); // listener sets it ignored -> break
        bar();
        fail("should not get here");

      } else {
        Verify.incrementCounter(0);

        System.out.println("bar,foo branch");
        bar();
        foo(); // listener sets it ignored -> break
        fail("should not get here");
      }
    }

    if (!isJPFRun()){
      assert Verify.getCounter(0) == 1;
    }
  }


  //--- test ignore after setting nextCG

  public static class VerifyNextIntBreaker extends BreakListener {
    public void choiceGeneratorRegistered(VM vm, ChoiceGenerator<?> nextCG, ThreadInfo ti, Instruction executedInsn) {
      SystemState ss = vm.getSystemState();
      
      ChoiceGenerator<?> cg = ss.getNextChoiceGenerator();
      if (cg.getId().equals("verifyGetInt(II)")) {
        System.out.println("# breaking & pruning after: " + ti.getPC());
        System.out.println("# registered (ignored) CG: " + cg);

        ss.setIgnored(true); // should reset the IntIntervalCG registered by the native getInt()
        ti.breakTransition("breakTest"); // should have no effect
      }
    }
  }

  @Test
  public void testIgnoreAfterCG () {
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }

    if (verifyNoPropertyViolation("+listener=.test.mc.basic.BreakTest$VerifyNextIntBreaker")) {
      if (Verify.getBoolean(false)){
        System.out.println("true branch (should be first)");

        int i = Verify.getInt(1, 2); // listener breaks & ignores post exec
        fail("should never get here");

      } else {
        Verify.incrementCounter(0);

        System.out.println("false branch");
      }
    }

    if (!isJPFRun()){
      assert Verify.getCounter(0) == 1;
    }
  }

}
