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


/**
 * abstraction for all array store instructions
 *
 *  ... array, index, <value> => ...
 */
public abstract class ArrayStoreInstruction extends ArrayElementInstruction implements StoreInstruction {

  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    int aref = peekArrayRef(ctx, ti); // need to be poly, could be LongArrayStore
    if (aref == MJIEnv.NULL) {
      return new One<>(ti.createAndThrowException(ctx, "java.lang.NullPointerException"));
    }

    ElementInfo e = ti.getModifiableElementInfoWithUpdatedSharedness(aref);
    if (isNewPorBoundary(e, ti)) {
      if (createAndSetArrayCG(e,ti, aref, peekIndex(ctx, ti), false)) {
        return new One<Instruction>(this);
      }
    }

    int esize = getElementSize();
    StackFrame frame = ti.getModifiableTopFrame();

    Object attr = esize == 1 ? frame.getOperandAttr(ctx) : frame.getLongOperandAttr();
    
    popValue(ctx, frame);
    index = frame.pop(ctx).getValue();
    // don't set 'arrayRef' before we do the CG check (would kill loop optimization)
    arrayRef = frame.pop(ctx).getValue();

    Instruction xInsn = checkArrayStoreException(ctx, ti, e);
    if (xInsn != null){
      return new One<>(xInsn);
    }

    try {
      setField(ctx, e, index);
      e.setElementAttrNoClone(index,attr); // <2do> what if the value is the same but not the attr?
      return getNext(ctx, ti);

    } catch (ArrayIndexOutOfBoundsExecutiveException ex) { // at this point, the AIOBX is already processed
      return new One<>(ex.getInstruction());
    }
  }

  /**
   * this is for pre-exec use
   */
  @Override
  public int peekArrayRef(FeatureExpr ctx, ThreadInfo ti) {
    return ti.getTopFrame(ctx).peek(ctx, 2).getValue();
  }

  @Override
  public int peekIndex(FeatureExpr ctx, ThreadInfo ti){
    return ti.getTopFrame(ctx).peek(ctx, 1).getValue();
  }

  protected Instruction checkArrayStoreException(FeatureExpr ctx, ThreadInfo ti, ElementInfo ei){
    return null;
  }

  protected abstract void popValue(FeatureExpr ctx, StackFrame frame);

  protected abstract void setField (FeatureExpr ctx, ElementInfo e, int index)
                    throws ArrayIndexOutOfBoundsExecutiveException;


  @Override
  public boolean isRead() {
    return false;
  }
  
  @Override
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }

}
