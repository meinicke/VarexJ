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
 * property class to check for uncaught exceptions
 */
public class NoUncaughtExceptionsProperty extends GenericProperty {
  
  ExceptionInfo uncaughtXi;
  
  public NoUncaughtExceptionsProperty (Config config) {
    uncaughtXi = null;
  }
  
  void setExceptionInfo (ExceptionInfo xi){
    uncaughtXi = xi;
  }
  
  public ExceptionInfo getUncaughtExceptionInfo() {
	  return uncaughtXi;
  }
  
  public String getExplanation () {
    // that's pretty self explaining, isn't it?
    return null;
    //return "no uncaught exception";
  }

  public String getErrorMessage () {
    if (uncaughtXi != null) {
      StringWriter sw = new StringWriter();
      uncaughtXi.printOn(new PrintWriter(sw));
      return sw.toString();
    }
    
    return null;
  }
  
  public void reset() {
    uncaughtXi = null;
  }
  
  public boolean check (Search search, VM vm) {
    uncaughtXi = vm.getPendingException();
    return (uncaughtXi == null);
  }

}
