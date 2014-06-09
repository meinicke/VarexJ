//
// Copyright (C) 2012 United States Government as represented by the
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

import org.junit.Test;

import gov.nasa.jpf.annotation.FilterField;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * regression test for stateless (non-matching) execution mode
 */
public class StatelessTest extends TestJPF {

  @Test
  public void testNumberOfPaths(){
    
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }
    
    if (verifyNoPropertyViolation("+vm.storage.class=null")){
      int d = Verify.getInt(0, 5);
      d = 0;
      Verify.breakTransition("testNumberOfPaths"); // just to give the serializer something to chew on (if there is any)
      System.out.println("got here");
      Verify.incrementCounter(0);
    }
    
    if (!isJPFRun()){
      assert Verify.getCounter(0) == 6;
    }
  }
}
