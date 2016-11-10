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

import java.util.function.BiFunction;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.vatrace.FieldGetStatement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * Fetch field from object
 * ..., objectref => ..., value
 */
public class GETFIELD extends InstanceFieldInstruction {

	public GETFIELD(String fieldName, String classType, String fieldDescriptor) {
		super(fieldName, classType, fieldDescriptor);
	}

	@Override
	protected void popOperands1(FeatureExpr ctx, StackFrame frame) {
//		frame.pop(ctx); // .. val => ..
	}

	@Override
	protected void popOperands2(FeatureExpr ctx, StackFrame frame) {
//		frame.pop(ctx, 2); // .. highVal, lowVal => ..
	}

	private FeatureExpr pushCTX;
	private Conditional pushValue = One.valueOf(0);
	
	@Override
	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		final StackFrame frame = ti.getModifiableTopFrame();
		Conditional<Integer> objRef = frame.peek(ctx); // don't pop yet, we might re-enter

		lastThis = objRef;
		final GETFIELD thisInstruction = this;
		pushCTX = ctx;
		Conditional<Instruction> next = objRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer objRef) {
				if (objRef == MJIEnv.NULL) {
					pushCTX = pushCTX.andNot(ctx);
					return new One<>(ti.createAndThrowException(ctx, "java.lang.NullPointerException", "referencing field '" + fname + "' on null object"));
				}

				ElementInfo ei = ti.getElementInfoWithUpdatedSharedness(objRef);

				FieldInfo fi = getFieldInfo(ctx);
				if (fi == null) {
					pushCTX = pushCTX.andNot(ctx);
					return new One<>(ti.createAndThrowException(ctx, "java.lang.NoSuchFieldError", "referencing field '" + fname + "' in " + ei));
				}

				// check if this breaks the current transition
				if (isNewPorFieldBoundary(ti, fi, objRef)) {
					if (createAndSetSharedFieldAccessCG(ei, ti)) {
						pushCTX = pushCTX.andNot(ctx);
						return new One<Instruction>(thisInstruction);
					}
				}
				return (Conditional<Instruction>) One.NULL;
			}
		});
		if (Conditional.isContradiction(pushCTX)) {
			return next;
		}
		frame.pop(pushCTX, 1); // Ok, now we can remove the object ref from the stack
		next = ChoiceFactory.create(pushCTX, objRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer objRef) {
				ElementInfo ei = ti.getElementInfoWithUpdatedSharedness(objRef);
				attr = ei.getFieldAttr(fi);

				
				// We could encapsulate the push in ElementInfo, but not the GET, so we keep it at a similiar level
				if (fi.getStorageSize() == 1) { // 1 slotter
					pushValue = ChoiceFactory.create(ctx, ei.get1SlotField(fi), pushValue);
				} else { // 2 slotter
					pushValue = ChoiceFactory.create(ctx, ei.get2SlotField(fi), pushValue);
				}
				
				new FieldGetStatement(pushValue.simplify(ctx), frame.method, fi, ctx);
				
				return getNext(ctx, ti);

			}
		}), next);
		if (fi.isReference()) {
			frame.pushRef(pushCTX, pushValue);
		} else {
			frame.push(pushCTX, pushValue);
		}
		if (size == 1) {
			if (attr != null) {
				frame.setOperandAttr(attr);
			}
		} else {
			if (attr != null) {
				frame.setLongOperandAttr(attr);
			}
		}
		
		return next;
	}

	public ElementInfo peekElementInfo(ThreadInfo ti) {
		StackFrame frame = ti.getTopFrame();
		int objRef = frame.peek(FeatureExprFactory.True()).getValue();
		ElementInfo ei = ti.getElementInfo(objRef);
		return ei;
	}

	public int getLength() {
		return 3; // opcode, index1, index2
	}

	public int getByteCode() {
		return 0xB4;
	}

	public boolean isRead() {
		return true;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
