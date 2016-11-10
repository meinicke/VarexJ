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

import java.util.function.Function;

import cmu.conditional.Conditional;
import cmu.vatrace.ArrayStoreStatement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.StackFrame;


/**
 * Store into char array
 * ..., arrayref, index, value  => ...
 */
public class CASTORE extends ArrayStoreInstruction {

  Conditional<Character> value;

  protected void popValue(FeatureExpr ctx, StackFrame frame){
    value = frame.pop(ctx).map(new Function<Integer, Character>() {

		@Override
		public Character apply(Integer x) {
			return (char)x.intValue();
		}
    	
    });
  }

	protected void setField(FeatureExpr ctx, ElementInfo ei, int index, StackFrame frame) throws ArrayIndexOutOfBoundsExecutiveException {
		ei.checkArrayBounds(ctx, index);

		Conditional<Character> oldValue = ei.getCharElement(index).simplify();
	
		ei.setCharElement(ctx, index, value);
		
		Conditional<Character> newValue = ei.getCharElement(index).simplify();
		new ArrayStoreStatement(frame.method, index, oldValue, newValue, ei, ctx);
	}

  public int getByteCode () {
    return 0x55;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
