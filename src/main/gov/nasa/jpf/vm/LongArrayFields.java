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

import gov.nasa.jpf.jvm.bytecode.extended.Choice;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.IntVector;

import java.io.PrintStream;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * element values for long[] objects
 */
public class LongArrayFields extends ArrayFields {

  Conditional<Long>[] values;

  public LongArrayFields (int length) {
    values = new Conditional[length];
    for (int i = 0; i < values.length; i++) {
		values[i] = new One<>(0l);
	}
  }

  public long[] asLongArray() {
	  long[] array = new long[values.length];
		int i = 0;
		for (Conditional<Long> v : values) {
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
    v.appendBits(asLongArray());
  }

  public LongArrayFields clone(){
    LongArrayFields f = (LongArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }


  public boolean equals (Object o) {
    if (o instanceof LongArrayFields) {
      LongArrayFields other = (LongArrayFields)o;

      long[] v = asLongArray();
      long[] vOther = other.asLongArray();
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

	@Override
	public void setLongValue(FeatureExpr ctx, int pos, Conditional<Long> newValue) {
		if (ctx.isTautology()) {
			values[pos] = newValue;
		} else {
			values[pos] = new Choice<>(ctx, newValue, values[pos]).simplify();
		}

	}

  public Conditional<Long> getLongValue (int pos) {
    return values[pos];
  }


  public void hash(HashData hd) {
    long[] v = asLongArray();
    for (int i=0; i < v.length; i++) {
      hd.add(v[i]);
    }
  }

}
