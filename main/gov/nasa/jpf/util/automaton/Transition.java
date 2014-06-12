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
package gov.nasa.jpf.util.automaton;

import java.io.PrintStream;

/**
 *
 */
public class Transition {
  
  protected int id;
  protected String label;
  
  protected State fromState;
  protected State toState;
  
  public Transition (String label, State toState){
    // the fromState is set when we add this transition to the state
    this.toState = toState;

    this.label = label;
    // id will be set when this transition is added to its fromState
  }
  
  protected void setFromState (State fromState){
    this.fromState = fromState;
  }
  
  protected void setId (int id){
    this.id = id;
  }
  
  public int getId(){
    return id;
  }
  
  public String getLabel(){
    return label;
  }
  
  public boolean checkGuard(){
    // override if you have guards
    return true;
  }
  
  public void fire (){
    // just here to be overridden, for Mealy machines
  }
  
  public void printOn (PrintStream ps){
    ps.printf("\t\t[%d] '%s' => state '%s'\n", id, label, toState.getLabel());
  }
}
