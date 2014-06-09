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
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Wrapper for arrays of objects which provides proper equals() and hashCode()
 * methods, and behaves nicely with Java 1.5 generics. 
 */
public final class ObjArray<E> implements ReadOnlyObjList<E>, Iterable<E>, Cloneable  {
  final Object[] data;

  public ObjArray(int size) {
    data = new Object[size];
  }
  
  public ObjArray(E[] data) {
    this.data = data;
  }

  public ObjArray<E> clone() {
    return new ObjArray( data.clone());
  }


  public E[] toArray (E[] a) {
    if (a.length >= data.length) {
      System.arraycopy(data,0,a,0,data.length);
      return a;
    } else {
      return null;
    }
  }
  
  
  @SuppressWarnings("unchecked")
  public E get(int idx) {
    return (E) data[idx];
  }
  
  public void set(int idx, E e) {
    data[idx] = e;
  }
  
  public int length() {
    return data.length;
  }
  
  public int hashCode() {
    return Arrays.hashCode(data);
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (! (o instanceof ObjArray)) return false;
    Object[] thatData = ((ObjArray)o).data;
    Object[] thisData = this.data;
    
    // could cause NullPointerException for non-robust .equals 
    // return Arrays.equals(thisData, thatData);
    
    if (thisData == thatData) return true;
    if (thisData.length != thatData.length) return false;
    for (int i = 0; i < thisData.length; i++) {
      if (!Misc.equal(thisData[i], thatData[i])) {
        return false;
      }
    }
    return true;
  }

  public void fill(E e) {
    Arrays.fill(data, e);
  }
  
  public void nullify () {
    Arrays.fill(data, null);
  }
  
  public static <T> void copy(ObjArray<? extends T> src, int srcPos,
                              ObjArray<T> dst, int dstPos, int len) {
    System.arraycopy(src.data, srcPos, dst.data, dstPos, len);
  }

  static final ObjArray<Object> zero = new ObjArray<Object>(0);
  @SuppressWarnings("unchecked")
  public static <T> ObjArray<T> zeroLength() {
    return (ObjArray<T>) zero;
  }
  
  public Iterator<E> iterator () {
    return new Iterator<E>() {
      int idx = 0;

      public boolean hasNext () {
        return idx < data.length;
      }

      @SuppressWarnings("unchecked")
      public E next () {
        if (idx >= data.length) throw new NoSuchElementException();
        return (E) data[idx++];
      }

      public void remove () {
        throw new UnsupportedOperationException();
      }
    };
  }
}
