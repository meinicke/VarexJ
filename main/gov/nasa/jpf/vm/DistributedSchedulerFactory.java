//
// Copyright (C) 2013 United States Government as represented by the
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
import gov.nasa.jpf.util.Predicate;
import gov.nasa.jpf.vm.choice.MultiProcessThreadChoice;
import gov.nasa.jpf.vm.choice.ThreadChoiceFromSet;


/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * This scheduler factory is used for distributed application
 */
public class DistributedSchedulerFactory extends DefaultSchedulerFactory {

  public DistributedSchedulerFactory (Config config, VM vm, SystemState ss) {
    super(config, vm, ss);
  }

  Predicate<ThreadInfo> getRunnableAppPredicate (final ThreadInfo ti){
    return new Predicate<ThreadInfo>(){
      public boolean isTrue (ThreadInfo t){
        return (t.appCtx == ti.appCtx && t.isTimeoutRunnable());
      }
    };
  }
  
  Predicate<ThreadInfo> getLiveUserAppThreads (final ThreadInfo ti){
    return new Predicate<ThreadInfo>(){
      public boolean isTrue (ThreadInfo t){
        return (t.appCtx == ti.appCtx && t.isAlive() && !t.isSystemThread());
      }
    }; 
  }
  
  Predicate<ThreadInfo> getRunnableSystemAppThreads (final ThreadInfo ti){
    return new Predicate<ThreadInfo>(){
      public boolean isTrue (ThreadInfo t){
        return (t.appCtx == ti.appCtx && t.isSystemThread() && t.isTimeoutRunnable());
      }
    }; 
  }
  
  /**************************************** our choice acquisition methods ***/

  /**
   * get list of all runnable threads in the same process as ti
   */
  protected ThreadInfo[] getRunnables(ThreadInfo ti) {
    return filter(vm.getThreadList().getAllMatching(getRunnableAppPredicate(ti)));
  }

  /**
   * return a list of runnable choices, or null if there is only one, 
   *  in the same process as ti
   */
  protected ThreadInfo[] getRunnablesIfChoices(ThreadInfo ti) {
    ThreadInfo[] choices = vm.getThreadList().getAllMatching(getRunnableAppPredicate(ti));
    int n = choices.length;

    if ((n > 1) || (n == 1 && breakSingleChoice)){
      return filter(choices);
    } else {
      return null;
    }
  }

  protected ThreadInfo[] getRunnablesWith (ThreadInfo ti) {
    return filter(vm.getThreadList().getAllMatchingWith(ti, getRunnableAppPredicate(ti)));
  }

  protected ThreadInfo[] getRunnablesWithout (ThreadInfo ti) {
    return filter(vm.getThreadList().getAllMatchingWithout(ti, getRunnableAppPredicate(ti)));
  }

  /************************************ the public interface towards the insns ***/

  @Override
  public ChoiceGenerator<ThreadInfo> createThreadTerminateCG (ThreadInfo terminateThread) {
    // terminateThread is already TERMINATED at this point
    ThreadList tl = vm.getThreadList();
    
    if (tl.hasAnyMatching(vm.getAlivePredicate())) {
      int liveUserCount = tl.getMatchingCount(getLiveUserAppThreads(terminateThread));
      int runnableSystemCount = tl.getMatchingCount(getRunnableSystemAppThreads(terminateThread));
      
      if(liveUserCount==0 && runnableSystemCount==0) {
        return new MultiProcessThreadChoice( THREAD_TERMINATE, super.getRunnablesWithout(terminateThread), true);
      } else {
        return new ThreadChoiceFromSet( THREAD_TERMINATE, getRunnablesWithout(terminateThread), true);
      }
    } else {
      return null;
    }
  }
  
  /**
   * after the FinalizerThread processes the finalizeQueue, a global scheduling point is created
   */
  @Override
  public ChoiceGenerator<ThreadInfo> createPostFinalizeCG (ThreadInfo finalizerThread) {
    return new MultiProcessThreadChoice( POST_FINALIZE, super.getRunnables(finalizerThread), true);
  }
}
