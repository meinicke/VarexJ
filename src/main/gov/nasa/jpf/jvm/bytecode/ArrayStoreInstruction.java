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
    int aref = peekArrayRef(ti); // need to be poly, could be LongArrayStore
    if (aref == MJIEnv.NULL) {
      return new One<>(ti.createAndThrowException("java.lang.NullPointerException"));
    }

    ElementInfo e = ti.getModifiableElementInfoWithUpdatedSharedness(aref);
    if (isNewPorBoundary(e, ti)) {
      if (createAndSetArrayCG(e,ti, aref, peekIndex(ti), false)) {
        return new One<Instruction>(this);
      }
    }

    int esize = getElementSize();
    StackFrame frame = ti.getModifiableTopFrame();

    Object attr = esize == 1 ? frame.getOperandAttr() : frame.getLongOperandAttr();
    
    popValue(frame);
    index = frame.pop();
    // don't set 'arrayRef' before we do the CG check (would kill loop optimization)
    arrayRef = frame.pop();

    Instruction xInsn = checkArrayStoreException(ti, e);
    if (xInsn != null){
      return new One<>(xInsn);
    }

    try {
      setField(e, index);
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
  public int peekArrayRef(ThreadInfo ti) {
    return ti.getTopFrame().peek(2);
  }

  @Override
  public int peekIndex(ThreadInfo ti){
    return ti.getTopFrame().peek(1);
  }

  protected Instruction checkArrayStoreException(ThreadInfo ti, ElementInfo ei){
    return null;
  }

  protected abstract void popValue(StackFrame frame);

  protected abstract void setField (ElementInfo e, int index)
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
