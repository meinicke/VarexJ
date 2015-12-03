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


/**
 * a set of integers that uses a simple sorted int array and binary search
 * 
 * To be used in a context where
 * 
 *  - the number of elements does not have a hard limit
 *  - the number of elements is assumed to be small, but potentially sparse
 *  - the following operations are time critical
 *     + inclusion check
 *     + size check
 *     + cloning
 *     + iteration over elements
 *  - adding/removing should be better than O(N)
 *  
 */
public class SortedArrayIntSet extends ArrayIntSet {
  
  static final int DEFAULT_CAPACITY = 8;
  static final int GROWTH = 8;
      
  //--- private methods
  
  // returns the index where the match should be
  // caller has to make sure size > 0
  protected final int bisect (int val){
    int min = 0;
    int max = size-1;
    int[] a = elements;
    
    while (max > min) {
      int mid = (min + max) / 2;
      
      if (a[mid] < val) {
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
      elements = new int[DEFAULT_CAPACITY];
     
    } else {
      int[] a = elements;      
      
      if (size == a.length){
        int newLength = a.length + GROWTH;
        int[] newElements = new int[newLength];
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
  
  public SortedArrayIntSet (){
    // nothing
  }
  
  public SortedArrayIntSet (int initialCapacity){
    super(initialCapacity);
  }
  
  @Override
  public boolean contains (int v) {
    return ((size > 0) && elements[bisect(v)] == v);      
  }
  
  @Override
  public boolean add (int v){
    if (size == 0){
      elements = new int[DEFAULT_CAPACITY];
      elements[0] = v;
      size++;
      return true;
      
    } else {
      int i = bisect(v);
      int e = elements[i];
      if (e != v){
        if (e < v) {
          i++;
        }
        
        insertElement(i);
        elements[i] = v;
        size++;
        return true;
        
      } else {
        return false; // was already there
      }
    }
  }
    
  @Override
  public boolean remove (int v) {
    int len = size;
    
    if (len > 0){
      int[] a = elements;
      int i = bisect(v);
      if (a[i] == v) {
        len--;
        if (len == 0){
          elements = null;
          size = 0;
          
        } else {
          if (i < len){
            System.arraycopy(a, i + 1, a, i, (len - i));          
          }
          size = len;
        }
        
        return true;
      }
    }
    
    return false; // wasn't there
  }
  
}
