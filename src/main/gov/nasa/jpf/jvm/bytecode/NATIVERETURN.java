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

import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.NativeStackFrame;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * synthetic return instruction for native method invocations, so that
 * we don't have to do special provisions to copy the caller args in case
 * a post exec listener wants them.
 */
public class NATIVERETURN extends ReturnInstruction {

  Object ret;
  Object retAttr;
  Byte retType;

  // this is more simple than a normal ReturnInstruction because NativeMethodInfos
  // are not synchronized, and NativeStackFrames are never the first frame in a thread
  @Override
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    if (!ti.isFirstStepInsn()) {
      ti.leave();  // takes care of unlocking before potentially creating a CG
      // NativeMethodInfo is never synchronized, so no thread CG here
    }

    StackFrame frame = ti.getModifiableTopFrame();    
    getAndSaveReturnValue(frame);

    // NativeStackFrame can never can be the first stack frame, so no thread CG

    frame = ti.popAndGetModifiableTopFrame();

    // remove args, push return value and continue with next insn
    frame.removeArguments(mi);
    pushReturnValue(ctx, frame);

    if (retAttr != null) {
      setReturnAttr(ti, retAttr);
    }

    return getNext(ctx, ti);
  }

  @Override
  public void cleanupTransients(){
    ret = null;
    retAttr = null;
    returnFrame = null;
  }
  
  @Override
  public boolean isExtendedInstruction() {
    return true;
  }

  public static final int OPCODE = 260;

  @Override
  public int getByteCode () {
    return OPCODE;
  }

  @Override
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }

  @Override
  protected void getAndSaveReturnValue (StackFrame frame) {
    // it's got to be a NativeStackFrame since this insn is created by JPF
    NativeStackFrame nativeFrame = (NativeStackFrame)frame;

    returnFrame = nativeFrame;

    ret = nativeFrame.getReturnValue();
    retAttr = nativeFrame.getReturnAttr();
    retType = nativeFrame.getMethodInfo().getReturnTypeCode();
  }

  public int getReturnTypeSize() {
    switch (retType) {
    case Types.T_BOOLEAN:
    case Types.T_BYTE:
    case Types.T_CHAR:
    case Types.T_SHORT:
    case Types.T_INT:
    case Types.T_FLOAT:
      return 1;
      
    case Types.T_LONG:
    case Types.T_DOUBLE:
      return 2;

    default:
      return 1;
    }
  }

  // this is only called internally right before we return
  protected Object getReturnedOperandAttr (StackFrame frame) {
    return retAttr;
  }

  // <2do> this should use the getResult..() methods of NativeStackFrame
  
  @Override
  protected void pushReturnValue (FeatureExpr ctx, StackFrame fr) {
    int  ival;
    long lval;
    int  retSize = 1;

    // in case of a return type mismatch, we get a ClassCastException, which
    // is handled in executeMethod() and reported as a InvocationTargetException
    // (not completely accurate, but we rather go with safety)
    if (ret != null) {
      switch (retType) {
      case Types.T_BOOLEAN:
        ival = Types.booleanToInt(((Boolean) ret).booleanValue());
        fr.push(ival);
        break;

      case Types.T_BYTE:
        fr.push(((Byte) ret).byteValue());
        break;

      case Types.T_CHAR:
        fr.push(((Character) ret).charValue());
        break;

      case Types.T_SHORT:
        fr.push(((Short) ret).shortValue());
        break;

      case Types.T_INT:
        fr.push(((Integer) ret).intValue());
        break;

      case Types.T_LONG:
        fr.pushLong(((Long)ret).longValue());
        retSize=2;
        break;

      case Types.T_FLOAT:
        ival = Types.floatToInt(((Float) ret).floatValue());
        fr.push(ival);
        break;

      case Types.T_DOUBLE:
        lval = Types.doubleToLong(((Double) ret).doubleValue());
        fr.pushLong(lval);
        retSize=2;
        break;

      default:
        // everything else is supposed to be a reference
        fr.push(((Integer) ret).intValue(), true);
      }

      if (retAttr != null) {
        if (retSize == 1) {
          fr.setOperandAttr(retAttr);
        } else {
          fr.setLongOperandAttr(retAttr);
        }
      }
    }
  }

  @Override
  public Object getReturnAttr (ThreadInfo ti) {
    if (isCompleted(ti)){
      return retAttr;
    } else {
      NativeStackFrame nativeFrame = (NativeStackFrame) ti.getTopFrame();
      return nativeFrame.getReturnAttr();
    }
  }


  @Override
  public Object getReturnValue(ThreadInfo ti) {
    if (isCompleted(ti)){
      return ret;
    } else {
      NativeStackFrame nativeFrame = (NativeStackFrame) ti.getTopFrame();
      return nativeFrame.getReturnValue();
    }
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("nativereturn ");
    sb.append(mi.getFullName());

    return sb.toString();
  }

}
