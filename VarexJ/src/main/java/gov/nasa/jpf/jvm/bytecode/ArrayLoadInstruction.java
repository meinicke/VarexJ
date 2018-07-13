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
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * abstraction for all array load instructions
 *
 * ..., array, index => ..., value
 */
public abstract class ArrayLoadInstruction extends ArrayElementInstruction {

	private Conditional pushValue = One.valueOf(0);
	private FeatureExpr pushCtx;
	
	@Override
	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		pushValue = One.valueOf(0);
		final StackFrame frame = ti.getModifiableTopFrame();
		final Instruction thisInstruction = this;
		// we need to get the object first, to check if it is shared
		Conditional<Integer> aref = frame.peek(ctx, 1); // ..,arrayRef,idx
		final ArrayLoadInstruction instruction = this;
		pushCtx = ctx;
		Conditional<Instruction> next = aref.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer aref) {
				if (aref == MJIEnv.NULL) {
					pushCtx = Conditional.andNot(pushCtx,ctx);
					return new One<>(new EXCEPTION("java.lang.NullPointerException", ""));
				}

				final ElementInfo e = ti.getElementInfoWithUpdatedSharedness(aref);
				if (isNewPorBoundary(e, ti)) {
					if (createAndSetArrayCG(e, ti, aref, peekIndex(ctx, ti), true)) {
						pushCtx = Conditional.andNot(pushCtx,ctx);
						return new One<>(instruction);
					}
				}
				return new One<>(null);
			}
		});
		if (Conditional.isContradiction(pushCtx)) {
			return next;
		}

		index = frame.pop(ctx);
		// we should not set 'arrayRef' before the CG check
		// (this would kill the CG loop optimization)
		arrayRef = frame.pop(ctx).simplify(pushCtx);
		next = ChoiceFactory.create(pushCtx, arrayRef.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer aref) {
				final ElementInfo e = ti.getElementInfoWithUpdatedSharedness(aref);
				return index.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

					@Override
					public Conditional<Instruction> apply(FeatureExpr ctx, Integer index) {
						try {
							final Conditional push = getPushValue(ctx, frame, e, index);
							pushValue = ChoiceFactory.create(ctx, push, pushValue);
							return getNext(ctx, ti);
						} catch (ArrayIndexOutOfBoundsException ex) {
							pushCtx = Conditional.andNot(pushCtx,ctx);
							return new One<>(new EXCEPTION(thisInstruction,
									java.lang.ArrayIndexOutOfBoundsException.class.getName(), Integer.toString(index)));
						}
					}

				});
			}

		}), next);

		pushValue(pushCtx, frame, pushValue);
		
		if (index.isOne() && aref.isOne()) {
			// TODO
			final ElementInfo e = ti.getElementInfoWithUpdatedSharedness(aref.getValue());
			Object attr = e.getElementAttr(index.getValue());
			if (attr != null) {
				if (getElementSize() == 1) {
					frame.setOperandAttr(attr);
				} else {
					frame.setLongOperandAttr(attr);
				}
			}
		}
		return next;
	}

	protected abstract void pushValue(FeatureExpr ctx, StackFrame frame, Conditional value);

	protected boolean isReference() {
		return false;
	}

	/**
	 * only makes sense pre-exec
	 */
	@Override
	public Conditional<Integer> peekArrayRef(FeatureExpr ctx, ThreadInfo ti) {
		return ti.getTopFrame().peek(ctx, 1);
	}

	// wouldn't really be required for loads, but this is a general
	// ArrayInstruction API
	@Override
	public Conditional<Integer> peekIndex(FeatureExpr ctx, ThreadInfo ti) {
		return ti.getTopFrame().peek(ctx);
	}

	protected abstract Conditional<?> getPushValue(FeatureExpr ctx, StackFrame frame, ElementInfo e, int index) throws ArrayIndexOutOfBoundsExecutiveException;

	@Override
	public boolean isRead() {
		return true;
	}

}
