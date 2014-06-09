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
import gov.nasa.jpf.vm.GenericHeap.GenericHeapMemento;

/**
 * abstract Heap trait that implements SGOIDs by means of a search global
 * Allocation map and a state managed allocCount map
 * 
 * NOTE - a reference value of 0 represents null and therefore is not a valid SGOID
 */
public abstract class GenericSGOIDHeap extends GenericHeap {

  static class GenericSGOIDHeapMemento extends GenericHeapMemento {
    IntTable.Snapshot<AllocationContext> ctxSnap;
    
    GenericSGOIDHeapMemento (GenericSGOIDHeap heap) {
      super(heap);
      
      ctxSnap = heap.allocCounts.getSnapshot();
    }

    @Override
    public Heap restore(Heap inSitu) {
      super.restore( inSitu);
      
      GenericSGOIDHeap heap = (GenericSGOIDHeap) inSitu;
      heap.allocCounts.restore(ctxSnap);
      
      return heap;
    }
  }
  
  // these are search global
  protected int nextSgoid;
  protected IntTable<Allocation> sgoids;
  
  // this is state managed 
  // NOTE - this has to be included in the mementos of concrete Heap implementations 
  protected IntTable<AllocationContext> allocCounts;
  
  protected GenericSGOIDHeap (Config config, KernelState ks){
    super(config, ks);
    
    // static inits
    initAllocationContext(config);
    sgoids = new IntTable<Allocation>();
    nextSgoid = 0;
    
    allocCounts = new IntTable<AllocationContext>();
  }
  
  
  //--- to be overridden by subclasses that use different AllocationContext implementations
  
  protected void initAllocationContext(Config config) {
    HashedAllocationContext.init(config);
    //PreciseAllocationContext.init(config);
  }
  
  // these are always called directly from the allocation primitive, i.e. the allocating site is at a fixed
  // stack offset (callers caller)
  protected AllocationContext getSUTAllocationContext (ClassInfo ci, ThreadInfo ti) {
    return HashedAllocationContext.getSUTAllocationContext(ci, ti);
    //return PreciseAllocationContext.getSUTAllocationContext(ci, ti);
  }
  protected AllocationContext getSystemAllocationContext (ClassInfo ci, ThreadInfo ti, int anchor) {
    return HashedAllocationContext.getSystemAllocationContext(ci, ti, anchor);
    //return PreciseAllocationContext.getSystemAllocationContext(ci, ti, anchor);
  }
  

  @Override
  protected int getNewElementInfoIndex (AllocationContext ctx) {
    int idx;
    int cnt;
    
    IntTable.Entry<AllocationContext> cntEntry = allocCounts.getInc(ctx);
    cnt = cntEntry.val;
    
    Allocation alloc = new Allocation(ctx, cnt);
    
    IntTable.Entry<Allocation> sgoidEntry = sgoids.get(alloc);
    if (sgoidEntry != null) { // we already had this one
      idx = sgoidEntry.val;
      
    } else { // new entry
      idx = ++nextSgoid;
      sgoids.put(alloc, idx);
    }
    
    // sanity check - we do this here (and not in our super class) since we know how elements are stored
//    assert get(idx) == null;
    
    return idx;
  }

}
