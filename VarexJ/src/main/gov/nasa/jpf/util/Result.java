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
package gov.nasa.jpf.util;

/**
 * simple result wrapper that can store a boolean value and a String, to
 * be used as method return value if we have to keep exceptions in the callee
 */
public class Result {
  
  public static final Result OK = new Result();
  
  // final so that we don't need getters
  public final String error;
  
  // if you need a positive result, use OK
  private Result (){
    error = null;
  }
  
  private Result (String errorMsg){
    error = errorMsg;
  }
  
  public boolean equals(Object o){
    // we only compare if there was an error, not which one
    if (o instanceof Boolean){
      return (error == null) == (Boolean)o;
    } else if (o instanceof Result){
      return (error == null) == (((Result)o).error == null);
    }
    return false;
  }

  public static Result failure (String errorMsg){
    return new Result(errorMsg);
  }
}
