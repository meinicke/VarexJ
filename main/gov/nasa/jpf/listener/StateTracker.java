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
package gov.nasa.jpf.listener;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;

import java.io.PrintWriter;

/**
 * simple tool to log state changes
 */
public class StateTracker extends ListenerAdapter {

  private final PrintWriter out;
  private final int logPeriod;
  volatile private String operation;
  volatile private String detail;
  volatile private int depth;
  volatile private int id;

  public StateTracker (Config conf, JPF jpf) {
    out = new PrintWriter(System.out, true);
    logPeriod = conf.getInt("jpf.state_tracker.log_period", 0);
    Runnable task = new Runnable() {public void run() {logger();}};
    Thread thread = new Thread(task);
    thread.setDaemon(true);
    thread.setName("StateTracker Logger");
    thread.start();
  }

  private void logger() {
    StringBuilder buffer = new StringBuilder();

    buffer.append("----------------------------------- [");
    int len = buffer.length();

    while (true) {
      try {
        Thread.sleep(logPeriod);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      buffer.append(depth);
      buffer.append(']');
      buffer.append(operation);
      buffer.append(": ");
      buffer.append(id);

      if (detail != null) {
        buffer.append(' ');
        buffer.append(detail);
      }

      out.println(buffer.toString());

      buffer.setLength(len);
    }
  }

  @Override
  public void stateRestored(Search search) {
    id = search.getStateId();
    depth = search.getDepth();
    operation = "restored";
    detail = null;
  }

  //--- the ones we are interested in
  @Override
  public void searchStarted(Search search) {
    out.println("----------------------------------- search started");
  }

  @Override
  public void stateAdvanced(Search search) {
    id = search.getStateId();
    depth = search.getDepth();
    operation = "forward";
    if (search.isNewState()) {
      detail = "new";
    } else {
      detail = "visited";
    }

    if (search.isEndState()) {
      detail += " end";
    }
  }

  @Override
  public void stateBacktracked(Search search) {
    id = search.getStateId();
    depth = search.getDepth();
    operation = "backtrack";
    detail = null;
  }

  @Override
  public void searchFinished(Search search) {
    out.println("----------------------------------- search finished");
  }

}
