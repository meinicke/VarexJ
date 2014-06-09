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
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;


/**
 * Determine if object is of given type
 * ..., objectref => ..., result
 */
public class INSTANCEOF extends JVMInstruction {
  private String type;


  /**
   * typeName is of a/b/C notation
   */
  public INSTANCEOF (String typeName){
    type = Types.getTypeSignature(typeName, false);
  }

  public Conditional<Instruction> execute (ThreadInfo ti) {
    if(Types.isReferenceSignature(type)) {
      String t;
      if(Types.isArray(type)) {
        // retrieve the component terminal
        t = Types.getComponentTerminal(type);
      } else {
        t = type;
      }

      // resolve the referenced class
      try {
        ti.resolveReferencedClass(t);
      } catch(LoadOnJPFRequired lre) {
        return new One<>(ti.getPC());
      }
    }

    StackFrame frame = ti.getModifiableTopFrame();
    int objref = frame.pop().getValue();

    if (objref == MJIEnv.NULL) {
      frame.push(0);
    } else if (ti.getElementInfo(objref).instanceOf(type)) {
      frame.push(1);
    } else {
      frame.push(0);
    }

    return new One<>(getNext(ti));
  }
  
  public String getType() {
	  return type;
  }

  public int getLength() {
    return 3; // opcode, index1, index2
  }
  
  public int getByteCode () {
    return 0xC1;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
