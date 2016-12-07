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

import java.util.Iterator;
import java.util.function.BiFunction;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.vatrace.ReturnStatement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;
import gov.nasa.jpf.vm.VM;


/**
 * abstraction for the various return instructions
 */
public abstract class ReturnInstruction extends JVMInstruction implements gov.nasa.jpf.vm.ReturnInstruction {

  // to store where we came from
  protected StackFrame returnFrame;

  abstract public int getReturnTypeSize();
  abstract protected Object getReturnedOperandAttr(FeatureExpr ctx, StackFrame frame);
  
  // note these are only callable from within the same enter - thread interleavings
  // would cause races
  abstract protected void getAndSaveReturnValue (StackFrame frame, FeatureExpr ctx);

  abstract protected void pushReturnValue (FeatureExpr ctx, StackFrame frame);

  public abstract Object getReturnValue(FeatureExpr ctx, ThreadInfo ti);

  public StackFrame getReturnFrame() {
    return returnFrame;
  }

  public void setReturnFrame(StackFrame frame){
    returnFrame = frame;
  }

  /**
   * this is important since keeping the StackFrame alive would be a major
   * memory leak
   */
  @Override
  public void cleanupTransients(){
    returnFrame = null;
  }
  
  //--- attribute accessors
  
  // the accessors are here to save the client some effort regarding the
  // return type (slot size).
  // Since these are all public methods that can be called by listeners,
  // we stick to the ThreadInfo argument
  
  public boolean hasReturnAttr (ThreadInfo ti){
    StackFrame frame = ti.getTopFrame();
    return frame.hasOperandAttr();
  }
  public boolean hasReturnAttr (ThreadInfo ti, Class<?> type){
    StackFrame frame = ti.getTopFrame();
    return frame.hasOperandAttr(type);
  }
  
  /**
   * this returns all of them - use either if you know there will be only
   * one attribute at a time, or check/process result with ObjectList
   * 
   * obviously, this only makes sense from an instructionExecuted(), since
   * the value is pushed during the enter(). Use ObjectList to access values
   */
  public Object getReturnAttr (ThreadInfo ti){
    StackFrame frame = ti.getTopFrame();
    return frame.getOperandAttr(FeatureExprFactory.True());
  }

  /**
   * this replaces all of them - use only if you know 
   *  - there will be only one attribute at a time
   *  - you obtained the value you set by a previous getXAttr()
   *  - you constructed a multi value list with ObjectList.createList()
   * 
   * we don't clone since pushing a return value already changed the caller frame
   */
  public void setReturnAttr (ThreadInfo ti, Object a){
    StackFrame frame = ti.getModifiableTopFrame();
    frame.setOperandAttr(a);
  }
  
  public void addReturnAttr (ThreadInfo ti, Object attr){
    StackFrame frame = ti.getModifiableTopFrame();
    frame.addOperandAttr(attr);
  }

  /**
   * this only returns the first attr of this type, there can be more
   * if you don't use client private types or the provided type is too general
   */
  public <T> T getReturnAttr (ThreadInfo ti, Class<T> type){
    StackFrame frame = ti.getTopFrame();
    return frame.getOperandAttr(type);
  }
  public <T> T getNextReturnAttr (ThreadInfo ti, Class<T> type, Object prev){
    StackFrame frame = ti.getTopFrame();
    return frame.getNextOperandAttr(type, prev);
  }
  public Iterator<?> returnAttrIterator (ThreadInfo ti){
    StackFrame frame = ti.getTopFrame();
    return frame.operandAttrIterator();
  }
  public <T> Iterator<T> returnAttrIterator (ThreadInfo ti, Class<T> type){
    StackFrame frame = ti.getTopFrame();
    return frame.operandAttrIterator(type);
  }
  
  // -- end attribute accessors --
  
  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {

    if (!ti.isFirstStepInsn()) {
      ti.leave();  // takes care of unlocking before potentially creating a CG

      if (mi.isSynchronized()) {
        int objref = mi.isStatic() ? mi.getClassInfo().getClassObjectRef() : ti.getThis();
        ElementInfo ei = ti.getElementInfo(objref);

        if (ei.getLockCount() == 0){
          ei = ei.getInstanceWithUpdatedSharedness(ti); 
          if (ei.isShared()) {
            VM vm = ti.getVM();
            ChoiceGenerator<ThreadInfo> cg = vm.getSchedulerFactory().createSyncMethodExitCG(ei, ti);
            if (cg != null) {
              if (vm.setNextChoiceGenerator(cg)) {
                ti.skipInstructionLogging();
                return new One<Instruction>(this); // re-enter
              }
            }
          }
        }
      }
    }

    StackFrame frame = ti.getModifiableTopFrame();

    if (getReturnTypeSize() > 0) {
	    @SuppressWarnings("rawtypes")
		Conditional stateMentValue;
	    if (getReturnTypeSize() == 1) {
	    	stateMentValue = frame.peek(ctx);
	    } else {
	    	if (mi.getReturnTypeCode() == Types.T_DOUBLE) {
	    		stateMentValue = frame.peekLong(ctx).map(v -> Types.longToDouble(v));
	    	} else {
	    		stateMentValue = frame.peekLong(ctx);
	    	}
	    }
	    new ReturnStatement(this, frame.method, stateMentValue, ctx);
    }
    
    returnFrame = frame;
    Object attr = getReturnedOperandAttr(ctx, frame); // the return attr - get this before we pop
    getAndSaveReturnValue(frame, ctx);
    
    
    // note that this is never the first frame, since we start all threads (incl. main)
    // through a direct call
    frame = ti.popAndGetModifiableTopFrame(ctx);
    // remove args, push return value and continue with next insn
    // (DirectCallStackFrames don't use this)
    frame.removeArguments(ctx, mi);
    pushReturnValue(ctx, frame);
    
    
    
    if (attr != null) {
      setReturnAttr(ti, attr);
    }

    return getNext(ctx, ti);
  }
  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }
  
  @Override
	public boolean equals(Object o) {
	  if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (o.getClass().equals(getClass()) && o instanceof Instruction) {
			if (getMethodInfo() == ((Instruction)o).getMethodInfo()) {
				return true;
			}
		}
		return false;
	}
  
  	@Override
	public int hashCode() {
		return getMethodInfo().hashCode() + getClass().hashCode();
	}
  	
	@Override
	public Conditional<Instruction> getNext(final FeatureExpr ctx, ThreadInfo ti) {
		// we have to find the corresponding instruction at the callee method
		return ti.getPC().mapf(ctx, new BiFunction<FeatureExpr, Instruction, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(final FeatureExpr f, final Instruction y) {
				return ChoiceFactory.create(ctx, new One<>(y.getNext()), new One<>(y));
			}

		}).simplify();
	}
}
