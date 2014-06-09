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

package gov.nasa.jpf.vm.serialize;

import java.util.Iterator;

import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.ThreadList;

/**
 * a FilteringSerializer that performs on-the-fly heap canonicalization to
 * achieve heap symmetry. It does so by storing the order in which
 * objects are referenced, not the reference values themselves.
 *
 * Use this serializer if the Heap implementation does not provide
 * sufficient symmetry, i.e. reference values depend on the order of
 * thread scheduling.
 *
 * Ad hoc heap symmetry is hard to achieve in the heap because of static initialization.
 * Each time a thread loads a class all the static init (at least the class object and
 * its fields) are associated with this thread, hence thread reference
 * values depend on which classes are already loaded by other threads. Associating
 * all allocations from inside of clinits to one address range doesn't help either
 * because then this range will experience scheduling dependent orders. A hybrid
 * approach in which only this segment is canonicalized might work, but it is
 * questionable if the overhead is worth the effort.
 */
public class CFSerializer extends FilteringSerializer {

  // we flip this on every serialization, which helps us to avoid passes
  // over the serialized objects to reset their sids. This works by resetting
  // the sid to 0 upon backtrack, and counting either upwards from 1 or downwards
  // from -1, but store the absolute value in the serialization stream
  boolean positiveSid;

  int sidCount;

  @Override
  protected void initReferenceQueue() {
    super.initReferenceQueue();

    if (positiveSid){
      positiveSid = false;
      sidCount = -1;
    } else {
      positiveSid = true;
      sidCount = 1;
    }
  }

  // might be overriden in subclasses to conditionally queue objects
  protected void queueReference(ElementInfo ei){
    refQueue.add(ei);
  }

  @Override
  public void processReference(int objref) {
    if (objref == MJIEnv.NULL) {
      buf.add(MJIEnv.NULL);

    } else {
      ElementInfo ei = heap.get(objref);
      int sid = ei.getSid();

      if (positiveSid){ // count sid upwards from 1
        if (sid <= 0){  // not seen before in this serialization run
          sid = sidCount++;
          ei.setSid(sid);
          queueReference(ei);
        }
      } else { // count sid downwards from -1
        if (sid >= 0){ // not seen before in this serialization run
          sid = sidCount--;
          ei.setSid(sid);
          queueReference(ei);
        }
        sid = -sid;
      }

      // note that we always add the absolute sid value
      buf.add(sid);
    }
  }
  
  @Override
  protected void serializeStackFrames() {
    ThreadList tl = ks.getThreadList();

    for (Iterator<ThreadInfo> it = tl.canonicalLiveIterator(); it.hasNext(); ) {
      serializeStackFrames(it.next());
    }
  }
  
  @Override
  protected void serializeFrame(StackFrame frame){
    buf.add(frame.getMethodInfo().getGlobalId());

    Instruction pc = frame.getPC();
    buf.add( pc != null ? pc.getInstructionIndex() : -1);

    int len = frame.getTopPos()+1;
    buf.add(len);

    // unfortunately we can't do this as a block operation because that
    // would use concrete reference values as hash data, i.e. break heap symmetry
    int[] slots = frame.getSlots();
    for (int i = 0; i < len; i++) {
      if (frame.isReferenceSlot(i)) {
        processReference(slots[i]);
      } else {
        buf.add(slots[i]);
      }
    }
  }

  @Override
  protected void processReferenceQueue() {
    refQueue.process(this);
  }
  
  @Override
  protected int getSerializedReferenceValue (ElementInfo ei){
    return Math.abs(ei.getSid());
  }
}
