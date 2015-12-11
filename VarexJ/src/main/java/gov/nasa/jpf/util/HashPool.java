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

import java.util.ArrayList;


/**
 * data structure used to do hash collapsing. All the major state components
 * (fields, Monitors, StackFrames, uThreadData) are stored in pools to
 * determine if they are new. Only the pool index values are used to
 * compute hash values.
 * <p>
 * 2006-06-14 - major rewrite by pcd
 */
public final class HashPool<V> {
  private IntTable<V> pool;
  private ArrayList<V> vect;
  
  public HashPool() {
    this(8); // default to 256 slots
  }
  
  public HashPool(int pow) {
    pool = new IntTable<V>(pow);
    vect = new ArrayList<V>(1 << pow);
  }

  /** optionally called only once after creation to link null to 0. */ 
  public HashPool<V> addNull() {
    if (size() == 0) {
      pool.add(null, 0);
      vect.add(null);
      return this;
    } else {
      throw new IllegalStateException();
    }
  }
  
  public IntTable.Entry<V> getEntry (V o) {
    int sz = pool.size(); // == vect.size();
    
    IntTable.Entry<V> e = pool.pool(o);
    if (e.val == sz) {
      vect.add(o);
    }
    return e;
  }

  public int getIndex (V o) {
    return getEntry(o).val;
  }

  public V get (V o) {
    return getEntry(o).key;
  }

  public V getObject (int idx) {
    return vect.get(idx);
  }

  public void print () {
    System.out.println("{");

    for (IntTable.Entry<V> entry : pool) {
      System.out.println("\t" + entry);
    }

    System.out.println("}");
  }

  public int size () {
    return pool.size();
  }
}
