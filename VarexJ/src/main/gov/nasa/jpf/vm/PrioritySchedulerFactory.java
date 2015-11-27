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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.vm.choice.ThreadChoiceFromSet;

/**
 * a scheduler policy which always runs one of the threads that
 * have equal top priority
 */
public class PrioritySchedulerFactory extends DefaultSchedulerFactory {

  public PrioritySchedulerFactory (Config config, VM vm, SystemState ss) {
    super(config, vm, ss);
  }
  
  /**
   * the private filter method to get the topmost prio threads out of the
   * provided list. Not very effective, but it will do for now
   */
  protected ThreadInfo[] filter (ThreadInfo[] list) {
    int top = Thread.MIN_PRIORITY;
    int i, nTop = 0;
    
    if ((list == null) || (list.length <= 1)){ // nothing to filter
      return list;
    }
    
    for (i=0; i<list.length; i++) { // what is the top prio, and how many threads
      int prio = list[i].getPriority();
      if (prio > top) {
        top = prio;
        nTop = 1;
      } else if (prio == top) {
        nTop++;
      }
    }
    
    if (nTop == list.length) { // all have the same prio
      return list;
    } else { // Ok, shrink it
      ThreadInfo[] topList = new ThreadInfo[nTop];
      int j;
      for (i=0, j=0; (i<list.length) && (j<nTop); i++) {
        if (list[i].getPriority() == top) {
          topList[j++] = list[i];
        }
      }
      return topList;
    }
  }
  

  /**************** as soon as a higher prio thread becomes runnable, we have to switch **/
  public ChoiceGenerator<ThreadInfo> createThreadStartCG (ThreadInfo newThread) {
    if (ss.isAtomic()) {
      return null;
    }
    
    return new ThreadChoiceFromSet("start",getRunnables(newThread), true);
  }
  
  public ChoiceGenerator<ThreadInfo> createMonitorExitCG (ElementInfo ei, ThreadInfo ti) {
    if (ss.isAtomic()) {
      return null;
    }
    
    return new ThreadChoiceFromSet("monitorExit",getRunnables(ti), true);
  }

}
