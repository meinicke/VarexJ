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
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.StackFrame;

/**
 * Load int from array
 * ..., arrayref, index => ..., value
 */
public class IALOAD extends ArrayLoadInstruction {

  protected Conditional<?> getPushValue (FeatureExpr ctx, StackFrame frame, ElementInfo ei, int index) throws ArrayIndexOutOfBoundsExecutiveException {
    ei.checkArrayBounds(ctx, index);
    return ei.getFields().getIntValue(index);
  }

  public int getByteCode () {
    return 0x2E;
  }
  
  	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void pushValue(FeatureExpr ctx, StackFrame frame, Conditional value) {
		frame.push(ctx, value);
	}
}
