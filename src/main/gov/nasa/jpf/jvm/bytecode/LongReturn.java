//
// Copyright (C) 2011 United States Government as represented by the
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
package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

import java.util.Iterator;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * common base for DRETURN and LRETURN
 */
public abstract class LongReturn extends ReturnInstruction {

  protected long ret;
  
  public int getReturnTypeSize() {
    return 2;
  }
  
  protected Object getReturnedOperandAttr (FeatureExpr ctx, StackFrame frame) {
    return frame.getLongOperandAttr();
  }
  
  protected void getAndSaveReturnValue (StackFrame frame, FeatureExpr ctx) {
    ret = frame.popLong(ctx).getValue();
  }

  protected void pushReturnValue (FeatureExpr ctx, StackFrame frame) {
    frame.pushLong(ret);
  }

  //--- attribute accessors 
  
  public boolean hasReturnAttr (ThreadInfo ti){
    StackFrame frame = ti.getTopFrame();
    return frame.hasLongOperandAttr();
  }
  public boolean hasReturnAttr (ThreadInfo ti, Class<?> type){
    StackFrame frame = ti.getTopFrame();
    return frame.hasLongOperandAttr(type);
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   * 
   * obviously, this only makes sense from an instructionExecuted(), since
   * the value is pushed during the enter(). Use ObjectList to access values
   */
  public Object getReturnAttr (ThreadInfo ti){
    StackFrame frame = ti.getTopFrame();
    return frame.getLongOperandAttr();
  }
  
  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   * 
   * we don't clone since pushing a return value already changed the caller frame
   */
  public void setReturnAttr (ThreadInfo ti, Object a){
    StackFrame frame = ti.getModifiableTopFrame();
    frame.setLongOperandAttr(a);
  }

  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getReturnAttr (ThreadInfo ti, Class<T> type){
    StackFrame frame = ti.getTopFrame();
    return frame.getLongOperandAttr(type);
  }
  public <T> T getNextReturnAttr (ThreadInfo ti, Class<T> type, Object prev){
    StackFrame frame = ti.getTopFrame();
    return frame.getNextLongOperandAttr(type, prev);
  }
  public Iterator returnAttrIterator (ThreadInfo ti){
    StackFrame frame = ti.getTopFrame();
    return frame.longOperandAttrIterator();
  }
  public <T> Iterator<T> returnAttrIterator (ThreadInfo ti, Class<T> type){
    StackFrame frame = ti.getTopFrame();
    return frame.longOperandAttrIterator(type);
  }
  
  public void addReturnAttr (ThreadInfo ti, Object attr){
    StackFrame frame = ti.getModifiableTopFrame();
    frame.addLongOperandAttr(attr);
  }


}
