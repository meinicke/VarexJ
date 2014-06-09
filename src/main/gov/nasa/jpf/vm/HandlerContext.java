//
// Copyright (C) 2013 United States Government as represented by the
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

/**
 * utility wrapper for exception handlers that /would/ handle
 * a given exception type
 * 
 * <2do> This should be a class hierarchy to properly distinguish between
 * ordinary catch handlers and UncaughtHandler objects, but so far
 * this isn't worth it
 */
public class HandlerContext {
  public enum UncaughtHandlerType { INSTANCE, GROUP, GLOBAL } 
  
  ThreadInfo ti;
  ClassInfo ciException;
  
  StackFrame frame;
  ExceptionHandler handler;
  // - or -
  int uncaughtHandlerRef;
  UncaughtHandlerType uncaughtHandlerType;

  HandlerContext (ThreadInfo ti, ClassInfo ciException, StackFrame frame, ExceptionHandler handler) {
    this.ti = ti;
    this.ciException = ciException;
    this.frame = frame;
    this.handler = handler;
  }
  
  HandlerContext (ThreadInfo ti, ClassInfo ciException, UncaughtHandlerType uncaughtHandlerType, int uncaughtHandlerRef){
    this.ti = ti;
    this.ciException = ciException;
    this.uncaughtHandlerType = uncaughtHandlerType;
    this.uncaughtHandlerRef = uncaughtHandlerRef;
  }

  public ThreadInfo getThreadInfo(){
    return ti;
  }
  
  public StackFrame getFrame () {
    return frame;
  }

  public ExceptionHandler getHandler () {
    return handler;
  }

  public boolean isUncaughtHandler(){
    return uncaughtHandlerType != null;
  }
  
  public UncaughtHandlerType getUncaughtHandlerType(){
    return uncaughtHandlerType;
  }
  
  public int getUncaughtHandlerRef(){
    return uncaughtHandlerRef;
  }
}
