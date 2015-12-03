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
import java.util.BitSet;

/**
 * Faster version of BitSet for fixed size.
 */
public class BitArray {
  public final int length;
  final byte[] data;
  
  public BitArray(int len) {
    length = len;
    data = new byte[(len + 7) >> 3];
  }

  public void fromBitSet(BitSet in) {
    int max = Math.min(data.length, (in.length() + 7) >> 3);
    int i;
    for (i = 0; i < max; i++) {
      int j = i << 3;
      data[i] = (byte)
        ((in.get(j + 0) ? 1 : 0) |
         (in.get(j + 1) ? 2 : 0) |
         (in.get(j + 2) ? 4 : 0) |
         (in.get(j + 3) ? 8 : 0) |
         (in.get(j + 4) ? 16 : 0) |
         (in.get(j + 5) ? 32 : 0) |
         (in.get(j + 6) ? 64 : 0) |
         (in.get(j + 7) ? 128 : 0));
    }
    Arrays.fill(data, max, data.length, (byte) 0);
  }

  public final void set(int idx, boolean val) {
    if (idx >= length) throw new ArrayIndexOutOfBoundsException("" + idx + " >= " + length);
    if (val) {
      data[idx >> 3] |= (1 << (idx & 7));
    } else {
      data[idx >> 3] &= ~(1 << (idx & 7));
    }
  }

  public final void set(int idx, int val) {
    set(idx, val != 0);
  }
  
  public final void set(int idx) {
    if (idx >= length) throw new ArrayIndexOutOfBoundsException("" + idx + " >= " + length);
    data[idx >> 3] |= (1 << (idx & 7));
  }

  public final void clear(int idx) {
    if (idx >= length) throw new ArrayIndexOutOfBoundsException("" + idx + " >= " + length);
    data[idx >> 3] &= ~(1 << (idx & 7));
  }

  public final void setAll() {
    Arrays.fill(data, (byte) 0xff);
    cleanup();
  }

  public final void clearAll() {
    Arrays.fill(data, (byte) 0);
  }
  
  public final void invert() {
    int i;
    for (i = 0; i < data.length; i++) {
      data[i] = (byte) ~ data[i];
    }
    cleanup();
  }
  
  // to keep all unused bits at 0
  final void cleanup() {
    if ((length & 7) != 0) {
      int idx = data.length - 1;
      data[idx] &= ~(0xff << (length & 7));
    }
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
    if (! (o instanceof BitArray)) return false;
    byte[] thatData = ((BitArray)o).data;
    byte[] thisData = this.data;
    return Arrays.equals(thisData, thatData);
  }
  
  public static final BitArray empty = new BitArray(0);
}
