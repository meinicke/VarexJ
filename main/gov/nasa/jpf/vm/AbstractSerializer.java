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

import gov.nasa.jpf.jvm.bytecode.extended.Conditional;



public abstract class AbstractSerializer
implements StateSerializer, KernelState.ChangeListener {
  // INVARIANT: non-null iff registered for changes to KernelState
  protected Conditional<Integer>[] cached = null;

  protected VM vm;
  protected KernelState ks = null;


  public void attach(VM vm) {
    this.vm = vm;
    this.ks = vm.getKernelState();
  }

  public int getCurrentStateVectorLength() {
    return cached.length;
  }

  public Conditional<Integer>[] getStoringData() {
    if (cached == null) {
      cached = computeStoringData();
      ks.pushChangeListener(this);
    }
    return cached;
  }
  
  
  public int[] toArray(Conditional<Integer>[] in) {
	    int[] out = new int[in.length];
	    
	    for (int i = 0;i < in.length;i++) {
	    	out[i] = in[i].getValue();
	    }
	    return out;
	  }

  public void kernelStateChanged (KernelState same) {
    cached = null;
  }

  
  protected abstract Conditional<Integer>[] computeStoringData();
}
