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

import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * Get static fieldInfo from class
 * ..., => ..., value 
 */
public class GETSTATIC extends StaticFieldInstruction {

  public GETSTATIC(String fieldName, String clsDescriptor, String fieldDescriptor){
    super(fieldName, clsDescriptor, fieldDescriptor);
  }

  @Override
  protected void popOperands1 (StackFrame frame) {
    // nothing to pop
  }
  
  @Override
  protected void popOperands2 (StackFrame frame) {
    // nothing to pop
  }

  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    ClassInfo ciField;
    FieldInfo fieldInfo;
    
    try {
      fieldInfo = getFieldInfo();
    } catch(LoadOnJPFRequired lre) {
      return ti.getPC();
    }
    
    if (fieldInfo == null) {
      return new One<>(ti.createAndThrowException("java.lang.NoSuchFieldError",
          (className + '.' + fname)));
    }

    // this can be actually different (can be a base)
    ciField = fieldInfo.getClassInfo();
    
    if (!mi.isClinit(ciField) && ciField.pushRequiredClinits(ti)) {
      // note - this returns the next insn in the topmost clinit that just got pushed
      return ti.getPC();
    }

    ElementInfo ei = ciField.getStaticElementInfo();
    ei = ei.getInstanceWithUpdatedSharedness(ti);

    if (ei == null){
      throw new JPFException("attempt to access field: " + fname + " of uninitialized class: " + ciField.getName());
    }

    if (isNewPorFieldBoundary(ti)) {
      if (createAndSetSharedFieldAccessCG( ei, ti)) {
        return new One<Instruction>(this);
      }
    }
   
    Object attr = ei.getFieldAttr(fieldInfo);
    StackFrame frame = ti.getModifiableTopFrame();

    if (size == 1) {
      Conditional<Integer> ival = ei.get1SlotField(fieldInfo);
      lastValue = ival;

      if (fieldInfo.isReference()) {
        frame.pushRef(ival.getValue());
      } else {
        frame.push(ival);
      }
      
      if (attr != null) {
        frame.setOperandAttr(attr);
      }

    } else {
      long lval = ei.get2SlotField(fieldInfo);
      lastValue = new One<>(lval);
      
      frame.pushLong(lval);
      
      if (attr != null) {
        frame.setLongOperandAttr(attr);
      }
    }
        
    return getNext(ctx, ti);
  }
  
  public int getLength() {
    return 3; // opcode, index1, index2
  }
  
  public int getByteCode () {
    return 0xB2;
  }

  public boolean isRead() {
    return true;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
