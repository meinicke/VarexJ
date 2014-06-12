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
import gov.nasa.jpf.util.IntTable;
import gov.nasa.jpf.util.ObjVector;

import java.util.HashMap;
import java.util.Iterator;

/**
 * a heap that implements search global object ids (SGOIDs) and uses
 * a simple ObjVector to store ElementInfos. This is only efficient
 * for small heaps with low fragmentation
 * 
 * SGOID computation uses HashedAllocationContext, which means there
 * is a chance of collisions, in which case a different heap type
 * has to be used (we don't try to resolve collisions here)
 * 
 * NOTE - a reference value of 0 represents NULL, but we rather waste one
 * unused element than doing a -1 on all gets/sets
 */
public class OVHeap extends GenericSGOIDHeap {
  
  //--- state management
  static class OVMemento extends GenericSGOIDHeapMemento {
    ObjVector.Snapshot<ElementInfo> eiSnap;
    
    OVMemento(OVHeap heap) {
      super(heap);
      
      heap.elementInfos.process(ElementInfo.storer);      
      eiSnap = heap.elementInfos.getSnapshot();
    }

    @Override
    public Heap restore(Heap inSitu) {
      super.restore( inSitu);
      
      OVHeap heap = (OVHeap)inSitu;
      heap.elementInfos.restore(eiSnap);      
      heap.elementInfos.process(ElementInfo.restorer);
      
      return heap;
    }
  }
  
  //--- instance data
  
  ObjVector<ElementInfo> elementInfos;
  
  
  //--- constructors
  
  public OVHeap (Config config, KernelState ks){
    super(config, ks);
    
    elementInfos = new ObjVector<ElementInfo>();
  }
      
  //--- the container interface

  /**
   * return number of non-null elements
   */
  @Override
  public int size() {
    return nLiveObjects;
  }
  
  @Override
  protected void set (int index, ElementInfo ei) {
    elementInfos.set(index, ei);
  }

  /**
   * we treat ref <= 0 as NULL reference instead of throwing an exception
   */
  @Override
  public ElementInfo get (int ref) {
    if (ref <= 0) {
      return null;
    } else {
      return elementInfos.get(ref);
    }
  }

  public ElementInfo getModifiable (int ref) {
    if (ref <= 0) {
      return null;
    } else {
      ElementInfo ei = elementInfos.get(ref);

      if (ei != null && ei.isFrozen()) {
        ei = ei.deepClone(); 
        // freshly created ElementInfos are not frozen, so we don't have to defreeze
        elementInfos.set(ref, ei);
      }

      return ei;
    }
  }
    
  @Override
  protected void remove(int ref) {
    elementInfos.remove(ref);
  }

  @Override
  public Iterator<ElementInfo> iterator() {
    return elementInfos.nonNullIterator();
  }

  @Override
  public Iterable<ElementInfo> liveObjects() {
    return elementInfos.elements();
  }

  @Override
  public void resetVolatiles() {
    // we don't have any
  }

  @Override
  public void restoreVolatiles() {
    // we don't have any
  }

  @Override
  public Memento<Heap> getMemento(MementoFactory factory) {
    return factory.getMemento(this);
  }

  @Override
  public Memento<Heap> getMemento(){
    return new OVMemento(this);
  }


}
