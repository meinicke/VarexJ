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
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

/**
 * Check whether object is of given type
 * ..., objectref => ..., objectref
 */
public class CHECKCAST extends JVMInstruction {
	String type;

	public CHECKCAST() {} // this is going away

	public CHECKCAST(String typeName) {
		type = Types.getClassNameFromTypeName(typeName);
	}

	public String getTypeName() {
		return type;
	}

	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		StackFrame frame = ti.getTopFrame();
		Conditional<Integer> objref = frame.peek(ctx);

		return objref.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr ctx, Integer objref) {
				if (objref == MJIEnv.NULL) {
					// we can cast 'null' to anything

				} else {
					boolean isValid = false;

					if (Types.isReferenceSignature(type)) {
						String t;
						if (Types.isArray(type)) {
							// retrieve the component terminal
							t = Types.getComponentTerminal(type);
						} else {
							t = type;
						}

						// resolve the referenced class
						try {
							ti.resolveReferencedClass(t);
						} catch (LoadOnJPFRequired lre) {
							return ti.getPC();
						}
					}

					ElementInfo e = ti.getElementInfo(objref);
					ClassInfo eci = e.getClassInfo();

					if (type.charAt(0) == '[') { // cast between array types
						String arrayType = type;
						ClassInfo cci = eci;
						while (true) {
							if (cci.isArray()) {
								cci = cci.getComponentClassInfo();
								arrayType = arrayType.substring(1);
							} else {
								break;
							}
							if (arrayType.charAt(0) != '[') {
								isValid = cci.isInstanceOf(arrayType);
								break;
							}
						}

					} else { // non-array types
						isValid = e.getClassInfo().isInstanceOf(type);
					}

					if (!isValid) {
						return new One<>(new EXCEPTION(CHECKCAST.this, ClassCastException.class.getName(), e.getClassInfo().getName() + " cannot be cast to " + type));
					}
				}

				return getNext(ctx, ti);
			}

		});
	}

	public int getLength() {
		return 3; // opcode, index1, index2
	}

	public int getByteCode() {
		return 0xC0;
	}

}
