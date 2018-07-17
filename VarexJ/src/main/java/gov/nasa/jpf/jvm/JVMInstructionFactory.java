/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * The Java Pathfinder core (jpf-core) platform is licensed under the
 * Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package gov.nasa.jpf.jvm;

import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.NativeMethodInfo;

/**
 * interface for bytecode creation
 *
 * this deliberately uses the abstract public abstract Instruction as return type to allow different instruction hierarchies in
 * extensions.
 *
 * This shouldn't impose runtime overhead since mandatory parameters are now passed in as factory method arguments. The only
 * drawback is that the compiler cannot check for public abstract Instruction class typos, but that seems less important than
 * allowing extension specific public abstract Instruction class hierarchies
 *
 * <2do> there are still direct references of LOOKUPSWITCH, TABLESWITCH. Once these are removed, .jvm does not assume a particular
 * public abstract Instruction hierarchy
 */
public abstract class JVMInstructionFactory implements Cloneable {

  protected static JVMInstructionFactory singleton;
  
  public static JVMInstructionFactory getFactory(){
    return singleton;
  }
  
  protected JVMInstructionFactory(){
    // we should check the singleton first
    singleton = this;
  }
  

  //--- the factory methods
  public abstract Instruction aconst_null ();

  public abstract Instruction aload (int localVarIndex);

  public abstract Instruction aload_0 ();

  public abstract Instruction aload_1 ();

  public abstract Instruction aload_2 ();

  public abstract Instruction aload_3 ();

  public abstract Instruction aaload ();

  public abstract Instruction astore (int localVarIndex);

  public abstract Instruction astore_0 ();

  public abstract Instruction astore_1 ();

  public abstract Instruction astore_2 ();

  public abstract Instruction astore_3 ();

  public abstract Instruction aastore ();

  public abstract Instruction areturn ();

  public abstract Instruction anewarray (String clsName);

  public abstract Instruction arraylength ();

  public abstract Instruction athrow ();

  public abstract Instruction baload ();

  public abstract Instruction bastore ();

  public abstract Instruction bipush (int b);

  public abstract Instruction caload ();

  public abstract Instruction castore ();

  public abstract Instruction checkcast (String clsName);

  public abstract Instruction d2f ();

  public abstract Instruction d2i ();

  public abstract Instruction d2l ();

  public abstract Instruction dadd ();

  public abstract Instruction daload ();

  public abstract Instruction dastore ();

  public abstract Instruction dcmpg ();

  public abstract Instruction dcmpl ();

  public abstract Instruction dconst_0 ();

  public abstract Instruction dconst_1 ();

  public abstract Instruction ddiv ();

  public abstract Instruction dload (int localVarIndex);

  public abstract Instruction dload_0 ();

  public abstract Instruction dload_1 ();

  public abstract Instruction dload_2 ();

  public abstract Instruction dload_3 ();

  public abstract Instruction dmul ();

  public abstract Instruction dneg ();

  public abstract Instruction drem ();

  public abstract Instruction dreturn ();

  public abstract Instruction dstore (int localVarIndex);

  public abstract Instruction dstore_0 ();

  public abstract Instruction dstore_1 ();

  public abstract Instruction dstore_2 ();

  public abstract Instruction dstore_3 ();

  public abstract Instruction dsub ();

  public abstract Instruction dup ();

  public abstract Instruction dup_x1 ();

  public abstract Instruction dup_x2 ();

  public abstract Instruction dup2 ();

  public abstract Instruction dup2_x1 ();

  public abstract Instruction dup2_x2 ();

  public abstract Instruction f2d ();

  public abstract Instruction f2i ();

  public abstract Instruction f2l ();

  public abstract Instruction fadd ();

  public abstract Instruction faload ();

  public abstract Instruction fastore ();

  public abstract Instruction fcmpg ();

  public abstract Instruction fcmpl ();

  public abstract Instruction fconst_0 ();

  public abstract Instruction fconst_1 ();

  public abstract Instruction fconst_2 ();

  public abstract Instruction fdiv ();

  public abstract Instruction fload (int localVarIndex);

  public abstract Instruction fload_0 ();

  public abstract Instruction fload_1 ();

  public abstract Instruction fload_2 ();

  public abstract Instruction fload_3 ();

  public abstract Instruction fmul ();

  public abstract Instruction fneg ();

  public abstract Instruction frem ();

  public abstract Instruction freturn ();

  public abstract Instruction fstore (int localVarIndex);

  public abstract Instruction fstore_0 ();

  public abstract Instruction fstore_1 ();

  public abstract Instruction fstore_2 ();

  public abstract Instruction fstore_3 ();

  public abstract Instruction fsub ();

  public abstract Instruction getfield (String fieldName, String clsName, String fieldDescriptor);

  public abstract Instruction getstatic (String fieldName, String clsName, String fieldDescriptor);

  public abstract Instruction goto_ (int targetPc);

  public abstract Instruction goto_w (int targetPc);

  public abstract Instruction i2b ();

  public abstract Instruction i2c ();

  public abstract Instruction i2d ();

  public abstract Instruction i2f ();

  public abstract Instruction i2l ();

  public abstract Instruction i2s ();

  public abstract Instruction iadd ();

  public abstract Instruction iaload ();

  public abstract Instruction iand ();

  public abstract Instruction iastore ();

  public abstract Instruction iconst_m1 ();

  public abstract Instruction iconst_0 ();

  public abstract Instruction iconst_1 ();

  public abstract Instruction iconst_2 ();

  public abstract Instruction iconst_3 ();

  public abstract Instruction iconst_4 ();

  public abstract Instruction iconst_5 ();

  public abstract Instruction idiv ();

  public abstract Instruction if_acmpeq (int targetPc);

  public abstract Instruction if_acmpne (int targetPc);

  public abstract Instruction if_icmpeq (int targetPc);

  public abstract Instruction if_icmpne (int targetPc);

  public abstract Instruction if_icmplt (int targetPc);

  public abstract Instruction if_icmpge (int targetPc);

  public abstract Instruction if_icmpgt (int targetPc);

  public abstract Instruction if_icmple (int targetPc);

  public abstract Instruction ifeq (int targetPc);

  public abstract Instruction ifne (int targetPc);

  public abstract Instruction iflt (int targetPc);

  public abstract Instruction ifge (int targetPc);

  public abstract Instruction ifgt (int targetPc);

  public abstract Instruction ifle (int targetPc);

  public abstract Instruction ifnonnull (int targetPc);

  public abstract Instruction ifnull (int targetPc);

  public abstract Instruction iinc (int localVarIndex, int incConstant);

  public abstract Instruction iload (int localVarIndex);

  public abstract Instruction iload_0 ();

  public abstract Instruction iload_1 ();

  public abstract Instruction iload_2 ();

  public abstract Instruction iload_3 ();

  public abstract Instruction imul ();

  public abstract Instruction ineg ();

  public abstract Instruction instanceof_ (String clsName);

  public abstract Instruction invokeinterface (String clsName, String methodName, String methodSignature);

  public abstract Instruction invokespecial (String clsName, String methodName, String methodSignature);

  public abstract Instruction invokestatic (String clsName, String methodName, String methodSignature);

  public abstract Instruction invokevirtual (String clsName, String methodName, String methodSignature);
  
  public abstract Instruction invokedynamic (int bootstrapIndex, String samMethodName, String functionType);

  public abstract Instruction ior ();

  public abstract Instruction irem ();

  public abstract Instruction ireturn ();

  public abstract Instruction ishl ();

  public abstract Instruction ishr ();

  public abstract Instruction istore (int localVarIndex);

  public abstract Instruction istore_0 ();

  public abstract Instruction istore_1 ();

  public abstract Instruction istore_2 ();

  public abstract Instruction istore_3 ();

  public abstract Instruction isub ();

  public abstract Instruction iushr ();

  public abstract Instruction ixor ();

  public abstract Instruction jsr (int targetPc);

  public abstract Instruction jsr_w (int targetPc);

  public abstract Instruction l2d ();

  public abstract Instruction l2f ();

  public abstract Instruction l2i ();

  public abstract Instruction ladd ();

  public abstract Instruction laload ();

  public abstract Instruction land ();

  public abstract Instruction lastore ();

  public abstract Instruction lcmp ();

  public abstract Instruction lconst_0 ();

  public abstract Instruction lconst_1 ();

  public abstract Instruction ldc (int v);

  public abstract Instruction ldc (float v);

  public abstract Instruction ldc (String v, boolean isClass);

  public abstract Instruction ldc_w (int v);

  public abstract Instruction ldc_w (float v);

  public abstract Instruction ldc_w (String v, boolean isClass);

  public abstract Instruction ldc2_w (long v);

  public abstract Instruction ldc2_w (double v);

  public abstract Instruction ldiv ();

  public abstract Instruction lload (int localVarIndex);

  public abstract Instruction lload_0 ();

  public abstract Instruction lload_1 ();

  public abstract Instruction lload_2 ();

  public abstract Instruction lload_3 ();

  public abstract Instruction lmul ();

  public abstract Instruction lneg ();

  public abstract Instruction lookupswitch (int defaultTargetPc, int nEntries);

  public abstract Instruction lor ();

  public abstract Instruction lrem ();

  public abstract Instruction lreturn ();

  public abstract Instruction lshl ();

  public abstract Instruction lshr ();

  public abstract Instruction lstore (int localVarIndex);

  public abstract Instruction lstore_0 ();

  public abstract Instruction lstore_1 ();

  public abstract Instruction lstore_2 ();

  public abstract Instruction lstore_3 ();

  public abstract Instruction lsub ();

  public abstract Instruction lushr ();

  public abstract Instruction lxor ();

  public abstract Instruction monitorenter ();

  public abstract Instruction monitorexit ();

  public abstract Instruction multianewarray (String clsName, int dimensions);

  public abstract Instruction new_ (String clsName);

  public abstract Instruction newarray (int typeCode);

  public abstract Instruction nop ();

  public abstract Instruction pop ();

  public abstract Instruction pop2 ();

  public abstract Instruction putfield (String fieldName, String clsName, String fieldDescriptor);

  public abstract Instruction putstatic (String fieldName, String clsName, String fieldDescriptor);

  public abstract Instruction ret (int localVarIndex);

  public abstract Instruction return_ ();

  public abstract Instruction saload ();

  public abstract Instruction sastore ();

  public abstract Instruction sipush (int val);

  public abstract Instruction swap ();

  public abstract Instruction tableswitch (int defaultTargetPc, int low, int high);

  public abstract Instruction wide ();

  public abstract Instruction invokeclinit (ClassInfo ci);

  public abstract Instruction directcallreturn ();

  public abstract Instruction executenative (NativeMethodInfo mi);

  public abstract Instruction nativereturn ();

  // this is never part of MethodInfo stored code
  public abstract Instruction runstart (MethodInfo miRun);

  public abstract Instruction finishclinit (ClassInfo ci);
}
