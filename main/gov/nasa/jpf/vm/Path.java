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

import gov.nasa.jpf.util.Printable;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * Path represents the data structure in which a execution trace is recorded.
 */
public class Path implements Printable, Iterable<Transition>, Cloneable {
  String             application;  
  private LinkedList<Transition> stack;
  
  private Path() {} // for cloning
  
  public Path (String app) {
    application = app;
    stack = new LinkedList<Transition>();
  }
  
  public Path clone() {
    Path clone = new Path();
    clone.application = application;
    
    // we need to deep copy the stack to preserve CG and ThreadInfo state
    LinkedList<Transition> clonedStack = new LinkedList<Transition>();
    for (Transition t : stack){
      clonedStack.add( (Transition)t.clone());
    }
    clone.stack = clonedStack;
    
    return clone;
  }
  
  public String getApplication () {
    return application;
  }

  public Transition getLast () {
    if (stack.isEmpty()) {
      return null;
    } else {
      return stack.getLast();
    }
  }

  public void add (Transition t) {
    stack.add(t);
  }

  public Transition get (int pos) {
    return stack.get(pos);
  }

  public boolean isEmpty() {
    return (stack.size() == 0);
  }
  
  public int size () {
    return stack.size();
  }

  public boolean hasOutput () {
    for (Transition t : stack) {
      if (t.getOutput() != null) {
        return true;
      }
    }
    
    return false;
  }
  
  public void printOutputOn (PrintWriter pw) {
    for (Transition t : stack) {
      String output = t.getOutput();
      if (t != null) {
        pw.print(output);
      }
    }
  }
  
  public void printOn (PrintWriter pw) {
/**** <2do> this is going away
    int    length = size;
    Transition entry;

    for (int index = 0; index < length; index++) {
      pw.print("Transition #");
      pw.print(index);
      
      if ((entry = get(index)) != null) {
        pw.print(' ');

        entry.printOn(pw);
      }
    }
***/
  }

  public void removeLast () {
    stack.removeLast();
  }
  
  public Iterator<Transition> iterator () {
    return stack.iterator();
  }
  
  public Iterator<Transition> descendingIterator() {
    return stack.descendingIterator();
  }
}
