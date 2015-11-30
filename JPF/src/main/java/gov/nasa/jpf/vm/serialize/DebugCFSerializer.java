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

package gov.nasa.jpf.vm.serialize;

import java.io.OutputStream;

import cmu.conditional.Conditional;
import gov.nasa.jpf.util.FinalBitSet;
import gov.nasa.jpf.vm.DebugStateSerializer;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.JPFOutputStream;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.StaticElementInfo;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * a CFSerializer that stores the serialized program state in a 
 * readable/diffable format.
 * 
 * Automatically used by Debug..StateSet if the configured vm.storage.class is .vm.DebugJenkinsStateSet 
 */
public class DebugCFSerializer extends CFSerializer implements DebugStateSerializer {

  JPFOutputStream os;
  
  // this is for debugging purposes only
  public DebugCFSerializer() {
    os = new JPFOutputStream(System.out);
  }
  
  public void setOutputStream (OutputStream s){
    os = new JPFOutputStream(s);
  }
  
  protected Conditional<Integer>[] computeStoringData() {    
    os.printCommentLine("------------------------ serialized state");
    return super.computeStoringData();
  }
  
  protected void processReferenceQueue(){
    os.println();
    os.printCommentLine("--- heap");
    os.println();
    super.processReferenceQueue();
  }
  
  public void process (ElementInfo ei) {
    super.process( ei);
    
    FinalBitSet filtered = !ei.isArray() ? getInstanceFilterMask(ei.getClassInfo()) : null;
    os.print(ei, filtered);
    os.println();
  }
  
  protected void serializeClassLoaders(){
    os.println();
    os.printCommentLine("--- classes");
    os.println();
    super.serializeClassLoaders();
  }
  
  protected void serializeClass (StaticElementInfo sei){
    super.serializeClass(sei);
    
    FinalBitSet filtered = getStaticFilterMask(sei.getClassInfo());
    os.print(sei, filtered);
    os.println();    
  }
  
  protected void serializeStackFrames(){
    os.println();
    os.printCommentLine("--- threads");
    os.println();
    super.serializeStackFrames();
  }
  
  protected void serializeStackFrames(ThreadInfo ti){
    os.println();
    os.print(ti);
    os.println();
    super.serializeStackFrames(ti);
  }
  
  protected void serializeFrame(StackFrame frame){
    os.print(frame);
    os.println();
    super.serializeFrame(frame);
  }
}
