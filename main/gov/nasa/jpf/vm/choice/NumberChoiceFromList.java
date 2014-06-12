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
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.vm.ChoiceGeneratorBase;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

import java.util.Arrays;
import java.util.Comparator;

/** 
 * common root for list based number choice generators
 */
public abstract class NumberChoiceFromList<T extends Number> extends ChoiceGeneratorBase<T> {

  // int values to choose from stored as Strings or Integers
  protected T[] values;
  protected int count = -1;
  
  /**
   *  super constructor for subclasses that want to configure themselves
   * @param id name used in choice config
   */
  protected NumberChoiceFromList(String id){
    super(id);
  }

  protected NumberChoiceFromList (String id, T[] vals){
    super(id);
    values = vals;
    count = -1;
  }
  
  protected abstract T[] createValueArray(int len);
  protected abstract T getDefaultValue();
  protected abstract T parseLiteral (String literal, int sign);
  protected abstract T newValue (Number num, int sign);
  
  /**
   * @param conf JPF configuration object
   * @param id name used in choice config
   */
  public NumberChoiceFromList(Config conf, String id) {
    super(id);

    String[] vals = conf.getCompactStringArray(id + ".values");
    if (vals == null || vals.length == 0) {
      throw new JPFException("no value specs for IntChoiceFromList " + id);
    }

    // get the choice values here because otherwise successive getNextChoice()
    // calls within the same transition could see different values when looking
    // up fields and locals
    values = createValueArray(vals.length);
    StackFrame resolveFrame = ThreadInfo.getCurrentThread().getLastNonSyntheticStackFrame();
    for (int i=0; i<vals.length; i++){
      values[i] = parse(vals[i], resolveFrame);
    }
  }
  

  public void reset () {
    count = -1;

    isDone = false;
  }
      
  /** 
   * @see gov.nasa.jpf.vm.IntChoiceGenerator#getNextChoice()
   **/
  public T getNextChoice() {

    if ((count >= 0) && (count < values.length)) {
      return values[count];
    }

    return getDefaultValue();
  }

  /**
   * @see gov.nasa.jpf.vm.ChoiceGenerator#hasMoreChoices()
   **/
  public boolean hasMoreChoices() {
    if (!isDone && (count < values.length-1))  
      return true;
    else
      return false;
  }

  /**
   * @see gov.nasa.jpf.vm.ChoiceGenerator#advance()
   **/
  public void advance() {
    if (count < values.length-1) count++;
  }

  /**
   * get String label of current value, as specified in config file
   **/
  public String getValueLabel(){
    return values[count].toString();
  }

  public int getTotalNumberOfChoices () {
    return values.length;
  }

  public int getProcessedNumberOfChoices () {
    return count+1;
  }
  
  @Override
  public boolean supportsReordering(){
    return true;
  }
  
  
  protected T parse (String varSpec, StackFrame resolveFrame){
    int sign = 1;

    char c = varSpec.charAt(0);
    if (c == '+'){
      varSpec = varSpec.substring(1);
    } else if (c == '-'){
      sign = -1;
      varSpec = varSpec.substring(1);
    }

    if (varSpec.isEmpty()){
      throw new JPFException("illegal value spec for IntChoiceFromList " + id);
    }

    c = varSpec.charAt(0);
    if (Character.isDigit(c)){ // its an integer literal
      return parseLiteral(varSpec, sign);

    } else { // a variable or field name
      Object o = resolveFrame.getLocalOrFieldValue(varSpec);
      if (o == null){
        throw new JPFException("no local or field '" + varSpec + "' value found for NumberChoiceFromList " + id);
      }
      if (o instanceof Number){
        return newValue( (Number)o, sign);
      } else {
        throw new JPFException("non-numeric local or field '" + varSpec + "' value for NumberChoiceFromList " + id);
      }
    }
  }

  
  @Override
  public NumberChoiceFromList<T> reorder (Comparator<T> comparator){
    
    T[] newValues = values.clone();
    Arrays.sort( newValues, comparator);
    
    // we can't instantiate directly
    try {
    NumberChoiceFromList<T> clone = (NumberChoiceFromList<T>)clone();
    clone.values = newValues;
    clone.count = -1;
    return clone;
    
    } catch (CloneNotSupportedException cnsx){
      // can't happen
      throw new JPFException("can't clone NumberChoiceFromList " + this);
    }
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(getClass().getName());
    sb.append("[id=\"");
    sb.append(id);
    sb.append('"');

    sb.append(",isCascaded:");
    sb.append(isCascaded);

    sb.append(",");
    for (int i=0; i<values.length; i++) {
      if (i > 0) {
        sb.append(',');
      }
      if (i == count) {
        sb.append(MARKER);
      }
      sb.append(values[i]);
    }
    sb.append(']');
    return sb.toString();
  }
  
  
  public NumberChoiceFromList<T> randomize () {
    for (int i = values.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1);
      T tmp = values[i];
      values[i] = values[j];
      values[j] = tmp;
    }
    return this;
  }

}
