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
package gov.nasa.jpf;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 *  
 * Represents the finalizer thread which runs finalize() methods upon
 * garbage collection of finalizable objects, i.e. the class of a finalizable 
 * object overrides the Object.finalize() method.
 * 
 * Note that, by default, we don't process finalizers. To run finalizers one
 * needs to set the property "vm.process_finalizers" to true.
 */
public class FinalizerThread extends Thread {
  
  // upon their garbage collection, finalizable objects are added into this list instead 
  // of being removed by gc().sweep()
  private Object[] finalizeQueue;
  
  private Object semaphore;
  private boolean done;
  
  
  private void runAllFinalizers() {
    while(!isEmpty()) {
      try {
        // runFinalizer processes and removes the first element in the list
        runFinalizer(finalizeQueue[0]);
      } catch (Throwable e) { 
        // FinalizerThread ignores exceptions thrown by finalizers.
      }
    }
  }
  
  boolean isEmpty() {
    return (finalizeQueue.length == 0);
  }
  
  // invoke finalize() on the give object
  private native void runFinalizer(Object o);
  
  private native void manageState();
  
  private void processFinalizers() {
    runAllFinalizers();
    manageState();
  }

  public void run() {
    while (!done){
      processFinalizers();
    }
  }
}
