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
package gov.nasa.jpf.vm;

import java.util.Iterator;

/**
 * concrete type to store execution paths. TrailInfo corresponds to Transition,
 * i.e. all instructions executed in the context of a vm.forward() leading
 * into a new state
 */
public class Transition implements Iterable<Step>, Cloneable {

  ChoiceGenerator<?> cg;
  ThreadInfo ti;

  private Step   first, last;
  int nSteps;

  private Object annotation;
  String         output;

  private int stateId = StateSet.UNKNOWN_ID;

  public Transition (ChoiceGenerator<?> cg, ThreadInfo ti) {
    this.cg = cg;
    this.ti = ti;
  }

  public Object clone() {
    try {
      Transition t = (Transition)super.clone();
      
      // the deep copy references
      t.cg = (ChoiceGenerator<?>)cg.clone();
      t.ti = (ThreadInfo)ti.clone();
      
      return t;
      
    } catch (CloneNotSupportedException cnsx){
      return null; // cannot happen
    } 
  }
  
  public String getLabel () {
    if (last != null) {
      return last.getLineString();
    } else {
      return "?";
    }
  }

  public int getStateId() {
    return(stateId);
  }

  public void setStateId(int id) {
    stateId = id;
  }

  public void setOutput (String s) {
    output = s;
  }

  public void setAnnotation (Object o) {
    annotation = o;
  }

  public Object getAnnotation () {
    return annotation;
  }

  public String getOutput () {
    return output;
  }

  // don't use this for step iteration - this is very inefficient
  public Step getStep (int index) {
    Step s = first;
    for (int i=0; s != null && i < index; i++) s = s.next;
    return s;
  }

  public Step getLastStep () {
    return last;
  }

  public int getStepCount () {
    return nSteps;
  }

  public ThreadInfo getThreadInfo() {
    return ti;
  }

  public int getThreadIndex () {
    return ti.getId();
  }

  public ChoiceGenerator<?> getChoiceGenerator() {
    return cg;
  }

  public ChoiceGenerator<?>[] getChoiceGeneratorCascade(){
    return cg.getCascade();
  }

  public void incStepCount() {
    nSteps++;
  }

  void addStep (Step step) {
    if (first == null) {
      first = step;
      last = step;
    } else {
      last.next = step;
      last = step;
    }
    nSteps++;
  }

  public class StepIterator implements Iterator<Step> {
    Step cur;

    public boolean hasNext () {
      return (cur != last);
    }

    public Step next () {
      if (cur == null) {
        cur = first;
      } else {
        if (cur != last) {
          cur = cur.next;
        } else {
          return null;
        }
      }
      return cur;
    }

    public void remove () {
      if (cur == null) {
        first = first.next;
      } else {
        Step s;
        for (s = first; s.next != cur; s = s.next);
        s.next = cur.next;
        cur = cur.next;
      }
    }
  }

  public Iterator<Step> iterator () {
    return new StepIterator();
  }
}
