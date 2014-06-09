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

package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.MJIEnv;


/**
 * a full peer for the AtomicIntegerFieldUpdater
 */
public class JPF_java_util_concurrent_atomic_AtomicIntegerFieldUpdater extends AtomicFieldUpdater {

  @MJI
  public void $init__Ljava_lang_Class_2Ljava_lang_String_2__V(
      MJIEnv env, int objRef, int tClsObjRef, int fNameRef) {

    // direct Object subclass, so we don't have to call a super ctor

    ClassInfo ci = env.getReferredClassInfo( tClsObjRef);
    String fname = env.getStringObject(fNameRef);

    FieldInfo fi = ci.getInstanceField(fname);
    ClassInfo fci = fi.getTypeClassInfo();

    if (!fci.isPrimitive() || !fci.getName().equals("int")) {
      // that's also just an approximation, but we need to check
      env.throwException("java.lang.RuntimeException", "wrong field type");
    }

    int fidx = fi.getFieldIndex();
    env.setIntField(objRef, "fieldId", fidx);
  }

  @MJI
  public boolean compareAndSet__Ljava_lang_Object_2II__Z(MJIEnv env,
      int objRef, int tRef, int fExpect, int fUpdate) {

    if (isNewPorFieldBoundary(env, objRef, tRef) && createAndSetFieldCG(env, tRef)) {
      return false; // re-executed anyways
    }

    int fidx = env.getIntField(objRef, "fieldId");
    ElementInfo ei = env.getElementInfo(tRef);
    FieldInfo fi = env.getClassInfo(tRef).getInstanceField(fidx);

    int v = ei.getIntField(fi);
    if (v == fExpect) {
      ei = ei.getModifiableInstance();
      ei.setIntField(fi, fUpdate);
      return true;
    } else {
      return false;
    }
  }

  @MJI
  public boolean weakCompareAndSet__Ljava_lang_Object_2II__Z(MJIEnv env,
      int objRef, int tRef, int fExpect, int fUpdate) {
    return (compareAndSet__Ljava_lang_Object_2II__Z(env, objRef, tRef, fExpect,
        fUpdate));
  }

  @MJI
  public void set__Ljava_lang_Object_2I__(MJIEnv env, int objRef,
      int tRef, int fNewValue) {

    if (isNewPorFieldBoundary(env, objRef, tRef) && createAndSetFieldCG(env, tRef)) {
      return; // re-executed anyways
    }

    int fidx = env.getIntField(objRef, "fieldId");
    ElementInfo ei = env.getModifiableElementInfo(tRef);
    FieldInfo fi = env.getClassInfo(tRef).getInstanceField(fidx);

    ei.setIntField(fi, fNewValue);
  }

  @MJI
  public void lazySet__Ljava_lang_Object_2I__(MJIEnv env, int objRef,
      int tRef, int fNewValue) {
    set__Ljava_lang_Object_2I__(env, objRef, tRef, fNewValue);
  }

  @MJI
  public int get__Ljava_lang_Object_2__I(MJIEnv env, int objRef, int tRef) {

    if (isNewPorFieldBoundary(env, objRef, tRef) && createAndSetFieldCG(env, tRef)) {
      return 0; // re-executed anyways
    }

    int fidx = env.getIntField(objRef, "fieldId");
    ElementInfo ei = env.getElementInfo(tRef);
    FieldInfo fi = env.getClassInfo(tRef).getInstanceField(fidx);

    return ei.getIntField(fi);
  }

  @MJI
  public int getAndSet__Ljava_lang_Object_2I__I(MJIEnv env, int objRef,
      int tRef, int fNewValue) {

    if (isNewPorFieldBoundary(env, objRef, tRef) && createAndSetFieldCG(env, tRef)) {
      return 0; // re-executed anyways
    }

    int fidx = env.getIntField(objRef, "fieldId");
    ElementInfo ei = env.getModifiableElementInfo(tRef);
    FieldInfo fi = env.getClassInfo(tRef).getInstanceField(fidx);
    int result = ei.getIntField(fi);

    ei.setIntField(fi, fNewValue);

    return result;
  }

  @MJI
  public int getAndAdd__Ljava_lang_Object_2I__I(MJIEnv env, int objRef,
      int tRef, int fDelta) {

    if (isNewPorFieldBoundary(env, objRef, tRef) && createAndSetFieldCG(env, tRef)) {
      return 0; // re-executed anyways
    }

    int fidx = env.getIntField(objRef, "fieldId");
    ElementInfo ei = env.getModifiableElementInfo(tRef);
    FieldInfo fi = env.getClassInfo(tRef).getInstanceField(fidx);
    int result = ei.getIntField(fi);

    ei.setIntField(fi, result + fDelta);

    return result;
  }
}
