//
// Copyright (C) 2011 United States Government as represented by the
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
import java.util.NoSuchElementException;

/**
 * a generic set of comparable objects with value based inclusion check
 * (i.e. using equals())
 * objects that return compareTo() == 0 are entered LIFO
 */
public class SortedArrayObjectSet<T extends Comparable<T>> implements Iterable<T> {

  static final int DEFAULT_CAPACITY = 8;
  static final int GROWTH = 8;
      
  class StorageIterator implements Iterator<T>{
    int next;
    
    public boolean hasNext() {
      return (next < size);
    }

    public T next() {
      if (next < size){
        return (T)elements[next++];
      } else {
        throw new NoSuchElementException();
      }
    }

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
  }
  
  
  int size;
  Comparable<T>[] elements;
  
  //--- private methods
  
  // returns the index where the match should be
  // caller has to make sure size > 0
  protected final int bisect (T val){
    int min = 0;
    int max = size-1;
    Comparable<T>[] a = elements;
    
    while (max > min) {
      int mid = (min + max) / 2;
      
      if (a[mid].compareTo(val) < 0) {
        min = mid + 1;
      } else {
        max = mid;
      }
    }
    
    return min;
  }
  
  
  // if we already have elements, idx has to be within range
  protected final void insertElement (int idx){
    if (elements == null){
      elements = (Comparable[]) new Comparable[DEFAULT_CAPACITY];
     
    } else {
      Comparable[] a = elements;      
      
      if (size == a.length){
        int newLength = a.length + GROWTH;
        Comparable[] newElements = new Comparable[newLength];
        if (idx > 0){
          System.arraycopy(a, 0, newElements, 0, idx);
        }
        if (idx < size){
          System.arraycopy(a, idx, newElements, idx+1, size-idx);
        }
        elements = newElements;
        
      } else {
        System.arraycopy(a, idx, a, idx+1, size-idx);
      }
    }
  }
  
  
  //--- public methods
  
  public SortedArrayObjectSet (){
    // nothing
  }
  
  public SortedArrayObjectSet (int initialCapacity){
    elements = new Comparable[initialCapacity];
  }
  
  public int size(){
    return size;
  }
  
  public boolean isEmpty(){
    return (size == 0);
  }
  
  public boolean contains (T v) {
    return ((size > 0) && elements[bisect(v)].equals(v));      
  }
  
  public void add (T v){
    if (size == 0){
      elements = new Comparable[DEFAULT_CAPACITY];
      elements[0] = v;
      size++;
      
    } else {
      int i = bisect(v);
      Comparable<T> e = elements[i];
      if (!e.equals(v)){
        if (e.compareTo(v) < 0){
          i++;
        }
        
        insertElement(i);
        elements[i] = v;
        size++;
      }
    }
  }
    
  public void remove (T v) {
    int len = size;
    
    if (len > 0){
      Comparable<T>[] a = elements;
      
      for (int i = bisect(v); i<size && a[i].compareTo(v) == 0; i++) {
        if (v.equals(a[i])){
          len--;
          if (len == 0) {
            elements = null;
            size = 0;

          } else {
            if (i < len) {
              System.arraycopy(a, i + 1, a, i, (len - i));
            }
            size = len;
          }
          
          return;
        }
      }
    }    
  }

  public Iterator<T> iterator(){
    return new StorageIterator();
  }
  
  @Override
  public String toString (){
    
    StringBuilder sb = new StringBuilder("{");
    
    for (int i=0; i<size; i++){
      if (i > 0){
        sb.append(',');
      }
      sb.append(elements[i]);
    }
    
    sb.append('}');
    return sb.toString();
  }
}
