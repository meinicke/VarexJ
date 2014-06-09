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

package gov.nasa.jpf.vm.multiProcess;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

import gov.nasa.jpf.util.test.TestMultiProcessJPF;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;

import org.junit.Test;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class TypeSeparationTest extends TestMultiProcessJPF {

  private static int counter = 0;

  private static void incCounter() {
    counter++;
  }

  // To make sure that our multiProcess VM keeps the static attributes separated
  // This also checks for type safe clone for the InvokeStatic instruction.
  @Test
  public void staticCounterTest() {
    // Note that this code is executed 4 times. Since every time this is executed its
    // state is restored, the value of counter should be always 1
    if (mpVerifyNoPropertyViolation(2)) {
      int id = getProcessId();
      switch(id) {
      case 0:
        incCounter();
        break;
      case 1:
        incCounter();
        break;
      default:
        fail("invalid process number!");
      }

      assertEquals(counter,1);
    }
  }

  @Retention(RetentionPolicy.RUNTIME)
  @Inherited
  public @interface A0 {
  }

  private native void keepAnnotationClass(Class annCls, int prcId);

  @Test
  public void annotationsTest () {
    if(!isJPFRun()) {
      JPF_gov_nasa_jpf_vm_multiProcess_TypeSeparationTest.resetPrcIds();
    }

    if (mpVerifyNoPropertyViolation(2)) {
      int prcId = getProcessId();
      keepAnnotationClass(A0.class, prcId);
    }

    if(!isJPFRun()) {
      List<ClassInfo> annClassList = JPF_gov_nasa_jpf_vm_multiProcess_TypeSeparationTest.getAnnotationClasses();
      assertEquals(annClassList.size(), 2);
      assertTrue(annClassList.get(0)!=annClassList.get(1));
    }
  }


  private native void keepClassLoader(ClassLoader thd, int prcId);

  // to make sure that each process accesses the classes loaded by the right
  // system class loader
  @Test
  public void systemClassLoaderTest() {
    if(!isJPFRun()) {
      JPF_gov_nasa_jpf_vm_multiProcess_TypeSeparationTest.resetPrcIds();
    }

    if (mpVerifyNoPropertyViolation(2)) {
      ClassLoader cl = Object.class.getClassLoader();

      // in our implementation this goes through the class hierarchy of the 
      // current thread and it returns the class loader of the Thread class
      ClassLoader sysLoader = ClassLoader.getSystemClassLoader();
      assertEquals(cl, sysLoader);

      int prcId = getProcessId();
      keepClassLoader(cl, prcId);
    }

    if(!isJPFRun()) {
      List<ClassLoaderInfo> classLoaders = JPF_gov_nasa_jpf_vm_multiProcess_TypeSeparationTest.getClassLoaders();
      assertEquals(classLoaders.size(), 2);
      assertTrue(classLoaders.get(0)!=classLoaders.get(1));
    }
  }
}
