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
import cmu.vatrace.LocalStoreStatement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

/**
 * Store double into local variable
 * ..., value => ...
 */
public class DSTORE extends LocalVariableInstruction implements StoreInstruction  {

  public DSTORE(int localVarIndex) {
    super(localVarIndex);
  }

  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    StackFrame frame = ti.getModifiableTopFrame();
    
    LocalVarInfo localVarInfo = frame.getLocalVarInfo(index, ctx);
    Conditional<Double> oldValue = null;
    if (localVarInfo != null) {
		int startPC = localVarInfo.getStartPC();
		int pos = getPosition();
		if (pos == startPC - 1) {// init
			oldValue = null;
		} else {
			Conditional<Integer> oldValue1 = frame.getLocalVariable(frame.stack.getCtx(), index);
			Conditional<Integer> oldValue2 = frame.getLocalVariable(frame.stack.getCtx(), index + 1);
			oldValue = oldValue1.mapr(h -> oldValue2.map(l -> Types.longToDouble(Types.intsToLong(l, h)))).simplify();
		}
    }
    
	frame.storeLongOperand(ctx, index);
	
	if (localVarInfo != null) {
		Conditional<Integer> newValue1 = frame.getLocalVariable(frame.stack.getCtx(), index);
		Conditional<Integer> newValue2 = frame.getLocalVariable(frame.stack.getCtx(), index + 1);
		Conditional<Double> newValue = newValue1.mapr(h -> newValue2.map(l -> Types.longToDouble(Types.intsToLong(l, h)))).simplify();
		new LocalStoreStatement(this, frame.method, oldValue, newValue, localVarInfo, ctx);
	}
    
    return getNext(ctx, ti);
  }

  public int getLength() {
    return 2; // opcode, index
  }

  @Override
  public int getByteCode () {
    switch (index) {
      case 0: return 0x47;
      case 1: return 0x48;
      case 2: return 0x49;
      case 3: return 0x4a;
    }

    return 0x39; // ?? wide
  }
  
  public String getBaseMnemonic() {
    return "dstore";
  }
  
  @Override
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
