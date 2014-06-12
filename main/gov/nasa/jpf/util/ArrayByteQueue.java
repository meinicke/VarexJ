//
// Copyright (C) 2013 United States Government as represented by the
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
 * It is a dynamically growing, cyclic array buffer queue for bytes. It has 
 * the similar implementation as ArrayObjectQueue.
 * 
 * Suitable buffer for storing data transmitted and received as a continuous 
 * stream of bytes, e.g. buffers for socket based communications
 */
public class ArrayByteQueue  implements ObjectQueue<Byte>, Cloneable {

  static final int DEFAULT_CAPACITY = 256;
  
  int size = 0;
  int first;  // next index we will remove
  int last;   // last index we did add
  
  byte[] buffer = null;
  
  class FIFOIterator implements Iterator<Byte> {
    int next = first;
    int remaining = size;
    
    public boolean hasNext() {
      return (remaining > 0);
    }

    public Byte next() {
      if (remaining == 0){
        throw new NoSuchElementException();
      } else {
        Byte e = (Byte) buffer[next];
        next = (next+1) % buffer.length;
        remaining--;
        return e;
      }
    }

    public void remove() { // its a queue
      throw new UnsupportedOperationException();
    }
  }
  
  // just for debugging purposes
  class StorageIterator implements Iterator<Byte> {
    int next = 0;
    
    public boolean hasNext(){
      return (next < buffer.length); 
    }
    
    public Byte next(){
      if (next == buffer.length){
        throw new NoSuchElementException();
      }
      
      Byte e = (Byte) buffer[next];
      next++;
      return e;      
    }
    
    public void remove() { // its a queue
      throw new UnsupportedOperationException();
    }
  }
  
  public ArrayByteQueue (){
    buffer = new byte[DEFAULT_CAPACITY];
  }
  
  public ArrayByteQueue (int initialCapacity){
    buffer = new byte[initialCapacity];
  }
  
  protected void grow(){
    byte[] newBuffer = new byte[buffer.length * 3 / 2];
    
    if (first < last){
      System.arraycopy(buffer, first, newBuffer, 0, last - first +1);
    } else if (first > last){
      int nRight = buffer.length - first;
      System.arraycopy(buffer, first, newBuffer, 0, nRight);
      System.arraycopy(buffer, 0, newBuffer, nRight, last+1);      
    } else { // just 1 element
      newBuffer[0] = buffer[first];
    }
    
    first = 0;
    last = size-1;
    buffer = newBuffer;
  }
  
  public boolean isEmpty() {
    return (size == 0);
  }
  
  public int getCurrentCapacity(){
    return buffer.length;
  }
  
  public int size() {
    return size;
  }
  
  public boolean offer (Byte e){
    return add(e);
  }
  
  public boolean add (Byte e){
    if (size == 0){  // first element
      first = last = 0;
      buffer[0] = e;
      size = 1;
      
    } else {
      int i = (last + 1) % buffer.length;
      if (i == first) {
        grow();
        i = size;
      }
      
      last = i;
      buffer[i] = e;
      size++;
    }
    
    return true; // this is a dynamic queue, we never run out of space
  }
	  
  public Byte poll (){
    if (size == 0){
      return null;      
    } else {
      int i = first;
      
      first = (first+1) % buffer.length;
      size--;
      
      Byte e = (Byte) buffer[i];
      //buffer[i] = null; // avoid memory leaks
      return e;
    }    
  }
  
  public Byte remove () throws NoSuchElementException {
    if (size == 0){
      throw new NoSuchElementException();
    } else {
      return poll();
    }
  }

  public Byte peek () {
    if (size == 0){
      return null;
    } else {
      return (Byte)buffer[first];
    }
  }
  
  public Iterator<Byte> iterator() {
    return new FIFOIterator();
  }
 
  public Iterator<Byte> storageIterator(){
    return new StorageIterator();
  }
  
  
  public void clear(){
    buffer = new byte[buffer.length]; // cheaper than iterating over the old one
    size = 0;
    first = last = -1;
  }
  
  /**
   * call Processor.process(e) on each queued object
   * 
   * This method does not return before the queue is empty, which makes it
   * suitable for graph traversal. It also avoids iterator objects, allows
   * adding new objects while processing the queue, and enables to keep
   * processing state in the processor
   */
  public void process (Processor<Byte> processor){
    while (size > 0){
    	Byte e = remove();
      processor.process(e);
    }
  }
  
  public Object clone() {
    try {
      ArrayByteQueue clone = (ArrayByteQueue)super.clone();
      clone.buffer = this.buffer.clone();
      return clone;
    } catch (CloneNotSupportedException cnx) {
      return null;
    }
  }
  
  public String toString() {
    Iterator<Byte> itr = iterator();
    String result = "[";
    while(itr.hasNext()) {
      if(result.length()>1) {
        result = result + ", ";
      }
      byte b = itr.next();
      result = result + b;
    }
    result = result + "]";
    return result;
  }
}
