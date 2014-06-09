//
// Copyright (C) 2011 United States Government as represented by the
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
import gov.nasa.jpf.jvm.bytecode.LocalVariableInstruction;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;

import java.util.ArrayList;

import org.junit.Test;


/**
 * regression test for LocalVarInfo lookup
 */
public class LocalVarInfoTest extends TestJPF {
  
  
  public static class TestLookupListener extends ListenerAdapter{
    
    MethodInfo logMethod = null;
    static ArrayList<String> log;

    public TestLookupListener(){
      log = new ArrayList<String>();
    }

    @Override
    public void methodEntered (VM vm, ThreadInfo ti, MethodInfo mi){
      if (mi.getUniqueName().equals("testLookup()V")){
        logMethod = mi;
        System.out.println("---- " + mi.getUniqueName() + " entered");
        System.out.println(" LocalVarInfos (should have {'this', 'x', 'y'} : ");
        LocalVarInfo[] lvs = mi.getLocalVars(); 
        for (LocalVarInfo lv : lvs){
          System.out.println("    " + lv);
        }
        System.out.println();
        
        assertTrue( lvs.length == 3);
      }
    }

    @Override
    public void methodExited (VM vm, ThreadInfo ti, MethodInfo mi){
      if (mi == logMethod){
        logMethod = null;
      }      
    }

    @Override
    public void instructionExecuted(VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn){
      if (executedInsn.getMethodInfo() == logMethod){
        System.out.printf(" %2d: %s", executedInsn.getPosition(), executedInsn);
        if (executedInsn instanceof LocalVariableInstruction){
          LocalVariableInstruction lvinsn = (LocalVariableInstruction)executedInsn;
          LocalVarInfo lv = lvinsn.getLocalVarInfo(); 
          System.out.print(" : " + lv);

          log.add( executedInsn.getClass().getSimpleName() + " " + lv.getName());
        }
        System.out.println();
      }
    }
  }
  
  static String[] expected = {
    "ALOAD this",
    "ISTORE x",
    "ILOAD x",
    "ISTORE y",
    "ILOAD y"
  };
  
  @Test
  public void testLookup (){
    if (verifyNoPropertyViolation("+listener=.test.mc.basic.LocalVarInfoTest$TestLookupListener")){
      // DON'T CHANGE THIS CODE!
      // this should be a sequence of 
      
      //  aload this
      //  ..
      //  istore x
      //  iload x 
      //  istore y
      //  ..
      //  iload y
      //  ..
      
      int x = 42;
      int y = x;
      System.out.println(y);
    }
    
    if (!isJPFRun()){
      checkLog();
    }
  }
  
  private void checkLog(){
    System.out.println("--- local var access log: ");
    int i = 0;
    assertTrue(TestLookupListener.log.size() == expected.length);
    for (String s : TestLookupListener.log) {
      System.out.println(s);
      assertTrue(s.equals(expected[i++]));
    }
  }
}
