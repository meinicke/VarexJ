//
// Copyright (C) 2007 United States Government as represented by the
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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.JPF_gov_nasa_jpf_vm_Verify;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

/**
 * just a dummy for now, to avoid UnsatisfiedLinkErrors
 */
public class JPF_java_lang_Runtime extends NativePeer {

  @MJI
  public void addShutdownHook__Ljava_lang_Thread_2__V (MJIEnv env, int objref, int threadRef) {
    // ignored for now
  }

  @MJI
  public long totalMemory____J (MJIEnv env, int objref) {
    // not really sure what to return here, since in reality this
    // value can be non-deterministic
    return 50000000;
  }

  @MJI
  public long maxMemory____J (MJIEnv env, int objref) {
    // yet another cut
    return 70000000;
  }

  @MJI
  public long freeMemory____J (MJIEnv env, int objref) {
    // we don't have an upper limit for our heap space, and we don't
    // keep track how much is used, so we just return a dummy
    
    // we could loop over the areas calling getHeapSize() on
    // ElementInfos, but since we don't have a max, what would
    // that be good for?
    
    return 10000000;
  }

  @MJI
  public void gc____V (MJIEnv env, int objref){
    env.gc();
  }
  
  @MJI
  public int availableProcessors____I (MJIEnv env, int objref){
    // this is what all these Runtime data acquisition APIs should look like
    // - since the value is oing to be used by the application, there should
    // be a way to vary it with a CG
    
    Config conf = env.getConfig();
    int maxProcessors = conf.getInt("cg.max_processors", 1);
    
    if (maxProcessors == 1) {
      return 1;
    } else {
      return JPF_gov_nasa_jpf_vm_Verify.getInt__II__I(env,-1, 1,maxProcessors);
    }
  }
}
