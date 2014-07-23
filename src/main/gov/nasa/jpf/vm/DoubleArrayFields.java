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

import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.IntVector;

import java.io.PrintStream;

/**
 * element values for double[] objects
 */
public class DoubleArrayFields extends ArrayFields {

  Conditional<Double>[] values;

  public DoubleArrayFields (int length) {
    values = new Conditional[length];
    for (int i = 0; i < values.length; i++) {
		values[i] = new One<>(0.0);
	}
  }

  public double[] asDoubleArray() {
		double[] array = new double[values.length];
		int i = 0;
		for (Conditional<Double> v : values) {
			if (v == null) {
				continue;
			}
			array[i++] = v.getValue();
		}

		return array;
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
    return values.length * 8;
  }

  public void appendTo (IntVector v) {
    v.appendRawBits(asDoubleArray());
  }

  public DoubleArrayFields clone(){
    DoubleArrayFields f = (DoubleArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }

  public boolean equals (Object o) {
    if (o instanceof DoubleArrayFields) {
      DoubleArrayFields other = (DoubleArrayFields)o;

      double[] v = asDoubleArray();
      double[] vOther = ((DoubleArrayFields) o).asDoubleArray();
      if (v.length != vOther.length) {
        return false;
      }

      for (int i=0; i<v.length; i++) {
        if (v[i] != vOther[i]) {
          return false;
        }
      }

      return compareAttrs(other);

    } else {
      return false;
    }
  }

  protected void setDoubleValue (int pos, Conditional<Double> newValue) {
    values[pos] = newValue;
  }

  public Conditional<Double> getDoubleValue (int pos) {
    return values[pos];
  }


  public void hash(HashData hd) {
    double[] v = asDoubleArray();
    for (int i=0; i < v.length; i++) {
      hd.add(v[i]);
    }
  }

}
