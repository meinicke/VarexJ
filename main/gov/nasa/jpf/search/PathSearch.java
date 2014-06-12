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
package gov.nasa.jpf.search;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.VM;


/**
 * PathSearch is not really a Search object, just a simple 'forward'
 * driver for the VM that loops until there is no next instruction or
 * a property doesn't hold
 * 
 */
public class PathSearch extends Search {
	
  public PathSearch (Config config, VM vm) {
    super(config,vm);    
  }
  
  public boolean requestBacktrack () {
    doBacktrack = true;

    return true;
  }

  public void search () {
    depth++;

    if (hasPropertyTermination()) {
      return;
    }

    notifySearchStarted();

    while (true) {
      while (doBacktrack) { // might be set by StateListeners

        if (depth > 0) {
          vm.backtrack();
          depth--;

          notifyStateBacktracked();
        }

        doBacktrack = false;
      }

      forward();
      // isVisitedState is never true, because we don't really search, just replay
      notifyStateAdvanced();

      if (currentError != null){
        notifyPropertyViolated();

        if (hasPropertyTermination()) {
          break;
        }
      }

      if (isEndState()) {
        break;
      }

      depth++;
    }

    notifySearchFinished();
  }

  public boolean supportsBacktrack () {
    return true;
  }
}
