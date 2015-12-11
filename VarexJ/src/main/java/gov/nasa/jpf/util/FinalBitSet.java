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
 * Faster version of BitSet for those that never change.
 */
public class FinalBitSet {
  final byte[] data;
  
  FinalBitSet(byte[] in) {
    int len = in.length;
    while (len > 0 && in[len - 1] == 0) len--;
    this.data = new byte[len];
    System.arraycopy(in, 0, this.data, 0, len);
  }
  
  public final boolean get(int idx) {
    int a = idx >> 3;
    return a < data.length && a >= 0 && (data[a] & (1 << (idx & 7))) != 0;
  }
  
  public int hashCode() {
    return Arrays.hashCode(data);
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (! (o instanceof FinalBitSet)) return false;
    byte[] thatData = ((FinalBitSet)o).data;
    byte[] thisData = this.data;
    return Arrays.equals(thisData, thatData);
  }
  
  
  /*======= Static Stuff ========*/
  static final SimplePool<FinalBitSet> pool = new SimplePool<FinalBitSet>();
  
  public static final FinalBitSet empty = create(BitArray.empty);
  
  /**
   * Creates a pooled FinalBitSet.
   */
  public static FinalBitSet create(BitArray in) {
    return pool.pool(new FinalBitSet(in.data));
  }

  /**
   * Creates a pooled FinalBitSet.
   */
  public static FinalBitSet create(byte[] in) {
    return pool.pool(new FinalBitSet(in));
  }
}
