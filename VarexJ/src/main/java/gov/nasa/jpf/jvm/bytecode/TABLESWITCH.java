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

import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * Access jump table by index and jump
 * ..., index => ...
 */
public class TABLESWITCH extends SwitchInstruction implements gov.nasa.jpf.vm.TableSwitchInstruction {

	int min, max;

	public TABLESWITCH(int defaultTarget, int min, int max) {
		super(defaultTarget, (max - min + 1));
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public void setTarget(int value, int target) {
		int i = value - min;

		if (i >= 0 && i < targets.length) {
			targets[i] = target;
		} else {
			throw new JPFException("illegal tableswitch target: " + value);
		}
	}

	protected Conditional<Instruction> executeConditional(FeatureExpr ctx, ThreadInfo ti) {
		StackFrame frame = ti.getModifiableTopFrame();

		Conditional<Integer> value = frame.pop(ctx);
		return value.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer value) {
				int i = value - min;
				int pc;

				if (i >= 0 && i < targets.length) {
					lastIdx = i;
					pc = targets[i];
				} else {
					lastIdx = -1;
					pc = target;
				}

				// <2do> this is BAD - we should compute the target insns just once
				return new One<>(mi.getInstructionAt(pc));
			}

		});
	}

	public int getLength() {
		return 13 + 2 * (matches.length); // <2do> NOT RIGHT: padding!!
	}

	public int getByteCode() {
		return 0xAA;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
