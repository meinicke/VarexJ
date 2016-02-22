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
import cmu.utils.ComplexityPrinter;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Compare float ..., value1, value2 => ..., result
 */
public class FCMPG extends JVMInstruction {

	public Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti) {
		StackFrame frame = ti.getModifiableTopFrame();

		Conditional<Float> v1 = frame.popFloat(ctx);
		Conditional<Float> v2 = frame.popFloat(ctx);
		Conditional<Float> result = mapr(v1, v2);
		frame.push(ctx, result);
		ComplexityPrinter.addComplex(v1.size()*v2.size(), result.getFeatureCount(), getClass().getSimpleName(), ctx, ti.getTopFrameMethodInfo(), ti);
		return getNext(ctx, ti);
	}

	@Override
	protected Number instruction(Number v1, Number v2) {
		if (Float.isNaN(v1.floatValue()) || Float.isNaN(v2.floatValue())) {
			return 1;
		} else if (v1.floatValue() == v2.floatValue()) {
			return 0;
		} else if (v2.floatValue() > v1.floatValue()) {
			return 1;
		} else {
			return -1;
		}
	}

	public int getByteCode() {
		return 0x96;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
