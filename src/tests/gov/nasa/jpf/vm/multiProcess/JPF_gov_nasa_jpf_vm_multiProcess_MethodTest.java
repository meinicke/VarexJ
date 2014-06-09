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

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.JPF_java_lang_reflect_Method;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativePeer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nastaran Shafiei <nastaran.shafiei@gmail.com>
 */
public class JPF_gov_nasa_jpf_vm_multiProcess_MethodTest extends NativePeer {
  private static List<Integer> prcIds = new ArrayList<Integer>();

  protected static void resetPrcIds() {
    prcIds.clear();
  }

  private static List<MethodInfo> methods =  new ArrayList<MethodInfo>();

  @MJI
  public void keepMethod__Ljava_lang_reflect_Method_2I__V(MJIEnv env, int objRef, int mthRef, int prcId) {
    MethodInfo mi = JPF_java_lang_reflect_Method.getMethodInfo(env, mthRef);
    if(!prcIds.contains(prcId)) {
      prcIds.add(prcId);
      methods.add(mi);
    }
  }

  protected static List<MethodInfo> getMethods() {
    return methods;
  }
}
