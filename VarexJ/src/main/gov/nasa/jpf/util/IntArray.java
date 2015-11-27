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

import java.util.Arrays;

/**
 * Wrapper for int[] that provides proper equals() and hashCode() methods.
 */
public class IntArray {
  public final int[] data;
  
  public IntArray(int size) {
    data = new int[size];
  }
  
  public IntArray(int[] data) {
    this.data = data;
  }
  
  public int hashCode() {
    return Arrays.hashCode(data);
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (! (o instanceof IntArray)) return false;
    int[] thatData = ((IntArray)o).data;
    int[] thisData = this.data;
    return Arrays.equals(thisData, thatData);
  }
}
