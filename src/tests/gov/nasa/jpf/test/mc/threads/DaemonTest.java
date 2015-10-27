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
package gov.nasa.jpf.test.mc.threads;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

/**
 * test verification of daemon threads, which are different because of their
 * automatic termination upon exit of the last non-daemon
 */
public class DaemonTest extends TestJPF {

  static class T1 extends Thread {

    boolean blowUp = false;
    //Boolean blowUp = false;

    T1() {
      setDaemon(true);
    }

    public void run() {
      if (blowUp){
        throw new RuntimeException("blow up");
      }
    }
  }

  
  /**
   * test if there is a proper CG BEFORE the main thread terminates, which
   * would take the daemon down before it has a chance to blow up
   */
  @Test
  public void testRace(){
    if (verifyUnhandledExceptionDetails("java.lang.RuntimeException", "blow up")){
      T1 t = new T1();
      t.start();
      
      // this is a shared access CG, but since this is the last statement,
      // main thread termination would kill the daemon. In a host VM, there
      // could be still a context switch between the PUTFIELD and the thread
      // termination
      t.blowUp = true;
      
      int dummy = 42; // totally pointless, but a host VM could still reschedule here
    }
  }
}
