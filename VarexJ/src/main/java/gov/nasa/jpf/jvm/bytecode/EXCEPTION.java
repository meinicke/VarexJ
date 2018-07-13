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

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * Throws the specified error. Not an actual instruction.
 * @author Jens Meinicke
 */
public class EXCEPTION extends JVMInstruction {

	private final String details;
	private final String cname;

	public EXCEPTION(String cname, String details) {
		this.cname = cname;
		this.details = details;
	}

	public EXCEPTION(Instruction callee, String cname, String details) {
		this(cname, details);
		this.insnIndex = callee.getInstructionIndex();
		this.mi = callee.getMethodInfo();
		this.position = callee.getPosition();
	}

	public Conditional<Instruction> execute(FeatureExpr ctx, final ThreadInfo ti) {
		return new One<>(ti.createAndThrowException(ctx, cname, details));
	}

	public int getByteCode() {
		return 0;
	}

	@Override
	public String toString() {
		return cname + " " + details;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if(o == this) {
			return true;
		}
		if (o instanceof EXCEPTION) {
			if (((EXCEPTION) o).cname.equals(cname) && ((EXCEPTION) o).details.equals(details) 
//					&& this.position == ((EXCEPTION) o).position
					) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return cname.hashCode() + details.hashCode() * 31;
	}

}
