//
// Copyright (C) 2009 United States Government as represented by the
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
import gov.nasa.jpf.vm.ThreadInfo;
import cmu.conditional.Conditional;
import cmu.utils.ComplexityPrinter;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * modifies following insn, no stack manipulation
 * NOTE: transparently handled by BCEL, we should never receive this
 *
 * (1): <iload,fload,aload,lload,dload,istore,fstore,astore,lstore,dstore,ret> indexbyte1 indexbyte2
 * (2): <iinc> indexbyte1 indexbyte2 constbyte1 constbyte2
 *
 */
public class WIDE extends JVMInstruction {

  // would have to be checked and reset by following insn
  public static boolean isWide = false;

  @Override
  public int getByteCode() {
    return 0xc4;
  }

  @Override
  public Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti) {
    // nothing, BCEL doesn't even pass this on;
	  ComplexityPrinter.addComplex(1, getClass().getSimpleName(), ctx, ti.getTopFrameMethodInfo(), ti);
    return getNext(ctx, ti);
  }

  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
