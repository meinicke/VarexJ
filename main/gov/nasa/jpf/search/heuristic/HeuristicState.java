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
package gov.nasa.jpf.search.heuristic;

import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.RestorableVMState;


/**
 * wrapper for states that are processed in an order that is
 * defined by a heuristic (i.e. not just depends on the shape
 * of the state graph)
 */
public abstract class HeuristicState {
  
  protected RestorableVMState vmState;
  protected int     stateId;
    
  public HeuristicState (VM vm) {
    stateId = vm.getStateId();
    vmState = vm.getRestorableState();
  }
  
  public RestorableVMState getVMState () {
    return vmState;
  }
  
  public int getStateId() {
    return stateId;
  }
}
