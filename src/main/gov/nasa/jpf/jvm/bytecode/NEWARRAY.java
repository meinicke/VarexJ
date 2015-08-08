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

import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Heap;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;
import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.utils.ComplexityPrinter;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Create new array
 * ..., count => ..., arrayref
 */
public class NEWARRAY extends NewArrayInstruction {

	public NEWARRAY(int typeCode) {
		type = Types.getElementDescriptorOfType(typeCode);
	}

	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		final StackFrame frame = ti.getModifiableTopFrame();

		arrayLength = frame.pop(ctx);
		final Heap heap = ti.getHeap();
		ComplexityPrinter.addComplex(arrayLength.size(), getClass().getSimpleName(), ctx, ti.getTopFrameMethodInfo());
		return arrayLength.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer arrayLength) {

				if (arrayLength < 0) {
					return new One<>(ti.createAndThrowException(ctx, "java.lang.NegativeArraySizeException"));
				}

				// there is no clinit for array classes, but we still have to create a class object
				// since its a builtin class, we also don't have to bother with NoClassDefFoundErrors
				String clsName = "[" + type;
				ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);

				if (!ci.isRegistered()) {
					ci.registerClass(ctx, ti);
					ci.setInitialized();
				}

				if (heap.isOutOfMemory()) { // simulate OutOfMemoryError
					return new One<>(ti.createAndThrowException(ctx, "java.lang.OutOfMemoryError", "trying to allocate new " + getTypeName() + "[" + arrayLength + "]"));
				}

				ElementInfo eiArray = heap.newArray(ctx, type, arrayLength, ti);
				int arrayRef = eiArray.getObjectRef();

				frame.pushRef(ctx, arrayRef);

				return getNext(ctx, ti);

			}

		});
	}

	public int getLength() {
		return 2; // opcode, atype
	}

	public int getByteCode() {
		return 0xBC;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("newarray ");
		sb.append(getTypeName());
		sb.append('[');
		sb.append(arrayLength);
		sb.append(']');

		return sb.toString();
	}
}
