//
// Copyright (C) 2010 United States Government as represented by the
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

import gov.nasa.jpf.util.test.TestJPF;

import java.util.BitSet;
import java.util.Random;

import org.junit.Test;

/**
 * unit test for BitSet64
 */
public class BitSet64Test extends TestJPF {
  public static void main (String[] args){

    // our performance evals
    if (args.length == 1){
      String mthName = args[0];
      if (mthName.equals("evalBitSet")){
        evalBitSet();
        return;
      } else if (mthName.equals("evalBitSet64")){
        evalBitSet64();
        return;
      }
    }

    // the regression tests
    runTestsOfThisClass(args);
  }

  //--- regression tests

  @Test
  public void testBasic() {
    BitSet64 b = new BitSet64();

    assert b.isEmpty();
    assert !b.get(0);

    b.set(0);
    assert b.get(0);

    b.set(63);
    assert b.get(63);

    b.set(27);
    assert b.get(27);

    b.set(58);
    assert b.get(58);

    b.set(31);
    assert b.get(31);


    b.clear(31);

    assert b.cardinality() == 4;
    assert b.length() == 64 : " wrong length: " + b.length();

    b = new BitSet64();
    b.set(4);
    b.set(4,false);
    assert !b.get(4);
  }

  @Test
  public void testOutOfBounds() {
    BitSet64 b = new BitSet64();

    try {
      b.set(64);
      throw new AssertionError("set(64) failed to throw");
    } catch (IndexOutOfBoundsException x){
      System.out.println(x);
    }

    try {
      b.get(256);
      throw new AssertionError("get(256) failed to throw");
    } catch (IndexOutOfBoundsException x){
      System.out.println(x);
    }

    try {
      b.clear(-1);
      throw new AssertionError("clear(-1) failed to throw");
    } catch (IndexOutOfBoundsException x){
      System.out.println(x);
    }
  }

  @Test
  public void testEnumeration() {
    BitSet64 b = new BitSet64();

    assert b.nextSetBit(0) == -1;

    b.set(0);
    assert b.nextSetBit(0) == 0;

    b.clear();
    b.set(24);
    assert b.nextSetBit(0) == 24;

    b.clear();
    b.set(63);
    assert b.nextSetBit(0) == 63;


    b.clear();
    b.set(0);
    b.set(42);
    b.set(10);
    b.set(55);

    assert b.nextSetBit(0) == 0;
    assert b.nextSetBit(1) == 10;
    assert b.nextSetBit(11) == 42;
    assert b.nextSetBit(43) == 55;
  }

  @Test
  public void testIntSetInterface(){
    IntSet s = new BitSet64();
    
    s.add(42);
    s.add(0);
    s.add(63);
    
    assertTrue(s.size() == 3);
    assertTrue( s.contains(42));
    
    for (IntIterator it = s.intIterator(); it.hasNext();){
      int i = it.next();
      System.out.println(i);
    }
  }
  
  //--- performance section

  static final int NROUNDS = 2000000;
  static final int NITER = 500000;

  public static void evalBitSet() {
    Random r = new Random(0);
    BitSet b = new BitSet(64);

    long t1 = System.currentTimeMillis();
    for (int j=0; j<NROUNDS; j++){
      int i = r.nextInt(64);
      b.set(i);
      b.get(i);
      b.clear(i);
    }
    long t2 = System.currentTimeMillis();
    System.out.println("BitSet random access: " + (t2-t1));

    b.clear();
    b.set(0);
    b.set(42);
    b.set(10);
    b.set(32);
    b.set(60);

    t1 = System.currentTimeMillis();
    for (int j=0; j<NROUNDS; j++){
      for (int k=b.nextSetBit(0); k>=0; k=b.nextSetBit(k+1));
      int n = b.cardinality();
    }
    t2 = System.currentTimeMillis();
    System.out.println("BitSet set bits iteration: " + (t2-t1));
  }

  public static void evalBitSet64() {
    Random r = new Random(0);
    BitSet64 b = new BitSet64();

    long t1 = System.currentTimeMillis();
    for (int j=0; j<NROUNDS; j++){
      int i = r.nextInt(64);
      b.set(i);
      b.get(i);
      b.clear(i);
    }
    long t2 = System.currentTimeMillis();
    System.out.println("BitSet random access: " + (t2-t1));

    b.clear();
    b.set(0);
    b.set(42);
    b.set(10);
    b.set(32);
    b.set(60);

    t1 = System.currentTimeMillis();
    for (int j=0; j<NROUNDS; j++){
      for (int k=b.nextSetBit(0); k>=0; k=b.nextSetBit(k+1));
      int n = b.cardinality();
    }
    t2 = System.currentTimeMillis();
    System.out.println("BitSet set bits iteration: " + (t2-t1));
  }

}
