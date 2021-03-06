//
//Copyright (C) 2008 United States Government as represented by the
//Administrator of the National Aeronautics and Space Administration
//(NASA).  All Rights Reserved.
//
//This software is distributed under the NASA Open Source Agreement
//(NOSA), version 1.3.  The NOSA has been approved by the Open Source
//Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
//directory tree for the complete NOSA document.
//
//THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
//KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
//LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
//SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
//A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
//THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
//DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.search.heuristic;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.util.Predicate;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

/**
 * a heuristic that is based on static priorities that are determined
 * at state storage time
 */
public abstract class SimplePriorityHeuristic extends HeuristicSearch {

  StaticPriorityQueue queue;
  
  protected Predicate<ThreadInfo> aliveThread;
  
  public SimplePriorityHeuristic (Config config, VM vm) {
    super(config,vm);

    queue = new StaticPriorityQueue(config);
    
    aliveThread = new Predicate<ThreadInfo>() {
      public boolean isTrue (ThreadInfo ti) {
        return (ti.isAlive());
      }
    };
    
  }

  protected abstract int computeHeuristicValue ();

  protected int computeAstarPathCost (VM vm) {
    return vm.getPathLength();
  }
  
  protected HeuristicState queueCurrentState () {
    int heuristicValue;
    
    if (vm.isInterestingState()) {
      heuristicValue = 0;
    } else if (vm.isBoringState()) {
      heuristicValue = Integer.MAX_VALUE;
      
    } else {
      heuristicValue = computeHeuristicValue();
      
      if (useAstar) {
        // <2do> we probably don't want this for isInteresting/isBoring?
        heuristicValue += computeAstarPathCost(vm);
      }
    }
    
    PrioritizedState hState = new PrioritizedState(vm,heuristicValue);
    
    queue.add(hState);
    
    return hState;
  }
  
  protected HeuristicState getNextQueuedState () {
    
    //HeuristicState hState = queue.pollFirst();  // only Java 1.6
    //if (isBeanSearch) { queue.clear(); }
    //return hState;

    if (queue.size() == 0) {                      // the dreaded Java 1.5 version
      return null;
    }
    HeuristicState hState = queue.first();
    
    if (isBeamSearch) {
      queue.clear();
    } else {
      queue.remove(hState);      
    }
    
    return hState;
  }

  public int getQueueSize() {
    return queue.size();
  }
  
  public boolean isQueueLimitReached() {
    return queue.isQueueLimitReached();
  }
}
