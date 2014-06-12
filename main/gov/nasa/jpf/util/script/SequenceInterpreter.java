//
// Copyright  (C) 2008 United States Government as represented by the
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

import gov.nasa.jpf.util.script.ScriptElementContainer.SECIterator;

import java.io.StringReader;

/**
 * an interpreter that walks a ScriptElementContainer hierarchy, returning
 * Events and Alternatives while expanding loops
 */
public class SequenceInterpreter implements Cloneable {

  ScriptElementContainer.SECIterator top;

  public SequenceInterpreter (ScriptElementContainer seq) {
    top = seq.iterator();
  }

  void push (SECIterator it) {
    it.prev = top;
    top = it;
  }

  SECIterator pop () {
    if (top != null) {
      top = top.getPrev();
    }
    return top;
  }

  public ScriptElement getNext() {
    if (top != null) {
      ScriptElement e = top.next();
      if (e != null) {
        if ((e instanceof ScriptElementContainer) && !(e instanceof Alternative) ) {
          push( ((ScriptElementContainer)e).iterator());
          return getNext();
        } else {
          return e;
        }
      } else {
        pop();
        return (top != null) ? getNext() : null;
      }
    } else {
      return null;
    }
  }

  public Object clone() {
    // has to deep copy all iterators

    try {
      SequenceInterpreter si = (SequenceInterpreter) super.clone();
      if (top != null) {
        si.top = (SECIterator)top.clone();
      }
      return si;
    } catch (CloneNotSupportedException nonsense) {
      return null; // we are a Cloneable, so we don't get here
    }
  }

  public boolean isDone() {
    return (top == null);
  }

  //---- test driver
  public static void main (String[] args) {
    //String s = "";
    //String s = "a; b; c ";
    //String s = "REPEAT 2 { e1, REPEAT 1 { r1, r2 }, e2 }";
    //String s = "x, ANY {a1,a2}, y";
    String s = "REPEAT 2 { start, ANY {a1,a2}, REPEAT 2 {r}, end }";


    StringReader r = new StringReader(s);

    try {
      ESParser parser = new ESParser("test", r);
      Script script = parser.parse();

      SequenceInterpreter si = new SequenceInterpreter(script);

      for (ScriptElement e = si.getNext(); e != null; e = si.getNext()) {
        System.out.println(e);
      }

    } catch (Throwable t){
      t.printStackTrace();
    }
  }
}
