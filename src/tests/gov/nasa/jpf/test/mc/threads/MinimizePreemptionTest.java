//
// Copyright (C) 2011 United States Government as represented by the
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
package gov.nasa.jpf.test.mc.threads;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.ThreadChoiceGenerator;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Verify;

import org.junit.Test;

/**
 * regression test for MinimizePreemption heuristic search
 */
public class MinimizePreemptionTest extends TestJPF {
  
  static final String SEARCH_OPT = "+search.class=.search.heuristic.MinimizePreemption";
  
  public static class A implements Runnable {
    static int d = 0;  // shared field
    
    private final int trip;
    
    public A (int dTrip){
      trip = dTrip;
    }
    
    public void run(){
      int s = 0;
      for (int i=1; i<=5; i++){ // use loop var to make sure there always is a state change
        s = d*10 + i;  // a shared GETSTATIC scheduling point
      }
      
      System.out.println(s);      
      Verify.incrementCounter(0); // number of completions
      
      assert s/10 != trip : "gotcha";
    }
  }
  
  //----------------------------------------------------------------------------
    
  @Test
  public void testNoPreemptions(){
    
    if (!isJPFRun()){
      Verify.resetCounter(0);
    }
    
    if (verifyAssertionError( SEARCH_OPT)){
      A a = new A(0);
      Thread t = new Thread(a);
      t.start();
      
      for (int i=0; i<10; i++){ // use loop var to make sure there always is a state change
        A.d = i; // that's a PUTSTATIC scheduling point per cycle
      } 
    }
    
    if (!isJPFRun()){
      int nRunCompletions = Verify.getCounter(0);
      System.out.printf("number of A(0) run() completions = %d\n", nRunCompletions);
      assertTrue ("preemptions should be <= 2: (t* m+) or (m* t+)", 
              (nRunCompletions <=2));
    }
  }
  
  
  //----------------------------------------------------------------------------
  
  // <2do> not a test yet

  static int maxPreemptions; // just outside JPF
  
  public static class Listener extends ListenerAdapter {

    int getPreemptions (Search search){
      VM vm = search.getVM();
      int n=0;
      ThreadChoiceGenerator cg = vm.getLastChoiceGeneratorOfType(ThreadChoiceGenerator.class);
      
      while (cg != null){
        ThreadChoiceGenerator cgPrev = cg.getPreviousChoiceGeneratorOfType(ThreadChoiceGenerator.class);
        if (cg.isSchedulingPoint()) {
          System.out.println("       " + cg);
          if (cgPrev != null) {
            ThreadInfo ti = cg.getNextChoice();
            ThreadInfo tiPrev = cgPrev.getNextChoice();

            if (tiPrev != ti && cg.contains(tiPrev)) {
              n++;
            }
          }
        }
        
        cg = cgPrev;
      }
      
      return n;
    }
    
    // for the next queued state - preemption count should never decrease
    @Override
    public void stateRestored(Search search){
      int nPreemptions = getPreemptions(search);
      System.out.println("   explore state with " + nPreemptions + " preemptions");
      if (nPreemptions > maxPreemptions){
        maxPreemptions = nPreemptions;
      } else if (nPreemptions < maxPreemptions){
        fail("number of preemptions has to be increasing!");
      }
    }
  }
  
  @Test
  public void testPreemptionCount(){
    String listener = null;
    if (!isJPFRun()){
      Verify.resetCounter(0);
      listener = "+listener=" + Listener.class.getName();
    }
    
    if (verifyAssertionError( SEARCH_OPT, listener)){
      A a = new A(1); // means we need one main cycle
      Thread t = new Thread(a);
      t.start();

      for (int i=1; i<5; i++){
        A.d = i;
      }
    }
    
    if (!isJPFRun()){
      int nRunCompletions = Verify.getCounter(0);
      System.out.printf("completions = %d\n", nRunCompletions);
    }    
  }
}
