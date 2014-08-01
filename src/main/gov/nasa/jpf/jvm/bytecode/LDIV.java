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
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Divide long ..., value1, value2 => ..., result
 */
public class LDIV extends JVMInstruction {

	@Override
	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		final StackFrame frame = ti.getModifiableTopFrame();

		Conditional<Long> v1 = frame.popLong(ctx);
		final Conditional<Long> v2 = frame.popLong(ctx);

		 return v1.mapf(ctx, new BiFunction<FeatureExpr, Long, Conditional<Instruction>>() {

				@Override
				public Conditional<Instruction> apply(FeatureExpr ctx, final Long v1) {
				    if (v1 == 0){
				      return new One<>(ti.createAndThrowException(ctx,"java.lang.ArithmeticException", "division by zero"));
				    }
				    
					frame.push(ctx, v2.map(new Function<Long, Long>() {

						@Override
						public Long apply(Long v2) {
							return v2.longValue() / v1.longValue();
						}
						
					}));

				    return getNext(ctx, ti);
				}
		    	
		    });
	}

	@Override
	public int getByteCode() {
		return 0x6D;
	}

	@Override
	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
