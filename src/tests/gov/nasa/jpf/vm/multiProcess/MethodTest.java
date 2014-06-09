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

import gov.nasa.jpf.util.test.TestMultiProcessJPF;
import gov.nasa.jpf.vm.MethodInfo;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class MethodTest extends TestMultiProcessJPF {
  public native void keepMethod(Method m, int prcId);

  // To check the type safe cloning of methods
  @Test
  public void methodCloneTest() throws SecurityException, NoSuchMethodException {
    if(!isJPFRun()) {
      JPF_gov_nasa_jpf_vm_multiProcess_MethodTest.resetPrcIds();
    }

    if (mpVerifyNoPropertyViolation(2)) {
      Method m = MethodTest.class.getMethod("methodCloneTest", new Class[]{});
      int prcId = getProcessId();
      keepMethod(m, prcId);
    }

    if(!isJPFRun()) {
      List<MethodInfo> methods = JPF_gov_nasa_jpf_vm_multiProcess_MethodTest.getMethods();
      assertEquals(methods.size(), 2);
      assertTrue(methods.get(0)!=methods.get(1));
    }
  }

  @Test
  public void methodDeclaringClassTest() throws SecurityException, NoSuchMethodException {
    if (mpVerifyNoPropertyViolation(2)) {
      Class<?> cls = MethodTest.class;

      // The loader of this class should be the same as the loader that loads 
      // the class java.lang.Thread within this process
      assertEquals(cls.getClassLoader(), ClassLoader.getSystemClassLoader());
      for(Method m: cls.getDeclaredMethods()) {
        assertEquals(m.getDeclaringClass(), cls);
      }
    }
  }
}
