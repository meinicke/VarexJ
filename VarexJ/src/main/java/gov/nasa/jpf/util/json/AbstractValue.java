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

/**
 * Implementation of all Value methods. Classes that inherits this class should
 * only override methods they can handle. Other methods will throw exceptions with
 * error description.
 *
 * @author Ivan Mushketik
 */
public class AbstractValue implements Value {

  String read;

  protected AbstractValue(String read) {
    this.read = read;
  }

  public String getString() {
    throw new JPFException("Can't convert '" + read + " to String");
  }

  public Double getDouble() {
    throw new JPFException("Can't convert '" + read + "' to Double");
  }

  public JSONObject getObject() {
    throw new JPFException("Can't convert '" + read + "' to JSON object");
  }

  public Value[] getArray() {
    throw new JPFException("Can't convert '" + read + "' to Array");
  }

  public Boolean getBoolean() {
    throw new JPFException("Can't convert '" + read + "' to Boolean");
  }

}
