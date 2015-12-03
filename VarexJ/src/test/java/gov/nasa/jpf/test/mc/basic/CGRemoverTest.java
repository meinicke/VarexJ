//
// Copyright (C) 2010 United States Government as represented by the
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

import cmu.conditional.One;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.VM;

import org.junit.Test;

/**
 * unit test for the CGRemover listener
 */
@SuppressWarnings("unused")public class CGRemoverTest extends TestJPF {

  static class R1 implements Runnable {
    int data = 42;

    public synchronized int getData() {
      return data;
    }

    public void run() {
      int r = getData();  // should not cause CG  !! LINE USED IN LOCATIONSPEC
    }
  }

  public static class R1Listener extends ListenerAdapter {

    @Override
    public void choiceGeneratorSet (VM vm, ChoiceGenerator<?> newCG){
      Instruction insn;
      if (newCG.getInsn() instanceof One) {
        insn = newCG.getInsn().getValue();
      }
      else{
        System.err.println("___________________________________________________");
        System.err.println("[WARN] Get value of choice called: " + this);
        System.err.println("---------------------------------------------------");
        // Let's wait for a NullPointerException
        insn = null;
      }

      if (insn instanceof InvokeInstruction){
        MethodInfo mi = ((InvokeInstruction)insn).getInvokedMethod();
        if (mi.getName().equals("getData")){
          fail("CG should have been removed by CGRemover");
        }
      }
    }
  }

  // WATCH IT - THIS IS FRAGILE WRT SOURCE LINES
  @Test
  public void testSyncLocation() {
    if (verifyNoPropertyViolation("+listener=.listener.CGRemover,.test.mc.basic.CGRemoverTest$R1Listener",
            "+log.info=gov.nasa.jpf.CGRemover",
            "+cgrm.sync.cg_class=gov.nasa.jpf.vm.ThreadChoiceGenerator",
            "+cgrm.sync.locations=CGRemoverTest.java:46,CGRemoverTest.java:86")){
      R1 o = new R1();
      Thread t = new Thread(o);
      t.start();   // from now on 'o' is shared

      int r = o.getData(); // should not cause CG  !! LINE USED IN LocationSpec
    }
  }


  @Test
  public void testSyncCall() {
    if (verifyNoPropertyViolation("+listener=.listener.CGRemover,.test.mc.basic.CGRemoverTest$R1Listener",
            "+log.info=gov.nasa.jpf.CGRemover",
            "+cgrm.sync.cg_class=gov.nasa.jpf.vm.ThreadChoiceGenerator",
            "+cgrm.sync.method_calls=gov.nasa.jpf.test.mc.basic.CGRemoverTest$R1.getData()")){
      R1 o = new R1();
      Thread t = new Thread(o);
      t.start();   // from now on 'o' is shared

      int r = o.getData(); // should not cause CG
    }
  }

  @Test
  public void testSyncBody() {
    if (verifyNoPropertyViolation("+listener=.listener.CGRemover,.test.mc.basic.CGRemoverTest$R1Listener",
            "+log.info=gov.nasa.jpf.CGRemover",
            "+cgrm.sync.cg_class=gov.nasa.jpf.vm.ThreadChoiceGenerator",
            "+cgrm.sync.method_bodies=gov.nasa.jpf.test.mc.basic.CGRemoverTest$R1.run(),gov.nasa.jpf.test.mc.basic.CGRemoverTest.testSyncBody()")){
      R1 o = new R1();
      Thread t = new Thread(o);
      t.start();   // from now on 'o' is shared

      int r = o.getData(); // should not cause CG
    }
  }
}
