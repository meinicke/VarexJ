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

import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.JPFLogger;


/**
 * MJI NativePeer class for java.lang.Thread library abstraction
 * 
 * NOTE - this implementation depends on all live thread objects being
 * in ThreadList
 */
public class JPF_java_lang_Thread extends NativePeer {

  static JPFLogger log = JPF.getLogger("gov.nasa.jpf.vm.ThreadInfo");
  
  
  /**
   * This method is the common initializer for all Thread ctors, and the only
   * single location where we can init our ThreadInfo, but it is PRIVATE
   */
  @MJI
  public void init0__Ljava_lang_ThreadGroup_2Ljava_lang_Runnable_2Ljava_lang_String_2J__V (MJIEnv env,
                         int objRef, int groupRef, int runnableRef, int nameRef, long stackSize) {
    VM vm = env.getVM();
    
    // we only need to create the ThreadInfo - its initialization will take care
    // of proper linkage to the java.lang.Thread object (objRef)
    vm.createThreadInfo( objRef, groupRef, runnableRef, nameRef);
  }

  @MJI
  public boolean isAlive____Z (MJIEnv env, int objref) {
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);
    return ti.isAlive();      
  }

  @MJI
  public void setDaemon0__Z__V (MJIEnv env, int objref, boolean isDaemon) {
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);
    ti.setDaemon(isDaemon);
  }

  @MJI
  public void dumpStack____V (MJIEnv env, int clsObjRef){
    ThreadInfo ti = env.getThreadInfo();
    ti.printStackTrace(); // this is not correct, we should go through VM.print
  }

  @MJI
  public void setName0__Ljava_lang_String_2__V (MJIEnv env, int objref, int nameRef) {
    // it bails if you try to set a null name
    if (nameRef == MJIEnv.NULL) {
      env.throwException("java.lang.IllegalArgumentException");

      return;
    }

    // we have to intercept this to cache the name as a Java object
    // (to be stored in ThreadData)
    // luckily enough, it's copied into the java.lang.Thread object
    // as a char[], i.e. does not have to preserve identity
    // Note the nastiness in here - the java.lang.Thread object is only used
    // to get the initial values into ThreadData, and gets inconsistent
    // if this method is called (just works because the 'name' field is only
    // directly accessed from within the Thread ctors)
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);
    ti.setName(env.getStringObject(null, nameRef));
  }

  @MJI
  public void setPriority0__I__V (MJIEnv env, int objref, int prio) {
    // again, we have to cache this in ThreadData for performance reasons
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);
    ti.setPriority(prio);
  }

  @MJI
  public int countStackFrames____I (MJIEnv env, int objref) {
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);
    return ti.countStackFrames();
  }

  @MJI
  public int currentThread____Ljava_lang_Thread_2 (MJIEnv env, int clsObjRef) {
    ThreadInfo ti = env.getThreadInfo();
    return ti.getThreadObjectRef();
  }

  @MJI
  public boolean holdsLock__Ljava_lang_Object_2__Z (MJIEnv env, int clsObjRef, int objref) {
    ThreadInfo  ti = env.getThreadInfo();
    ElementInfo ei = env.getElementInfo(objref);

    return ei.isLockedBy(ti);
  }

  @MJI
  public void interrupt____V (MJIEnv env, int objref) {
    ThreadInfo ti = env.getThreadInfo();
    SystemState ss = env.getSystemState();

    ThreadInfo interruptedThread = env.getThreadInfoForObjRef(objref);

    if (!ti.isFirstStepInsn()) {
      interruptedThread.interrupt();
      
      // the interrupted thread can re-acquire the lock and therefore is runnable again
      // hence we should give it a chance to do so (Thread.interrupt() does not require
      // holding a lock)
      if (interruptedThread.isUnblocked()){
        ChoiceGenerator<?> cg = ss.getSchedulerFactory().createInterruptCG(interruptedThread);
        if (ss.setNextChoiceGenerator(cg)) {
          env.repeatInvocation();
        }        
      }

    }
  }

  // these could be in the model, but we keep it symmetric, which also saves
  // us the effort of avoiding unwanted shared object field access CGs
  @MJI
  public boolean isInterrupted____Z (MJIEnv env, int objref) {
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);
    return ti.isInterrupted(false);
  }

  @MJI
  public boolean interrupted____Z (MJIEnv env, int clsObjRef) {
    ThreadInfo ti = env.getThreadInfo();
    return ti.isInterrupted(true);
  }

  @MJI
  public void start____V (MJIEnv env, int objref) {
    ThreadInfo tiCurrent = env.getThreadInfo();
    SystemState ss = env.getSystemState();
    VM vm = tiCurrent.getVM();
    
    ThreadInfo tiStartee = env.getThreadInfoForObjRef(objref);

    if (!tiCurrent.isFirstStepInsn()) { // first time we see this (may be the only time)
      if (tiStartee.isStopped()) {
        // don't do anything but set it terminated - it hasn't acquired any resources yet.
        // note that apparently host VMs don't schedule this thread, so it never
        // gets a handler in its miRun() invoked
        tiStartee.setTerminated();
        return;
      }
      
      // check if this thread was already started. If it is still running, this
      // is a IllegalThreadStateException. If it already terminated, it just gets
      // silently ignored in Java 1.4, but the 1.5 spec explicitly marks this
      // as illegal, so we adopt this by throwing an IllegalThreadState, too
      if (! tiStartee.isNew()) {
        env.throwException("java.lang.IllegalThreadStateException");
        return;
      }

      int runnableRef = tiStartee.getRunnableRef();

      if (runnableRef == MJIEnv.NULL) {
        // note that we don't set the 'target' field, since java.lang.Thread doesn't
        runnableRef = objref;
      }
            

      //vm.registerThread(tiStartee);
      
      // we don't do this during thread creation because the thread isn't in
      // the GC root set before it actually starts to enter. Until then,
      // it's just an ordinary object

      vm.notifyThreadStarted(tiStartee);

      ElementInfo eiTarget = env.getElementInfo(runnableRef);
      ClassInfo   ci = eiTarget.getClassInfo();
      MethodInfo  miRun = ci.getMethod("run()V", true);

      // we do direct call run() invocation so that we have a well defined
      // exit point (DIRECTCALLRETURN) in case the thread is stopped or there is
      // a fail-safe UncaughtExceptionHandler set
      DirectCallStackFrame runFrame = miRun.createRunStartStackFrame(tiStartee);
      runFrame.setReferenceArgument(0, runnableRef, null);
            
      tiStartee.pushFrame(runFrame);
      tiStartee.setState(ThreadInfo.State.RUNNING);
      
      // now we have a new thread, create a CG for scheduling it
      ChoiceGenerator<?> cg = ss.getSchedulerFactory().createThreadStartCG(tiStartee);
      if (ss.setNextChoiceGenerator(cg)) {
        env.repeatInvocation();
      } else {
        Instruction insn = tiCurrent.getPC().getValue();
        log.info(tiStartee.getName(), " start not a scheduling point in ", insn.getMethodInfo().getFullName());
      }
      
    } else {
      // nothing to do in the bottom half
    }
  }

  @MJI
  public void yield____V (MJIEnv env, int clsObjRef) {
    ThreadInfo ti = env.getThreadInfo();
    SystemState ss = env.getSystemState();

    if (!ti.isFirstStepInsn()) { // first time we see this (may be the only time)
      ChoiceGenerator<?> cg = ss.getSchedulerFactory().createThreadYieldCG( ti);
      if (ss.setNextChoiceGenerator(cg)) {
        env.repeatInvocation();
      }
    } else {
      // nothing to do, this was just a forced reschedule
    }
  }

  @MJI
  public void sleep__JI__V (MJIEnv env, int clsObjRef, long millis, int nanos) {
    ThreadInfo ti = env.getThreadInfo();
    SystemState ss = env.getSystemState();

    if (!ti.isFirstStepInsn()) { // first time we see this (may be the only time)
      ChoiceGenerator<?> cg = ss.getSchedulerFactory().createThreadSleepCG( ti, millis, nanos);
      if (ss.setNextChoiceGenerator(cg)) {
        env.repeatInvocation();
        ti.setSleeping();
      }
    } else {
      // this seems asymmetric (since we only set it to sleeping when we register
      // a CG) but it isn't. This is only the firstStepInsn if we had a CG
      ti.setRunning();
    }
  }

  @MJI
  public void suspend____ (MJIEnv env, int threadObjRef) {
    ThreadInfo currentThread = env.getThreadInfo();
    ThreadInfo target = env.getThreadInfoForObjRef(threadObjRef);
    SystemState ss = env.getSystemState();

    if (target.isTerminated()) {
      return;
    }

    if (!currentThread.isFirstStepInsn()) {
      if (target.suspend()){
        ChoiceGenerator<?> cg = ss.getSchedulerFactory().createThreadSuspendCG(currentThread);
        if (ss.setNextChoiceGenerator(cg)) {
          env.repeatInvocation();
          return;
        }
      }
    }
  }

  @MJI
  public void resume____ (MJIEnv env, int threadObjRef) {
    ThreadInfo currentThread = env.getThreadInfo();
    ThreadInfo target = env.getThreadInfoForObjRef(threadObjRef);
    SystemState ss = env.getSystemState();

    if (currentThread == target){
      // no self resume prior to suspension
      return;
    }

    if (target.isTerminated()) {
      return;
    }

    if (!currentThread.isFirstStepInsn()) {
      if (target.resume()){
        ChoiceGenerator<?> cg = ss.getSchedulerFactory().createThreadResumeCG(currentThread);
        if (ss.setNextChoiceGenerator(cg)) {
          env.repeatInvocation();
          return;
        }
      }
    }
  }

  /**
   * this is here so that we don't have to break the transition on a synchronized call
   */
  static void join0 (MJIEnv env, int joineeRef, long timeout){
    ThreadInfo tiJoiner = env.getThreadInfo(); // this is the CURRENT thread (joiner)
    System.out.println("JPF_java_lang_Thread.join0(" + joineeRef + ")");
    ThreadInfo tiJoinee = env.getThreadInfoForObjRef(joineeRef);
    boolean isAlive = tiJoinee.isAlive();

    SystemState ss = env.getSystemState();
    ElementInfo ei = env.getModifiableElementInfo(joineeRef); // the thread object to wait on

    if (tiJoiner.isInterrupted(true)){ // interrupt status is set, throw and bail
      
      // since we use lock-free joins, we need to remove ourselves from the
      // lock contender list
      ei.setMonitorWithoutLocked(tiJoiner);
      
      // note that we have to throw even if the thread to join to is not alive anymore
      env.throwInterrupt();
      return;
    }

    //--- the join
    if (tiJoiner.isFirstStepInsn()) { // re-execution, we already have a CG

      switch (tiJoiner.getState()){
        case UNBLOCKED:
          // Thread was owning the lock when it joined - we have to wait until
          // we can reacquire it
          ei.lockNotified(tiJoiner);
          break;

        case TIMEDOUT:
          ei.resumeNonlockedWaiter(tiJoiner);
          break;

        case RUNNING:
          if (isAlive) { // we still need to wait
            ei.wait(tiJoiner, timeout, false); // no need for a new CG
            env.repeatInvocation();
          }
          break;
      }

    } else { // first time exec, create a CG if the thread is still alive

      if (timeout < 0){
        env.throwException("java.lang.IllegalArgumentException", "timeout value is negative");
        return;
      }

      if (isAlive) {

        ei.wait(tiJoiner, timeout, false);
        ChoiceGenerator<ThreadInfo> cg = ss.getSchedulerFactory().createWaitCG(ei, tiJoiner, timeout);

        env.setMandatoryNextChoiceGenerator(cg, "no CG for blocking join()");
        env.repeatInvocation();

      } else {
        // nothing to do, thread is already terminated
      }
    }
  }

  // the old generic version that was based on a synchronized method, which
  // is bad because it leads to superfluous transitions
  /*
  public static void join__ (MJIEnv env, int objref) {
    ThreadInfo tiStop = getThreadInfo(env,objref);

    if (tiStop.isAlive()) {
      env.wait(objref);
    }
  }
   */

  @MJI
  public void join____V (MJIEnv env, int objref){
    join0(env,objref,0);
  }

  @MJI
  public void join__J__V (MJIEnv env, int objref, long millis) {
    join0(env,objref,millis);

  }

  @MJI
  public void join__JI__V (MJIEnv env, int objref, long millis, int nanos) {
    join0(env,objref,millis); // <2do> we ignore nanos for now
  }

  @MJI
  public int getState0____I (MJIEnv env, int objref) {
    // return the state index with respect to one of the public Thread.States
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);

    switch (ti.getState()) {
      case NEW:
        return 1;
      case RUNNING:
        return 2;
      case BLOCKED:
        return 0;
      case UNBLOCKED:
        return 2;
      case WAITING:
        return 5;
      case TIMEOUT_WAITING:
        return 4;
      case SLEEPING:
        return 4;
      case NOTIFIED:
        return 0;
      case INTERRUPTED:
        return 0;
      case TIMEDOUT:
        return 2;
      case TERMINATED:
        return 3;
      default:
        throw new JPFException("illegal thread state: " + ti.getState());
    }
  }

  @MJI
  public long getId____J (MJIEnv env, int objref) {
    ThreadInfo ti = env.getThreadInfoForObjRef(objref);
    return ti.getId();
  }
  
  @MJI
  public void stop____V (MJIEnv env, int threadRef) {
    stop__Ljava_lang_Throwable_2__V(env, threadRef, MJIEnv.NULL);
  }

  @MJI
  public void stop__Ljava_lang_Throwable_2__V(MJIEnv env, int threadRef, int throwableRef) {
    ThreadInfo tiStop = env.getThreadInfoForObjRef(threadRef);  // the thread to stop
    ThreadInfo tiCurrent = env.getThreadInfo(); // the currently executing thread

    if (tiStop.isTerminated() || tiStop.isStopped()) {
      // no need to kill it twice
      return;
    }

    if (!tiCurrent.isFirstStepInsn()) {
      // since this is usually not caught (it shouldn't, at least not without
      // rethrowing), we might turn this into a right mover since it terminates tiStop

      SystemState ss = env.getSystemState();
      ChoiceGenerator<?> cg = ss.getSchedulerFactory().createThreadStopCG(tiCurrent);
      if (ss.setNextChoiceGenerator(cg)) {
        env.repeatInvocation();
        return;
      }
    }

    tiStop.setStopped(throwableRef);
  }
}
