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

import gov.nasa.jpf.util.ImmutableList;

public class DefaultBacktracker<KState> implements Backtracker {
  /** where we keep the saved KernelState head */ 
  protected ImmutableList<KState> kstack;
   
  /** and that adds the SystemState specifics */
  protected ImmutableList<Object> sstack;
  
  protected SystemState ss;
  protected StateRestorer<KState> restorer;
  
  public void attach(VM vm) {
    ss = vm.getSystemState();
    restorer = vm.getRestorer();
  }

  //--- the backtrack support (depth first only)
  
  protected void backtrackKernelState() {
    KState data = kstack.head;
    kstack = kstack.tail;
    
    restorer.restore(data);
  }

  protected void backtrackSystemState() {
    Object o = sstack.head;
    sstack = sstack.tail;
    ss.backtrackTo(o);
  }

  
  /**
   * Moves one step backward. This method and forward() are the main methods
   * used by the search object.
   * Note this is called with the state that caused the backtrack still being on
   * the stack, so we have to remove that one first (i.e. popping two states
   * and restoring the second one)
   */
  @Override
  public boolean backtrack () {
    if (sstack != null) {
  
      backtrackKernelState();
      backtrackSystemState();

      return true;
    } else {
      // we are back to the top of where we can backtrack to
      return false;
    }
  }
  
  /**
   * Saves the state of the system.
   */
  @Override
  public void pushKernelState () {
    kstack = new ImmutableList<KState>(restorer.getRestorableData(),kstack);
  }
  
  /**
   * Saves the backtracking information.
   */
  @Override
  public void pushSystemState () {
    sstack = new ImmutableList<Object>(ss.getBacktrackData(),sstack);
  }

  
  //--- the restore support
  
  // <2do> this saves both the backtrack and the restore data - too redundant
  class RestorableStateImpl implements RestorableState {
    final ImmutableList<KState> savedKstack;
    final ImmutableList<Object> savedSstack;
    
    final KState kcur;
    final Object scur;
    
    RestorableStateImpl() {
      savedKstack = kstack;
      savedSstack = sstack;
      kcur = restorer.getRestorableData();
      scur = ss.getRestoreData();
    }
    
    void restore() {
      kstack = savedKstack;
      sstack = savedSstack;
      restorer.restore(kcur);
      ss.restoreTo(scur);
    }
  }
  
  @Override
  public void restoreState (RestorableState state) {
    ((RestorableStateImpl) state).restore();
  }
  
  @Override
  public RestorableState getRestorableState() {
    return new RestorableStateImpl();
  }
}
