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

package gov.nasa.jpf.jvm;

import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.DirectCallStackFrame;
import gov.nasa.jpf.vm.MethodInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * a direct call stackframe that supports JVM calling conventions
 */
public class JVMDirectCallStackFrame extends DirectCallStackFrame {
  
  JVMDirectCallStackFrame (FeatureExpr ctx, MethodInfo miDirectCall, MethodInfo callee){
    super( ctx, miDirectCall, callee);
  }

  //--- return value handling
  
  @Override
  public int getResult(){
    return pop(TRUE).getValue();
  }
  
  @Override
  public int getReferenceResult(){
    return pop(TRUE).getValue();
  }
  
  @Override
  public long getLongResult(){
    return popLong(TRUE).getValue();
  }

  @Override
  public Object getResultAttr(){
    return getOperandAttr(TRUE);
  }
  
  @Override
  public Object getLongResultAttr(){
    return getLongOperandAttr(TRUE);
  }

  @Override
  public void setExceptionReference (int exRef, FeatureExpr ctx){
    clearOperandStack(ctx);
    pushRef( exRef, ctx);
  }
  
  @Override
  public int getExceptionReference(){
    return pop(TRUE).getValue();
  }

  @Override
  public void setExceptionReferenceAttribute (Object attr){
    setOperandAttr(attr);
  }
  
  @Override
  public Object getExceptionReferenceAttribute (){
    return getOperandAttr(TRUE);
  }
  
  //--- direct call argument initialization
  // NOTE - we don't support out-of-order arguments yet, i.e. the slotIdx is ignored
  
  
  @Override
  public int setArgument (int slotIdx, int v, Object attr){
    push(TRUE, new One<>(v));
    if (attr != null){
      setOperandAttr(attr);
    }
    
    return slotIdx+1;
  }
  
  @Override
  public int setReferenceArgument (int slotIdx, int ref, Object attr){
    pushRef(ref, TRUE);
    if (attr != null){
      setOperandAttr(attr);
    }
    
    return slotIdx+1;
  }
  
  @Override
  public int setLongArgument (int slotIdx, long v, Object attr){
    pushLong(v);
    if (attr != null){
      setLongOperandAttr(attr);
    } 
    
    return slotIdx+2;
  }
  
  //--- DirectCallStackFrame methods don't have arguments
  
  @Override
  public void setArgumentLocal (int argIdx, int v, Object attr){
    throw new UnsupportedOperationException("direct call methods don't have arguments");
  }
  @Override
  public void setReferenceArgumentLocal (int argIdx, int v, Object attr){
    throw new UnsupportedOperationException("direct call methods don't have arguments");
  }
  @Override
  public void setLongArgumentLocal (int argIdx, long v, Object attr){
    throw new UnsupportedOperationException("direct call methods don't have arguments");
  }
}
