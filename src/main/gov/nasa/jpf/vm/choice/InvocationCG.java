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

package gov.nasa.jpf.vm.choice;

import gov.nasa.jpf.util.Invocation;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ChoiceGeneratorBase;

import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

/**
 * ChoiceGenerator that represents method calls
 */
public class InvocationCG extends ChoiceGeneratorBase<Invocation> {

  protected List<Invocation> invokes;
  protected Invocation cur;
  protected ListIterator<Invocation> it;
  
  public InvocationCG (String id, List<Invocation> invokes){
    super(id);
    
    this.invokes = invokes;
    
    it = invokes.listIterator();
  }
  
  @Override
  public void advance () {
    cur = it.next();
  }

  @Override
  public Class<Invocation> getChoiceType () {
    return Invocation.class;
  }

  @Override
  public Invocation getNextChoice () {
    return cur;
  }

  @Override
  public int getProcessedNumberOfChoices () {
    return it.nextIndex();
  }

  @Override
  public int getTotalNumberOfChoices () {
    return invokes.size();
  }

  @Override
  public boolean hasMoreChoices () {
    return it.hasNext();
  }

  @Override
  public ChoiceGenerator<Invocation> randomize () {
    // <2do>
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder(getClass().getName());
    sb.append(" [");
    int n = invokes.size();
    for (int i=0; i<n; i++) {
      if (i > 0) sb.append(',');
      Invocation inv = invokes.get(i);
      if (inv == cur) {
        sb.append(MARKER);
      }
      sb.append(inv);
    }
    sb.append(']');
    return sb.toString();
  }
  
  public void printOn (PrintWriter pw) {
    pw.print(toString());
  }
  
  @Override
  public void reset () {
    cur = null;
    it = invokes.listIterator();

    isDone = false;
  }

}
