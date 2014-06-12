//
// Copyright (C) 2011 United States Government as represented by the
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

import gov.nasa.jpf.jvm.JVMByteCodeReader;

/**
 * empty implementation of a JVMByteCodeReader, to efficiently allow overriding
 * single methods
 */
public class JVMByteCodeReaderAdapter implements JVMByteCodeReader {

  public void aconst_null() {}
  public void aload(int localVarIndex) {}
  public void aload_0() {}
  public void aload_1() {}
  public void aload_2() {}
  public void aload_3() {}
  public void aaload() {}
  public void astore(int localVarIndex) {}
  public void astore_0() {}
  public void astore_1() {}
  public void astore_2() {}
  public void astore_3() {}
  public void aastore() {}
  public void areturn() {}
  public void anewarray(int cpClassIndex) {}
  public void arraylength() {}
  public void athrow() {}

  public void baload() {}
  public void bastore() {}
  public void bipush(int b) {}

  public void caload() {}
  public void castore() {}
  public void checkcast(int cpClassIndex) {}

  public void d2f() {}
  public void d2i() {}
  public void d2l() {}
  public void dadd() {}
  public void daload() {}
  public void dastore() {}
  public void dcmpg() {}
  public void dcmpl() {}
  public void dconst_0() {}
  public void dconst_1() {}
  public void ddiv() {}
  public void dload(int localVarIndex) {}
  public void dload_0() {}
  public void dload_1() {}
  public void dload_2() {}
  public void dload_3() {}
  public void dmul() {}
  public void dneg() {}
  public void drem() {}
  public void dreturn() {}
  public void dstore(int localVarIndex) {}
  public void dstore_0() {}
  public void dstore_1() {}
  public void dstore_2() {}
  public void dstore_3() {}
  public void dsub() {}
  public void dup() {}
  public void dup_x1() {}
  public void dup_x2() {}
  public void dup2() {}
  public void dup2_x1() {}
  public void dup2_x2() {}

  public void f2d() {}
  public void f2i() {}
  public void f2l() {}
  public void fadd() {}
  public void faload() {}
  public void fastore() {}
  public void fcmpg() {}
  public void fcmpl() {}
  public void fconst_0() {}
  public void fconst_1() {}
  public void fconst_2() {}
  public void fdiv() {}
  public void fload(int localVarIndex) {}
  public void fload_0() {}
  public void fload_1() {}
  public void fload_2() {}
  public void fload_3() {}
  public void fmul() {}
  public void fneg() {}
  public void frem() {}
  public void freturn() {}
  public void fstore(int localVarIndex) {}
  public void fstore_0() {}
  public void fstore_1() {}
  public void fstore_2() {}
  public void fstore_3() {}
  public void fsub() {}

  public void getfield(int cpFieldRefIndex) {}
  public void getstatic(int cpFieldRefIndex) {}
  public void goto_(int pcOffset) {}
  public void goto_w (int pcOffset) {}

  public void i2b() {}
  public void i2c() {}
  public void i2d() {}
  public void i2f() {}
  public void i2l() {}
  public void i2s() {}
  public void iadd() {}
  public void iaload() {}
  public void iand() {}
  public void iastore() {}
  public void iconst_m1() {}
  public void iconst_0() {}
  public void iconst_1() {}
  public void iconst_2() {}
  public void iconst_3() {}
  public void iconst_4() {}
  public void iconst_5() {}
  public void idiv() {}
  public void if_acmpeq(int pcOffset) {}
  public void if_acmpne(int pcOffset) {}
  public void if_icmpeq(int pcOffset) {}
  public void if_icmpne(int pcOffset) {}
  public void if_icmplt(int pcOffset) {}
  public void if_icmpge(int pcOffset) {}
  public void if_icmpgt(int pcOffset) {}
  public void if_icmple(int pcOffset) {}
  public void ifeq(int pcOffset) {}
  public void ifne(int pcOffset) {}
  public void iflt(int pcOffset) {}
  public void ifge(int pcOffset) {}
  public void ifgt(int pcOffset) {}
  public void ifle(int pcOffset) {}
  public void ifnonnull(int pcOffset) {}
  public void ifnull(int pcOffset) {}
  public void iinc(int localVarIndex, int incConstant) {}
  public void iload(int localVarIndex) {}
  public void iload_0() {}
  public void iload_1() {}
  public void iload_2() {}
  public void iload_3() {}
  public void imul() {}
  public void ineg() {}
  public void instanceof_(int cpClassIndex) {}
  public void invokeinterface (int cpInterfaceMethodRefIndex, int count, int zero) {}
  public void invokespecial (int cpMethodRefIndex) {}
  public void invokestatic (int cpMethodRefIndex) {}
  public void invokevirtual (int cpMethodRefIndex) {}
  public void ior() {}
  public void irem() {}
  public void ireturn() {}
  public void ishl() {}
  public void ishr() {}
  public void istore(int localVarIndex) {}
  public void istore_0() {}
  public void istore_1() {}
  public void istore_2() {}
  public void istore_3() {}
  public void isub() {}
  public void iushr() {}
  public void ixor() {}

  public void jsr(int pcOffset) {}
  public void jsr_w(int pcOffset) {}

  public void l2d() {}
  public void l2f() {}
  public void l2i() {}
  public void ladd() {}
  public void laload() {}
  public void land() {}
  public void lastore() {}
  public void lcmp() {}
  public void lconst_0() {}
  public void lconst_1() {}
  public void ldc_(int cpIntOrFloatOrStringIndex) {}
  public void ldc_w_(int cpIntOrFloatOrStringIndex) {}
  public void ldc2_w(int cpLongOrDoubleIndex) {}
  public void ldiv() {}
  public void lload(int localVarIndex) {}
  public void lload_0() {}
  public void lload_1() {}
  public void lload_2() {}
  public void lload_3() {}
  public void lmul() {}
  public void lneg() {}
  public void lookupswitch(int defaultPcOffset, int nEntries) {}
  public void lookupswitchEntry(int index, int match, int pcOffset) {}
  public void lor() {}
  public void lrem() {}
  public void lreturn() {}
  public void lshl() {}
  public void lshr() {}
  public void lstore(int localVarIndex) {}
  public void lstore_0() {}
  public void lstore_1() {}
  public void lstore_2() {}
  public void lstore_3() {}
  public void lsub() {}
  public void lushr() {}
  public void lxor() {}

  public void monitorenter() {}
  public void monitorexit() {}
  public void multianewarray(int cpClassIndex, int dimensions) {}

  public void new_(int cpClassIndex) {}
  public void newarray(int typeCode) {}
  public void nop() {}

  public void pop() {}
  public void pop2() {}
  public void putfield(int cpFieldRefIndex) {}
  public void putstatic(int cpFieldRefIndex) {}

  public void ret(int localVarIndex) {}
  public void return_() {}

  public void saload() {}
  public void sastore() {}
  public void sipush(int val) {}
  public void swap() {}

  public void tableswitch(int defaultPcOffset, int low, int high) {}
  public void tableswitchEntry(int value, int pcOffset) {}

  public void wide () {}

  public void unknown(int bytecode) {}
}
