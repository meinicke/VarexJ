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

import cmu.conditional.Choice;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * element values for short[] objects
 */
public class ShortArrayFields extends ArrayFields {

  private static final One<Short> nullValue = new One<>((short)0);
  Conditional<Short>[] values;

  @SuppressWarnings("unchecked")
  public ShortArrayFields (int length) {
    values = new Conditional[length];
    Arrays.fill(values, nullValue);
  }

  public Conditional<Short>[] asShortArray() {
    return values;
  }

  protected void printValue(PrintStream ps, int idx){
    ps.print(values[idx]);
  }
  
  public Conditional<?> getValues(){
    return new One<>(values);
  }

  public int arrayLength() {
    return values.length;
  }

  public int getHeapSize() {  // in bytes
    return values.length * 2;
  }

  public void appendTo (IntVector v) {
	  List<Short> l = new ArrayList<>(values.length);
		for (int i = 0; i < values.length; i++) {
			l.addAll(values[i].toList());
		}

		short[] a = new short[l.size()];
		for (int i = 0; i < l.size(); i++) {
			a[i] = l.get(i);
		}
		v.appendPacked(a);
  }

  public ShortArrayFields clone(){
    ShortArrayFields f = (ShortArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }

  public boolean equals (Object o) {
    if (o instanceof ShortArrayFields) {
      ShortArrayFields other = (ShortArrayFields)o;
      Conditional<Short>[] v = values;
      Conditional<Short>[] vOther = other.values;
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


  public Conditional<Short> getShortValue(int pos) {
    return values[pos];
  }

  public void setShortValue (FeatureExpr ctx, int pos, Conditional<Short> newValue) {
	  if (Conditional.isTautology(ctx)) {
			values[pos] = newValue;
		} else {
			values[pos] = new Choice<>(ctx, newValue, values[pos]).simplify();
		}
  }

  public void hash(HashData hd) {
    Conditional<Short>[] v = values;
    for (int i=0; i < v.length; i++) {
      hd.add(v[i]);
    }
  }

}
