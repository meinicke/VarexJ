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

package gov.nasa.jpf.util;

/**
 * encapsulates a listener-managed trace operation
 */
public class TraceElement<T> {
  T op;
  
  int stateId;
  TraceElement<T> prevElement;
  TraceElement<T> prevTransition;
  
  public TraceElement (T op){
    this.op = op;
  }
  
  public TraceElement<T> getPrevElement() {
    return prevElement;
  }
  
  public T getOp() {
    return op;
  }
  
  public TraceElement<T> clone() {
    TraceElement<T> e = new TraceElement<T>(op);
    e.stateId = stateId;
    
    // we don't clone the linkage
    e.prevElement = null;
    e.prevTransition = null;
    
    return e;
  }
}
