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


public class Repetition extends ScriptElementContainer {
  int repeatCount;

  class RepetitionIterator extends ScriptElementContainer.SECIterator {

    int count;

    RepetitionIterator () {
      count = 0;
      cur = firstChild;
    }

    public boolean hasNext() {
      return ((cur != null) || (count<repeatCount) || (repeatCount < 0));
    }

    public ScriptElement next() {
      if (cur != null) {
        ScriptElement ret = cur;
        cur = cur.nextSibling;
        return ret;
      } else {
        if ((++count < repeatCount) || (repeatCount < 0) ) {
          ScriptElement ret = firstChild;
          cur = ret.nextSibling;
          return ret;
        } else {
          return null;
        }
      }
    }

    public void remove() {
      throw new UnsupportedOperationException("no ScriptElement removal supported");
    }
  }


  public Repetition (ScriptElement parent, int n, int line) {
    super(parent, line);
    repeatCount = n;
  }

  public SECIterator iterator() {
    return new RepetitionIterator();
  }

  public String toString() {
    return toString("REPEAT " + repeatCount );
  }

  public int getRepeatCount() {
    return repeatCount;
  }

  public void process (ElementProcessor p) {
    p.process(this);
  }
}
