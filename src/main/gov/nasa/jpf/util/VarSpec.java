//
// Copyright (C) 2011 United States Government as represented by the
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

import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;

/**
 * utility class to specify local variables in JPF options
 * example:
 *
 *  x.y.MyClass.foo(int,double):x
 * 
 * Note: this is not derived from FeatureSpec, it only used a MethodSpec for delegation
 *
 * <2do> we don't deal with scopes or types yet
 */
public class VarSpec  {

  static JPFLogger logger = JPF.getLogger("gov.nasa.jpf.util");

  String varName;
  MethodSpec mthSpec;

  public static VarSpec createVarSpec(String spec) {
    int idx = spec.indexOf(':');

    if (idx > 0) {
      String ms = spec.substring(0, idx).trim();
      String vs = spec.substring(idx+1).trim();

      MethodSpec mspec = MethodSpec.createMethodSpec(ms);
      if (mspec != null){
        return new VarSpec(vs, mspec);
      }
    }

    logger.warning("illegal variable spec ", spec);
    return null;
  }

  public VarSpec (String varName, MethodSpec mthSpec){
    this.varName = varName;
    this.mthSpec = mthSpec;
  }

  public LocalVarInfo getMatchingLocalVarInfo (MethodInfo mi, int pc, int slotIdx){

    if (mthSpec.matches(mi)){
      LocalVarInfo lvar = mi.getLocalVar(slotIdx, pc);
      if (lvar != null && lvar.getName().equals(varName)){
        return lvar;
      }
    }

    return null;
  }


}
