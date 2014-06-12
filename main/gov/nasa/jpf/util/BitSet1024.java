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

import gov.nasa.jpf.JPFException;


/**
 * a fixed size BitSet with 1024 bits.
 *
 * The main motivation for this class is to minimize memory size while maximizing
 * performance and keeping a java.util.BitSet compatible interface. The only
 * deviation from the standard BitSet is that we assume more cardinality() calls
 * than set()/clear() calls, i.e. we want to cache this value
 *
 * Instances of this class do not allocate any additional memory, we keep all
 * data in builtin type fields
 */
public class BitSet1024 implements FixedBitSet, Cloneable {

  public static final int INDEX_MASK = 0xfffffc00;

  long l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
  int cardinality;

  public BitSet1024 (){
    // nothing in here
  }

  public BitSet1024 (int i){
    set(i);
  }

  public BitSet1024 (int... idx){
    for (int i : idx){
      set(i);
    }
  }

  public int longSize(){
    return  4;
  }
  public long getLong(int i){
    switch (i){
      case 0: return l0;
      case 1: return l1;
      case 2: return l2;
      case 3: return l3;
      case 4: return l4;
      case 5: return l5;
      case 6: return l6;
      case 7: return l7;
      case 8: return l8;
      case 9: return l9;
      case 10: return l10;
      case 11: return l11;
      case 12: return l12;
      case 13: return l13;
      case 14: return l14;
      case 15: return l15;
      default:
        throw new IndexOutOfBoundsException("BitSet1022 has no long index " + i);
    }
  }

  public BitSet1024 clone() {
    try {
      return (BitSet1024) super.clone();
    } catch (CloneNotSupportedException ex) {
      throw new JPFException("BitSet1024 clone failed");
    }
  }

  private final int computeCardinality (){
    int n= Long.bitCount(l0);
    n += Long.bitCount(l1);
    n += Long.bitCount(l2);
    n += Long.bitCount(l3);
    n += Long.bitCount(l4);
    n += Long.bitCount(l5);
    n += Long.bitCount(l6);
    n += Long.bitCount(l7);
    n += Long.bitCount(l8);
    n += Long.bitCount(l9);
    n += Long.bitCount(l10);
    n += Long.bitCount(l11);
    n += Long.bitCount(l12);
    n += Long.bitCount(l13);
    n += Long.bitCount(l14);
    n += Long.bitCount(l15);   
    return n;
  }

  //--- public interface (much like java.util.BitSet)

  public void set (int i){
    if ((i & INDEX_MASK) == 0) {
      long bitPattern = (1L << i);

      switch (i >> 6) {
        case 0:
          if ((l0 & bitPattern) == 0L) {
            cardinality++;
            l0 |= bitPattern;
          }
          break;
        case 1:
          if ((l1 & bitPattern) == 0L) {
            cardinality++;
            l1 |= bitPattern;
          }
          break;
        case 2:
          if ((l2 & bitPattern) == 0L) {
            cardinality++;
            l2 |= bitPattern;
          }
          break;
        case 3:
          if ((l3 & bitPattern) == 0L) {
            cardinality++;
            l3 |= bitPattern;
          }
          break;
        case 4:
            if ((l4 & bitPattern) == 0L) {
              cardinality++;
              l4 |= bitPattern;
            }
            break;
        case 5:
            if ((l5 & bitPattern) == 0L) {
              cardinality++;
              l5 |= bitPattern;
            }
            break;
        case 6:
            if ((l6 & bitPattern) == 0L) {
              cardinality++;
              l6 |= bitPattern;
            }
            break;
        case 7:
            if ((l7 & bitPattern) == 0L) {
              cardinality++;
              l7 |= bitPattern;
            }
            break;
        case 8:
            if ((l8 & bitPattern) == 0L) {
              cardinality++;
              l8 |= bitPattern;
            }
            break;
        case 9:
            if ((l9 & bitPattern) == 0L) {
              cardinality++;
              l9 |= bitPattern;
            }
            break;
        case 10:
            if ((l10 & bitPattern) == 0L) {
              cardinality++;
              l10 |= bitPattern;
            }
            break;
        case 11:
            if ((l11 & bitPattern) == 0L) {
              cardinality++;
              l11 |= bitPattern;
            }
            break;
        case 12:
            if ((l12 & bitPattern) == 0L) {
              cardinality++;
              l12 |= bitPattern;
            }
            break;
        case 13:
            if ((l13 & bitPattern) == 0L) {
              cardinality++;
              l13 |= bitPattern;
            }
            break;
        case 14:
            if ((l14 & bitPattern) == 0L) {
              cardinality++;
              l14 |= bitPattern;
            }
            break;
        case 15:
            if ((l15 & bitPattern) == 0L) {
              cardinality++;
              l15 |= bitPattern;
            }
      }
    } else {
      throw new IndexOutOfBoundsException("BitSet1024 index out of range: " + i);
    }
  }

  public void clear (int i){
    if ((i & INDEX_MASK) == 0) {
      long bitPattern = (1L << i);

      switch (i >> 6) {
        case 0:
          if ((l0 & bitPattern) != 0L) {
            cardinality--;
            l0 &= ~bitPattern;
          }
          break;
        case 1:
          if ((l1 & bitPattern) != 0L) {
            cardinality--;
            l1 &= ~bitPattern;
          }
          break;
        case 2:
          if ((l2 & bitPattern) != 0L) {
            cardinality--;
            l2 &= ~bitPattern;
          }
          break;
        case 3:
          if ((l3 & bitPattern) != 0L) {
            cardinality--;
            l3 &= ~bitPattern;
          }
        case 4:
            if ((l4 & bitPattern) != 0L) {
              cardinality--;
              l4 &= ~bitPattern;
            }
            break;
        case 5:
            if ((l5 & bitPattern) != 0L) {
              cardinality--;
              l5 &= ~bitPattern;
            }
            break;
        case 6:
            if ((l6 & bitPattern) != 0L) {
              cardinality--;
              l6 &= ~bitPattern;
            }
            break;
        case 7:
            if ((l7 & bitPattern) != 0L) {
              cardinality--;
              l7 &= ~bitPattern;
            }
            break;
        case 8:
            if ((l8 & bitPattern) != 0L) {
              cardinality--;
              l8 &= ~bitPattern;
            }
            break;
        case 9:
            if ((l9 & bitPattern) != 0L) {
              cardinality--;
              l9 &= ~bitPattern;
            }
            break;
        case 10:
            if ((l10 & bitPattern) != 0L) {
              cardinality--;
              l10 &= ~bitPattern;
            }
            break;
        case 11:
            if ((l11 & bitPattern) != 0L) {
              cardinality--;
              l11 &= ~bitPattern;
            }
            break;
        case 12:
            if ((l12 & bitPattern) != 0L) {
              cardinality--;
              l12 &= ~bitPattern;
            }
            break;
        case 13:
            if ((l13 & bitPattern) != 0L) {
              cardinality--;
              l13 &= ~bitPattern;
            }
            break;
        case 14:
            if ((l14 & bitPattern) != 0L) {
              cardinality--;
              l14 &= ~bitPattern;
            }
            break;
        case 15:
            if ((l15 & bitPattern) != 0L) {
              cardinality--;
              l15 &= ~bitPattern;
            }
      }
    } else {
      throw new IndexOutOfBoundsException("BitSet1024 index out of range: " + i);
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
    if ((i & INDEX_MASK) == 0) {
      long bitPattern = (1L << i);

      switch (i >> 6) {
        case 0:
          return ((l0 & bitPattern) != 0);
        case 1:
          return ((l1 & bitPattern) != 0);
        case 2:
          return ((l2 & bitPattern) != 0);
        case 3:
          return ((l3 & bitPattern) != 0);
        case 4:
            return ((l4 & bitPattern) != 0);
        case 5:
            return ((l5 & bitPattern) != 0);
        case 6:
            return ((l6 & bitPattern) != 0);
        case 7:
            return ((l7 & bitPattern) != 0);
        case 8:
            return ((l8 & bitPattern) != 0);
        case 9:
            return ((l9 & bitPattern) != 0);
        case 10:
            return ((l10 & bitPattern) != 0);
        case 11:
            return ((l11 & bitPattern) != 0);
        case 12:
            return ((l12 & bitPattern) != 0);
        case 13:
            return ((l13 & bitPattern) != 0);
        case 14:
            return ((l14 & bitPattern) != 0);
        case 15:
            return ((l15 & bitPattern) != 0);
      }
    }

    throw new IndexOutOfBoundsException("BitSet1024 index out of range: " + i);
  }

  public int cardinality() {
    return cardinality;
  }
  
  public int size() {
    return cardinality;
  }


  /**
   * number of bits we can store
   */
  public int capacity() {
    return 1024;
  }

  /**
   * index of highest set bit + 1
   */
  public int length() {
   if (l15 != 0){
	  return 1024 - Long.numberOfLeadingZeros(l15);
   } else if (l14 != 0) {
	  return 960 - Long.numberOfLeadingZeros(l14);
   } else if (l13 != 0) {
	  return 896 - Long.numberOfLeadingZeros(l13);
   } else if (l12 != 0) {
	  return 832 - Long.numberOfLeadingZeros(l12);
   } else if (l11 != 0) {
	  return 768 - Long.numberOfLeadingZeros(l11);
   } else if (l10 != 0) {
	  return 704 - Long.numberOfLeadingZeros(l10);
   } else if (l9 != 0) {
	  return 640 - Long.numberOfLeadingZeros(l9);
   } else if (l8 != 0) {
	  return 576 - Long.numberOfLeadingZeros(l8);
   } else if (l7 != 0) {
	  return 512 - Long.numberOfLeadingZeros(l7);
   } else if (l6 != 0) {
	  return 448 - Long.numberOfLeadingZeros(l6);
   } else if (l5 != 0) {
	  return 384 - Long.numberOfLeadingZeros(l5);
   } else if (l4 != 0) {
	  return 320 - Long.numberOfLeadingZeros(l4);
   } else if (l3 != 0){
      return 256 - Long.numberOfLeadingZeros(l3);
   } else if (l2 != 0){
      return 192 - Long.numberOfLeadingZeros(l2);
   } else if (l1 != 0){
      return 128 - Long.numberOfLeadingZeros(l1);
   } else if (l1 != 0){
      return 64 - Long.numberOfLeadingZeros(l0);
   } else {
      return 0;
   }
  }

  public boolean isEmpty() {
    return (cardinality == 0);
  }

  public void clear() {
    l0 = l1 = l2 = l3 = l4 = l5 = l6 = l7
    = l8 = l9= l10 = l11 = l12 = l13 = l14
    = l15 =0L;
    cardinality = 0;
  }


  public int nextSetBit (int fromIdx){
    if ((fromIdx & INDEX_MASK) == 0) {
      int i;
      int i0 = fromIdx & 0x3f;
      switch (fromIdx >> 6){
        case 0:
          if ((i=Long.numberOfTrailingZeros(l0 & (0xffffffffffffffffL << i0))) <64) return i;
          if ((i=Long.numberOfTrailingZeros(l1)) <64) return i + 64;
          if ((i=Long.numberOfTrailingZeros(l2)) <64) return i + 128;
          if ((i=Long.numberOfTrailingZeros(l3)) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
          break;
        case 1:
          if ((i=Long.numberOfTrailingZeros(l1 & (0xffffffffffffffffL << i0))) <64) return i + 64;
          if ((i=Long.numberOfTrailingZeros(l2)) <64) return i + 128;
          if ((i=Long.numberOfTrailingZeros(l3)) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
          break;
        case 2:
          if ((i=Long.numberOfTrailingZeros(l2 & (0xffffffffffffffffL << i0))) <64) return i + 128;
          if ((i=Long.numberOfTrailingZeros(l3)) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
          break;
        case 3:
          if ((i=Long.numberOfTrailingZeros(l3 & (0xffffffffffffffffL << i0))) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
          break;
        case 4:
        	  if ((i=Long.numberOfTrailingZeros(l4 & (0xffffffffffffffffL << i0))) <64) return i + 256;
              if ((i=Long.numberOfTrailingZeros(l5)) <64) return i + 320;
              if ((i=Long.numberOfTrailingZeros(l6)) <64) return i + 384;
              if ((i=Long.numberOfTrailingZeros(l7)) <64) return i + 448;
              if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
              if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
              if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
              if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
              if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
          break;
        case 5:
              if ((i=Long.numberOfTrailingZeros(l5 & (0xffffffffffffffffL << i0))) <64) return i + 320;
              if ((i=Long.numberOfTrailingZeros(l6)) <64) return i + 384;
              if ((i=Long.numberOfTrailingZeros(l7)) <64) return i + 448;
              if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
              if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
              if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
              if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
              if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
          break;
        case 6:
      	  if ((i=Long.numberOfTrailingZeros(l6 & (0xffffffffffffffffL << i0))) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 7:
       	  if ((i=Long.numberOfTrailingZeros(l7 & (0xffffffffffffffffL << i0))) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 8:
       	  if ((i=Long.numberOfTrailingZeros(l8 & (0xffffffffffffffffL << i0))) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 9:
      	  if ((i=Long.numberOfTrailingZeros(l9 & (0xffffffffffffffffL << i0))) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 10:
      	  if ((i=Long.numberOfTrailingZeros(l10 & (0xffffffffffffffffL << i0))) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 11:
         	  if ((i=Long.numberOfTrailingZeros(l11 & (0xffffffffffffffffL << i0))) <64) return i + 704;
              if ((i=Long.numberOfTrailingZeros(l12)) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 12:
        	  if ((i=Long.numberOfTrailingZeros(l12 & (0xffffffffffffffffL << i0))) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 13:
        	 if ((i=Long.numberOfTrailingZeros(l13 & (0xffffffffffffffffL << i0))) <64) return i + 832;
             if ((i=Long.numberOfTrailingZeros(l14)) <64) return i + 896;
             if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 14:
        	 if ((i=Long.numberOfTrailingZeros(l14 & (0xffffffffffffffffL << i0))) <64) return i + 896;
             if ((i=Long.numberOfTrailingZeros(l15)) <64) return i + 960;
            break;
        case 15:
       	 if ((i=Long.numberOfTrailingZeros(l15 & (0xffffffffffffffffL << i0))) <64) return i + 960;
            break;
      }
      return -1;

    }
    return -1;
  }

  public int nextClearBit (int fromIdx){
    if ((fromIdx & INDEX_MASK) == 0) {
      int i;
      int i0 = fromIdx & 0x3f;
      switch (fromIdx >> 6){
        case 0:
          if ((i=Long.numberOfTrailingZeros(~l0 & (0xffffffffffffffffL << i0))) <64) return i;
          if ((i=Long.numberOfTrailingZeros(~l1)) <64) return i + 64;
          if ((i=Long.numberOfTrailingZeros(~l2)) <64) return i + 128;
          if ((i=Long.numberOfTrailingZeros(~l3)) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(~l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(~l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(~l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(~l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
          break;
        case 1:
          if ((i=Long.numberOfTrailingZeros(~l1 & (0xffffffffffffffffL << i0))) <64) return i + 64;
          if ((i=Long.numberOfTrailingZeros(~l2)) <64) return i + 128;
          if ((i=Long.numberOfTrailingZeros(~l3)) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(~l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(~l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(~l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(~l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
          break;
        case 2:
          if ((i=Long.numberOfTrailingZeros(~l2 & (0xffffffffffffffffL << i0))) <64) return i + 128;
          if ((i=Long.numberOfTrailingZeros(~l3)) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(~l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(~l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(~l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(~l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
          break;
        case 3:
          if ((i=Long.numberOfTrailingZeros(~l3 & (0xffffffffffffffffL << i0))) <64) return i + 192;
          if ((i=Long.numberOfTrailingZeros(~l4)) <64) return i + 256;
          if ((i=Long.numberOfTrailingZeros(~l5)) <64) return i + 320;
          if ((i=Long.numberOfTrailingZeros(~l6)) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(~l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
          break;
        case 4:
        	  if ((i=Long.numberOfTrailingZeros(~l4 & (0xffffffffffffffffL << i0))) <64) return i + 256;
              if ((i=Long.numberOfTrailingZeros(~l5)) <64) return i + 320;
              if ((i=Long.numberOfTrailingZeros(~l6)) <64) return i + 384;
              if ((i=Long.numberOfTrailingZeros(~l7)) <64) return i + 448;
              if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
              if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
              if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
              if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
              if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
          break;
        case 5:
              if ((i=Long.numberOfTrailingZeros(~l5 & (0xffffffffffffffffL << i0))) <64) return i + 320;
              if ((i=Long.numberOfTrailingZeros(~l6)) <64) return i + 384;
              if ((i=Long.numberOfTrailingZeros(~l7)) <64) return i + 448;
              if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
              if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
              if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
              if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
              if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
          break;
        case 6:
      	  if ((i=Long.numberOfTrailingZeros(~l6 & (0xffffffffffffffffL << i0))) <64) return i + 384;
          if ((i=Long.numberOfTrailingZeros(~l7)) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 7:
       	  if ((i=Long.numberOfTrailingZeros(~l7 & (0xffffffffffffffffL << i0))) <64) return i + 448;
          if ((i=Long.numberOfTrailingZeros(~l8)) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 8:
       	  if ((i=Long.numberOfTrailingZeros(~l8 & (0xffffffffffffffffL << i0))) <64) return i + 512;
          if ((i=Long.numberOfTrailingZeros(~l9)) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 9:
      	  if ((i=Long.numberOfTrailingZeros(~l9 & (0xffffffffffffffffL << i0))) <64) return i + 576;
          if ((i=Long.numberOfTrailingZeros(~l10)) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 10:
      	  if ((i=Long.numberOfTrailingZeros(~l10 & (0xffffffffffffffffL << i0))) <64) return i + 640;
          if ((i=Long.numberOfTrailingZeros(~l11)) <64) return i + 704;
          if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
          if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
          if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
          if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 11:
         	  if ((i=Long.numberOfTrailingZeros(~l11 & (0xffffffffffffffffL << i0))) <64) return i + 704;
              if ((i=Long.numberOfTrailingZeros(~l12)) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 12:
        	  if ((i=Long.numberOfTrailingZeros(~l12 & (0xffffffffffffffffL << i0))) <64) return i + 768;
              if ((i=Long.numberOfTrailingZeros(~l13)) <64) return i + 832;
              if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
              if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 13:
        	 if ((i=Long.numberOfTrailingZeros(~l13 & (0xffffffffffffffffL << i0))) <64) return i + 832;
             if ((i=Long.numberOfTrailingZeros(~l14)) <64) return i + 896;
             if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 14:
        	 if ((i=Long.numberOfTrailingZeros(~l14 & (0xffffffffffffffffL << i0))) <64) return i + 896;
             if ((i=Long.numberOfTrailingZeros(~l15)) <64) return i + 960;
            break;
        case 15:
       	 if ((i=Long.numberOfTrailingZeros(~l15 & (0xffffffffffffffffL << i0))) <64) return i + 960;
            break;
      }

      return -1;

    } else {
      //throw new IndexOutOfBoundsException("BitSet256 index out of range: " + fromIdx);
      return -1;
    }
  }

  public void and (BitSet1024 other){
    l0 &= other.l0;
    l1 &= other.l1;
    l2 &= other.l2;
    l3 &= other.l3;
    l4 &= other.l4;
    l5 &= other.l5;
    l6 &= other.l6;
    l7 &= other.l7;
    l8 &= other.l8;
    l9 &= other.l9;
    l10 &= other.l10;
    l11 &= other.l11;
    l12 &= other.l12;
    l13 &= other.l13;
    l14 &= other.l14;
    l15 &= other.l15;

    cardinality = computeCardinality();
  }

  public void andNot (BitSet1024 other){
    l0 &= ~other.l0;
    l1 &= ~other.l1;
    l2 &= ~other.l2;
    l3 &= ~other.l3;
    l4 &= ~other.l4;
    l5 &= ~other.l5;
    l6 &= ~other.l6;
    l7 &= ~other.l7;
    l8 &= ~other.l8;
    l9 &= ~other.l9;
    l10 &= ~other.l10;
    l11 &= ~other.l11;
    l12 &= ~other.l12;
    l13 &= ~other.l13;
    l14 &= ~other.l14;
    l15 &= ~other.l15;

    cardinality = computeCardinality();
  }

  public void or (BitSet1024 other){
    l0 |= other.l0;
    l1 |= other.l1;
    l2 |= other.l2;
    l3 |= other.l3;
    l4 |= other.l4;
    l5 |= other.l5;
    l6 |= other.l6;
    l7 |= other.l7;
    l8 |= other.l8;
    l9 |= other.l9;
    l10 |= other.l10;
    l11 |= other.l11;
    l12 |= other.l12;
    l13 |= other.l13;
    l14 |= other.l14;
    l15 |= other.l15;

    cardinality = computeCardinality();
  }

  public boolean equals (Object o){
    if (o instanceof BitSet1024){
      BitSet1024 other = (BitSet1024)o;
      if (l0 != other.l0) return false;
      if (l1 != other.l1) return false;
      if (l2 != other.l2) return false;
      if (l3 != other.l3) return false;
      if (l4 != other.l4) return false;
      if (l5 != other.l5) return false;
      if (l6 != other.l6) return false;
      if (l7 != other.l7) return false;
      if (l8 != other.l8) return false;
      if (l9 != other.l9) return false;
      if (l10 != other.l10) return false;
      if (l11 != other.l11) return false;
      if (l12 != other.l12) return false;
      if (l13 != other.l13) return false;
      if (l14 != other.l14) return false;
      if (l15 != other.l15) return false;

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
    hc ^= l1*2;
    hc ^= l2*3;
    hc ^= l4*4;
    hc ^= l5*5;
    hc ^= l6*6;
    hc ^= l7*7;
    hc ^= l8*8;
    hc ^= l9*9;
    hc ^= l10*10;
    hc ^= l11*11;
    hc ^= l12*12;
    hc ^= l13*13;
    hc ^= l14*14;
    hc ^= l15*15;
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
}
