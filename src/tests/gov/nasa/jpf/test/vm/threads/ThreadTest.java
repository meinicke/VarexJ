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

import gov.nasa.jpf.annotation.FilterField;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;


/**
 * threading test
 */
public class ThreadTest extends TestJPF {
  static String didRunThread = null;

  @Test public void testDaemon () {
    if (verifyNoPropertyViolation()) {
      Runnable r = new Runnable() {

        public void run() {
          Thread t = Thread.currentThread();

          if (!t.isDaemon()) {
            throw new RuntimeException("isDaemon failed");
          }

          didRunThread = t.getName();
        }
      };

      didRunThread = null;

      Thread t = new Thread(r);
      t.setDaemon(true);
      t.start();

      try {
        t.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("thread was interrupted");
      }

      String tname = Thread.currentThread().getName();
      if ((didRunThread == null) || (didRunThread.equals(tname))) {
        throw new RuntimeException("thread did not execute: " + didRunThread);
      }
    }
  }

  @Test public void testDaemonTermination () {
    if (verifyNoPropertyViolation("+cg.threads.break_start=true",
                                  "+cg.threads.break_yield=true")) {
      final Thread mainThread = Thread.currentThread();

      Runnable r = new Runnable() {

        @FilterField  // without this, we have a perfectly open state space and never finish in JPF
        int n = 0;

        public void run() {
          while (true) { // loop forever or until main finishes
            n++;

            // NOTE: this does not necessarily hold outside of JPF, since the daemon might still run for a few cycles
            assert (n < 100) || mainThread.isAlive() : "main terminated but daemon still running";
            System.out.println("  daemon running in round: " + n);

            Thread.yield();
          }
        }
      };

      Thread t = new Thread(r);
      t.setDaemon(true);
      t.start();

      Thread.yield();
      // finishing this thread should also (eventually) terminate the daemon
      System.out.println("main terminating");
    }
  }
  
  @Test public void testMain () {
    if (verifyNoPropertyViolation()) {
      Thread t = Thread.currentThread();
      String refName = "main";

      String name = t.getName();

      if (!name.equals(refName)) {
        throw new RuntimeException("wrong main thread name, is: " + name +
                ", expected: " + refName);
      }

      refName = "my-main-thread";
      t.setName(refName);
      name = t.getName();

      if (!name.equals(refName)) {
        throw new RuntimeException("Thread.setName() failed, is: " + name +
                ", expected: " + refName);
      }

      int refPrio = Thread.NORM_PRIORITY;
      int prio = t.getPriority();

      if (prio != refPrio) {
        throw new RuntimeException("main thread has no NORM_PRIORITY: " + prio);
      }

      refPrio++;
      t.setPriority(refPrio);
      prio = t.getPriority();

      if (prio != refPrio) {
        throw new RuntimeException("main thread setPriority failed: " + prio);
      }

      if (t.isDaemon()) {
        throw new RuntimeException("main thread is daemon");
      }
    }
  }

  @Test public void testName () {
    if (verifyNoPropertyViolation()) {
      Runnable r = new Runnable() {

        public void run() {
          Thread t = Thread.currentThread();
          String name = t.getName();

          if (!name.equals("my-thread")) {
            throw new RuntimeException("wrong Thread name: " + name);
          }

          didRunThread = name;
        }
      };

      didRunThread = null;

      Thread t = new Thread(r, "my-thread");


      //Thread t = new Thread(r);
      t.start();

      try {
        t.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("thread was interrupted");
      }

      String tname = Thread.currentThread().getName();
      if ((didRunThread == null) || (didRunThread.equals(tname))) {
        throw new RuntimeException("thread did not execute: " + didRunThread);
      }
    }
  }

  public void testSingleYield () {
    Thread.yield();
  }
  
  @Test public void testYield () {
    if (verifyNoPropertyViolation("+cg.threads.break_start=true",
                                  "+cg.threads.break_yield=true")) {
      Runnable r = new Runnable() {

        public void run() {
          Thread t = Thread.currentThread();

          while (!didRunThread.equals("blah")) {
            Thread.yield();
          }

          didRunThread = t.getName();
        }
      };

      didRunThread = "blah";

      Thread t = new Thread(r);
      t.start();

      while (didRunThread.equals("blah")) {
        Thread.yield();
      }

      String tname = Thread.currentThread().getName();
      if ((didRunThread == null) || (didRunThread.equals(tname))) {
        throw new RuntimeException("thread did not execute: " + didRunThread);
      }
    }
  }
  
  
  @Test public void testPriority () {
    if (verifyNoPropertyViolation()) {
      Runnable r = new Runnable() {

        public void run() {
          Thread t = Thread.currentThread();
          int prio = t.getPriority();

          if (prio != (Thread.MIN_PRIORITY + 2)) {
            throw new RuntimeException("wrong Thread priority: " + prio);
          }

          didRunThread = t.getName();
        }
      };

      didRunThread = null;

      Thread t = new Thread(r);
      t.setPriority(Thread.MIN_PRIORITY + 2);
      t.start();

      try {
        t.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("thread was interrupted");
      }

      String tname = Thread.currentThread().getName();
      if ((didRunThread == null) || (didRunThread.equals(tname))) {
        throw new RuntimeException("thread did not execute: " + didRunThread);
      }
    }
  }
  
  @Test public void testJoin () {
    if (verifyNoPropertyViolation()) {
      Runnable r = new Runnable() {

        public synchronized void run() {
          didRunThread = Thread.currentThread().getName();
        }
      };

      Thread t = new Thread(r);

      synchronized (r) {
        t.start();
        Thread.yield();
        if (didRunThread != null) {
          throw new RuntimeException("sync thread did execute before lock release");
        }
      }

      try {
        t.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("main thread was interrupted");
      }

      if (didRunThread == null) {
        throw new RuntimeException("sync thread did not run after lock release");
      }
    }
  }

  @Test public void testTimeoutJoin () {
    if (!isJPFRun()){
      Verify.resetCounter(0);
      Verify.resetCounter(1);
    }

    if (verifyNoPropertyViolation()) {
      Runnable r = new Runnable() {

        public void run() {
          synchronized(this){
            System.out.println("[t] started");
          }
          didRunThread = Thread.currentThread().getName(); // this causes a CG
          System.out.println("[t] finished");
        }
      };

      Thread t = new Thread(r);

      synchronized (r) {
        t.start();
        Thread.yield();
        if (didRunThread != null) {
          throw new RuntimeException("sync thread did execute before lock release");
        }
      }

      try {
        System.out.println("[main] joining..");
        t.join(42);
        System.out.println("[main] joined, t state: " + t.getState());

        // we should get here for both terminated and non-terminated t
        switch (t.getState()) {
          case TERMINATED:
            if (didRunThread != null){
              Verify.incrementCounter(0);
            }
            break;
          case RUNNABLE:
            Verify.incrementCounter(1);
            break;
          default:
            throw new RuntimeException("infeasible thread state: " + t.getState());
        }

      } catch (InterruptedException ix) {
        throw new RuntimeException("main thread was interrupted");
      }
    }

    if (!isJPFRun()){
      assert Verify.getCounter(0) > 0;
      assert Verify.getCounter(1) > 0;
    }
  }


  @Test public void testInterrupt() {
    if (verifyNoPropertyViolation()) {

      Runnable r = new Runnable() {

        public synchronized void run() {
          try {
            didRunThread = Thread.currentThread().getName();
            System.out.println("-- t waiting");
            wait();
          } catch (InterruptedException x) {
            System.out.println("-- t interrupted");
            didRunThread = null;
          }
          System.out.println("-- t terminated");
        }
      };

      Thread t = new Thread(r);
      t.start();

      while (didRunThread == null) {
        Thread.yield();
      }

      synchronized (r) {
        System.out.println("-- main thread interrupting...");
        t.interrupt();
      }

      try {
        t.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("main thread was interrupted");
      }

      if (didRunThread != null) {
        throw new RuntimeException("t did not get interrupted");
      }

      System.out.println("-- main thread terminated");
    }
  }
  
  
  @Test public void testSimpleThreadGroup () {
    if (verifyNoPropertyViolation()) {

      System.out.println("-- main thread started");

      Thread mainThread = Thread.currentThread();
      final ThreadGroup sysGroup = mainThread.getThreadGroup();


      assert sysGroup != null && sysGroup.getName().equals("main");

      int active = sysGroup.activeCount();
      assert active == 1;
      Thread[] list = new Thread[active];

      int n = sysGroup.enumerate(list);
      assert (n == active);
      assert list[0] == mainThread;


      Runnable r = new Runnable() {

        public void run() {
          System.out.println("-- t started");
          didRunThread = Thread.currentThread().getName();

          Thread t = Thread.currentThread();
          ThreadGroup group = t.getThreadGroup();

          assert group != null && group == sysGroup;

          int active = group.activeCount();
          assert active == 2;
          Thread[] list = new Thread[active];

          int n = group.enumerate(list);
          assert (n == active);

          assert list[1] == t;
          System.out.println("-- t terminated");
        }
      };

      Thread t = new Thread(r);
      t.start();

      try {
        t.join();
      } catch (InterruptedException ix) {
        throw new RuntimeException("main thread was interrupted");
      }

      if (didRunThread == null) {
        throw new RuntimeException("t did not run");
      }

      System.out.println("-- main thread terminated");
    }
  }
}
