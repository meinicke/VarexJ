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

/**
 * Value that was read from JSON document. ("key" : value).
 * Value class has methods to return string, double or boolean value.
 * Derived class should throw exceptions if they can't convert value read from
 * JSON document to the requested one.
 * @author Ivan Mushketik
 */
public interface  Value {
  /**
   * Get string value.
   * @return string value read from JSON document
   */
  public String getString();

  /**
   * Get double value.
   * @return double value read from JSON document
   */
  public Double getDouble();

  /**
   * Get JSON object.
   * @return JSON object value read from JSON document
   */
  public JSONObject getObject();

  /**
   * Get array value.
   * @return array value read from JSON document
   */
  public Value[] getArray();

  /**
   * Get boolean value.
   * @return boolean value read from JSON document.
   */
  public Boolean getBoolean();

}
