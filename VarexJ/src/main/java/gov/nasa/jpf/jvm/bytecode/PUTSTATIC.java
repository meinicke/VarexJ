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

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.IChoice;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * Set static field in class
 * ..., value => ...
 */
public class PUTSTATIC extends StaticFieldInstruction implements StoreInstruction {

	public PUTSTATIC() {}

	public PUTSTATIC(String fieldName, String clsDescriptor, String fieldDescriptor) {
		super(fieldName, clsDescriptor, fieldDescriptor);
	}

	@Override
	protected void popOperands1(FeatureExpr ctx, StackFrame frame) {
		frame.pop(ctx); // .. val => ..
	}

	@Override
	protected void popOperands2(FeatureExpr ctx, StackFrame frame) {
		frame.pop(ctx, 2); // .. highVal, lowVal => ..
	}

	static final String ANNOTATION_CONDITIONAL = gov.nasa.jpf.annotation.Conditional.class.getName();
	static int featureNumber = 0;
	
	@Override
	public Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti) {
		if (getFieldInfo(ctx).getAnnotation(ANNOTATION_CONDITIONAL) != null) {
			StackFrame frame = ti.getModifiableTopFrame();
			FeatureExpr feature = Conditional.createFeature(fname);
			featureNumber++;
			System.out.println("Found feature #" + featureNumber + " - " + fname + " @" + className);
			IChoice<Integer> create = ChoiceFactory.create(feature, One.valueOf(1), One.valueOf(0));
			frame.pop(ctx);
			frame.push(ctx, create);
		}
		
		if (!ti.isFirstStepInsn()) { // top half
			FieldInfo fieldInfo;

			try {
				fieldInfo = getFieldInfo(ctx);
			} catch (LoadOnJPFRequired lre) {
				return ti.getPC();
			}

			if (fieldInfo == null) {
				return new One<>(ti.createAndThrowException(ctx, "java.lang.NoSuchFieldError", (className + '.' + fname)));
			}

			ClassInfo ciField = fi.getClassInfo();
			if (!mi.isClinit(ciField) && ciField.pushRequiredClinits(ctx, ti)) {
				// note - this returns the next insn in the topmost clinit that just got pushed
				return ti.getPC();
			}

			ElementInfo ei = ciField.getStaticElementInfo();
			ei = ei.getInstanceWithUpdatedSharedness(ti);
			if (isNewPorFieldBoundary(ti)) {
				if (createAndSetSharedFieldAccessCG(ei, ti)) {
					return new One<Instruction>(this);
				}
			}

			ei = ei.getModifiableInstance();
			return put(ctx, ti, ti.getTopFrame(), ei, true);

		} else { // re-execution
			// no need to redo the exception checks, we already had them in the top half
			ClassInfo ciField = fi.getClassInfo();
			ElementInfo ei = ciField.getStaticElementInfo();

			ei = ei.getModifiableInstance();
			return put(ctx, ti, ti.getTopFrame(), ei, false);
		}
	}

	public int getLength() {
		return 3; // opcode, index1, index2
	}

	public int getByteCode() {
		return 0xB3;
	}

	public boolean isRead() {
		return false;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
