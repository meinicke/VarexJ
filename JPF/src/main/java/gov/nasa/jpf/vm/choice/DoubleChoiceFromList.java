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
package gov.nasa.jpf.vm.choice;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.vm.DoubleChoiceGenerator;

/**
 * simple DoubleChoiceGenerator that takes it's values from a single
 * property "values" (comma or blank separated list)
 * 
 */
public class DoubleChoiceFromList extends NumberChoiceFromList<Double> implements DoubleChoiceGenerator {

  protected Double[] createValueArray(int len) {
    return new Double[len];
  }

  protected Double getDefaultValue() {
    return 0.0;
  }

  public Class<Double> getChoiceType() {
    return Double.class;
  }

  protected Double parseLiteral(String literal, int sign) {
    double val = Double.parseDouble(literal);
    return new Double(val * sign);
  }

  protected Double newValue(Number num, int sign) {
    return new Double(num.intValue() * sign);
  }

  /**
   * super constructor for subclasses that want to configure themselves
   * 
   * @param id
   *          name used in choice config
   */
  protected DoubleChoiceFromList(String id) {
    super(id);
  }

  protected DoubleChoiceFromList(String id, Double[] vals) {
    super(id, vals);
  }

  public DoubleChoiceFromList(Config conf, String id) {
    super(conf, id);
  }

  public DoubleChoiceFromList(String id, double... val) {
    super(id);

    if (val != null) {
      values = new Double[val.length];
      for (int i = 0; i < val.length; i++) {
        values[i] = val[i]; // enable use of cached Double values
      }
    } else {
      throw new JPFException("empty set for DoubleChoiceFromList");
    }

    count = -1;
  }
}
