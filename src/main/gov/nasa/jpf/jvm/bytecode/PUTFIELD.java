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
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Set field in object
 * ..., objectref, value => ...
 */
public class PUTFIELD extends InstanceFieldInstruction implements StoreInstruction {

  public PUTFIELD() {}

  public PUTFIELD(String fieldName, String clsDescriptor, String fieldDescriptor){
    super(fieldName, clsDescriptor, fieldDescriptor);
  }
  
  @Override
  protected void popOperands1 (StackFrame frame) {
    frame.pop(2); // .. objref, val => ..
  }
  
  @Override
  protected void popOperands2 (StackFrame frame) {
    frame.pop(3); // .. objref, highVal,lowVal => ..
  }
    
  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    StackFrame frame = ti.getTopFrame();
    int objRef = frame.peek( size);
    lastThis = objRef;
    
    if (!ti.isFirstStepInsn()) { // top half

      // if this produces an NPE, force the error w/o further ado
      if (objRef == MJIEnv.NULL) {
        return new One<>(ti.createAndThrowException(ctx,
                                   "java.lang.NullPointerException", "referencing field '" + fname + "' on null object"));
      }
      
      ElementInfo ei = ti.getModifiableElementInfoWithUpdatedSharedness(objRef);
      FieldInfo fi = getFieldInfo();
      if (fi == null) {
        return new One<>(ti.createAndThrowException(ctx, 
            "java.lang.NoSuchFieldError", "no field " + fname + " in " + ei));
      }

      // check if this breaks the current transition
      // note this will also set the shared attribute of the field owner
      if (isNewPorFieldBoundary(ti, fi, objRef)) {
        if (createAndSetSharedFieldAccessCG(ei, ti)) {
          return new One<Instruction>(this);
        }
      }
      
      return put(ctx, ti, frame, ei);
      
    } else { // re-execution
      // no need to redo the exception checks, we already had them in the top half
      ElementInfo ei = ti.getElementInfo(objRef);

      return put(ctx, ti, frame, ei);      // this might create an exposure CG and cause another re-execution
    }
  }

  public ElementInfo peekElementInfo (ThreadInfo ti) {
    FieldInfo fi = getFieldInfo();
    int storageSize = fi.getStorageSize();
    int objRef = ti.getTopFrame().peek( (storageSize == 1) ? 1 : 2);
    ElementInfo ei = ti.getElementInfo( objRef);

    return ei;
  }


  public int getLength() {
    return 3; // opcode, index1, index2
  }

  public int getByteCode () {
    return 0xB5;
  }

  public boolean isRead() {
    return false;
  }

  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}



