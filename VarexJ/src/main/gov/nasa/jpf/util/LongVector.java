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
 * (more efficient?) alternative to Vector<Integer>
 * @author pcd
 */
public final class LongVector {
  public static final int defaultInitCap = 40;

  
  /** <i>size</i> as in a java.util.Vector. */
  protected int size;
  
  /** the backing array. */
  protected long[] data;
  
  /** growth strategy. */
  protected Growth growth;
  
  
  public LongVector(Growth initGrowth, int initCap) {
    growth = initGrowth;
    data = new long[initCap];
    size = 0;
  }
  
  public LongVector(Growth initGrowth) { this(initGrowth,defaultInitCap); }
  
  public LongVector(int initCap) { this(Growth.defaultGrowth, initCap); }
  
  public LongVector() { this(Growth.defaultGrowth,defaultInitCap); }
  
  
  public void add(long x) {
    if (size+1 > data.length) {
      ensureCapacity(size+1);
    }
    data[size] = x;
    size++;
  }
  
  public long get(int idx) {
    if (idx >= size) {
      return 0;
    } else {
      return data[idx];
    }
  }
  
  public void set(int idx, long x) {
    ensureSize(idx + 1);
    data[idx] = x;
  }
  

  public void squeeze() {
    while (size > 0 && data[size - 1] == 0) size--;
  }
  
  public void setSize(int sz) {
    if (sz > size) {
      ensureCapacity(sz);
      size = sz;
    } else {
      while (size > sz) {
        size--;
        data[size] = 0;
      }
    }
  }

  public void clear() { setSize(0); }
  
  public int size() { return size; }
  
  public void ensureSize(int sz) {
    if (size < sz) {
      ensureCapacity(sz);
      size = sz;
    }
  }
  
  public void ensureCapacity(int desiredCap) {
    if (data.length < desiredCap) {
      long[] newData = new long[growth.grow(data.length, desiredCap)];
      System.arraycopy(data, 0, newData, 0, size);
      data = newData;
    }
  }
  
  public static void copy(LongVector src, int srcPos, LongVector dst, int dstPos, int len) {
    if (len == 0) return;
    src.ensureCapacity(srcPos + len);
    dst.ensureSize(dstPos+len);
    System.arraycopy(src.data, srcPos, dst.data, dstPos, len);
  }
}
