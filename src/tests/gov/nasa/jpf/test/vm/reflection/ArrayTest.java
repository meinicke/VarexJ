//
// Copyright (C) 2008 United States Government as represented by the
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
package gov.nasa.jpf.test.vm.reflection;

import gov.nasa.jpf.util.test.TestJPF;

import java.lang.reflect.Array;

import org.junit.Test;

/**
 * Test class for primitive getters and setters in the <code>java.lang.reflect.Array</code> class.
 *  
 * @author Mirko Stojmenovic (mirko.stojmenovic@gmail.com)
 * @author Igor Andjelkovic (igor.andjelkovic@gmail.com)
 */
public class ArrayTest extends TestJPF {

  int[] arrayInt = new int[]{42};
  double[] arrayDouble = new double[]{42.0};

  @Test public void testArrayInt () {
    if (verifyNoPropertyViolation()){
      try {
        int i = Array.getInt(arrayInt, 0);
        assert i == 42;

        Array.setInt(arrayInt, 0, 43);
        assert arrayInt[0] == 43;

      } catch (Throwable t) {
        assert false : "unexpected exception: " + t;
      }
    }
  }

  @Test public void testArrayDouble () {
    if (verifyNoPropertyViolation()){
      try {
        double d = Array.getDouble(arrayDouble, 0);
        assert d == 42.0;

        Array.setDouble(arrayDouble, 0, 43.0);
        assert arrayDouble[0] == 43.0;

      } catch (Throwable t) {
        assert false : "unexpected exception: " + t;
      }
    }
  }

}
