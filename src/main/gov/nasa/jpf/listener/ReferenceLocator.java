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
package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.InstanceFieldInstruction;
import gov.nasa.jpf.jvm.bytecode.InstanceInvocation;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * tiny utility listener that can be used to find out where a certain
 * object (specified by reference) gets allocated or accessed (call or field),
 * and when it gets gc'ed
 */
public class ReferenceLocator extends ListenerAdapter {
  
  PrintWriter pw;
  int[] createRefs;
  int[] releaseRefs;
  int[] useRefs;
  
  public ReferenceLocator (Config conf){
    createRefs = sort( conf.getIntArray("refloc.create"));
    releaseRefs = sort( conf.getIntArray("refloc.release"));
    useRefs = sort( conf.getIntArray("refloc.use"));
    
    // <2do> we might want to configure output destination
    pw = new PrintWriter(System.out, true);
  }
  
  protected int[] sort(int[] a){
    if (a != null){
      Arrays.sort(a);
    }
    return a;
  }
  
  protected void printLocation(String msg, ThreadInfo ti){
    pw.println(msg);
    for (StackFrame frame : ti) {
      pw.print("\tat ");
      pw.println(frame.getStackTraceInfo());
    }

    pw.println();
  }
  
  @Override
  public void objectCreated (VM vm, ThreadInfo ti, ElementInfo ei){
    int ref = ei.getObjectRef();
    
    if (createRefs != null && Arrays.binarySearch(createRefs, ref) >= 0){    
      printLocation("[ReferenceLocator] object " + ei + " created at:", ti);
    } 
  }
  
  @Override
  public void objectReleased (VM vm, ThreadInfo ti, ElementInfo ei){
    int ref = ei.getObjectRef();
    
    if (releaseRefs != null && Arrays.binarySearch(releaseRefs, ref) >= 0){
      pw.println("[ReferenceLocator] object " + ei + " released");
    }
  }
  
  @Override
  public void instructionExecuted (VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn){
    
    if (useRefs != null){
      if (executedInsn instanceof InstanceInvocation) {
        int ref = ((InstanceInvocation)executedInsn).getCalleeThis(ti);
        if (Arrays.binarySearch(useRefs, ref) >= 0){
          printLocation("[ReferenceLocator] call on object " + ti.getElementInfo(ref) + " at:", ti);
        }
      } else if (executedInsn instanceof InstanceFieldInstruction){
        int ref = ((InstanceFieldInstruction)executedInsn).getLastThis();
        if (Arrays.binarySearch(useRefs, ref) >= 0){
          printLocation("[ReferenceLocator] field access of " + ti.getElementInfo(ref) + " at:", ti);          
        }
      }
    }
  }
}
