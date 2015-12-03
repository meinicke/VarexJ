//
// Copyright (C) 2011 United transitions Government as represented by the
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
package gov.nasa.jpf.util.automaton;

import java.io.PrintStream;

/**
 *
 */
public class State {
  
  static final int TRANSITION_INC = 4;
  
  protected int id;
  protected String label;
  
  protected int nTransitions;
  protected Transition[] transitions;
  
  public State (String label, int numberOfTransitions){
    this.label = label;
    transitions = new Transition[numberOfTransitions];
  }
  
  public State (String label){
    this( label, TRANSITION_INC);
  }

  public State (){
    this( null, TRANSITION_INC);
  }
  
  // to be set by Automaton.addState()
  protected void setId(int id){
    this.id = id;
    if (label == null){
      label = Integer.toString(id);
    }
  }
  
  public int getId(){
    return id;
  }
  
  public String getLabel(){
    return label;
  }
  
  public int getNumberOfTransitions(){
    return nTransitions;
  }
  
  public Transition getTransition (int idx){
    return transitions[idx];
  }
  
  public void addTransition(Transition newTransition){
    if (nTransitions == transitions.length){
      Transition[] a = new Transition[nTransitions + TRANSITION_INC];
      System.arraycopy(transitions, 0, a, 0, nTransitions);
      transitions = a;
    }
    
    transitions[nTransitions] = newTransition;
    newTransition.setId(nTransitions);
    nTransitions++;
  }
  
  public void addTransitions(Transition ... newTransitions){
    int n = nTransitions + newTransitions.length;
    if (n >= transitions.length){
      Transition[] a = new Transition[n];
      System.arraycopy(transitions, 0, a, 0, nTransitions);
      transitions = a;      
    }
    
    for (int i=0; i<newTransitions.length; i++){
      transitions[nTransitions] = newTransitions[i];
      nTransitions++;
    }
  }
  
  public void enter(){
    // just here to be overridden, for Moore machines
  }
  
  public void exit(){
    // just here to be overridden, for Moore machines
  }
  
  public void printOn (PrintStream ps){
    ps.printf("\t[%d] State '%s'\n", id, label);
    for (int i=0; i<nTransitions; i++){
      transitions[i].printOn( ps);
    }
  }
}
