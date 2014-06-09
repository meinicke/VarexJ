//
// Copyright (C) 2009 United States Government as represented by the
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
 * <p>
 * SchedulerFactory that limits the search by imposing a maximum number of
 * thread preemptions (i.e., preempting context switches) that can occur per execution
 * path. This factory internally creates
 * <code>ContextBoundingThreadChoiceFromSet</code> choice generators.
 * </p>
 * <p>
 * Configuration parameters:<br>
 * <p>
 * <code>vm.scheduler_factory.class=gov.nasa.jpf.vm.ContextBoundingSchedulerFactory</code>
 * <br>
 * setting scheduler factory class to this class
 * </p>
 * <p>
 * <code>cg.max_number_of_preemptions=N</code><br>
 * where <code>N</code> is the number of allowed preemptions per execution path
 * </p>
 * 
 * <p>
 * The idea of context bounding is based on the PLDI 2007 paper<br>
 * <i>
 * "Iterative Context Bounding for Systematic Testing of Multithreaded Programs"
 * </i><br>
 * by Madanlal Musuvathi and Shaz Qadeer<br>
 * 
 * This factory does not implement the paper's <i>iterative</i> context-bounding
 * algorithm, i.e., the specific order of states that get explored. (For that,
 * one needs to use a search strategy.) This factory simply provides a limit on
 * the number of preemptions that are allowed and can be used with various
 * search strategies, including DFS, BFS, heuristics, etc.
 * 
 * @author Igor Andjelkovic (igor.andjelkovic@gmail.com)
 * @author Mirko Stojmenovic (mirko.stojmenovic@gmail.com)
 * @author Steven Lauterburg (slauter2@cs.uiuc.edu)
 */

public class ContextBoundingSchedulerFactory extends DefaultSchedulerFactory {

  private boolean isPossibleToPreempt;

  private int numOfPreemptions;

  private int maxNumOfPreemptions;

  public ContextBoundingSchedulerFactory(Config config, VM vm, SystemState ss) {
    super(config, vm, ss);
    if (config.containsKey("cg.max_number_of_preemptions"))
      maxNumOfPreemptions = config.getInt("cg.max_number_of_preemptions");
    else
      maxNumOfPreemptions = -1;
  }

  protected ThreadInfo[] filter(ThreadInfo[] list) {
    if (maxNumOfPreemptions == -1)
      return list;

    SystemState ss = VM.getVM().getSystemState();
    ContextBoundingThreadChoiceFromSet previousCG = (ContextBoundingThreadChoiceFromSet) 
        ss.getLastChoiceGeneratorOfType(ContextBoundingThreadChoiceFromSet.class);
    if (previousCG != null) {
      numOfPreemptions = previousCG.getNumOfPreemptions();
      if (previousCG.hasPreemptionOccured())
        numOfPreemptions++;
    } else {
      numOfPreemptions = 0;
    }
    ThreadInfo currentThread = ThreadInfo.getCurrentThread();
    isPossibleToPreempt = false;
    for (ThreadInfo ti : list) {
      if (ti.equals(currentThread)) {
        isPossibleToPreempt = true;
        break;
      }
    }
    return (isPossibleToPreempt && numOfPreemptions >= maxNumOfPreemptions) ? new ThreadInfo[] { currentThread } : list;
  }

  protected ChoiceGenerator<ThreadInfo> getRunnableCG(String id, ThreadInfo ti) {
    ThreadInfo[] choices = getRunnablesIfChoices(ti);
    if (choices != null) {
      return createContextBoundingThreadChoiceFromSet(id, choices, true);
    } else {
      return null;
    }
  }

  public ChoiceGenerator<ThreadInfo> createMonitorEnterCG(ElementInfo ei,
      ThreadInfo ti) {
    if (ti.isBlocked()) { // we have to return something
      if (ss.isAtomic()) {
        ss.setBlockedInAtomicSection();
      }

      return createContextBoundingThreadChoiceFromSet("monitorEnter", getRunnables(ti), true);

    } else {
      if (ss.isAtomic()) {
        return null;
      }

      return getSyncCG("monitorEnter", ei, ti);
    }
  }

  public ChoiceGenerator<ThreadInfo> createWaitCG(ElementInfo ei,
      ThreadInfo ti, long timeOut) {
    if (ss.isAtomic()) {
      ss.setBlockedInAtomicSection();
    }

    return createContextBoundingThreadChoiceFromSet("wait",getRunnables(ti), true);
  }

  public ChoiceGenerator<ThreadInfo> createNotifyCG(ElementInfo ei,
      ThreadInfo ti) {
    if (ss.isAtomic()) {
      return null;
    }

    ThreadInfo[] waiters = ei.getWaitingThreads();
    if (waiters.length < 2) {
      // if there are less than 2 threads waiting, there is no nondeterminism
      return null;
    } else {
      return createContextBoundingThreadChoiceFromSet("notify",waiters, false);
    }
  }

  public ChoiceGenerator<ThreadInfo> createThreadTerminateCG(
      ThreadInfo terminateThread) {
    // terminateThread is already TERMINATED at this point
    ThreadList tl = vm.getThreadList();
    if (tl.getMatchingCount(vm.getTimedoutRunnablePredicate()) > 0) {
      return createContextBoundingThreadChoiceFromSet( "terminate", getRunnablesWithout(terminateThread), true);
    } else {
      return null;
    }
  }

  private ContextBoundingThreadChoiceFromSet createContextBoundingThreadChoiceFromSet(String id, ThreadInfo[] ti, boolean isSchedulingPoint) {
    ContextBoundingThreadChoiceFromSet tcg = new ContextBoundingThreadChoiceFromSet( id, ti, isSchedulingPoint);
    tcg.setPossibleToPreempt(isPossibleToPreempt);
    tcg.setNumOfPreemptions(numOfPreemptions);
    return tcg;
  }

  static class ContextBoundingThreadChoiceFromSet extends ThreadChoiceFromSet {

    private ThreadInfo currentThread;

    private boolean isPossibleToPreempt;

    private int numOfPreemptions;

    private boolean hasPreemptionOccured;

    public ContextBoundingThreadChoiceFromSet( String id, ThreadInfo[] set, boolean isSchedulingPoint) {
      super(id, set, isSchedulingPoint);
      this.currentThread = ThreadInfo.getCurrentThread();
    }

    public boolean isPossibleToPreempt() {
      return isPossibleToPreempt;
    }

    public void setPossibleToPreempt(boolean isPossibleToPreempt) {
      this.isPossibleToPreempt = isPossibleToPreempt;
    }

    public boolean hasPreemptionOccured() {
      return hasPreemptionOccured;
    }

    public void setPreemptionOccured(boolean hasPreemptionOccured) {
      this.hasPreemptionOccured = hasPreemptionOccured;
    }

    public int getNumOfPreemptions() {
      return numOfPreemptions;
    }

    public void setNumOfPreemptions(int numOfPreemptions) {
      this.numOfPreemptions = numOfPreemptions;
    }

    public ThreadInfo getNextChoice() {
      if ((count >= 0) && (count < values.length)) {
        hasPreemptionOccured = isPossibleToPreempt
            && !currentThread.equals(values[count]);
        return values[count];
      } else {
        // we don't raise an exception here because this might be (mis)used
        // from a listener, which shouldn't produce JPFExceptions
        return null;
      }
    }
  }

}
