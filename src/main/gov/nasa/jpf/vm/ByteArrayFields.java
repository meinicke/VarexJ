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

import cmu.conditional.Choice;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * element values for byte[] objects
 */
public class ByteArrayFields extends ArrayFields {

  Conditional<Byte>[] values;
  private static final One<Byte> init = new One<>((byte)0);
  
  @SuppressWarnings("unchecked")
  public ByteArrayFields (int length) {
    values = new Conditional[length];
    for (int i = 0; i < length; i++) {
    	values[i] = init;
    }
  }

  public Conditional<Byte>[] asByteArray() {
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

  public int getHeapSize() {
    return values.length;
  }

  public boolean equals (Object o) {
    if (o instanceof ByteArrayFields) {
      ByteArrayFields other = (ByteArrayFields)o;

      Conditional<Byte>[] v = values;
      Conditional<Byte>[] vOther = other.values;
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

  public ByteArrayFields clone(){
    ByteArrayFields f = (ByteArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }

  @Override
  public void setByteValue (FeatureExpr ctx, int pos, Conditional<Byte> b) {
	  if (Conditional.isTautology(ctx)) {
		  values[pos] = b;
	  } else {
		  values[pos] = new Choice<>(ctx, b, values[pos]).simplify();
	  }
  }

  @Override
  public Conditional<Byte> getByteValue (int pos) {
    return values[pos];
  }

  public void appendTo (IntVector v) {
	  byte [] a = new byte[values.length];
		for (int i = 0; i < values.length; i++) {
			for (Byte val : values[i].toList()) {
				a[i] = val;
			}
		}
    v.appendPacked(a);
  }

  public void hash(HashData hd) {
    Conditional<Byte>[] v = values;
    for (int i=0; i < v.length; i++) {
    	for (Byte b : v[i].toList()) {
    		hd.add(b);
    	}
    }
  }

}
