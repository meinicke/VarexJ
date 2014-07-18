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

import gov.nasa.jpf.jvm.bytecode.extended.Choice;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.Stack;
import gov.nasa.jpf.vm.StackHandler;
import gov.nasa.jpf.vm.ThreadInfo;

import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * a base class for virtual call instructions
 */
public abstract class VirtualInvocation extends InstanceInvocation {

	// note that we can't null laseCalleeCi and invokedMethod in
	// cleanupTransients()
	// since we use it as an internal optimization (loops with repeated calls on
	// the
	// same object)

	ClassInfo lastCalleeCi; // cached for performance

	protected VirtualInvocation() {
	}

	protected VirtualInvocation(String clsDescriptor, String methodName, String signature) {
		super(clsDescriptor, methodName, signature);
	}

	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		
		Conditional<Integer> allRefs = ti.getCalleeThis(ctx, getArgSize());
		Map<Integer, FeatureExpr> map = allRefs.toMap();
		boolean splitRef = false;
		if (map.size() > 1) {
			splitRef = true;
		}
		for (Integer objRef : map.keySet()) {
			if (splitRef) {
				ctx = ctx.and(map.get(objRef));
			}
			
			if (objRef == MJIEnv.NULL) {
				lastObj = MJIEnv.NULL;
				return new One<>(ti.createAndThrowException(ctx, "java.lang.NullPointerException", "Calling '" + mname + "' on null object"));
			}

			MethodInfo callee = getInvokedMethod(ti, objRef);
			ElementInfo ei = ti.getElementInfoWithUpdatedSharedness(objRef);

			if (callee == null) {
				String clsName = ti.getClassInfo(objRef).getName();
				return new One<>(ti.createAndThrowException(ctx, "java.lang.NoSuchMethodError", clsName + '.' + mname));
			} else {
				if (callee.isAbstract()) {
					return new One<>(ti.createAndThrowException(ctx, "java.lang.AbstractMethodError", callee.getFullName() + ", object: " + ei));
				}
			}

			if (callee.isSynchronized()) {
				if (checkSyncCG(ei, ti)) {
					return new One<Instruction>(this);
				}
			}
			

			// set ctx for native method calls
			if (callee.isMJI()) {
				 StackHandler stack = ti.getTopFrame().stack;
				 if (stack.getStackWidth() > 1) {
					 boolean split = false;
					 for (int i = 0; i < callee.getNumberOfArguments(); i++) {
						 if (stack.peek(ctx, i) instanceof Choice) {
							 split = true;
							 splitRef = true;
							 break;
						 }
					 }
					 
					 if (split) {
						 Map<Stack, FeatureExpr> stacks = stack.stack.simplify(ctx).toMap();
						 for (FeatureExpr c : stacks.values()) {
							 ctx = ctx.and(c);
							 break;
						 }
					 }
				 }
			}
			
			setupCallee(ctx, ti, callee); // this creates, initializes and
											// pushes the callee StackFrame

			if (!splitRef) {
				return ti.getPC();
			}
			return new Choice<>(ctx, ti.getPC(), new One<>(typeSafeClone(mi))).simplify(); // we can't just return the first callee insn
								// if a listener throws an exception

		}
		throw new RuntimeException("Something went wrong");
	}

	/**
	 * If the current thread already owns the lock, then the current thread can
	 * go on. For example, this is a recursive acquisition.
	 */
	protected boolean isLockOwner(ThreadInfo ti, ElementInfo ei) {
		return ei.getLockingThread() == ti;
	}

	/**
	 * If the object will still be owned, then the current thread can go on. For
	 * example, all but the last monitorexit for the object.
	 */
	protected boolean isLastUnlock(ElementInfo ei) {
		return ei.getLockCount() == 1;
	}

	public MethodInfo getInvokedMethod(FeatureExpr ctx, ThreadInfo ti) {
		int objRef;

		if (ti.getNextPC() == null) { // this is pre-exec
			objRef = ti.getCalleeThis(FeatureExprFactory.True(), getArgSize()).getValue();
		} else { // this is post-exec
			objRef = lastObj;
		}

		return getInvokedMethod(ti, objRef);
	}

	public MethodInfo getInvokedMethod(ThreadInfo ti, int objRef) {

		if (objRef != MJIEnv.NULL) {
			lastObj = objRef;

			ClassInfo cci = ti.getClassInfo(objRef);
			if (lastCalleeCi != cci) { // callee ClassInfo has changed
				lastCalleeCi = cci;
				invokedMethod = cci.getMethod(mname, true);
				// here we could catch the NoSuchMethodError
				if (invokedMethod == null) {
					lastObj = MJIEnv.NULL;
					lastCalleeCi = null;
				}
			}

		} else {
			lastObj = MJIEnv.NULL;
			lastCalleeCi = null;
			invokedMethod = null;
		}

		return invokedMethod;
	}

	public Object getFieldValue(String id, ThreadInfo ti) {
		int objRef = getCalleeThis(ti);
		ElementInfo ei = ti.getElementInfo(objRef);

		Object v = ei.getFieldValueObject(id);

		if (v == null) { // try a static field
			v = ei.getClassInfo().getStaticFieldValueObject(id);
		}

		return v;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}

	@Override
	public Instruction typeSafeClone(MethodInfo clonedMethod) {
		VirtualInvocation clone = null;

		try {
			clone = (VirtualInvocation) super.clone();

			// reset the method that this insn belongs to
			clone.mi = clonedMethod;

			clone.lastCalleeCi = null;
			clone.invokedMethod = null;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}
	

}
