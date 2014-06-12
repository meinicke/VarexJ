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

/**
 * Stores the information about an exception handler.
 */
public class ExceptionHandler {
  /**
   * Name of the exception caught. If it is 'null', this means this is an 'any' handler
   */
  private String name;

  /**
   * The first instruction belonging to this handler.
   */
  private int begin;

  /**
   * The last instruction belonging to this handler.
   */
  private int end;

  /**
   * The offset of the handler.
   */
  private int handler;

  /**
   * Creates a new exception handler.
   */
  public ExceptionHandler (String n, int b, int e, int h) {
    name = n;
    begin = b;
    end = e;
    handler = h;
  }

  /**
   * Returns the first instruction in the block.
   */
  public int getBegin () {
    return begin;
  }

  /**
   * Returns the last instruction in the block.
   */
  public int getEnd () {
    return end;
  }

  /**
   * Returns the instruction location for the handler.
   */
  public int getHandler () {
    return handler;
  }

  /**
   * Returns the name of the exception caught.
   */
  public String getName () {
    return name;
  }


  public String toString() {
    return "Handler [name="+name+",from="+begin+",to="+end+",target="+handler+"]";
  }
}
