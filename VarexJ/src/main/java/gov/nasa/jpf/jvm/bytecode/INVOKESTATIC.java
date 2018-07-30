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


import cmu.conditional.CachedFeatureExprFactory;
import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClassLoaderInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LoadOnJPFRequired;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StaticElementInfo;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;


/**
 * Invoke a class (static) method
 * ..., [arg1, [arg2 ...]]  => ...
 */
public class INVOKESTATIC extends InvokeInstruction {
  ClassInfo ci;
  
  protected INVOKESTATIC (String clsDescriptor, String methodName, String signature){
    super(clsDescriptor, methodName, signature);
  }

  protected ClassInfo getClassInfo () {
    if (ci == null) {
      ci = ClassLoaderInfo.getCurrentResolvedClassInfo(cname);
    }
    return ci;
  }
  
  public int getByteCode () {
    return 0xB8;
  }

  public StaticElementInfo getStaticElementInfo (){
    return getClassInfo().getStaticElementInfo();
  }

  public int getClassObjectRef(){
    return getClassInfo().getStaticElementInfo().getClassObjectRef();
  }

  public Conditional<Instruction> execute (FeatureExpr ctx, ThreadInfo ti) {
    MethodInfo callee;
    
    try {
      callee = getInvokedMethod(ctx, ti);
    } catch (LoadOnJPFRequired lre) {
      return ti.getPC();
    }
    
    if (callee == null) {
      return new One<>(ti.createAndThrowException(ctx, "java.lang.NoSuchMethodException", cname + '.' + mname));
    }

    // this can be actually different than (can be a base)
    ClassInfo ciCallee = callee.getClassInfo();
    
    if ( ciCallee.pushRequiredClinits(ctx, ti)) {
      // do class initialization before continuing
      // note - this returns the next insn in the topmost clinit that just got pushed
      return ti.getPC();
    }

    if (callee.isSynchronized()) {
      ElementInfo ei = ciCallee.getClassObject();
      ei = ei.getInstanceWithUpdatedSharedness(ti);
      if (checkSyncCG(ei, ti)){
        return new One<Instruction>(this);
      }
    }
        

	// set ctx for native method calls
//    boolean splitRef = false;
//	if (callee.isMJI()) {
//		 IStackHandler stack = ti.getTopFrame().stack;
//		 if (stack.getStackWidth() > 1) {
//			 boolean split = false;
//			 for (int i = 0; i < callee.getNumberOfArguments(); i++) {
//				 if (stack.peek(ctx, i) instanceof IChoice) {
//					 split = true;
//					 splitRef = true;
//					 break;
//				 }
//			 }
//			 
//			 if (split) {
//				 Map<Stack, FeatureExpr> stacks = stack.getStack().simplify(ctx).toMap();
//				 for (FeatureExpr c : stacks.values()) {
//					 ctx = ctx.and(c);
//					 break;
//				 }
//			 }
//		 }
//	}
	
	setupCallee(ctx, ti, callee); // this creates, initializes and
									// pushes the callee StackFrame

//	if (!splitRef) {
//		return ti.getPC();
//	}
	
	return ChoiceFactory.create(ctx, ti.getPC(), new One<Instruction>(this)).simplify(); // we can't just return the first callee insn
						// if a listener throws an exception

  }

  public MethodInfo getInvokedMethod(){
    if (invokedMethod != null){
      return invokedMethod;
    } else {
      // Hmm, this would be pre-exec, but if the current thread is not the one executing the insn 
      // this might result in false sharedness of the class object
      return getInvokedMethod( CachedFeatureExprFactory.True(), ThreadInfo.getCurrentThread());
    }
  }
  
  public MethodInfo getInvokedMethod (FeatureExpr ctx, ThreadInfo ti){
    if (invokedMethod == null) {
      ClassInfo clsInfo = getClassInfo();
      if (clsInfo != null){
        MethodInfo callee = clsInfo.getMethod(mname, true);
        if (callee == null) {
        	throw new RuntimeException("Method " + mname + " in class " + clsInfo + " not found");
        }
        
        ClassInfo ciCallee = callee.getClassInfo(); // might be a superclass of ci, i.e. not what is referenced in the insn
        
        if (!ciCallee.isRegistered()){
          // if it wasn't registered yet, classLoaded listeners didn't have a chance yet to modify it..
          ciCallee.registerClass(ctx, ti);
          // .. and might replace/remove MethodInfos
          callee = clsInfo.getMethod(mname, true);
        }
        invokedMethod = callee;
      }    
    }
    return invokedMethod;
  }
  
  // can be different thatn the ci - method can be in a superclass
  public ClassInfo getInvokedClassInfo(){
    return getInvokedMethod().getClassInfo();
  }

  public String getInvokedClassName(){
    return getInvokedClassInfo().getName();
  }

  public int getArgSize () {
    if (argSize < 0) {
      argSize = Types.getArgumentsSize(signature);
    }

    return argSize;
  }

  
  public String toString() {
    // methodInfo not set outside real call context (requires target object)
    return super.toString() + " " + cname + '.' + mname;
  }

  public Object getFieldValue (String id, ThreadInfo ti) {
    return getClassInfo().getStaticFieldValueObject(id);
  }
  
  @Override
  public Instruction typeSafeClone(MethodInfo mi) {
    INVOKESTATIC clone = null;

    try {
      clone = (INVOKESTATIC) super.clone();

      // reset the method that this insn belongs to
      clone.mi = mi;

      clone.invokedMethod = null;
      clone.lastObj = Integer.MIN_VALUE;
      clone.ci = null;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return clone;
  }
}

