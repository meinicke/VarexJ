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

import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * even more aggressive under-approximation than AdaptiveSerializer. This one
 * only looks at the top frame of each thread, and only serializes objects
 * referenced from there. It ignores static fields and deeper heap objects that
 * are not directly referenced.
 *
 * While this seems too aggressive, it actually finds a lot of concurrency
 * defects in real world applications. This is esp. true if there are
 * a lot of field access CGs, i.e. shared objects. In this case, the
 * TopFrameSerializer can behave an order of magnitude better than CFSerializer
 */
public class TopFrameSerializer extends CFSerializer {

  boolean traverseObjects;

  @Override
  protected void initReferenceQueue() {
    super.initReferenceQueue();

    traverseObjects = true;
  }

  @Override
  protected void serializeStackFrames(ThreadInfo ti){
    // we just look at the top frame
    serializeFrame(ti.getTopFrame());
  }


  @Override
  protected void queueReference(ElementInfo ei){
    if (traverseObjects){
      refQueue.add(ei);
    }
  }

  @Override
  protected void processReferenceQueue() {
    // we only go one level deep
    traverseObjects = false;
    refQueue.process(this);
  }

  @Override
  protected void serializeClassLoaders(){
    // totally ignore statics
  }
}
