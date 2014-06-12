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
import gov.nasa.jpf.vm.ChoiceGeneratorBase;
import gov.nasa.jpf.vm.DoubleChoiceGenerator;

/**
 * ChoiceGenerator instance that produces a simple 3 value enumeration
 * 
 */
public class DoubleThresholdGenerator extends ChoiceGeneratorBase<Double> implements DoubleChoiceGenerator {

  protected double[] values = new double[3];
  protected int count;

  public DoubleThresholdGenerator(Config conf, String id) {
    super(id);

    values[0] = conf.getDouble(id + ".low");
    values[1] = conf.getDouble(id + ".threshold");
    values[2] = conf.getDouble(id + ".high");
    count = -1;
  }

  public void reset () {
    count = -1;

    isDone = false;
  }

  public boolean hasMoreChoices () {
    return !isDone && (count < 2);
  }

  public Double getNextChoice () {
    if (count >=0) {
      return new Double(values[count]);
    } else {
      return new Double(values[0]);
    }
  }

  public void advance () {
    if (count < 2)
      count++;
  }

  public int getTotalNumberOfChoices () {
    return 3;
  }

  public int getProcessedNumberOfChoices () {
    return count + 1;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder(getClass().getName());
    sb.append("[id=\"");
    sb.append(id);
    sb.append("\",");
    
    for (int i=0; i<3; i++) {
      if (count == i) {
        sb.append(MARKER);
      }
      sb.append(values[i]);
      if (count < 2) {
        sb.append(',');
      }
    }
    sb.append(']');
    return sb.toString();
  }
  
  public DoubleThresholdGenerator randomize () {
    for (int i = values.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1);
      double tmp = values[i];
      values[i] = values[j];
      values[j] = tmp;
    }    
    return this;
  }

  @Override
  public Class<Double> getChoiceType() {
    return Double.class;
  }
}
