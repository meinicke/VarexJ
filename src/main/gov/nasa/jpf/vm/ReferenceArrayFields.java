//
// Copyright (C) 2008 United States Government as represented by the
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

import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.IntVector;
import gov.nasa.jpf.util.PrintUtils;

import java.io.PrintStream;
import java.util.Arrays;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * element values for reference array objects
 * (references are stored as int's)
 */
public class ReferenceArrayFields extends ArrayFields {
	  private static final One<Integer> init = new One<>(0);
  Conditional<Integer>[] values; // the references

  @SuppressWarnings("unchecked")
public ReferenceArrayFields (int length) {
	  values = new Conditional[length];
      Arrays.fill(values, init);

    /** not required for MJIEnv.NULL = 0
    for (int i=0; i<length; i++) {
      values[i] = MJIEnv.NULL;
    }
    **/
  }

  @Override
  public Conditional<Integer>[] asReferenceArray() {
    return values;
  }

  @Override
  protected void printValue(PrintStream ps, int idx){
    PrintUtils.printReference(ps, values[idx].getValue());
  }
  
  @Override
  public Conditional<?> getValues(){
    return new One<>(values);
  }

  @Override
  public int arrayLength() {
    return values.length;
  }

  @Override
  public boolean isReferenceArray() {
    return true;
  }

  public int getHeapSize() {
    return values.length * 4;
  }

  public void appendTo (IntVector v) {
	  int [] a = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			// TODO jens this does not work with conditional values
			for (Integer val : values[i].toList()) {
				a[i] = val;
			}
		}
	    v.append(a);
  }

  public ReferenceArrayFields clone(){
    ReferenceArrayFields f = (ReferenceArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }


  public boolean equals(Object o) {
    if (o instanceof ReferenceArrayFields) {
    	IntArrayFields other = (IntArrayFields)o;

        Conditional<Integer>[] v = values;
        Conditional<Integer>[] vOther = other.values;
        if (v.length != vOther.length) {
          return false;
        }

        for (int i=0; i<v.length; i++) {
          if (v[i].equals(vOther[i])) {
            return false;
          }
        }

        return compareAttrs(other);

      } else {
        return false;
      }
  }

  public void setReferenceValue(int pos, int newValue) {
    values[pos] = new One<>(newValue);
  }
  
  @Override
	public void setReferenceValue(FeatureExpr ctx, int pos, Conditional<Integer> newValue) {
	  if (Conditional.isTautology(ctx)) {
		  values[pos] = newValue;	  
	  } else {
		  values[pos] = ChoiceFactory.create(ctx, newValue, values[pos]).simplify();
	  }
	}

  public Conditional<Integer> getReferenceValue(int pos) {
    return values[pos];
  }

  public void hash (HashData hd) {
	  Conditional<Integer>[] v = values;
	    for (int i=0; i < v.length; i++) {
	      hd.add(v[i].getValue());
	    }
  }


}
