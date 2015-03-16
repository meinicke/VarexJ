//
// Copyright (C) 2010 United States Government as represented by the
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

package gov.nasa.jpf.vm;

import gov.nasa.jpf.JPFException;
import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * fieldinfo for slots holding booleans
 */
public class BooleanFieldInfo extends SingleSlotFieldInfo {

  boolean init=false;

  public BooleanFieldInfo (String name, int modifiers) {
     super(name, "Z", modifiers);
  }

  public void setConstantValue(Object constValue){
    if (constValue instanceof Integer){
      cv = constValue;
      init = ((Integer)constValue).intValue() == 1;
      
    } else {
      throw new JPFException("illegal boolean ConstValue=" + constValue);
    }
  }

  public void initialize (FeatureExpr ctx, ElementInfo ei, ThreadInfo ti) {
    ei.getFields().setBooleanValue(ctx, storageOffset, new One<>(init));
  }

  public boolean isBooleanField() {
    return true;
  }

  public Object getValueObject (Fields f){
    Conditional<Integer> i = f.getIntValue(storageOffset);
    return i.map(new Function<Integer, Object>() {

		@Override
		public Object apply(Integer i) {
			return Boolean.valueOf(i != 0);
		}
    	
	});
    
  }

  public String valueToString (Fields f) {
    boolean b = f.getBooleanValue(storageOffset).getValue();
    return Boolean.toString(b);
  }

}
