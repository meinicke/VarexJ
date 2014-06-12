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
 *
 * @author Ivan Mushketik
 */
class JSONObjectValue implements Value {

  JSONObject object;

  public JSONObjectValue(JSONObject parseObject) {
    object = parseObject;
  }

  @Override
  public JSONObject getObject() {
    return object;
  }

  public String getString() {
    throw new JPFException("Can't convert JSON object to String");
  }

  public Double getDouble() {
    throw new JPFException("Can't convert JSON object to Double");
  }

  public Value[] getArray() {
    throw new JPFException("Can't convert JSON object to Array");
  }

  public Boolean getBoolean() {
    throw new JPFException("Can't convert JSON object to Boolean");
  }
}
