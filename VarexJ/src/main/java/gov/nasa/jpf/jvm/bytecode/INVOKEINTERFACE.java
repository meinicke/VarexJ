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
package gov.nasa.jpf.jvm.bytecode;


/**
 * Invoke interface method
 * ..., objectref, [arg1, [arg2 ...]] => ...
 */
public class INVOKEINTERFACE extends VirtualInvocation {
  public INVOKEINTERFACE () {}

  protected INVOKEINTERFACE (String clsDescriptor, String methodName, String signature){
    super(clsDescriptor, methodName, signature);
  }


  public int getLength() {
    return 5; // opcode, index1, index2, nargs, 0
  }
  
  public int getByteCode () {
    return 0xB9;
  }

  public String toString() {
    // methodInfo not set outside real call context (requires target object)
    return super.toString() + " " + cname + '.' + mname;
  }

}
