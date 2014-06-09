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

import gov.nasa.jpf.jvm.JVMInstruction;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;
import gov.nasa.jpf.vm.VM;


/**
 * abstraction for all invoke instructions
 */
public abstract class InvokeInstruction extends JVMInstruction {
  /* Those are all from the BCEL class, i.e. straight from the class file.
   * Note that we can't directly resolve to MethodInfo objects because
   * the corresponding class might not be loaded yet (has to be done
   * on execution)
   */
  protected String cname;
  protected String mname;
  protected String signature;

  protected int argSize = -1;

  /** to cache the last callee object */
  protected int lastObj = Integer.MIN_VALUE;

  /**
   * watch out - this is only const for static and special invocation
   * all virtuals will use it only as a cache
   */
  protected MethodInfo invokedMethod;

  protected Object[] arguments; // temporary cache for arg values (for listeners)

  protected InvokeInstruction (String clsName, String methodName, String signature){
    this.cname = Types.getClassNameFromTypeName(clsName);
    this.signature = signature;
    this.mname = MethodInfo.getUniqueName(methodName, signature);
  }

  protected InvokeInstruction () {}


  public int getLength() {
    return 3; // opcode, index1, index2
  }

  // only useful from post-exec notifications
  public int getLastObjRef() {
    return lastObj;
  }

  /**
   * this is for explicit initialization (not BCEL)
   */
  public void setInvokedMethod (String clsName, String mthName, String sig) {
    cname = clsName;
    mname = mthName + sig;
    signature = sig;
  }

  /**
   * be aware of that this might differ from getInvokedMethod(), since it only
   * denotes the target type info we have at the static point of the call, i.e.
   * before dynamic dispatching
   */
  public String getInvokedMethodClassName() {
    return cname;
  }

  public String getInvokedMethodSignature() {
    return signature;
  }

  public String getInvokedMethodName () {
    return mname;
  }

  public abstract MethodInfo getInvokedMethod (ThreadInfo ti);

  public MethodInfo getInvokedMethod () {
    if (invokedMethod == null){
      invokedMethod = getInvokedMethod(ThreadInfo.getCurrentThread());
    }

    return invokedMethod;
  }

  public boolean isCompleted(ThreadInfo ti) {
    Instruction nextPc = ti.getNextPC();

    if (nextPc == null || nextPc == this){
      return false;
    }

    if (invokedMethod != null){
      MethodInfo topMethod = ti.getTopFrame().getMethodInfo();
      if (invokedMethod.isMJI() && (topMethod == mi)) {
        // same frame -> this was a native method that already returned
        return true;
      }

      if (topMethod == invokedMethod){
        return true;
      }
    }

    // <2do> how do we account for exceptions?

    return false;
  }

  StackFrame getCallerFrame (ThreadInfo ti, MethodInfo callee) {
    return ti.getStackFrameExecuting(this, 0);
  }

  //--- invocation processing

  protected void setupCallee (ThreadInfo ti, MethodInfo callee){
    ClassInfo ciCaller = callee.getClassInfo();
    StackFrame frame = ciCaller.createStackFrame( ti, callee);
    
    ti.pushFrame(frame);
    ti.enter();
  }
  
  /**
   * this is a little helper to find out about call argument values from listeners that
   * don't want to dig through MethodInfos and Types. Reference arguments are returned as
   * either ElementInfos or 'null', all others are boxed (i.e. a 'double' is returned as
   * a 'Double' object).
   * It goes without saying that this method can only be called during an executeInstruction()
   * or instructionExecuted() notification for the corresponding InvokeInstruction
   * We use the caller frame to retrieve the arguments (instead of the locals of
   * the callee) since that works for both pre- and post-exec notification
   */
  public Object[] getArgumentValues (ThreadInfo ti) {
    MethodInfo callee = getInvokedMethod(ti);
    StackFrame frame = getCallerFrame(ti, callee);

    assert frame != null : "can't find caller stackframe for: " + this;
    return getArgsFromCaller(ti, frame, callee);
  }

  public Object[] getArgumentAttrs (ThreadInfo ti) {
    MethodInfo callee = getInvokedMethod(ti);
    StackFrame frame = getCallerFrame(ti, callee);

    assert frame != null : "can't find caller stackframe for: " + this;
    return frame.getArgumentAttrs(callee);
  }
  
  
  /**
   * check if there is any argument attr of the specified type
   * (use this before using any of the more expensive retrievers)
   */
  public boolean hasArgumentAttr (ThreadInfo ti, Class<?> type){
    MethodInfo callee = getInvokedMethod(ti);
    StackFrame frame = getCallerFrame(ti, callee);

    assert frame != null : "can't find caller stackframe for: " + this;
    return frame.hasArgumentAttr(callee,type);
  }

  /**
   * do we have a reference argument that has an object attribute?
   * less efficient, but still without object creation
   */
  public boolean hasAttrRefArgument (ThreadInfo ti, Class<?> type){
    MethodInfo callee = getInvokedMethod(ti);
    StackFrame frame = getCallerFrame(ti, callee);

    int nArgSlots = callee.getArgumentsSize();
    for (int i=0; i<nArgSlots; i++){
      if (frame.isOperandRef(i)){
        ElementInfo ei = ti.getElementInfo(frame.peek(i));
        if (ei != null){
          if (ei.getObjectAttr(type) != null){
            return true;
          }
        }
      }
    }

    return false;
  }


  // we get this from the caller because this works both for pre- and post-exec
  // notifications, whereas retrieval from the callee frame of course only works
  // post-exec
  Object[] getArgsFromCaller (ThreadInfo ti, StackFrame frame, MethodInfo callee){
    int n = callee.getNumberOfArguments();
    Object[] args = new Object[n];
    byte[] at = callee.getArgumentTypes();

    for (int i=n-1, off=0; i>=0; i--) {
      switch (at[i]) {
      case Types.T_ARRAY:
      //case Types.T_OBJECT:
      case Types.T_REFERENCE:
        int ref = frame.peek(off);
        if (ref != MJIEnv.NULL) {
          args[i] = ti.getElementInfo(ref);
        } else {
          args[i] = null;
        }
        off++;
        break;

      case Types.T_LONG:
        args[i] = new Long(frame.peekLong(off));
        off+=2;
        break;
      case Types.T_DOUBLE:
        args[i] = new Double(Types.longToDouble(frame.peekLong(off)));
        off+=2;
        break;

      case Types.T_BOOLEAN:
        args[i] = new Boolean(frame.peek(off) != 0);
        off++;
        break;
      case Types.T_BYTE:
        args[i] = new Byte((byte)frame.peek(off));
        off++;
        break;
      case Types.T_CHAR:
        args[i] = new Character((char)frame.peek(off));
        off++;
        break;
      case Types.T_SHORT:
        args[i] = new Short((short)frame.peek(off));
        off++;
        break;
      case Types.T_INT:
        args[i] = new Integer((int)frame.peek(off));
        off++;
        break;
      case Types.T_FLOAT:
        args[i] = new Float(Types.intToFloat(frame.peek(off)));
        off++;
        break;
      default:
        // error, unknown argument type
      }
    }

    return args;
  }

  public int getArgSize () {
    if (argSize < 0) {
      argSize = Types.getArgumentsSize(signature) + 1; // 'this'
    }

    return argSize;
  }

  public int getReturnType() {
    return Types.getReturnBuiltinType(signature);
  }

  public boolean isReferenceReturnType() {
    int r = Types.getReturnBuiltinType(signature);
    return ((r == Types.T_REFERENCE) || (r == Types.T_ARRAY));
  }

  public String getReturnTypeName() {
    return Types.getReturnTypeName(signature);
  }

  public Object getFieldOrArgumentValue (String id, ThreadInfo ti){
    Object v = null;

    if ((v = getArgumentValue(id,ti)) == null){
      v = getFieldValue(id, ti);
    }

    return v;
  }

  public abstract Object getFieldValue (String id, ThreadInfo ti);


  /**
   * <2do> - this relies on same order of arguments and LocalVariableTable entries, which
   * seems to hold for javac, but is not required by the VM spec, which only
   * says that arguments are stored in consecutive slots starting at 0
   */
  public Object getArgumentValue (String id, ThreadInfo ti){
    MethodInfo mi = getInvokedMethod();
    LocalVarInfo localVars[] = mi.getLocalVars();
    Object[] args = getArgumentValues(ti);

    if (localVars != null){
      int j = mi.isStatic() ? 0 : 1;

      for (int i=0; i<args.length; i++, j++){
        Object a = args[i];
        if (id.equals(localVars[j].getName())){
          return a;
        }
      }
    }

    return null;
  }


  protected boolean checkSyncCG (ElementInfo ei, ThreadInfo ti){
    if (!ti.isFirstStepInsn()) {
      if (ei.getLockingThread() != ti) {  // maybe its a recursive lock
        VM vm = ti.getVM();

        if (ei.canLock(ti)) { // we can lock the object, check if we need a CG
          if (ei.isShared()) {
            ChoiceGenerator<?> cg = vm.getSchedulerFactory().createSyncMethodEnterCG(ei, ti);
            if (cg != null) {
              if (vm.setNextChoiceGenerator(cg)) {
                ei = ei.getModifiableInstance();
                ei.registerLockContender(ti);  // Record that this thread would lock the object upon next execution
                return true;
              }
            }
          }

        } else { // already locked by another thread, we have to block and therefore need a CG
          ei = ei.getModifiableInstance();
          // the top half already did set the object shared
          ei.block(ti); // do this before we obtain the CG so that this thread is not in its choice set

          ChoiceGenerator<?> cg = vm.getSchedulerFactory().createSyncMethodEnterCG(ei, ti);
          vm.setMandatoryNextChoiceGenerator(cg, "blocking sync without CG");
          return true;
        }
      }
    }

    return false;
  }


  
  public void accept(InstructionVisitor insVisitor) {
	  insVisitor.visit(this);
  }

  @Override
  public Instruction typeSafeClone(MethodInfo mi) {
    InvokeInstruction clone = null;

    try {
      clone = (InvokeInstruction) super.clone();

      // reset the method that this insn belongs to
      clone.mi = mi;

      clone.invokedMethod = null;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return clone;
  }
}
