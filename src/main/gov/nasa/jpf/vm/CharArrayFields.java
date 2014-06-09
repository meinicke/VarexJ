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
import java.io.PrintWriter;

/**
 * element values for char[] objects
 */
public class CharArrayFields extends ArrayFields {

  char[] values;

  public CharArrayFields (int length) {
    values = new char[length];
  }

  public char[] asCharArray(){
    return values;
  }

  @Override
  protected void printValue(PrintStream ps, int idx){
    PrintUtils.printCharLiteral(ps, values[idx]);
  }
  
  @Override
  public void printElements( PrintStream ps, int max){
    PrintUtils.printStringLiteral(ps, values, max);
  }  
  
  public char[] asCharArray (int offset, int length) {
    char[] result = new char[length];
    System.arraycopy(values, offset, result, 0, length);

    return result;
  }

  public Object getValues(){
    return values;
  }

  public int arrayLength() {
    return values.length;
  }

  public int getHeapSize() {  // in bytes
    return values.length * 2;
  }

  public void appendTo (IntVector v) {
    v.appendPacked(values);
  }

  public CharArrayFields clone(){
    CharArrayFields f = (CharArrayFields)cloneFields();
    f.values = values.clone();
    return f;
  }


  public boolean equals (Object o) {
    if (o instanceof CharArrayFields) {
      CharArrayFields other = (CharArrayFields)o;

      char[] v = values;
      char[] vOther = other.values;
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

  public char getCharValue(int pos) {
    return values[pos];
  }

  public void setCharValue(int pos, char newValue) {
    values[pos] = newValue;
  }

  public void setCharValues(char[] v){
    System.arraycopy(v,0,values,0,v.length);
  }

  //--- some methods to ease native String operations

  public String asString(int offset, int length) {
    return new String(values, offset, length);
  }

  // a special string compare utility
  public boolean equals (int offset, int length, String s) {
    char[] v = values;

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
    char[] v = values;
    for (int i=0; i < v.length; i++) {
      hd.add(v[i]);
    }
  }

}
