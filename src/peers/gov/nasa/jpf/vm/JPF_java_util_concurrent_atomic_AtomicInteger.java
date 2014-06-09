//
//Copyright (C) 2009 United States Government as represented by the
//Administrator of the National Aeronautics and Space Administration
//(NASA).  All Rights Reserved.
//
//This software is distributed under the NASA Open Source Agreement
//(NOSA), version 1.3.  The NOSA has been approved by the Open Source
//Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
//directory tree for the complete NOSA document.
//
//THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
//KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
//LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
//SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
//A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
//THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
//DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

/**
* native peer for java.util.concurrent.atomic.AtomicInteger
* this implementation just cuts off native methods
*/
public class JPF_java_util_concurrent_atomic_AtomicInteger extends NativePeer {

  @MJI
  public void $clinit____V (MJIEnv env, int rcls) {
    // don't let this one pass, it calls native methods from non-public Sun classes
  }
 
  @MJI
  public boolean compareAndSet__II__Z (MJIEnv env, int objRef, int expect, int update){
    int value = env.getIntField(objRef, "value");
    if (value == expect){
      env.setIntField(objRef, "value", update);
      return true;
    } else {
      return false;
    }
  }
}
