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

import org.junit.Test;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 * 
 * Test suit for FinalizerThread & FinalizeThreadInfo
 */
public class FinalizerThreadTest extends TestJPF {
  
  static class Finalize {
    static void createFinalize() {
      new Finalize();
    }
    
    @Override
    protected void finalize() throws Throwable {
      System.out.println("finalizer executing... ");
      throw new Exception();
    }
  }
  
  @Test
  public void testExceptionFromFinalizer (){
    if (verifyNoPropertyViolation( "+vm.process_finalizers=true")){
      // FinalizerThread should swallow the exception thrown in the finalize() method
      new Finalize();
    }
  }
  
  public static class FinalizerThreadListener extends ListenerAdapter {

    @Override
    public void stateAdvanced(Search search){
      if(search.isEndState()) {
        ThreadInfo currTi = search.getVM().getCurrentThread();
        ThreadInfo finalizerTi = search.getVM().getFinalizerThread();
        
        // make sure a finalizer thread exists
        assertTrue(finalizerTi!=null);
        
        // make sure the thread leading to the end state is finalizer
        assertEquals(currTi, currTi);
      }
    }
  }
  
  private static String[] JPF_ARGS = { "+vm.process_finalizers=true",
                                       "+listener=gov.nasa.jpf.test.mc.threads.FinalizerThreadTest$FinalizerThreadListener"};  
  @Test
  public void testFinalizerThreadRunning () {
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Finalize.createFinalize();
    }
  }
}
