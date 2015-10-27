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

import java.util.Arrays;

import cmu.conditional.BiFunction;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.jvm.JVMInstruction;
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
 * Create new multidimensional array
 * ..., count1, [count2, ...] => ..., arrayref
 */
public class MULTIANEWARRAY extends JVMInstruction {
	protected String type;

	protected int dimensions;
	protected Conditional<Integer>[] arrayLengths;

	public MULTIANEWARRAY(String typeName, int dimensions) {
		this.type = Types.getClassNameFromTypeName(typeName);
		this.dimensions = dimensions;
	}

	public static Conditional<Integer> allocateArray(final Heap heap, final String type, final Conditional<Integer>[] dim, final ThreadInfo ti, final int d) {
		Conditional<Integer> l = dim[d];
		return l.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Integer l) {
				ElementInfo eiArray = (heap.newArray(ctx, type.substring(d + 1), l, ti));

				if (dim.length > (d + 1)) {
					for (int i = 0; i < l; i++) {
						eiArray.setReferenceElement(ctx, i, allocateArray(heap, type, dim, ti, d + 1));
					}
				}

				return new One<>(eiArray.getObjectRef());
			}

		});

	}

	public Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti) {
		String compType = Types.getComponentTerminal(type);

		// resolve the component class first
		if (Types.isReferenceSignature(type)) {
			try {
				ti.resolveReferencedClass(compType);
			} catch (LoadOnJPFRequired lre) {
				return ti.getPC();
			}
		}

		arrayLengths = new Conditional[dimensions];
		Arrays.fill(arrayLengths, new One<>(0));
		StackFrame frame = ti.getModifiableTopFrame();

		for (int i = dimensions - 1; i >= 0; i--) {
			arrayLengths[i] = frame.pop(ctx);
		}

		// there is no clinit for array classes, but we still have to create a class object
		// since its a builtin class, we also don't have to bother with NoClassDefFoundErrors
		ClassInfo ci = ClassLoaderInfo.getCurrentResolvedClassInfo(type);
		if (!ci.isRegistered()) {
			ci.registerClass(ctx, ti);
			ci.setInitialized();
		}

		Conditional<Integer> arrayRef = allocateArray(ti.getHeap(), type, arrayLengths, ti, 0);

		// put the result (the array reference) on the stack
		frame.pushRef(ctx, arrayRef);

		return getNext(ctx, ti);
	}

	public int getLength() {
		return 4; // opcode, index1, index2, dimensions
	}

	public int getByteCode() {
		return 0xC5;
	}

	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}

	public String getType() {
		return type;
	}

	public int getDimensions() {
		return dimensions;
	}

	public int getArrayLength(int dimension) {
		if (dimension < dimensions && arrayLengths != null) {
			return arrayLengths[dimension].getValue();
		} else {
			return -1;
		}
	}

	@Override
	public void cleanupTransients() {
		arrayLengths = null;
	}
}
