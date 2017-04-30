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

import cmu.conditional.Conditional;
import cmu.varviz.trace.Statement;
import cmu.vatrace.LocalGetStatement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;


/**
 * Load reference from local variable
 * ... => ..., objectref
 */
public class ALOAD extends LocalVariableInstruction {

  public ALOAD(int index){
    super(index);
  }

  /**
   * for explicit construction
   */
  public void setIndex (int index){
    this.index = index;    
  }
  
  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    StackFrame frame = ti.getModifiableTopFrame();
    frame.pushLocal(ctx, index);
    
    if (index != 0) {// ignore "this"
	    LocalVarInfo localVarInfo = frame.getLocalVarInfo(index, ctx);
	    if (localVarInfo != null) {
			Statement statement = new LocalGetStatement(this, frame.peek(ctx), frame.method, localVarInfo, ctx);
	    }
    }
	
    return getNext(ctx, ti);
  }

  public int getLength() {
    if (index > 3){
      return 2; // opcode, index
    } else {
      return 1; // immediate; opcode
    }
  }
  
  public int getByteCode () {
    switch (index) {
      case 0: return 0x2a;
      case 1: return 0x2b;
      case 2: return 0x2c;
      case 3: return 0x2d;
    }

    return 0x19;  // ? wide versions
  }
  
  public String getBaseMnemonic() {
    return "aload";
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
