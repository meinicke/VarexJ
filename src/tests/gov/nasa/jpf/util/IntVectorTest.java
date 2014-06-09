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

import org.junit.Test;

/**
 * unit test for gov.nasa.jpf.util.IntVector
 */
public class IntVectorTest extends TestJPF {

  @Test
  public void testPackedBoolean() {
    IntVector v = new IntVector();
    boolean[] b = { true,true,true,true, false,false,false,false };

    v.appendPacked(b);
    int x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert x == 0xf0000000;

    v.clear();
    b = new boolean[32];
    b[0] = true;
    b[31] = true;
    v.appendPacked(b);
    assert v.size() == 1;
    x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert x == 0x80000001;

    v.clear();
    b = new boolean[33];
    b[0] = true;
    b[32] = true;
    v.appendPacked(b);
    assert v.size() == 2;
    x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert x == 0x80000000;
    x = v.get(1);
    System.out.println(Integer.toHexString(x));
    assert x == 0x80000000;

    v.clear();
    b = new boolean[34];
    b[0] = true;
    b[33] = true;
    v.appendPacked(b);
    assert v.size() == 2;
    x = v.get(1);
    System.out.println(Integer.toHexString(x));
    assert x == 0x40000000;
  }

  @Test
  public void testPackedByte() {
    IntVector v = new IntVector();
    byte[] b = { (byte)0xf, 0, (byte)0xf, 0 };

    v.appendPacked(b);
    assert v.size() == 1;
    int x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert x == 0x0f000f00;

    v.clear();
    b = new byte[5];
    b[0] = (byte)0xff;
    b[4] = (byte)0xff;
    v.appendPacked(b);
    assert v.size() == 2;
    x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert x == 0xff000000;
    x = v.get(1);
    System.out.println(Integer.toHexString(x));
    assert x == 0xff000000;

    v.clear();
    b = new byte[6];
    b[0] = (byte)0xff;
    b[5] = (byte)0xff;
    v.appendPacked(b);
    assert v.size() == 2;
    x = v.get(1);
    System.out.println(Integer.toHexString(x));
    assert x == 0x00ff0000;

  }

  @Test
  public void testPackedChar() {
    IntVector v = new IntVector();
    char[] c = { (char)0xffff, 0};

    v.appendPacked(c);
    int x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert v.size() == 1;
    assert x == 0xffff0000;

    v.clear();
    c = new char[3];
    c[0] = (char)0xffff;
    c[2] = (char)0xff;
    v.appendPacked(c);
    assert v.size() == 2;
    x = v.get(1);
    System.out.println(Integer.toHexString(x));
    assert x == 0x00ff0000;
  }

  @Test
  public void testLongBits(){
    IntVector v = new IntVector();

    long[] a = { 1, 0x00000000ffff0000L};
    v.appendBits(a);
    assert v.size() == 4;

    int x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert x == 0;
    x = v.get(1);
    System.out.println(Integer.toHexString(x));
    assert x == 1;
    x = v.get(2);
    System.out.println(Integer.toHexString(x));
    assert x == 0;
    x = v.get(3);
    System.out.println(Integer.toHexString(x));
    assert x == 0xffff0000;

    a = new long[1];
    a[0] = -1;
    v.clear();
    v.appendBits(a);
    x = v.get(0);
    System.out.println(Integer.toHexString(x));
    x = v.get(0);
    System.out.println(Integer.toHexString(x));
    assert x == 0xffffffff;
    x = v.get(1);
    System.out.println(Integer.toHexString(x));
    assert x == 0xffffffff;

  }

}
