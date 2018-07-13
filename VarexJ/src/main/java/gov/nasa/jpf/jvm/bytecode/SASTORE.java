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
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.StackFrame;

/**
 * Store into short array 
 * ..., array, index, value => ...
 */
public class SASTORE extends ArrayStoreInstruction {

  Conditional<Short> value;

  protected void popValue(FeatureExpr ctx, StackFrame frame){
    value = frame.pop(ctx).map(new Function<Integer, Short>() {

		@Override
		public Short apply(Integer v) {
			return (short)v.intValue();
		}
    	
    });
  }

  protected void setField (FeatureExpr ctx, ElementInfo ei, int index) throws ArrayIndexOutOfBoundsExecutiveException {
    ei.checkArrayBounds(ctx, index);
    ei.setShortElement(ctx, index, value);
  }


  public int getByteCode () {
    return 0x56;
  }
  
}
