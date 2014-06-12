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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.JPF;

import java.util.logging.Logger;

/**
 * class encapsulating the lock protection status for field access
 * instructions. Used by on-the-fly partial order reduction in FieldInstruction
 * to determine if a GET/PUT_FIELD/STATIC insn has to be treated as a
 * boundary step (terminates a transition). If the field access is always
 * protected by a lock, only the corresponding sync (INVOKExx or MONITORENTER)
 * are boundary steps, thus the number of states can be significantly reduced.
 * 
 * FieldLockInfos are only used if vm.por.sync_detection is set
 * 
 * NOTE this might involve assumptions that can be violated in subsequent
 * paths, and might cause potential races to go undetected
 */
public abstract class FieldLockInfo implements Cloneable  {
  
  static Logger log = JPF.getLogger("gov.nasa.jpf.vm.FieldLockInfo");
  
  static protected final FieldLockInfo empty = new EmptyFieldLockInfo();
    
  ThreadInfo tiLastCheck; // the thread this FieldLockInfo was last checked for

  
  public abstract FieldLockInfo checkProtection (ThreadInfo ti, ElementInfo ei, FieldInfo fi);
  public abstract boolean isProtected ();
  
  public abstract FieldLockInfo cleanUp (Heap heap);
  protected abstract int[] getCandidateLockSet();
    
  public boolean isFinal() {
    return isProtected();
  }
  
  public boolean needsPindown (ElementInfo ei) {
    return false;
  }
  
  
  /*
   * we need this for faster instantiation. Make sure it gets overridden in
   * case there is a need for per-instance parameterization
   */
  public Object clone () throws CloneNotSupportedException {
    return super.clone();
  }

  void lockAssumptionFailed (ThreadInfo ti, ElementInfo ei, FieldInfo fi) {
    String src = ti.getTopFrameMethodInfo().getClassInfo().getSourceFileName();
    int line = ti.getLine();

    StringBuilder sb = new StringBuilder( "unprotected field access of: ");
    sb.append(ei);
    sb.append('.');
    sb.append(fi.getName());
    sb.append( " in thread: ");
    sb.append( ti.getName());
    sb.append( " (");
    sb.append( src);
    sb.append(':');
    sb.append(line);
    sb.append(")\n[SEVERE].. last lock candidates: ");
    appendLockSet(sb, getCandidateLockSet());
    if (tiLastCheck != null) {
      sb.append(" set by ");
      sb.append(tiLastCheck);
    }
    sb.append( "\n[SEVERE].. current locks: ");
    appendLockSet(sb, ti.getLockedObjectReferences());
    sb.append("\n[SEVERE].. if this is not a race, re-run with 'vm.por.sync_detection=false' or exclude field from checks");

    log.severe(sb.toString());
  }

  void appendLockSet (StringBuilder sb, int[] lockSet) {
    Heap heap = VM.getVM().getHeap();

    if ((lockSet == null) || (lockSet.length == 0)) {
      sb.append( "{}");
    } else {
      sb.append('{');
      for (int i=0; i<lockSet.length;) {
        int ref = lockSet[i];
        if (ref != MJIEnv.NULL) {
          ElementInfo ei = heap.get(ref);
          if (ei != null) {
            sb.append(ei);
          } else {
            sb.append("?@");
            sb.append(lockSet[i]);
          }
        }
        i++;
        if (i<lockSet.length) sb.append(',');
      }
      sb.append('}');
    }
  }

}

/**
 * FieldLockSet implementation for fields that are terminally considered to be unprotected
 */
class EmptyFieldLockInfo extends FieldLockInfo {
  
  public FieldLockInfo checkProtection (ThreadInfo ti, ElementInfo ei, FieldInfo fi) {
    return this;
  }
      
  public FieldLockInfo cleanUp (Heap heap) {
    return this;
  }
  
  public boolean isProtected () {
    return false;
  }
    
  public boolean isFinal() {
    return true;
  }
  
  protected int[] getCandidateLockSet() {
    return new int[0];
  }
  
  public String toString() {
    return "EmptyFieldLockInfo";
  }
}

