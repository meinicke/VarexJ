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

import gov.nasa.jpf.JPFException;


/**
 * @author flerda
 *
 * <2do> Check usage! If this is used to intercept AIOBX in the target app,
 * this is a BAD example of using exceptions for general control flow.
 * If this is used for internal AIOBX then it should be just a JPFException
 */
@SuppressWarnings("serial")
public class ArrayIndexOutOfBoundsExecutiveException extends JPFException {
  private Instruction i;

  public ArrayIndexOutOfBoundsExecutiveException (Instruction i) {
    super("array index out of bounds");
    this.i = i;
  }

  public ArrayIndexOutOfBoundsExecutiveException (Instruction i, String msg) {
    super(msg);
    this.i = i;
  }

  public Instruction getInstruction () {
    return i;
  }
}
