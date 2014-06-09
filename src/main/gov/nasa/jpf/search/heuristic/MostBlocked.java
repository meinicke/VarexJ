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
 * Heuristic state prioriizer that maximizes number of blocked states. This
 * is a classic heuristic for finding deadlocks, since a deadlock requires 
 * all threads to be blocked.
 */
public class MostBlocked extends SimplePriorityHeuristic {

  public MostBlocked (Config config, VM vm) {
    super(config,vm);
  }

  protected int computeHeuristicValue () {
    int alive = vm.getThreadList().getMatchingCount(aliveThread);
    int runnable = vm.getThreadList().getMatchingCount(vm.getTimedoutRunnablePredicate());

    // pcm - the (iSystemState based) condition was "!runnable && alive"
    // the '10000' is just a potential max thread count
    int h_value = (10000 - (alive - runnable));

    return h_value;
  }
}
