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

public final class Permutation {
  public static final int defaultInitCap = 40;

  /** the backing array. */
  protected int[] data;
  
  /** growth strategy. */
  protected Growth growth;
  
  /** the size of the inverse vector == next range value to be assigned. */
  protected final IntVector inverse;
  
  public Permutation(Growth initGrowth, int initCap) {
    inverse = new IntVector(initGrowth,initCap);
    growth = initGrowth;
    data = new int[initCap];
  }
  
  public Permutation(Growth initGrowth) { this(initGrowth,defaultInitCap); }
  
  public Permutation(int initCap) { this(Growth.defaultGrowth, initCap); }
  
  public Permutation() { this(Growth.defaultGrowth,defaultInitCap); }
  
  
  public void add(int x) {
	if (x < 0) return;
	ensureCapacity(x+1);
    if (data[x] < 0) {
      data[x] = inverse.size;
      inverse.add(x);
    }
  }
  
  public int get(int x) {
    if (x >= data.length) {
      return -1;
    } else {
      return data[x];
    }
  }
  
  public int inverseGet(int v) {
    if (v >= inverse.size) {
      return -1;
    } else {
      return inverse.get(v);
    }
  }
  
  public void set(int x, int v) {
    ensureCapacity(x+1);
    data[x] = v;
  }

  public void clear() {
    for (int i = 0; i < data.length; i++) {
      data[i] = -1;
    }
    inverse.clear();
  }

  public int rangeSize() { return inverse.size; }
  
  public void ensureCapacity(int desiredCap) {
    if (data.length < desiredCap) {
      int[] newData = new int[growth.grow(data.length, desiredCap)];
      System.arraycopy(data, 0, newData, 0, data.length);
      for (int i = data.length; i < newData.length; i++) {
        newData[i] = -1;
      }
      data = newData;
    }
  }
}
