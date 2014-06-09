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

package gov.nasa.jpf.test.mc.threads;

import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.choice.ExceptionThreadChoiceFromSet;

/**
 *
 */
public class JPF_gov_nasa_jpf_test_mc_threads_ExceptionalThreadChoiceTest extends NativePeer {

  @MJI
  public void foo____V (MJIEnv env, int objRef){
    
    ThreadInfo ti = env.getThreadInfo();
    if (!ti.isFirstStepInsn()){
      String[] exceptions = { "java.net.SocketTimeoutException", "java.io.IOException" };
      
      System.out.println("    in top half of native foo()");
      VM vm = ti.getVM();
      ThreadInfo[] runnables = vm.getThreadList().getAllMatching(vm.getTimedoutRunnablePredicate());
      ExceptionThreadChoiceFromSet cg = new ExceptionThreadChoiceFromSet("FOO_CG", runnables, ti, exceptions);
      
      ti.getVM().getSystemState().setNextChoiceGenerator(cg);
      env.repeatInvocation();
      
    } else {
      System.out.println("    in bottom half of native foo()");
      
      ExceptionThreadChoiceFromSet cg = ti.getVM().getCurrentChoiceGenerator("FOO_CG", ExceptionThreadChoiceFromSet.class);
      if (cg == null){
        throw new JPFException("wrong CG: " + cg);
      }
        
      String exceptionName = cg.getExceptionForCurrentChoice();
      if (exceptionName != null){
        env.throwException(exceptionName);
      }
    }
  }
}
