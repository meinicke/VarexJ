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
package gov.nasa.jpf.util;

/**
 * object to compute complex hash values that can be accumulated and
 * delegated (to aggregates etc.)
 * used to obtain hashcodes for states
 */
public class HashData {
  private static final int poly = 0x88888EEF;
  private int m = -1;

  public void reset() {
    m = -1;
  }
  
  public int getValue () {
    return (m >>> 4) ^ (m & 15);
  }

  public void add (int value) {
    if (m < 0) {
      m += m;
      m ^= poly;
    } else {
      m += m;
    }

    m ^= value;
  }

  public void add (long value){
    add((int)(value ^ (value >>> 32)));
  }

  public void add (Object o) {
    if (o != null) {
      add(o.hashCode());
    }
  }
  
  public void add (boolean b) {
    // a clear case of '42', but that's the "official" boolean hashing
    add(b ? 1231 : 1237);
  }
}
