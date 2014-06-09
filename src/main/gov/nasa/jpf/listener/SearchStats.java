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

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.search.heuristic.HeuristicSearch;

import java.io.PrintStream;

/**
 * An alternative to SearchMonitor that just reports statistics at the end.
 */
public class SearchStats extends ListenerAdapter {
  PrintStream out = System.out;
  
  long time;
  long startTime;
  long startFreeMemory;
  
  int searchLevel=0;
  int maxSearchLevel=0;
  
  int newStates;
  int endStates;
  int backtracks;
  int revisitedStates;
  int processedStates;
  int restoredStates;
  
  int steps;

  long maxMemory;
  long totalMemory;
  long freeMemory;
    
  boolean isHeuristic = false;
  int queueSize = 0;
  
  int currentHeapCount = 0;
  int maxHeapCount = 0;
  
  /*
   * SearchListener interface
   */  
  @Override
  public void stateAdvanced(Search search) {
    steps += search.getTransition().getStepCount();
   
    if (isHeuristic)
    	queueSize = ((HeuristicSearch)(search)).getQueueSize();
    
    if (search.isNewState()) {
      searchLevel = search.getDepth();
      if (searchLevel > maxSearchLevel)
      	maxSearchLevel = searchLevel;
      
      newStates++; 
      
      currentHeapCount = search.getVM().getHeap().size();
      
      if (currentHeapCount > maxHeapCount)
        maxHeapCount = currentHeapCount;
      
      if (search.isEndState()) {
        endStates++;
      }
    } else {
      revisitedStates++;
    }
  }

  @Override
  public void stateProcessed(Search search) {
    processedStates++;
  }

  @Override
  public void stateBacktracked(Search search) {
    searchLevel = search.getDepth();
    backtracks++;
  }

  @Override
  public void stateRestored(Search search) {
    searchLevel = search.getDepth();
    restoredStates++;
  }

  @Override
  public void propertyViolated(Search search) {
  }

  @Override
  public void searchStarted(Search search) {
    if (search instanceof HeuristicSearch) {
      isHeuristic = true;
    }
    
    startTime = System.currentTimeMillis();
    
    Runtime rt = Runtime.getRuntime();
    startFreeMemory = rt.freeMemory();
    totalMemory = rt.totalMemory();
    maxMemory = rt.maxMemory();
  }

  @Override
  public void searchConstraintHit(Search search) {
  }

  void reportRuntime () {
    long td = time - startTime;
    
    int h = (int) (td / 3600000);
    int m = (int) (td / 60000) % 60;
    int s = (int) (td / 1000) % 60;
    
    out.print("  abs time:          ");
    if (h < 10) out.print('0');
    out.print( h);
    out.print(':');
    if (m < 10) out.print('0');
    out.print( m);
    out.print(':');
    if (s < 10) out.print('0');
    out.print( s);
    
    out.print( "  (");
    out.print(td);
    out.println(" ms)");
  }
  
  @Override
  public void searchFinished(Search search) {
    report("------ Search statistics: ------");
  }

  void report (String header) {
    time = System.currentTimeMillis();

    out.println(header);

    reportRuntime();
        
    out.println();
    out.print("  search depth:      ");
    out.print(searchLevel);
    out.print(" (max: ");
    out.print(maxSearchLevel);
    out.println(")");
    
    out.print("  new states:        ");
    out.println(newStates);
    
    out.print("  revisited states:  ");
    out.println(revisitedStates);
        
    out.print("  end states:        ");
    out.println(endStates);

    out.print("  backtracks:        ");
    out.println(backtracks);

    out.print("  processed states:  ");
    out.print( processedStates);
    out.print(" (");
    // a little ad-hoc rounding
    double d = (double) backtracks / (double)processedStates;
    int n = (int) d;
    int m = (int) ((d - /*(double)*/ n) * 10.0);
    out.print( n);
    out.print('.');
    out.print(m);
    out.println( " bt/proc state)");
    
    out.print("  restored states:   ");
    out.println(restoredStates);

    if (isHeuristic) {
    	out.print("  queue size:        ");
    	out.println(queueSize);
    }
    
    out.println();
    out.print("  total memory [kB]: ");
    out.print(totalMemory / 1024);
    out.print(" (max: ");
    out.print(maxMemory / 1024);
    out.println(")");
    
    out.print("  free memory [kB]:  ");
    out.println(freeMemory / 1024);
    
    out.print("  max heap objects:  ");
    out.print(maxHeapCount);

    out.println();
  }
}
