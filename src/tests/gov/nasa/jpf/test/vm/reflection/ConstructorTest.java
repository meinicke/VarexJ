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

package gov.nasa.jpf.test.vm.reflection;

import gov.nasa.jpf.util.test.TestJPF;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;

import org.junit.Test;

/**
 * regression test for constructor reflection
 */
public class ConstructorTest extends TestJPF {

  @Retention(RetentionPolicy.RUNTIME)
  @interface A {
    String value();
  }
  
  static class Y {
    @A("this is a superclass ctor annotation")
    protected Y(){}
  }
  
  static class X extends Y {
    private String a;

    @A("this is a ctor annotation")
    public X (@A("this is a parameter annotation") String x) {
      this.a = x;
      System.out.println(x);
    }
  }

  @Test
  public void testConstructorCall() {
    if (verifyNoPropertyViolation()){
      try {
        Class<X> cls = X.class;
        Constructor<X> ctor = cls.getDeclaredConstructor(new Class<?>[] { String.class });

        X x = ctor.newInstance("I'm an X");
        
        assertNotNull(x); 
      } catch (Throwable t){
        fail("ctor invocation failed: " + t);
      }
    }
  }

  static class I {
    private Integer i;

    public I(Integer i) {
      this.i = i;
    }
  }

  @Test
  public void testConstructorCallInteger() {
    if (verifyNoPropertyViolation()) {
      try {
        Class<I> cls = I.class;
        Constructor<I> ctor = cls.getDeclaredConstructor(new Class<?>[] {Integer.class });

        I obj = ctor.newInstance(42);
        assertNotNull(obj);
        assertEquals(new Integer(42), obj.i);
      } catch (Throwable t) {
        fail("ctor invocation with Integer failed: " + t);
      }
    }
  }

  
  
  @Test
  public void testAnnotations(){
    if (verifyNoPropertyViolation()) {
      try {
        Class<X> cls = X.class;
        Constructor<X> ctor = cls.getDeclaredConstructor(new Class<?>[] { String.class });

        Annotation[] ai = ctor.getDeclaredAnnotations();
        assertTrue("no declared ctor annotations found", ai.length == 1);
        
        assertTrue("wrong ctor annotation type", ai[0] instanceof A);
        System.out.printf("ctor annotation: " + ai[0]);
        
      } catch (Throwable t) {
        fail("ctor.getDeclaredAnnotations() failed: " + t);
      }
    }    
  }
  
  @Test
  public void testParameterAnnotations(){
    if (verifyNoPropertyViolation()) {
      try {
        Class<X> cls = X.class;
        Constructor<X> ctor = cls.getDeclaredConstructor(new Class<?>[] { String.class });

        Annotation[][] pai = ctor.getParameterAnnotations();
        assertTrue("no ctor parameter annotations found", pai.length == 1);
        
        Annotation[] ai = pai[0];
        assertTrue("wrong number of annotations for first ctor argument", ai.length == 1);
        
        assertTrue("wrong parameter annotation type", ai[0] instanceof A);
        System.out.printf("ctor parameter annotation: " + ai[0]);
        
      } catch (Throwable t) {
        fail("ctor.getParameterAnnotations() failed: " + t);
      }
    }        
  }
}
