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

import gov.nasa.jpf.util.Source;

import java.util.WeakHashMap;

/**
 * this corresponds to an executed instruction. Note that we can have a
 * potentially huge number of Steps, hence we want to save objects here
 * (e.g. Collection overhead)
 */
public class Step {

  private static WeakHashMap<Step, String> s_comments = new WeakHashMap<Step, String>();  // Not every Step gets a comment.  So save memory and put comments in a global comment HashMap.  Make this a WeakHashMap so that old Step objects can be GCed.

  private final Instruction insn;
  Step next;

  public Step (Instruction insn) {
    if (insn == null)
      throw new IllegalArgumentException("insn == null");

    this.insn = insn;
  }

  public Step getNext() {
    return next;
  }

  public Instruction getInstruction() {
    return insn;
  }

  public void setComment (String s) {
    s_comments.put(this, s);
  }

  public String getComment () {
    return s_comments.get(this);
  }

  public String getLineString () {
    MethodInfo mi = insn.getMethodInfo();
    if (mi != null) {
      Source source = Source.getSource(mi.getSourceFileName());
      if (source != null) {
        int line = mi.getLineNumber(insn);
        if (line > 0) {
          return source.getLine(line);
        }
      }
    }

    return null;
  }

  public boolean sameSourceLocation (Step other){
    
    if (other != null){
      MethodInfo mi = insn.getMethodInfo();
      MethodInfo miOther = other.insn.getMethodInfo();
      if (mi == miOther){
        return (mi.getLineNumber(insn) == miOther.getLineNumber(other.insn));
      }
    }
    
    return false;
  }
  
  public String getLocationString() {
    MethodInfo mi = insn.getMethodInfo();
    if (mi != null) {
      return mi.getSourceFileName() + ':' + mi.getLineNumber(insn);
    }

    return "?:?";
  }

  public String toString() {
    return getLocationString();
  }
}
