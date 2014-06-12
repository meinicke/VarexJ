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
 * object queue that uses cached link entries
 */
public class LinkedObjectQueue<E> implements ObjectQueue<E> {

  static class Entry {
    Entry next; // single linked list
    Object obj;  // referenced object
  }

  protected Entry last;
  protected Entry first;

  protected int size;
  
  protected int maxCache;
  protected int nFree;
  protected Entry free;

  class FIFOIterator implements Iterator<E> {
    Entry e = first;

    public boolean hasNext() {
      return e != null;
    }

    public E next() {
      if (e == null){
        throw new NoSuchElementException();
      } else {
        E obj = (E)e.obj;
        e = e.next;
        return obj;
      }
    }

    public void remove() {
      throw new UnsupportedOperationException("arbitrary remove from queue not supported");
    }
  }
  
  public LinkedObjectQueue (){
    maxCache = 256;
  }
  
  public LinkedObjectQueue (int maxCache){
    this.maxCache = maxCache;
  }
  
  public int size() {
    return size;
  }
  
  public boolean add(E obj) {
    Entry e;

    if (nFree > 0){ // reuse a cached Entry object
      e = free;
      free = e.next;
      nFree--;

    } else {
      e = new Entry();
    }

    e.obj = obj;
    e.next = null;

    if (last != null) {
      last.next = e;
    } else {
      first = e;
    }

    last = e;
    
    size++;
    return true;
  }
  
  public boolean offer( E obj){
    return add(obj);
  }

  public boolean isEmpty(){
    return size > 0;
  }
  
  public E peek (){
    if (size == 0){
      return null;
    } else {
      return (E)first.obj;
    }
  }
  
  public E poll(){
    if (size == 0){
      return null;
      
    } else {
      Entry e = first;
      first = first.next;
      size--;
      
      E obj = (E)e.obj;
      
      if (nFree < maxCache){
        Entry next = e.next;
        e.next = (nFree++ > 0) ? free : null;
        e.obj = null;
        free = e;
      }
      
      return obj;
    }
  }
  
  public E remove() throws NoSuchElementException {
    if (size == 0){
      throw new NoSuchElementException();
    } else {
      return poll();
    }
  }
  
  public Iterator<E> iterator(){
    return new FIFOIterator();
  }
  
  public void process( Processor<E> proc) {
    for (Entry e = first; e != null; ) {
      proc.process( (E)e.obj);

      e.obj = null; // avoid memory leaks

      if (nFree < maxCache){
        // recycle to save some allocation and a lot of shortliving garbage
        Entry next = e.next;
        e.next = (nFree++ > 0) ? free : null;
        free = e;
        e = next;

      } else {
        e = e.next;
      }
    }
    clear();
  }

  public void clear () {
    first = null;
    last = null;
    size = 0;

    // don't reset nFree and free since we limit the memory size of our cache
    // and the Entry object do not reference anything
  }
}
