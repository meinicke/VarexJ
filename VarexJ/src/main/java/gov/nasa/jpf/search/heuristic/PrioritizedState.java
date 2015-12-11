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

import gov.nasa.jpf.vm.VM;

/**
 * HeuristicState with a scalar, static priority.
 * Due to legacy reasons, lower values represent higher priorities
 */
public class PrioritizedState extends HeuristicState implements Comparable<PrioritizedState>{

  int heuristicValue; // watch out, this is inverted: 0 is max priority

  public PrioritizedState(VM vm, int heuristicValue) {
    super(vm);
    
    this.heuristicValue = heuristicValue;
  }

  public int getPriority () {
    return heuristicValue;
  }

  /*
   * NOTE - since we can't use the Java 1.6 pollFirst()/pollLast() yet,
   * we have to use remove(o), which in turn requires "compareTo(a) == 0" to
   * be identical to "equals(o) == true", so we should implement both
   */
  public int compareTo (PrioritizedState o) {
     int diff = heuristicValue - o.heuristicValue;
     if (diff == 0) {
       return (stateId - o.stateId);
     } else {
       return diff;
     }
  }
  public boolean equals (Object o) {
    if (o instanceof PrioritizedState) {
      PrioritizedState other = (PrioritizedState) o;
      return ((stateId == other.stateId) && (heuristicValue == other.heuristicValue));
    } else {
      return false;
    }
  }
  
  public String toString() {
    return "{"+stateId+','+heuristicValue+'}';
  }
}
