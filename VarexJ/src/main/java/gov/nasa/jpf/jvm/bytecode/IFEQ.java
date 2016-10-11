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
import java.util.function.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.StackFrame;

/**
 * Branch if int comparison with zero succeeds
 * ..., value => ...
 */
public class IFEQ extends IfInstruction {

	private static final Function<Integer, Conditional<Boolean>> IFEQ_ = new Function<Integer, Conditional<Boolean>>() {
		public Conditional<Boolean> apply(final Integer x) {
			return One.valueOf(x.intValue() == 0);
		}
	};

	public IFEQ(int targetPc) {
		super(targetPc);
	}

	public Conditional<Boolean> popConditionValue(FeatureExpr ctx, StackFrame frame) {
		return frame.pop(ctx).mapr(IFEQ_).simplifyValues();
	}

	public int getByteCode() {
		return 0x99;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
