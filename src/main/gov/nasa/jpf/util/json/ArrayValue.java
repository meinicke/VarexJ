//
// Copyright (C) 2006 United States Government as represented by the
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
package gov.nasa.jpf.util.json;

import gov.nasa.jpf.JPFException;

import java.util.ArrayList;

/**
 * Array parsed from JSON document
 * @author Ivan Mushketik
 */
public class ArrayValue implements Value {

  ArrayList<Value> values = new ArrayList<Value>();



  public String getString() {
    throw new JPFException("Can't convert array to string");
  }

  public Double getDouble() {
    throw new JPFException("Can't convert array to double");
  }

  public JSONObject getObject() {
    throw new JPFException("Can't convert array to object");
  }

  public Value[] getArray() {
    Value[] result = new Value[values.size()];

    return values.toArray(result);
  }

  public Boolean getBoolean() {
    throw new JPFException("Can't convert array to boolean");
  }

  void addValue(Value value) {
    values.add(value);
  }

}
