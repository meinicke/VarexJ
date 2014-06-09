//
// Copyright  (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
//  (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
//  (NOSA), version 1.3.  The NOSA has been approved by the Open Source
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

package gov.nasa.jpf.util.script;

public abstract class ScriptElement implements Cloneable {
  protected ScriptElement parent;
  protected ScriptElement nextSibling;
  protected int line;

  ScriptElement (ScriptElement parent, int line){
    this.parent = parent;
    this.line = line;
  }

  public ScriptElement getParent() {
    return parent;
  }

  public int getLine() {
    return line;
  }

  public ScriptElement getNextSibling() {
    return nextSibling;
  }

  void setNextSibling(ScriptElement e) {
    nextSibling = e;
  }

  public ScriptElement clone() {
    try {
      return (ScriptElement) super.clone();
    } catch (CloneNotSupportedException cnsx) {
      return null;
    }
  }

  public abstract void process (ElementProcessor proc);
}
