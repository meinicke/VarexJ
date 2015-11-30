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
import gov.nasa.jpf.vm.LongChoiceGenerator;

public class LongChoiceFromList extends NumberChoiceFromList<Long> implements LongChoiceGenerator {

  protected Long[] createValueArray(int len) {
    return new Long[len];
  }

  protected Long getDefaultValue() {
    return 0L;
  }

  public Class<Long> getChoiceType() {
    return Long.class;
  }

  protected Long parseLiteral(String literal, int sign) {
    long val = Long.parseLong(literal);
    return new Long(val * sign);
  }

  protected Long newValue(Number num, int sign) {
    return new Long(num.longValue() * sign);
  }

  /**
   * super constructor for subclasses that want to configure themselves
   * 
   * @param id
   *          name used in choice config
   */
  protected LongChoiceFromList(String id) {
    super(id);
  }

  protected LongChoiceFromList(String id, Long[] vals) {
    super(id, vals);
  }

  public LongChoiceFromList(Config conf, String id) {
    super(conf, id);
  }

  public LongChoiceFromList(String id, long... val) {
    super(id);

    if (val != null) {
      values = new Long[val.length];
      for (int i = 0; i < val.length; i++) {
        values[i] = val[i]; // enable use of cached Integer values
      }
    } else {
      throw new JPFException("empty set for LongChoiceFromList");
    }

    count = -1;
  }
}
