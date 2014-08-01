//
// Copyright (C) 2012 United States Government as represented by the
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
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.util.ArrayObjectQueue;
import gov.nasa.jpf.util.IntTable;
import gov.nasa.jpf.util.IntVector;
import gov.nasa.jpf.util.ObjectQueue;
import gov.nasa.jpf.util.Processor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * this is an abstract root for Heap implementations, providing a standard
 * mark&sweep collector, change attribute management, and generic pinDownList,
 * weakReference and internString handling
 * 
 * The concrete Heap implementors have to provide the ElementInfo collection
 * and associated getters, allocators and iterators
 */
public abstract class GenericHeap implements Heap, Iterable<ElementInfo> {
  
  static abstract class GenericHeapMemento implements Memento<Heap> {
    // those can be simply copied
    int attributes;
    IntVector pinDownList;
    IntTable<String> internStrings;
    
    protected GenericHeapMemento (GenericHeap heap){
      // these are copy-on-first-write, so we don't have to clone
      pinDownList = heap.pinDownList;
      internStrings = heap.internStrings;
      attributes = heap.attributes & ATTR_STORE_MASK;
      
      heap.setStored();
    }
    
    @Override
    public Heap restore (Heap inSitu) {
      GenericHeap heap = (GenericHeap) inSitu;
      heap.pinDownList = pinDownList;
      heap.internStrings = internStrings;
      heap.attributes = attributes;
      heap.liveBitValue = false; // always start with false after a restore
      return inSitu;
    }
  }
  
  
  protected class ElementInfoMarker implements Processor<ElementInfo>{
    public void process (ElementInfo ei) {
      ei.markRecursive( GenericHeap.this); // this might in turn call queueMark
    }
  }
  
  protected VM vm;

  // list of pinned down references (this is only efficient for a small number of objects)
  // this is copy-on-first-write
  protected IntVector pinDownList;

  // interned Strings
  // this is copy-on-first-write
  protected IntTable<String> internStrings;


  // the usual drill - the lower 2 bytes are sticky, the upper two ones 
  // hold change status and transient (transition local) flags
  protected int attributes;

  static final int ATTR_GC            = 0x0001;
  static final int ATTR_OUT_OF_MEMORY = 0x0002;
  static final int ATTR_RUN_FINALIZER = 0x0004;

  static final int ATTR_ELEMENTS_CHANGED  = 0x10000;
  static final int ATTR_PINDOWN_CHANGED   = 0x20000;
  static final int ATTR_INTERN_CHANGED    = 0x40000;
  static final int ATTR_ATTRIBUTE_CHANGED = 0x80000;

  // masks and sets
  static final int ATTR_STORE_MASK = 0x0000ffff;
  static final int ATTR_ANY_CHANGED = (ATTR_ELEMENTS_CHANGED | ATTR_PINDOWN_CHANGED | ATTR_INTERN_CHANGED | ATTR_ATTRIBUTE_CHANGED);


  //--- these objects are only used during gc

  // used to keep track of marked WeakRefs that might have to be updated (no need to restore, only transient use during gc)
  protected ArrayList<ElementInfo> weakRefs;

  protected ObjectQueue<ElementInfo> markQueue = new ArrayObjectQueue<ElementInfo>();

  // this is set to false upon backtrack/restore
  protected boolean liveBitValue;
  
  protected ElementInfoMarker elementInfoMarker = new ElementInfoMarker();
  
  // the number of live objects
  // <2do> currently only defined after gc
  protected int nLiveObjects;
  
  //--- constructors

  public GenericHeap (Config config, KernelState ks){
    vm = VM.getVM();

    pinDownList = new IntVector(256);
    attributes |= ATTR_PINDOWN_CHANGED; // no need to clone on next add

    internStrings = new IntTable<String>(8);
    attributes |= ATTR_INTERN_CHANGED; // no need to clone on next add

    if (config.getBoolean("vm.finalize", true)){
      attributes |= ATTR_RUN_FINALIZER;
    }

    if (config.getBoolean("vm.sweep",true)){
      attributes |= ATTR_GC;
    }
  }


  protected DynamicElementInfo createElementInfo (int objref, ClassInfo ci, Fields f, Monitor m, ThreadInfo ti){
    return new DynamicElementInfo( objref,ci,f,m,ti);
  }
  
  //--- pinDown handling
  protected void addToPinDownList (int objref){
    if ((attributes & ATTR_PINDOWN_CHANGED) == 0) {
      pinDownList = pinDownList.clone();
      attributes |= ATTR_PINDOWN_CHANGED;
    }
    pinDownList.add(objref);
  }
  
  protected void removeFromPinDownList (int objref){
    if ((attributes & ATTR_PINDOWN_CHANGED) == 0) {
      pinDownList = pinDownList.clone();
      attributes |= ATTR_PINDOWN_CHANGED;
    }
    pinDownList.removeFirst(objref);    
  }

  @Override
  public void registerPinDown(int objref){
    ElementInfo ei = getModifiable(objref);
    if (ei != null) {
      if (ei.incPinDown()){
        addToPinDownList(objref);
      }
    } else {
      throw new JPFException("pinDown reference not a live object: " + objref);
    }
  }

  @Override
  public void releasePinDown(int objref){
    ElementInfo ei = getModifiable(objref);
    if (ei != null) {
      if (ei.decPinDown()){
        removeFromPinDownList(objref);
      }
    } else {
      throw new JPFException("pinDown reference not a live object: " + objref);
    }
  }  
  void markPinDownList (){
    if (pinDownList != null){
      int len = pinDownList.size();
      for (int i=0; i<len; i++){
        int objref = pinDownList.get(i);
        queueMark(objref);
      }
    }
  }
  
  //--- weak reference handling
  
  public void registerWeakReference (ElementInfo ei) {
    if (weakRefs == null) {
      weakRefs = new ArrayList<ElementInfo>();
    }

    weakRefs.add(ei);
  }
  
  /**
   * reset all weak references that now point to collected objects to 'null'
   * NOTE: this implementation requires our own Reference/WeakReference implementation, to
   * make sure the 'ref' field is the first one
   */
  protected void cleanupWeakRefs () {
    if (weakRefs != null) {
      for (ElementInfo ei : weakRefs) {
        Fields f = ei.getFields();
        int    ref = f.getIntValue(0).getValue(); // watch out, the 0 only works with our own WeakReference impl
        if (ref != MJIEnv.NULL) {
          ElementInfo refEi = get(ref);
          if ((refEi == null) || (refEi.isNull())) {
            ei = ei.getModifiableInstance();
            // we need to make sure the Fields are properly state managed
            ei.setReferenceField(ei.getFieldInfo(0), MJIEnv.NULL);
          }
        }
      }

      weakRefs = null;
    }
  }
  
  // NOTE - this is where to assert if this index isn't occupied yet, since only concrete classes know
  // if there can be collisions, and how elements are stored
  
  protected abstract AllocationContext getSUTAllocationContext (FeatureExpr ctx, ClassInfo ci, ThreadInfo ti);
  protected abstract AllocationContext getSystemAllocationContext (ClassInfo ci, ThreadInfo ti, int anchor);
  
  /**
   * this is called for newXX(..) allocations that are SUT thread specific, i.e. in response to
   * a explicit NEW or xNEWARRAY instruction that should take the allocating thread into account 
   */
  protected abstract int getNewElementInfoIndex (AllocationContext ctx);
  
  //--- allocators
    
  protected ElementInfo createObject (FeatureExpr ctx, ClassInfo ci, ThreadInfo ti, int objref) {
    // create the thing itself
    Fields f = ci.createInstanceFields();
    Monitor m = new Monitor();
    ElementInfo ei = createElementInfo( objref, ci, f, m, ti);
    
    set(objref, ei);

    attributes |= ATTR_ELEMENTS_CHANGED;

    // and do the default (const) field initialization
    ci.initializeInstanceData(ctx, ei, ti);

    vm.notifyObjectCreated(ti, ei);
    
    // note that we don't return -1 if 'outOfMemory' (which is handled in
    // the NEWxx bytecode) because our allocs are used from within the
    // exception handling of the resulting OutOfMemoryError (and we would
    // have to override it, since the VM should guarantee proper exceptions)
    
    return ei;    
  }
    
  @Override
  public ElementInfo newObject(FeatureExpr fexpr, ClassInfo ci, ThreadInfo ti) {
    AllocationContext ctx = getSUTAllocationContext(fexpr, ci, ti);
    int index = getNewElementInfoIndex( ctx);
    ElementInfo ei = createObject( fexpr, ci, ti, index);

    return ei;
  }

  @Override
  public ElementInfo newSystemObject (FeatureExpr fexpr, ClassInfo ci, ThreadInfo ti, int anchor) {
    AllocationContext ctx = getSystemAllocationContext( ci, ti, anchor);
    int index = getNewElementInfoIndex( ctx);
    ElementInfo ei = createObject( fexpr, ci, ti, index);
    return ei;
  }
  
  protected ElementInfo createArray (String elementType, int nElements, ClassInfo ci, ThreadInfo ti, int objref) {

    Fields f = ci.createArrayFields(ci.getName(), nElements, Types.getTypeSize(elementType), Types.isReference(elementType));
    Monitor m = new Monitor();
    DynamicElementInfo ei = createElementInfo( objref, ci, f, m, ti);

    set(objref, ei);

    attributes |= ATTR_ELEMENTS_CHANGED;

    vm.notifyObjectCreated(ti, ei);

    return ei;
  }
  
  protected ClassInfo getArrayClassInfo (ThreadInfo ti, String elementType) {
    String type = "[" + elementType;
    SystemClassLoaderInfo sysCl = ti.getSystemClassLoaderInfo();
    ClassInfo ciArray = sysCl.getResolvedClassInfo(null, type);

    if (!ciArray.isInitialized()) {
      // we do this explicitly here since there are no clinits for array classes
      ciArray.registerClass(FeatureExprFactory.True(), ti);
      ciArray.setInitialized();
    }

    return ciArray;
  }
  
  @Override
  public ElementInfo newArray(FeatureExpr fexpr, String elementType, int nElements, ThreadInfo ti) {
    // see newObject for OOM simulation
    ClassInfo ci = getArrayClassInfo(ti, elementType);
    AllocationContext ctx = getSUTAllocationContext(fexpr, ci, ti);
    
    int index = getNewElementInfoIndex( ctx);
    ElementInfo ei = createArray( elementType, nElements, ci, ti, index);

    return ei;
  }

  @Override
  public ElementInfo newSystemArray(String elementType, int nElements, ThreadInfo ti, int anchor) {
    // see newObject for OOM simulation
    ClassInfo ci = getArrayClassInfo(ti, elementType);
    AllocationContext ctx = getSystemAllocationContext( ci, ti, anchor);
    
    int index = getNewElementInfoIndex( ctx);
    ElementInfo ei = createArray( elementType, nElements, ci, ti, index);

    return ei;
  }

  
  
  protected ElementInfo initializeStringObject( FeatureExpr ctx, String str, int index, int vref) {
    ElementInfo ei = getModifiable(index);
    ei.setReferenceField("value", vref);

    ElementInfo eVal = getModifiable(vref);
    CharArrayFields cf = (CharArrayFields)eVal.getFields();
    cf.setCharValues(ctx, str.toCharArray());
    
    return ei;
  }
  
  protected ElementInfo newString (FeatureExpr fexpr, ClassInfo ciString, ClassInfo ciChars, String str, ThreadInfo ti, AllocationContext ctx) {
    SystemClassLoaderInfo sysCl = ti.getSystemClassLoaderInfo();
    
    //--- the string object itself
    int sRef = getNewElementInfoIndex( ctx);
    createObject( fexpr, ciString, ti, sRef);
    
    //--- its char[] array
    ctx = ctx.extend(ciChars, sRef);
    int vRef = getNewElementInfoIndex( ctx);
    createArray( "C", str.length(), ciChars, ti, vRef);
    
    ElementInfo ei = initializeStringObject(fexpr, str, sRef, vRef);      
    return ei;
  }

  @Override
  public ElementInfo newString(FeatureExpr fexpr, String str, ThreadInfo ti){
    if (str != null) {
      SystemClassLoaderInfo sysCl = ti.getSystemClassLoaderInfo();
      ClassInfo ciString = sysCl.getStringClassInfo();
      ClassInfo ciChars = sysCl.getCharArrayClassInfo();
      
      AllocationContext ctx = getSUTAllocationContext(fexpr, ciString, ti);
      return newString( FeatureExprFactory.True(), ciString, ciChars, str, ti, ctx);// TODO jens ???
      
    } else {
      return null;
    }
  }
  
  @Override
	public ElementInfo newString(FeatureExpr fexpr, Conditional<String> str, ThreadInfo ti) {
	  if (str != null) {
	      SystemClassLoaderInfo sysCl = ti.getSystemClassLoaderInfo();
	      ClassInfo ciString = sysCl.getStringClassInfo();
	      ClassInfo ciChars = sysCl.getCharArrayClassInfo();
	      
	      AllocationContext ctx = getSUTAllocationContext(fexpr, ciString, ti);
	      return newString( fexpr, ciString, ciChars, str, ti, ctx);
	      
	    } else {
	      return null;
	    }
	}
  
	protected ElementInfo newString(FeatureExpr fexpr, ClassInfo ciString, ClassInfo ciChars, Conditional<String> str, ThreadInfo ti, AllocationContext ctx) {
		if (str instanceof One){
			return newString(fexpr, str.getValue(), ti);
		}
		int length = 0;
		for (String s : str.toList()) {
			if (s != null && s.length() > length) {
				length = s.length();
			}
		}

//		SystemClassLoaderInfo sysCl = ti.getSystemClassLoaderInfo();

		// --- the string object itself
		int sRef = getNewElementInfoIndex(ctx);
		createObject(fexpr, ciString, ti, sRef);

		// --- its char[] array
		ctx = ctx.extend(ciChars, sRef);
		int vRef = getNewElementInfoIndex(ctx);
		createArray("C", length, ciChars, ti, vRef);
		ElementInfo ei = null;
		Map<String, FeatureExpr> map = str.toMap();
		for (Entry<String, FeatureExpr> sEntry : map.entrySet()) {
			String s = sEntry.getKey();
			if (ei == null) {
				ei = initializeStringObject(sEntry.getValue(), s, sRef, vRef);
			} else {
				ElementInfo eVal = getModifiable(vRef);
				CharArrayFields cf = (CharArrayFields)eVal.getFields();
			    cf.setCharValues(sEntry.getValue().and(fexpr), s.toCharArray());
			}
		}

		
		return ei;
	}
  
  @Override
  public ElementInfo newSystemString (String str, ThreadInfo ti, int anchor) {
    if (str != null) {
      SystemClassLoaderInfo sysCl = ti.getSystemClassLoaderInfo();
      ClassInfo ciString = sysCl.getStringClassInfo();
      ClassInfo ciChars = sysCl.getCharArrayClassInfo();
      
      AllocationContext ctx = getSystemAllocationContext( ciString, ti, anchor);
      return newString( FeatureExprFactory.True(), ciString, ciChars, str, ti, ctx);
      
    } else {
      return null;
    }    
  }

  @Override
  public ElementInfo newInternString (FeatureExpr ctx, String str, ThreadInfo ti) {
    IntTable.Entry<String> e = internStrings.get(str);
    if (e == null){
      if (str != null) {
        ElementInfo ei = newString(ctx, str, ti);
        int index = ei.getObjectRef();
        
        // new interned Strings are always pinned down
        ei.incPinDown();
        addToPinDownList(index);
        addToInternStrings(str, index);

        return ei;
      
      } else {
        return null;
      }

    } else {
      return get(e.val);
    }
  }

  protected void addToInternStrings (String str, int objref) {
    if ((attributes & ATTR_INTERN_CHANGED) == 0){
      internStrings = internStrings.clone();
      attributes |= ATTR_INTERN_CHANGED;
    }
    internStrings.add(str, objref);
  }
  
  
  public ElementInfo newSystemThrowable (FeatureExpr fexpr, ClassInfo ciThrowable, String details, int[] stackSnapshot,
                                 int causeRef, ThreadInfo ti, int anchor) {
    SystemClassLoaderInfo sysCl = ti.getSystemClassLoaderInfo(); 
    ClassInfo ciString = sysCl.getStringClassInfo();
    ClassInfo ciChars = sysCl.getCharArrayClassInfo();
    
    //--- the Throwable object itself
    AllocationContext ctx = getSystemAllocationContext( ciThrowable, ti, anchor);
    int xRef = getNewElementInfoIndex( ctx);
    ElementInfo eiThrowable = createObject(fexpr, ciThrowable, ti, xRef);
    
    //--- the detailMsg field
    if (details != null) {
      AllocationContext ctxString = ctx.extend( ciString, xRef);
      ElementInfo eiMsg = newString( FeatureExprFactory.True(), ciString, ciChars, details, ti, ctxString);
      eiThrowable.setReferenceField("detailMessage", eiMsg.getObjectRef());
    }

    //--- the stack snapshot field
    ClassInfo ciSnap = getArrayClassInfo(ti, "I");
    AllocationContext ctxSnap = ctx.extend(ciSnap, xRef);
    int snapRef = getNewElementInfoIndex( ctxSnap);
    ElementInfo eiSnap = createArray( "I", stackSnapshot.length, ciSnap, ti, snapRef);
//    Conditional<Integer>[] array = eiSnap.asIntArray();
//    int[] snap = new int[array.length];
//    for (int i = 0; i < array.length; i++) {
//    	snap[i] = array[i].getValue();
//    }
    for (int i = 0; i < stackSnapshot.length; i++) {
    	eiSnap.setIntElement(FeatureExprFactory.True(), i, new One<>(stackSnapshot[i]));
    }
//    System.arraycopy( stackSnapshot, 0, snap, 0, stackSnapshot.length);
    eiThrowable.setReferenceField("snapshot", snapRef);

    //--- the cause field
    eiThrowable.setReferenceField("cause", (causeRef != MJIEnv.NULL)? causeRef : xRef);

    return eiThrowable;
  }

  
  //--- abstract accessors

  /*
   * these methods abstract away the container type used in GenericHeap subclasses
   */
  
  /**
   * internal setter used during allocation
   * @param index
   * @param ei
   */  
  protected abstract void set (int index, ElementInfo ei);

  /**
   * public getter to access but not change ElementInfos
   */
  @Override
  public abstract ElementInfo get (int ref);
  
  
  /**
   * public getter to access modifiable ElementInfos;
   */
  @Override
  public abstract ElementInfo getModifiable (int ref);
  
  
  /**
   * internal remover used by generic sweep
   */
  protected abstract void remove (int ref);

  
  //--- iterators
  
  /**
   * return Iterator for all non-null ElementInfo entries
   */
  public abstract Iterator<ElementInfo> iterator();
  
  @Override
  public abstract Iterable<ElementInfo> liveObjects();
  
  
  //--- garbage collection
  
  public boolean isGcEnabled (){
    return (attributes & ATTR_GC) != 0;
  }

  public void setGcEnabled (boolean doGC) {
    if (doGC != isGcEnabled()) {
      if (doGC) {
        attributes |= ATTR_GC;
      } else {
        attributes &= ~ATTR_GC;
      }
      attributes |= ATTR_ATTRIBUTE_CHANGED;
    }
  }
  
  public void unmarkAll(){
    for (ElementInfo ei : liveObjects()){
      ei.setUnmarked();
    }
  }
  
  /**
   * add a non-null, not yet marked reference to the markQueue
   *  
   * called from ElementInfo.markRecursive(). We don't want to expose the
   * markQueue since a copying collector might not have it
   */
  public void queueMark (int objref){
    if (objref == MJIEnv.NULL) {
      return;
    }

    ElementInfo ei = get(objref);
    if (!ei.isMarked()){ // only add objects once
      ei.setMarked();
      markQueue.add(ei);
    }
  }
  
  /**
   * called during non-recursive phase1 marking of all objects reachable
   * from static fields
   * @aspects: gc
   */
  public void markStaticRoot (int objref) {
    if (objref != MJIEnv.NULL) {
      queueMark(objref);
    }
  }

  /**
   * called during non-recursive phase1 marking of all objects reachable
   * from Thread roots
   * @aspects: gc
   */
  public void markThreadRoot (int objref, int tid) {
    if (objref != MJIEnv.NULL) {
      queueMark(objref);
    }
  }
  
  /**
   * this implementation uses a generic ElementInfo iterator, it can be replaced
   * with a more efficient container specific version
   */
  protected void sweep () {
    ThreadInfo ti = vm.getCurrentThread();
    int tid = ti.getId();
    boolean isThreadTermination = ti.isTerminated();
    int n = 0;
    
    if(vm.finalizersEnabled()) {
      markFinalizableObjects();
    }
    
    // now go over all objects, purge the ones that are not live and reset attrs for rest
    for (ElementInfo ei : this){
      
      if (ei.isMarked()){ // live object, prepare for next transition & gc cycle
        ei.setUnmarked();
        ei.setAlive(liveBitValue);
        
        ei.cleanUp(this, isThreadTermination, tid);
        n++;
        
      } else {
        ei.processReleaseActions();
        
        vm.notifyObjectReleased(ti, ei);
        remove(ei.getObjectRef());
      }
    }
    
    nLiveObjects = n;
  }
  
  protected void markFinalizableObjects () {
    // Phase 1: find unmarked objects with finalizers that haven't been processed yet
    // and mark them recursively to avoid them from being GCed. Their finalizers must
    // execute before these objects are removed from the heap.
    for (ElementInfo ei : this){
      if(!ei.isMarked() && ei.hasFinalizer() && !ei.isFinalized()) {
        vm.addToFinalizeQueue(ei);
        queueMark(ei.getObjectRef());
        ei.markRecursive(this);
      }
    }
    
    // Phase 2: collect all unmarked objects
  }
  
  protected void mark () {
    markQueue.clear();
    
    //--- mark everything in our root set
    markPinDownList();
    vm.getThreadList().markRoots(this);      // mark thread stacks
    vm.getClassLoaderList().markRoots(this); // mark all static references

    //--- trace all entries - this gets recursive
    markQueue.process(elementInfoMarker);    
  }
  
  @Override
  public void gc() {
    vm.notifyGCBegin();

    weakRefs = null;
    liveBitValue = !liveBitValue;

    mark();
    
    // at this point all live objects are marked
    sweep();

    cleanupWeakRefs(); // for potential nullification

    vm.processPostGcActions();
    vm.notifyGCEnd();
  }

  /**
   * clean up reference values that are stored outside of reference fields 
   * called from KernelState to process live ElementInfos after GC has finished
   * and only live objects remain in the heap.
   * 
   * <2do> full heap enumeration is BAD - check if this can be moved into the sweep loop
   */
  public void cleanUpDanglingReferences() {
    ThreadInfo ti = ThreadInfo.getCurrentThread();
    int tid = ti.getId();
    boolean isThreadTermination = ti.isTerminated();
    
    for (ElementInfo e : this) {
      if (e != null) {
        e.cleanUp(this, isThreadTermination, tid);
      }
    }
  }
  
  /**
   * check if object is alive. This is here and not in ElementInfo
   * because we might own the liveness bit. In fact, the generic
   * implementation uses bit-toggle to avoid iteration over all live
   * objects at the end of GC
   */
  public boolean isAlive (ElementInfo ei){
    return (ei == null || ei.isMarkedOrAlive(liveBitValue));
  }
  
  //--- state management
  
  // since we can't provide generic implementations, we force concrete subclasses to
  // handle volatile information
  
  @Override
  public abstract void resetVolatiles();

  @Override
  public abstract void restoreVolatiles();
  
  public boolean hasChanged() {
    return (attributes & ATTR_ANY_CHANGED) != 0;
  }
  
  public void markChanged(int objref) {
    attributes |= ATTR_ELEMENTS_CHANGED;
  }

  public void setStored() {
    attributes &= ~ATTR_ANY_CHANGED;
  }
  
  @Override
  public abstract Memento<Heap> getMemento(MementoFactory factory);

  @Override
  public abstract Memento<Heap> getMemento();

  
  //--- out of memory simulation
  
  public boolean isOutOfMemory() {
    return (attributes & ATTR_OUT_OF_MEMORY) != 0;
  }

  public void setOutOfMemory(boolean isOutOfMemory) {
    if (isOutOfMemory != isOutOfMemory()) {
      if (isOutOfMemory) {
        attributes |= ATTR_OUT_OF_MEMORY;
      } else {
        attributes &= ~ATTR_OUT_OF_MEMORY;
      }
      attributes |= ATTR_ATTRIBUTE_CHANGED;
    }
  }


  
  //--- debugging

  @Override
  public void checkConsistency(boolean isStateStore) {
    for (ElementInfo ei : this){
      ei.checkConsistency();
    }
  }
}
