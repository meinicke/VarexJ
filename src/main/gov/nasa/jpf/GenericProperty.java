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
package gov.nasa.jpf;

import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.VM;

import java.io.PrintWriter;

/**
 * generic abstract base class implementing program properties. This is mostly
 * a convenience construct that implements error printout, so that only
 * the check itself has to be provided
 * 
 * <2do> why is this still not an interface ??
 */
public abstract class GenericProperty implements Property, Cloneable {
  public abstract boolean check (Search search, VM vm);

  protected GenericProperty () {
    // nothing yet
  }
  
  public Property clone() throws CloneNotSupportedException {
    return (Property) super.clone();
  }
  
  public String getErrorMessage () {
    return null;
  }

  public String getExplanation () {
    return null;
  }
  
  public void reset () {
    // nothing to do here, but Property implementors that store
    // stuff have to override (it's called if search.multiple_errors is on)
  }
  
  public void printOn (PrintWriter pw) {
    pw.println(getErrorMessage());
  }
}
