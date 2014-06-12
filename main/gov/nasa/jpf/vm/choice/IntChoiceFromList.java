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
import gov.nasa.jpf.vm.IntChoiceGenerator;
/**
 * @author jpenix
 *
 * choose from a set of values provided in configuration as
 * xxx.class = IntChoiceFromList
 * xxx.values = {1, 2, 3, 400}
 * where "xxx" is the choice id.
 * 
 * choices can then made using: getInt("xxx");
 */
public class IntChoiceFromList extends NumberChoiceFromList<Integer> implements IntChoiceGenerator {

  
  protected Integer[] createValueArray(int len){
    return new Integer[len];
  }
  protected Integer getDefaultValue() {
    return 0;
  }
    
  public Class<Integer> getChoiceType(){
    return Integer.class;
  }
  	
  protected Integer parseLiteral (String literal, int sign){
    int val = Integer.parseInt(literal);
    return new Integer( val * sign);
  }
  
  protected Integer newValue (Number num, int sign){
    return new Integer( num.intValue() * sign);
  }
  
  /**
   *  super constructor for subclasses that want to configure themselves
   * @param id name used in choice config
   */
  protected IntChoiceFromList(String id){
    super(id);
  }

  protected IntChoiceFromList (String id, Integer[] vals){
    super(id, vals);
  }
  
	public IntChoiceFromList(Config conf, String id) {
		super(conf, id);
	}

  public IntChoiceFromList(String id, int... val){
    super(id);

    if (val != null){
      values = new Integer[val.length];
      for (int i=0; i<val.length; i++){
        values[i] = val[i];  // enable use of cached Integer values
      }
    } else {
      throw new JPFException("empty set for IntChoiceFromList");
    }

    count = -1;
  }
}
