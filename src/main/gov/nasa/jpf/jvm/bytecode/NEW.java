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

import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.AllocInstruction;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Heap;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.ComplexityPrinter;
import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * Create new object
 * ... => ..., objectref
 */
public class NEW extends JVMInstruction implements AllocInstruction {
  protected String cname;
  protected int newObjRef = MJIEnv.NULL;

  public NEW (String clsDescriptor){
    cname = Types.getClassNameFromTypeName(clsDescriptor);
  }
  
  public String getClassName(){    // Needed for Java Race Finder
    return(cname);
  }

  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    Heap heap = ti.getHeap();
    ClassInfo ci;

    // resolve the referenced class
    try {
      ci = ti.resolveReferencedClass(cname);
    } catch(LoadOnJPFRequired lre) {
      return ti.getPC();
    }

    if (!ci.isRegistered()){
      ci.registerClass(ctx, ti);
    }

    // since this is a NEW, we also have to pushClinit
    if (!ci.isInitialized()) {
      if (ci.initializeClass(ctx, ti)) {
        return ti.getPC();  // reexecute this instruction once we return from the clinits
      }
    }

    if (heap.isOutOfMemory()) { // simulate OutOfMemoryError
      return new One<>(ti.createAndThrowException(ctx,
                                        "java.lang.OutOfMemoryError", "trying to allocate new " + cname));
    }

    ElementInfo ei = heap.newObject(ctx, ci, ti);
    int objRef = ei.getObjectRef();
    newObjRef = objRef;

    // pushes the return value onto the stack
    StackFrame frame = ti.getModifiableTopFrame();
    frame.pushRef( ctx, objRef);
    ComplexityPrinter.addComplex(1, 0, getClass().getSimpleName(), ctx, ti.getTopFrameMethodInfo(), ti);
    return getNext(ctx, ti);
  }
  

  public int getLength() {
    return 3; // opcode, index1, index2
  }

  public int getByteCode () {
    return 0xBB;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }

  public int getNewObjectRef() {
    return newObjRef;
  }

  public String toString() {
    if (newObjRef != MJIEnv.NULL){
      return "new " + cname + '@' + Integer.toHexString(newObjRef);

    } else {
      return "new " + cname;
    }
  }
}
