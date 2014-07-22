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

import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;


/**
 * absraction for long array stores
 *
 * ... array, index, long-value => ...
 */
public abstract class LongArrayStoreInstruction extends ArrayStoreInstruction {
  protected void setField (FeatureExpr ctx, ElementInfo e, int index, long value)
                    throws ArrayIndexOutOfBoundsExecutiveException {
    e.checkArrayBounds(ctx, index);
    e.setLongElement(ctx, index, value);
  }

  protected int getElementSize () {
    return 2;
  }

  protected long getValue (ThreadInfo ti) {
    StackFrame frame = ti.getModifiableTopFrame();    
    return frame.popLong(FeatureExprFactory.True()).getValue();
  }
  
  public Conditional<Integer> peekArrayRef(FeatureExpr ctx, ThreadInfo ti) {
    return ti.getTopFrame().peek(ctx, 3);  // ..,ref,idx,long(value)
  }

  @Override
  public int peekIndex(FeatureExpr ctx, ThreadInfo ti){
    return ti.getTopFrame().peek(ctx, 2).getValue();
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
