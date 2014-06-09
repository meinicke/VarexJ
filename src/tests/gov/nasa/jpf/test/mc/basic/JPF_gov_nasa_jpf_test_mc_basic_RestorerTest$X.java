//
// Copyright (C) 2012 United States Government as represented by the
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
package gov.nasa.jpf.test.mc.basic;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.ClosedMemento;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.SystemState;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * peer for the regression test for on-demand state restoration by means of
 * ClosedMementos
 */
public class JPF_gov_nasa_jpf_test_mc_basic_RestorerTest$X extends NativePeer {

  static class InsnExecCount {
    int count;    
  }
  
  static class InsnCountRestorer implements ClosedMemento {
    InsnExecCount insnAttr;
    int count; // the value to restore
    
    InsnCountRestorer (InsnExecCount insnAttr){
      this.insnAttr = insnAttr;
      this.count = insnAttr.count;
      
      System.out.println("## storing: " + count);
    }
    
    public void restore(){
      System.out.println("## restoring: " + count);
      insnAttr.count = count;
    }
  }

  @MJI
  public void $init (MJIEnv env, int objref){
    ThreadInfo ti = env.getThreadInfo();
    StackFrame caller = ti.getCallerStackFrame();
    Instruction insn = caller.getPC();
        
    InsnExecCount a = insn.getAttr(InsnExecCount.class);
    if (a == null){
      a = new InsnExecCount();
      insn.addAttr( a);
    }

    SystemState ss = env.getSystemState();
    if (!ss.hasRestorer(a)){
      env.getSystemState().putRestorer( a, new InsnCountRestorer(a));      
    }
    
    a.count++;
    env.setIntField(objref, "id", a.count);
  }
}
