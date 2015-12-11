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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.ListenerAdapter;

/**
 * time model that uses instruction count along current path to deduce
 * the execution time.
 * 
 * NOTE: the requirement that time has to be strictly increasing along a path
 * means we cannot skip the initialization
 */
public class ConstInsnPathTime extends ListenerAdapter implements TimeModel {

  // note - this class is not public since we want to make sure this listener
  // is the only one using this type
  static class TimeVal {
    final long time;
    TimeVal (long t){
      time = t;
    }
  }
  
  VM vm;
  int perInsnTime; // simple constant time assumed for each instruction
  
  long transitionStartTime;
  
  public ConstInsnPathTime (VM vm, Config conf){
    perInsnTime = conf.getInt("vm.time.per_insn", 1);
    
    vm.addListener(this);
    this.vm = vm;
  }

  protected long computeTime (){
    ThreadInfo tiCurrent = vm.getCurrentThread();
    long t = tiCurrent.getExecutedInstructions() * perInsnTime;
    
    return transitionStartTime + t;
  }
  
  //-- the listener interface
  @Override
  public void choiceGeneratorRegistered(VM vm, ChoiceGenerator<?> nextCG, ThreadInfo ti, Instruction executedInsn){
    ChoiceGenerator<?> cgPrev = nextCG.getPreviousChoiceGenerator();
    ThreadInfo tiCurrent = vm.getCurrentThread();
    long t = tiCurrent.getExecutedInstructions() * perInsnTime;
    
    TimeVal tv = null;
    
    if (nextCG.isCascaded()){
      // there's got to be a previous one, and its associated with the same insn
      tv = cgPrev.getAttr(TimeVal.class);
      
    } else {
      if (cgPrev != null){
        TimeVal tvPrev = cgPrev.getAttr(TimeVal.class); // there has to be one
        tv = new TimeVal(tvPrev.time + t);
             
      } else {
        tv = new TimeVal( t);
      }
    }
    
    nextCG.addAttr( tv);
  }
  
  @Override
  public void choiceGeneratorAdvanced(VM vm, ChoiceGenerator<?> currentCG){
    TimeVal tv = currentCG.getAttr(TimeVal.class);
    if (tv != null){
      transitionStartTime = tv.time;
    } else {
      transitionStartTime = 0;
    }
  }
  
  //--- the TimeModel interface
  @Override
  public long currentTimeMillis() {
    return computeTime();
  }

  @Override
  public long nanoTime() {
    return computeTime();
  }
  
}
