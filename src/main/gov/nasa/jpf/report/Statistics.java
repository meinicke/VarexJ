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

package gov.nasa.jpf.report;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.EXECUTENATIVE;
import gov.nasa.jpf.jvm.bytecode.FieldInstruction;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.LockInstruction;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadChoiceGenerator;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

/**
 * simple structure to hold statistics info created by Reporters/Publishers
 * this is kind of a second tier SearchListener, which does not
 * explicitly have to be registered
 * 
 * <2do> this should get generic and accessible enough to replace all the
 * other statistics collectors, otherwise there is too much redundancy.
 * If users have special requirements, they should subclass Statistics
 * and set jpf.report.statistics.class accordingly
 * 
 * Note that Statistics might be accessed by a background thread
 * reporting JPF progress, hence we have to synchronize
 */
public class Statistics extends ListenerAdapter implements Cloneable {
    
  // we make these public since we don't want to add a gazillion of
  // getters for these purely informal numbers
  
  public long maxUsed = 0;
  public long newStates = 0;
  public long backtracked = 0;
  public long restored = 0;
  public int processed = 0;
  public int constraints = 0;
  public long visitedStates = 0;
  public long endStates = 0;
  public int maxDepth = 0;
  
  public int gcCycles = 0;
  public long insns = 0;
  public int threadCGs = 0;
  public int sharedAccessCGs = 0;
  public int monitorCGs = 0;
  public int signalCGs = 0;
  public int threadApiCGs = 0;
  public int breakTransitionCGs = 0;
  public int dataCGs = 0;
  public long nNewObjects = 0;
  public long nReleasedObjects = 0;
  public int maxLiveObjects = 0;

  public Statistics clone() {
    try {
      return (Statistics)super.clone();
    } catch (CloneNotSupportedException e) {
      return null; // can't happen
    }
  }
  
  @Override
  public void gcBegin (VM vm) {
    int heapSize = vm.getHeap().size();
    if (heapSize > maxLiveObjects){
      maxLiveObjects = heapSize;
    }

    gcCycles++;
  }
  
  @Override
  public void instructionExecuted (VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn){
    insns++;
  }

  @Override
  public void choiceGeneratorSet (VM vm, ChoiceGenerator<?> newCG){
    ChoiceGenerator<?> cg = VM.getVM().getChoiceGenerator();
    if (cg instanceof ThreadChoiceGenerator){
      threadCGs++;

      Instruction insn = cg.getInsn();
      if (insn instanceof FieldInstruction) {
        sharedAccessCGs++;
      } else if (insn instanceof LockInstruction || insn instanceof InvokeInstruction) {
        monitorCGs++;
      } else if (insn instanceof EXECUTENATIVE) {
        MethodInfo mi = insn.getMethodInfo();
        if (mi != null) {
          ClassInfo ci = mi.getClassInfo();
          if (ci != null) {
            if (ci.isObjectClassInfo()) {
              // its got to be either a wait or a notify since we know the java.lang.Object methods
              signalCGs++;
            } else if (ci.isThreadClassInfo()) {
              threadApiCGs++;
            }
          } else {
            // Hmm - a CG from a synthetic method?
          }
        } else {
          // even more Hmmm - a GC from a synthesized instruction 
        }
      } else {
        breakTransitionCGs++; // e.g. max_transition_length or idleLoop breakers
      }
    } else {
      dataCGs++;
    }
  }
  
  @Override
  public void objectCreated (VM vm, ThreadInfo ti, ElementInfo ei){
    nNewObjects++;
  }
  
  @Override
  public void objectReleased (VM vm, ThreadInfo ti, ElementInfo ei){
    nReleasedObjects++;
  }
  
  @Override
  public void stateAdvanced (Search search){
    long m = Runtime.getRuntime().totalMemory();
    if (m > maxUsed) {
      maxUsed = m;
    }

    if (search.isNewState()){
      newStates++;
      int depth = search.getDepth();
      if (depth > maxDepth){
        maxDepth = depth;
      }
    } else {
      visitedStates++;
    }
    if (search.isEndState()){
      endStates++;
    }
  }
  
  @Override
  public void stateBacktracked (Search search){
    backtracked++;
  }
  
  @Override
  public void stateProcessed (Search search){
    processed++;
  }

  @Override
  public void stateRestored (Search search){
    restored++;
  }
  
  @Override
  public void searchConstraintHit (Search search){
    constraints++;
  }
  
  @Override
	public void resetInstructionCounter() {
		insns = 0;
	}

}
