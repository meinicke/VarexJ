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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.GenericProperty;
import gov.nasa.jpf.search.Search;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * property class to check for no-runnable-threads conditions
 */
public class NotDeadlockedProperty extends GenericProperty {
  Search search;
  ThreadInfo tiAtomic;
  
  public NotDeadlockedProperty (Config conf, Search search) {
    this.search = search; 
  }
  
  public String getErrorMessage () {
    VM vm = search.getVM();
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);

    if (tiAtomic != null){
      pw.println("blocked in atomic section:");
    } else {
      pw.println("deadlock encountered:");
    }
    
    ThreadInfo[] liveThreads = vm.getLiveThreads();
    for (ThreadInfo ti : liveThreads) {
      pw.print("  ");
      if (ti == tiAtomic){
        pw.print("ATOMIC ");
      }
      pw.println(ti.getStateDescription());
    }
    
    return sw.toString();
  }

  @Override
  public boolean check (Search search, VM vm) {
    if (vm.isDeadlocked()){
      if (vm.isAtomic()){
        tiAtomic = vm.getCurrentThread();
      }
      return false;
    } else {
      return true;
    }
  }

  @Override
  public void reset() {
    tiAtomic = null;
  }
}
