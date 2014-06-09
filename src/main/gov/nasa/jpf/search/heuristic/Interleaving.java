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
import gov.nasa.jpf.vm.Path;


/**
 * Heuristic to maximize thread interleavings. It is particularly good at
 * flushing out concurrency errors, since it schedules different threads 
 * as much as possible.
 * 
 */
public class Interleaving extends SimplePriorityHeuristic {
    
  int historyLimit;

  public Interleaving (Config config, VM vm) {
    super(config,vm);
    
    historyLimit = config.getInt("search.heuristic.thread_history_limit", -1);
  }

  /*
   * heuristic based on how often, how long ago, and within how many
   * live threads a certain thread did run
   */
  protected int computeHeuristicValue () {
    int aliveThreads = vm.getThreadList().getMatchingCount(aliveThread);

    Path path = vm.getPath();
    int  pathSize = path.size();
    
    int tid = vm.getCurrentThread().getId();
    int h_value = 0;

    if (aliveThreads > 1) { // otherwise there's nothing to interleave
      
      for (int i= Math.max(0, pathSize - historyLimit); i<pathSize; i++) {
        if (path.get(i).getThreadIndex() == tid) {
          h_value += (pathSize - i) * aliveThreads;
        }
      }
    }

    return h_value;
  }
}
