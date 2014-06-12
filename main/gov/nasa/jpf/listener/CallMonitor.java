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
package gov.nasa.jpf.listener;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.InvokeInstruction;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * this isn't yet a useful tool, but it shows how to track method calls with
 * their corresponding argument values
 */
public class CallMonitor extends ListenerAdapter {

  @Override
  public void instructionExecuted (VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
    
    if (executedInsn instanceof InvokeInstruction) {
      if (executedInsn.isCompleted(ti) && !ti.isInstructionSkipped()) {
        InvokeInstruction call = (InvokeInstruction)executedInsn;
        MethodInfo mi = call.getInvokedMethod();
        Object[] args = call.getArgumentValues(ti);
        ClassInfo ci = mi.getClassInfo();

        StringBuilder sb = new StringBuilder();

        sb.append(ti.getId());
        sb.append(": ");

        int d = ti.getStackDepth();
        for (int i=0; i<d; i++){
          sb.append(" ");
        }

        if (ci != null){
          sb.append(ci.getName());
          sb.append('.');
        }
        sb.append(mi.getName());
        sb.append('(');

        int n = args.length-1;
        for (int i=0; i<=n; i++) {
          if (args[i] != null) {
            sb.append(args[i].toString());
          } else {
            sb.append("null");
          }
          if (i<n) {
            sb.append(',');
          }
        }
        sb.append(')');

        System.out.println(sb);
      }
    }
  }
}
