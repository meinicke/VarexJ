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

package gov.nasa.jpf.test.mc.threads;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.junit.Test;

/**
 *
 */
public class ExceptionalThreadChoiceTest extends TestJPF {

  native void foo() throws IOException, SocketTimeoutException; // this gets rescheduled with exceptions
  
  @Test
  public void testExceptions (){
    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
      Verify.resetCounter(2);
    }
    
    if (verifyNoPropertyViolation()){
      try {
        foo();
        System.out.println("main no exception");
        Verify.incrementCounter(0);
      }  catch (SocketTimeoutException stox){ // order matters since SocketTimeoutException is also a IOException
        System.out.println("main got SocketTimeoutException");
        Verify.incrementCounter(1);
      } catch (IOException iox){
        System.out.println("main got IOException");
        Verify.incrementCounter(2);
      }
    }
    
    if (!isJPFRun()){
      assertTrue( "nominal path missing", Verify.getCounter(0) > 0);
      assertTrue( "SocketTimeoutException missing", Verify.getCounter(1) > 0);
      assertTrue( "IOException missing", Verify.getCounter(2) > 0);
    }    
  }
  
  
}
