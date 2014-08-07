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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.JPFListener;

import java.util.Date;
import java.util.Locale;

import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;


/**
 * MJIEnv is the call environment for "native" methods, i.e. code that
 * is executed by the VM, not by JPF.
 *
 * Since library abstractions are supposed to be "user code", we provide
 * this class as a (little bit of) insulation towards the inner JPF workings.
 *
 * There are two APIs exported by this class. The public methods (like
 * getStringObject) don't expose JPF internals, and can be used from non
 * gov.nasa.jpf.vm NativePeer classes). The rest is package-default
 * and can be used to fiddle around as much as you like to (if you are in
 * the ..jvm package)
 *
 * Note that MJIEnv objects are now per-ThreadInfo (i.e. the variable
 * call envionment only includes MethodInfo and ClassInfo), which means
 * MJIEnv can be used in non-native methods (but only carefully, if you
 * don't need mi or ciMth).
 *
 * Note also this only works because we are not getting recursive in
 * native method calls. In fact, the whole DirectCallStackFrame / repeatTopInstruction
 * mechanism is there to turn logial recursion (JPF calling native, calling
 * JPF, calling native,..) into iteration. Otherwise we couldn't backtrack
 */
public class MJIEnv {
  public static final int NULL = 0;

  VM                     vm;
  ClassInfo               ciMth;  // the ClassInfo of the method this is called from
  MethodInfo              mi;
  ThreadInfo              ti;
  Heap                    heap;

  // those are various attributes set by the execution. note that
  // NativePeer.invoke never gets recursive in a roundtrip (at least if
  // used correctly, so we don't have to be afraid to overwrite any of these
  boolean                 repeat;
  Object                  returnAttr;

  // exception to be thrown upon return from native method
  // NOTE: this is only transient - don't expect this to be preserved over
  // transition boundaries
  int                     exceptionRef;

  protected MJIEnv (ThreadInfo ti) {
    this.ti = ti;

    // set those here so that we don't have an inconsistent state between
    // creation of an MJI object and the first native method call in
    // this thread (where any access to the heap or sa would bomb)
    vm = ti.getVM();
    heap = vm.getHeap();

    exceptionRef = NULL;
  }

  public MJIEnv() {
	// TODO Auto-generated constructor stub
}

public VM getVM () {
    return vm;
  }

  public JPF getJPF () {
    return vm.getJPF();
  }

  public boolean isBigEndianPlatform(){
    return vm.isBigEndianPlatform();
  }
  
  public void addListener (JPFListener l){
    vm.getJPF().addListener(l);
  }

  public void removeListener (JPFListener l){
    vm.getJPF().removeListener(l);
  }

  public Config getConfig() {
    return vm.getConfig();
  }

  public void gc() {
    heap.gc();
  }

  public void ignoreTransition () {
    getSystemState().setIgnored(true);
  }

  public boolean isArray (int objref) {
    return heap.get(objref).isArray();
  }

  public int getArrayLength (FeatureExpr ctx, int objref) {
    if (isArray(objref)) {
      return heap.get(objref).arrayLength();
    } else {
      throwException(ctx, "java.lang.IllegalArgumentException");

      return 0;
    }
  }

  public String getArrayType (int objref) {
    return heap.get(objref).getArrayType();
  }

  public int getArrayTypeSize (int objref) {
    return Types.getTypeSize(getArrayType(objref));
  }

  //=== various attribute accessors ============================================
  // we only support some attribute APIs here, since MJIEnv adds little value
  // other than hiding the ElementInfo access. If the client already has
  // an ElementInfo reference, it should use that one to retrieve/enumerate/set
  // attributes since this avoids repeated Heap.get() calls
  
  //--- object attributes

  public boolean hasObjectAttr (int objref){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.hasObjectAttr();
    }

    return false;
  }

  public boolean hasObjectAttr (int objref, Class<?> type){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.hasObjectAttr(type);
    }

    return false;    
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */  
  public Object getObjectAttr (int objref){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.getObjectAttr();
    }
    return null;
  }
  
  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setObjectAttr (int objref, Object a){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      ei.setObjectAttr(a);
    }
  }

  public void addObjectAttr (int objref, Object a){
    if (objref != NULL){
      ElementInfo ei = heap.getModifiable(objref);
      ei.addObjectAttr(a);
    }
  }

  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getObjectAttr (int objref, Class<T> attrType){
    ElementInfo ei = heap.get(objref);
    return ei.getObjectAttr(attrType);
  }
  
  //--- field attributes

  public boolean hasFieldAttr (int objref){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.hasFieldAttr();
    }

    return false;
  }
  
  public boolean hasFieldAttr (int objref, Class<?> type){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.hasFieldAttr(type);
    }

    return false;    
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */  
  public Object getFieldAttr (int objref, String fname){
    ElementInfo ei = heap.get(objref);
    FieldInfo fi = ei.getFieldInfo(fname);
    if (fi != null){
      return ei.getFieldAttr(fi);
    } else {
      throw new JPFException("no such field: " + fname);
    }
  }
  
  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setFieldAttr (int objref, String fname, Object a){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      FieldInfo fi = ei.getFieldInfo(fname);
      ei.setFieldAttr(fi, a);
    }
  }

  public void addFieldAttr (int objref, String fname, Object a){
    if (objref != NULL){
      ElementInfo ei = heap.getModifiable(objref);
      FieldInfo fi = ei.getFieldInfo(fname);
      ei.addFieldAttr(fi, a);
    }
  }

  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getFieldAttr (int objref, String fname, Class<T> attrType){
    ElementInfo ei = heap.get(objref);
    FieldInfo fi = ei.getFieldInfo(fname);
    if (fi != null){
      return ei.getFieldAttr(fi, attrType);
    } else {
      throw new JPFException("no such field: " + fname);
    }
  }

  
  //--- element attrs

  public boolean hasElementdAttr (int objref){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.hasElementAttr();
    }

    return false;
  }
  
  public boolean hasElementAttr (int objref, Class<?> type){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.hasElementAttr(type);
    }

    return false;    
  }

  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */  
  public Object getElementAttr (int objref, int idx){
    ElementInfo ei = heap.get(objref);
    return ei.getElementAttr(idx);
  }
  
  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setElementAttr (int objref, int idx, Object a){
    ElementInfo ei = heap.get(objref);
    ei.setElementAttr(idx, a);
  }

  public void addElementAttr (int objref, int idx, Object a){
    ElementInfo ei = heap.getModifiable(objref);
    ei.addElementAttr(idx, a);
  }

  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getElementAttr (int objref, int idx, Class<T> attrType){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      return ei.getElementAttr(idx, attrType);
    }
    return null;
  }

  

  // == end attrs ==  


  
  // the instance field setters
  public void setBooleanField (FeatureExpr ctx, int objref, String fname, Conditional<Boolean> val) {
    heap.getModifiable(objref).setBooleanField(ctx, fname, val);
  }

  public Conditional<Boolean> getBooleanField (int objref, String fname) {
    return heap.get(objref).getBooleanField(fname);
  }

  public Conditional<Boolean> getBooleanArrayElement (int objref, int index) {
    return heap.get(objref).getBooleanElement(index);
  }

  public void setBooleanArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Boolean> value) {
    heap.getModifiable(objref).setBooleanElement(ctx, index, value);
  }


  public void setByteField (FeatureExpr ctx, int objref, String fname, Conditional<Byte> val) {
    heap.getModifiable(objref).setByteField(ctx, fname, val);
  }

  public Conditional<Byte> getByteField (int objref, String fname) {
    return heap.get(objref).getByteField(fname);
  }

  public void setCharField (FeatureExpr ctx, int objref, String fname, Conditional<Character> val) {
    heap.getModifiable(objref).setCharField(ctx, fname, val);
  }

  public Conditional<Character> getCharField (int objref, String fname) {
    return heap.get(objref).getCharField(fname);
  }

  public void setDoubleField (FeatureExpr ctx, int objref, String fname, Conditional<Double> val) {
    heap.getModifiable(objref).setDoubleField(ctx, fname, val);
  }

  public Conditional<Double> getDoubleField (int objref, String fname) {
    return heap.get(objref).getDoubleField(fname);
  }

  public void setFloatField (FeatureExpr ctx, int objref, String fname, Conditional<Float> val) {
    heap.getModifiable(objref).setFloatField(ctx, fname, val);
  }

  public Conditional<Float> getFloatField (int objref, String fname) {
    return heap.get(objref).getFloatField(fname);
  }


  public void setByteArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Byte> value) {
    heap.getModifiable(objref).setByteElement(ctx, index, value);
  }

  public Conditional<Byte> getByteArrayElement (int objref, int index) {
    return heap.get(objref).getByteElement(index);
  }

  public void setCharArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Character> value) {
    heap.getModifiable(objref).setCharElement(ctx, index, value);
  }

  public void setIntArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Integer> value) {
    heap.getModifiable(objref).setIntElement(ctx, index, value);
  }

  public void setShortArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Short> value) {
    heap.getModifiable(objref).setShortElement(ctx, index, value);
  }

  public void setFloatArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Float> value) {
    heap.getModifiable(objref).setFloatElement(ctx, index, value);
  }

  public Conditional<Float> getFloatArrayElement (int objref, int index) {
    return heap.get(objref).getFloatElement(index);
  }

  public Conditional<Double> getDoubleArrayElement (int objref, int index) {
    return heap.get(objref).getDoubleElement(index);
  }
  public void setDoubleArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Double> value) {
    heap.getModifiable(objref).setDoubleElement(ctx, index, value);
  }

  public Conditional<Short> getShortArrayElement (int objref, int index) {
    return heap.get(objref).getShortElement(index);
  }

  public int getIntArrayElement (int objref, int index) {
    return heap.get(objref).getIntElement(index).getValue();// TODO jens
  }

  public Conditional<Character> getCharArrayElement (int objref, int index) {
    return heap.get(objref).getCharElement(index);
  }

  public void setIntField (FeatureExpr ctx, int objref, String fname, Conditional<Integer> val) {
    ElementInfo ei = heap.getModifiable(objref);
    ei.setIntField(ctx, fname, val);
  }

  // these two are the workhorses
  public void setDeclaredIntField (FeatureExpr ctx, int objref, String refType, String fname, Conditional<Integer> val) {
    ElementInfo ei = heap.getModifiable(objref);
    ei.setDeclaredIntField(ctx, fname, refType, val);
  }

  public Conditional<Integer> getIntField (int objref, String fname) {
    ElementInfo ei = heap.get(objref);
    return ei.getIntField(fname);
  }

  public int getDeclaredIntField (int objref, String refType, String fname) {
    ElementInfo ei = heap.get(objref);
    return ei.getDeclaredIntField(fname, refType);// TODO jens
  }

  // these two are the workhorses
  public void setDeclaredReferenceField (int objref, String refType, String fname, int val) {// TODO jens
    ElementInfo ei = heap.getModifiable(objref);
    ei.setDeclaredReferenceField(fname, refType, val);
  }

  public void setReferenceField (FeatureExpr ctx, int objref, String fname, int ref) {// TODO jens
     ElementInfo ei = heap.getModifiable(objref);
     ei.setReferenceField(ctx, fname, new One<>(ref));
  }

  public Conditional<Integer> getReferenceField (FeatureExpr ctx, int objref, String fname) {
    ElementInfo ei = heap.get(objref);
    return ei.getReferenceField(fname).simplify(ctx);// TODO jens
  }

  // we need this in case of a masked field
  public int getReferenceField (int objref, FieldInfo fi) {
    ElementInfo ei = heap.get(objref);
    return ei.getReferenceField(fi).simplify(null).getValue();// TODO jens
  }

  public String getStringField (FeatureExpr ctx, int objref, String fname){// TODO jens
    int ref = getReferenceField(ctx, objref, fname).getValue();
    return getStringObject(ctx, ref);
  }

  // the box object accessors (should probably test for the appropriate class)
  public Conditional<Boolean> getBooleanValue (int objref) {
    return getBooleanField(objref, "value");
  }

  public Conditional<Byte> getByteValue (int objref) {
    return getByteField(objref, "value");
  }

  public Conditional<Character> getCharValue (int objref) {
    return getCharField(objref, "value");
  }

  public Conditional<Short> getShortValue (int objref) {
    return getShortField(objref, "value");
  }

  public int getIntValue (int objref) {
    return getIntField(objref, "value").getValue();// TODO jens
  }

  public long getLongValue (int objref) {
    return getLongField(objref, "value").getValue();// TODO jens
  }

  public Conditional<Float> getFloatValue (int objref) {
    return getFloatField(objref, "value");
  }

  public Conditional<Double> getDoubleValue (int objref) {
    return getDoubleField(objref, "value");
  }


  public void setLongArrayElement (FeatureExpr ctx, int objref, int index, long value) {// TODO jens
    heap.getModifiable(objref).setLongElement(ctx, index, new One<>(value));
  }

  public Conditional<Long> getLongArrayElement (int objref, int index) {
    return heap.get(objref).getLongElement(index);
  }

  public void setLongField (FeatureExpr ctx, int objref, String fname, Conditional<Long> val) {
    ElementInfo ei = heap.getModifiable(objref);
    ei.setLongField(ctx, fname, val);
  }

//  public void setLongField (int objref, String refType, String fname, long val) {
//    ElementInfo ei = heap.get(objref);
//    ei.setLongField(fname, refType, val);
//  }

  public Conditional<Long> getLongField (int objref, String fname) {
    ElementInfo ei = heap.get(objref);
    return ei.getLongField(fname);
  }

//  public long getLongField (int objref, String refType, String fname) {
//    ElementInfo ei = heap.get(objref);
//    return ei.getLongField(fname, refType);
//  }

  public void setReferenceArrayElement (FeatureExpr ctx, int objref, int index, Conditional<Integer> eRef) {
    heap.getModifiable(objref).setReferenceElement(ctx, index, eRef);
  }

  public int getReferenceArrayElement (int objref, int index) {
    return heap.get(objref).getReferenceElement(index).getValue();// TODO jens
  }

  public void setShortField (FeatureExpr ctx, int objref, String fname, Conditional<Short> val) {
    setIntField(ctx, objref, fname, /*(int)*/ val.map(new Function<Short, Integer>() {

		@Override
		public Integer apply(Short v) {
			return (int)v.shortValue();
		}
    	
    }));
  }

  public Conditional<Short> getShortField (int objref, String fname) {
    return getIntField(objref, fname).map(new Function<Integer, Short>() {

		@Override
		public Short apply(Integer v) {
			return (short)v.intValue();
		}
    	
    });
  }

  public String getTypeName (int objref) {
    return heap.get(objref).getType();
  }

  public boolean isInstanceOf (int objref, String clsName) {
    ClassInfo ci = getClassInfo(objref);
    return ci.isInstanceOf(clsName);
  }

  //--- the static field accessors
  // NOTE - it is the callers responsibility to ensure the class is
  // properly initialized, since calling <clinit> requires a roundtrip
  // (i.e. cannot be done synchronously from one of the following methods)
  
  // <2do> this uses the current system CL, we should probably use an explicit CL argument
  
  public void setStaticBooleanField (FeatureExpr ctx, String clsName,
                                     String fname, Conditional<Boolean> value) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    ci.getStaticElementInfo().setBooleanField(ctx, fname, value);
  }
  public void setStaticBooleanField (FeatureExpr ctx, int clsObjRef, String fname, Conditional<Boolean> val) {
    ElementInfo cei = getStaticElementInfo(clsObjRef);
    cei.setBooleanField(ctx, fname, val);
  }
  
  public Conditional<Boolean> getStaticBooleanField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getBooleanField(fname);
  }

  public void setStaticByteField (FeatureExpr ctx, String clsName, String fname, Conditional<Byte> value) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    ci.getStaticElementInfo().setByteField(ctx, fname, value);  
    }

  public Conditional<Byte> getStaticByteField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getByteField(fname);
  }

  public void setStaticCharField (FeatureExpr ctx, String clsName, String fname, Conditional<Character> value) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    ci.getStaticElementInfo().setCharField(ctx, fname, value);  
    }

  public Conditional<Character> getStaticCharField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getCharField(fname);
  }

  public void setStaticDoubleField (FeatureExpr ctx, String clsName, String fname, Conditional<Double> val) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    ci.getStaticElementInfo().setDoubleField(ctx, fname, val);
  }

  public Conditional<Double> getStaticDoubleField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getDoubleField(fname);
  }
  
  public Conditional<Double> getStaticDoubleField (int clsObjRef, String fname) {
    ElementInfo cei = getStaticElementInfo(clsObjRef);
    return cei.getDoubleField(fname);
  }

  public Conditional<Double> getStaticDoubleField (ClassInfo ci, String fname) {
    ElementInfo ei = ci.getStaticElementInfo();
    return ei.getDoubleField(fname);
  }
  
  public void setStaticFloatField (FeatureExpr ctx, String clsName, String fname, Conditional<Float> val) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    ci.getStaticElementInfo().setFloatField(ctx, fname, val);
  }

  public Conditional<Float> getStaticFloatField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getFloatField(fname);
  }

  public void setStaticIntField (FeatureExpr ctx, String clsName, String fname, Conditional<Integer> val) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    ci.getStaticElementInfo().setIntField(ctx, fname, val);
  }

  public void setStaticIntField (FeatureExpr ctx, int clsObjRef, String fname, Conditional<Integer> val) {
    ElementInfo cei = getStaticElementInfo(clsObjRef);
    cei.setIntField(ctx, fname, val);
  }

  public int getStaticIntField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getIntField(fname).simplify(null).getValue();// TODO jens
  }
  
  public int getStaticIntField (int clsObjRef, String fname) {
    ElementInfo cei = getStaticElementInfo(clsObjRef);
    return cei.getIntField(fname).simplify(null).getValue();// TODO jens
  }

  public int getStaticIntField (ClassInfo ci, String fname) {
    ElementInfo ei = ci.getStaticElementInfo();
    return ei.getIntField(fname).simplify(null).getValue();// TODO jens
  }

  public void setStaticLongField (FeatureExpr ctx, String clsName, String fname, Conditional<Long> value) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    ci.getStaticElementInfo().setLongField(ctx, fname, value);
  }

  public void setStaticLongField (FeatureExpr ctx, int clsObjRef, String fname, Conditional<Long> val) {
    ElementInfo cei = getModifiableStaticElementInfo(clsObjRef);
    cei.setLongField(ctx, fname, val);
  }

  public long getStaticLongField (int clsRef, String fname) {
    ClassInfo ci = getReferredClassInfo(FeatureExprFactory.True(), clsRef);// TODO jens
    return getStaticLongField(ci,fname);
  }

  public long getStaticLongField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return getStaticLongField(ci, fname);
  }

  public long getStaticLongField (ClassInfo ci, String fname){
    ElementInfo ei = ci.getStaticElementInfo();
    return ei.getLongField(fname).getValue();// TODO jens
  }

  public void setStaticReferenceField (FeatureExpr ctx, String clsName, String fname, int objref) {// TODO jens
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);

    // <2do> - we should REALLY check for type compatibility here
    ci.getModifiableStaticElementInfo().setReferenceField(ctx, fname, new One<>(objref));
  }

  public void setStaticReferenceField (int clsObjRef, String fname, int objref) {
    ElementInfo cei = getModifiableStaticElementInfo(clsObjRef);

    // <2do> - we should REALLY check for type compatibility here
    cei.setReferenceField(null, fname, new One<>(objref));// TODO jens
  }

  public int getStaticReferenceField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getReferenceField(fname).getValue();// TODO jens
  }

  public int getStaticReferenceField (int clsObjRef, String fname) {
    ElementInfo cei = getStaticElementInfo(clsObjRef);
    return cei.getReferenceField(fname).getValue();// TODO jens
  }

  public int getStaticReferenceField (ClassInfo ci, String fname){
    return ci.getStaticElementInfo().getReferenceField(fname).getValue();// TODO jens
  }

  public Conditional<Short> getStaticShortField (String clsName, String fname) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    return ci.getStaticElementInfo().getShortField(fname);
  }

  public Conditional<char[]> getStringChars (int objRef){
    if (objRef != MJIEnv.NULL) {
      ElementInfo ei = getElementInfo(objRef);
      return ei.getStringChars();
      
    } else {
      return null;
    }
    
  }
  
  /**
   * turn JPF String object into a VM String object
   * (this is a method available for non gov..jvm NativePeer classes)
   */
  public String getStringObject (FeatureExpr ctx, int objRef) {
    if (objRef != MJIEnv.NULL) {
      ElementInfo ei = getElementInfo(objRef);
      
      Conditional<String> str = ei.asString();
      return str.simplify(ctx).getValue();
      
    } else {
      return null;
    }
  }
  
  public Conditional<String> getConditionalStringObject (int objRef) {
	  if (objRef != MJIEnv.NULL) {
	      ElementInfo ei = getElementInfo(objRef);
	      return ei.asString();
	      
	    } else {
	      return new One<>(null);
	    }  
  }

  public String[] getStringArrayObject (FeatureExpr ctx, int aRef){
    String[] sa = null;
     
    if (aRef == NULL) return sa;

    ClassInfo aci = getClassInfo(aRef);
    if (aci.isArray()){
      ClassInfo eci = aci.getComponentClassInfo();
      if (eci.getName().equals("java.lang.String")){
        int len = getArrayLength(ctx, aRef);
        sa = new String[len];

        for (int i=0; i<len; i++){
          int sRef = getReferenceArrayElement(aRef,i);
          sa[i] = getStringObject(ctx, sRef);
        }

        return sa;
        
      } else {
        throw new IllegalArgumentException("not a String[] array: " + aci.getName());
      }
    } else {
      throw new IllegalArgumentException("not an array reference: " + aci.getName());
    }
  }
  
  public Date getDateObject (int objref) {
    if (objref != MJIEnv.NULL) {
      ElementInfo ei = getElementInfo(objref);
      if (ei.getClassInfo().getName().equals("java.util.Date")) {
        // <2do> this is not complete yet
        long fastTime = ei.getLongField("fastTime").getValue();
        Date d = new Date(fastTime);
        return d;
      } else {
        throw new JPFException("not a Date object reference: " + ei);
      }
    } else {
      return null;
    }
    
  }

  public Object[] getArgumentArray (FeatureExpr ctx, int argRef) {
    Object[] args = null;
    if (argRef == NULL) return args;

    int nArgs = getArrayLength(ctx, argRef);
    args = new Object[nArgs];

    for (int i=0; i<nArgs; i++){
      int aref = getReferenceArrayElement(argRef,i);
      ClassInfo ci = getClassInfo(aref);
      String clsName = ci.getName();
      if (clsName.equals("java.lang.Boolean")){
        args[i] = Boolean.valueOf(getBooleanField(aref,"value").getValue());
      } else if (clsName.equals("java.lang.Integer")){
        args[i] = getIntField(aref,"value").getValue();
      } else if (clsName.equals("java.lang.Double")){
        args[i] = Double.valueOf(getDoubleField(aref,"value").getValue());
      } else if (clsName.equals("java.lang.String")){
        args[i] = getStringObject(ctx, aref);
      }
    }

    return args;
  }

  public Boolean getBooleanObject (int objref){
    return Boolean.valueOf(getBooleanField(objref, "value").getValue());// TODO jens
  }

  public Conditional<Byte> getByteObject (int objref){
    return getByteField(objref, "value");
  }

  public Character getCharObject (int objref){
    return new Character(getCharField(objref, "value").getValue());// TODO jens
  }

  public Short getShortObject (int objref){
    return new Short(getShortField(objref, "value").getValue());// TODO jens
  }

  public Integer getIntegerObject (int objref){
    return getIntField(objref, "value").getValue();// TODO jens
  }

  public Long getLongObject (int objref){
    return getLongField(objref, "value").getValue();// TODO jens
  }

  public Float getFloatObject (int objref){
    return new Float(getFloatField(objref, "value").getValue());// TODO jens
  }

  public Double getDoubleObject (int objref){
    return new Double(getDoubleField(objref, "value").getValue());// TODO jens
  }

  // danger - the returned arrays could be used to modify contents of stored objects

  public byte[] getByteArrayObject (FeatureExpr ctx, int objref) {// TODO jens
    ElementInfo ei = getElementInfo(objref);
    Conditional<Byte>[] ba = ei.asByteArray();

    byte[] a = new byte[ba.length];
    for (int i = 0; i < ba.length; i++) {
    	a[i]= ba[i].simplify(ctx).getValue();
    }
    return a;
  }

  public Conditional<char[]> getCharArrayObject (int objref) {
    ElementInfo ei = getElementInfo(objref);
    return ei.asCharArray();
  }

  public Conditional<Short>[] getShortArrayObject (int objref) {
    ElementInfo ei = getElementInfo(objref);
    return ei.asShortArray();
  }

  public int[] getIntArrayObject (FeatureExpr ctx, int objref) {// TODO jens
    ElementInfo ei = getElementInfo(objref);
    Conditional<Integer>[] array = ei.asIntArray();
    int[] a = new int[array.length];
    for (int i = 0; i < array.length; i++) {
    	a[i] = array[i].simplify(ctx).getValue();
    }
    return a;
  }

  public Conditional<Long>[] getLongArrayObject (int objref) {
    ElementInfo ei = getElementInfo(objref);
    Conditional<Long>[] a = ei.asLongArray();

    return a;
  }

  public Conditional<Float>[] getFloatArrayObject (int objref) {
    ElementInfo ei = getElementInfo(objref);
    Conditional<Float>[] a = ei.asFloatArray();

    return a;
  }

  public Conditional<Double>[] getDoubleArrayObject (int objref) {
    ElementInfo ei = getElementInfo(objref);
    if (ei == null) {
    	System.out.println("MJIEnv.getDoubleArrayObject(" + objref +  ")");
    }
    return ei.asDoubleArray();

  }

  public Conditional<Boolean>[] getBooleanArrayObject (int objref) {
    ElementInfo ei = getElementInfo(objref);
    Conditional<Boolean>[] a = ei.asBooleanArray();

    return a;
  }
  
  public Conditional<Integer>[] getReferenceArrayObject (int objref){
    ElementInfo ei = getElementInfo(objref);
    Conditional<Integer>[] a = ei.asReferenceArray();

    return a;    
  }
  
  /**
   * NOTE - this call might change the corresponding ElementInfo instance,
   * don't use after obtaining the ElementInfo in the caller !
   */
  public boolean isSchedulingRelevantObject(int objref){
    if (objref != NULL){
      ElementInfo ei = heap.get(objref);
      ei = ei.getInstanceWithUpdatedSharedness(ti);
      return ei.isShared();
    }

    return false;
  }

  public boolean canLock (int objref) {
    ElementInfo ei = getElementInfo(objref);

    return ei.canLock(ti);
  }

  public int newBooleanArray (int size) {// TODO jens
    return heap.newArray(FeatureExprFactory.True(), "Z", size, ti).getObjectRef();
  }

  public int newByteArray (int size) {// TODO jens
    return heap.newArray(FeatureExprFactory.True(), "B", size, ti).getObjectRef();
  }

  public int newByteArray (FeatureExpr ctx, byte[] buf){// TODO jens
    ElementInfo eiArray = heap.newArray(ctx, "B", buf.length, ti);
    for (int i=0; i<buf.length; i++){
      eiArray.setByteElement( ctx, i, new One<>(buf[i]));
    }
    return eiArray.getObjectRef();
  }

  public int newCharArray (FeatureExpr ctx, int size) {// TODO jens
    return heap.newArray(ctx, "C", size, ti).getObjectRef();
  }

  public int newCharArray (FeatureExpr ctx, char[] buf){// TODO jens
    ElementInfo eiArray = heap.newArray(ctx, "C", buf.length, ti);
    for (int i=0; i<buf.length; i++){
      eiArray.setCharElement(ctx, i, new One<>(buf[i]));
    }
    return eiArray.getObjectRef();
  }

  public int newShortArray (int size) {// TODO jens
    return heap.newArray(FeatureExprFactory.True(), "S", size, ti).getObjectRef();
  }
  
  public int newShortArray (FeatureExpr ctx, short[] buf){// TODO jens
    ElementInfo eiArray = heap.newArray(FeatureExprFactory.True(), "S", buf.length, ti);
    for (int i=0; i<buf.length; i++){
      eiArray.setShortElement(ctx, i, new One<>(buf[i]));
    }
    return eiArray.getObjectRef();
  }

  public int newDoubleArray (int size) {// TODO jens
    return heap.newArray(FeatureExprFactory.True(), "D", size, ti).getObjectRef();
  }

  public int newDoubleArray (FeatureExpr ctx, double[] buf){
    ElementInfo eiArray =  heap.newArray(ctx, "D", buf.length, ti);
    for (int i=0; i<buf.length; i++){
      eiArray.setDoubleElement(ctx, i, new One<>(buf[i]));
    }
    return eiArray.getObjectRef();
  }

  public int newFloatArray (int size) {// TODO jens
    return heap.newArray(FeatureExprFactory.True(), "F", size, ti).getObjectRef();
  }
  
  public int newFloatArray (float[] buf){// TODO jens
    ElementInfo eiArray =  heap.newArray(FeatureExprFactory.True(), "F", buf.length, ti);
    for (int i=0; i<buf.length; i++){
      eiArray.setFloatElement(FeatureExprFactory.True(), i, new One<>(buf[i]));
    }
    return eiArray.getObjectRef();
  }

  public int newIntArray (int size) {// TODO jens
    return heap.newArray(FeatureExprFactory.True(), "I", size, ti).getObjectRef();
  }

  public int newIntArray (FeatureExpr ctx, int[] buf){// TODO jens
    ElementInfo eiArray = heap.newArray(ctx, "I", buf.length, ti);
    for (int i=0; i<buf.length; i++){
      eiArray.setIntElement( ctx, i, new One<>(buf[i]));
    }
    return eiArray.getObjectRef();
  }

  public int newLongArray (int size) {// TODO jens
    return heap.newArray(FeatureExprFactory.True(), "J", size, ti).getObjectRef();
  }

  public int newLongArray (long[] buf){// TODO jens
    ElementInfo eiArray = heap.newArray(null, "J", buf.length, ti);
    for (int i=0; i<buf.length; i++){
      eiArray.setLongElement( null, i, new One<>(buf[i]));
    }
    return eiArray.getObjectRef();
  }

  public int newObjectArray (String elementClsName, int size) {// TODO jens
    if (!elementClsName.endsWith(";")) {
      elementClsName = Types.getTypeSignature(elementClsName, false);
    }

    return heap.newArray(FeatureExprFactory.True(), elementClsName, size, ti).getObjectRef();
  }
  
  /**
   * check if the ClassInfo is properly initialized
   * if yes, create a new instance of it but don't call any ctor
   * if no, throw a ClinitRequired exception
   */
  public int newObject (FeatureExpr ctx, ClassInfo ci) {
    if (ci.pushRequiredClinits(ctx, ti)){
      throw new ClinitRequired(ci);
    }
    
    ElementInfo ei = heap.newObject(ctx, ci, ti);
    return ei.getObjectRef();
  }

  /**
   * this creates a new object without checking if the ClassInfo needs
   * initialization. This is useful in a context that already
   * is aware and handles re-execution
   */
  public int newObjectOfUncheckedClass (FeatureExpr ctx, ClassInfo ci){
    ElementInfo ei = heap.newObject(ctx, ci, ti);
    return ei.getObjectRef();    
  }
  
  public int newObject (FeatureExpr ctx, String clsName) {
    ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
    if (ci != null){
      return newObject(ctx, ci);
    } else {
      return NULL;
    }
  }
  
  @Deprecated
  public int newString (FeatureExpr ctx, String s) {// TODO jens remove
	  return newString(ctx, new One<>(s));
  }
  
  public int newString (FeatureExpr ctx, Conditional<String> s) {
    if (s instanceof One && s.getValue() == null){
      return NULL;
    } else {
      return heap.newString(ctx, s, ti).getObjectRef();
    }
  }

  public int newStringArray (FeatureExpr ctx, String[] a){
    int aref = newObjectArray("Ljava/lang/String;", a.length);

    for (int i=0; i<a.length; i++){
      setReferenceArrayElement(ctx, aref, i, new One<>(newString(FeatureExprFactory.True(), new One<>(a[i]))));
    }

    return aref;
  }

  public int newString (int arrayRef) {// TODO jens
    String t = getArrayType(arrayRef);
    String s = null;

    if ("C".equals(t)) {          // character array
      char[] ca = getCharArrayObject(arrayRef).getValue();
      s = new String(ca);
    } else if ("B".equals(t)) {   // byte array
      byte[] ba = getByteArrayObject(null, arrayRef);
      s = new String(ba);
    }

    if (s == null) {
      return NULL;
    }

    return newString(FeatureExprFactory.True(), new One<>(s));
  }

  public String format (FeatureExpr ctx, int fmtRef, int argRef){
    String format = getStringObject(ctx, fmtRef);
    int len = getArrayLength(ctx, argRef);
    Object[] arg = new Object[len];

    for (int i=0; i<len; i++){
      int ref = getReferenceArrayElement(argRef,i);
      if (ref != NULL) {
        String clsName = getClassName(ref);
        if (clsName.equals("java.lang.String")) {
          arg[i] = getStringObject(ctx, ref);
        } else if (clsName.equals("java.lang.Byte")) {
          arg[i] = getByteObject(ref);
        } else if (clsName.equals("java.lang.Char")) {
          arg[i] = getCharObject(ref);
        } else if (clsName.equals("java.lang.Short")) {
          arg[i] = getShortObject(ref);
        } else if (clsName.equals("java.lang.Integer")) {
          arg[i] = getIntegerObject(ref);
        } else if (clsName.equals("java.lang.Long")) {
          arg[i] = getLongObject(ref);
        } else if (clsName.equals("java.lang.Float")) {
          arg[i] = getFloatObject(ref);
        } else if (clsName.equals("java.lang.Double")) {
          arg[i] = getDoubleObject(ref);
        } else {
          // need a toString() here
          arg[i] = "??";
        }
      }
    }

    return String.format(format,arg);
  }

  public String format (FeatureExpr ctx,Locale l, int fmtRef, int argRef){
	    String format = getStringObject(ctx, fmtRef);
	    int len = getArrayLength(ctx, argRef);
	    Object[] arg = new Object[len];

	    for (int i=0; i<len; i++){
	      int ref = getReferenceArrayElement(argRef,i);
	      if (ref != NULL) {
	        String clsName = getClassName(ref);
	        if (clsName.equals("java.lang.String")) {
	          arg[i] = getStringObject(ctx, ref);
	        } else if (clsName.equals("java.lang.Byte")) {
	          arg[i] = getByteObject(ref);
	        } else if (clsName.equals("java.lang.Char")) {
	          arg[i] = getCharObject(ref);
	        } else if (clsName.equals("java.lang.Short")) {
	          arg[i] = getShortObject(ref);
	        } else if (clsName.equals("java.lang.Integer")) {
	          arg[i] = getIntegerObject(ref);
	        } else if (clsName.equals("java.lang.Long")) {
	          arg[i] = getLongObject(ref);
	        } else if (clsName.equals("java.lang.Float")) {
	          arg[i] = getFloatObject(ref);
	        } else if (clsName.equals("java.lang.Double")) {
	          arg[i] = getDoubleObject(ref);
	        } else {
	          // need a toString() here
	          arg[i] = "??";
	        }
	      }
	    }

	    return String.format(l,format,arg);
	  }


  public int newBoolean (boolean b){// TODO jens
    return getStaticReferenceField("java.lang.Boolean", b ? "TRUE" : "FALSE");
  }

  public int newInteger (FeatureExpr ctx, Conditional<Integer> n){
    ElementInfo ei = heap.newObject(ctx, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Integer"), ti);
    ei.setIntField(ctx, "value",n);
    return ei.getObjectRef();
  }

  public int newLong (FeatureExpr ctx, Conditional<Long> l){
    ElementInfo ei = heap.newObject(ctx, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Long"), ti);
    ei.setLongField(ctx, "value", l);
    return ei.getObjectRef();
  }

  public int newDouble (FeatureExpr ctx, Conditional<Double> d){
    ElementInfo ei = heap.newObject(ctx, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Double"), ti);
    ei.setDoubleField(ctx,"value", d);
    return ei.getObjectRef();
  }

  public int newFloat (FeatureExpr ctx, Conditional<Float> f){
    ElementInfo ei = heap.newObject(null, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Float"), ti);
    ei.setFloatField(ctx,"value", f);
    return ei.getObjectRef();
  }

  public int newByte (FeatureExpr ctx, Conditional<Byte> b){
    ElementInfo ei = heap.newObject(ctx, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Byte"), ti);
    ei.setByteField(ctx,"value", b);
    return ei.getObjectRef();
  }

  public int newShort (FeatureExpr ctx, Conditional<Short> s){
    ElementInfo ei = heap.newObject(null, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Short"), ti);
    ei.setShortField(ctx,"value", s);
    return ei.getObjectRef();
  }

  public int newCharacter (FeatureExpr ctx, Conditional<Character> c){
    ElementInfo ei =  heap.newObject(ctx, ClassLoaderInfo.getSystemResolvedClassInfo("java.lang.Character"), ti);
    ei.setCharField(ctx, "value", c);
    return ei.getObjectRef();
  }


  public void notify (FeatureExpr ctx, int objref) {
    // objref can't be NULL since the corresponding INVOKE would have failed
    ElementInfo ei = getModifiableElementInfo(objref);
    notify(ctx, ei);
  }

  public void notify (FeatureExpr ctx, ElementInfo ei) {
    if (!ei.isLockedBy(ti)){
      throwException(ctx,
                                 "java.lang.IllegalMonitorStateException", "un-synchronized notify");
      return;
    }

    ei.notifies(getSystemState(), ti); 
  }
  
  public void notifyAll (FeatureExpr ctx, int objref) {
    // objref can't be NULL since the corresponding INVOKE would have failed
    ElementInfo ei = getElementInfo(objref);
    notifyAll(ctx, ei);
  }

  public void notifyAll (FeatureExpr ctx, ElementInfo ei) {
    if (!ei.isLockedBy(ti)){
      throwException(ctx,
                                 "java.lang.IllegalMonitorStateException", "un-synchronized notifyAll");
      return;
    }

    ei.notifiesAll();    
  }
  
  public void registerPinDown(int objref){
    vm.getHeap().registerPinDown(objref);
  }

  public void releasePinDown(int objref){
    vm.getHeap().releasePinDown(objref);
  }
  
  /**
   *  use this whenever a peer performs an operation on a class that might not be initialized yet
   *  Do a repeatInvocation() in this case 
   */
  public boolean requiresClinitExecution(FeatureExpr ctx, ClassInfo ci) {
    return ci.pushRequiredClinits(ctx, ti);
  }
  
  /**
   * repeat execution of the instruction that caused a native method call
   * NOTE - this does NOT mean it's the NEXT executed insn, since the native method
   * might have pushed direct call frames on the stack before asking us to repeat it.
   */
  public void repeatInvocation () {
    repeat = true;
  }

  public boolean isInvocationRepeated() {
    return repeat;
  }


  public boolean setNextChoiceGenerator (ChoiceGenerator<?> cg){
    return vm.getSystemState().setNextChoiceGenerator(cg);
  }

  public void setMandatoryNextChoiceGenerator(ChoiceGenerator<?> cg, String failMsg){
    vm.getSystemState().setMandatoryNextChoiceGenerator(cg, failMsg);
  }

  public SchedulerFactory getSchedulerFactory(){
    return vm.getSchedulerFactory();
  }

  public ChoiceGenerator<?> getChoiceGenerator () {
    return vm.getSystemState().getChoiceGenerator();
  }

  // note this only makes sense if we actually do return something
  public void setReturnAttribute (Object attr) {
    returnAttr = attr;
  }

  /**
   * return attr list of all arguments. Use ObjectList to retrieve values
   * from this list
   * 
   * NOTE - this can only be called from a native method context, since
   * otherwise the top frame is the callee
   */
  public Object[] getArgAttributes () {
    StackFrame caller = getCallerStackFrame();
    return caller.getArgumentAttrs(mi);
  }

  public Object getReturnAttribute() {
    return returnAttr;
  }

  // if any of the next methods is called from the bottom
  // half of a CG method, you might want to check if another thread
  // or a listener has already set an exception you don't want to override
  // (this is for instance used in Thread.stop())

  public void throwException (int xRef){
    assert isInstanceOf(xRef, "java.lang.Throwable");
    exceptionRef = xRef;
  }

  public void throwException (FeatureExpr ctx, String clsName) {
    ClassInfo ciX = ClassInfo.getInitializedClassInfo(null, clsName, ti);
    assert ciX.isInstanceOf("java.lang.Throwable");
    exceptionRef = ti.createException(ctx, ciX, null, NULL);
  }

  public void throwException (FeatureExpr ctx, String clsName, String details) {
    ClassInfo ciX = ClassInfo.getInitializedClassInfo(ctx, clsName, ti);
    assert ciX.isInstanceOf("java.lang.Throwable");
    exceptionRef = ti.createException(ctx, ciX, details, NULL);
  }

  public void throwAssertion (FeatureExpr ctx, String details) {
    throwException(ctx, "java.lang.AssertionError", details);
  }

  public void throwInterrupt(FeatureExpr ctx){
    throwException(ctx, "java.lang.InterruptedException");
  }

  public void stopThread(FeatureExpr ctx){
    stopThreadWithException(ctx, MJIEnv.NULL);
  }

  public void stopThreadWithException (FeatureExpr ctx, int xRef){
    // this will call throwException(xRef) with the proper Throwable
    ti.setStopped(ctx, xRef);
  }

  void setCallEnvironment (MethodInfo mi) {
    this.mi = mi;

    if (mi != null){
      ciMth = mi.getClassInfo();
    } else {
      //ciMth = null;
      //mi = null;
    }

    repeat = false;
    returnAttr = null;

    // we should NOT reset exceptionRef here because it might have been set
    // at the beginning of the transition. It gets reset upon return from the
    // native method
    //exceptionRef = NULL;
  }

  void clearCallEnvironment () {
    setCallEnvironment(null);
  }

  ElementInfo getStaticElementInfo (int clsObjRef) {
    ClassInfo ci = getReferredClassInfo( FeatureExprFactory.True(), clsObjRef);
    if (ci != null) {
      return ci.getStaticElementInfo();
    }
    
    return null;
  }
  
  ElementInfo getModifiableStaticElementInfo (int clsObjRef) {
    ClassInfo ci = getReferredClassInfo( FeatureExprFactory.True(), clsObjRef);
    if (ci != null) {
      return ci.getModifiableStaticElementInfo();
    }
    
    return null;
  }
  

  ClassInfo getClassInfo () {
    return ciMth;
  }

  public ClassInfo getReferredClassInfo (FeatureExpr ctx, int clsObjRef) {
    ElementInfo ei = getElementInfo(clsObjRef);
    if (ei.getClassInfo().getName().equals("java.lang.Class")) {
      int ciId = ei.getIntField( ClassInfo.ID_FIELD).simplify(ctx).getValue();
      int clref = ei.getReferenceField("classLoader").getValue();
      
      ElementInfo eiCl = getElementInfo(clref);
      int cliId = eiCl.getIntField(ClassLoaderInfo.ID_FIELD).simplify(ctx).getValue();
      
      ClassLoaderInfo cli = getVM().getClassLoader(cliId);
      ClassInfo referredCi = cli.getClassInfo(ciId);
      
      return referredCi;
      
    } else {
      throw new JPFException("not a java.lang.Class object: " + ei);
    }
  }

  public ClassInfo getClassInfo (int objref) {
    ElementInfo ei = getElementInfo(objref);
    if (ei != null){
      return ei.getClassInfo();
    } else {
      return null;
    }
  }

  public String getClassName (int objref) {
    return getClassInfo(objref).getName();
  }

  public Heap getHeap () {
    return vm.getHeap();
  }

  public ElementInfo getElementInfo (int objref) {
    return heap.get(objref);
  }

  public ElementInfo getModifiableElementInfo (int objref) {
    return heap.getModifiable(objref);
  }

  
  public int getStateId () {
    return VM.getVM().getStateId();
  }

  void clearException(){
    exceptionRef = MJIEnv.NULL;
  }

  public int peekException () {
    return exceptionRef;
  }

  public int popException () {
    int ret = exceptionRef;
    exceptionRef = NULL;
    return ret;
  }

  public boolean hasException(){
    return (exceptionRef != NULL);
  }

  public boolean hasPendingInterrupt(){
    return (exceptionRef != NULL && isInstanceOf(exceptionRef, "java.lang.InterruptedException"));
  }

  //-- time is managed by the VM
  public long currentTimeMillis(){
    return vm.currentTimeMillis();
  }
  
  public long nanoTime(){
    return vm.nanoTime();
  }
  
  //--- those are not public since they refer to JPF internals
  public KernelState getKernelState () {
    return VM.getVM().getKernelState();
  }

  public MethodInfo getMethodInfo () {
    return mi;
  }

  public Instruction getInstruction () {
    return ti.getPC().getValue();
  }

  /**
   * It returns the ClassLoaderInfo corresponding to the given classloader object
   * reference
   */
  public ClassLoaderInfo getClassLoaderInfo(int clObjRef) {
    if(clObjRef == MJIEnv.NULL) {
      return null;
    }

    int cliId = heap.get(clObjRef).getIntField(ClassLoaderInfo.ID_FIELD).getValue();
    return getVM().getClassLoader(cliId);
  }

  // <2do> that's not correct - it should return the current SystemClassLoader, NOT the startup SystemClassLoader
  // (we can instantiate them explicitly)
  public ClassLoaderInfo getSystemClassLoaderInfo() {
    return ti.getSystemClassLoaderInfo();
  }
  
  public SystemState getSystemState () {
    return ti.getVM().getSystemState();
  }

  public ThreadInfo getThreadInfo () {
    return ti;
  }

  /**
   * NOTE - callers have to be prepared this might return null in case
   * the thread got already terminated
   */
  public ThreadInfo getThreadInfoForId (int id){
    return vm.getThreadList().getThreadInfoForId(id);
  }

  public ThreadInfo getLiveThreadInfoForId (int id){
    ThreadInfo ti = vm.getThreadList().getThreadInfoForId(id);
    if (ti != null && ti.isAlive()){
      return ti;
    }
    
    return null;
  }
  
  /**
   * NOTE - callers have to be prepared this might return null in case
   * the thread got already terminated
   */
  public ThreadInfo getThreadInfoForObjRef (int id){
    return vm.getThreadList().getThreadInfoForObjRef(id);
  }
  
  public ThreadInfo getLiveThreadInfoForObjRef (int id){
    ThreadInfo ti = vm.getThreadList().getThreadInfoForObjRef(id);
    if (ti != null && ti.isAlive()){
      return ti;
    }
    
    return null;
  }

  
  
  public ThreadInfo[] getLiveThreads(){
    return getVM().getLiveThreads();
  }
  
  // <2do> - naming? not very intuitive
  void lockNotified (int objref) {
    ElementInfo ei = getModifiableElementInfo(objref);
    ei.lockNotified(ti);
  }

  void initAnnotationProxyField (FeatureExpr ctx, int proxyRef, FieldInfo fi, Object v) throws ClinitRequired {
    String fname = fi.getName();
    String ftype = fi.getType();

    if (v instanceof String){
      setReferenceField(ctx, proxyRef, fname, newString(FeatureExprFactory.True(), new One<>((String)v)));
    } else if (v instanceof Boolean){
      setBooleanField(ctx, proxyRef, fname, new One<>(((Boolean)v).booleanValue()));
    } else if (v instanceof Integer){
      setIntField(ctx, proxyRef, fname, new One<>(((Integer)v).intValue()));
    } else if (v instanceof Long){
      setLongField(ctx, proxyRef, fname, new One<>(((Long)v).longValue()));
    } else if (v instanceof Float){
      setFloatField(ctx, proxyRef, fname, new One<>(((Float)v).floatValue()));
    } else if (v instanceof Short){
      setShortField(ctx, proxyRef, fname, new One<>(((Short)v).shortValue()));
    } else if (v instanceof Character){
      setCharField(ctx, proxyRef, fname, new One<>(((Character)v).charValue()));
    } else if (v instanceof Byte){
      setByteField(ctx, proxyRef, fname, new One<>(((Byte)v).byteValue()));
    } else if (v instanceof Double){
      setDoubleField(ctx, proxyRef, fname, new One<>(((Double)v).doubleValue()));

    } else if (v instanceof AnnotationInfo.EnumValue){ // an enum constant
      AnnotationInfo.EnumValue ev = (AnnotationInfo.EnumValue)v;
      String eCls = ev.getEnumClassName();
      String eConst = ev.getEnumConstName();

      ClassInfo eci = ClassLoaderInfo.getCurrentResolvedClassInfo(eCls);
      if (!eci.isInitialized()){
        throw new ClinitRequired(eci);
      }

      StaticElementInfo sei = eci.getStaticElementInfo();
      int eref = sei.getReferenceField(eConst).getValue();
      setReferenceField(ctx, proxyRef, fname, eref);

    } else if (v instanceof AnnotationInfo.ClassValue){ // a class
      String clsName = v.toString();
      ClassInfo cci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
      // <2do> should throw ClassNotFoundError here if cci is null

      if (!cci.isInitialized()){
        throw new ClinitRequired(cci);
      }

      int cref = cci.getClassObjectRef();
      setReferenceField(ctx, proxyRef, fname, cref);

    } else if (v.getClass().isArray()){ // ..or arrays thereof
      Object[] a = (Object[])v;
      int aref = NULL;

      if (ftype.equals("java.lang.String[]")){
        aref = newObjectArray("Ljava/lang/String;", a.length);
        for (int i=0; i<a.length; i++){
          setReferenceArrayElement(ctx,aref,i, new One<>(newString(FeatureExprFactory.True(), new One<>(a[i].toString()))));
        }
      } else if (ftype.equals("int[]")){
        aref = newIntArray(a.length);
        for (int i=0; i<a.length; i++){
          setIntArrayElement(ctx,aref,i, new One<>(((Number)a[i]).intValue()));
        }
      } else if (ftype.equals("boolean[]")){
        aref = newBooleanArray(a.length);
        for (int i=0; i<a.length; i++){
          setBooleanArrayElement(ctx,aref,i, new One<>(((Boolean)a[i]).booleanValue()));
        }
      } else if (ftype.equals("long[]")){
        aref = newLongArray(a.length);
        for (int i=0; i<a.length; i++){
          setLongArrayElement(ctx,aref,i, ((Number)a[i]).longValue());
        }
      } else if (ftype.equals("double[]")){
        aref = newDoubleArray(a.length);
        for (int i=0; i<a.length; i++){
          setDoubleArrayElement(ctx,aref,i, new One<>(((Number)a[i]).doubleValue()));
        }
      } else if (ftype.equals("java.lang.Class[]")){
        aref = newObjectArray("java.lang.Class", a.length);
        for (int i=0; i<a.length; i++){
          String clsName = ((AnnotationInfo.ClassValue)a[i]).getName();
          ClassInfo cci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);
          if (!cci.isInitialized()){
            throw new ClinitRequired(cci);
          }
          int cref = cci.getClassObjectRef();
          setReferenceArrayElement(ctx,aref,i, new One<>(cref));
        }
      }

      if (aref != NULL){
        setReferenceField(ctx, proxyRef, fname, aref);
      } else {
        throwException(ctx, "AnnotationElement type not supported: " + ftype);
      }

    } else {
      throwException(ctx, "AnnotationElement type not supported: " + ftype);
    }
  }

  int newAnnotationProxy (FeatureExpr ctx, ClassInfo aciProxy, AnnotationInfo ai) throws ClinitRequired {

    int proxyRef = newObject(ctx, aciProxy);

    // init fields of the new object from the AnnotationInfo
    for (AnnotationInfo.Entry e : ai.getEntries()){
      Object v = e.getValue();
      String fname = e.getKey();
      FieldInfo fi = aciProxy.getInstanceField(fname);

      initAnnotationProxyField(ctx, proxyRef, fi, v);
    }

    return proxyRef;
  }

  int newAnnotationProxies (FeatureExpr ctx, AnnotationInfo[] ai) throws ClinitRequired {

    if ((ai != null) && (ai.length > 0)){
      int aref = newObjectArray("Ljava/lang/annotation/Annotation;", ai.length);
      for (int i=0; i<ai.length; i++){
        ClassInfo aci = ClassLoaderInfo.getCurrentResolvedClassInfo(ai[i].getName());
        ClassInfo aciProxy = aci.getAnnotationProxy();

        int ar = newAnnotationProxy(ctx, aciProxy, ai[i]);
        setReferenceArrayElement(ctx, aref, i, new One<>(ar));
      }
      return aref;

    } else {
      // on demand init (not too many programs use annotation reflection)
      int aref = getStaticReferenceField("java.lang.Class", "emptyAnnotations");
      if (aref == NULL) {
        aref = newObjectArray("Ljava/lang/annotation/Annotation;", 0);
        setStaticReferenceField(ctx, "java.lang.Class", "emptyAnnotations", aref);
      }
      return aref;
    }
  }

  public void handleClinitRequest (FeatureExpr ctx, ClassInfo ci) {
    ThreadInfo ti = getThreadInfo();

    // NOTE: we have to repeat no matter what, since this is called from
    // a handler context (if we only had to create a class object w/o
    // calling clinit, we can't just go on)
    ci.pushRequiredClinits(ctx, ti);
    repeatInvocation();
  }

  public StackFrame getCallerStackFrame() {
    // since native methods are now executed within their own stack frames
    // we provide a little helper to get the caller
    return ti.getLastNonSyntheticStackFrame();
  }

  public StackFrame getModifiableCallerStackFrame() {
    // since native methods are now executed within their own stack frames
    // we provide a little helper to get the caller
    return ti.getModifiableLastNonSyntheticStackFrame();
  }

  
  public int valueOfBoolean(boolean b) {
    return BoxObjectCacheManager.valueOfBoolean(ti, b);
  }

  public int valueOfByte(FeatureExpr ctx, byte b) {
    return BoxObjectCacheManager.valueOfByte(ctx, ti, b);
  }

  public int valueOfCharacter(FeatureExpr ctx, char c) {
    return BoxObjectCacheManager.valueOfCharacter(ctx, ti, c);
  }

  public int valueOfShort(FeatureExpr ctx, short s) {
    return BoxObjectCacheManager.valueOfShort(ctx, ti, s);
  }

  public int valueOfInteger(FeatureExpr ctx, int i) {
    return BoxObjectCacheManager.valueOfInteger(ctx, ti, i);
  }
  
  public Conditional<Integer> valueOfInteger(FeatureExpr ctx, Conditional<Integer> i) {
	  return i.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

		@Override
		public Conditional<Integer> apply(FeatureExpr ctx, Integer i) {
			return new One<>(BoxObjectCacheManager.valueOfInteger(ctx, ti, i));
		}
		  
	  });
	    
	  }

  public int valueOfLong(FeatureExpr ctx, long l) {
    return BoxObjectCacheManager.valueOfLong(ctx, ti, l);
  }
}
