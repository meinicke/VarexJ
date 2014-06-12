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
 * standard depth first model checking (but can be bounded by search depth
 * and/or explicit Verify.ignoreIf)
 */
public class DFSearch extends Search {

  public DFSearch (Config config, VM vm) {
  	super(config,vm);
  }

  public boolean requestBacktrack () {
    doBacktrack = true;

    return true;
  }

  /**
   * state model of the search
   *    next new  -> action
   *     T    T      forward
   *     T    F      backtrack, forward
   *     F    T      backtrack, forward
   *     F    F      backtrack, forward
   *
   * end condition
   *    backtrack failed (no saved states)
   *  | property violation (currently only checked in new states)
   *  | search constraint (depth or memory or time)
   *
   * <2do> we could split the properties into forward and backtrack properties,
   * the latter ones being usable for liveness properties that are basically
   * condition accumulators for sub-paths of the state space, to be checked when
   * we backtrack to the state where they were introduced.
   */
  public void search () {
    boolean depthLimitReached = false;

    depth = 0;

    notifySearchStarted();

    while (!done) {
      if (checkAndResetBacktrackRequest() || !isNewState() || isEndState() || isIgnoredState() || depthLimitReached ) {
        if (!backtrack()) { // backtrack not possible, done
          break;
        }

        depthLimitReached = false;
        depth--;
        notifyStateBacktracked();
      }

      if (forward()) {
        depth++;
        notifyStateAdvanced();

        if (currentError != null){
          notifyPropertyViolated();

          if (hasPropertyTermination()) {
            break;
          }
          // for search.multiple_errors we go on and treat this as a new state
          // but hasPropertyTermination() will issue a backtrack request
        }

        if (depth >= depthLimit) {
          depthLimitReached = true;
          notifySearchConstraintHit("depth limit reached: " + depthLimit);
          continue;
        }

        if (!checkStateSpaceLimit()) {
          notifySearchConstraintHit("memory limit reached: " + minFreeMemory);
          // can't go on, we exhausted our memory
          break;
        }

      } else { // forward did not execute any instructions
        notifyStateProcessed();
      }
    }

    notifySearchFinished();
  }


  public boolean supportsBacktrack () {
    return true;
  }
}
