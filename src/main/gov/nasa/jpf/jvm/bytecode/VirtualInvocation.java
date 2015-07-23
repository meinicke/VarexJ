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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

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
		final FeatureExpr originalCtx = ctx;
		Conditional<Integer> allRefs = ti.getCalleeThis(ctx, getArgSize());
		
		Map<Integer, FeatureExpr> map = allRefs.toMap();
		
		Map<String, FeatureExpr> classes = new HashMap<>();
		if (map.size() > 1) {
			for (Entry<Integer, FeatureExpr> e : map.entrySet()) {
				ClassInfo ci = ti.getClassInfo(e.getKey());
				String clsName = ci == null ? null : ci.getName();
				if (classes.containsKey(clsName)) {
					classes.put(clsName, classes.get(clsName).or(e.getValue()));
				} else {
					classes.put(clsName, e.getValue());
				}
				
			}
		}
		
		boolean splitRef = false;
		if (classes.size() > 1) {
			splitRef = true;
		}
		for (Entry<Integer, FeatureExpr> objRefEntry : map.entrySet()) {
			
			Integer objRef = objRefEntry.getKey();
			if (objRef == MJIEnv.NULL) {
				lastObj = MJIEnv.NULL;
				return ChoiceFactory.create(ctx.and(objRefEntry.getValue()), new One<Instruction>(new EXCEPTION(this, java.lang.NullPointerException.class.getName(), "Calling '" + mname + "' on null object")), new One<>(typeSafeClone(mi))).simplify();
			}
			MethodInfo callee = getInvokedMethod(ctx, ti, objRef);
			ElementInfo ei = ti.getElementInfoWithUpdatedSharedness(objRef);
			if (!classes.isEmpty() && !callee.isMJI()) {
				ctx = originalCtx.and(classes.get(ti.getClassInfo(objRef).getName()));
			} else {
				ctx = originalCtx.and(objRefEntry.getValue());
			}

			if (callee == null) {
				String clsName = ti.getClassInfo(objRef).getName();
				return new One<>(ti.createAndThrowException(ctx, java.lang.NoSuchMethodError.class.getName(), clsName + '.' + mname));
			} else {
				if (callee.isAbstract()) {
					return new One<>(ti.createAndThrowException(ctx, java.lang.AbstractMethodError.class.getName(), callee.getFullName() + ", object: " + ei));
				}
			}
			
			if (callee.isSynchronized()) {
				if (checkSyncCG(ei, ti)) {
					return new One<Instruction>(this);
				}
			}
						
			if (callee.isMJI()) {
				// TODO Jens fix MJI initialization 
				setupCallee(ctx, ti, callee); // this creates, initializes and
				if (!splitRef) {
					return ti.getPC();
				}
				return ChoiceFactory.create(ctx, ti.getPC(), new One<>(typeSafeClone(mi))).simplify();
				
			} else {
				setupCallee(ctx, ti, callee);
				if (!splitRef) {
					return ti.getPC();
				}
				return ChoiceFactory.create(ctx, ti.getPC(), new One<>(typeSafeClone(mi))).simplify();
			}
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

		return getInvokedMethod(ctx, ti, objRef);
	}

	public MethodInfo getInvokedMethod(FeatureExpr ctx, ThreadInfo ti, int objRef) {

		if (objRef != MJIEnv.NULL) {
			lastObj = objRef;

			ClassInfo cci = ti.getClassInfo(objRef);
			if (lastCalleeCi != cci) { // callee ClassInfo has changed
				lastCalleeCi = cci;
				if (cci == null) {
					System.out.println("Class not found for " + mname);
					ti.createAndThrowException(ctx, ClassNotFoundException.class.getName(), mname);
					return null;
				}
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
