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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.Config;

/**
 * a pretty simple ChoiceGenerator that returns a boolean
 * there is not much use in having a CG type interface (such as
 * IntChoiceGenerator) since there is hardly a need for a generic type hierarchy
 * of BooleanChoiceGenerator subtypes - what else can you do with true/false
 */
public class BooleanChoiceGenerator extends ChoiceGeneratorBase<Boolean> {

  // do we evaluate [false, true] or [true, false]
  protected boolean falseFirst = true;

  protected int count = -1;
  protected boolean next;
  
  public BooleanChoiceGenerator(Config conf, String id) {
    super(id);

    falseFirst = conf.getBoolean("cg.boolean.false_first", true);
    next = falseFirst;
  }

  public BooleanChoiceGenerator (String id) {
    super(id);
    next = falseFirst;
  }

  public BooleanChoiceGenerator( String id, boolean falseFirst ){
    super(id);
    
    this.falseFirst = falseFirst;
    next = falseFirst;
  }

  public boolean hasMoreChoices () {
    return !isDone && (count < 1);
  }

  public Boolean getNextChoice () {
    return next ? Boolean.TRUE : Boolean.FALSE;
  }
  
  public Class<Boolean> getChoiceType() {
    return Boolean.class;
  }

  public void advance () {
    if (count < 1) {
      count++;
      next = !next;
    }
  }

  public void reset () {
    count = -1;
    next = falseFirst;

    isDone = false;
  }
  
  public int getTotalNumberOfChoices () {
    return 2;
  }

  public int getProcessedNumberOfChoices () {
    return (count+1);
  }
  
  // that is pretty stupid, but for the sake of consistency we make it available
  Boolean[] getChoices(){
    Boolean[] vals = new Boolean[2];
    vals[0] = !falseFirst;
    vals[1] = falseFirst;
    
    return vals;
  }

  // not much use to support reordering, we just have two elements so reverse() will do
  
  public boolean isFalseFirst(){
    return falseFirst;
  }
  
  /**
   *  note this should only be called before the first advance since it resets
   *  the enumeration state 
   */
  public void reverse(){
    falseFirst = !falseFirst;
    reset();
  }
  
  public String toString () {
    StringBuilder sb = new StringBuilder(getClass().getName());
    sb.append('[');
    sb.append("[id=\"");
    sb.append(id);
    sb.append('"');

    sb.append(",isCascaded:");
    sb.append(isCascaded);

    sb.append(",{");

    if (count < 0){
      sb.append(!next);
      sb.append(',');
      sb.append(next);
    } else if (count == 0) {
      sb.append(MARKER);
      sb.append(next);
      sb.append(',');
      sb.append(!next);
    } else {
      sb.append(!next);
      sb.append(',');
      sb.append(MARKER);
      sb.append(next);
    }
    sb.append("}]");
    return sb.toString();
  }
  
  public BooleanChoiceGenerator randomize () {
    next = random.nextBoolean();
    return this;
  }
}
