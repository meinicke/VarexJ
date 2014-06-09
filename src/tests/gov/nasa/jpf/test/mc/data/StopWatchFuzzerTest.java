//
// Copyright (C) 2011 United States Government as represented by the
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
package gov.nasa.jpf.test.mc.data;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

/**
 * regression test for StopWatchFuzzer
 */
public class StopWatchFuzzerTest extends TestJPF {
  
  @Test
  public void testPaths() {
    
    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
    }

    if (verifyNoPropertyViolation("+listener=.listener.StopWatchFuzzer")){
      long tStart = System.currentTimeMillis();
      System.out.println("some lengthy computation..");
      long tEnd = System.currentTimeMillis();
      
      if (tEnd - tStart <= 5000){
        System.out.println("all fine, finished in time");
        Verify.incrementCounter(0); // should get here two times, for < and ==
      } else {
        System.out.println("panic, we didn't make it in time");
        Verify.incrementCounter(1);
      }
    }
    
    if (!isJPFRun()){
      assertTrue( Verify.getCounter(0) == 2);
      assertTrue( Verify.getCounter(1) == 1);
    }
  }
}
