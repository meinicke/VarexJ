//
// Copyright (C) 2010 United States Government as represented by the
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

import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativeMethodInfo;
import gov.nasa.jpf.vm.ThreadInfo;

import java.lang.reflect.Method;

import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * this is a synthetic instruction to (re-)execute native methods
 *
 * Note that StackFrame and lock handling has to occur from within
 * the corresponding NativeMethodInfo
 */
public class EXECUTENATIVE extends JVMInstruction {

  // unfortunately we can't null this in cleanupTransients(), but it is
  // a potential leak for stored traces
  protected NativeMethodInfo executedMethod;

  public boolean isExtendedInstruction() {
    return true;
  }

  public static final int OPCODE = 259;

  public int getByteCode () {
    return OPCODE;
  }

  public EXECUTENATIVE (){}

  public EXECUTENATIVE (NativeMethodInfo mi){
    executedMethod = mi;
  }

  public void setExecutedMethod (NativeMethodInfo mi){
    executedMethod = mi;
  }

  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }

  public Conditional<Instruction> execute (FeatureExpr ctx,ThreadInfo ti) {

    // we don't have to enter/leave or push/pop a frame, that's all done
    // in NativeMethodInfo.execute()
    // !! don't re-enter if this is reexecuted !!
    return new One<>(executedMethod.executeNative(ti));
  }

  public MethodInfo getExecutedMethod() {
    return executedMethod;
  }

  public String getExecutedMethodName(){
    return executedMethod.getName();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("executenative");

    if (executedMethod != null){
      Method m = executedMethod.getMethod();
      sb.append(' ');
      sb.append( m.getDeclaringClass().getSimpleName());
      sb.append('.');
      sb.append( m.getName());
    }

    return sb.toString();
  }
}
