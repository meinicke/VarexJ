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

import java.io.PrintWriter;
import java.util.List;
import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.ObjectList;
import gov.nasa.jpf.util.Processor;

/**
 * Describes an element of memory containing the field values of a class or an
 * object. In the case of a class, contains the values of the static fields. For
 * an object contains the values of the object fields.
 *
 * @see gov.nasa.jpf.vm.FieldInfo
 */
public abstract class ElementInfo implements Cloneable {

	public final FeatureExpr ctx;
  //--- the lower 2 bytes of the attribute field are sticky (state stored/restored)

  // object attribute flag values

  // the first 8 bits constitute an unsigned pinDown count
  public static final int   ATTR_PINDOWN_MASK = 0xff;

  // this ElementInfo is not allowed to be modified anymore since it has been state stored
  // ElementInfos are constructed in a non-frozen state, and will be frozen upon
  // heap store (usuall in the heap or ElementInfo memento ctor)
  // This is the basis for lifting the change management from the fields level (fields,monitor,attributes)
  // to the ElementInfo object level
  public static final int   ATTR_IS_FROZEN     = 0x100;

  // object has an immutable type (no field value change)
  public static final int   ATTR_IMMUTABLE     = 0x200;

  // The constructor for the object has returned.  Final fields can no longer break POR
  // This attribute is set in gov.nasa.jpf.vm.bytecode.RETURN.enter().
  // If ThreadInfo.usePorSyncDetection() is false, then this attribute is never set.
  public static final int   ATTR_CONSTRUCTED   = 0x400;
  
  
  public static final int   ATTR_EXPOSED       = 0x1000;
  
  // object is shared between threads
  public static final int   ATTR_SHARED        = 0x4000;
  
  // ATTR_SHARED is frozen (has to be changed explicitly, will not be updated by checkUpdatedSharedness)
  public static final int   ATTR_FREEZE_SHARED = 0x8000; 
  
  
  //--- the upper two bytes are for transient (heap internal) use only, and are not stored

  // BEWARE if you add or change values, make sure these are not used in derived classes !
  // <2do> this is efficient but fragile

  public static final int   ATTR_TREF_CHANGED       = 0x40000; // referencingThreads have changed
  public static final int   ATTR_ATTRIBUTE_CHANGED  = 0x80000; // refers only to sticky bits

  
  //--- useful flag sets & masks

  static final int   ATTR_STORE_MASK = 0x0000ffff;

  static final int   ATTR_ANY_CHANGED = (ATTR_TREF_CHANGED | ATTR_ATTRIBUTE_CHANGED);

  // transient flag set if object is reachable from root object, i.e. can't be recycled
  public static final int   ATTR_IS_MARKED   = 0x80000000;
  
  // this bit is set/unset by the heap in order to identify live objects that have
  // already been unmarked. This is to avoid additional passes over the whole heap in
  // order to clean up dangling references etc.
  // NOTE - this bit should never be state stored - restored ElementInfo should never have it set
  public static final int   ATTR_LIVE_BIT    = 0x40000000;
  
  public static final int   ATTR_MARKED_OR_LIVE_BIT = (ATTR_IS_MARKED | ATTR_LIVE_BIT);

  public static final int ATTR_FINALIZED = 0x800;

  //--- instance fields

  protected ClassInfo       ci;
  protected Fields          fields;
  protected Monitor         monitor;
  
  // the set of threads using this object. Note this is not used for state matching
  // so that order or thread id do not have a direct impact on heap symmetry
  protected ThreadInfoSet referencingThreads;

  // this is the reference value for the object represented by this ElementInfo
  // (note this is a slight misnomer for StaticElementInfos, which don't really
  // represent objects but collections of static fields belonging to the same class)
  protected int objRef;

  // these are our state-stored object attributes
  // WATCH OUT! only include info that otherwise reflects a state change, so
  // that we don't introduce new changes. Its value is used to hash the state!
  // <2do> what a pity - 32 stored bits for (currently) only 2 bits of
  // information,but we might use this as a hash for more complex reference
  // info in the future.
  // We distinguish between propagates and private object attributes, the first
  // one stored in the lower 2 bytes
  protected int attributes;


  //--- the following fields are transient or search global, i.e. their values
  // are not state-stored, but might be set during state restoration

  // FieldLockInfos are never state-stored/backtracked! They are set in the order of
  // field access during the search, so that we can detect potential
  // inconsistencies and re-run accordingly
  protected FieldLockInfo[] fLockInfo;

  // cache for unchanged ElementInfos, so that we don't have to re-create cachedMemento
  // objects all the time
  protected Memento<ElementInfo> cachedMemento;

  // cache for a serialized representation of the object, which can be used
  // by state-matching. Value interpretation depends on the configured Serializer
  protected int sid;


  // helpers for state storage/restore processing, to avoid explicit iterators on
  // respective ElementInfo containers (heap,statics)
  
  static class Restorer implements Processor<ElementInfo> {
    @Override
    public void process (ElementInfo ei) {
      ei.attributes &= ElementInfo.ATTR_STORE_MASK;
      ei.sid = 0;
      ei.updateLockingInfo();
      ei.markUnchanged();
    }        
  }
  static Restorer restorer = new Restorer();
  
  static class Storer implements Processor<ElementInfo> {
    @Override
    public void process (ElementInfo ei) {
      ei.freeze();
    }
  }
  static Storer storer = new Storer();
  
  
  static boolean init (Config config) {
    return true;
  }

  protected ElementInfo (int id, ClassInfo c, Fields f, Monitor m, ThreadInfo ti, FeatureExpr ctx) {
	  this.ctx = ctx;
    objRef = id;
    
    ci = c;
    fields = f;
    monitor = m;
    assert ti != null; // we need that for our POR
  }

  public abstract ElementInfo getModifiableInstance();
  
  // we need to delegate this in case it is global
  protected abstract ThreadInfoSet createThreadInfoSet(ThreadInfo ti);
  
  // not ideal, a sub-type checker.
  public abstract boolean isObject();

  public abstract boolean hasFinalizer();
  
  protected ElementInfo() {
	  this.ctx = null;
  }

  public boolean hasChanged() {
    return !isFrozen();
    //return (attributes & ATTR_ANY_CHANGED) != 0;
  }

  public String toString() {
    return ((ci != null ? ci.getName() : "ElementInfo") + '@' + Integer.toHexString(objRef));
  }

  public FieldLockInfo getFieldLockInfo (FieldInfo fi) {
    if (fLockInfo == null) {
      fLockInfo = new FieldLockInfo[getNumberOfFields()];
    }
    return fLockInfo[fi.getFieldIndex()];
  }

  public void setFieldLockInfo (FieldInfo fi, FieldLockInfo flInfo) {
    fLockInfo[fi.getFieldIndex()] = flInfo;
  }

  /**
   * object is recycled (after potential finalization)
   */
  public void processReleaseActions(){
    // type based release actions
    ci.processReleaseActions(this);
    
    // instance based release actions
    if (fields.hasObjectAttr()){
      for (ReleaseAction action : fields.objectAttrIterator(ReleaseAction.class)){
        action.release(this);
      }
    }
  }

  /**
   * post transition live object cleanup
   * update all non-fields references used by this object. This is only called
   * at the end of the gc, and recycled objects should be either null or not marked
   * 
   * if the current thread terminated, update the refTids accordingly
   */
  void cleanUp (Heap heap, boolean isThreadTermination, int tid) {
    if (fLockInfo != null) {
      for (int i=0; i<fLockInfo.length; i++) {
        FieldLockInfo fli = fLockInfo[i];
        if (fli != null) {
          fLockInfo[i] = fli.cleanUp(heap);
        }
      }
    }
  }
  
  
  //--- sids are only supposed to be used by the Serializer
  public void setSid(int id){
    sid = id;
  }

  public int getSid() {
    return sid;
  }

  //--- cached mementos are only supposed to be used/set by the Restorer

  public Memento<ElementInfo> getCachedMemento(){
    return cachedMemento;
  }

  public void setCachedMemento (Memento<ElementInfo> memento){
    cachedMemento = memento;
  }

  /**
   * do we have a reference field with value objRef?
   */
  public boolean hasRefField (int objRef) {
    return ci.hasRefField( objRef, fields);
  }


  public int numberOfUserThreads() {
    return referencingThreads.size();
  }


  /**
   * the recursive phase2 marker entry, which propagates the attributes set by a
   * previous phase1. This one is called on all 'root'-marked objects after
   * phase1 is completed. ElementInfo is not an ideal place for this method, as
   * it has to access some innards of both ClassInfo (FieldInfo container) and
   * Fields. But on the other hand, we want to keep the whole heap traversal
   * business as much centralized in ElementInfo and Heap implementors
   */
  void markRecursive(Heap heap) {
    int i, n;

    if (isArray()) {
      if (fields.isReferenceArray()) {
        n = ((ArrayFields)fields).arrayLength().getValue();
        for (i = 0; i < n; i++) {
          Conditional<Integer> objref = fields.getReferenceValue(i);
          for (Integer ref : objref.toList()) {
	          if (ref != MJIEnv.NULL){
	            heap.queueMark(ref);
	          }
          }
        }
      }

    } else { // not an array
      ClassInfo ci = getClassInfo();
      boolean isWeakRef = ci.isWeakReference();

      do {
        n = ci.getNumberOfDeclaredInstanceFields();
        boolean isRef = isWeakRef && ci.isReferenceClassInfo(); // is this the java.lang.ref.Reference part?

        for (i = 0; i < n; i++) {
          FieldInfo fi = ci.getDeclaredInstanceField(i);
          if (fi.isReference()) {
            if ((i == 0) && isRef) {
              // we need to reset the ref field once the referenced object goes away
              // NOTE: only the *first* WeakReference field is a weak ref
              // (this is why we have our own implementation)
              heap.registerWeakReference(this);
            } else {
              Conditional<Integer> objref = fields.getReferenceValue(fi.getStorageOffset());
              for (Integer ref : objref.toList()) {
	              if (ref != MJIEnv.NULL){
	                heap.queueMark(ref);
	              }
              }
            }
          }
        }
        ci = ci.getSuperClass();
      } while (ci != null);
    }
  }


  int getAttributes () {
    return attributes;
  }

  int getStoredAttributes() {
    return attributes & ATTR_STORE_MASK;
  }

  public boolean isImmutable() {
    return ((attributes & ATTR_IMMUTABLE) != 0);
  }

  //--- freeze handling
  
  public void freeze() {
    attributes |= ATTR_IS_FROZEN;
  }

  public void defreeze() {
    attributes &= ~ATTR_IS_FROZEN;
  }
  
  public boolean isFrozen() {
    return ((attributes & ATTR_IS_FROZEN) != 0);    
  }
  
  //--- shared handling
    
  public void freezeSharedness (boolean freeze) {
    if (freeze) {
      if ((attributes & ATTR_FREEZE_SHARED) == 0) {
        checkIsModifiable();
        attributes |= (ATTR_FREEZE_SHARED | ATTR_ATTRIBUTE_CHANGED);
      }
    } else {
      if ((attributes & ATTR_FREEZE_SHARED) != 0) {
        checkIsModifiable();
        attributes &= ~ATTR_FREEZE_SHARED;
        attributes |= ATTR_ATTRIBUTE_CHANGED;
      }
    }
  }
  
  public boolean isSharednessFrozen () {
    return (attributes & ATTR_FREEZE_SHARED) != 0;
  }
  
  public boolean isShared() {
    //return usingTi.getNumberOfLiveThreads() > 1;
    return ((attributes & ATTR_SHARED) != 0);
  }
  
  public void setShared (boolean isShared) {
    if (isShared) {
      if ((attributes & ATTR_SHARED) == 0) {
        checkIsModifiable();
        attributes |= (ATTR_SHARED | ATTR_ATTRIBUTE_CHANGED);
        
        // note we don't report the thread here since this is explicitly set via Verify.setShared
        VM.getVM().notifyObjectShared(null, this);
      }
    } else {
      if ((attributes & ATTR_SHARED) != 0) {
        checkIsModifiable();
        attributes &= ~ATTR_SHARED;
        attributes |= ATTR_ATTRIBUTE_CHANGED;
      }
    }
  }

  /**
   * NOTE - this should only be called internally if we know the object is
   * modifiable (e.g. from the ctor)
   */
  void setSharednessFromReferencingThreads () {
    if (referencingThreads.isShared( null, this)) {
      if ((attributes & ATTR_SHARED) == 0) {
        checkIsModifiable();
        attributes |= (ATTR_SHARED | ATTR_ATTRIBUTE_CHANGED);
      }
    }
  }
  
  public boolean isReferencedBySameThreads (ElementInfo eiOther) {
    return referencingThreads.equals(eiOther.referencingThreads);
  }
  
  public boolean isReferencedByThread (ThreadInfo ti) {
    return referencingThreads.contains(ti);
  }
  
  public boolean isExposed(){
    return (attributes & ATTR_EXPOSED) != 0;
  }
  
  /**
   * update referencingThreads and set shared flag accordingly (if not frozen)
   * 
   * NOTE - this might return a new (cloned) ElementInfo in case the state stored/restored
   * flag has been changed and/or the SharedObjectPolicy in effect uses persistent
   * ThreadInfoSet objects (i.e. replaces them upon add).
   * Use only from system code that is aware of the potential ElementInfo
   * identity change (i.e. does not keep a reference to the old one) 
   */
  public ElementInfo getInstanceWithUpdatedSharedness (ThreadInfo ti) {
    ElementInfo updatedEi = this;
    
    // we update the referencingThreads no matter what
    // NOTE - it is up to the policy to decide if this creates a new set or destructively updates
    // the existing one (which translates into carry-over between paths, i.e. search global state)
    ThreadInfoSet newReferencingThreads = referencingThreads.add(ti);
    if (newReferencingThreads != referencingThreads){ // policy uses persistent (invariant) ThreadInfoSets
      updatedEi = getModifiableInstance();
      updatedEi.referencingThreads = newReferencingThreads;
    }

    // the thread might already have been in referencingThreads, but we might get here after
    // backtracking. In this case the ATTR_SHARED attribute might have been reset and we have 
    // to check if it needs updating (in case sharedness is not frozen)
    if ((updatedEi.attributes & ATTR_FREEZE_SHARED) == 0) {
      // note that we can only go from non-shared to shared, but not vice versa
      // (this is called in response to a reference from a live thread)
      if (newReferencingThreads.isShared( ti, updatedEi)) {
        if ((updatedEi.attributes & ATTR_SHARED) == 0) {
          // make sure we clone if this is the first modification
          updatedEi = updatedEi.getModifiableInstance();
          updatedEi.attributes |= (ATTR_SHARED | ATTR_ATTRIBUTE_CHANGED);
          
          ti.getVM().notifyObjectShared(ti, updatedEi);
        }
      }
    }
    
    return updatedEi;
  }
  
  public void setExposed (ThreadInfo ti, ElementInfo eiFieldOwner){
    // we actually have to add this to the attributes to avoid endless loops by
    // re-exposing the same object along a given path
    attributes |= ATTR_EXPOSED;
    
    ti.getVM().notifyObjectExposed(ti, eiFieldOwner, this);
  }
  
  /**
   * this is called before the system attempts to reclaim the object. If
   * we return 'false', the object will *not* be removed
   */
  protected boolean recycle () {  
    // this is required to avoid loosing field lock assumptions
    // when the system sequentialized threads with conflicting assumptions,
    // but the offending object goes out of scope before the system backtracks
    if (hasVolatileFieldLockInfos()) {
      return false;
    }

    setObjectRef(MJIEnv.NULL);

    return true;
  }

  boolean hasVolatileFieldLockInfos() {
    if (fLockInfo != null) {
      for (int i=0; i<fLockInfo.length; i++) {
        FieldLockInfo fli = fLockInfo[i];
        if (fli != null) {
          if (fli.needsPindown(this)) {
            return true;
          }
        }
      }
    }

    return false;
  }
  
  public void hash(HashData hd) {
    hd.add(ci.getClassLoaderInfo().getId());
    hd.add(ci.getId());
    fields.hash(hd);
    monitor.hash(hd);
    hd.add(attributes & ATTR_STORE_MASK);
  }

  @Override
  public int hashCode() {
    HashData hd = new HashData();

    hash(hd);

    return hd.getValue();
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ElementInfo) {
      ElementInfo other = (ElementInfo) o;

      if (ci != other.ci){
        return false;
      }

      if ((attributes & ATTR_STORE_MASK) != (other.attributes & ATTR_STORE_MASK)){
        return false;
      }
      if (!fields.equals(other.fields)) {
        return false;
      }
      if (!monitor.equals(other.monitor)){
        return false;
      }
      if (referencingThreads != other.referencingThreads){
        return false;
      }

      return true;

    } else {
      return false;
    }
  }

  public ClassInfo getClassInfo() {
    return ci;
  }

  abstract protected FieldInfo getDeclaredFieldInfo(String clsBase, String fname);

  abstract protected FieldInfo getFieldInfo(String fname);

  protected abstract int getNumberOfFieldsOrElements();

  
  //--- Object attribute accessors

  public boolean hasObjectAttr(){
    return fields.hasObjectAttr();
  }
  
  public boolean hasObjectAttr(Class<?> attrType) {
    return fields.hasObjectAttr(attrType);
  }

  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */
  public Object getObjectAttr(){
    return fields.getObjectAttr();
  }
  
  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setObjectAttr (Object a){
    checkIsModifiable();
    fields.setObjectAttr(a);
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setObjectAttrNoClone (Object a){
    fields.setObjectAttr(a);
  }

  
  public void addObjectAttr(Object a){
    checkIsModifiable();
    fields.addObjectAttr(a);
  }
  public void removeObjectAttr(Object a){
    checkIsModifiable();
    fields.removeObjectAttr(a);
  }
  public void replaceObjectAttr(Object oldAttr, Object newAttr){
    checkIsModifiable();
    fields.replaceObjectAttr(oldAttr, newAttr);
  }

  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getObjectAttr (Class<T> attrType) {
    return fields.getObjectAttr(attrType);
  }
  public <T> T getNextObjectAttr (Class<T> attrType, Object prev) {
    return fields.getNextObjectAttr(attrType, prev);
  }
  public ObjectList.Iterator objectAttrIterator(){
    return fields.objectAttrIterator();
  }
  public <T> ObjectList.TypedIterator<T> objectAttrIterator(Class<T> type){
    return fields.objectAttrIterator(type);
  }
  
  //--- field attribute accessors
  
  public boolean hasFieldAttr() {
    return fields.hasFieldAttr();
  }

  public boolean hasFieldAttr (Class<?> attrType){
    return fields.hasFieldAttr(attrType);
  }

  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */
  public Object getFieldAttr (FieldInfo fi){
    return fields.getFieldAttr(fi.getFieldIndex());
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setFieldAttr (FieldInfo fi, Object attr){
    checkIsModifiable();
    
    int nFields = getNumberOfFieldsOrElements();
    fields.setFieldAttr( nFields, fi.getFieldIndex(), attr);    
  }

  
  public void addFieldAttr (FieldInfo fi, Object a){
    checkIsModifiable();
    
    int nFields = getNumberOfFieldsOrElements();    
    fields.addFieldAttr( nFields, fi.getFieldIndex(), a);
  }
  public void removeFieldAttr (FieldInfo fi, Object a){
    checkIsModifiable();
    fields.removeFieldAttr(fi.getFieldIndex(), a);
  }
  public void replaceFieldAttr (FieldInfo fi, Object oldAttr, Object newAttr){
    checkIsModifiable();    
    fields.replaceFieldAttr(fi.getFieldIndex(), oldAttr, newAttr);
  }
  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getFieldAttr (FieldInfo fi, Class<T> attrType) {
    return fields.getFieldAttr(fi.getFieldIndex(), attrType);
  }
  public <T> T getNextFieldAttr (FieldInfo fi, Class<T> attrType, Object prev) {
    return fields.getNextFieldAttr(fi.getFieldIndex(), attrType, prev);
  }
  public ObjectList.Iterator fieldAttrIterator (FieldInfo fi){
    return fields.fieldAttrIterator(fi.getFieldIndex());
  }
  public <T> ObjectList.TypedIterator<T> fieldAttrIterator (FieldInfo fi, Class<T> type){
    return fields.fieldAttrIterator(fi.getFieldIndex(), type);
  }
  

  
  //--- element attribute accessors
  
  public boolean hasElementAttr() {
    return fields.hasFieldAttr();
  }

  public boolean hasElementAttr (Class<?> attrType){
    return fields.hasFieldAttr(attrType);
  }

  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   */
  public Object getElementAttr (int idx){
    return fields.getFieldAttr(idx);
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setElementAttr (int idx, Object attr){
	int nElements = getNumberOfFieldsOrElements();
    checkIsModifiable();
    fields.setFieldAttr( nElements, idx, attr);
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   */
  public void setElementAttrNoClone (int idx, Object attr){
    int nElements = getNumberOfFieldsOrElements();
    fields.setFieldAttr(nElements,idx, attr);
  }

  
  public void addElementAttr (int idx, Object a){
    checkIsModifiable();
    
    int nElements = getNumberOfFieldsOrElements();   
    fields.addFieldAttr( nElements, idx, a);
  }
  public void removeElementAttr (int idx, Object a){
    checkIsModifiable();
    fields.removeFieldAttr(idx, a);
  }
  public void replaceElementAttr (int idx, Object oldAttr, Object newAttr){
    checkIsModifiable();
    fields.replaceFieldAttr(idx, oldAttr, newAttr);
  }

/** <2do> those will be obsolete */
  public void addElementAttrNoClone (int idx, Object a){
    int nElements = getNumberOfFieldsOrElements();   
    fields.addFieldAttr( nElements, idx, a);
  }
  public void removeElementAttrNoClone (int idx, Object a){
    fields.removeFieldAttr(idx, a);
  }
  public void replaceElementAttrNoClone (int idx, Object oldAttr, Object newAttr){
    fields.replaceFieldAttr(idx, oldAttr, newAttr);
  }
  
  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getElementAttr (int idx, Class<T> attrType) {
    return fields.getFieldAttr(idx, attrType);
  }
  public <T> T getNextElementAttr (int idx, Class<T> attrType, Object prev) {
    return fields.getNextFieldAttr(idx, attrType, prev);
  }
  public ObjectList.Iterator elementAttrIterator (int idx){
    return fields.fieldAttrIterator(idx);
  }
  public <T> ObjectList.TypedIterator<T> elementAttrIterator (int idx, Class<T> type){
    return fields.fieldAttrIterator(idx, type);
  }

  // -- end attributes --
  
  
  public void setDeclaredIntField(FeatureExpr ctx, String fname, String clsBase, Conditional<Integer> value) {
    setIntField(ctx, getDeclaredFieldInfo(clsBase, fname), value);
  }

  public void setBooleanField (FeatureExpr ctx, String fname, Conditional<Boolean> value) {
    setBooleanField( ctx, getFieldInfo(fname), value);
  }
  public void setByteField (FeatureExpr ctx, String fname, Conditional<Byte> value) {
    setByteField( ctx, getFieldInfo(fname), value);
  }
  public void setCharField (FeatureExpr ctx, String fname, Conditional<Character> value) {
    setCharField( ctx, getFieldInfo(fname), value);
  }
  public void setShortField (FeatureExpr ctx, String fname, Conditional<Short> value) {
    setShortField( ctx, getFieldInfo(fname), value);
  }
  public void setIntField(FeatureExpr ctx, String fname, Conditional<Integer> value) {
    setIntField(ctx, getFieldInfo(fname), value);
  }
  public void setLongField (FeatureExpr ctx, String fname, Conditional<Long> value) {
    setLongField( ctx, getFieldInfo(fname), value);
  }
  public void setFloatField (FeatureExpr ctx, String fname, Conditional<Float> value) {
    setFloatField( ctx, getFieldInfo(fname), value);
  }
  public void setDoubleField (FeatureExpr ctx, String fname, Conditional<Double> value) {
    setDoubleField( ctx, getFieldInfo(fname), value);
  }
  
  public void setReferenceField(FeatureExpr ctx, String fname, Conditional<Integer> value) {
    setReferenceField( ctx, getFieldInfo(fname), value);
  }


  // <2do> we need to tell 'null' values apart from 'no such field'
  public Object getFieldValueObject (String fname) {
    Object ret = null;
    FieldInfo fi = getFieldInfo(fname);

    if (fi != null){
      ret = fi.getValueObject(fields);

    } else {
      // check if there is an enclosing class object
      ElementInfo eiEnclosing = getEnclosingElementInfo();
      if (eiEnclosing != null){
        ret = eiEnclosing.getFieldValueObject(fname);

      } else {
        // we should check static fields in enclosing scopes, but there is no
        // other way than to guess this from the name, and the outer
        // classes might not even be initialized yet
      }
    }

    return ret;
  }

  public ElementInfo getEnclosingElementInfo() {
    return null; // only for DynamicElementInfos
  }

  public void setBooleanField(FeatureExpr ctx, FieldInfo fi, Conditional<Boolean> newValue) {
    checkIsModifiable();
    
    if (fi.isBooleanField()) {
      int offset = fi.getStorageOffset();
      fields.setBooleanValue( ctx, offset, newValue);
    } else {
      throw new JPFException("not a boolean field: " + fi.getName());
    }
  }

  public void setByteField(FeatureExpr ctx, FieldInfo fi, Conditional<Byte> newValue) {
    checkIsModifiable();
    
    if (fi.isByteField()) {
    	set(ctx, fi, newValue);
    } else {
      throw new JPFException("not a byte field: " + fi.getName());
    }
  }

  public void setCharField(FeatureExpr ctx, FieldInfo fi, Conditional<Character> newValue) {
    checkIsModifiable();
    
    if (fi.isCharField()) {
      int offset = fi.getStorageOffset();
      fields.setCharValue(ctx, offset, newValue);
    } else {
      throw new JPFException("not a char field: " + fi.getName());
    }
  }

  public void setShortField(FeatureExpr ctx, FieldInfo fi, Conditional<Short> newValue) {
    checkIsModifiable();

    if (fi.isShortField()) {
    	set(ctx, fi, newValue);
    } else {
      throw new JPFException("not a short field: " + fi.getName());
    }
  }

	private <T extends Number> void set(FeatureExpr ctx, FieldInfo fi, Conditional<T> newValue) {
		int offset = fi.getStorageOffset();
		if (fi instanceof FloatFieldInfo) {
			fields.setFloatValue(ctx, offset, newValue.map(new Function<T, Float>() {
				public Float apply(T x) {
					return x.floatValue();
				}
			}));
		} else if (fi instanceof DoubleFieldInfo) {
			fields.setDoubleValue(ctx, offset, newValue.map(new Function<T, Double>() {
				public Double apply(T x) {
					return x.doubleValue();
				}
			}));
		} else if (fi instanceof IntegerFieldInfo) {
			fields.setIntValue(ctx, offset, newValue.map(new Function<T, Integer>() {
				public Integer apply(T x) {
					return x.intValue();
				}
			}));
		} else if (fi instanceof LongFieldInfo) {
			fields.setLongValue(ctx, offset, newValue.map(new Function<T, Long>() {
				public Long apply(T x) {
					return x.longValue();
				}
			}));
		} else if (fi instanceof ByteFieldInfo) {
			fields.setByteValue(ctx, offset, newValue.map(new Function<T, Byte>() {
				public Byte apply(T x) {
					return x.byteValue();
				}
			}));
		} else if (fi instanceof ShortFieldInfo) {
			fields.setShortValue(ctx, offset, newValue.map(new Function<T, Short>() {
				public Short apply(T x) {
					return x.shortValue();
				}
			}));
		} else {
			throw new RuntimeException(fi.getType());
		}
	}
  
  
  public void setIntField(FeatureExpr ctx, FieldInfo fi, Conditional<Integer> newValue) {
    checkIsModifiable();

    if (fi.isIntField()) {
      set(ctx, fi, newValue);
    } else {
      throw new JPFException("not an int field: " + fi.getName());
    }
  }

  public void setLongField(FeatureExpr ctx, FieldInfo fi, Conditional<Long> newValue) {
    checkIsModifiable();

    if (fi.isLongField()) {
      set(ctx, fi, newValue);
    } else {
      throw new JPFException("not a long field: " + fi.getName());
    }
  }

  public void setFloatField(FeatureExpr ctx, FieldInfo fi, Conditional<Float> newValue) {
    checkIsModifiable();

    if (fi.isFloatField()) {
      set(ctx, fi, newValue);
    } else {
      throw new JPFException("not a float field: " + fi.getName());
    }
  }

  public void setDoubleField(FeatureExpr ctx, FieldInfo fi, Conditional<Double> newValue) {
    checkIsModifiable();

    if (fi.isDoubleField()) {
      int offset = fi.getStorageOffset();
      fields.setDoubleValue( ctx, offset, newValue);
    } else {
      throw new JPFException("not a double field: " + fi.getName());
    }
  }
  
  public void setReferenceField(FeatureExpr ctx, FieldInfo fi, Conditional<Integer> newValue) {
    checkIsModifiable();

    if (fi.isReference()) {
      int offset = fi.getStorageOffset();
      if (ctx.equivalentTo(this.ctx)) {
    	  ctx = FeatureExprFactory.True();
      }
      fields.setReferenceValue( ctx, offset, newValue);
    } else {
      throw new JPFException("not a reference field: " + fi.getName());
    }
  }

  public void set1SlotField(FeatureExpr ctx, FieldInfo fi, Conditional<Integer> val) {
    checkIsModifiable();

    if (fi.is1SlotField()) {
    	if (ctx.equivalentTo(this.ctx)) {
      	  ctx = FeatureExprFactory.True();
        }
      int offset = fi.getStorageOffset();
      fields.setIntValue( ctx, offset, val);
    } else {
      throw new JPFException("not a 1 slot field: " + fi.getName());
    }
  }

  public void set2SlotField(FeatureExpr ctx, FieldInfo fi, Conditional<Long> newValue) {
    checkIsModifiable();

    if (fi.is2SlotField()) {
      int offset = fi.getStorageOffset();
      fields.setLongValue( ctx, offset, newValue);
    } else {
      throw new JPFException("not a 2 slot field: " + fi.getName());
    }
  }


  public void setDeclaredReferenceField(String fname, String clsBase, int value) {
    setReferenceField(FeatureExprFactory.True(), getDeclaredFieldInfo(clsBase, fname), new One<>(value));
  }

  public Conditional<Integer> getDeclaredReferenceField(String fname, String clsBase) {
    FieldInfo fi = getDeclaredFieldInfo(clsBase, fname);
    return getReferenceField( fi);
  }

  public Conditional<Integer> getReferenceField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getReferenceField( fi);
  }


  public int getDeclaredIntField(String fname, String clsBase) {
    // be aware of that static fields are not flattened (they are unique), i.e.
    // the FieldInfo might actually refer to another ClassInfo/StaticElementInfo
    FieldInfo fi = getDeclaredFieldInfo(clsBase, fname);
    return getIntField( fi).getValue();// TODO jens
  }

  public Conditional<Integer> getIntField(String fname) {
    // be aware of that static fields are not flattened (they are unique), i.e.
    // the FieldInfo might actually refer to another ClassInfo/StaticElementInfo
    FieldInfo fi = getFieldInfo(fname);
    return getIntField( fi);
  }

  public void setDeclaredLongField(String fname, String clsBase, long value) {
    checkIsModifiable();
    
    FieldInfo fi = getDeclaredFieldInfo(clsBase, fname);
    fields.setLongValue( null, fi.getStorageOffset(), new One<>(value));
  }

  public long getDeclaredLongField(String fname, String clsBase) {
    FieldInfo fi = getDeclaredFieldInfo(clsBase, fname);
    return getLongField( fi).getValue();
  }

  public Conditional<Long> getLongField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getLongField( fi);
  }

  public Conditional<Boolean> getDeclaredBooleanField(String fname, String refType) {
    FieldInfo fi = getDeclaredFieldInfo(refType, fname);
    return getBooleanField( fi);
  }

  public Conditional<Boolean> getBooleanField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getBooleanField( fi);
  }

  public Conditional<Byte> getDeclaredByteField(String fname, String refType) {
    FieldInfo fi = getDeclaredFieldInfo(refType, fname);
    return getByteField( fi);
  }

  public Conditional<Byte> getByteField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getByteField( fi);
  }

  public Conditional<Character> getDeclaredCharField(String fname, String refType) {
    FieldInfo fi = getDeclaredFieldInfo(refType, fname);
    return getCharField( fi);
  }

  public Conditional<Character> getCharField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getCharField( fi);
  }

  public Conditional<Double> getDeclaredDoubleField(String fname, String refType) {
    FieldInfo fi = getDeclaredFieldInfo(refType, fname);
    return getDoubleField( fi);
  }

  public Conditional<Double> getDoubleField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getDoubleField( fi);
  }

  public Conditional<Float> getDeclaredFloatField(String fname, String refType) {
    FieldInfo fi = getDeclaredFieldInfo(refType, fname);
    return getFloatField( fi);
  }

  public Conditional<Float> getFloatField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getFloatField( fi);
  }

  public Conditional<Short> getDeclaredShortField(String fname, String refType) {
    FieldInfo fi = getDeclaredFieldInfo(refType, fname);
    return getShortField( fi);
  }

  public Conditional<Short> getShortField(String fname) {
    FieldInfo fi = getFieldInfo(fname);
    return getShortField( fi);
  }

  /**
   * note this only holds for instance fields, and hence the method has to
   * be overridden in StaticElementInfo
   */
  @SuppressWarnings("unused")
  private void checkFieldInfo(FieldInfo fi) {
    if (!getClassInfo().isInstanceOf(fi.getClassInfo())) {
      throw new JPFException("wrong FieldInfo : " + fi.getName()
          + " , no such field in " + getClassInfo().getName());
    }
  }

  // those are the cached field value accessors. The caller is responsible
  // for assuring type compatibility

  public Conditional<Boolean> getBooleanField(FieldInfo fi) {
    if (fi.isBooleanField()){
      return fields.getBooleanValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a boolean field: " + fi.getName());
    }
  }
  public Conditional<Byte> getByteField(FieldInfo fi) {
    if (fi.isByteField()){
      return fields.getByteValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a byte field: " + fi.getName());
    }
  }
  public Conditional<Character> getCharField(FieldInfo fi) {
    if (fi.isCharField()){
      return fields.getCharValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a char field: " + fi.getName());
    }
  }
  public Conditional<Short> getShortField(FieldInfo fi) {
    if (fi.isShortField()){
      return fields.getShortValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a short field: " + fi.getName());
    }
  }
  public Conditional<Integer> getIntField(FieldInfo fi) {
    if (fi.isIntField()){
      return fields.getIntValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a int field: " + fi.getName());
    }
  }
  public Conditional<Long> getLongField(FieldInfo fi) {
    if (fi.isLongField()){
      return fields.getLongValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a long field: " + fi.getName());
    }
  }
  public Conditional<Float> getFloatField (FieldInfo fi){
    if (fi.isFloatField()){
      return fields.getFloatValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a float field: " + fi.getName());
    }
  }
  public Conditional<Double> getDoubleField (FieldInfo fi){
    if (fi.isDoubleField()){
      return fields.getDoubleValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a double field: " + fi.getName());
    }
  }
  public Conditional<Integer> getReferenceField (FieldInfo fi) {
    if (fi.isReference()){
      return fields.getReferenceValue(fi.getStorageOffset());
    } else {
      throw new JPFException(fields.getClass().getSimpleName() + " not a reference field: " + fi.getName());
    }
  }

  public Conditional<Integer> get1SlotField(FieldInfo fi) {
    if (fi.is1SlotField()){
      return fields.getIntValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a 1 slot field: " + fi.getName());
    }
  }
  public Conditional<Long> get2SlotField(FieldInfo fi) {
    if (fi.is2SlotField()){
      return fields.getLongValue(fi.getStorageOffset());
    } else {
      throw new JPFException("not a 2 slot field: " + fi.getName());
    }
  }

  protected void checkArray(int index) {
    if (fields instanceof ArrayFields) { // <2do> should check for !long array
      if ((index < 0) || (index >= ((ArrayFields)fields).arrayLength().getValue())) {
        throw new JPFException("illegal array offset: " + index);
      }
    } else {
      throw new JPFException("cannot access non array objects by index");
    }
  }

  public boolean isReferenceArray() {
    return getClassInfo().isReferenceArray();
  }

  /**
   * this is the backend for System.arraycopy implementations, but since it only
   * throws general exceptions it can also be used in other contexts that require
   * type and objRef checking
   *
   * note that we have to do some additional type checking here because we store
   * reference arrays as int[], i.e. for reference arrays we can't rely on
   * System.arraycopy to do the element type checking for us
   *
   * @throws java.lang.ArrayIndexOutOfBoundsException
   * @throws java.lang.ArrayStoreException
   */
  public void copyElements( FeatureExpr ctx, ThreadInfo ti, ElementInfo eiSrc, int srcIdx, int dstIdx, int length){
	if (ctx.isContradiction()) {
		return;
	}

    if (!isArray()){
      throw new ArrayStoreException("destination object not an array: " + ci.getName());
    }
    if (!eiSrc.isArray()){
      throw new ArrayStoreException("source object not an array: " + eiSrc.getClassInfo().getName());
    }

    boolean isRefArray = isReferenceArray();
    if (eiSrc.isReferenceArray() != isRefArray){
      throw new ArrayStoreException("array types not compatible: " + eiSrc.getClassInfo().getName() + " and " + ci.getName());
    }

    // since the caller has to handle normal ArrayStoreExceptions and
    // ArrayIndexOutOfBoundsExceptions, we don't have to explicitly check array length here

    // if we copy reference arrays, we first have to check element type compatibility
    // (the underlying Fields type is always int[], hence we have to do this explicitly)
		if (isRefArray) {
			ClassInfo dstElementCi = ci.getComponentClassInfo();
			Conditional<Integer>[] srcRefs = ((ArrayFields) eiSrc.fields).asReferenceArray();
			int max = srcIdx + length;
			for (int i = srcIdx; i < max; i++) {
				List<Integer> erefs = srcRefs[i].simplify(ctx).toList();
				for (int eref : erefs) {
					if (eref != MJIEnv.NULL) {
						ClassInfo srcElementCi = ti.getClassInfo(eref);
						if (!srcElementCi.isInstanceOf(dstElementCi)) {
							throw new ArrayStoreException("incompatible reference array element type (required " + dstElementCi.getName() + ", found " + srcElementCi.getName());
						}
					}
				}
			}
		}

    // NOTE - we have to clone the fields even in case System.arraycopy fails, since
    // the caller might handle ArrayStore/IndexOutOfBounds, and partial changes
    // have to be preserved
    // note also this preserves values in case of a self copy
    checkIsModifiable();

    Conditional<?> srcVals = ((ArrayFields)eiSrc.getFields()).getValues();
    Conditional<?> dstVals = ((ArrayFields)fields).getValues();
    // this might throw ArrayIndexOutOfBoundsExceptions and ArrayStoreExceptions
    if (srcVals instanceof One && dstVals instanceof One) {// TODO jens revise array copy
    	if (srcVals.getValue() instanceof Conditional[]) {
    		try {
    			Fields src = eiSrc.getFields();
    			if (src == fields) {
    				src = src.clone();
    			}
	    		if (src instanceof DoubleArrayFields) {
		    		for (int i = 0; i < length; i++) {
		    			fields.setDoubleValue(ctx, dstIdx + i, src.getDoubleValue(i + srcIdx));
		    		}
	    		} else if (eiSrc.getFields() instanceof LongArrayFields) {
		    		for (int i = 0; i < length; i++) {
		    			fields.setLongValue(ctx, dstIdx + i, src.getLongValue(i + srcIdx));
		    		}
	    		} else if (eiSrc.getFields() instanceof IntArrayFields) {
		    		for (int i = 0; i < length; i++) {
		    			fields.setIntValue(ctx, dstIdx + i, src.getIntValue(i + srcIdx));
		    		}
	    		} else if (eiSrc.getFields() instanceof ByteArrayFields) {
		    		for (int i = 0; i < length; i++) {
		    			fields.setByteValue(ctx, dstIdx + i, src.getByteValue(i + srcIdx));
		    		}
	    		} else if (eiSrc.getFields() instanceof ReferenceArrayFields) {
		    		for (int i = 0; i < length; i++) {
		    			fields.setReferenceValue(ctx, dstIdx + i, src.getReferenceValue(i + srcIdx));
		    		}
	    		} else if (eiSrc.getFields() instanceof BooleanArrayFields) {
		    		for (int i = 0; i < length; i++) {
		    			fields.setBooleanValue(ctx, dstIdx + i, src.getBooleanValue(i + srcIdx));
		    		}
	    		} else if (eiSrc.getFields() instanceof ShortArrayFields) {
	    			for (int i = 0; i < length; i++) {
		    			fields.setShortValue(ctx, dstIdx + i, src.getShortValue(i + srcIdx));
		    		}
	    		} else if (eiSrc.getFields() instanceof FloatArrayFields) {
	    			for (int i = 0; i < length; i++) {
		    			fields.setFloatValue(ctx, dstIdx + i, src.getFloatValue(i + srcIdx));
		    		}
	    		} else {
	    			throw new RuntimeException("TODO implement array copy for " + src.getClass());
	    		}
    		} catch (JPFException e) {
    			throw new ArrayStoreException(e.getMessage());
    		}
    	} else {
	    	System.arraycopy(srcVals.getValue(), srcIdx, dstVals.getValue(), dstIdx, length);
    	}
    } else {
    	
    	if (fields instanceof CharArrayFields) {
    		for (int i = 0; i < length; i++) {
    			fields.setCharValue(ctx, dstIdx + i, eiSrc.getFields().getCharValue(i + srcIdx));
    		}
    	} else {
    		throw new RuntimeException("TODO implement");
    	}
    }

    // now take care of the attributes
    // <2do> what in case arraycopy did throw - we should only copy the changed element attrs
    if (eiSrc.hasFieldAttr()){
      if (eiSrc == this && srcIdx < dstIdx) { // self copy
        for (int i = length - 1; i >= 0; i--) {
          Object a = eiSrc.getElementAttr( srcIdx+i);
          setElementAttr( dstIdx+i, a);
        }
      } else {
        for (int i = 0; i < length; i++) {
          Object a = eiSrc.getElementAttr(srcIdx+i);
          setElementAttr( dstIdx+i, a);
        }
      }
    }
  }

  public void setBooleanElement(FeatureExpr ctx, int idx, Conditional<Boolean> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setBooleanValue(ctx, idx, value);
  }
  public void setByteElement(FeatureExpr ctx, int idx, Conditional<Byte> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setByteValue(ctx, idx, value);
  }
  public void setCharElement(FeatureExpr ctx, int idx, Conditional<Character> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setCharValue(ctx, idx, value);
  }
  public void setShortElement(FeatureExpr ctx, int idx, Conditional<Short> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setShortValue(ctx, idx, value);
  }
  public void setIntElement(FeatureExpr ctx, int idx, Conditional<Integer> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setIntValue(ctx, idx, value);
  }
  public void setLongElement(FeatureExpr ctx, int idx, Conditional<Long> value) {
    checkArray(idx);
    checkIsModifiable();
    fields.setLongValue(ctx, idx, value);
  }
  public void setFloatElement(FeatureExpr ctx, int idx, Conditional<Float> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setFloatValue(ctx, idx, value);
  }
  public void setDoubleElement(FeatureExpr ctx, int idx, Conditional<Double> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setDoubleValue(ctx, idx, value);
  }
  public void setReferenceElement(FeatureExpr ctx, int idx, Conditional<Integer> value){
    checkArray(idx);
    checkIsModifiable();
    fields.setReferenceValue(ctx, idx, value);
  }

  public Conditional<Boolean> getBooleanElement(int idx) {
    checkArray(idx);
    return fields.getBooleanValue(idx);
  }
  public Conditional<Byte> getByteElement(int idx) {
    checkArray(idx);
    return fields.getByteValue(idx);
  }
  public Conditional<Character> getCharElement(int idx) {
    checkArray(idx);
    return fields.getCharValue(idx);
  }
  public Conditional<Short> getShortElement(int idx) {
    checkArray(idx);
    return fields.getShortValue(idx);
  }
  public Conditional<Integer> getIntElement(int idx) {
    checkArray(idx);
    return fields.getIntValue(idx);
//    Conditional<Integer> res = 
//    System.out.println(res);
//    
//    return res == null ? 0 : res.getValue();
  }
  public Conditional<Long> getLongElement(int idx) {
    checkArray(idx);
    return fields.getLongValue(idx);
  }
  public Conditional<Float> getFloatElement(int idx) {
    checkArray(idx);
    return fields.getFloatValue(idx);
  }
  public Conditional<Double> getDoubleElement(int idx) {
    checkArray(idx);
    return fields.getDoubleValue(idx);
  }
  public Conditional<Integer> getReferenceElement(int idx) {
    checkArray(idx);
    return fields.getReferenceValue(idx);
  }

  public void setObjectRef(int newObjRef) {
    objRef = newObjRef;
  }

  public int getObjectRef() {
    return objRef;
  }

  /** use getObjectRef() - this is not an index */
  @Deprecated
  public int getIndex(){
    return objRef;
  }

  public int getLockCount() {
    return monitor.getLockCount();
  }

  public ThreadInfo getLockingThread() {
    return monitor.getLockingThread();
  }

  public boolean isLocked() {
    return (monitor.getLockCount() > 0);
  }

  public boolean isArray() {
    return ci.isArray();
  }

  public boolean isCharArray(){
    return (fields instanceof CharArrayFields);
  }
  
  public boolean isFloatArray(){
    return (fields instanceof FloatArrayFields);
  }

  public boolean isDoubleArray(){
    return (fields instanceof DoubleArrayFields);
  }

  
  public String getArrayType() {
    if (!ci.isArray()) {
      throw new JPFException("object is not an array");
    }

    return Types.getArrayElementType(ci.getType());
  }

  public Object getBacktrackData() {
    return null;
  }


  // <2do> these will check for corresponding ArrayFields types
  public Conditional<Boolean>[] asBooleanArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asBooleanArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<Byte>[] asByteArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asByteArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<Short>[] asShortArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asShortArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<char[]> asCharArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asCharArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<Integer>[] asIntArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asIntArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<Long>[] asLongArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asLongArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<Float>[] asFloatArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asFloatArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<Double>[] asDoubleArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asDoubleArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public Conditional<Integer>[] asReferenceArray() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).asReferenceArray();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }
    
  public boolean isNull() {
    return (objRef == MJIEnv.NULL);
  }

  public ElementInfo getDeclaredObjectField(String fname, String referenceType) {
    return VM.getVM().getHeap().get(getDeclaredReferenceField(fname, referenceType).getValue());
  }

  public ElementInfo getObjectField(String fname) {
    return VM.getVM().getHeap().get(getReferenceField(fname).getValue());
  }


  /**
   * answer an estimate of the heap size in bytes (this is of course VM
   * dependent, but we can give an upper bound for the fields/elements, and that
   * should be good in terms of application specific properties)
   */
  public int getHeapSize() {
    return fields.getHeapSize();
  }

  public Conditional<String> getStringField(FeatureExpr ctx, String fname) {
    int ref = getReferenceField(fname).simplify(ctx).getValue();

    if (ref != MJIEnv.NULL) {
      ElementInfo ei = VM.getVM().getHeap().get(ref);
      return ei.asString();
    } else {
      return new One<>("null");
    }
  }

  public String getType() {
    return ci.getType();
  }

  /**
   * get a cloned list of the waiters for this object
   */
  public ThreadInfo[] getWaitingThreads() {
    return monitor.getWaitingThreads();
  }

  public boolean hasWaitingThreads() {
    return monitor.hasWaitingThreads();
  }

  public ThreadInfo[] getBlockedThreads() {
    return monitor.getBlockedThreads();
  }

  public ThreadInfo[] getBlockedOrWaitingThreads() {
    return monitor.getBlockedOrWaitingThreads();
  }
    
  public Conditional<Integer> arrayLength() {
    if (fields instanceof ArrayFields){
      return ((ArrayFields)fields).arrayLength();
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }

  public boolean isStringObject() {
    return ClassInfo.isStringClassInfo(ci);
  }

  public Conditional<String> asString() {
    throw new JPFException("not a String object: " + this);
  }

  public Conditional<char[]> getStringChars(){
    throw new JPFException("not a String object: " + this);    
  }
  
  /**
   * just a helper to avoid creating objects just for the sake of comparing
   */
  public boolean equalsString (String s) {
    throw new JPFException("not a String object: " + this);
  }

  /**
   * is this a Number, a Boolean or a Character object
   * Note these classes are all final, so we don't have to check for subtypes
   * 
   * <2do> we should probably use a regular expression here
   */
  public boolean isBoxObject(){
    return false;
  }
  
  public Object asBoxObject(){
    throw new JPFException("not a box object: " + this);    
  }
  
  void updateLockingInfo() {
    int i;

    ThreadInfo ti = monitor.getLockingThread();
    if (ti != null) {
      // here we can update ThreadInfo lock object info (so that we don't
      // have to store it separately)

      // NOTE - the threads need to be restored *before* the ElementInfo containers,
      // or this is going to choke

      // note that we add only once, i.e. rely on the monitor lockCount to
      // determine when to remove an object from our lock set
      //assert area.ks.tl.get(ti.objRef) == ti;  // covered by verifyLockInfo
      ti.updateLockedObject(this);
    }

    if (monitor.hasLockedThreads()) {
      ThreadInfo[] lockedThreads = monitor.getLockedThreads();
      for (i=0; i<lockedThreads.length; i++) {
        ti = lockedThreads[i];
        //assert area.ks.tl.get(ti.objRef) == ti;  // covered by verifyLockInfo
        
        // note that the thread might still be runnable if we have several threads
        // competing for the same lock
        if (!ti.isRunnable()){
          ti.setLockRef(objRef);
        }
      }
    }
  }

  public boolean canLock(ThreadInfo th) {
    return monitor.canLock(th);
  }

  public void checkArrayBounds(FeatureExpr ctx, int index) throws ArrayIndexOutOfBoundsExecutiveException {
    if (fields instanceof ArrayFields) {
      if (index < 0 || index >= ((ArrayFields)fields).arrayLength().getValue()){
    	  throw new ArrayIndexOutOfBoundsException(index);
      }
    } else {
      throw new JPFException("object is not an array: " + this);
    }
  }

  public ElementInfo clone() {
    try {
      ElementInfo ei = (ElementInfo) super.clone();
      ei.fields = fields.clone();
      ei.monitor = monitor.clone();

      return ei;
      
    } catch (CloneNotSupportedException e) {
      throw new InternalError("should not happen");
    }
  }

  // this is the one that should be used by heap
  public ElementInfo deepClone() {
    try {
      ElementInfo ei = (ElementInfo) super.clone();
      ei.fields = fields.clone();
      ei.monitor = monitor.clone();
      
      // referencingThreads is at least subtree global, hence doesn't need to be cloned
      
      ei.cachedMemento = null;
      ei.defreeze();
      
      return ei;
      
    } catch (CloneNotSupportedException e) {
      throw new InternalError("should not happen");
    }
    
  }

  public boolean instanceOf(String type) {
    return Types.instanceOf(ci.getType(), type);
  }

  abstract public int getNumberOfFields();

  abstract public FieldInfo getFieldInfo(int fieldIndex);

  /**
   * threads that will grab our lock on their next execution have to be
   * registered, so that they can be blocked in case somebody else gets
   * scheduled
   */
  public void registerLockContender (ThreadInfo ti) {

    assert ti.lockRef == MJIEnv.NULL || ti.lockRef == objRef :
      "thread " + ti + " trying to register for : " + this +
      " ,but already blocked on: " + ti.getElementInfo(ti.lockRef);

    // note that using the lockedThreads list is a bit counter-intuitive
    // since the thread is still in RUNNING or UNBLOCKED state, but it will
    // remove itself from there once it resumes: lock() calls setMonitorWithoutLocked(ti)
    setMonitorWithLocked(ti);

    // added to satisfy invariant implied by updateLockingInfo() -peterd
    //ti.setLockRef(objRef);
  }

  /**
   * somebody made up his mind and decided not to enter a synchronized section
   * of code it had registered before (e.g. INVOKECLINIT)
   */
  public void unregisterLockContender (ThreadInfo ti) {
    setMonitorWithoutLocked(ti);

    // moved from INVOKECLINIT -peterd
    //ti.resetLockRef();
  }

  void blockLockContenders () {
    // check if there are any other threads that have to change status because they
    // require to lock us in their next exec
    ThreadInfo[] lockedThreads = monitor.getLockedThreads();
    for (int i=0; i<lockedThreads.length; i++) {
      ThreadInfo ti = lockedThreads[i];
      if (ti.isRunnable()) {
        ti.setBlockedState(objRef);
      }
    }
  }

  /**
   * from a MONITOR_ENTER or sync INVOKExx if we cannot acquire the lock
   * note: this is not called from a NOTIFIED_UNBLOCKED state, so we don't have to restore NOTIFIED
   */
  public void block (ThreadInfo ti) {
    assert (monitor.getLockingThread() != null) && (monitor.getLockingThread() != ti) :
          "attempt to block " + ti.getName() + " on unlocked or own locked object: " + this;

    setMonitorWithLocked(ti);
    
    ti.setBlockedState(objRef);    
  }

  /**
   * from a MONITOR_ENTER or sync INVOKExx if we can acquire the lock
   */
  public void lock (ThreadInfo ti) {
    // if we do unlock consistency checks with JPFExceptions, we should do the same here
    if ((monitor.getLockingThread() != null) &&  (monitor.getLockingThread() != ti)){
      throw new JPFException("thread " + ti.getName() + " tries to lock object: "
              + this + " which is locked by: " + monitor.getLockingThread().getName());
    }

    // the thread might be still in the lockedThreads list if this is the
    // first step of a transition
    setMonitorWithoutLocked(ti);
    monitor.setLockingThread(ti);
    monitor.incLockCount();

    // before we enter anything else, mark this thread as not being blocked anymore
    ti.resetLockRef();

    ThreadInfo.State state = ti.getState();
    if (state == ThreadInfo.State.UNBLOCKED) {
      ti.setState(ThreadInfo.State.RUNNING);
    }

    // don't re-add if we are recursive - the lock count is avaliable in the monitor
    if (monitor.getLockCount() == 1) {
      ti.addLockedObject(this);
    }

    // this might set other threads blocked - make sure we lock first or the sequence
    // of notifications is a bit screwed (i.e. the lock would appear *after* the block)
    blockLockContenders();
  }

  /**
   * from a MONITOR_EXIT or sync method RETURN
   * release a possibly recursive lock if lockCount goes to zero
   */
  public void unlock (ThreadInfo ti) {

    checkIsModifiable();
    
    /* If there is a compiler bug, we need to flag it.  Most compilers should 
     * generate balanced monitorenter and monitorexit instructions for all code 
     * paths.  The VM is being used for more non-Java languages.  Some of these 
     * compilers might be experimental and might generate unbalanced 
     * instructions.  In a more likely case, dynamically generated bytecode is
     * more likely to make a mistake and miss a code path.
     */
    if (monitor.getLockCount() <= 0) {// TODO JENS remove
    	System.err.println("monitor already unlocked");
    	return;
    }
    
    if ((monitor.getLockCount() <= 0) || (monitor.getLockingThread() != ti)){
      throw new JPFException("thread " + ti.getName() + " tries to release non-owned lock for object: " + this);
    }

    if (monitor.getLockCount() == 1) {
      ti.removeLockedObject(this);

      ThreadInfo[] lockedThreads = monitor.getLockedThreads();
      for (int i = 0; i < lockedThreads.length; i++) {
        ThreadInfo lti = lockedThreads[i];
        switch (lti.getState()) {

        case BLOCKED:
        case NOTIFIED:
        case TIMEDOUT:
        case INTERRUPTED:
          // Ok, this thread becomes runnable again
          lti.resetLockRef();
          lti.setState(ThreadInfo.State.UNBLOCKED);
          break;

        case WAITING:
        case TIMEOUT_WAITING:
          // nothing to do yet, thread has to timeout, get notified, or interrupted
          break;

        default:
          assert false : "Monitor.lockedThreads<->ThreadData.status inconsistency! " + lockedThreads[i].getStateName();
          // why is it in the list - when someone unlocks, all others should have been blocked
        }
      }

      // leave the contenders - we need to know whom to block on subsequent lock

      monitor.decLockCount();
      monitor.setLockingThread(null);

    } else { // recursive unlock
      monitor.decLockCount();
    }
  }

  /**
   * notifies one of the waiters. Note this is a potentially non-deterministic action
   * if we have several waiters, since we have to try all possible choices.
   * Note that even if we notify a thread here, it still remains in the lockedThreads
   * list until the lock is released (notified threads cannot run right away)
   */
  public void notifies(SystemState ss, ThreadInfo ti){
    notifies(ss, ti, true);
  }
  
  
  private void notifies0 (ThreadInfo tiWaiter){
    if (tiWaiter.isWaiting()){
      if (tiWaiter.getLockCount() > 0) {
        // waiter did hold the lock, but gave it up in the wait,  so it can't run yet
        tiWaiter.setNotifiedState();

      } else {
        // waiter didn't hold the lock, set it running
        setMonitorWithoutLocked(tiWaiter);
        tiWaiter.resetLockRef();
        tiWaiter.setRunning();
      }
    }
  }

  public void notifies (SystemState ss, ThreadInfo ti, boolean hasToHoldLock){
    if (hasToHoldLock){
      assert monitor.getLockingThread() != null : "notify on unlocked object: " + this;
    }

    ThreadInfo[] locked = monitor.getLockedThreads();
    int i, nWaiters=0, iWaiter=0;

    for (i=0; i<locked.length; i++) {
      if (locked[i].isWaiting()) {
        nWaiters++;
        iWaiter = i;
      }
    }

    if (nWaiters == 0) {
      // no waiters, nothing to do
    } else if (nWaiters == 1) {
      // only one waiter, no choice point
      notifies0(locked[iWaiter]);

    } else {
      // Ok, this is the non-deterministic case
      ThreadChoiceGenerator cg = ss.getCurrentChoiceGeneratorOfType(ThreadChoiceGenerator.class);

      assert (cg != null) : "no ThreadChoiceGenerator in notify";

      notifies0(cg.getNextChoice());
    }

    ti.getVM().notifyObjectNotifies(ti, this);
  }

  /**
   * notify all waiters. This is a deterministic action
   * all waiters remain in the locked list, since they still have to be unblocked,
   * which happens in the unlock (monitor_exit or sync return) following the notifyAll()
   */
  public void notifiesAll() {
    assert monitor.getLockingThread() != null : "notifyAll on unlocked object: " + this;

    ThreadInfo[] locked = monitor.getLockedThreads();
    for (int i=0; i<locked.length; i++) {
      // !!!! if there is more than one BLOCKED thread (sync call or monitor enter), only one can be
      // unblocked
      notifies0(locked[i]);
    }

    VM.getVM().notifyObjectNotifiesAll(ThreadInfo.currentThread, this);
  }


  /**
   * wait to be notified. thread has to hold the lock, but gives it up in the wait.
   * Make sure lockCount can be restored properly upon notification
   */
  public void wait(ThreadInfo ti, long timeout){
    wait(ti,timeout,true);
  }

  // this is used from a context where we don't require a lock, e.g. Unsafe.park()/unpark()
  @SuppressWarnings("incomplete-switch")
public void wait (ThreadInfo ti, long timeout, boolean hasToHoldLock){
    checkIsModifiable();
    
    boolean holdsLock = monitor.getLockingThread() == ti;

    if (hasToHoldLock){
      assert holdsLock : "wait on unlocked object: " + this;
    }

    setMonitorWithLocked(ti);
    ti.setLockRef(objRef);
    
    if (timeout == 0) {
      ti.setState(ThreadInfo.State.WAITING);
    } else {
      ti.setState(ThreadInfo.State.TIMEOUT_WAITING);
    }

    if (holdsLock) {
      ti.setLockCount(monitor.getLockCount());

      monitor.setLockingThread(null);
      monitor.setLockCount(0);

      ti.removeLockedObject(this);

      // unblock all runnable threads that are blocked on this lock
      ThreadInfo[] lockedThreads = monitor.getLockedThreads();
      for (int i = 0; i < lockedThreads.length; i++) {
        ThreadInfo lti = lockedThreads[i];
        switch (lti.getState()) {
          case NOTIFIED:
          case BLOCKED:
          case INTERRUPTED:
            lti.resetLockRef();
            lti.setState(ThreadInfo.State.UNBLOCKED);
            break;
        }
      }
    }

    // <2do> not sure if this is right if we don't hold the lock
    ti.getVM().notifyObjectWait(ti, this);
  }


  /**
   * re-acquire lock after being notified. This is the notified thread, i.e. the one
   * that will come out of a wait()
   */
  public void lockNotified (ThreadInfo ti) {
    assert ti.isUnblocked() : "resume waiting thread " + ti.getName() + " which is not unblocked";

    setMonitorWithoutLocked(ti);
    monitor.setLockingThread( ti);
    monitor.setLockCount( ti.getLockCount());

    ti.setLockCount(0);
    ti.resetLockRef();
    ti.setState( ThreadInfo.State.RUNNING);

    blockLockContenders();

    // this is important, if we later-on backtrack (reset the
    // ThreadInfo.lockedObjects set, and then restore from the saved heap), the
    // lock set would not include the lock when we continue to enter this thread
    ti.addLockedObject(this); //wv: add locked object back here
  }

  /**
   * this is for waiters that did not own the lock
   */
  public void resumeNonlockedWaiter (ThreadInfo ti){
    setMonitorWithoutLocked(ti);

    ti.setLockCount(0);
    ti.resetLockRef();
    ti.setRunning();
  }


  void dumpMonitor () {
    PrintWriter pw = new PrintWriter(System.out, true);
    pw.print( "monitor ");
    //pw.print( mIndex);
    monitor.printFields(pw);
    pw.flush();
  }

  /**
   * updates a pinDown counter. If it is > 0 the object is kept alive regardless
   * if it is reachable from live objects or not.
   * @return true if the new counter is 1, i.e. the object just became pinned down
   *
   * NOTE - this is not a public method, pinning down an object is now
   * done through the Heap API, which updates the counter here, but might also
   * have to update internal caches
   */
  boolean incPinDown() {
    int pdCount = (attributes & ATTR_PINDOWN_MASK);

    pdCount++;
    if ((pdCount & ~ATTR_PINDOWN_MASK) != 0){
      throw new JPFException("pinDown limit exceeded: " + this);
    } else {
      int a = (attributes & ~ATTR_PINDOWN_MASK);
      a |= pdCount;
      a |= ATTR_ATTRIBUTE_CHANGED;
      attributes = a;

      return (pdCount == 1);
    }
  }

  /**
   * see incPinDown
   *
   * @return true if the counter becomes 0, i.e. the object just ceased to be
   * pinned down
   */
  boolean decPinDown() {
    int pdCount = (attributes & ATTR_PINDOWN_MASK);

    if (pdCount > 0){
      pdCount--;
      int a = (attributes & ~ATTR_PINDOWN_MASK);
      a |= pdCount;
      a |= ATTR_ATTRIBUTE_CHANGED;
      attributes = a;

      return (pdCount == 0);
    } else {
      return false;
    }
  }

  public int getPinDownCount() {
    return (attributes & ATTR_PINDOWN_MASK);
  }

  public boolean isPinnedDown() {
    return (attributes & ATTR_PINDOWN_MASK) != 0;
  }


  public boolean isConstructed() {
    return (attributes & ATTR_CONSTRUCTED) != 0;
  }

  public void setConstructed() {
    attributes |= (ATTR_CONSTRUCTED | ATTR_ATTRIBUTE_CHANGED);
  }

  public void restoreFields(Fields f) {
    fields = f;
  }

  /**
   * BEWARE - never change the returned object without knowing about the
   * ElementInfo change status, this field is state managed!
   */
  public Fields getFields() {
    return fields;
  }

  public ArrayFields getArrayFields(){
    if (fields instanceof ArrayFields){
      return (ArrayFields)fields;
    } else {
      throw new JPFException("not an array: " + ci.getName());
    }
  }
  
  public void restore(int index, int attributes, Fields fields, Monitor monitor){
    markUnchanged();
    
    this.objRef = index;
    this.attributes = attributes;
    this.fields = fields;
    this.monitor = monitor;
  }

  public void restoreMonitor(Monitor m) {
    monitor = m;
  }

  /**
   * BEWARE - never change the returned object without knowing about the
   * ElementInfo change status, this field is state managed!
   */
  public Monitor getMonitor() {
    return monitor;
  }

  public void restoreAttributes(int a) {
    attributes = a;
  }

  public boolean isAlive(boolean liveBitValue) {
    return ((attributes & ATTR_LIVE_BIT) == 0) ^ liveBitValue;
  }

  public void setAlive(boolean liveBitValue){
    if (liveBitValue){
      attributes |= ATTR_LIVE_BIT;
    } else {
      attributes &= ~ATTR_LIVE_BIT;
    }
  }

  public boolean isMarked() {
    return (attributes & ATTR_IS_MARKED) != 0;
  }

  public boolean isFinalized() {
    return (attributes & ATTR_FINALIZED) != 0;
  }
  
  public void setFinalized() {
    attributes |= ATTR_FINALIZED;
  }
  
  public void setMarked() {
    attributes |= ATTR_IS_MARKED;
  }

  public boolean isMarkedOrAlive (boolean liveBitValue){
    return ((attributes & ATTR_IS_MARKED) != 0) | (((attributes & ATTR_LIVE_BIT) == 0) ^ liveBitValue);
  }

  public void markUnchanged() {
    attributes &= ~ATTR_ANY_CHANGED;
  }

  public void setUnmarked() {
    attributes &= ~ATTR_IS_MARKED;
  }


  protected void checkIsModifiable() {
    if ((attributes & ATTR_IS_FROZEN) != 0) {
      throw new JPFException("attempt to modify frozen object: " + this);
    }
  }

  void setMonitorWithLocked( ThreadInfo ti) {
    checkIsModifiable();
    monitor.addLocked(ti);
  }

  void setMonitorWithoutLocked (ThreadInfo ti) {
    checkIsModifiable();    
    monitor.removeLocked(ti);
  }

  public boolean isLockedBy(ThreadInfo ti) {
    return ((monitor != null) && (monitor.getLockingThread() == ti));
  }

  public boolean isLocking(ThreadInfo ti){
    return (monitor != null) && monitor.isLocking(ti);
  }
  
  void _printAttributes(String cls, String msg, int oldAttrs) {
    if (getClassInfo().getName().equals(cls)) {
      System.out.println(msg + " " + this + " attributes: "
          + Integer.toHexString(attributes) + " was: "
          + Integer.toHexString(oldAttrs));
    }
  }

    
  public void checkConsistency() {
/**
    ThreadInfo ti = monitor.getLockingThread();
    if (ti != null) {
      // object has to be in the lockedObjects list of this thread
      checkAssertion( ti.getLockedObjects().contains(this), "locked object not in thread: " + ti);
    }

    if (monitor.hasLockedThreads()) {
      checkAssertion( refTid.cardinality() > 1, "locked threads without multiple referencing threads");

      for (ThreadInfo lti : monitor.getBlockedOrWaitingThreads()){
        checkAssertion( lti.lockRef == objRef, "blocked or waiting thread has invalid lockRef: " + lti);
      }

      // we can't check for having lock contenders without being shared, since this can happen
      // in case an object is behind a FieldInfo shared-ness firewall (e.g. ThreadGroup.threads), or
      // is kept/used in native code (listener, peer)
    }
**/
  }
  
  protected void checkAssertion(boolean cond, String failMsg){
    if (!cond){
      System.out.println("!!!!!! failed ElementInfo consistency: "  + this + ": " + failMsg);

      System.out.println("object: " + this);
      System.out.println("usingTi: " + referencingThreads);
      
      ThreadInfo tiLock = getLockingThread();
      if (tiLock != null) System.out.println("locked by: " + tiLock);
      
      if (monitor.hasLockedThreads()){
        System.out.println("lock contenders:");
        for (ThreadInfo ti : monitor.getLockedThreads()){
          System.out.println("  " + ti + " = " + ti.getState());
        }
      }
      
      VM.getVM().dumpThreadStates();
      assert false;
    }
  }

}

