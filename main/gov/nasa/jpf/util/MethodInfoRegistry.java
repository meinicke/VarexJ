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

package gov.nasa.jpf.util;

import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;

/**
 * just a little helper for java.lang.reflect peers
 * 
 * <2do> - it's overly simplistic for now
 */
public class MethodInfoRegistry {
  
  final int NREG = 10;
  MethodInfo[] registered;
  int nRegistered;
  
  public MethodInfoRegistry () {
    registered = new MethodInfo[NREG];
    nRegistered = 0;
  }
    
  public int registerMethodInfo (MethodInfo mi) {
    int idx;
    
    for (idx=0; idx < nRegistered; idx++) {
      if (registered[idx] == mi) {
        return idx;
      }
    }
    
    if (idx == registered.length) {
      MethodInfo[] newReg = new MethodInfo[registered.length+NREG];
      System.arraycopy(registered, 0, newReg, 0, registered.length);
      registered = newReg;
    }
    
    registered[idx] = mi;
    nRegistered++;
    return idx;
  }
  
  public MethodInfo getRegisteredFieldInfo (int idx) {
    return registered[idx];
  }

  public MethodInfo getMethodInfo (MJIEnv env, int objRef, String fieldName) {
    int idx = env.getIntField( objRef, fieldName);
    
    assert ((idx >= 0) || (idx < nRegistered)) : "illegal MethodInfo request: " + idx + ", " + nRegistered;
    
    return registered[idx];
  }

}
