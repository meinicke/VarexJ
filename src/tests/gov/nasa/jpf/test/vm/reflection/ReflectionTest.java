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
package gov.nasa.jpf.test.vm.reflection;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class ReflectionTest extends TestJPF {

  static class MyClass {
    void bar(){
      foo();
    }

    // compilation will cause a warning about internal proprietary API that cannot be suppressed, but we have to test this
    // since it is still used by standard libs
    void foo (){
      Class<?> callerCls = sun.reflect.Reflection.getCallerClass(0); // that would be getCallerClass()
      System.out.println("-- getCallerClass(0) = " + callerCls);
      assertTrue(callerCls.getName().equals("sun.reflect.Reflection"));
      
      callerCls = sun.reflect.Reflection.getCallerClass(1); // foo()
      System.out.println("-- getCallerClass(1) = " + callerCls);
      assertTrue(callerCls.getName().equals("gov.nasa.jpf.test.vm.reflection.ReflectionTest$MyClass"));
      
      callerCls = sun.reflect.Reflection.getCallerClass(2); // bar()
      System.out.println("-- getCallerClass(2) = " + callerCls);
      assertTrue(callerCls.getName().equals("gov.nasa.jpf.test.vm.reflection.ReflectionTest$MyClass"));

      callerCls = sun.reflect.Reflection.getCallerClass(3); // callIt()
      System.out.println("-- getCallerClass(3) = " + callerCls);
      assertTrue(callerCls.getName().equals("gov.nasa.jpf.test.vm.reflection.ReflectionTest"));
      
      // <2do> should also test Method.invoke skipping
    }
  }
  
  void callIt(){
    MyClass o = new MyClass();
    o.bar();
  }
  
  @Test
  public void testCallerClass() {
    if (verifyNoPropertyViolation()){
      callIt();
    }
  }
}
