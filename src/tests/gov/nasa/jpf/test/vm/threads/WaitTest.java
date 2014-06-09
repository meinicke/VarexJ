//
// Copyright (C) 2006 United States Government as represented by the
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
package gov.nasa.jpf.test.vm.threads;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * signal test (wait/notify)
 */
public class WaitTest extends TestJPF
{
  int counter;
  boolean cond;
  boolean done;
  
  @Test public void testVerySimpleWait () {
    if (verifyNoPropertyViolation()) {
      System.out.println("running testVerySimpleWait()");
      synchronized (this) {
        try {
          System.out.println("waiting");
          wait(100L);
          System.out.println("timed out");

        } catch (InterruptedException ix) {
          throw new RuntimeException("got interrupted");
        }
      }
    }
  }

  @Test public void testSimpleWait () {
    if (verifyNoPropertyViolation()) {
      System.out.println("running testSimpleWait()");

      Runnable notifier = new Runnable() {

        public void run() {
          synchronized (WaitTest.this) {
            System.out.println("notifying");
            cond = true;
            WaitTest.this.notify();
          }
        }
      };

      Thread t = new Thread(notifier);

      cond = false;

      synchronized (this) {
        t.start();

        try {
          System.out.println("waiting");
          wait();
          System.out.println("notified");
          if (!cond) {
            throw new RuntimeException("'cond' not set, premature wait return");
          }
        } catch (InterruptedException ix) {
          throw new RuntimeException("got interrupted");
        }
      }
    }
  }
  
  @Test public void testSyncRunWait () {
    if (verifyNoPropertyViolation()) {
      System.out.println("running testSyncRunWait()");

      Runnable waiter = new Runnable() {

        public synchronized void run() {
          System.out.println("thread-0 running");
          try {
            wait(); // needs to be first insn
            System.out.println("thread-0 notified");
          } catch (InterruptedException ix) {
            throw new RuntimeException("thread-0 got interrupted");
          }
        }
      };

      Thread t = new Thread(waiter);
      t.setDaemon(true); // to make sure we don't get a deadlock
      t.start();

      synchronized (waiter) {
        System.out.println("main notifying");
        waiter.notify();
      }
    }
  }



  @Test public void testTimeoutWait () {
    if (verifyNoPropertyViolation()) {
      System.out.println("running testTimeoutWait()");

      Runnable notifier = new Runnable() {

        public void run() {
          synchronized (WaitTest.this) {
            System.out.println("notifying");
            cond = true;
            WaitTest.this.notify();
          }
        }
      };

      Thread t = new Thread(notifier);

      cond = false;

      synchronized (this) {
        if (false) {
          t.start();
        }

        try {
          System.out.println("waiting");
          wait(1);
          if (cond) {
            System.out.println("got notified");
          } else {
            System.out.println("wait timed out");
          }
        } catch (InterruptedException ix) {
          throw new RuntimeException("got interrupted");
        }
      }
    }
  }

  @Test public void testLoopedWait () {
    if (verifyNoPropertyViolation()) {
      System.out.println("running testLoopedWait()");

      Runnable notifier = new Runnable() {

        public void run() {
          while (!done) {
            synchronized (WaitTest.this) {
              System.out.println("notifying");
              cond = true;
              WaitTest.this.notify();
            }
          }
        }
      };

      Thread t = new Thread(notifier);

      cond = false;
      done = false;

      t.start();
      synchronized (this) {
        for (int i = 0; i < 2; i++) {
          try {
            System.out.println("waiting "); //System.out.println(i);
            wait();
            System.out.println("notified "); //System.out.println(i);
            if (!cond) {
              throw new RuntimeException("'cond' not set, premature wait return");
            }
            cond = false;
          } catch (InterruptedException ix) {
            throw new RuntimeException("got interrupted");
          }
        }
        done = true;
      }
    }
  }
  
  @Test public void testInterruptedWait () {
    if (verifyNoPropertyViolation()) {
      System.out.println("running testInterruptedWait()");

      final Thread current = Thread.currentThread();

      Runnable notifier = new Runnable() {

        public void run() {
          synchronized (WaitTest.this) {
            System.out.println("interrupting");
            cond = true;
            current.interrupt();
          }
        }
      };
      Thread t = new Thread(notifier);

      cond = false;

      synchronized (this) {
        t.start();

        try {
          System.out.println("waiting");
          wait();
          System.out.println("notified");
          throw new RuntimeException("notified, not interrupted");
        } catch (InterruptedException ix) {
          if (!cond) {
            throw new RuntimeException("'cond' not set, premature wait return");
          }
        }
      }
    }
  }

  class Waiter implements Runnable {
    String name;
    boolean waiting;
    boolean done1;
    
    Waiter (String name) {
      this.name = name; 
      waiting = false;
      done1 = false;
    }
    
    public void run () {
      synchronized (WaitTest.this) {
        try {
          System.out.print(name); System.out.println(" waiting");
          waiting = true;
          WaitTest.this.wait();
          System.out.print(name); System.out.println(" notified");
          done1 = true;
        } catch (InterruptedException ix) {
          throw new RuntimeException("waiter was interrupted");
        }
      }
    }    
  }
  
  /**
   * that's a misnomer, since this one executes almost all of signal handling (except of mixed
   * wait/timeout-wait and timeout joins) it should be called 'testAlmostAll'
   *
   */
  @Test public void testNotifyAll () {
    if (verifyNoPropertyViolation()) {
      System.out.println("running testNotifyAll()");

      Waiter waiter1 = new Waiter("waiter1");
      Thread t1 = new Thread(waiter1);
      t1.start();
      while (!waiter1.waiting) {
        Thread.yield();
      }

      Waiter waiter2 = new Waiter("waiter2");
      Thread t2 = new Thread(waiter2);
      t2.start();
      while (!waiter2.waiting) {
        Thread.yield();
      }

      synchronized (this) {
        System.out.println("main notifying all waiters..");
        notifyAll();
        System.out.println("..done");
      }

      try {
        t1.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("main interrupted while waiting for thread1 to finish");
      }
      try {
        t2.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("main interrupted while waiting for thread2 to finish");
      }

      synchronized (this) {
        if (!waiter1.done1) {
          throw new RuntimeException("waiter1 was not done");
        }
        if (!waiter2.done1) {
          throw new RuntimeException("waiter2 was not done");
        }
      }
    }
  }
}

