//
// Copyright (C) 2010 United States Government as represented by the
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
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * this is our implementation independent model of the heap
 */
public interface Heap extends Iterable<ElementInfo> {

  //--- this is the common heap client API

  ElementInfo get (int objref);
  ElementInfo getModifiable (int objref);

  void gc();

  boolean isOutOfMemory();

  void setOutOfMemory(boolean isOutOfMemory);

  //--- the allocator primitives
  ElementInfo newArray (FeatureExpr ctx, String elementType, int nElements, ThreadInfo ti);
  ElementInfo newObject (FeatureExpr ctx, ClassInfo ci, ThreadInfo ti);
  
  ElementInfo newSystemArray (String elementType, int nElements, ThreadInfo ti, int anchor);
  ElementInfo newSystemObject (FeatureExpr ctx, ClassInfo ci, ThreadInfo ti, int anchor);

  //--- convenience allocators that avoid constructor calls
  // (those are mostly used for their reference values since they already have initialized fields,
  // but to keep it consistent we use ElementInfo return types)
  ElementInfo newString (FeatureExpr ctx, Conditional<String> s, ThreadInfo ti);
  ElementInfo newString (FeatureExpr ctx, String s, ThreadInfo ti);// TODO jens remove
  
  
  ElementInfo newSystemString (String str, ThreadInfo ti, int anchor);
  
  ElementInfo newInternString (FeatureExpr ctx, String str, ThreadInfo ti);
  
  ElementInfo newSystemThrowable (FeatureExpr ctx, ClassInfo ci, String details, int[] stackSnapshot,
                          int causeRef, ThreadInfo ti, int anchor);
  
  Iterable<ElementInfo> liveObjects();

  int size();

  //--- system internal interface


  //void updateReachability( boolean isSharedOwner, int oldRef, int newRef);

  void markThreadRoot (int objref, int tid);

  void markStaticRoot (int objRef);

  // these update per-object counters - object will be gc'ed if it goes to zero
  void registerPinDown (int objRef);
  void releasePinDown (int objRef);

  void unmarkAll();

  void cleanUpDanglingReferences();

  boolean isAlive (ElementInfo ei);

  void registerWeakReference (ElementInfo ei);

  // to be called from ElementInfo.markRecursive(), to avoid exposure of
  // mark implementation
  void queueMark (int objref);

  boolean hasChanged();


  // <2do> this will go away
  void markChanged(int objref);

  void resetVolatiles();

  void restoreVolatiles();

  void checkConsistency (boolean isStateStore);


  Memento<Heap> getMemento(MementoFactory factory);
  Memento<Heap> getMemento();
}
