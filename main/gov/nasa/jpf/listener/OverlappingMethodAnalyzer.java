//
// Copyright (C) 2010 United States Government as represented by the
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
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * this is a specialized MethodAnalyzer that looks for overlapping method
 * calls on the same object from different threads.
 */
public class OverlappingMethodAnalyzer extends MethodAnalyzer {

  public OverlappingMethodAnalyzer (Config config, JPF jpf){
    super(config,jpf);
  }

  MethodOp getReturnOp (MethodOp op, boolean withinSameThread){
    MethodInfo mi = op.mi;
    int stateId = op.stateId;
    int stackDepth = op.stackDepth;
    ElementInfo ei = op.ei;
    ThreadInfo ti = op.ti;

    for (MethodOp o = op.p; o != null; o = o.p){
      if (withinSameThread && o.ti != ti){
        break;
      }

      if ((o.mi == mi) && (o.ti == ti) && (o.stackDepth == stackDepth) && (o.ei == ei)){
        return o;
      }
    }

    return null;
  }

  // check if there is an open exec from another thread for the same ElementInfo
  boolean isOpenExec (HashMap<ThreadInfo,Deque<MethodOp>> openExecs, MethodOp op){
    ThreadInfo ti = op.ti;
    ElementInfo ei = op.ei;

    for (Map.Entry<ThreadInfo, Deque<MethodOp>> e : openExecs.entrySet()) {
      if (e.getKey() != ti) {
        Deque<MethodOp> s = e.getValue();
        for (Iterator<MethodOp> it = s.descendingIterator(); it.hasNext();) {
          MethodOp o = it.next();
          if (o.ei == ei) {
            return true;
          }
        }
      }
    }

    return false;
  }

  // clean up (if necessary) - both RETURNS and exceptions
  void cleanUpOpenExec (HashMap<ThreadInfo,Deque<MethodOp>> openExecs, MethodOp op){
    ThreadInfo ti = op.ti;
    int stackDepth = op.stackDepth;

    Deque<MethodOp> stack = openExecs.get(ti);
    if (stack != null && !stack.isEmpty()) {
      for (MethodOp o = stack.peek(); o != null && o.stackDepth >= stackDepth; o = stack.peek()) {
        stack.pop();
      }
    }
  }

  void addOpenExec (HashMap<ThreadInfo,Deque<MethodOp>> openExecs, MethodOp op){
    ThreadInfo ti = op.ti;
    Deque<MethodOp> stack = openExecs.get(ti);

    if (stack == null){
      stack = new ArrayDeque<MethodOp>();
      stack.push(op);
      openExecs.put(ti, stack);

    } else {
      stack.push(op);
    }
  }

  void printOn (PrintWriter pw) {
    MethodOp start = firstOp;

    HashMap<ThreadInfo,Deque<MethodOp>> openExecs = new HashMap<ThreadInfo,Deque<MethodOp>>();

    int lastStateId  = Integer.MIN_VALUE;
    int transition = skipInit ? 1 : 0;
    int lastTid = start.ti.getId();

    for (MethodOp op = start; op != null; op = op.p) {

      if (showTransition) {
        if (op.stateId != lastStateId) {
          lastStateId = op.stateId;
          pw.print("------------------------------------------ #");
          pw.println(transition++);
        }
      } else {
        int tid = op.ti.getId();
        if (tid != lastTid) {
          lastTid = tid;
          pw.println("------------------------------------------");
        }
      }

      cleanUpOpenExec(openExecs, op);

      if (op.isMethodEnter()) {  // EXEC or CALL_EXEC
        MethodOp retOp = getReturnOp(op, true);
        if (retOp != null) { // completed, skip
          if (!isOpenExec(openExecs, op)) {
            op = retOp;
            continue;
          }
        } else { // this is an open method exec, record it
          addOpenExec(openExecs, op);
        }
      }

      op = consolidateOp(op);

      op.printOn(pw, this);
      pw.println();
    }
  }

  MethodOp consolidateOp (MethodOp op){
    for (MethodOp o = op.p; o != null; o = o.p){
      if (showTransition && (o.stateId != op.stateId)){
        break;
      }
      if (o.isSameMethod(op)){
        switch (o.type) {
          case RETURN:
            switch (op.type){
              case CALL_EXECUTE:
                op = o.clone(OpType.CALL_EXEC_RETURN); break;
              case EXECUTE:
                op = o.clone(OpType.EXEC_RETURN); break;
            }
            break;
          case EXEC_RETURN:
            switch (op.type){
              case CALL:
                op = o.clone(OpType.CALL_EXEC_RETURN); break;
            }
            break;
          case CALL_EXECUTE:  // simple loop
            switch (op.type){
              case CALL_EXEC_RETURN:
                op = o;
            }
            break;
        }
      } else {
        break;
      }
    }

    return op;
  }
}
