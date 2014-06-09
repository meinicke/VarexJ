//
// Copyright (C) 2009 United States Government as represented by the
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

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

/**
 * Ensures that a recursive lock/unlock doesn't leave the lock in an acquired state.
 */
public class UnlockNonSharedTest extends TestJPF
{
   @Test
   public void test() throws InterruptedException
   {
      Runnable task, nop;
      Thread thread;
      
      if (verifyNoPropertyViolation())
      {
         Verify.setProperties("vm.por.skip_local_sync=true");

         nop = new Runnable()
         {
            public void run()
            {
               // nothing to do
            }
         };
         
         task = new Runnable()
         {
            private final Object m_lock = new Object();
            private       int    m_count;
            
            public void run()
            {
               synchronized (m_lock)
               {
                  m_count++;
               }
            }
         };
         
         task.run();                    // Acquire m_lock in a single-threaded state so that MONITOREXIT.isShared() will return false.  (The bug would cause ei.unlock() to not be called).
         
         thread = new Thread(task);     // Create a thread to acquire m_lock.
         
         thread.setDaemon(false);
         thread.start();                // To reproduce the bug, this thread shouldn't start executing until after the main thread exits.  This thread should then execute to the point just before acquiring m_lock.
         
         thread = new Thread(nop);      // Create another thread.  This thread must not be able to reach m_lock.
   
         thread.setDaemon(false);
         thread.start();                // This thread should start and exit before the above thread acquires m_lock.  Due to the bug, the above thread won't be able to acquire the lock and hence a "deadlock" will ensue.
      }
   }
}
