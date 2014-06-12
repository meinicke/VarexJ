//
// Copyright (C) 2012 United States Government as represented by the
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
package gov.nasa.jpf.util;

/**
 * an object that holds a mutable int. Unfortunately, java.lang.Integer is
 * final, but we can at least be a Number
 */
public class MutableInteger extends Number {

  private int value;
  
  public MutableInteger (int val){
    value = val;
  }
  
  public void set (int val){
    value = val;
  }
  
  //--- arithmetic operations
  public MutableInteger inc() {
    value++;
    return this;
  }
  
  public MutableInteger dec() {
    value--;
    return this;
  }
  
  public MutableInteger add (int n){
    value += n;
    return this;
  }
  
  public MutableInteger subtract (int n){
    value -= n;
    return this;
  }
  
  public MutableInteger multiply (int n){
    value *= n;
    return this;
  }
  
  public MutableInteger divide (int n){
    value /= n;
    return this;
  }
  
  //-- Hmm, we probably want to round correctly for these
  public MutableInteger add (Number n){
    value += n.intValue();
    return this;
  }
  
  public MutableInteger subtract (Number n){
    value -= n.intValue();
    return this;
  }
  
  public MutableInteger multiply (Number n){
    value *= n.intValue();
    return this;
  }
  
  public MutableInteger divide (Number n){
    value /= n.intValue();
    return this;
  }
  
  //--- value accessors
  
  @Override
  public double doubleValue() {
    return (double)value;
  }

  @Override
  public float floatValue() {
    return (float)value;
  }

  @Override
  public int intValue() {
    return value;
  }

  @Override
  public long longValue() {
    return (long)value;
  }
}
