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

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.GETFIELD;
import gov.nasa.jpf.jvm.bytecode.IRETURN;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.choice.IntChoiceFromList;

import org.junit.Test;

import de.fosd.typechef.featureexpr.FeatureExprFactory;

public class SkipInstructionTest extends TestJPF {

  //--- replacing field access

  int answer = 0;

  public static class GetFieldListener extends ListenerAdapter {
    
    @Override
    public void executeInstruction(VM vm, ThreadInfo ti, Instruction insnToExecute) {
      Instruction pc = ti.getPC().getValue();

      if (pc instanceof GETFIELD) {
        GETFIELD gf = (GETFIELD) pc;
        if (gf.getVariableId().equals(SkipInstructionTest.class.getName() + ".answer")) {
          System.out.println("now intercepting: " + pc);

          // simulate the operand stack behavior of the skipped insn
          StackFrame frame = ti.getModifiableTopFrame();

          frame.pop();
          frame.push(FeatureExprFactory.True(), new One<>(42));

          ti.skipInstruction(pc.getNext());
        }
      }
    }
  }
  
  @Test
  public void testGETFIELD () {

    if (verifyNoPropertyViolation("+listener=gov.nasa.jpf.test.mc.basic.SkipInstructionTest$GetFieldListener")){
      int i = answer; // to be intercepted by listener
    
      System.out.println(i);
      assert (i == 42) : "get_field not intercepted: " + i;
    }
  }
  
  //--- replacing method execution
  // this is not using skipInstruction but is setting the next one to enter, which
  // means it can skip over a whole bunch of things. The use that comes to mind is to
  // skip over method bodies, but still preserve the invoke processing so that we
  // preserve the locking/sync (which we otherwise would have to do explicitly from
  // a pre-exec listener
  
  // the intercepted method
  int foo (int a, int b) {
    int result = a + b;
    if (result > 10) {
      return 10;
    } else {
      return result;
    }
  }
  
  // the listener that does the interception
  public static class InvokeListener extends ListenerAdapter {
    MethodInfo interceptedMethod;
    
    @Override
    public void classLoaded (VM vm, ClassInfo ci) {
      if (ci.getName().equals("gov.nasa.jpf.test.mc.basic.SkipInstructionTest")) {
        interceptedMethod = ci.getMethod("foo(II)I", false);
        assert interceptedMethod != null : "foo(II)I not found";
        System.out.println("method to intercept: " + interceptedMethod);
      }
    }
        
    @Override
    public void instructionExecuted (VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
      MethodInfo mi = ti.getTopFrameMethodInfo();
      if (mi == interceptedMethod) {
        System.out.println("in " + mi);

        if (!ti.isFirstStepInsn()) {
          System.out.println("in top half: " + executedInsn);
          if (executedInsn instanceof InvokeInstruction) { // we just entered the interceptedMethod
            IntChoiceFromList cg = new IntChoiceFromList("Test", 42, 43);
            if (vm.setNextChoiceGenerator(cg)) {
              return; // we are done here, next insn in this method will skip to return
            }
          }
        } else {
          // note - this is the first insn WITHIN the interceptedMethod
          System.out.println("in bottom half: " + executedInsn);
          IntChoiceFromList cg = vm.getCurrentChoiceGenerator("Test", IntChoiceFromList.class);
          if (cg != null) {
            int choice = cg.getNextChoice();
            Instruction lastInsn = mi.getLastInsn();
            assert lastInsn instanceof IRETURN : "last instruction not an IRETURN ";
            StackFrame frame = ti.getModifiableTopFrame(); // we are modifying it
            System.out.println("listener is skipping method body of " + mi + " returning " + choice);
            frame.push(FeatureExprFactory.True(), new One<>(choice));
            ti.setNextPC(lastInsn);
          } else {
            System.out.println("unexpected CG: " + cg);
          }
        }
      }      
    }    
  }
  
  @Test
  public void testSkipMethodBody() {
    if (verifyNoPropertyViolation("+listener=gov.nasa.jpf.test.mc.basic.SkipInstructionTest$InvokeListener")){
      int ret = foo( 3, 4);
      System.out.println(ret);
      //assertTrue( ret == 42);
    }    
  }
}
