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

import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import cmu.utils.ComplexityPrinter;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Divide int ..., value1, value2 =>..., result
 */
public class IDIV extends JVMInstruction {

	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		final StackFrame frame = ti.getModifiableTopFrame();

		Conditional<Integer> v1 = frame.pop(ctx);
		final Conditional<Integer> v2 = frame.pop(ctx);
		final IDIV thisInstruction = this;
		 Conditional<Instruction> result = v1.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

				@Override
				public Conditional<Instruction> apply(FeatureExpr ctx, final Integer v1) {
				    if (v1 == 0){
				      return new One<Instruction>(new EXCEPTION(thisInstruction, "java.lang.ArithmeticException", "division by zero"));
				    }
				    
					frame.push(ctx, v2.mapr(new Function<Integer, Conditional<Integer>>() {

						@Override
						public Conditional<Integer> apply(Integer v2) {
							return One.valueOf(v2.intValue() / v1.intValue());
						}
						
					}));

				    return getNext(ctx, ti);
				}
		    	
		    }).simplify();
		 ComplexityPrinter.addComplex(v1.size() * v2.size(), result.getFeatureCount(), getClass().getSimpleName(), ctx, frame.getMethodInfo(), ti);
		 return result;
	}

	public int getByteCode() {
		return 0x6C;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
