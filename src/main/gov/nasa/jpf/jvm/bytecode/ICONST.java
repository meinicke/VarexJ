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
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * Push int constant
 * ... => ..., <i>
 */
public class ICONST extends JVMInstruction {
  protected int value;

  public ICONST(int value){
    this.value = value;
  }

  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    StackFrame frame = ti.getModifiableTopFrame();
    frame.push(ctx, One.valueOf(value));
    return getNext(ctx, ti);
  }

  public int getValue() {
    return value;
  }
  
  @Override
  public int getByteCode () {
    assert ((value >= -1) && (value < 6)) : ("illegal iconst value: " + value);

    switch (value) {
    case -1: return 0x2;
    case 0: return 0x3;
    case 1: return 0x4;
    case 2: return 0x5;
    case 3: return 0x6;
    case 4: return 0x7;
    case 5: return 0x8;
    }
    return 0;
  }
  
  public String getMnemonic () {
    String s = "iconst_";
    
    if (value == -1) {
      return s + "m1";
    } else {
      return s + value;
    }
  }
  
  @Override
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
