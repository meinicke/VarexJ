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
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * Set static field in class
 * ..., value => ...
 */
public class PUTSTATIC extends StaticFieldInstruction implements StoreInstruction {

  public PUTSTATIC() {}

  public PUTSTATIC(String fieldName, String clsDescriptor, String fieldDescriptor){
    super(fieldName, clsDescriptor, fieldDescriptor);
  }

  @Override
  protected void popOperands1 (StackFrame frame) {
    frame.pop(); // .. val => ..
  }
  
  @Override
  protected void popOperands2 (StackFrame frame) {
    frame.pop(2);  // .. highVal, lowVal => ..
  }
  
  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx,ThreadInfo ti) {
    
    if (!ti.isFirstStepInsn()) { // top half
      FieldInfo fieldInfo;
    
      try {
        fieldInfo = getFieldInfo();
      } catch(LoadOnJPFRequired lre) {
        return ti.getPC();
      }
      
      if (fieldInfo == null) {
        return new One<>(ti.createAndThrowException("java.lang.NoSuchFieldError", (className + '.' + fname)));
      }
      
      ClassInfo ciField = fi.getClassInfo();
      if (!mi.isClinit(ciField) && ciField.pushRequiredClinits(ti)) {
        // note - this returns the next insn in the topmost clinit that just got pushed
        return ti.getPC();
      }
      
      ElementInfo ei = ciField.getStaticElementInfo();
      ei = ei.getInstanceWithUpdatedSharedness(ti);
      if (isNewPorFieldBoundary(ti)) {
        if (createAndSetSharedFieldAccessCG( ei, ti)) {
          return new One(this);
        }
      }
      
      ei = ei.getModifiableInstance();
      return new One<>(put( ti, ti.getTopFrame(), ei));
      
    } else { // re-execution
      // no need to redo the exception checks, we already had them in the top half
      ClassInfo ciField = fi.getClassInfo();
      ElementInfo ei = ciField.getStaticElementInfo();
      
      ei = ei.getModifiableInstance();
      return new One<>(put( ti, ti.getTopFrame(), ei));      
    }
  }
  
  public int getLength() {
    return 3; // opcode, index1, index2
  }

  public int getByteCode () {
    return 0xB3;
  }

  public boolean isRead() {
    return false;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
