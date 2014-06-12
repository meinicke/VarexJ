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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.Transition;


/**
 * a heuristic state prioritizer that favors certain threads (specified
 * by thread names during initialization)
 * 
 * <2do> for both efficiency and encapsulation reasons, this should be just
 * a Scheduler policy (so that we don't have to expand all children)
 */
public class PreferThreads extends SimplePriorityHeuristic {
  String[] preferredThreads;

  public PreferThreads (Config config, VM vm) {
    super(config,vm);
    
    preferredThreads = config.getStringArray("search.heuristic.preferredThreads");
  }

  protected int computeHeuristicValue () {
    Transition t = vm.getLastTransition();

    if (t == null) {
      return 1;
    }

    String tn = vm.getThreadName();

    for (int i = 0; i < preferredThreads.length; i++) {
      if (tn.equals(preferredThreads[i])) {
        return 0;
      }
    }

    return 1;
  }
}
