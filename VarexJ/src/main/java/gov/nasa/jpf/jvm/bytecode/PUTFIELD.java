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
import cmu.conditional.IChoice;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.AnnotationInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * Set field in object
 * ..., objectref, value => ...
 */
public class PUTFIELD extends InstanceFieldInstruction implements StoreInstruction {

	public PUTFIELD() {}

	public PUTFIELD(String fieldName, String clsDescriptor, String fieldDescriptor) {
		super(fieldName, clsDescriptor, fieldDescriptor);
	}

	@Override
	protected void popOperands1(FeatureExpr ctx, StackFrame frame) {
//		frame.pop(ctx, 2); // .. objref, val => ..
		popCTX = Conditional.or(popCTX, ctx);
	}

	@Override
	protected void popOperands2(FeatureExpr ctx, StackFrame frame) {
		popCTX = Conditional.or(popCTX, ctx);
//		frame.pop(ctx, 3); // .. objref, highVal,lowVal => ..
	}

	private FeatureExpr popCTX;
	@Override
	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		final StackFrame frame = ti.getModifiableTopFrame();
		Conditional<Integer> objRef = frame.peek(ctx, size);
		lastThis = objRef;
		
		final PUTFIELD instruction = this;
		popCTX = FeatureExprFactory.False();
		Conditional<Instruction> next = objRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer objRef) {
				if (!ti.isFirstStepInsn()) { // top half
					// if this produces an NPE, force the error w/o further ado
					if (objRef == MJIEnv.NULL) {
						return new One<>(ti.createAndThrowException(ctx, "java.lang.NullPointerException", "referencing field '" + fname + "' on null object"));
					}

					ElementInfo ei = ti.getModifiableElementInfoWithUpdatedSharedness(objRef);
					FieldInfo fi = getFieldInfo(ctx);
					if (fi == null) {
						return new One<>(ti.createAndThrowException(ctx, "java.lang.NoSuchFieldError", "no field " + fname + " in " + ei));
					}

					// check if this breaks the current transition
					// note this will also set the shared attribute of the field owner
					if (isNewPorFieldBoundary(ti, fi, objRef)) {
						if (createAndSetSharedFieldAccessCG(ei, ti)) {
							return new One<Instruction>(instruction);
						}
					}

					AnnotationInfo[] annotations = getFieldInfo(ctx).getAnnotations();
					for (AnnotationInfo ai : annotations) {
						if (PUTSTATIC.ANNOTATION_CONDITIONAL.equals(ai.getName())) {
							StackFrame frame = ti.getModifiableTopFrame();
							FeatureExpr feature = Conditional.createFeature(className+ "." + fname + "-" + objRef);
							PUTSTATIC.featureNumber++;
							System.out.println("Found feature #" + PUTSTATIC.featureNumber + " - " + className+ "." + fname + "-" + objRef);
							IChoice<Integer> create = ChoiceFactory.create(feature, One.valueOf(1), One.valueOf(0));
							frame.pop(ctx);
							frame.push(ctx, create);
							break;
						}
					}
					return put(ctx, ti, frame, ei, false);

				} else { // re-execution
					// no need to redo the exception checks, we already had them in the top half
					ElementInfo ei = ti.getElementInfo(objRef);
					
					return put(ctx, ti, frame, ei, false); // this might create an exposure CG and cause another re-execution
				}

			}

		});
		if (!Conditional.isContradiction(popCTX)) {
			if (size == 1) {
		      frame.pop(popCTX, 2);
		    } else {
		      frame.pop(popCTX, 3);
		    }
		}
		return next;
	}

	@Override
	public ElementInfo peekElementInfo(ThreadInfo ti) {
		FieldInfo fi = getFieldInfo(null);
		int storageSize = fi.getStorageSize();
		int objRef = ti.getTopFrame().peek(FeatureExprFactory.True(), (storageSize == 1) ? 1 : 2).getValue();
		ElementInfo ei = ti.getElementInfo(objRef);

		return ei;
	}

	@Override
	public int getLength() {
		return 3; // opcode, index1, index2
	}

	@Override
	public int getByteCode() {
		return 0xB5;
	}

	@Override
	public boolean isRead() {
		return false;
	}

	@Override
	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
