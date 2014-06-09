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
package gov.nasa.jpf.vm.serialize;

import gov.nasa.jpf.vm.MJIEnv;

/**
 * (mostly) pass-through Abstraction
 */
public class AbstractionAdapter implements Abstraction {

  public int getAbstractValue(int v) {
    return v;
  }

  public int getAbstractValue(float v) {
    return Float.floatToIntBits(v);
  }

  public int getAbstractValue(long v) {
    return (int)(v^(v>>>32));  // Long.hashValue
  }

  public int getAbstractValue(double v) {
    long l = Double.doubleToLongBits(v);
    return (int)(l^(l>>>32)); // Double.hashValue
  }

  public int getAbstractObject(int ref) {
    return ref;
  }

  public boolean traverseObject(int ref) {
    return (ref != MJIEnv.NULL);
  }
  
}
