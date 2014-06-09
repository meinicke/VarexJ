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
package gov.nasa.jpf.test.mc.data;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;

/**
 *
 * @author Ivan Mushketik
 */
public class ObjectStreamTest extends TestJPF {
  static String osFileName = "file";

  @After
  public void deleteFile(){
    File osFile = new File(osFileName);

    if (osFile.exists()) {
      osFile.delete();
    }
  }


  @Test
  public void testWriteReadInteger() {
    if (!isJPFRun()) {
      Verify.writeObjectToFile(new Integer(123), osFileName);
    }

    if (verifyNoPropertyViolation()) {
      Integer i = Verify.readObjectFromFile(Integer.class, osFileName);

      assert i == 123;
    }
  }

  @Test
  public void testWriteReadString() {
    if (!isJPFRun()) {
      Verify.writeObjectToFile(new String("hello"), osFileName);
    }

    if (verifyNoPropertyViolation()) {
      String s = Verify.readObjectFromFile(String.class, osFileName);
      assert s.equals("hello");
    }
  }
  
  static class Sup implements Serializable {
    int s;
  }
  
  static class Inherited extends Sup{
    int i;
  }
  
  @Test
  public void testWriteReadInheritedClass() {
    if (!isJPFRun()) {
      Inherited inh = new Inherited();
      inh.s = 1;
      inh.i = 2;

      Verify.writeObjectToFile(inh, osFileName);
    }

    if (verifyNoPropertyViolation("+jpf-core.native_classpath+=;${jpf-core}/build/tests")) {
      Inherited inh = Verify.readObjectFromFile(Inherited.class, osFileName);

      assert inh.s == 1;
      assert inh.i == 2;
    }

  }

  static class WithTransient implements Serializable {
    int i;
    transient int t;
  }

  @Test
  public void testWriteReadTransientField() {
    if (!isJPFRun()) {
      WithTransient wt = new WithTransient();
      wt.i = 10;
      wt.t = 10;
      Verify.writeObjectToFile(wt, osFileName);
    }

    if (verifyNoPropertyViolation("+jpf-core.native_classpath+=;${jpf-core}/build/tests")) {
      WithTransient wt = Verify.readObjectFromFile(WithTransient.class, osFileName);

      assert wt.i == 10;
      // t is transient
      assert wt.t == 0;
    }
  }

  class SerializableArrayList<T> extends ArrayList<T> implements Serializable {}

  @Test
  public void testWriteReadArrayList() {
    if (!isJPFRun()) {
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(1);
      al.add(2);
      al.add(3);
      Verify.writeObjectToFile(al, osFileName);
    }

    if (verifyNoPropertyViolation()) {
      ArrayList al = Verify.readObjectFromFile(ArrayList.class, osFileName);

      assert al.size() == 3;
      assert al.get(0).equals(1);
      assert al.get(1).equals(2);
      assert al.get(2).equals(3);
    }
  }

  static class MultiDimArr implements Serializable {
    int arr [][];
  }

  @Test
  public void tsetWriteReadObjectWithMultiDimArray() {
    if (!isJPFRun()) {
      MultiDimArr mda = new MultiDimArr();
      mda.arr = new int[2][];
      mda.arr[0] = new int[3];
      mda.arr[1] = new int[3];

      mda.arr[0][0] = 1;
      mda.arr[0][1] = 2;
      mda.arr[0][2] = 3;

      mda.arr[1][0] = 4;
      mda.arr[1][1] = 5;
      mda.arr[1][2] = 6;

      Verify.writeObjectToFile(mda, osFileName);
    }

    if (verifyNoPropertyViolation("+jpf-core.native_classpath+=;${jpf-core}/build/tests")) {
      MultiDimArr mda = Verify.readObjectFromFile(MultiDimArr.class, osFileName);

      assert mda.arr[0][0] == 1;
      assert mda.arr[0][1] == 2;
      assert mda.arr[0][2] == 3;

      assert mda.arr[1][0] == 4;
      assert mda.arr[1][1] == 5;
      assert mda.arr[1][2] == 6;
    }
  }

  static class Inner implements Serializable {
    int i;
  }

  static class Outer implements Serializable {
    Inner inner;
    int o;
  }


  @Test
  public void testReadWriteObjectWithReference() {
    if (!isJPFRun()) {
      Outer out = new Outer();
      out.o = 1;
      out.inner = new Inner();
      out.inner.i = 2;

      Verify.writeObjectToFile(out, osFileName);
    }

    if (verifyNoPropertyViolation("+jpf-core.native_classpath+=;${jpf-core}/build/tests")) {
      Outer out = Verify.readObjectFromFile(Outer.class, osFileName);

      assert out.o == 1;
      assert out.inner.i == 2;
    }
  }
}
