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

import gov.nasa.jpf.vm.Path;
import gov.nasa.jpf.vm.ThreadList;

/**
 * class used to store property violations (property and path)
 */
public class Error {

  int            id;
  
  Property       property;
  private String errorMessage;
  
  private Path   path;
  ThreadList     threadList;
  
  public Error (int id, Property prop, Path p, ThreadList l) {
    this.id = id;
    property = prop;
    errorMessage = prop.getErrorMessage();    
    path = p; // client has to clone in case we go on
    threadList = l;
  }

  public int getId() {
    return id;
  }
  
  public String getDescription () {
    StringBuilder sb = new StringBuilder();
    sb.append(property.getClass().getName());
    
    String s = property.getExplanation();
    if (s != null) {
      sb.append(" (\"");
      sb.append(s);
      sb.append("\")");
    }
    
    return sb.toString();
  }

  public String getDetails() {
    return errorMessage;
  }
  
  public Path getPath () {
    return path;
  }

  public Property getProperty () {
    return property;
  }
}
