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

import gov.nasa.jpf.SystemAttribute;

/**
 * DirectCallStackFrames are only used for overlay calls (from native code), i.e.
 * there is no corresponding INVOKE instruction. The associated MethodInfos are
 * synthetic, their only code is (usually) a INVOKEx and a DIRECTCALLRETURN.
 * NOTE: such MethodInfos do not belong to any class
 * 
 * Arguments for the invoke insn have to be pushed explicitly by the caller
 * 
 * direct calls do not return any values themselves, but they do get the return values of the
 * called method pushed onto their own operand stack. If the DirectCallStackFrame user
 * needs such return values, it has to do so via ThreadInfo.getReturnedDirectCall()
 *
 */
public abstract class DirectCallStackFrame extends StackFrame implements SystemAttribute {
  
  MethodInfo callee;

  protected DirectCallStackFrame (MethodInfo miDirectCall, MethodInfo callee, int maxLocals, int maxStack){
    super( miDirectCall, maxLocals, maxStack);    
    this.callee = callee;
  }
  
  protected DirectCallStackFrame (MethodInfo miDirectCall, MethodInfo callee){
    super( miDirectCall, miDirectCall.getMaxLocals(), miDirectCall.getMaxStack());
    this.callee = callee;
  }
  
  public MethodInfo getCallee (){
    return callee;
  }
  
  @Override
  public String getStackTraceInfo () {
    StringBuilder sb = new StringBuilder(128);
    sb.append('[');
    sb.append( callee.getUniqueName());
    sb.append(']');
    return sb.toString();
  }
  
  public DirectCallStackFrame getPreviousDirectCallStackFrame(){
    StackFrame f = prev;
    while (f != null && !(f instanceof DirectCallStackFrame)){
      f = f.prev;
    }
    
    return (DirectCallStackFrame) f;
  }
  
  public void setFireWall(){
    mi.setFirewall(true);
  }

  @Override
  public boolean isDirectCallFrame () {
    return true;
  }
  
  @Override
  public boolean isSynthetic() {
    return true;
  }
  
  /*
   * those set the callee arguments for the invoke insn - the returned value is the slot index OFFSET (not the slot index
   * itself) for the next argument. This has to be used in a pattern like 
   *   int argOffset = frame.setArgument( 0, firstArg, a0);
   *   argOffset = frame.setLongArgument( argOffset, secondArg, a1);
   *   ...
   */
  
  public abstract int setArgument (int argOffset, int value, Object attr);
  public abstract int setLongArgument (int argOffset, long value, Object attr);
  public abstract int setReferenceArgument (int argOffset, int ref, Object attr);

  public int setFloatArgument (int argOffset, float value, Object attr){
    return setArgument( argOffset, Float.floatToIntBits(value), attr);
  }
  public int setDoubleArgument (int argOffset, double value, Object attr){
    return setLongArgument( argOffset, Double.doubleToLongBits(value), attr);
  }
  
}