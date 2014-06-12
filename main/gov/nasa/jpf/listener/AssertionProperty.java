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
package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.jvm.bytecode.ATHROW;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.JPFLogger;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Heap;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

/**
 * this is a property listener that turns thrown AssertionErrors into
 * property violations before they are caught (i.e. potentially
 * change the stack).
 * Besides serving the purpose of eliminating the "catch(Throwable)" case,
 * it can be used in conjunction with "search.multiple_errors=true" to
 * report assertions but otherwise ignore them and go on searching the
 * same path (otherwise, multiple_errors would cause a backtrack)
 */
public class AssertionProperty extends PropertyListenerAdapter {

  static JPFLogger log = JPF.getLogger("gov.nasa.jpf.listener.AssertionProperty");
  
  boolean goOn;
  String msg;
  
  public AssertionProperty (Config config) {
    goOn = config.getBoolean("ap.go_on",false);
  }
  
  @Override
  public boolean check(Search search, VM vm) {
    return (msg == null);
  }

  public String getErrorMessage() {
    return msg;
  }

  protected String getMessage (String details, Instruction insn){
    String s = "failed assertion";
    
    if (details != null){
      s += ": \"";
      s += details;
      s += '"';
    }

    s += " at ";
    s += insn.getSourceLocation();
    
    return s;
  }

  @Override
  public void executeInstruction (VM vm, ThreadInfo ti, Instruction insn){
    
    if (insn instanceof ATHROW) {
      
      Heap heap = vm.getHeap();
      StackFrame frame = ti.getTopFrame();
      int xobjref = frame.peek();
      ElementInfo ei = heap.get(xobjref);
      ClassInfo ci = ei.getClassInfo();
      
      if (ci.getName().equals("java.lang.AssertionError")) {
        int msgref = ei.getReferenceField("detailMessage");
        ElementInfo eiMsg = heap.get(msgref);
        String details = eiMsg != null ? eiMsg.asString() : null;

        // Ok, arm ourselves
        msg = getMessage( details, insn.getNext());
        
        if (goOn) {
          log.warning(msg);

          frame = ti.getModifiableTopFrame();
          frame.pop(); // ensure operand stack integrity (ATHROW pops)
          
          ti.skipInstruction(insn.getNext());

        } else {
          ti.skipInstruction(insn);
          ti.breakTransition("assertion");
        }
      }
    }
  }
  
  @Override
  public void reset() {
    msg = null;
  }
}
