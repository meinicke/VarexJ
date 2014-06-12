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
 * a simplistic IntSet implementation that uses an unsorted array to keep elements.
 * Obviously this is O(N) and therefore not a good choice if the list grows,
 * but if we know there are only a few elements then it isn't worth to
 * do any sorting or fancy lookup - the JIT would beat algorithm.
 * 
 * If the set is empty there is no memory allocated for the elements
 */
public class UnsortedArrayIntSet extends ArrayIntSet {

  static final int DEFAULT_CAPACITY = 4;
  static final int GROWTH = 8;
  
  public UnsortedArrayIntSet (){
    // nothing
  }
  
  public UnsortedArrayIntSet (int initialCapacity){
    super(initialCapacity);
  }

  
  
  @Override
  public boolean add (int v) {
    int len = size;
    if (len == 0){
      elements = new int[DEFAULT_CAPACITY];
      
    } else {
      int[] a = elements;
      int i=0;
      for (; i<len; i++){
        if (a[i] == v){
          return false; // was already there
        }
      }
      
      if (i == a.length){
        int[] newElements = new int[a.length + GROWTH];
        System.arraycopy(a, 0, newElements, 0, size);
        elements = newElements;
      }    
    }
    
    elements[size++] = v;
    return true;
  }

  @Override
  public boolean remove(int v) {
    int len = size;
    if (len > 0){
      int[] a = elements;
      for (int i=0; i<len; i++){
        if (a[i] == v){
          if (len == 1){
            elements = null;
          } else {
            i++;
            if (i < len) {
              System.arraycopy(a, i, a, i-1, len-i);
            }
          }
          
          size--;
          return true;
        }
      }
    }
    
    return false; // wasn't there
  }

  @Override
  public boolean contains(int v) {
    int len = size;
    if (len > 0){
      int[] a = elements;
      for (int i=0; i<len; i++){
        if (a[i] == v){
          return true;
        }
      }
    }
    
    return false;
  }
}
