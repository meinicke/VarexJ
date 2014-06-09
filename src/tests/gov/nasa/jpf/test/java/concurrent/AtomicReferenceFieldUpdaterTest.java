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
package gov.nasa.jpf.test.java.concurrent;

import gov.nasa.jpf.util.test.TestJPF;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

import org.junit.Test;

/**
 * raw test for java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
public class AtomicReferenceFieldUpdaterTest extends TestJPF {

  static final String[] JPF_ARGS = {"+cg.enumreate_cas=true"};

  //--- the test methods
  String str;
  byte[] buf;

  @Test
  public void testStringField() {
    if (verifyNoPropertyViolation(JPF_ARGS)) {
      AtomicReferenceFieldUpdater<AtomicReferenceFieldUpdaterTest, String> upd =
              AtomicReferenceFieldUpdater.newUpdater(AtomicReferenceFieldUpdaterTest.class, String.class, "str");

      String s1 = "one";
      String s2 = "two";
      str = s1;

      System.out.println(str);
      assert upd.compareAndSet(this, s1, s2);
      System.out.println(str);
      assert str == s2;

      assert !upd.compareAndSet(this, s1, "nogo");
      assert str == s2;
      assert str == upd.get(this);

      assert s2 == upd.getAndSet(this, s1);
      assert str == s1;

      upd.set(this, s2);
      assert str == s2;

      upd.lazySet(this, s1);
      assert str == s1;

      assert upd.weakCompareAndSet(this, s1, s2);
      assert str == s2;

      assert !upd.weakCompareAndSet(this, s1, "nogo");
      assert str == s2;
    }
  }

  @Test
  public void testByteArrayField() {
    if (verifyNoPropertyViolation(JPF_ARGS)) {
      AtomicReferenceFieldUpdater<AtomicReferenceFieldUpdaterTest, byte[]> upd =
              AtomicReferenceFieldUpdater.newUpdater(AtomicReferenceFieldUpdaterTest.class, byte[].class, "buf");

      byte[] b1 = new byte[10];
      byte[] b2 = new byte[5];

      buf = b1;
      System.out.println(buf);
      assert upd.compareAndSet(this, b1, b2);
      System.out.println(buf);
      assert (buf == b2);

      assert !upd.compareAndSet(this, b1, new byte[3]);
      assert (buf == b2);
    }
  }
}
