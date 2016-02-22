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

import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.ComplexityPrinter;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Exit monitor for object
 * ..., objectref => ...
 */
public class MONITOREXIT extends LockInstruction {

	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		StackFrame frame = ti.getModifiableTopFrame();

		Conditional<Integer> objref = frame.peek(ctx);
		final MONITOREXIT thisInstruction = this;
		ComplexityPrinter.addComplex(objref.size(), objref.getFeatureCount(), getClass().getSimpleName(), ctx, ti.getTopFrameMethodInfo(), ti);
		return objref.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer objref) {
				if (objref == MJIEnv.NULL) {
					return new One<>(ti.createAndThrowException(ctx, "java.lang.NullPointerException", "attempt to release lock for null object"));
				}

				lastLockRef = objref;

				if (!ti.isFirstStepInsn()) {
					ElementInfo ei = ti.getModifiableElementInfo(objref);

					// we only do this in the bottom half, but before potentially creating
					// a CG so that other threads that might become runnable are included
					ei.unlock(ti); // might still be recursive

					if (ei.getLockCount() == 0) { // this gave up the lock, check for CG
						// this thread obviously has referenced the object before, but other
						// referencers might have terminated so we want to update anyways
						ei = ei.getInstanceWithUpdatedSharedness(ti);
						if (ei.isShared()) {
							VM vm = ti.getVM();
							ChoiceGenerator<?> cg = vm.getSchedulerFactory().createMonitorExitCG(ei, ti);
							if (cg != null) {
								if (vm.setNextChoiceGenerator(cg)) {
									return new One<Instruction>(thisInstruction);
								}
							}
						}
					}
				}

				StackFrame frame = ti.getModifiableTopFrame(); // now we need to modify it
				frame.pop(ctx);

				return getNext(ctx, ti);

			}
		});
	}

	public int getByteCode() {
		return 0xC3;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
