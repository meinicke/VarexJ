

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
/**
 * unfortunately this has to be in the unnamed package, since we need
 * B to be in the unnamed package (so that it has a builtin type name), and as
 * of Java 1.4 you can't import unnamed package classes into named packages
 */
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/*
 * just a helper class for the JavaLangObject raw test that happens to be
 * named like a builtin typecode (byte)
 */
class B {

  int data;

  public B(int d) {
    data = d;
  }

  public boolean equals(Object other) {
    if (other == null || !(other instanceof B)) {
      return false;
    }

    return ((B) other).data == data;
  }

  public String toString() {
    return "B {data=" + data + "}";
  }
}

public class TypeNameTest extends TestJPF {

  @Test
  public void testArrayCloning() {
    if (verifyNoPropertyViolation()) {
      // test for collisions between typecodes of builtin types
      // and user defined classes (e.g. "B" for byte)
      B[] b = new B[10];
      b[3] = new B(42);

      Object o = b.clone();
      B[] bb = (B[]) o;
      assert b[3].equals(bb[3]);

      byte[] a = new byte[10];
      a[3] = 42;
      o = a.clone();
      byte[] aa = (byte[]) o;
      assert a[3] == aa[3];
    }
  }
}
