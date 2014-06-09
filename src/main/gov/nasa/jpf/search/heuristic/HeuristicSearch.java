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
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.VM;

import java.util.ArrayList;
import java.util.List;


/**
 * a search strategy class that computes all immediate successors of a given
 * state, puts them into a priority queue (the priority is provided by a
 * Heuristic strategy object), and processes states in the sequence of
 * highest priorities. Note that the queue can be search-global, i.e. we might hop
 * between search levels.
 */
public abstract class HeuristicSearch extends Search {
  
  static final String DEFAULT_HEURISTIC_PACKAGE = "gov.nasa.jpf.search.heuristic.";
  
  protected HeuristicState parentState;
  protected List<HeuristicState> childStates;
  
  protected boolean isPathSensitive = false;  
  
  /*
   * do we use A* adaptation of state priorities, i.e. have a
   * distance + cost heuristic (in this context, we just use the
   * path length as the "distance")
   */
  protected boolean useAstar;
  
  /*
   * a beam search is a HeuristicSearch with a state queue that is reset at each
   * search level (i.e. it doesn't hop between search levels when fetching the
   * next state from the queue)
   */
  protected boolean isBeamSearch;

  
  public HeuristicSearch (Config config, VM vm) {
    super(config, vm);
    
    useAstar = config.getBoolean("search.heuristic.astar");
    isBeamSearch = config.getBoolean("search.heuristic.beam_search");
  }

  
  // add the current state to the queue
  protected abstract HeuristicState queueCurrentState ();
  
  // return the next queued state, which becomes the new parentState
  // implementors can also reset or modify the queue
  protected abstract HeuristicState getNextQueuedState ();

  public abstract int getQueueSize();
  public abstract boolean isQueueLimitReached();
  
  public HeuristicState getParentState() {
    return parentState;
  }
  
  public List<HeuristicState> getChildStates() {
    return childStates;
  }
  
  public void setPathSensitive (boolean isPathSensitive) {
    this.isPathSensitive = isPathSensitive;
  }  
  
  void backtrackToParent () {
    backtrack();

    depth--;
    notifyStateBacktracked();    
  }
  
  /*
   * generate the set of all child states for the current parent state
   * 
   * overriding methods can use the return value to determine if they
   * have to process the childStates, e.g. to compute priorities
   * that require the whole set
   * 
   * @returns false if this is cut short by a property termination or
   * explicit termination request
   */
  protected boolean generateChildren () {

    childStates = new ArrayList<HeuristicState>();
    
    while (!done) {
      
      if (!forward()) {
        notifyStateProcessed();
        return true;
      }

      depth++;
      notifyStateAdvanced();

      if (currentError != null){
        notifyPropertyViolated();
        if (hasPropertyTermination()) {
          return false;
        }
        
        // note that we don't store the error state anymore, which means we
        // might encounter it along different paths. However, this is probably
        // what we want for search.multiple_errors.
        
      } else {
      
        if (!isEndState() && !isIgnoredState()) {
          boolean isNewState = isNewState();

          if (isNewState && depth >= depthLimit) {
            // we can't do this before we actually generated the VM child state
            // since we don't want to report DEPTH_CONSTRAINTs for parents
            // that have only visited or end state children
            notifySearchConstraintHit("depth limit reached: " + depthLimit);

          } else if (isNewState || isPathSensitive) {

            if (isQueueLimitReached()) {
              notifySearchConstraintHit("queue limit reached: " + getQueueSize());
            }
          
            HeuristicState newHState = queueCurrentState();            
            if (newHState != null) { 
              childStates.add(newHState);
              notifyStateStored();
            }
          }
        
        } else {
          // end state or ignored transition
        }
      }
      
      backtrackToParent();
    }
    
    return false;
  }

  
  private void restoreState (HeuristicState hState) {    
    vm.restoreState(hState.getVMState());

    // note we have to query the depth from the VM because the state is taken from the queue
    // and we have no idea when it was entered there
    depth = vm.getPathLength();
    notifyStateRestored();
  }
   
  public void search () {
        
    queueCurrentState();
    notifyStateStored();
    
    // kind of stupid, but we need to get it out of the queue, and we
    // don't have to restore it since it's the first one
    parentState = getNextQueuedState();
    
    done = false;
    notifySearchStarted();
    
    if (!hasPropertyTermination()) {
      generateChildren();

      while (!done && (parentState = getNextQueuedState()) != null) {
        restoreState(parentState);
        
        generateChildren();
      }
    }
    
    notifySearchFinished();
  }

  public boolean supportsBacktrack () {
    // we don't do multi-level backtracks, but automatically do backtrackToParent()
    // after each child state generation
    return false;
  }
}


