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
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Heap;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

/**
 * Create new array of reference
 * ..., count => ..., arrayref
 */
public class ANEWARRAY extends NewArrayInstruction {

	public ANEWARRAY(String typeDescriptor) {
		type = Types.getTypeSignature(typeDescriptor, true);
	}
	
	private Conditional<Integer> pushValue = One.valueOf(0);

	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		pushValue = One.valueOf(0);
		// resolve the component class first
		String compType = Types.getTypeName(type);
		if (Types.isReferenceSignature(type)) {
			try {
				ti.resolveReferencedClass(compType);
			} catch (LoadOnJPFRequired lre) {
				return ti.getPC();
			}
		}

		// there is no clinit for array classes, but we still have to create a class object
		// since its a builtin class, we also don't have to bother with NoClassDefFoundErrors
		String clsName = "[" + type;
		ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(clsName);

		if (!ci.isRegistered()) {
			ci.registerClass(ctx, ti);
			ci.setInitialized();
		}

		final StackFrame frame = ti.getModifiableTopFrame();

		arrayLength = frame.pop(ctx);
		final Conditional<Instruction> next = arrayLength.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer arrayLength) {

				if (arrayLength < 0) {
					return new One<>(ti.createAndThrowException(ctx, "java.lang.NegativeArraySizeException"));
				}

				Heap heap = ti.getHeap();
				if (heap.isOutOfMemory()) { // simulate OutOfMemoryError
					return new One<>(ti.createAndThrowException(ctx, "java.lang.OutOfMemoryError", "trying to allocate new " + Types.getTypeName(type) + "[" + arrayLength + "]"));
				}

				ElementInfo eiArray = heap.newArray(ctx, type, arrayLength, ti);
				int aRef = eiArray.getObjectRef();

				// pushes the object reference on the top stack frame
				
				pushValue = ChoiceFactory.create(ctx, One.valueOf(aRef), pushValue);

				return getNext(ctx, ti);
			}

		});
		
		frame.pushRef(ctx, pushValue);
		return next;
	}

	public int getLength() {
		return 3; // opcode, index1, index2
	}

	public int getByteCode() {
		return 0xBD;
	}

}
