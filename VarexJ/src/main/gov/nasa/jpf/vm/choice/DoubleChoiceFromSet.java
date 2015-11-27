//
// Copyright (C) 2011 United States Government as represented by the
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

public class DoubleChoiceFromSet extends DoubleChoiceFromList {

  public DoubleChoiceFromSet (Config conf, String id) {
    super(conf, id);
  }

  
  public DoubleChoiceFromSet(String id, double... val){
    super(id, val);
    removeDuplicates();
    count = -1;
  }

  /** super constructor for subclasses that want to configure themselves
   * 
   * @param id name used in choice config
   */
  protected DoubleChoiceFromSet(String id){
    super(id);
  }
  
  /*
   *  Remove duplicate values. This is pretty redundant to IntChoiceFromSet, but
   *  unfortunately we rely on boxing/unboxing and array creation, for which the compiler
   *  needs the concrete type
   */
  private void removeDuplicates() {
    int len = values.length;
    for (int i = 0; i < len; i++) {
      int j = i + 1;
      while (j < len) {
        if (values[i] == values[j]) {
          values[j] = values[len - 1];
          len--;
          // don't increment j as new element has been placed there and needs to be re-tested
        } else {
          j++;
        }
      }
    }
    if (len < values.length) {
      Double[] uniqVals = new Double[len];
      System.arraycopy(values, 0, uniqVals, 0, len);
      values = uniqVals;
    }
  }
}
