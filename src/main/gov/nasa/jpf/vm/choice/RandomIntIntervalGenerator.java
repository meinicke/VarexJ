//
// Copyright (C) 2010 United States Government as represented by the
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
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ChoiceGeneratorBase;
import gov.nasa.jpf.vm.IntChoiceGenerator;

import java.util.Random;

/**
 * a IntChoiceGenerator that randomly chooses a configured number
 * of values from a specified range
 * this is usually configured through app properties
 * 
 * <2do> this is too redundant to RandomOrderIntCG - replace
 */
public class RandomIntIntervalGenerator extends ChoiceGeneratorBase<Integer> implements IntChoiceGenerator {

  protected int min, max; // both inclusive
  protected int nChoices;
  protected long seed;

  protected Random random;
  protected int range;

  protected int next;
  protected int count = 0;

  public RandomIntIntervalGenerator (String id, int min, int max, int nChoices){
    this(id, min,max,nChoices,0L);
  }

  public RandomIntIntervalGenerator (String id, int min, int max, int nChoices, long seed){
    super(id);

    this.min = min;
    this.max = max;
    this.nChoices = nChoices;
    this.seed = seed;

    range = max - min;
    random = new Random(seed);
  }

  public RandomIntIntervalGenerator(Config conf, String id) {
    super(id);

    min = conf.getInt(id + ".min");
    max = conf.getInt(id + ".max");
    nChoices = conf.getInt(id + ".n", 1);
    seed = conf.getLong(id + ".seed", 1);

    range = max - min;
    random = new Random(seed);
  }


  public void reset () {
    random = new Random(seed);
    count = 0;

    isDone = false;
  }

	public boolean hasMoreChoices() {
    return !isDone && (count < nChoices);
	}

  public void advance (){
    if (count < nChoices){
      count++;
      next = random.nextInt(range) + min;
    }
  }

  public Integer getNextChoice () {
    return new Integer(next);
  }

  public int getTotalNumberOfChoices () {
    return nChoices;
  }

  public int getProcessedNumberOfChoices () {
    return count;
  }

  public String toString () {
    StringBuilder sb = new StringBuilder(getClass().getName());
    if (id == null) {
      sb.append('[');
    } else {
      sb.append("[id=\"");
      sb.append(id);
      sb.append("\",");
    }
    sb.append(min);
    sb.append("..");
    sb.append(max);
    sb.append(",n=");
    sb.append(nChoices);
    sb.append(",cur=");
    sb.append(getNextChoice());
    sb.append(",count=");
    sb.append(count);
    sb.append(']');
    return sb.toString();
  }

  @Override
  public Class<Integer> getChoiceType() {
    return Integer.class;
  }

  @Override
  public ChoiceGenerator<Integer> randomize() {
    return this;
  }

}
