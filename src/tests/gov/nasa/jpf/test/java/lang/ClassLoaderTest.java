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
package gov.nasa.jpf.test.java.lang;

import gov.nasa.jpf.util.test.TestJPF;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import org.junit.Test;

/**
 * test of java.lang.ClassLoader API
 */
public class ClassLoaderTest extends TestJPF {
  
  @Test
  public void testGetResource() {
    if(verifyNoPropertyViolation()) {
      testGetResourceImpl(new TestClassLoader());
    }
  }

  @Test
  public void testGetResources() throws IOException{
    if(verifyNoPropertyViolation()) {
      testGetResourcesImpl(new TestClassLoader());
    }
  }

  @Test
  public void testGetResourceAsStream() throws IOException{
    if(verifyNoPropertyViolation()) {
      testGetResourceAsStreamImpl(new TestClassLoader());
    }
  }

  @Test
  public void testLoadClass() {
    if(verifyNoPropertyViolation()) {
      ClassLoader classLoader = new TestClassLoader();
      try {
        classLoader.loadClass("non_existing_class");
        fail();
      }catch(ClassNotFoundException e) {}
    }
  }

  @Test
  public void testLoadClass2() {
    if(verifyNoPropertyViolation()) {
      ClassLoader classLoader = new TestClassLoader();
      try {
        classLoader.loadClass(ClassLoader.class.getName());
      }catch(ClassNotFoundException e) {
        fail(e.getMessage());
      }
    }
  }

  @Test
  public void testGetSystemResource() {
    if(verifyNoPropertyViolation()) {
      testGetResourceImpl( TestClassLoader.getSystemClassLoader());
    }
  }

  @Test
  public void testGetSystemResources() throws IOException{
    if(verifyNoPropertyViolation()) {
      testGetResourcesImpl( TestClassLoader.getSystemClassLoader());
    }
  }

  @Test
  public void testGetSystemResourceAsStream() throws IOException{
    if(verifyNoPropertyViolation()) {
      testGetResourceAsStreamImpl( TestClassLoader.getSystemClassLoader());
    }
  }

  @Test
  public void testGetSystemClassLoader() {
    if(verifyNoPropertyViolation()) {
      ClassLoader classLoader = new TestClassLoader();
      assertNotNull(ClassLoader.getSystemClassLoader());
      assertNull(ClassLoader.getSystemClassLoader().getParent());
      assertFalse(classLoader.equals(ClassLoader.getSystemClassLoader()));
    }
  }

  @Test
  public void testGetParent() {
    if(verifyNoPropertyViolation()) {
      ClassLoader classLoader = new TestClassLoader();
      assertNotNull(classLoader.getParent());
      assertEquals(classLoader.getParent(),ClassLoader.getSystemClassLoader());
    }
  }

  @Test
  public void testGetParent2() {
    if(verifyNoPropertyViolation()) {
      ClassLoader parentClassLoader = new TestClassLoader();
      ClassLoader classLoader = new TestClassLoader(parentClassLoader);
      assertEquals(parentClassLoader, classLoader.getParent());
    }
  }

  @Test
  public void testFoundResources() throws IOException {
    if(verifyNoPropertyViolation()) {
      TestClassLoader classLoader = new TestClassLoader();
      Enumeration<URL> enm = classLoader.findResources("not_existing_resource"); 
      assertNotNull(enm);
      assertFalse(enm.hasMoreElements());
    }
  }

  private void testGetResourceImpl(ClassLoader classLoader) {
    assertNull(classLoader.getResource("not_existing_resource"));
    assertNotNull(classLoader.getResource("DiningPhil.class"));
    assertNull(classLoader.getResource("ClassLoader.class"));
    assertNotNull(classLoader.getResource("java/lang/ClassLoader.class"));
  }

  private void testGetResourcesImpl(ClassLoader classLoader) throws IOException{
    assertFalse(classLoader.getResources("not_existing_resources").hasMoreElements());

    Enumeration<?> e = classLoader.getResources("DiningPhil.class");
    assertTrue(e.hasMoreElements());
    assertNotNull(e.nextElement());
    assertFalse(e.hasMoreElements());

    e = classLoader.getResources("ClassLoader.class");
    assertFalse(e.hasMoreElements());

    // It should find at least two resources: 1. model class, 2. JDK class
    e = classLoader.getResources("java/lang/ClassLoader.class");
    assertTrue(e.hasMoreElements());
    assertNotNull(e.nextElement());
    assertTrue(e.hasMoreElements());
    assertNotNull(e.nextElement());
  }

  private void testGetResourceAsStreamImpl(ClassLoader classLoader) throws IOException{
    assertNull(classLoader.getResourceAsStream("not_existing_resources"));
    InputStream is = classLoader.getResourceAsStream("DiningPhil.class");
    assertNotNull(is);
    assertTrue(is.read() > 0);
  }

  class TestClassLoader extends ClassLoader {
      
    public TestClassLoader() {
      super();
    }

    public TestClassLoader(ClassLoader parent) {
      super(parent);
    }

    protected Enumeration<URL> findResources(String name) throws IOException {
      return super.findResources(name);
    }
  }
}
