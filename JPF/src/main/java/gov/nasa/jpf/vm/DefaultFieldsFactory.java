//
// Copyright (C) 2008 United States Government as represented by the
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
 * our concrete Fields factory (representing the default JPF object model)
 */
public class DefaultFieldsFactory implements FieldsFactory {

  public Fields createInstanceFields (ClassInfo ci) {
    return new NamedFields(ci.getInstanceDataSize());
  }

  public Fields createStaticFields (ClassInfo ci) {
    return new NamedFields(ci.getStaticDataSize());
  }

  public Fields createArrayFields (String type, ClassInfo ci, int nElements, int typeSize, boolean isReferenceArray) {
    char t = type.charAt(1);
    switch (t){
      case 'Z': return new BooleanArrayFields(nElements);
      case 'B': return new ByteArrayFields(nElements);
      case 'C': return new CharArrayFields(nElements);
      case 'S': return new ShortArrayFields(nElements);
      case 'I': return new IntArrayFields(nElements);
      case 'J': return new LongArrayFields(nElements);
      case 'F': return new FloatArrayFields(nElements);
      case 'D': return new DoubleArrayFields(nElements);
      case 'L':
      case '[':
        return new ReferenceArrayFields(nElements);
      default:
        throw new JPFException("unknown array type: " + type);
    }
  }
}
