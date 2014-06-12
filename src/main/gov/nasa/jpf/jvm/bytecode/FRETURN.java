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
package gov.nasa.jpf.jvm.bytecode;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;


/**
 * Return float from method
 * ..., value => [empty]
 */
public class FRETURN extends ReturnInstruction {

  float ret;
  
  public int getReturnTypeSize() {
    return 1;
  }

  protected Object getReturnedOperandAttr (FeatureExpr ctx, StackFrame frame) {
    return frame.getOperandAttr(ctx);
  }
  
  protected void getAndSaveReturnValue (StackFrame frame, FeatureExpr ctx) {
    ret = frame.popFloat();
  }
  
  protected void pushReturnValue (FeatureExpr ctx, StackFrame frame) {
    frame.pushFloat(ret);
  }
  
  public float getReturnValue () {
    return ret;
  }
  
  public Float getReturnValue (ThreadInfo ti) {
    if (!isCompleted(ti)) { // we have to pull it from the operand stack
      StackFrame frame = ti.getTopFrame();
      ret = frame.peekFloat();
    }
    
    return new Float(ret);
  }
  
  public int getByteCode () {
    return 0xAE;
  }
  
  public String toString() {
    return "freturn " + mi.getFullName();
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
