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

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * element values for float[] objects
 */
public class FloatArrayFields extends ArrayFields {

  private static final One<Float> nullValue = new One<>(0f);
  Conditional<Float>[] values;

  @SuppressWarnings("unchecked")
public FloatArrayFields (int length) {
    values = new Conditional[length];
    Arrays.fill(values, nullValue);
  }

  public Conditional<Float>[] asFloatArray() {
    return values;
  }

  protected void printValue(PrintStream ps, int idx){
    ps.print(values[idx]);
  }
  
  public Conditional<?> getValues(){
    return new One<>(values);
  }

  public Conditional<Integer> arrayLength() {
    return new One<>(values.length);
  }

  public int getHeapSize() {  // in bytes
    return values.length * 4;
  }

  public void appendTo (IntVector v) {
	  List<Float> l = new ArrayList<>(values.length);
		for (int i = 0; i < values.length; i++) {
			l.addAll(values[i].toList());
			// a[i] = values[i].getValue();
		}

		float[] a = new float[l.size()];
		for (int i = 0; i < l.size(); i++) {
			a[i] = l.get(i);
		}
		v.appendRawBits(a);
  }

  public FloatArrayFields clone(){
    FloatArrayFields f = (FloatArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }

  public boolean equals (Object o) {
    if (o instanceof FloatArrayFields) {
      FloatArrayFields other = (FloatArrayFields)o;

      Conditional<Float>[] v = values;
      Conditional<Float>[] vOther = other.values;
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

  public void setFloatValue (FeatureExpr ctx, int pos, Conditional<Float> newValue) {
    values[pos] = newValue;
  }

  public Conditional<Float> getFloatValue (int pos) {
    return values[pos];
  }


  public void hash(HashData hd) {
    Conditional<Float>[] v = values;
    for (int i=0; i < v.length; i++) {
      hd.add(v[i]);
    }
  }

}
