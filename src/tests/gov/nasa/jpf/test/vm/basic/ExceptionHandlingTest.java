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
package gov.nasa.jpf.test.vm.basic;

import gov.nasa.jpf.util.test.TestJPF;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * JPF unit test for exception handling
 */
@SuppressWarnings("null")
public class ExceptionHandlingTest extends TestJPF {
  int data;

  void foo () {
  }
  
  static void bar () {
    ExceptionHandlingTest o = null;
    o.foo();
  }
  
  @Test public void testNPE () {
    if (verifyUnhandledException("java.lang.NullPointerException")){
      ExceptionHandlingTest o = null;
      o.data = -1;

      assert false : "should never get here";
    }
  }
  
  @Test public void testNPECall () {
    if (verifyUnhandledException("java.lang.NullPointerException")){
      ExceptionHandlingTest o = null;
      o.foo();

      assert false : "should never get here";
    }
  }

  @Test public void testArrayIndexOutOfBoundsLow () {
    if (verifyUnhandledException("java.lang.ArrayIndexOutOfBoundsException")){
      int[] a = new int[10];
      a[-1] = 0;

      assert false : "should never get here";
    }
  }

  @Test public void testArrayIndexOutOfBoundsHigh () {
    if (verifyUnhandledException("java.lang.ArrayIndexOutOfBoundsException")){
      int[] a = new int[10];
      a[10] = 0;

      assert false : "should never get here";
    }
  }

  @Test public void testLocalHandler () {
    if (verifyNoPropertyViolation()){
      try {
        ExceptionHandlingTest o = null;
        o.data = 0;
      } catch (IllegalArgumentException iax) {
        assert false : "should never get here";
      } catch (NullPointerException npe) {
        return;
      } catch (Exception x) {
        assert false : "should never get here";
      }

      assert false : "should never get here";
    }
  }

  @Test public void testCallerHandler () {
    if (verifyNoPropertyViolation()){
      try {
        bar();
      } catch (Throwable t) {
        return;
      }

      assert false : "should never get here";
    }
  }
  
  @Test public void testEmptyHandler () {
    if (verifyNoPropertyViolation()){
      try {
        throw new RuntimeException("should be empty-handled");
      } catch (Throwable t) {
        // nothing
      }
    }
  }
  
  @Test public void testEmptyTryBlock () {
    if (verifyNoPropertyViolation()){
      try {
        // nothing
      } catch (Throwable t) {
        assert false : "should never get here";
      }
    }
  }
  
  @Test public void testStackTrace() {
    if (verifyNoPropertyViolation()){

      Throwable x = new Throwable();
      StackTraceElement[] st = x.getStackTrace();

      //x.printStackTrace();
      for (int i=0; i<st.length; i++){
        System.out.print("\t at ");
        System.out.print(st[i].getClassName());
        System.out.print('.');
        System.out.print(st[i].getMethodName());
        System.out.print('(');
        System.out.print(st[i].getFileName());
        System.out.print(':');
        System.out.print(st[i].getLineNumber());
        System.out.println(')');
      }

      // note - direct call stackframes should not show up here, they are JPF internal
      assert st.length == 3 : "wrong stack trace depth";

      assert st[0].getClassName().equals(ExceptionHandlingTest.class.getName());
      assert st[0].getMethodName().equals("testStackTrace");

      assert st[1].getClassName().equals(Method.class.getName());
      assert st[1].getMethodName().equals("invoke");

      assert st[2].getClassName().equals(TestJPF.class.getName());
      assert st[2].getMethodName().equals("runTestMethod");
    }
  }  
}

