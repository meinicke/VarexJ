//
// Copyright (C) 2012 United States Government as represented by the
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
 * common base for array based IntSet implementations
 */
public abstract class ArrayIntSet implements IntSet, Cloneable {
    
  protected int size;
  protected int[] elements;
  
  private class Iterator implements IntIterator {
    int next = 0;

    @Override
    public void remove() {
      int idx = next-1;
      if (idx >=0){
        if (idx < size-1){
          System.arraycopy(elements, next, elements, idx, size-idx);
        }
        size--;
        next = idx;
      }
    }

    @Override
    public boolean hasNext() {
      return (next < size);
    }

    @Override
    public int next() {
      if (next < size){
        return elements[next++];
      } else {
        throw new NoSuchElementException();
      }
    }
  }
  
  protected ArrayIntSet (){
    // nothing
  }
  
  protected ArrayIntSet (int initialCapacity){
    elements = new int[initialCapacity];
  }
  
  @Override
  public  boolean isEmpty(){
    return (size == 0);
  }
   
  @Override
  public int size(){
    return size;
  }
  
  @Override
  public void clear(){
    size = 0;
    elements = null;
  }
  
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder(/*getClass().getName()*/);
    sb.append('{');
    for (int i=0; i<size; i++){
      if (i>0){
        sb.append(',');
      }
      sb.append(elements[i]);
    }
    sb.append('}');
    return sb.toString();
  }
  
  public ArrayIntSet clone(){
    try {
      ArrayIntSet other = (ArrayIntSet) super.clone();
      other.size = size;
      if (elements != null) {
        other.elements = elements.clone();
      }
      return other;
      
    } catch (CloneNotSupportedException cnsx){
      throw new JPFException("clone failed " + this);
    }
  }
  
  /**
   * this is probably a bad hash function, but we just need something that
   * is order independent
   */
  @Override
  public int hashCode(){
    int[] a = elements;
    int n = size;
    int h = (n << 16) + (n % 3);

    for (int i = 0; i < n; i++) {
      int e = a[i];
      if (e == 0){
        e = Integer.MAX_VALUE;
      }
      int rot = e % 31;
      h ^= (h << rot) | (h >>> (32 - rot)); // rotate left
    }
    
    return h;
  }
  
  @Override
  public boolean equals (Object o){
    if (o instanceof IntSet){
      IntSet other = (IntSet)o;
      if (size == other.size()){
        int len = size;
        int[] a = elements;
        for (int i=0; i<len; i++){
          if (!other.contains(a[i])){
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  @Override
  public IntIterator intIterator (){
    return new Iterator();
  }
}
