//
// Copyright (C) 2013 United States Government as represented by the
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.Test;

/**
 * test automatic and recursive clinit invocation
 */
public class RecursiveClinitTest extends TestJPF {

  static class Base {
    static int d = 1;
    static {
      System.out.println("Base clinit");
    }
  }

  static class Derived extends Base {
    static int d = Base.d * 42;
    static {
      System.out.println("Derived clinit");
    }
    
    public Derived (int i){
      System.out.println("Derived(" + i + ')');
    }
    
    public static void foo(){
      System.out.println("Derived.foo()");
    }
  }

  @Test 
  public void testStaticField (){
    if (verifyNoPropertyViolation()) {
      System.out.println("main now referencing Derived.d");
      int d = Derived.d;
      System.out.println("back in main");
      
      assertTrue(d == 42);
    }
  }
  
  @Test
  public void testNewInstance (){
    if (verifyNoPropertyViolation()) {
      System.out.println("main now calling Derived.class.newInstance()");
      try {
        Derived.class.newInstance();
      } catch (Throwable t) {
        fail("instantiation failed with " + t);
      }
      System.out.println("back in main");
      
      assertTrue(Derived.d == 42);
    }
  }
  
  @Test
  public void testMethodReflection (){
    if (verifyNoPropertyViolation()) {
      try {
        Class<?> clazz = Class.forName("gov.nasa.jpf.test.vm.basic.RecursiveClinitTest$Derived");
        System.out.println("main now calling Derived.foo()");
        Method m = clazz.getDeclaredMethod("foo", new Class[0]);
        m.invoke(null);
        
        System.out.println("back in main");
        assertTrue(Derived.d == 42);
        
      } catch (Throwable t){
        fail("test failed with: " + t);
      }
    }    
  }
  
  @Test
  public void testCtorReflection (){
    if (verifyNoPropertyViolation()) {
      try {
        Class<?> clazz = Class.forName("gov.nasa.jpf.test.vm.basic.RecursiveClinitTest$Derived");
        System.out.println("main now creating Derived(-42)");
        Constructor ctor = clazz.getConstructor(new Class[] {int.class});
        Object o = ctor.newInstance( new Object[] {Integer.valueOf(-42)});
        
        System.out.println("back in main");
        assertTrue( o instanceof Derived);
        assertTrue(Derived.d == 42);
        
      } catch (Throwable t){
        fail("test failed with: " + t);
      }
    }    
  }
  
  // <2do> we also need the SerializatinConstructor
}
