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

import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.vatrace.ArrayStoreStatement;
import cmu.vatrace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * Store into reference array
 * ..., arrayref, index, value => ...
 */
public class AASTORE extends ArrayStoreInstruction {

	Conditional<Integer> value;

	protected void popValue(FeatureExpr ctx, StackFrame frame) {
		value = frame.pop(ctx);
	}

	protected void setField(FeatureExpr ctx, ElementInfo ei, int index, StackFrame frame) throws ArrayIndexOutOfBoundsExecutiveException {
		try {
			ei.checkArrayBounds(ctx, index);
		} catch (ArrayIndexOutOfBoundsExecutiveException e) {
			Statement statement = new Statement(this, frame.method, ctx);
			throw e;
		}

		Statement statement = new ArrayStoreStatement(this, frame.method, index, ei.getReferenceElement(index), value, ei, ctx);
		
		ei.setReferenceElement(ctx, index, value);
	}

	protected Conditional<Instruction> checkArrayStoreException(FeatureExpr ctx, final ThreadInfo ti, ElementInfo ei) {
		final ClassInfo c = ei.getClassInfo();

		return value.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@SuppressWarnings("unchecked")
			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer value) {
				if (value != MJIEnv.NULL) { // no checks for storing 'null'
					ClassInfo elementCi = ti.getClassInfo(value);
					ClassInfo arrayElementCi = c.getComponentClassInfo();
					if (!elementCi.isInstanceOf(arrayElementCi)) {
						String exception = "java.lang.ArrayStoreException";
						String exceptionDescription = elementCi.getName();
						return new One<>(ti.createAndThrowException(ctx, exception, exceptionDescription));
					}
				}

				return (Conditional<Instruction>) One.NULL;
			}

		}).simplify();
	}

	public int getByteCode() {
		return 0x53;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}
}
