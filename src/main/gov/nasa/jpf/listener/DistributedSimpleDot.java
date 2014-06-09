//
// Copyright (C) 2013 United States Government as represented by the
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
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.jvm.bytecode.DIRECTCALLRETURN;
import gov.nasa.jpf.jvm.bytecode.EXECUTENATIVE;
import gov.nasa.jpf.jvm.bytecode.FieldInstruction;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.LockInstruction;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.MultiProcessChoiceGenerator;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

/**
 * This is a Graphviz dot-file generator similar to SimpleDot. It is useful in
 * the case of Multiprocess applications. It distinguishes local choices from global
 * choices.
 * 
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class DistributedSimpleDot extends SimpleDot {

  static final String MP_START_NODE_ATTRS = "shape=octagon,fillcolor=green";
  static final String MP_NODE_ATTRS = "shape=octagon,fillcolor=azure2";
  
  protected String mpNodeAttrs;
  protected String mpStartNodeAttrs;
  
  protected Instruction insn;
  
  public DistributedSimpleDot (Config config, JPF jpf) {
    super(config, jpf);
    
    mpNodeAttrs = config.getString("dot.mp_node_attr", MP_NODE_ATTRS);
    startNodeAttrs = config.getString("dot.mp_start_node_attr", MP_START_NODE_ATTRS);
  }

  @Override
  public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction, Instruction executedInstruction) {
    insn = executedInstruction;
  }
  
  @Override
  public void stateAdvanced(Search search){
    int id = search.getStateId();
    long edgeId = ((long)lastId << 32) | id;
    
    String prcId = "P"+Integer.toString(search.getVM().getCurrentApplicationContext().getId());
    if (id <0 || seenEdges.contains(edgeId)){
      return; // skip the root state and property violations (reported separately)
    }
    
    String lastInst = getNextCG();
    String choice =  prcId+"."+getLastChoice();
    
    if (search.isErrorState()) {
      String eid = "e" + search.getNumberOfErrors();
      printTransition(getStateId(lastId), eid, choice, getError(search));
      printErrorState(eid);
      lastErrorId = eid;

    } else if (search.isNewState()) {
      
      if (search.isEndState()) {
        printTransition(getStateId(lastId), getStateId(id), choice, lastInst);
        printEndState(getStateId(id));
      } else {
        printTransition(getStateId(lastId), getStateId(id), choice, lastInst);
        printMultiProcessState(getStateId(id));
      }

    } else { // already visited state
      printTransition(getStateId(lastId), getStateId(id), choice, lastInst);
    }

    seenEdges.add(edgeId);
    lastId = id;
  }
  
  protected String getNextCG(){
    if (insn instanceof EXECUTENATIVE) {
      return getNativeExecCG((EXECUTENATIVE)insn);

    } else if (insn instanceof FieldInstruction) { // shared object field access
      return getFieldAccessCG((FieldInstruction)insn);

    } else if (insn instanceof LockInstruction){ // monitor_enter
      return getLockCG((LockInstruction)insn);

    } else if (insn instanceof InvokeInstruction){ // sync method invoke
      return getInvokeCG((InvokeInstruction)insn);
    } else if(insn instanceof DIRECTCALLRETURN && vm.getCurrentThread().getNextPC()==null) {
      return "return";
    }

    return insn.getMnemonic(); // our generic fallback
  }
  
  protected void printMultiProcessState(String stateId){
    if(vm.getNextChoiceGenerator() instanceof MultiProcessChoiceGenerator) {
      pw.print(stateId);

      pw.print(" [");
      pw.print(mpNodeAttrs);
      pw.print(']');

      pw.println("  // multiprc state");
    }
  }
  
  protected String getNativeExecCG (EXECUTENATIVE insn){
    MethodInfo mi = insn.getExecutedMethod();
    String s = mi.getName();

    if (s.equals("start")) {
      s = lastTi.getName() + ".start";
    } else if (s.equals("wait")) {
      s = lastTi.getName() + ".wait";
    }

    return s;
  }
  
  protected String getLastChoice() {
    ChoiceGenerator<?> cg = vm.getChoiceGenerator();
    Object choice = cg.getNextChoice();

    if (choice instanceof ThreadInfo){
       return ((ThreadInfo) choice).getName();
    } else {
      return choice.toString();
    }
  }
}
