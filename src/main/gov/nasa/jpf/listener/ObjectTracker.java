//
// Copyright (C) 2007 United States Government as represented by the
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

package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.PUTFIELD;
import gov.nasa.jpf.jvm.bytecode.VirtualInvocation;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.StringSetMatcher;
import gov.nasa.jpf.vm.AnnotationInfo;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.InfoObject;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

import java.io.PrintWriter;
import java.util.HashMap;

import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * listener that keeps track of all allocations, method calls, field updates
 * and deallocations of instances of a set of types
 * 
 * we don't need a StateExtensionClient/Listener here because we only
 * keep live, typed object data. If we ever backtrack to a point
 * where a registered object didn't exist yet, this id can't be used
 * again (for a relevant object) w/o previous registration. Note this
 * might cause some discarded objects to stay around, but requires probably
 * less memory than storing a collection for every state id.  
 */
public class ObjectTracker extends PropertyListenerAdapter {

  static class Record {
    ElementInfo ei;
    ThreadInfo tiCreate;
    
    Record (ElementInfo ei, ThreadInfo ti){
      this.ei = ei;
      this.tiCreate = ti;
    }
  }
  
  PrintWriter out;
  StringSetMatcher includes, excludes;
  
  //--- our various report & check options
  boolean logLife;
  boolean logCall;
  boolean logPut;
  boolean logShared;
  boolean checkShared;
  boolean checkConst;

  HashMap<Integer,Record> trackedObjects;
    
  //--- property data
  class Violation {
    Record rec;
    String msg;
    ThreadInfo tiUse;
    InfoObject use;
    Instruction insn;
    
    Violation (Record rec, ThreadInfo tiUse, InfoObject use, Instruction insn) {
      this.rec = rec;
      this.tiUse = tiUse;
      this.use = use;
      this.insn = insn;
    }
    
    public void setSharedErrorMessage () {
      StringBuilder sb = new StringBuilder("@NonShared object violation: ");
      sb.append(rec.ei);
      sb.append("\n\tcreated in thread: ");
      sb.append(rec.tiCreate.getName());
      sb.append("\n\tused in thread:    ");
      sb.append(tiUse.getName());
      sb.append("\n\tmethod:            ");
      sb.append(insn.getSourceLocation());
      
      msg = sb.toString();
    }

    public void setConstErrorMessage () {
      MethodInfo mi = insn.getMethodInfo();
      StringBuilder sb = new StringBuilder("@Const method violation: ");
      sb.append(mi.getFullName());
      sb.append("\n\tfield:    ");
      sb.append(((FieldInfo)use).getFullName());
      sb.append("\n\tmethod:   ");
      sb.append(insn.getSourceLocation());
      
      msg = sb.toString();
    }
  }
  
  Violation violation;
  
  //--- internal stuff
  public ObjectTracker (Config conf, JPF jpf) {
    out = new PrintWriter(System.out, true);
    
    includes = StringSetMatcher.getNonEmpty(conf.getStringArray("ot.include"));
    excludes = StringSetMatcher.getNonEmpty(conf.getStringArray("ot.exclude"));
    
    logLife = conf.getBoolean("ot.log_life", true);
    logCall = conf.getBoolean("ot.log_call", true);
    logPut = conf.getBoolean("ot.log_put", true);
    logShared = conf.getBoolean("ot.log_shared", true);
    checkShared = conf.getBoolean("ot.check_shared",false);
    checkConst = conf.getBoolean("ot.check_const",false);
    
    trackedObjects = new HashMap<Integer,Record>();
  }
  
  boolean isTrackedClass (String clsName){
    return StringSetMatcher.isMatch(clsName, includes, excludes);
  }

  boolean isTrackedObject (int ref){
    return (trackedObjects.containsKey(ref));
  }

  Record getRecord (int ref){
    return trackedObjects.get(ref);
  }
  
  void log (ThreadInfo ti, String fmt, Object... args){
    out.print(ti.getId());
    out.print(": ");
    out.printf(fmt, args);
    out.println();
  }

  boolean checkShared (Record rec, ThreadInfo ti, InfoObject use, Instruction insn){
    if (checkShared){
      AnnotationInfo ai = rec.ei.getClassInfo().getAnnotation("gov.nasa.jpf.NonShared");
      if (ai != null && ti != rec.tiCreate){
        violation = new Violation(rec, ti, use, insn);
        violation.setSharedErrorMessage();
        
        ti.breakTransition("checkShared");
        return false;
      }
    }
    
    return true;
  }

  boolean checkConst (Record rec, ThreadInfo ti, FieldInfo fi, Instruction insn){
    if (checkConst){
      AnnotationInfo ai = insn.getMethodInfo().getAnnotation("gov.nasa.jpf.Const");
      if (ai != null){
        violation = new Violation(rec, ti, fi, insn);
        violation.setConstErrorMessage();
        
        ti.breakTransition("checkConst");
        return false;        
      }
    }
    
    return true;
  }
  
  //--- Property interface
  @Override
  public boolean check (Search search, VM vm) {
    if (violation != null){
      return false;
    }
    
    return true;
  }

  @Override
  public void reset () {
    violation = null;
  }

  public String getErrorMessage() {
    if (violation != null){
      return violation.msg;
    } else {
      return null;
    }
  }
  
  //--- VMListener interface
  @Override
  public void objectCreated (VM vm, ThreadInfo ti, ElementInfo ei) {
    ClassInfo ci = ei.getClassInfo();
    
    if (isTrackedClass(ci.getName())){
      trackedObjects.put(ei.getObjectRef(), new Record(ei, ti));
    
      if (logLife){
        log(ti, "created %1$s", ei);
      }
    }
  }
  
  @Override
  public void objectReleased (VM vm, ThreadInfo ti, ElementInfo ei) {
    int ref = ei.getObjectRef();
    
    if (isTrackedObject(ref)){
      trackedObjects.remove(ref);
      
      if (logLife){
        log(ti, "released %1$s", ei);
      }
    }
  }

  @Override
  public void instructionExecuted (VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn){

    if (executedInsn instanceof VirtualInvocation){
      
      if (nextInsn != executedInsn){ // otherwise we didn't enter
        VirtualInvocation call = (VirtualInvocation)executedInsn;
        int ref = call.getCalleeThis(ti);
        Record rec = getRecord(ref);
        
        if (rec != null){
          MethodInfo mi = call.getInvokedMethod(FeatureExprFactory.True(), ti, ref);
          
          if (logCall){
            log(ti, "invoke %1$s.%2$s", rec.ei, mi.getUniqueName());
          }
          
          if (!checkShared(rec, ti, mi, executedInsn)){
            return;
          }
        }
      }
      
    } else if (executedInsn instanceof PUTFIELD){
      PUTFIELD storeInsn = (PUTFIELD) executedInsn;
      int ref = storeInsn.getLastThis();
      Record rec = getRecord(ref);
      
      if (rec != null){
        FieldInfo fi = storeInsn.getFieldInfo(null);
        
        if (logPut){
          log(ti, "put %1$s.%2$s = <%3$d>", rec.ei, fi.getName(), storeInsn.getLastValue());
        }
        
        if (!checkShared(rec, ti, fi, executedInsn)){
          return;
        }
        
        if (!checkConst(rec,ti,fi,executedInsn)){
          return;
        }
      }
    }
  }
}
