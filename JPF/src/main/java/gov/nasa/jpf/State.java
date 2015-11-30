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
package gov.nasa.jpf;

import gov.nasa.jpf.search.SearchState;
import gov.nasa.jpf.vm.RestorableVMState;

/**
 * abstraction of JPF execution state that can be queried and stored by
 * listeners 
 */
public class State {
  RestorableVMState     vmState;
  SearchState searchState;
  boolean     hasSuccessor; // <2do> pcm - do we really need this?
  boolean     isNew;

  public State (boolean isNew, boolean hasSuccessor, SearchState searchState, 
                RestorableVMState vmState) {
    this.isNew = isNew;
    this.hasSuccessor = hasSuccessor;
    this.searchState = searchState;
    this.vmState = vmState;
  }

  public boolean isNew () {
    return isNew;
  }

  public SearchState getSearchState () {
    return searchState;
  }

  public RestorableVMState getVMState () {
    return vmState;
  }

  public boolean hasSuccessor () {
    return hasSuccessor;
  }

  public void restore () {
  }
}
