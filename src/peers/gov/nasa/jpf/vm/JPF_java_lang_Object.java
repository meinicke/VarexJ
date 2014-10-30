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

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.annotation.MJI;


/**
 * MJI NativePeer class for java.lang.Object library abstraction
 */
public class JPF_java_lang_Object extends NativePeer {
  
  @MJI
  public int getClass____Ljava_lang_Class_2 (MJIEnv env, int objref, FeatureExpr ctx) {
    ClassInfo oci = env.getClassInfo(objref);

    return oci.getClassObjectRef();
  }

  @MJI
  public int clone____Ljava_lang_Object_2 (MJIEnv env, int objref, FeatureExpr ctx) {
    Heap heap = env.getHeap();
    ElementInfo ei = heap.get(objref);
    ClassInfo ci = ei.getClassInfo();
    ElementInfo eiClone = null;
    
    if (!ci.isInstanceOf("java.lang.Cloneable")) {
      env.throwException(ctx,
          "java.lang.CloneNotSupportedException", ci.getName() + " does not implement java.lang.Cloneable.");
      return MJIEnv.NULL;  // meaningless
      
    } else {
//      int newref;
      if (ci.isArray()) {
        ClassInfo cci = ci.getComponentClassInfo();
        
        String componentType;
        if (cci.isPrimitive()){
          componentType = Types.getTypeSignature(cci.getName(),false);
        } else {
          componentType = cci.getType();
        }

        eiClone = heap.newArray(ctx, componentType, ei.arrayLength().getValue(), env.getThreadInfo());
        
      } else {
        eiClone = heap.newObject(ctx, ci, env.getThreadInfo());
      }
      
      // Ok, this is nasty but efficient
      eiClone.fields = ei.getFields().clone();

      return eiClone.getObjectRef();
    }
  }

  @MJI
  public int hashCode____I (MJIEnv env, int objref, FeatureExpr ctx) {
    return (objref ^ 0xABCD);
  }

  static void wait0(MJIEnv env, int objref, long timeout, FeatureExpr ctx) {
    // IllegalMonitorStateExceptions are checked in the MJIEnv methods
    ThreadInfo ti = env.getThreadInfo();
    SystemState ss = env.getSystemState();
    ElementInfo ei = env.getModifiableElementInfo(objref);

    if (ti.isFirstStepInsn()) { // we already have a CG
      switch (ti.getState()) {

        // we can get here by direct call from ...Unsafe.park__ZJ__V()
        // which aquires the park lock and waits natively
        case RUNNING:

        // note that we can't get here if we are in NOTIFIED or INTERRUPTED state,
        // since we still have to reacquire the lock
        case UNBLOCKED:
        case TIMEDOUT: // nobody else acquired the lock
          // thread status set by explicit notify() call
          env.lockNotified(objref);

          if (ti.isInterrupted(ctx, true)) {
            env.throwException(ctx, "java.lang.InterruptedException");
          }
          break;

        default:
          throw new JPFException("invalid thread state of: " + ti.getName() + " is " + ti.getStateName() +
                  " while waiting on " + ei);
      }
    } else { // first time, break the transition (if we don't have a pending interrupt)

      // no need for a CG if we got interrupted - don't give up locks, throw InterruptedException
      if (ti.isInterrupted(ctx, true)) {
        env.throwException(ctx, "java.lang.InterruptedException");

      } else {
        if (!ei.isLockedBy(ti)){
          env.throwException(ctx,
                             "java.lang.IllegalMonitorStateException", "un-synchronized wait");
          return;
        }
        // releases the lock and sets BLOCKED threads to UNBLOCKED
        ei.wait(ti, timeout);

        // note we pass in the timeout value, since this might determine the type of CG that is created
        ChoiceGenerator<?> cg = ss.getSchedulerFactory().createWaitCG(ei, ti, timeout);
        ss.setMandatoryNextChoiceGenerator(cg, "wait without CG");
        env.repeatInvocation(); // so that we can still see the wait on the callstack
      }
    }
  }
  
  // we intercept them both so that we don't get the java.lang.Object.wait() location
  // as the blocking insn
  @MJI
  public void wait____V (MJIEnv env, int objref, FeatureExpr ctx){
    wait0(env,objref,0, ctx);
  }
  
  @MJI
  public void wait__J__V (MJIEnv env, int objref, long timeout, FeatureExpr ctx) {
    wait0(env,objref,timeout, ctx);
  }

  @MJI
  public void wait__JI__V (MJIEnv env, int objref, long timeout, int nanos, FeatureExpr ctx) {
    wait0(env,objref,timeout, ctx);
  }

  
  @MJI
  public void notify____V (MJIEnv env, int objref, FeatureExpr ctx) {
    // IllegalMonitorStateExceptions are checked in the MJIEnv methods

    ThreadInfo ti = env.getThreadInfo();
    SystemState ss = env.getSystemState();
    ElementInfo ei = env.getModifiableElementInfo(objref);    
    
    if (!ti.isFirstStepInsn()) { // first time around
      
      ChoiceGenerator<?> cg = ss.getSchedulerFactory().createNotifyCG(ei, ti);
      if (ss.setNextChoiceGenerator(cg)){
        ti.skipInstructionLogging();
        env.repeatInvocation();
        return;
      }
    }
        
    // this is a bit cluttered throughout the whole system, with the actual thread
    // notification (status change) taking place in the ElementInfo
    env.notify(ctx, ei);
  }

  @MJI
  public void notifyAll____V (MJIEnv env, int objref, FeatureExpr ctx) {
    // IllegalMonitorStateExceptions are checked in the MJIEnv methods

    // usually, there is no non-determinism involved here, but
    // we might have a SchedulerFactory policy that does want to
    // break, so we have to give it a chance to interfere
    ThreadInfo ti = env.getThreadInfo();
    SystemState ss = env.getSystemState();
    
    if (!ti.isFirstStepInsn()) { // first time around
      ElementInfo ei = env.getModifiableElementInfo(objref);
      env.notifyAll(ctx, ei); // do that before we create a CG
      
      ChoiceGenerator<?> cg = ss.getSchedulerFactory().createNotifyAllCG(ei, ti);
      if (ss.setNextChoiceGenerator(cg)){
        ti.skipInstructionLogging();
        env.repeatInvocation();
        return;
      }
    }
  }

  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int objref, FeatureExpr ctx) {
    ClassInfo ci = env.getClassInfo(objref);
    int hc = hashCode____I(env,objref, ctx);
    
    String s = ci.getName() + '@' + hc;
    int sref = env.newString(ctx, s);
    return sref;
  }
}
