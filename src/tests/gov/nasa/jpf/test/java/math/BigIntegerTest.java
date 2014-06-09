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
package gov.nasa.jpf.test.java.math;

import gov.nasa.jpf.util.test.TestJPF;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerTest extends TestJPF {

  /************************** test methods ************************/
  @Test
  public void testArithmeticOps() {
    if (verifyNoPropertyViolation()) {
      System.out.println("testing arithmetic operations of BigInteger objects");

      BigInteger big = new BigInteger("4200000000000000000");
      BigInteger o = new BigInteger("100000000000000");
      BigInteger notSoBig = new BigInteger("1");

      BigInteger x = big.add(notSoBig);
      String s = x.toString();
      System.out.println("x = " + s);
      assert s.equals("4200000000000000001");

      x = big.divide(o);
      int i = x.intValue();
      assert i == 42000;
    }
  }
}
