//
// Copyright (C) 2007 United States Government as represented by the
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
package gov.nasa.jpf.vm.choice;

import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ChoiceGeneratorBase;
import gov.nasa.jpf.vm.ThreadChoiceGenerator;
import gov.nasa.jpf.vm.ThreadInfo;

import java.io.PrintWriter;

/**
 * a pseudo CG that is used to break transitions. It can be used to break and
 * just reschedule the current thread, or to indicate an end state
 * (e.g. for System.exit())
 */
public class BreakGenerator extends ChoiceGeneratorBase<ThreadInfo> implements ThreadChoiceGenerator {

  protected ThreadInfo ti;
  protected int state = -1;
  protected boolean isTerminator;

  public BreakGenerator (String id, ThreadInfo ti, boolean isTerminator) {
    super(id);
    
    this.ti = ti;
    this.isTerminator = isTerminator;
  }
  
  public ThreadInfo getNextChoice () {
    assert !isTerminator : "illegal operation on terminal BreakGenerator";
    return (state == 0) ? ti : null;
  }

  public void printOn (PrintWriter pw) {
    pw.println("BreakGenerator {" + ti.getName() + "}");
  }

  public void advance () {
    assert !isTerminator : "illegal operation on terminal BreakGenerator";
    state++;
  }

  public int getProcessedNumberOfChoices () {
    return (state >= 0) ? 1 : 0;
  }

  public int getTotalNumberOfChoices () {
    return 1;
  }

  public boolean hasMoreChoices () {
    if (isTerminator){
      return false;
    }
    
    return (state < 0);
  }

  public void reset () {
    state = -1;
    isDone = false;
  }

  @Override
  public boolean contains (ThreadInfo ti){
    return this.ti == ti;
  }

  @Override
  public Class<ThreadInfo> getChoiceType() {
    return ThreadInfo.class;
  }

  @Override
  public ChoiceGenerator<ThreadInfo> randomize() {
    return this;
  }
  
  @Override
  public boolean isSchedulingPoint(){
    return true; // that's the whole point of having a BreakGenerator
  }

}
