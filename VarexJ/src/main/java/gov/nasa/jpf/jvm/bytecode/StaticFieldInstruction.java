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
package gov.nasa.jpf.jvm.bytecode;

import cmu.conditional.CachedFeatureExprFactory;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StaticElementInfo;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * class to abstract instructions accessing static fields
 */
public abstract class StaticFieldInstruction extends FieldInstruction {

  protected StaticFieldInstruction(){}

  protected StaticFieldInstruction(String fieldName, String clsDescriptor, String fieldDescriptor){
    super(fieldName, clsDescriptor, fieldDescriptor);
  }

  /**
   * on-demand initialize the ClassInfo and FieldInfo fields. Note that
   * classinfo might not correspond with the static className, but can be one of
   * the super classes. Rather than checking for this on each subsequent access,
   * we get the right one that declares the field here
   */
  protected void initialize(FeatureExpr ctx) {
    ClassInfo ciRef = mi.getClassInfo().resolveReferencedClass(ctx, className);
    
    FieldInfo f = ciRef.getStaticField(fname);
    ClassInfo ciField = f.getClassInfo();
    if (!ciField.isRegistered()){
      // classLoaded listeners might change/remove this field
      ciField.registerClass(CachedFeatureExprFactory.True(), ThreadInfo.getCurrentThread());
      f = ciField.getStaticField(fname);
    }
    
    fi = f;
  }

  public ClassInfo getClassInfo() {
    if (fi == null) {
      initialize(null);
    }
    return fi.getClassInfo();
  }

  public FieldInfo getFieldInfo(FeatureExpr ctx) {
    if (fi == null) {
      initialize(ctx);
    }
    return fi;
  }

  /**
   *  that's invariant, as opposed to InstanceFieldInstruction, so it's
   *  not really a peek
   */
  public ElementInfo peekElementInfo (ThreadInfo ti) {
    return getLastElementInfo();
  }

  public StaticElementInfo getLastElementInfo() {
    return getFieldInfo(CachedFeatureExprFactory.True()).getClassInfo().getStaticElementInfo();
  }

  // this can be different than ciField - the field might be in one of its
  // superclasses
  public ClassInfo getLastClassInfo(){
    return getFieldInfo(CachedFeatureExprFactory.True()).getClassInfo();
  }

  public String getLastClassName() {
    return getLastClassInfo().getName();
  }

  protected boolean isNewPorFieldBoundary (ThreadInfo ti) {
    return !ti.isFirstStepInsn() && ti.usePorFieldBoundaries() && isSchedulingRelevant(ti);
  }

  @Override
  protected boolean isSkippedFinalField (ElementInfo ei) {
    if (fi.isFinal()){
      // NOTE - we only encounter this for references, other static finals
      // will be inlined by the compiler    
      if (skipFinals || skipStaticFinals) {
        return true;
      }
    }
    
    return false;
  }
  
  protected boolean isSchedulingRelevant (ThreadInfo ti) {
    
    //--- configured override
    FieldInfo fi = getFieldInfo(null);
    if (fi.neverBreak()) {
      // this should filter out the bulk in most real apps (library code)
      return false;
    } else if (fi.breakShared()){
      return true;
    }

    //--- field owner properties
    ElementInfo ei = fi.getClassInfo().getStaticElementInfo();
    if (ei.isImmutable() || isSkippedFinalField(ei)) {
      return false;
    }
    
    if (!ei.isShared()) {
      return false;
    }

    if (!ti.hasOtherRunnables()) { // single threaded
      return false;
    }
    
    //--- special code patterns
    if (isMonitorEnterPrologue()) {
      // if this is a GET followed by a MONITOR_ENTER then we just break on the monitor
      return false;
    }
    if (mi.isClinit() && (fi.getClassInfo() == mi.getClassInfo())) {
      // clinits are all synchronized, so they don't count
      return false;
    }

    if (ti.usePorSyncDetection()) {
      if (isLockProtected(ti, ei)) {
        return false;
      }      
    }

    return true;
  }

  @Override
  public Instruction typeSafeClone(MethodInfo mi) {
    StaticFieldInstruction clone = null;

    try {
      clone = (StaticFieldInstruction) super.clone();

      // reset the method that this insn belongs to
      clone.mi = mi;
      clone.fi = null; // ClassInfo is going to be different
      
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return clone;
  }
}

