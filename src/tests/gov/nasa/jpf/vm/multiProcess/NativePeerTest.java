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

import org.junit.Test;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class NativePeerTest extends TestMultiProcessJPF {

  native void incNativeCounters();

  native int getNativeCounter();

  // To make sure that native peers are kept separately - note different class
  // with the same fully qualified name still share the same NativePeer class
  // but they keep different instances of it
  @Test
  public void nativePeerTest() {
    // Note that this code is executed 4 times (twice by each process main thread).
    // Since we do not restore NativePeer states the maximum value of counter in 
    // NativePeer should be 2
    if (mpVerifyNoPropertyViolation(2, "+vm.max_transition_length=MAX")) { // make sure we don't get a spurious CG
      incNativeCounters();

      int i = getNativeCounter();
      assertTrue(i==1 || i==2);
    }

    if(!isJPFRun()) {
      // To make sure this code is executed 4 times
      assertEquals(JPF_gov_nasa_jpf_vm_multiProcess_NativePeerTest.getStaticNativeCounter(), 4);
    }
  }
}
