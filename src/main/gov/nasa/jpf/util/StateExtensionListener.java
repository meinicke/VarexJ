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
package gov.nasa.jpf.util;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.SystemState;

/**
 * generic listener that keeps track of state extensions, using
 * state ids as index values into a dynamic array of T objects
 * 
 * the purpose of this utility class is to make state extensions
 * backtrackable, so that clients don't have to care about this
 */
public class StateExtensionListener <T> extends ListenerAdapter {
  StateExtensionClient<T> client;
  DynamicObjectArray<T> states;

  public StateExtensionListener (StateExtensionClient<T> cli) {
    client = cli;
    states = new DynamicObjectArray<T>();

    // set initial state
    T se = client.getStateExtension();
    states.set(0, se);
  }

  @Override
  public void stateAdvanced (Search search) {
    int idx = search.getStateId()+1;
 
    T se = client.getStateExtension();
    states.set(idx, se);
  }

  @Override
  public void stateBacktracked (Search search) {
    int idx = search.getStateId()+1;

    T se = states.get(idx);
    client.restore(se);
  }

  @Override
  public void stateRestored (Search search) {
    int idx = search.getStateId()+1;
 
    T se = states.get(idx);
    client.restore(se);

    SystemState ss = search.getVM().getSystemState();
    ChoiceGenerator<?> cgNext = ss.getNextChoiceGenerator();
    cgNext.reset();
  }
}
