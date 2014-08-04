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
import cmu.conditional.Function;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.StackFrame;
import de.fosd.typechef.featureexpr.FeatureExpr;


/**
 * Store into float array
 * ..., arrayref, index, value => ...
 */
public class FASTORE extends ArrayStoreInstruction {

  Conditional<Float> value;

  protected void popValue(FeatureExpr ctx, StackFrame frame){
    value = frame.pop(ctx).map(new Function<Integer, Float>() {

		@Override
		public Float apply(Integer v) {
			return Float.intBitsToFloat(v);
		}
    	
    });
  }

  protected void setField (FeatureExpr ctx, ElementInfo ei, int index) throws ArrayIndexOutOfBoundsExecutiveException {
    ei.checkArrayBounds(ctx, index);
    ei.setFloatElement(ctx, index, value);
  }


  public int getByteCode () {
    return 0x51;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
}
