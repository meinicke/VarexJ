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

import java.io.PrintWriter;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.annotation.JPFOption;
import gov.nasa.jpf.jvm.bytecode.FieldInstruction;
import gov.nasa.jpf.jvm.bytecode.InstanceFieldInstruction;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.LockInstruction;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

/**
 * Listener tool to monitor JPF execution. This class can be used as a drop-in
 * replacement for JPF, which is called by ExecTracker.
 * ExecTracker is mostly a VMListener of 'instructionExecuted' and
 * a SearchListener of 'stateAdvanced' and 'statehBacktracked'
 */

public class ExecTracker extends ListenerAdapter {
  
  @JPFOption(type = "Boolean", key = "et.print_insn", defaultValue = "true", comment = "print executed bytecode instructions") 
  boolean printInsn = true;
  
  @JPFOption(type = "Boolean", key = "et.print_src", defaultValue = "false", comment = "print source lines")
  boolean printSrc = false;
  
  @JPFOption(type = "Boolean", key = "et.print_mth", defaultValue = "false", comment = "print executed method names")
  boolean printMth = false;
  
  @JPFOption(type = "Boolean", key = "et.skip_init", defaultValue = "true", comment = "do not log execution before entering main()")
  boolean skipInit = false;
  
  boolean showShared = false;
  
  PrintWriter out;
  String lastLine;
  MethodInfo lastMi;
  String linePrefix;
  
  boolean skip;
  MethodInfo miMain; // just to make init skipping more efficient
  
  public ExecTracker (Config config) {
    /** @jpfoption et.print_insn : boolean - print executed bytecode instructions (default=true). */
    printInsn = config.getBoolean("et.print_insn", true);

    /** @jpfoption et.print_src : boolean - print source lines (default=false). */
    printSrc = config.getBoolean("et.print_src", false);

    /** @jpfoption et.print_mth : boolean - print executed method names (default=false). */
    printMth = config.getBoolean("et.print_mth", false);

    /** @jpfoption et.skip_init : boolean - do not log execution before entering main() (default=true). */
    skipInit = config.getBoolean("et.skip_init", true);
    
    showShared = config.getBoolean("et.show_shared", true);
    
    if (skipInit) {
      skip = true;
    }
    
    out = new PrintWriter(System.out, true);
  }
  
  /******************************************* SearchListener interface *****/
  
  @Override
  public void stateRestored(Search search) {
    int id = search.getStateId();
    out.println("----------------------------------- [" +
                       search.getDepth() + "] restored: " + id);
  }
    
  //--- the ones we are interested in
  @Override
  public void searchStarted(Search search) {
    out.println("----------------------------------- search started");
    if (skipInit) {
      ThreadInfo tiCurrent = ThreadInfo.getCurrentThread();
      miMain = tiCurrent.getEntryMethod();
      
      out.println("      [skipping static init instructions]");
    }
  }

  @Override
  public void stateAdvanced(Search search) {
    int id = search.getStateId();
    
    out.print("----------------------------------- [" +
                     search.getDepth() + "] forward: " + id);
    if (search.isNewState()) {
      out.print(" new");
    } else {
      out.print(" visited");
    }
    
    if (search.isEndState()) {
      out.print(" end");
    }
    
    out.println();
    
    lastLine = null; // in case we report by source line
    lastMi = null;
    linePrefix = null;
  }

  @Override
  public void stateProcessed (Search search) {
    int id = search.getStateId();
    out.println("----------------------------------- [" +
                       search.getDepth() + "] done: " + id);
  }

  @Override
  public void stateBacktracked(Search search) {
    int id = search.getStateId();

    lastLine = null;
    lastMi = null;

    out.println("----------------------------------- [" +
                       search.getDepth() + "] backtrack: " + id);
  }
  
  @Override
  public void searchFinished(Search search) {
    out.println("----------------------------------- search finished");
  }

  /******************************************* VMListener interface *********/

  @Override
  public void gcEnd(VM vm) {
    out.println("\t\t # garbage collection");
  }

  //--- the ones we are interested in
  @Override
  public void instructionExecuted(VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
    
    if (skip) {
      MethodInfo mi = executedInsn.getMethodInfo();
      if (mi == miMain) {
        skip = false; // start recording
      } else {
        return;  // skip
      }
    }

    int nNoSrc = 0;
    
    if (linePrefix == null) {
      linePrefix = Integer.toString( ti.getId()) + " : ";
    }
    
    // that's pretty redundant to what is done in the ConsolePublisher, but we don't want 
    // presentation functionality in Step anymore
    if (printSrc) {
      String line = executedInsn.getSourceLine();
      if (line != null){
        if (nNoSrc > 0) {
          out.println("            [" + nNoSrc + " insn w/o sources]");
        }

        if (!line.equals(lastLine)) {
          out.print("            [");
          out.print(executedInsn.getFileLocation());
          out.print("] : ");
          out.println(line.trim());
        }
        
        nNoSrc = 0;
        
      } else { // no source
        nNoSrc++;
      }
      
      lastLine = line;
    }
    
    if (printInsn) {      
      if (printMth) {
        MethodInfo mi = executedInsn.getMethodInfo();
        if (mi != lastMi){
          ClassInfo mci = mi.getClassInfo();
          out.print("      ");
          if (mci != null) {
            out.print(mci.getName());
            out.print(".");
          }
          out.println(mi.getUniqueName());
          lastMi = mi;
        }
      }
      
      out.print( linePrefix);
      
      out.print('[');
      out.print(executedInsn.getPosition());
      out.print("] ");
      
      out.print(executedInsn);
        
      // annotate (some of) the bytecode insns with their arguments
      if (executedInsn instanceof InvokeInstruction) {
        MethodInfo callee = ((InvokeInstruction)executedInsn).getInvokedMethod(); 
        if ((callee != null) && callee.isMJI()) { // Huhh? why do we have to check this?
          out.print(" [native]");
        }
      } else if (executedInsn instanceof FieldInstruction) {
        out.print(" ");
        if (executedInsn instanceof InstanceFieldInstruction){
          InstanceFieldInstruction iinsn = (InstanceFieldInstruction)executedInsn;
          out.print(iinsn.getId(iinsn.getLastElementInfo()));
        } else {
          out.print(((FieldInstruction)executedInsn).getVariableId());
        }
      } else if (executedInsn instanceof LockInstruction) {
        LockInstruction lockInsn = (LockInstruction)executedInsn;
        int lockRef = lockInsn.getLastLockRef();

        out.print(" ");
        out.print( ti.getElementInfo(lockRef));
      }
      out.println();
    }
  }

  @Override
  public void threadStarted(VM vm, ThreadInfo ti) {
    out.println( "\t\t # thread started: " + ti.getName() + " index: " + ti.getId());
  }

  @Override
  public void threadTerminated(VM vm, ThreadInfo ti) {
    out.println( "\t\t # thread terminated: " + ti.getName() + " index: " + ti.getId());
  }
  
  @Override
  public void exceptionThrown (VM vm, ThreadInfo ti, ElementInfo ei) {
    MethodInfo mi = ti.getTopFrameMethodInfo();
    out.println("\t\t\t\t # exception: " + ei + " in " + mi);
  }
  
  @Override
  public void choiceGeneratorAdvanced (VM vm, ChoiceGenerator<?> currentCG) {
    out.println("\t\t # choice: " + currentCG);
    
    //vm.dumpThreadStates();
  }
  
  @Override
  public void objectExposed (VM vm, ThreadInfo currentThread, ElementInfo sharedObject, ElementInfo exposedObject) {
    if (showShared){
      out.println("\t\t # exposed " + exposedObject + " through shared " + sharedObject);
    }
  }
  
  @Override
  public void objectShared (VM vm, ThreadInfo currentThread, ElementInfo sharedObject) {
    if (showShared){
      out.println("\t\t # shared " + sharedObject);
    }
  }
  
  
  /****************************************** private stuff ******/

  void filterArgs (String[] args) {
    for (int i=0; i<args.length; i++) {
      if (args[i] != null) {
        if (args[i].equals("-print-lines")) {
          printSrc = true;
          args[i] = null;
        }
      }
    }
  }
}

