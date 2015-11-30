//
// Copyright (C) 2009 United States Government as represented by the
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

import gov.nasa.jpf.vm.ChoiceGeneratorBase;
import gov.nasa.jpf.vm.LongChoiceGenerator;

/**
 *
 */
public class RandomOrderLongCG extends ChoiceGeneratorBase<Long> implements LongChoiceGenerator {
  protected long[] choices;

  protected int nextIdx;

  public RandomOrderLongCG (LongChoiceGenerator sub) {
    super(sub.getId());
    setPreviousChoiceGenerator(sub.getPreviousChoiceGenerator());
    choices = new long[sub.getTotalNumberOfChoices()];
    for (int i = 0; i < choices.length; i++) {
      sub.advance();
      choices[i] = sub.getNextChoice();
    }
    for (int i = choices.length - 1; i > 0; i--) { // all but first
      int j = random.nextInt(i + 1);
      long tmp = choices[i];
      choices[i] = choices[j];
      choices[j] = tmp;
    }
    nextIdx = -1;
  }

  public Long getNextChoice() {
    return new Long(choices[nextIdx]);
  }

  public void advance() {
    if (nextIdx + 1 < choices.length) nextIdx++;
  }

  public int getProcessedNumberOfChoices() {
    return nextIdx+1;
  }

  public int getTotalNumberOfChoices() {
    return choices.length;
  }

  public boolean hasMoreChoices() {
    return !isDone && (nextIdx + 1 < choices.length);
  }

  public void reset() {
    nextIdx = -1;

    isDone = false;
  }

  @Override
  public Class<Long> getChoiceType() {
    return Long.class;
  }
}
