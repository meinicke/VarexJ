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
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;


/**
 * Convert int to float
 * ..., value  =>..., result
 */
public class I2F extends JVMInstruction {

  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    StackFrame frame = ti.getModifiableTopFrame();

    final Conditional<Integer> v = frame.pop(ctx);
    frame.pushFloat(ctx, v.map(x1 -> (float) x1).simplify());

    return getNext(ctx, ti);
  }
  
  public int getByteCode () {
    return 0x86;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
