//
// Copyright (C) 2012 United States Government as represented by the
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

package gov.nasa.jpf.jvm;

import java.lang.reflect.InvocationTargetException;

import gov.nasa.jpf.jvm.bytecode.InstructionVisitor;
import gov.nasa.jpf.jvm.bytecode.InstructionVisitorAcceptor;
import gov.nasa.jpf.vm.Instruction;

/**
 * an Instruction class that implements an InstructionVisitorAcceptor
 * This is the common root class for all Java bytecodes
 */
public abstract class JVMInstruction extends Instruction implements InstructionVisitorAcceptor {

	@Override
	public final void accept(InstructionVisitor insVisitor) {
			try {
				InstructionVisitor.class.getMethod("visit", this.getClass()).invoke(insVisitor, this);
			} catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
				e.printStackTrace();
			}
	}

}
