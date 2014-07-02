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
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Divide int ..., value1, value2 =>..., result
 */
public class IDIV extends JVMInstruction {

	public Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti) {
		StackFrame frame = ti.getModifiableTopFrame();

		Conditional<Integer> v1 = frame.pop(ctx);
		Conditional<Integer> v2 = frame.pop(ctx);

		// TODO revise
		// check if there is any division by zero
//		One<Instruction> exception = null;
//		FeatureExpr exceptionCtx = null;
		Map<Integer, FeatureExpr> map = v1.toMap();
		for (int v : map.keySet()) {
			if (v == 0) {
				return new One<>(ti.createAndThrowException(ctx, "java.lang.ArithmeticException", "division by zero"));
//				exception = new One<>(ti.createAndThrowException(ctx, "java.lang.ArithmeticException", "division by zero"));
//				exceptionCtx = map.get(v);
//				v1 = v1.simplify(exceptionCtx.not());
			}
		}
		
		frame.push(ctx, mapr(v1, v2));
		
//		if (exception == null) {
			return getNext(ctx, ti);
//		} 
//		else {
//			Choice<Instruction> res = new Choice<>(exceptionCtx, exception, getNext(ctx.andNot(exceptionCtx), ti));
//			System.out.println(res);
//			return res;
////			return new Choice<>(exceptionCtx, exception, getNext(ctx.andNot(exceptionCtx), ti));
//		}
	}

	@Override
	protected Number instruction(Number v1, Number v2) {
		return v2.intValue() / v1.intValue();
	}

	public int getByteCode() {
		return 0x6C;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
