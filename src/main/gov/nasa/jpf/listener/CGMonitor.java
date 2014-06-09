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
package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.ThreadInfo;

public class CGMonitor extends ListenerAdapter {
  int depth;
  boolean isFirstInsn = true;
  boolean showInsn = false;
  
  public CGMonitor (Config conf) {
    showInsn = conf.getBoolean("cg.show_insn");
  }
  
  @Override
  public void stateAdvanced (Search search) {
    depth++;
  }
  
  @Override
  public void stateBacktracked (Search search) {
    depth--;
  }
  
  @Override
  public void stateRestored (Search search) {
    depth = search.getDepth();    
  }
  
  void printPrefix(char c) {
    for (int i=0; i<depth; i++) {
      System.out.print(c);
    }
  }
  
  @Override
  public void choiceGeneratorAdvanced (VM vm, ChoiceGenerator<?> currentCG) {
    ChoiceGenerator<?> cg = vm.getChoiceGenerator();
    
    printPrefix('.');
    System.out.print(cg.getNextChoice());
    
    if (!showInsn) {
      System.out.println();
    }
    isFirstInsn = true;
  }

  @Override
  public void instructionExecuted (VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
    if (showInsn && isFirstInsn) {
      
      //printPrefix(' ');
      
      System.out.print(" : [");
      System.out.print(ti.getId());
      System.out.print("] ");
      System.out.print(executedInsn);
      System.out.print(" (in ");
      System.out.print(executedInsn.getMethodInfo().getFullName());
      System.out.print(":");
      System.out.print(executedInsn.getInstructionIndex());
      System.out.println(')');
      
      isFirstInsn = false;
    }
  }
}
