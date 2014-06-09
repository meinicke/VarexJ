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
package gov.nasa.jpf.test.java.concurrent;

import gov.nasa.jpf.util.test.TestJPF;

import java.util.concurrent.Semaphore;

import org.junit.Test;

/**
 * simple test for Java 1.5 java.util.concurrent support
 */
public class SemaphoreTest extends TestJPF {

  //--- test methods

  static final int MAX = 1;
  static final Semaphore avail = new Semaphore(MAX, true);
  static Resource[] items = new Resource[MAX];
  static boolean[] isUsed = new boolean[MAX];
  static final Object lock = new Object();


  static {
    for (int i = 0; i < items.length; i++) {
      items[i] = new Resource(i);
    }
  }

  static class Resource {

    String id;
    String user;

    Resource(int id) {
      this.id = "Resource-" + id;
    }

    public void use(String newUser) {
      assert user == null : "resource " + id + " in use by " + user +
              ", but attempted to be acquired by: " + newUser;
      user = newUser;
    }

    public void release() {
      user = null;
    }

    public String toString() {
      return id;
    }
  }

  public static Resource getItem() throws InterruptedException {
    avail.acquire();

    synchronized (lock) {
      for (int i = 0; i < MAX; i++) {
        if (!isUsed[i]) {
          isUsed[i] = true;
          return items[i];
        }
      }
    }
    assert false : "couldn't find unused resource";
    return null;
  }

  public static void putItem(Resource o) {
    synchronized (lock) {
      for (int i = 0; i < MAX; i++) {
        if (items[i] == o) {
          if (isUsed[i]) {
            isUsed[i] = false;
            avail.release();
          }
          break;
        }
      }
    }
  }

  static class Client implements Runnable {

    public void run() {
      String id = Thread.currentThread().getName();

      try {
        System.out.println(id + " acquiring resource..");
        Resource r = SemaphoreTest.getItem();
        System.out.println(id + " got resource: " + r);

        r.use(id);
        //.. more stuff here
        r.release();

        System.out.println(id + " releasing resource: " + r);
        SemaphoreTest.putItem(r);
        System.out.println(id + " released");

      } catch (InterruptedException ix) {
        System.out.println("!! INTERRUPTED");
      }
    }
  }

  //--------------- the test cases
  @Test
  public void testResourceAcquisition() {
    if (verifyNoPropertyViolation()) {
      for (int i = 0; i <= MAX; i++) {
        Thread t = new Thread(new Client());
        t.start();
      }
    }
  }
}
