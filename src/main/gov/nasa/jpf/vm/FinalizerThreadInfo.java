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

import gov.nasa.jpf.jvm.bytecode.extended.One;

import java.util.ArrayList;
import java.util.List;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 *  
 * This class represents the finalizer thread in VM which is responsible for
 * executing finalize() methods upon garbage collection of finalizable objects.
 * By a finalizable object, we mean an object, the class of which overrides the
 * Object.finalize() method. By default, we do not allow for processing finalizers, 
 * to enforce that one needs to set the property "vm.process_finalizers" to true.
 * 
 * If "vm.process_finalizers" is set to true, during vm initialization we create
 * a FinalizerThreadInfo object per process. ApplicationContext keeps a reference
 * to FinalizerThreadInfo of the process. This thread is alive during the entire
 * process execution. The finalizer thread is "always" waiting on an internal
 * private lock. The JPF Thread object corresponding to the FinalizerThreadInfo 
 * is encapsulated by the model class gov.nasa.jpf.FinalizerThread. The thread 
 * encapsulated by FinalizerThread has a queue of objects called "finalizeQueue"
 * which is kept at the SUT level. This queue is initially empty, and it is 
 * populated during the sweep() phase of the garbage collection. During sweep(), 
 * before removing unmark objects from the heap, any unmark finalizable object is 
 * marked and added to finalizeQueue. 
 * 
 * In VM.forward(), after each garbage collection, VM checks if finalizeQueue of 
 * the current process finalizer thread is not empty. If so, VM schedules the
 * finalizer thread to execute next, i.e. finalizer thread stops waiting and its 
 * state becomes runnable. To accomplish that, VM replaces the next choiceGenerator 
 * with a new choice generator from which only finalizer thread can proceed.
 *  
 * After finalizer thread processes the finalize() methods of all objects in
 * finalizeQueue, the queue becomes empty and the thread waits on its internal lock
 * again. After the process terminates, we still keep the finalizer thread to be 
 * processed after the last garbage collection involving the process. The runnable
 * finalizer thread terminates itself when it has processed its finalizeQueue and 
 * there is no other alive thread in the process.
 */
public class FinalizerThreadInfo extends ThreadInfo {
  
  static final String FINALIZER_NAME = "finalizer";
  
  ChoiceGenerator<?> replacedCG;
  
  protected FinalizerThreadInfo (VM vm, ApplicationContext appCtx, int id) {
    super(vm, id, appCtx);
    
    ci = appCtx.getSystemClassLoader().getResolvedClassInfo(null, "gov.nasa.jpf.FinalizerThread");
    threadData.name = FINALIZER_NAME;
    
    tempFinalizeQueue = new ArrayList<ElementInfo>();
  }
  
  protected void createFinalizerThreadObject (FeatureExpr ctx, SystemClassLoaderInfo sysCl){
    Heap heap = getHeap();

    ElementInfo eiThread = heap.newObject( null, ci, this);
    objRef = eiThread.getObjectRef();
    
    ElementInfo eiName = heap.newString(FeatureExprFactory.True(), new One<>(FINALIZER_NAME), this);
    int nameRef = eiName.getObjectRef();
    eiThread.setReferenceField("name", nameRef);
    
    // Since we create FinalizerThread upon VM initialization, they are assigned to the
    // same group as the main thread
    int grpRef = ThreadInfo.getCurrentThread().getThreadGroupRef();
    eiThread.setReferenceField("group", grpRef);
    
    eiThread.setIntField(FeatureExprFactory.True(), "priority", Thread.MAX_PRIORITY-2);

    ClassInfo ciPermit = sysCl.getResolvedClassInfo(null, "java.lang.Thread$Permit");
    ElementInfo eiPermit = heap.newObject( null, ciPermit, this);
    eiPermit.setBooleanField("blockPark", true);
    eiThread.setReferenceField("permit", eiPermit.getObjectRef());

    addToThreadGroup(getElementInfo(grpRef));
    
    addId( objRef, id);
    
    threadData.name = FINALIZER_NAME;

    // start the thread by pushing Thread.run()
    startFinalizerThread(ctx);
    
    eiThread.setBooleanField("done", false);
    ElementInfo finalizeQueue = getHeap().newArray(FeatureExprFactory.True(), "Ljava/lang/Object;", 0, this);
    eiThread.setReferenceField("finalizeQueue", finalizeQueue.getObjectRef());
    
    // create an internal private lock used for lock-free wait
    ElementInfo lock = getHeap().newObject(null, appCtx.getSystemClassLoader().objectClassInfo, this);
    eiThread.setReferenceField("semaphore", lock.getObjectRef());
    
    // make it wait on the internal private lock until its finalizeQueue is populated. This way,
    // we avoid scheduling points from including FinalizerThreads
    waitOnSemaphore();

    assert this.isWaiting();
  }
  
  /**
   * Pushes a frame corresponding to Thread.run() into the finalizer thread stack to
   * start the thread.
 * @param ctx TODO
   */
  protected void startFinalizerThread(FeatureExpr ctx) {
    MethodInfo mi = ci.getMethod("run()V", false);
    DirectCallStackFrame frame = mi.createDirectCallStackFrame(ctx, this, 0);
    frame.setReferenceArgument(0, objRef, frame);
    pushFrame(frame);
  }
  
  public boolean hasQueuedFinalizers() {
    ElementInfo queue = getFinalizeQueue();
    return (queue!=null && queue.asReferenceArray().length>0);
  }
  
  public ElementInfo getFinalizeQueue() {
    ElementInfo ei = vm.getModifiableElementInfo(objRef);
    ElementInfo queue = null;
    
    if(ei!=null) {
      int queueRef = ei.getReferenceField("finalizeQueue").getValue();
      queue = vm.getModifiableElementInfo(queueRef);
      return queue;
    }
    
    return queue;
  }
  
  // all finalizable objects collected during garbage collection are temporarily added to this list
  // when VM schedule the finalizer thread, it add all elements to FinalizerThread.finalizeQueue at
  // the SUT level.
  List<ElementInfo> tempFinalizeQueue;
  
  /** 
   * This method is invoked by the sweep() phase of the garbage collection process (GenericHeap.sweep()).
   * It adds a given finalizable object to the finalizeQueue array of gov.nasa.jpf.FinalizerThread.
   */
  public void addToFinalizeQueue(ElementInfo ei) {
    ei = ei.getModifiableInstance();
    
    // make sure we process this object finalizer only once
    ei.setFinalized();
    
    tempFinalizeQueue.add(ei);
  }
  
  /**
   * This method adds all finalizable objects observed during the last garbage collection
   * to finalizeQueue of FinalizerThread corresponding to this thread
   */
  void processNewFinalizables() {
    if(!tempFinalizeQueue.isEmpty()) {
      
      ElementInfo oldQueue = getFinalizeQueue();
      int[] oldValues = oldQueue.asReferenceArray();    
      int len = oldValues.length;
      
      int n = tempFinalizeQueue.size();
      
      ElementInfo newQueue = getHeap().newArray(FeatureExprFactory.True(), "Ljava/lang/Object;", len+n, this);
      int[] newValues = newQueue.asReferenceArray();
      
      System.arraycopy(oldValues, 0, newValues, 0, len);
      
      for(ElementInfo ei: tempFinalizeQueue) {
        newValues[len++] = ei.getObjectRef();
      }
      
      vm.getModifiableElementInfo(objRef).setReferenceField("finalizeQueue", newQueue.getObjectRef());
      tempFinalizeQueue.clear();
      
      assert hasQueuedFinalizers();
    }
  }
  
  public boolean scheduleFinalizer() {
    if(hasQueuedFinalizers() && !isRunnable()) {
      replacedCG = vm.getNextChoiceGenerator();
      vm.getSystemState().removeNextChoiceGenerator();
      
      // NOTE - before we get here we have already made sure that nextCg is not Cascaded. 
      // we have to set nextCg to null before setting the nextCG, otherwise, the new CG is 
      // mistakenly considered as "Cascaded"
      vm.getSystemState().nextCg = null;
      ChoiceGenerator<ThreadInfo> cg = vm.getSystemState().getSchedulerFactory().createPreFinalizeCG(this);
      vm.getSystemState().setMandatoryNextChoiceGenerator(cg, "Need to start FinalizerThread to process objects finalizers");
      
      // stop waiting and process finalizers
      notifyOnSemaphore();
      assert this.isRunnable();
      
      return true;
    } 
    
    return false;
  }
  
  protected void waitOnSemaphore() {
    int lockRef = vm.getElementInfo(objRef).getReferenceField("semaphore").getValue();
    ElementInfo lock = vm.getModifiableElementInfo(lockRef);
    
    lock.wait(this, 0, false);
  }
  
  protected void notifyOnSemaphore() {
    int lockRef = vm.getElementInfo(objRef).getReferenceField("semaphore").getValue();
    ElementInfo lock = vm.getModifiableElementInfo(lockRef);
    
    lock.notifies(vm.getSystemState(), this, false);
  }
  
  @Override
  public boolean isSystemThread() {
    return true;
  }
}
