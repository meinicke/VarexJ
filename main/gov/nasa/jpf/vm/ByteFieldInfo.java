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

package gov.nasa.jpf.vm;

import gov.nasa.jpf.JPFException;

/**
 * fieldinfo for slots holding bytes
 */
public class ByteFieldInfo extends SingleSlotFieldInfo {

  byte init;

  public ByteFieldInfo (String name, int modifiers) {
     super(name, "B", modifiers);
  }

  public void setConstantValue(Object constValue){
    if (constValue instanceof Integer){
      cv = constValue;
      init = ((Integer)constValue).byteValue();

    } else {
      throw new JPFException("illegal byte ConstValue=" + constValue);
    }
  }


  public void initialize (ElementInfo ei, ThreadInfo ti) {
    ei.getFields().setByteValue(storageOffset, init);
  }

  public boolean isByteField() {
    return true;
  }

  public String valueToString (Fields f) {
    byte i = f.getByteValue(storageOffset);
    return Byte.toString(i);
  }


  public Object getValueObject (Fields f){
    int i = f.getIntValue(storageOffset);
    return new Byte((byte)i);
  }

  public boolean isNumericField(){
    return true;
  }
}
