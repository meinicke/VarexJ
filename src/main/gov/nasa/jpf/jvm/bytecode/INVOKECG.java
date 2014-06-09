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

package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.jvm.JVMInstructionFactory;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.Invocation;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.ObjRef;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;
import gov.nasa.jpf.vm.choice.InvocationCG;

import java.util.List;

/**
 * a sytnthetic INVOKE instruction that gets it's parameters from an
 * InvocationCG. Whoever uses this better makes sure the frame this
 * executes in has enough operand space (e.g. a DirectCallStackFrame).
 * 
 */
public class INVOKECG extends JVMInstruction {

  List<Invocation>  invokes;
  InvokeInstruction realInvoke;

  public INVOKECG(List<Invocation> invokes){
    this.invokes = invokes;
  }


  public void setInvokes(List<Invocation> invokes) {
    this.invokes = invokes;
  }
  
  public Conditional<Instruction> execute (ThreadInfo ti) {
    
    if (!ti.isFirstStepInsn()) {
      InvocationCG cg = new InvocationCG( "INVOKECG", invokes);
      if (ti.getVM().setNextChoiceGenerator(cg)){
        return new One(this);
      }
      
    } else {
      InvocationCG cg = ti.getVM().getCurrentChoiceGenerator( "INVOKECG", InvocationCG.class);
      assert (cg != null) : "no current InvocationCG";

      Invocation call = cg.getNextChoice();
      MethodInfo callee = call.getMethodInfo();
      JVMInstructionFactory insnFactory = JVMInstructionFactory.getFactory();

      String clsName = callee.getClassInfo().getName();
      String mthName = callee.getName();
      String signature = callee.getSignature();

      Instruction realInvoke;
      if (callee.isStatic()){
        realInvoke = insnFactory.invokestatic(clsName, mthName, signature);
      } else {
        realInvoke = insnFactory.invokevirtual(clsName, mthName, signature);
      }
      
      pushArguments(ti, call.getArguments(), call.getAttrs());
      
      return new One<>(realInvoke);
    }

    return new One<>(getNext());
  }

  void pushArguments (ThreadInfo ti, Object[] args, Object[] attrs){
    StackFrame frame = ti.getModifiableTopFrame();
    
    if (args != null){
      for (int i=0; i<args.length; i++){
        Object a = args[i];
        boolean isLong = false;
        
        if (a != null){
          if (a instanceof ObjRef){
            frame.pushRef(((ObjRef)a).getReference());
          } else if (a instanceof Boolean){
            frame.push((Boolean)a ? 1 : 0, false);
          } else if (a instanceof Integer){
            frame.push((Integer)a, false);
          } else if (a instanceof Long){
            frame.pushLong((Long)a);
            isLong = true;
          } else if (a instanceof Double){
            frame.pushLong(Types.doubleToLong((Double)a));
            isLong = true;
          } else if (a instanceof Byte){
            frame.push((Byte)a, false);
          } else if (a instanceof Short){
            frame.push((Short)a, false);
          } else if (a instanceof Float){
            frame.push(Types.floatToInt((Float)a), false);
          }
        }

        if (attrs != null && attrs[i] != null){
          if (isLong){
            frame.setLongOperandAttr(attrs[i]);
          } else {
            frame.setOperandAttr(attrs[i]);
          }
        }
      }
    }
  }
  
  public boolean isExtendedInstruction() {
    return true;
  }

  public static final int OPCODE = 258;

  public int getByteCode () {
    return OPCODE;
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
  
}
