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
 * regression test for TimeModel implementations
 */
public class TimeModelTest extends TestJPF {
  
  @Test
  public void testSystemTime(){
    
    if (verifyNoPropertyViolation("+vm.time.class=.vm.SystemTime")){
      long t1 = System.currentTimeMillis();
      System.out.printf("t1 = %d\n", t1);
      
      boolean b2 = Verify.getBoolean();
      long t2 = System.currentTimeMillis();
      System.out.printf("  t2 = %d\n", t2);

      boolean b3 = Verify.getBoolean();
      long t3 = System.currentTimeMillis();
      System.out.printf("    t3 = %d\n", t3);

      assertTrue((t3 >= t2) && (t2 >= t1));
    }
  }
  
  @Test
  public void testPathTime(){
    
    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
    }
    
    if (verifyNoPropertyViolation("+vm.time.class=.vm.ConstInsnPathTime")){
      long t1 = System.currentTimeMillis();
      System.out.printf("t1 = %d\n", t1);
      
      boolean b2 = Verify.getBoolean(true); // we do falseFirst
      long t2 = System.currentTimeMillis();
      System.out.printf("  t2 = %d\n", t2);
      
      if (b2){ // has to be second time around
        assertTrue(t2 == Verify.getCounter(0));
      } else {
        Verify.setCounter(0,(int)t2);
      }


      boolean b3 = Verify.getBoolean(true);  // store the result so that we don't state match
      long t3 = System.currentTimeMillis();
      System.out.printf("    t3 = %d\n", t3);

      if (b3){ // has to be second time around
        assertTrue(t3 == Verify.getCounter(1));
      } else {
        Verify.setCounter(1,(int)t3);
      }
      
      assertTrue((t3 > t2) && (t2 > t1));
    }
    
    
  }
  
  
}
