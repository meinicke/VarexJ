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
import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * Remainder int ..., value1, value2 => ..., result
 */
public class IREM extends JVMInstruction {

	@Override
	  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
		  final StackFrame frame = ti.getModifiableTopFrame();

		  @SuppressWarnings("unchecked")
		  final Conditional<Integer>[] pushValue = new Conditional[] {One.valueOf(0)};
		  final FeatureExpr[] pushCtx = new FeatureExpr[] {ctx};
		  final Conditional<Integer> v1 = frame.pop(ctx);
		  final Conditional<Integer> v2 = frame.pop(ctx);
		  final Conditional<Instruction> returnInstruction = v1.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

				@Override
				public Conditional<Instruction> apply(FeatureExpr ctx, final Integer v1) {
				    if (v1 == 0){
				    	pushCtx[0] = Conditional.andNot(pushCtx[0],ctx);
				    	return new One<>(new EXCEPTION(IREM.this, java.lang.ArithmeticException.class, "division by zero"));
				    }
				    
				    pushValue[0] = ChoiceFactory.create(ctx, v2.mapr(v2 -> One.valueOf(v2 % v1)), pushValue[0]);
					return getNext(ctx, ti);

				}
		    	
	    });
		frame.push(pushCtx[0], pushValue[0]);
	    return returnInstruction;
	  }

	public int getByteCode() {
		return 0x70;
	}

}
