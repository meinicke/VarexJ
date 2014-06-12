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
import gov.nasa.jpf.vm.FloatChoiceGenerator;

public class FloatChoiceFromList extends NumberChoiceFromList<Float> implements FloatChoiceGenerator {

  
  protected Float[] createValueArray(int len){
    return new Float[len];
  }
  protected Float getDefaultValue() {
    return 0.0f;
  }
    
  public Class<Float> getChoiceType(){
    return Float.class;
  }
    
  protected Float parseLiteral (String literal, int sign){
    Float val = Float.parseFloat(literal);
    return new Float( val * sign);
  }
  
  protected Float newValue (Number num, int sign){
    return new Float( num.intValue() * sign);
  }
  
  /**
   *  super constructor for subclasses that want to configure themselves
   * @param id name used in choice config
   */
  protected FloatChoiceFromList(String id){
    super(id);
  }

  protected FloatChoiceFromList (String id, Float[] vals){
    super(id, vals);
  }
  
  public FloatChoiceFromList(Config conf, String id) {
    super(conf, id);
  }

  public FloatChoiceFromList(String id, float... val){
    super(id);

    if (val != null){
      values = new Float[val.length];
      for (int i=0; i<val.length; i++){
        values[i] = val[i];  // enable use of cached Float values
      }
    } else {
      throw new JPFException("empty set for FloatChoiceFromList");
    }

    count = -1;
  }

}
