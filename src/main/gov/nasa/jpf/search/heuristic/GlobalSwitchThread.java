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


/**
 * heuristic state prioritizer that tries to minimize re-scheduling
 */
public class GlobalSwitchThread extends SimplePriorityHeuristic {
  private int[] threads;

  public GlobalSwitchThread (Config config, VM vm) {
    super(config, vm);
    
    int threadHistorySize = config.getInt("search.heuristic.thread_history_size", 10);
    
    threads = new int[threadHistorySize];

    for (int i = 0; i < threads.length; i++) {
      threads[i] = -1;
    }
  }

  protected int computeHeuristicValue () {
    int aliveThreads = vm.getThreadList().getMatchingCount(aliveThread);

    int lastRun = vm.getLastTransition().getThreadIndex();
    int h_value = 0;

    if (aliveThreads > 1) {
      for (int i = 0; i < threads.length; i++) {
        if (lastRun == threads[i]) {
          h_value += ((threads.length - i) * aliveThreads);
        }
      }
    }

    int temp0 = threads[0];
    int temp1;
    threads[0] = lastRun;

    for (int i = 1; i < threads.length; i++) {
      temp1 = threads[i];
      threads[i] = temp0;
      temp0 = temp1;
    }

    return h_value;
  }
}
