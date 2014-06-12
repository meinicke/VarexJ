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


/**
 * NOTE - making VMStates fully restorable is currently very
 * expensive and should only be done on a selective basis
 */
public class RestorableVMState {
  
  /** the set of last executed insns */
  Transition lastTransition;
  
  /* these are the icky parts - the history is kept as stacks inside the
   * VM (for restoration reasons), hence we have to copy it if we want
   * to restore a state. Since this is really expensive, it has to be done
   * on demand, with varying degrees of information
   */
  Path path;
  
  Backtracker.RestorableState bkstate;
  
  VM vm;
  
  RestorableVMState (VM vm) {
    this.vm = vm;

    path = vm.getClonedPath();
    bkstate = vm.getBacktracker().getRestorableState();
    lastTransition = vm.lastTrailInfo;
  }
  
  public Backtracker.RestorableState getBkState() {
    return bkstate;
  }
  
  public Transition getLastTransition () {
    return lastTransition;
  }
  
  public Path getPath () {
    return path;
  }
  
  public int getThread () {
    return lastTransition.getThreadIndex();
  }

}
