//
// Copyright (C) 2011 United States Government as represented by the
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
import gov.nasa.jpf.vm.ThreadChoiceGenerator;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * a simple heuristic that tries to minimize preemptive scheduling, i.e.
 * switching from a thread that is not blocked.
 * 
 * This is supposed to be a less expensive and more robust version of the old
 * IterativContextBounding search
 */
public class MinimizePreemption extends SimplePriorityHeuristic {
  
  // an optional threshold value of preemptions that cause states to be
  // added at the end of the queue (or discarded if queue is full)
  int threshold;
  
  public MinimizePreemption (Config config, VM vm) {
    super(config,vm);
    
    threshold = config.getInt("search.mp.threshold", Integer.MAX_VALUE);
  }
  
  protected int computeHeuristicValue () {
    int preemptions = 0;

    // this is redundant, but since it is easy enough to compute we don't store it
    // <2do> this relies on that there are no cascaded SchedulingPoints (which would not work anyways)
    for (ThreadChoiceGenerator tcg = vm.getLastChoiceGeneratorOfType(ThreadChoiceGenerator.class); tcg != null;){
      ThreadInfo ti= tcg.getNextChoice();
      ThreadChoiceGenerator tcgPrev = tcg.getPreviousChoiceGeneratorOfType(ThreadChoiceGenerator.class);

      if (tcg.isSchedulingPoint()){
        if (tcgPrev != null){
          ThreadInfo tiPrev = tcgPrev.getNextChoice();
          if (ti != tiPrev){
            if (tcg.contains(tiPrev)){
              // the previous thread is still in the runnable list, so it can't be blocked or terminated
              preemptions++;
              
              if (preemptions >= threshold){
                // we don't care, it gets the lowest priority (highest heuristic value)
                return Integer.MAX_VALUE;
              }
            }            
          }
        }
      }
      
      tcg = tcgPrev;
    }
    
    return preemptions;
  }
}
