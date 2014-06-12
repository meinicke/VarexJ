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
package gov.nasa.jpf.vm;


public abstract class AbstractRestorer<Saved> implements StateRestorer<Saved>, KernelState.ChangeListener {

  protected Saved cached = null;

  VM vm;
  protected KernelState ks = null;

  
  public void attach(VM vm) {
    this.vm = vm;
    this.ks = vm.getKernelState();
  }
  
  public Saved getRestorableData() {
    if (cached == null) {
      cached = computeRestorableData();
      ks.pushChangeListener(this);
    }
    return cached;
  }
  
  public void restore (Saved data) {
    doRestore(data);
    if (cached == null) {
      ks.pushChangeListener(this);
    } else {
      // invariant says we're already waiting for changes
    }
    cached = data;
  }

  public void kernelStateChanged (KernelState same) {
    cached = null;
  }
  
  protected abstract Saved computeRestorableData();
  protected abstract void doRestore(Saved data);
}
