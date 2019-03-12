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
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;


/**
 * Get length of array 
 * ..., arrayref => ..., length
 */
public class ARRAYLENGTH extends ArrayInstruction {
    
	private Conditional<Integer> pushValue = One.valueOf(0);
	private FeatureExpr pushCtx; 
	
	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		pushValue = One.valueOf(0);
		final StackFrame frame = ti.getModifiableTopFrame();

		arrayRef = frame.pop(ctx);
		pushCtx = ctx;
		final Conditional<Instruction> next = arrayRef.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer arrayRef) {
				if (arrayRef == MJIEnv.NULL) {
					pushCtx = Conditional.andNot(pushCtx,ctx);
					return new One<>(new EXCEPTION(ARRAYLENGTH.this, NullPointerException.class,
							"array length of null object"));
				}

				ElementInfo ei = ti.getElementInfo(arrayRef);
				pushValue = ChoiceFactory.create(ctx, ei.arrayLength(), pushValue);
				return getNext(ctx, ti);

			}

		});
		frame.push(pushCtx, pushValue);
		return next;
	}
  
  @Override
  public int getByteCode () {
    return 0xBE;
  }
  
  @Override
  protected Conditional<Integer> peekArrayRef (FeatureExpr ctx, ThreadInfo ti) {
    return ti.getTopFrame().peek(FeatureExprFactory.True());
  }
}
