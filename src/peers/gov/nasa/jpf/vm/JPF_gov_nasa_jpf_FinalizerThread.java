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

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.Predicate;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * A native peer for FinalizerThread. This is also an interface between the FinalizerThread
 * object at the SUT level and it corresponding FinalizerThreadInfo object at the JPF
 * level. 
 */
public class JPF_gov_nasa_jpf_FinalizerThread extends NativePeer {
  
  @MJI
  public void runFinalizer__Ljava_lang_Object_2__V (MJIEnv env, int tiRef, int objRef) {
    int queueRef = env.getReferenceField(tiRef, "finalizeQueue");
    int[] elements = env.getReferenceArrayObject(queueRef);

    if(elements.length>0 && elements[0]==objRef) {
      ThreadInfo finalizerTi = env.getThreadInfo();
      ClassInfo objCi = env.getElementInfo(objRef).getClassInfo();
      MethodInfo mi = objCi.getMethod("finalize()V", false);
    
      // create and push a stack frame for finalize()V
      DirectCallStackFrame frame = mi.createDirectCallStackFrame(finalizerTi, 0);
      frame.setReferenceArgument(0, objRef, frame);
      finalizerTi.pushFrame(frame);
    
      removeElement(env, tiRef, objRef);
    }
  }
  
  // removes the very first element in the list, which is the last finalizable objects processed
  void removeElement(MJIEnv env, int tiRef, int objRef) {
    int queueRef = env.getReferenceField(tiRef, "finalizeQueue");
    ThreadInfo ti = env.getThreadInfo();
    int[] oldValues = env.getReferenceArrayObject(queueRef);
    
    assert (objRef == oldValues[0]);
    
    assert (oldValues.length>0);
    
    int len = oldValues.length - 1;
    ElementInfo newQueue = env.getHeap().newArray("Ljava/lang/Object;", len, ti);
    int[] newValues = newQueue.asReferenceArray();
    
    System.arraycopy(oldValues, 1, newValues, 0, len);
    env.getModifiableElementInfo(tiRef).setReferenceField("finalizeQueue", newQueue.getObjectRef());
  }
  
  // a predicate to obtain all alive, non-finalizer threads within the ti process 
  Predicate<ThreadInfo> getAppAliveUserPredicate (final ThreadInfo ti){
    return new Predicate<ThreadInfo>(){
      public boolean isTrue (ThreadInfo t){
        return (t.isAlive() && !t.isSystemThread() && t.appCtx == ti.appCtx);
      }
    };
  }
  
  @MJI
  public void manageState____V (MJIEnv env, int objref){
    ApplicationContext appCtx = env.getVM().getApplicationContext(objref);
    FinalizerThreadInfo finalizerTi = appCtx.getFinalizerThread();
    VM vm = env.getVM();
    
    // check for termination - Note that the finalizer thread has to be the last alive thread
    // of the process
    if(!vm.getThreadList().hasAnyMatching(getAppAliveUserPredicate(finalizerTi))) {
      shutdown(env, objref);
    }
    // make the thread wait until more objects are added to finalizerQueue
    else {
      finalizerTi.waitOnSemaphore();
      
      assert finalizerTi.isWaiting();
      
      ChoiceGenerator<ThreadInfo> cg = env.getSystemState().getSchedulerFactory().createPostFinalizeCG(finalizerTi);
      env.getSystemState().setMandatoryNextChoiceGenerator(cg, "finalizeQueue processe without CG: ");
    }
  }
  
  protected void shutdown(MJIEnv env, int objRef) {
    env.getModifiableElementInfo(objRef).setBooleanField("done", true);
  }
}
