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
package gov.nasa.jpf.vm.choice;

import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.vm.ChoiceGeneratorBase;
import gov.nasa.jpf.vm.ThreadChoiceGenerator;
import gov.nasa.jpf.vm.ThreadInfo;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class ThreadChoiceFromSet extends ChoiceGeneratorBase<ThreadInfo> implements ThreadChoiceGenerator {

  protected boolean isSchedulingPoint;
  protected ThreadInfo[] values;
  protected int count;
    
  protected ThreadChoiceFromSet (String id){
    super(id);
    
    // all other fields have to be computed by subclass ctor
    count = -1;
  }
  
  public ThreadChoiceFromSet (String id, ThreadInfo[] set, boolean isSchedulingPoint) {
    super(id);
        
    values = set;
    count = -1;

    this.isSchedulingPoint = isSchedulingPoint;

    /**
    if (isSchedulingPoint){
      // do a sanity check to see if the candidates are acutally runnable
      for (int i = 0; i < set.length; i++) {
        if (!set[i].isTimeoutRunnable()) {
          throw new JPFException("trying to schedule non-runnable: " + set[i]);
        }
      }
    }
    **/
  }
  
  public void reset () {
    count = -1;

    isDone = false;
  }
  
  public ThreadInfo getNextChoice () {
    if ((count >= 0) && (count < values.length)) {
      return values[count];
    } else {
      // we don't raise an exception here because this might be (mis)used
      // from a listener, which shouldn't produce JPFExceptions
      return null;
    }
  }

  public boolean hasMoreChoices () {
    return (!isDone && (count < values.length-1));
  }


  /**
   * this has to handle timeouts, which we do with temporary thread status
   * changes (i.e. the TIMEOUT_WAITING threads are in our list of choices, but
   * only change their status to TIMEDOUT when they are picked as the next choice)
   *
   * <2do> this should be in SystemState.nextSuccessor - there might be
   * other ThreadChoiceGenerators, and we should handle this consistently
   */
  public void advance () {    
    if (count < values.length-1) { // at least one choice left
      count++;
    }
  }

  public int getTotalNumberOfChoices () {
    return values.length;
  }

  public int getProcessedNumberOfChoices () {
    return count+1;
  }

  public Object getNextChoiceObject () {
    return getNextChoice();
  }
  
  public ThreadInfo[] getChoices(){
    return values;
  }
  
  public boolean supportsReordering(){
    return true;
  }
  
  public ThreadChoiceGenerator reorder (Comparator<ThreadInfo> comparator){
    ThreadInfo[] newValues = values.clone();
    Arrays.sort(newValues, comparator);
    
    return new ThreadChoiceFromSet( id, newValues, isSchedulingPoint);
  }
  
  public void printOn (PrintWriter pw) {
    pw.print(getClass().getName());
    pw.append("[id=\"");
    pw.append(id);
    pw.append('"');

    pw.append(",isCascaded:");
    pw.append(Boolean.toString(isCascaded));

    pw.print(",{");
    for (int i=0; i<values.length; i++) {
      if (i > 0) pw.print(',');
      if (i == count) {
        pw.print(MARKER);
      }
      pw.print(values[i].getName());
    }
    pw.print("}]");
  }
  
  public ThreadChoiceFromSet randomize () {
    for (int i = values.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1);
      ThreadInfo tmp = values[i];
      values[i] = values[j];
      values[j] = tmp;
    }
    return this;
  }
  
  public ThreadInfo[] getAllThreadChoices() {
	  return values; 
  }
  
  @Override
  public boolean contains (ThreadInfo ti){
    for (int i=0; i<values.length; i++){
      if (values[i] == ti){
        return true;
      }
    }
    return false;
  }

  @Override
  public Class<ThreadInfo> getChoiceType() {
    return ThreadInfo.class;
  }
  
  @Override
  public boolean isSchedulingPoint() {
    return isSchedulingPoint;
  }
}
