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
 * simplistic dynamic array that differentiates from ArrayList by
 *  - using chunks instead of exponential growth, thus efficiently dealing
 *    with sparse arrays
 *  - managing primitive 'int' types, i.e. not requiring box objects
 *
 * the motivation for this class is memory optimization, i.e. space efficient
 * storage of potentially huge arrays without good a-priori size guesses
 *
 * the API of this class is between a primitive array and a AbstractList. It's
 * not a Collection implementation because it handles primitive types, but the
 * API could be extended to support iterators and the like.
 *
 * NOTE: like standard Collection implementations/arrays, this class is not
 * synchronized
 */
public final class DynamicIntArray implements Iterable<Integer> {
  final static int DEFAULT_CHUNKBITS = 8;
  final static int INIT_CHUNKS = 16;

  class DynIntIterator implements Iterator<Integer> {
    int i;
    
    public boolean hasNext() {
      return (i<size());
    }

    public Integer next() {
      return new Integer(get(i++));
    }

    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
  
  /** growth strategy */
  Growth growth;
  
  /** our allocation sizes */
  int chunkBits;
  int nPerChunk; // just a cache for (1<<chunkBits)
  
  /** mask for index within chunk */
  int chunkMask;
  
  /** the real data. limitations in generics prevent use of E[][] */
  int[][] data;
  
  /** the maximum index set so far */
  int maxIndex = -1;
  
  public DynamicIntArray () {
    this(Growth.defaultGrowth, DEFAULT_CHUNKBITS, INIT_CHUNKS);
  }

  public DynamicIntArray (int size) {
    this(Growth.defaultGrowth, DEFAULT_CHUNKBITS,
        (size + (1<<DEFAULT_CHUNKBITS)-1) / (1<<DEFAULT_CHUNKBITS));
  }
  
  /**
   * Creates a DynamicIntArray in which each chunk has 2**chunkBits elements
   * and initChunks chunks are initially allocated. 
   */
  public DynamicIntArray (int chunkBits, int initChunks) {
    this(Growth.defaultGrowth, chunkBits, initChunks);
  }
  
  public DynamicIntArray (Growth strategy, int chunkBits, int initChunks) {
    if (chunkBits > 20) throw new IllegalArgumentException();
    this.chunkBits = chunkBits;
    nPerChunk = 1<<chunkBits;
    this.chunkMask = nPerChunk - 1;
    data = new int[initChunks][];
    growth = strategy;
  }

  public int get (int index) {
    int i = index >> chunkBits;
    if (i < data.length && data[i] != null) {
      int j = index & chunkMask;
      return data[i][j];
    } else {
      return 0;
    }
  }

  // this is only the max size, not the max index that was accessed/set
  public int size() {
    return data.length * nPerChunk;
  }
  
  public int getMaxIndex() {
    return maxIndex;
  }
  
  public void set (int index, int value) {
    if (index > maxIndex) {
      maxIndex = index;
    }
    
    int i = index >> chunkBits;
    int j = index & chunkMask;
    
    if (i >= data.length) {
      int nChunks = growth.grow(data.length, i+1);
      int[][] newChunks = new int[nChunks][];
      System.arraycopy(data, 0, newChunks, 0, data.length);
      data = newChunks;
    }
    if (data[i] == null) {
      data[i] = new int[nPerChunk];
    }
    
    data[i][j] = value;
  }

  public String toString() {
    int length = data.length * nPerChunk;
    while (length > 1 && get(length-1) == 0) length--;

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

  public Iterator<Integer> iterator() {
    return new DynIntIterator();
  }


  /**************************** debug & test ************
  public void dump () {
    int i, j;
    for (i=0; i<data.length; i++) {
      System.out.print( "[" + i + "]: ");
      if (data[i] != null) {
        System.out.print("{");
        int l = data[i].length-1;
        for (j=0; j<l; j++) {
          System.out.print(data[i][j]);
          System.out.print(',');
        }
        System.out.print( data[i][j]);
        System.out.println("}");
      } else {
        System.out.println( "null");
      }
    }
  }

  public static void main (String[] args) {
    int i;
    DynamicIntArray a = new DynamicIntArray(8);

    a.set(0, 42);
    a.set(13,13);
    a.set(24, 42);

    a.set(600, -1);
    System.out.println(a.get(599));
    System.out.println(a.get(600));
    
    System.out.println( "--------- " + a.size());
    //System.out.println(a);
    System.out.println(); System.out.println();
    //a.dump();
  }
  
  ***************************** end debug & test *********/
}

