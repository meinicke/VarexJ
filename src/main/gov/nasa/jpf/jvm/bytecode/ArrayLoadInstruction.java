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
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;


/**
 * abstraction for all array load instructions
 *
 * ..., array, index => ..., value
 */
public abstract class ArrayLoadInstruction extends ArrayElementInstruction {
  
  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    StackFrame frame = ti.getModifiableTopFrame();

    // we need to get the object first, to check if it is shared
    int aref = frame.peek(ctx, 1).getValue(); // ..,arrayRef,idx
    if (aref == MJIEnv.NULL) {
      return new One<>(ti.createAndThrowException(ctx, "java.lang.NullPointerException"));
    }
    
    ElementInfo e = ti.getElementInfoWithUpdatedSharedness(aref);
    if (isNewPorBoundary(e, ti)) {
      if (createAndSetArrayCG(e,ti, aref,peekIndex(ctx, ti),true)) {
        return new One<Instruction>(this);
      }
    }
    
    index = frame.pop(ctx).getValue();

    // we should not set 'arrayRef' before the CG check
    // (this would kill the CG loop optimization)
    arrayRef = frame.pop(ctx).getValue();
    
    try {
      push(ctx, frame, e, index);

      Object attr = e.getElementAttr(index);
      if (attr != null) {
        if (getElementSize() == 1) {
          frame.setOperandAttr(attr);
        } else {
          frame.setLongOperandAttr(attr);
        }
      }
      
      return getNext(ctx, ti);
    } catch (ArrayIndexOutOfBoundsExecutiveException ex) {
      return new One<>(ex.getInstruction());
    }
  }

  protected boolean isReference () {
    return false;
  }

  /**
   * only makes sense pre-exec
   */
  @Override
  public int peekArrayRef (FeatureExpr ctx, ThreadInfo ti){
    return ti.getTopFrame(ctx).peek(FeatureExprFactory.True(), 1).getValue();
  }

  // wouldn't really be required for loads, but this is a general
  // ArrayInstruction API
  @Override
  public int peekIndex (FeatureExpr ctx, ThreadInfo ti){
    return ti.getTopFrame(ctx).peek(ctx).getValue();
  }

  protected abstract void push (FeatureExpr ctx, StackFrame frame, ElementInfo e, int index)
                throws ArrayIndexOutOfBoundsExecutiveException;

  
  @Override
  public boolean isRead() {
    return true;
  }
  
  @Override
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
 }
