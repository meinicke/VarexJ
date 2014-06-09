//
// Copyright (C) 2009 United States Government as represented by the
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

package gov.nasa.jpf.test.mc.basic;

import gov.nasa.jpf.util.test.TestJPF;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/**
 * regression test for ExceptionInjector listener
 */
public class ExceptionInjectorTest extends TestJPF {
  
  @Test
  public void testAbsLine () {
    if (verifyNoPropertyViolation("+listener=.listener.ExceptionInjector",
                                  "+ei.exception=java.lang.ArithmeticException@gov.nasa.jpf.test.mc.basic.ExceptionInjectorTest:42")){
      boolean handled = false;
      try {
        int x = 10;
        int y = 2;
        int z = x / y;                    // perfectly fine, but we want it to blow up
      } catch (ArithmeticException ax){   // ..so that we can check the handler
        handled = true;
        System.out.println("got it handled");
        ax.printStackTrace();
      }

      assert handled : "failed to throw exception";
    }
  }

  static class Zapp extends RuntimeException {
    Zapp (String details){
      super(details);
    }
  }

  // NOTE - offsets count from the first statement line in the method body
  @Test
  public void testMethodOffset () {
    if (verifyNoPropertyViolation("+listener=.listener.ExceptionInjector",
                                  "+ei.exception=gov.nasa.jpf.test.mc.basic.ExceptionInjectorTest$Zapp(\"gotcha\")@gov.nasa.jpf.test.mc.basic.ExceptionInjectorTest.testMethodOffset():6")){
      boolean handled = false;
      try {
        int x = 10;
        int y = 2;
        int z = x / y;    // +6: perfectly fine, but we want it to blow up
      } catch (Zapp x){   // ..so that we can check the handler
        handled = true;
        System.out.println(x);
      }

      assert handled : "failed to throw exception";
    }
  }

  @Test
  public void testCallee () {
    if (verifyNoPropertyViolation("+listener=.listener.ExceptionInjector",
                                  "+ei.exception=java.io.IOException@java.io.File.createTempFile(java.lang.String,java.lang.String)")){
      boolean handled = false;
      try {
        File f = File.createTempFile("foo", "bar");
      } catch (IOException x){  // if the temp file could not be created (how do you force this?)
        handled = true;
        x.printStackTrace();
      }

      assert handled : "failed to throw exception";
    }

  }

}
