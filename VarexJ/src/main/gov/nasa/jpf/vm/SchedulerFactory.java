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

/**
 * interface of factory object that creates all ChoiceGenerators required
 * to implement scheduling strategies
 */
public interface SchedulerFactory {
  
  /** used by InvokeInstructions of sync methods */
  public static final String SYNC_METHOD_ENTER = "SYNC_METHOD_ENTER";
  ChoiceGenerator<ThreadInfo> createSyncMethodEnterCG(ElementInfo ei, ThreadInfo ti);
  
  /** user by Returns of sync methods */
  public static final String SYNC_METHOD_EXIT = "SYNC_METHOD_EXIT";
  ChoiceGenerator<ThreadInfo> createSyncMethodExitCG(ElementInfo ei, ThreadInfo ti);
  
  /** used by MonitorEnter insns */
  public static final String MONITOR_ENTER = "MONITOR_ENTER";
  ChoiceGenerator<ThreadInfo> createMonitorEnterCG(ElementInfo ei, ThreadInfo ti);
  
  /** used by MonitorExit insns */
  public static final String MONITOR_EXIT = "MONITOR_EXIT";
  ChoiceGenerator<ThreadInfo> createMonitorExitCG(ElementInfo ei, ThreadInfo ti);
  
  /** used by Object.wait() */
  public static final String WAIT = "WAIT";
  ChoiceGenerator<ThreadInfo> createWaitCG (ElementInfo ei, ThreadInfo ti, long timeOut);
  
  /** used by Object.notify() */
  public static final String NOTIFY = "NOTIFY";
  ChoiceGenerator<ThreadInfo> createNotifyCG(ElementInfo ei, ThreadInfo ti);

  /** used by Object.notifyAll() */
  public static final String NOTIFY_ALL = "NOTIFY_ALL";
  ChoiceGenerator<ThreadInfo> createNotifyAllCG(ElementInfo ei, ThreadInfo ti);
  
  /** used by sun.misc.Unsafe.park() */
  public static final String PARK = "PARK";
  ChoiceGenerator<ThreadInfo> createParkCG (ElementInfo ei, ThreadInfo tiPark, boolean isAbsoluteTime, long timeOut);
    
  /** used by sun.misc.Unsafe.unpark() */
  public static final String UNPARK = "UNPARK";
  ChoiceGenerator<ThreadInfo> createUnparkCG (ThreadInfo tiUnparked);
  
  /** used by GetField,PutField,GetStatic,PutStatic insns of shared objects */
  public static final String SHARED_FIELD_ACCESS = "SHARED_FIELD_ACCESS";
  ChoiceGenerator<ThreadInfo> createSharedFieldAccessCG(ElementInfo ei, ThreadInfo ti);
  
  /** used from ArrayInstruction (various array element access insns) */
  public static final String SHARED_ARRAY_ACCESS = "SHARED_ARRAY_ACCESS";
  ChoiceGenerator<ThreadInfo> createSharedArrayAccessCG (ElementInfo eiArray, ThreadInfo ti);

  /** used by PutField,PutStatic insns if previously unshared objects get stored in shared object fields */
  public static final String SHARED_OBJECT_EXPOSURE = "SHARED_OBJECT_EXPOSURE";
  ChoiceGenerator<ThreadInfo> createSharedObjectExposureCG(ElementInfo ei, ThreadInfo ti);
  
  /** used by Thread.start() */
  public static final String THREAD_START = "THREAD_START";
  ChoiceGenerator<ThreadInfo> createThreadStartCG (ThreadInfo newThread);
  
  /** used by Thread.yield() */
  public static final String THREAD_YIELD = "THREAD_YIELD";
  ChoiceGenerator<ThreadInfo> createThreadYieldCG (ThreadInfo yieldThread);
  
  /** used by Thread.sleep() */
  public static final String THREAD_SLEEP = "THREAD_SLEEP";
  ChoiceGenerator<ThreadInfo> createThreadSleepCG (ThreadInfo sleepThread, long millis, int nanos);

  /** used by Thread.interrupt() */
  public static final String THREAD_INTERRUPT = "THREAD_INTERRUPT";
  public ChoiceGenerator<ThreadInfo> createInterruptCG (ThreadInfo interruptedThread);

  /** used by Return from run() */
  public static final String THREAD_TERMINATE = "THREAD_TERMINATE";
  ChoiceGenerator<ThreadInfo> createThreadTerminateCG (ThreadInfo terminatedThread);

  /** used by Thread.suspend() */
  public static final String THREAD_SUSPEND = "THREAD_SUSPEND";
  ChoiceGenerator<ThreadInfo> createThreadSuspendCG (ThreadInfo suspendedThread);

  /** used by Thread.resume() */
  public static final String THREAD_RESUME = "THREAD_RESUME";
  ChoiceGenerator<ThreadInfo> createThreadResumeCG (ThreadInfo resumedThread);

  /** used by Thread.stop() */
  public static final String THREAD_STOP = "THREAD_STOP";
  ChoiceGenerator<ThreadInfo> createThreadStopCG (ThreadInfo stoppedThread);

  /** used by Verify.beginAtomic() */
  public static final String BEGIN_ATOMIC = "BEGIN_ATOMIC";
  ChoiceGenerator<ThreadInfo> createBeginAtomicCG (ThreadInfo ti);

  /** used by Verify.andAtomic() */
  public static final String END_ATOMIC = "END_ATOMIC";
  ChoiceGenerator<ThreadInfo> createEndAtomicCG (ThreadInfo ti);
  
  /**
   * used to break the transition for other reasons (e.g. max transition length exceeded) 
   * Although most of this happens from a mandatory CG context, we still route this through
   * the scheduler policy object to give it a chance to select the scheduling candidates
   * Since this is a generic method, we require an explicit id/reason argument
   */
  ChoiceGenerator<ThreadInfo> createBreakTransitionCG (String reason, ThreadInfo ti);
  
  /** used by FinalizerThreadInfo.schedulerFinalizer */
  public static final String PRE_FINALIZE = "PRE_FINALIZE";
  ChoiceGenerator<ThreadInfo> createPreFinalizeCG (ThreadInfo ti);
  
  /** used by the Finalizer.manageState() native peer */
  public static final String POST_FINALIZE = "POST_FINALIZE";
  ChoiceGenerator<ThreadInfo> createPostFinalizeCG (ThreadInfo finalizerThread);
}
