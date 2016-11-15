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
import cmu.conditional.One;
import cmu.vatrace.ArrayStoreStatement;
import cmu.vatrace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ArrayIndexOutOfBoundsExecutiveException;
import gov.nasa.jpf.vm.BooleanArrayFields;
import gov.nasa.jpf.vm.ByteArrayFields;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Fields;
import gov.nasa.jpf.vm.StackFrame;

/**
 * Store into byte or boolean array
 * ..., arrayref, index, value  => ...
 */
public class BASTORE extends ArrayStoreInstruction {

  Conditional<Byte> value;

  protected void popValue(FeatureExpr ctx, StackFrame frame){
    value = frame.pop(ctx).mapr(new Function<Integer, Conditional<Byte>>() {

		@Override
		public Conditional<Byte> apply(Integer y) {
			return One.valueOf(y.byteValue());
		}
    	
    });
  }

	protected void setField(FeatureExpr ctx, ElementInfo ei, int index, StackFrame frame) throws ArrayIndexOutOfBoundsExecutiveException {
		try {
			ei.checkArrayBounds(ctx, index);
		} finally {
			new Statement(this.toString(), frame.method, ctx);
		}

		Fields f = ei.getFields();

		if (f instanceof ByteArrayFields) {
			new ArrayStoreStatement(frame.method, index, ei.getByteElement(index), value, ei, ctx);
			ei.setByteElement(ctx, index, value);

		} else if (f instanceof BooleanArrayFields) {
			new ArrayStoreStatement(frame.method, index, ei.getBooleanElement(index), value, ei, ctx);
			ei.setBooleanElement(ctx, index, value.mapr(new Function<Byte, Conditional<Boolean>>() {

				@Override
				public Conditional<Boolean> apply(Byte v) {
					return v != 0 ? One.TRUE : One.FALSE;
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
