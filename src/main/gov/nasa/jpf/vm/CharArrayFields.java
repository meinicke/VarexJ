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

import gov.nasa.jpf.jvm.bytecode.extended.BiFunction;
import gov.nasa.jpf.jvm.bytecode.extended.Choice;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.Function;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.HashData;
import gov.nasa.jpf.util.IntVector;
import gov.nasa.jpf.util.PrintUtils;

import java.io.PrintStream;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * element values for char[] objects
 */
public class CharArrayFields extends ArrayFields {

  Conditional<char[]> values;

  public CharArrayFields (int length) {
    values = new One<>(new char[length]);
  }

  public Conditional<char[]> asCharArray(){
    return values;
  }

  @Override
  protected void printValue(PrintStream ps, int idx){
    PrintUtils.printCharLiteral(ps, values.getValue()[idx]);
  }
  
  @Override
  public void printElements( PrintStream ps, int max){
    PrintUtils.printStringLiteral(ps, values.getValue(), max);
  }  
  
  public char[] asCharArray (int offset, int length) {
    char[] result = new char[length];
    System.arraycopy(values.getValue(), offset, result, 0, length);

    return result;
  }

  public Object getValues(){
    return values.getValue();
  }

  public int arrayLength() {
	  return values.map(new Function<char[], Integer>() {

		@Override
		public Integer apply(char[] values) {
			return values.length;
		}}).simplify().getValue(); 
	  
  }

  public int getHeapSize() {  // in bytes
    return values.getValue().length * 2;
  }

  public void appendTo (IntVector v) {
    v.appendPacked(values.getValue());
  }

  public CharArrayFields clone(){
    CharArrayFields f = (CharArrayFields)cloneFields();
    f.values = new One<>(values.getValue().clone());
    return f;
  }


  public boolean equals (Object o) {
    if (o instanceof CharArrayFields) {
      CharArrayFields other = (CharArrayFields)o;

      char[] v = values.getValue();
      char[] vOther = other.values.getValue();
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

  public Conditional<Character> getCharValue(final int pos) {
    return values.map(new Function<char[], Character>() {

		@Override
		public Character apply(char[] values) {
			return values[pos];
		}
    	
    });
  }

  @Override
  public void setCharValue(final FeatureExpr ctx, final int pos, final char newValue) {
	  values = values.mapf(ctx, new BiFunction<FeatureExpr, char[], Conditional<char[]>>() {

		@Override
		public Conditional<char[]> apply(FeatureExpr f, char[] values) {
			if (f.isContradiction()) {
				return new One<>(values);
			}
			if (f.isTautology()) {
				values[pos] = newValue;
				return new One<>(values);
			}
			char[] clone = new char[values.length];
			System.arraycopy(values, 0, clone, 0, clone.length);
			clone[pos] = newValue;
			return new Choice<>(ctx, new One<>(clone), new One<>(values));
		}
		  
		  
	  }).simplify();
	  
   
  }

  public void setCharValues(FeatureExpr ctx, char[] v){
	char[] newValues = new char[v.length]; 
	System.arraycopy(v,0,newValues,0,v.length);
	if (ctx == null) {
		throw new RuntimeException("ctx == null");
	}
	values = new Choice<>(ctx, new One<>(newValues), values).simplify();
  }

  //--- some methods to ease native String operations

  public String asString(int offset, int length) {
    return new String(values.getValue(), offset, length);
  }

  // a special string compare utility
  public boolean equals (int offset, int length, String s) {
    char[] v = values.getValue();

    if (offset+length > v.length) {
      return false;
    }

    for (int i=offset, j=0; j<length; i++, j++) {
      if (v[i] != s.charAt(j)) {
        return false;
      }
    }

    return true;
  }

  public void hash(HashData hd) {
    char[] v = values.getValue();
    for (int i=0; i < v.length; i++) {
      hd.add(v[i]);
    }
  }

}
