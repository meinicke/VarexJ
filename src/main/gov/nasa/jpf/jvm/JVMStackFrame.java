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

import gov.nasa.jpf.jvm.bytecode.extended.BiFunction;
import gov.nasa.jpf.jvm.bytecode.extended.Choice;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.util.FixedBitSet;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * a stackframe that is used for executing Java bytecode, supporting both
 * locals and an operand stack. This is essentially the JVm stack machine
 * implementation
 */
public class JVMStackFrame extends StackFrame {

  public JVMStackFrame (MethodInfo callee){
    super( callee);
  }
  
  /**
   * creates callerSlots dummy Stackframe for testing of operand/local operations
   * NOTE - TESTING ONLY! this does not have callerSlots MethodInfo
   */
  protected JVMStackFrame (int nLocals, int nOperands){
    super( nLocals, nOperands);
  }
  
  /**
   * this sets up arguments from a bytecode caller 
   */
  protected <U> void setCallArguments (final FeatureExpr ctx, ThreadInfo ti){
    final StackFrame caller = ti.getTopFrame();
    MethodInfo miCallee = mi;
    final int nArgSlots = miCallee.getArgumentsSize();
    
    if (nArgSlots > 0){
    	final JVMStackFrame callee = this;
      final Conditional<Integer>[] calleeSlots = slots;
      Conditional<FixedBitSet> calleeRefs = isRef;
      final Conditional<Integer>[] callerSlots = caller.getSlots2();
//      FixedBitSet callerRefs = caller.getReferenceMap(ctx);

      caller.getTopPos2().simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<U>>() {

		@Override
		public Conditional<U> apply(FeatureExpr x, Integer top) {
			for (int i = 0, j = top - nArgSlots + 1; i < nArgSlots; i++, j++) {
				Conditional<Integer> oldValue = calleeSlots[i];
		        calleeSlots[i] = new Choice<>(x, callerSlots[j], oldValue).simplify();
		        callee.setRefIndex(x, i, caller.getRef(x, j));
//		        if (callerRefs.get(j)) {
//		          calleeRefs.getValue().set(i);
//		        }
		        Object a = caller.getSlotAttr(j);
		        if (a != null) {
		          setSlotAttr(i, a);
		        }
		      }
			return null;
		}
      });

      if (!miCallee.isStatic()) {
        thisRef = calleeSlots[0].simplify(ctx).getValue();
      }
    }
  }

  @Override
  public void setExceptionReference (int exRef, FeatureExpr ctx){
    clearOperandStack();
    pushRef( exRef, ctx);
  }
  
  //--- these are for setting up arguments from a VM / listener caller

  /*
   * to be used to initialize locals of a stackframe (only required for explicit construction without a caller,
   * otherwise the Stackframe ctor/invoke insn will take care of copying the values from its caller)
   */
  @Override
  public void setArgumentLocal (int idx, int v, Object attr){
    setLocalVariable( idx, v);
    if (attr != null){
      setLocalAttr( idx, attr);
    }
  }
  @Override
  public void setReferenceArgumentLocal (int idx, int ref, Object attr){
    setLocalReferenceVariable( idx, ref);
    if (attr != null){
      setLocalAttr( idx, attr);
    }
  }
  public void setLongArgumentLocal (int idx, long v, Object attr){
    setLongLocalVariable( idx, v);
    if (attr != null){
      setLocalAttr( idx, attr);
    }
  }
}