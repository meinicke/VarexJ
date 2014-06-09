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
package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.SystemState;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * If there is a cycle in the states of the program, JPF doesn't execute the
 * already visited states.  A cycle in the states may represent the ability for
 * the program to hang.  This property finds and outputs cycles in the states
 * so that they may be investigated.
 *
 * The following might need to be added to listener property...
 *   gov.nasa.jpf.tools.SimpleIdleFilter
 *   gov.nasa.jpf.tools.IdleFilter
 */

public class NoStateCycles extends PropertyListenerAdapter {

  private final HashSet<Integer>   m_inStack = new HashSet<Integer>();
  private final ArrayList<Integer> m_stack   = new ArrayList<Integer>();

  private int m_cycleFound = -1;
  private int m_stackPos   = -1;

  public NoStateCycles(Config config) {
    if (!config.getString("search.class").equals("gov.nasa.jpf.search.DFSearch"))
      config.throwException("search.class must be gov.nasa.jpf.search.DFSearch");   // Or any class which does a depth first search.
  }

  @Override
   public void stateAdvanced(Search search) {
     SystemState state;
     Integer id;

     state = search.getVM().getSystemState();
     if (state.isInitState())
       return;

     id = state.getId();

     if ((m_stackPos < 0) && (m_inStack.contains(id))) {
       m_cycleFound = id;

       for (m_stackPos = m_stack.size() - 1; m_stackPos >= 0; m_stackPos--)
         if (m_stack.get(m_stackPos).equals(id))
           break;
     }

     m_stack.add(id);
     m_inStack.add(id);
   }

  @Override
   public void stateBacktracked(Search search) {
     Integer id;
     int pos;

     pos = m_stack.size() - 1;
     id  = m_stack.remove(pos);
     m_inStack.remove(id);

     if (m_stackPos >= pos)
       m_stackPos = -1;
   }

  @Override
   public boolean check(Search search, VM vm) {
     return(m_cycleFound < 0);
   }

   @Override
   public void reset () {
     m_cycleFound = -1;
   }

   public String getErrorMessage () {
     StringBuilder result;
     int i, id;

     result = new StringBuilder();
     result.append("States:\n");

     for (i = m_stack.size() - 1; i >= 0; i--) {
       id = m_stack.get(i);

       result.append("  ");
       result.append(id);
       result.append('\n');

       if (id == m_cycleFound)
         break;
     }

     return(result.toString());
   }

   public String getExplanation () {
     return("Finds cycles in states.  A cycle suggests that the program might be able to hang.");
   }
}
