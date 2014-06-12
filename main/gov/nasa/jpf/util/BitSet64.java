//
// Copyright (C) 2010 United States Government as represented by the
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

import java.util.NoSuchElementException;

import gov.nasa.jpf.JPFException;

/**
 *
 */
public class BitSet64 implements FixedBitSet, Cloneable, IntSet {

  static final int INDEX_MASK = 0xffffffc0; // ( i>=0 && i<64)

  long l0;
  int cardinality;

  public BitSet64 (){
    // nothing in here
  }

  public BitSet64 (int i){
    set(i);
  }

  public BitSet64 (int... idx){
    for (int i : idx){
      set(i);
    }
  }

  public int longSize(){
    return  1;
  }
  public long getLong(int i){
    if (i==0) {
      return l0;
    } else {
      throw new IndexOutOfBoundsException("BitSet64 has no long index " + i);
    }
  }

  public BitSet64 clone() {
    try {
      return (BitSet64) super.clone();
    } catch (CloneNotSupportedException ex) {
      throw new JPFException("BitSet64 clone failed");
    }
  }

  private final int computeCardinality (){
    return Long.bitCount(l0);
  }

  //--- public interface (much like java.util.BitSet)

  public void set (int i){
    if ((i & INDEX_MASK) == 0){
      long bitPattern = (1L << i);
      if ((l0 & bitPattern) == 0L) {
        cardinality++;
        l0 |= bitPattern;
      }
    } else {
      throw new IndexOutOfBoundsException("BitSet64 index out of range: " + i);
    }
  }

  public void clear (int i){
    if ((i & INDEX_MASK) == 0){
      long bitPattern = (1L << i);
      if ((l0 & bitPattern) != 0L) { // bit is set
        cardinality--;
        l0 &= ~bitPattern;
      }
    } else {
      throw new IndexOutOfBoundsException("BitSet64 index out of range: " + i);
    }
  }

  public void set (int i, boolean val){
    if (val) {
      set(i);
    } else {
      clear(i);
    }
  }

  public boolean get (int i){
    if ((i & INDEX_MASK) == 0){
      long bitPattern = (1L << i);
      return ((l0 & bitPattern) != 0);
    } else {
      throw new IndexOutOfBoundsException("BitSet64 index out of range: " + i);
    }
  }

  public int cardinality() {
    return cardinality;
  }

  public int capacity(){
    return 64;
  }
  
  /**
   * number of bits we can store
   */
  public int size() {
    return cardinality;
  }

  /**
   * index of highest set bit + 1
   */
  public int length() {
    return 64 - Long.numberOfLeadingZeros(l0);
  }

  public boolean isEmpty() {
    return (cardinality == 0);
  }

  public void clear() {
    l0 = 0L;
    cardinality = 0;
  }

  public int nextSetBit (int fromIdx){
    if ((fromIdx & INDEX_MASK) == 0){
      //int n = Long.numberOfTrailingZeros(l0 & (0xffffffffffffffffL << fromIdx));
      int n = Long.numberOfTrailingZeros(l0 >> fromIdx) + fromIdx;
      if (n < 64) {
        return n;
      } else {
        return -1;
      }
    } else {
      //throw new IndexOutOfBoundsException("BitSet64 index out of range: " + fromIdx);
      return -1;
    }
  }

  public int nextClearBit (int fromIdx){
    if ((fromIdx & INDEX_MASK) == 0){
      //int n = Long.numberOfTrailingZeros(~l0 & (0xffffffffffffffffL << fromIdx));
      int n = Long.numberOfTrailingZeros(~l0 >> fromIdx) + fromIdx;
      if (n < 64) {
        return n;
      } else {
        return -1;
      }
    } else {
      //throw new IndexOutOfBoundsException("BitSet64 index out of range: " + fromIdx);
      return -1;
    }
  }

  public void and (BitSet64 other){
    l0 &= other.l0;

    cardinality = computeCardinality();
  }

  public void andNot (BitSet64 other){
    l0 &= ~other.l0;

    cardinality = computeCardinality();
  }

  public void or (BitSet64 other){
    l0 |= other.l0;

    cardinality = computeCardinality();
  }

  public boolean equals (Object o){
    if (o instanceof BitSet64){
      BitSet64 other = (BitSet64)o;
      if (l0 != other.l0) return false;
      return true;
    } else {
      // <2do> we could compare to a normal java.util.BitSet here
      return false;
    }
  }

  public void hash(HashData hd){
    hd.add(hashCode());
  }

  /**
   * answer the same hashCodes as java.util.BitSet
   */
  public int hashCode() {
    long hc = 1234;
    hc ^= l0;
    return (int) ((hc >>32) ^ hc);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');

    boolean first = true;
    for (int i=nextSetBit(0); i>= 0; i = nextSetBit(i+1)){
      if (!first){
        sb.append(',');
      } else {
        first = false;
      }
      sb.append(i);
    }

    sb.append('}');

    return sb.toString();
  }

  //--- IntSet interface
  
  class SetBitIterator implements IntIterator {
    int cur = 0;
    int nBits;
    
    @Override
    public void remove() {
      if (cur >0){
        clear(cur-1);
      }
    }

    @Override
    public boolean hasNext() {
      return nBits < cardinality;
    }

    @Override
    public int next() {
      if (nBits < cardinality){
        int idx = nextSetBit(cur);
        if (idx >= 0){
          nBits++;
          cur = idx+1;
        }
        return idx;
        
      } else {
        throw new NoSuchElementException();
      }
    }
  }
  
  @Override
  public boolean add(int i) {
    if (get(i)) {
      return false;
    } else {
      set(i);
      return true;
    }
  }

  @Override
  public boolean remove(int i) {
    if (get(i)) {
      clear(i);
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean contains(int i) {
    return get(i);
  }

  @Override
  public IntIterator intIterator() {
    return new SetBitIterator();
  }
}
