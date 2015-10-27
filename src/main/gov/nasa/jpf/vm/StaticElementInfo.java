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

import cmu.conditional.Conditional;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.util.HashData;

/**
 * A specialized version of ElementInfo that is used for static fields. Each
 * registered ClassInfo instance has its own StaticElementInfo instance
 */
public final class StaticElementInfo extends ElementInfo {

  // this is kind of dangerous - make sure these flags are still unused in ElementInfo
  static final int ATTR_COR_CHANGED    = 0x100000;
  static final int ATTR_STATUS_CHANGED = 0x200000;

  static final int ATTR_ANY_CHANGED = ElementInfo.ATTR_ANY_CHANGED | ATTR_COR_CHANGED | ATTR_STATUS_CHANGED;
  
  int classObjectRef = MJIEnv.NULL;
  int status = ClassInfo.UNINITIALIZED;

  
  public StaticElementInfo () {
  }

  public StaticElementInfo (int id, ClassInfo ci, Fields f, Monitor m, ThreadInfo ti, ElementInfo eiClsObj) {
    super(id, ci, f, m, ti);

    if (eiClsObj != null) {
      classObjectRef = eiClsObj.getObjectRef();
    }

    // <2do> not ideal, should be in superclass, but we need the classObjectRef for init
    referencingThreads = createThreadInfoSet(ti); // initialization depends on subclass and policy
    setSharednessFromReferencingThreads();
    
    // initial attributes?
  }
  
  @Override
  public ElementInfo getModifiableInstance() {
    if (!isFrozen()) {
      return this;
    } else {
      Statics statics = ci.getStatics();
      return statics.getModifiable( objRef);
    }
  }
  
  // called during ElementInfo construction
  @Override
  protected ThreadInfoSet createThreadInfoSet(ThreadInfo ti){
    return SharedObjectPolicy.getPolicy().getThreadInfoSet(ti, this);
  }

  
  @Override
  public boolean isObject(){
    return false;
  }

  @Override
  public boolean isArray(){
    return false;
  }
  
  @Override
  public boolean hasFinalizer() {
    return false;
  }
  
  @Override
  protected int getNumberOfFieldsOrElements(){
    // static fields can't be arrays, those are always heap objects
    return ci.getNumberOfStaticFields();
  }

  @Override
  public boolean hasChanged() {
    return (attributes & ATTR_ANY_CHANGED) != 0;
  }

  @Override
  public void markUnchanged() {
    attributes &= ~ATTR_ANY_CHANGED;
  }
  
  @Override
  public void hash(HashData hd) {
    super.hash(hd);
    hd.add(classObjectRef);
    hd.add(status);
  }

  @Override
  public boolean equals(Object o) {
    if (super.equals(o) && o instanceof StaticElementInfo) {
      StaticElementInfo other = (StaticElementInfo) o;

      if (classObjectRef != other.classObjectRef) {
        return false;
      }
      if (status != other.status) {
        return false;
      }

      return true;

    } else {
      return false;
    }
  }


  /**
  public boolean isShared() {
    // static fields are always thread global
    return true;
  }
  **/

  public int getStatus() {
    return status;
  }
  
  void setStatus (int newStatus) {
    checkIsModifiable();
    
    if (status != newStatus) {
      status = newStatus;
      attributes |= ATTR_STATUS_CHANGED;
    }
  }

  
  protected FieldInfo getDeclaredFieldInfo (String clsBase, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsBase); // <2do> should use CL argument
    FieldInfo fi = ci.getDeclaredStaticField(fname);
    
    if (fi == null) {
      throw new JPFException("class " + ci.getName() +
                                         " has no static field " + fname);
    }
    return fi;
  }

  public FieldInfo getFieldInfo (String fname) {
    ClassInfo ci = getClassInfo();
    return ci.getStaticField(fname);
  }
  
  protected void checkFieldInfo (FieldInfo fi) {
    if (getClassInfo() != fi.getClassInfo()) {
      throw new JPFException("wrong static FieldInfo : " + fi.getName()
          + " , no such field in class " + getClassInfo().getName());
    }
  }

  public int getNumberOfFields () {
    return getClassInfo().getNumberOfStaticFields();
  }
  
  public FieldInfo getFieldInfo (int fieldIndex) {
    return getClassInfo().getStaticField(fieldIndex);
  }
    
  /**
   * gc mark all objects stored in static reference fields
   */
  void markStaticRoot (Heap heap) {
    ClassInfo ci = getClassInfo();
    int n = ci.getNumberOfStaticFields();
    
    for (int i=0; i<n; i++) {
      FieldInfo fi = ci.getStaticField(i);
      if (fi.isReference()) {
        Conditional<Integer> objref = fields.getIntValue(fi.getStorageOffset());
        for (Integer ref : objref.toList()) {// TODO jens might be no good idea???
        	heap.markStaticRoot(ref);
        }
      }
    }
    
    // don't forget the class object itself (which is not a field)
    heap.markStaticRoot(classObjectRef);
  }
      
  public int getClassObjectRef () {
    return classObjectRef;
  }
  
  public void setClassObjectRef(int r) {
    checkIsModifiable();
    
    classObjectRef = r;
    attributes |= ATTR_COR_CHANGED;
  }

  public String toString() {
    return getClassInfo().getName(); // don't append objRef (useless and misleading for statics)
  }

  protected ElementInfo getReferencedElementInfo (FieldInfo fi){
    assert fi.isReference();
    Heap heap = VM.getVM().getHeap();
    return heap.get(getIntField(fi).getValue());
  }

}

