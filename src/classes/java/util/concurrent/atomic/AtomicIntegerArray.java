//
// Copyright (C) 2007 United States Government as represented by the
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

package java.util.concurrent.atomic;

import java.io.Serializable;
import java.util.Arrays;

/**
 * model class for AtomicIntegerArray
 */
public class AtomicIntegerArray implements Serializable {
  private static final long serialVersionUID = 2862133569453604235L;

  private final int[] array;

  public AtomicIntegerArray(int length) {
    array = new int[length];
    // <2do> need a volatile write in order to conform to JMM  // Does this really matter in JPF?
  }

  public AtomicIntegerArray(int[] array) {
    if (array == null)
      throw new NullPointerException();

    int length = array.length;
    this.array = new int[length];

    for (int i = 0; i < length; ++i)
      this.array[i] = array[i];

    // <2do> need a volatile write in order to conform to JMM  // Does this really matter in JPF?
  }

  public final int length() {
    return(array.length);
  }

  public final int get(int i) {
    checkIndex(i);
    return(getNative(i));
  }

  private final native int getNative(int i);

  public final boolean compareAndSet(int i, int expect, int update) {
    checkIndex(i);
    return(compareAndSetNative(i, expect, update));
  }

  private final native boolean compareAndSetNative(int i, int expect, int update);

  public final boolean weakCompareAndSet(int i, int expect, int update) {
    return(compareAndSet(i, expect, update));
  }

  public final int getAndSet(int i, int newValue) {
    while (true) {
      int current = get(i);
      if (compareAndSet(i, current, newValue))
        return(current);
    }
  }

  public final void set(int i, int newValue) {
    getAndSet(i, newValue);
  }

  public final void lazySet(int i, int newValue) {
    set(i, newValue);
  }

  public final int getAndIncrement(int i) {
    return(getAndAdd(i, 1));
  }

  public final int getAndDecrement(int i) {
    return(getAndAdd(i, -1));
  }

  public final int getAndAdd(int i, int delta) {
    while (true) {
      int current = get(i);
      int next = current + delta;
      if (compareAndSet(i, current, next))
        return(current);
    }
  }

  public final int incrementAndGet(int i) {
    return(getAndIncrement(i) + 1);
  }

  public final int decrementAndGet(int i) {
    return(getAndDecrement(i) - 1);
  }

  public final int addAndGet(int i, int delta) {
    return(getAndAdd(i, delta) + delta);
  }

  public String toString() {
    // <2do> need a volatile read in order to conform to JMM  // Does this really matter in JPF?
    return(Arrays.toString(array));
  }

  private void checkIndex(int i) {
    if (i < 0 || i >= array.length)
      throw new IndexOutOfBoundsException("index " + i);
  }
}
