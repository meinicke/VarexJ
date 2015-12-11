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

import java.util.Iterator;

/**
 * simplistic Object array that differentiates from ArrayList by
 * using chunks instead of exponential growth, thus efficiently dealing
 * with huge, potentially sparse arrays
 *
 * the motivation for this class is memory optimization, i.e. space efficient
 * storage of potentially huge arrays without good a-priori size guesses
 *
 * this class is awfully lifted from DynamicIntArray (same motivation, but
 * primitive types - not much factorizable functionality w/o excessive
 * casting/boxing)
 *
 * the API of this class is between a primitive array and a AbstractList. Since
 * it handles Objects, we could turn this into a Collection (and probably should)
 *
 * NOTE: like standard Collection implementations/arrays, this class is not
 * synchronized
 */

public final class DynamicObjectArray<E> implements Iterable<E> {
  final static int DEFAULT_CHUNKBITS = 8;
  final static int INIT_CHUNKS = 16;

  /** growth strategy */
  Growth growth;

  /** our allocation sizes */
  int chunkBits;
  int nPerChunk; // just a cache for (1<<chunkBits)

  /** mask for index within chunk */
  int chunkMask;

  /** the real data. limitations in generics prevent use of E[][] */
  Object[][] data;

  /** the maximum index set so far */
  int maxIndex = -1;

  class DynIterator implements Iterator<E> {
    int i;

    public boolean hasNext() {
      return (i<size());
    }

    public E next() {
      return get(i++);
    }

    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  public DynamicObjectArray () {
    this(Growth.defaultGrowth, DEFAULT_CHUNKBITS, INIT_CHUNKS);
  }

  /**
   * Creates a DynamicObjectArray in which each chunk has 2**chunkBits elements
   * and initChunks chunks are initially allocated.
   */
  public DynamicObjectArray (int chunkBits, int initChunks) {
    this(Growth.defaultGrowth, chunkBits, initChunks);
  }

  public DynamicObjectArray (Growth strategy, int chunkBits, int initChunks) {
    if (chunkBits > 20) throw new IllegalArgumentException();
    this.chunkBits = chunkBits;
    nPerChunk = 1<<chunkBits;
    this.chunkMask = nPerChunk - 1;
    data = new Object[initChunks][];
    growth = strategy;
  }

  public Iterator<E> iterator() {
    return new DynIterator();
  }

  @SuppressWarnings("unchecked")
  public E get (int index) {
    int i = index >> chunkBits;
    if (i < data.length && data[i] != null) {
      int j = index & chunkMask;
      return (E) data[i][j];
    } else {
      return null;
    }
  }

  // this is only the max size, not the max index that was accessed/set
  public int size() {
    return data.length * nPerChunk;
  }

  public int getMaxIndex() {
    return maxIndex;
  }

  public void set (int index, E value) {
    if (index > maxIndex) {
      maxIndex = index;
    }

    int i = index >> chunkBits;
    int j = index & chunkMask;

    if (i >= data.length) {
      int nChunks = growth.grow(data.length, i+1);
      Object[][] newChunks = new Object[nChunks][];
      System.arraycopy(data, 0, newChunks, 0, data.length);
      data = newChunks;
    }
    if (data[i] == null) {
      data[i] = new Object[1 << chunkBits];
    }

    data[i][j] = value;
  }

  public String toString() {
    int length = data.length * (1 << chunkBits);
    while (length > 1 && get(length-1) == null) length--;

    StringBuilder sb = new StringBuilder(length);

    sb.append('{');
    int l = length-1;
    for (int i=0; i<l; i++) {
      sb.append(get(i));
      sb.append(',');
    }
    sb.append(get(l));
    sb.append('}');

    return sb.toString();
  }

  // removed toArray method, which is confusing for 1.5
}
