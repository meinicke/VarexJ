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

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * element values for boolean[] objects
 */
public class BooleanArrayFields extends ArrayFields {

  Conditional<Boolean>[] values;

  private static One<Boolean> nullValue = One.FALSE;
  
  @SuppressWarnings("unchecked")
public BooleanArrayFields (int length) {
    values = new Conditional[length];
    Arrays.fill(values, nullValue);
  }

  protected void printValue(PrintStream ps, int idx){
    ps.print(values[idx].getValue() ? 't' : 'f');
  }

  public Conditional<Boolean>[] asBooleanArray() {
    return values;
  }

  public Conditional<?> getValues(){
    return new One<>(values);
  }

  public Conditional<Integer> arrayLength() {
    return new One<>(values.length);
  }

  public int getHeapSize() {
    return values.length * 4;
  }

  /**
   * we check for type and equal element values
   */
  public boolean equals (Object o) {
    if (o instanceof BooleanArrayFields) {
      BooleanArrayFields other = (BooleanArrayFields)o;

      Conditional<Boolean>[] v = values;
      Conditional<Boolean>[] vOther = other.values;
      if (v.length != vOther.length) {
        return false;
      }

      for (int i=0; i<v.length; i++) {
        if (!v[i].equals(vOther[i])) {
          return false;
        }
      }

      return compareAttrs(other);

    } else {
      return false;
    }
  }

  public BooleanArrayFields clone(){
    BooleanArrayFields f = (BooleanArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }

  // for serialization
  public void appendTo(IntVector v) {// makes no sense
	  List<Boolean> l = new ArrayList<>(values.length);
		for (int i = 0; i < values.length; i++) {
			l.addAll(values[i].toList());
			// a[i] = values[i].getValue();
		}

		boolean[] a = new boolean[l.size()];
		for (int i = 0; i < l.size(); i++) {
			a[i] = l.get(i);
		}
		v.appendPacked(a);
  }

  public Conditional<Boolean> getBooleanValue (int pos) {
    return values[pos];
  }

  public void setBooleanValue (FeatureExpr ctx, int pos, Conditional<Boolean> newValue) {
	  if (Conditional.isTautology(ctx)) {
			values[pos] = newValue;
		} else {
			values[pos] = ChoiceFactory.create(ctx, newValue, values[pos]).simplify();
		}
  }

  public void hash (HashData hd) {
    Conditional<Boolean>[] v = values;
    for (int i=0; i < v.length; i++) {
      hd.add(v[i]);
    }
  }

}
