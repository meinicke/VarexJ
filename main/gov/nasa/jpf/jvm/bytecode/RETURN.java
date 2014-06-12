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
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;


/**
 * Return void from method
 *   ...  [empty]
 */
public class RETURN extends ReturnInstruction {

  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {

    // Constructors don't return anything so this is the only instruction that can be used to return from a constructor.

    //MethodInfo mi = ti.getMethod();  // Get the current method being executed (e.g. returned from).

    if (mi.isInit()) {  // Check to see if this method is a constructor.

      int objref = ti.getThis();
      ElementInfo ei = ti.getElementInfo(objref); // Get the object.

      if (!ei.isConstructed()) {  // Don't bother doing the following work if the object is already constructed.

        ClassInfo ei_ci = ei.getClassInfo();  // Get the object's class.
        ClassInfo mi_ci = mi.getClassInfo();  // Get the method's class.

        if (ei_ci == mi_ci) { // If the object's class and the method's class are equal, then the thread is returning from the object's constructor.
          ei = ei.getModifiableInstance();
          ei.setConstructed();
        }
      }
    }

    return super.execute(ctx, ti);
  }

  public int getReturnTypeSize() {
    return 0;
  }
  
  protected Object getReturnedOperandAttr (StackFrame frame) {
    return null;
  }

  
  public Object getReturnAttr (ThreadInfo ti){
    return null; // no return value
  }

  protected void getAndSaveReturnValue (StackFrame frame) {
    // we don't have any
  }

  protected void pushReturnValue (StackFrame frame) {
    // nothing to do
  }

  public Object getReturnValue(ThreadInfo ti) {
    //return Void.class; // Hmm, not sure if this is right, but we have to distinguish from ARETURN <null>
    return null;
  }

  public String toString() {
    return "return  " + mi.getFullName();
  }

  public int getByteCode () {
    return 0xB1;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
