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
package gov.nasa.jpf.test.basic;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.SingleProcessVM;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

public class ListenerTest extends TestJPF {

  public static class Listener extends ListenerAdapter {
    @Override
    public void searchStarted (Search search){
      System.out.println("-- listener got searchStarted() notification");
      Verify.incrementCounter(0);
    }
  }
  
  public static class TestVM extends SingleProcessVM {
    public TestVM (JPF jpf, Config config){
      super(jpf, config);
      
      jpf.addListener( new Listener());
    }
  }
  
  @Test
  public void testPendingListeners (){
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }
    
    if (verifyNoPropertyViolation("+vm.class=gov.nasa.jpf.test.basic.ListenerTest$TestVM")){
      System.out.println("this is verified by JPF");
    }
    
    if (!isJPFRun()){
      assertTrue("init listener got no searchStarted() notification", Verify.getCounter(0) == 1);
    }
  }
  
  // <2do> ... and tons more to follow
}
