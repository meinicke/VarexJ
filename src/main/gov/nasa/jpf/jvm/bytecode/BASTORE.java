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

import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.BooleanArrayFields;
import gov.nasa.jpf.vm.ByteArrayFields;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Fields;
import gov.nasa.jpf.vm.StackFrame;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Store into byte or boolean array
 * ..., arrayref, index, value  => ...
 */
public class BASTORE extends ArrayStoreInstruction {

  Conditional<Byte> value;

  protected void popValue(FeatureExpr ctx, StackFrame frame){
    value = frame.pop(ctx).map(new Function<Integer, Byte>() {

		@Override
		public Byte apply(Integer x) {
			return x.byteValue();
		}
    	
    });
  }

  protected void setField (FeatureExpr ctx, ElementInfo ei, int index) throws ArrayIndexOutOfBoundsExecutiveException {
    ei.checkArrayBounds(ctx, index);

    Fields f = ei.getFields();

    if (f instanceof ByteArrayFields){
      ei.setByteElement(ctx, index, value);

    } else if (f instanceof BooleanArrayFields){
      ei.setBooleanElement(ctx, index, value.map(new Function<Byte, Boolean>() {

		@Override
		public Boolean apply(Byte v) {
			return v != 0 ? Boolean.TRUE : Boolean.FALSE;
		}
    	  
      }));
    }

  }

  public int getByteCode () {
    return 0x54;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
  
  public byte getValue(){
    return value.getValue();
  }
}
