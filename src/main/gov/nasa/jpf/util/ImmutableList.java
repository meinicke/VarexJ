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
import java.util.NoSuchElementException;

/**
 * utility class for JPF internal linked lists that are tail-immutable 
 */
public class ImmutableList<E> implements Iterable<E> {

  static class IteratorImpl<E> implements Iterator<E> {

    private ImmutableList<E> next;
    
    private IteratorImpl(ImmutableList<E> list){
      next = list;
    }
    
    public boolean hasNext() {
      return (next != null);
    }

    public E next() {
      if (next != null){
        E elem = next.head;
        next = next.tail;
        return elem;
        
      } else {
        throw new NoSuchElementException();
      }
    }

    public void remove() {
      throw new UnsupportedOperationException("can't remove elements from ImmutableList");
    }
    
  }
  
  public final E head;
  public final ImmutableList<E> tail;
  
  
  public ImmutableList(E data, ImmutableList<E> tail) {
    this.head = data;
    this.tail = tail;
  }
  
  public Iterator<E> iterator() {
    return new IteratorImpl(this);
  }
  
  public boolean contains (E object){
    for (E e : this){
      if (e.equals(object)){
        return true;
      }
    }
    
    return false;
  }
}
