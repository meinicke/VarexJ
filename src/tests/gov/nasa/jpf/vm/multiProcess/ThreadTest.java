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

package gov.nasa.jpf.vm.multiProcess;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.util.test.TestMultiProcessJPF;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.SchedulerFactory;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

import java.util.List;

import org.junit.Test;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class ThreadTest extends TestMultiProcessJPF {
  private native void keepThread(Thread thd, int prcId);

  // To make sure that each process has its own main thread 
  @Test
  public void mainThreadsIdTest() {
    if(!isJPFRun()) {
      JPF_gov_nasa_jpf_vm_multiProcess_ThreadTest.resetPrcIds();
    }

    if (mpVerifyNoPropertyViolation(2)) {
      int prcId = getProcessId();
      keepThread(Thread.currentThread(), prcId);
    }

    if(!isJPFRun()) {
      List<ThreadInfo> threads = JPF_gov_nasa_jpf_vm_multiProcess_ThreadTest.getThreads();
      assertEquals(threads.size(), 2);
      assertTrue(threads.get(0)!=threads.get(1));
    }
  }

  private native void addToThreads(Thread thd);

  public class TestThread extends Thread {
    public void run() {
      addToThreads(this);
    }
  }

  // To make sure that the total number of threads created does not exceed 4
  // where each processes includes two threads
  @Test
  public void numOfThreadsTest() {
    if(!isJPFRun()) {
      JPF_gov_nasa_jpf_vm_multiProcess_ThreadTest.resetThreads();
    }
 
    if (mpVerifyNoPropertyViolation(2)) {
      TestThread thd = new TestThread();
      thd.start();

      addToThreads(Thread.currentThread());
    }

    if(!isJPFRun()) {
      assertEquals(JPF_gov_nasa_jpf_vm_multiProcess_ThreadTest.getThreadIds().size(), 4);
    }
  }

  public static class InterleaveCheckListener extends ListenerAdapter {
    static int numOfCG = 0;

    @Override
    public void choiceGeneratorProcessed (VM vm, ChoiceGenerator<?> newCG) {
      String id = newCG.getId();

      if(!id.equals("<root>") && !id.equals(SchedulerFactory.THREAD_TERMINATE)) {
        fail("Threads from two different processes should only interleave at the " +
          "thread termination point!");
      }

      numOfCG++;
    }
  }

  private static int counter = 0;

  // To make sure that the only point that threads from two processes interleave 
  // is the thread termination point & number of choice generators does not 
  // exceed 3
  @Test
  public void threadInterleavingTest() {
    if (mpVerifyNoPropertyViolation(2, "+listener=gov.nasa.jpf.vm.multiProcess.ThreadTest$InterleaveCheckListener",
            "+vm.max_transition_length=MAX")) {
      // InterleaveCheck listener makes sure that transition is not broken at the 
      // static field access
      counter = 0;
    }

    if(!isJPFRun()) {
      assertEquals(InterleaveCheckListener.numOfCG, 3);
    }
  }
}
