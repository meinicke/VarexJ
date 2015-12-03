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

package gov.nasa.jpf.jvm;

import java.io.PrintWriter;

/**
 * utility class that prints out bytecode in readable form
 */
public class JVMByteCodePrinter implements JVMByteCodeReader {

  PrintWriter pw;
  ClassFile cf; // need this to get the constpool entries

  String prefix;

  public JVMByteCodePrinter (PrintWriter pw, ClassFile cf, String prefix){
    this.pw = pw;
    this.cf = cf;
    this.prefix = prefix;
  }

  public void aconst_null() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "aconst_null");
  }

  public void aload(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "aload", localVarIndex);
  }

  public void aload_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "aload_0");
  }

  public void aload_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "aload_1");
  }

  public void aload_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "aload_2");
  }

  public void aload_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "aload_3");
  }

  public void aaload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "aaload");
  }

  public void astore(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "astore", localVarIndex);
  }

  public void astore_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "astore_0");
  }

  public void astore_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "astore_1");
  }

  public void astore_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "astore_2");
  }

  public void astore_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "astore_3");
  }

  public void aastore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "aastore");
  }

  public void areturn() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "areturn");
  }

  public void anewarray(int cpClassIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\")\n", prefix, cf.getPc(), "anewarray", cpClassIndex, cf.classNameAt(cpClassIndex));
  }

  public void arraylength() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "arraylength");
  }

  public void athrow() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "athrow");
  }

  public void baload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "baload");
  }

  public void bastore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "bastore");
  }

  public void bipush(int b) {
    pw.printf("%s%3d: %s %d\n", prefix, cf.getPc(), "bipush", b);
  }

  public void caload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "caload");
  }

  public void castore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "castore");
  }

  public void checkcast(int cpClassIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\")\n", prefix, cf.getPc(), "checkcast", cpClassIndex, cf.classNameAt(cpClassIndex));
  }

  public void d2f() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "d2f");
  }

  public void d2i() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "d2i");
  }

  public void d2l() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "d2l");
  }

  public void dadd() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dadd");
  }

  public void daload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "daload");
  }

  public void dastore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dastore");
  }

  public void dcmpg() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dcmpg");
  }

  public void dcmpl() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dcmpl");
  }

  public void dconst_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dconst_0");
  }

  public void dconst_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dcont_1");
  }

  public void ddiv() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ddiv");
  }

  public void dload(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "dload", localVarIndex);
  }

  public void dload_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dload_0");
  }

  public void dload_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dload_1");
  }

  public void dload_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dload_2");
  }

  public void dload_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dload_3");
  }

  public void dmul() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dmul");
  }

  public void dneg() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dneg");
  }

  public void drem() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "drem");
  }

  public void dreturn() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dreturn");
  }

  public void dstore(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "dstore", localVarIndex);
  }

  public void dstore_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dstore_0");
  }

  public void dstore_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dstore_1");
  }

  public void dstore_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dstore_2");
  }

  public void dstore_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dstore_3");
  }

  public void dsub() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dsub");
  }

  public void dup() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dup");
  }

  public void dup_x1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dup_x1");
  }

  public void dup_x2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dup_x2");
  }

  public void dup2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dup2");
  }

  public void dup2_x1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dup2_x1");
  }

  public void dup2_x2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "dup2_x2");
  }

  public void f2d() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "f2d");
  }

  public void f2i() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "f2i");
  }

  public void f2l() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "f2l");
  }

  public void fadd() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fadd");
  }

  public void faload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "faload");
  }

  public void fastore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fastore");
  }

  public void fcmpg() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fcmpg");
  }

  public void fcmpl() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fcmpl");
  }

  public void fconst_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fconst_0");
  }

  public void fconst_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fconst_1");
  }

  public void fconst_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fconst_2");
  }

  public void fdiv() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fdiv");
  }

  public void fload(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "fload", localVarIndex);
  }

  public void fload_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fload_0");
  }

  public void fload_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fload_1");
  }

  public void fload_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fload_2");
  }

  public void fload_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fload_3");
  }

  public void fmul() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fmul");
  }

  public void fneg() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fneg");
  }

  public void frem() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "frem");
  }

  public void freturn() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "freturn");
  }

  public void fstore(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "fstore", localVarIndex);
  }

  public void fstore_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fstore_0");
  }

  public void fstore_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fstore_1");
  }

  public void fstore_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fstore_2");
  }

  public void fstore_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fstore_3");
  }

  public void fsub() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "fsub");
  }

  public void getfield(int cpFieldRefIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\")\n", prefix, cf.getPc(), "getfield", cpFieldRefIndex,
            cf.fieldClassNameAt(cpFieldRefIndex),
            cf.fieldNameAt(cpFieldRefIndex),
            cf.fieldDescriptorAt(cpFieldRefIndex));
  }

  public void getstatic(int cpFieldRefIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\")\n", prefix, cf.getPc(), "getstatic", cpFieldRefIndex,
            cf.fieldClassNameAt(cpFieldRefIndex),
            cf.fieldNameAt(cpFieldRefIndex),
            cf.fieldDescriptorAt(cpFieldRefIndex));
  }

  public void goto_(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "goto", pcOffset, (cf.getPc() + pcOffset));
  }

  public void goto_w(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "goto_w", pcOffset, (cf.getPc() + pcOffset));
  }

  public void i2b() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "i2b");
  }

  public void i2c() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "i2c");
  }

  public void i2d() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "i2d");
  }

  public void i2f() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "i2f");
  }

  public void i2l() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "i2l");
  }

  public void i2s() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "i2s");
  }

  public void iadd() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iadd");
  }

  public void iaload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iaload");
  }

  public void iand() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iand");
  }

  public void iastore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iastore");
  }

  public void iconst_m1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iconst_m1");
  }

  public void iconst_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iconst_0");
  }

  public void iconst_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iconst_1");
  }

  public void iconst_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iconst_2");
  }

  public void iconst_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iconst_3");
  }

  public void iconst_4() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iconst_4");
  }

  public void iconst_5() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iconst_5");
  }

  public void idiv() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "idiv");
  }

  public void if_acmpeq(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_acmpeq", pcOffset, (cf.getPc() + pcOffset));
  }

  public void if_acmpne(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_acmpne", pcOffset, (cf.getPc() + pcOffset));
  }

  public void if_icmpeq(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_icmpeq", pcOffset, (cf.getPc() + pcOffset));
  }

  public void if_icmpne(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_icmpne", pcOffset, (cf.getPc() + pcOffset));
  }

  public void if_icmplt(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_icmplt", pcOffset, (cf.getPc() + pcOffset));
  }

  public void if_icmpge(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_icmpge", pcOffset, (cf.getPc() + pcOffset));
  }

  public void if_icmpgt(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_icmpgt", pcOffset, (cf.getPc() + pcOffset));
  }

  public void if_icmple(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "if_icmple", pcOffset, (cf.getPc() + pcOffset));
  }

  public void ifeq(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "ifeq", pcOffset, (cf.getPc() + pcOffset));
  }

  public void ifne(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "ifne", pcOffset, (cf.getPc() + pcOffset));
  }

  public void iflt(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "iflt", pcOffset, (cf.getPc() + pcOffset));
  }

  public void ifge(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "ifge", pcOffset, (cf.getPc() + pcOffset));
  }

  public void ifgt(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "ifgt", pcOffset, (cf.getPc() + pcOffset));
  }

  public void ifle(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "ifle", pcOffset, (cf.getPc() + pcOffset));
  }

  public void ifnonnull(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "ifnonnull", pcOffset, (cf.getPc() + pcOffset));
  }

  public void ifnull(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "ifnull", pcOffset, (cf.getPc() + pcOffset));
  }

  public void iinc(int localVarIndex, int incConstant) {
    pw.printf("%s%3d: %s [%d] %+d\n", prefix, cf.getPc(), "iinc", localVarIndex, incConstant);
  }

  public void iload(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "iload", localVarIndex);
  }

  public void iload_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iload_0");
  }

  public void iload_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iload_1");
  }

  public void iload_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iload_2");
  }

  public void iload_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iload_3");
  }

  public void imul() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "imul");
  }

  public void ineg() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ineg");
  }

  public void instanceof_(int cpClassIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\")\n", prefix, cf.getPc(), "instanceof", cpClassIndex, cf.classNameAt(cpClassIndex));
  }

  public void invokeinterface(int cpInterfaceMethodRefIndex, int count, int zero) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\") %d\n", prefix, cf.getPc(), "invokeinterface", cpInterfaceMethodRefIndex,
            cf.methodClassNameAt(cpInterfaceMethodRefIndex),
            cf.methodNameAt(cpInterfaceMethodRefIndex),
            cf.methodDescriptorAt(cpInterfaceMethodRefIndex),
            count);
  }

  public void invokespecial(int cpMethodRefIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\")\n", prefix, cf.getPc(), "invokespecial", cpMethodRefIndex,
            cf.methodClassNameAt(cpMethodRefIndex),
            cf.methodNameAt(cpMethodRefIndex),
            cf.methodDescriptorAt(cpMethodRefIndex));
  }

  public void invokestatic(int cpMethodRefIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\")\n", prefix, cf.getPc(), "invokestatic", cpMethodRefIndex,
            cf.methodClassNameAt(cpMethodRefIndex),
            cf.methodNameAt(cpMethodRefIndex),
            cf.methodDescriptorAt(cpMethodRefIndex));
  }

  public void invokevirtual(int cpMethodRefIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\")\n", prefix, cf.getPc(), "invokevirtual", cpMethodRefIndex,
            cf.methodClassNameAt(cpMethodRefIndex),
            cf.methodNameAt(cpMethodRefIndex),
            cf.methodDescriptorAt(cpMethodRefIndex));
  }

  public void ior() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ior");
  }

  public void irem() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "irem");
  }

  public void ireturn() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ireturn");
  }

  public void ishl() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ishl");
  }

  public void ishr() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ishr");
  }

  public void istore(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "istore", localVarIndex);
  }

  public void istore_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "istore_0");
  }

  public void istore_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "istore_1");
  }

  public void istore_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "istore_2");
  }

  public void istore_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "istore_3");
  }

  public void isub() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "isub");
  }

  public void iushr() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "iushr");
  }

  public void ixor() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ixor");
  }

  public void jsr(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "jsr", pcOffset, (cf.getPc() + pcOffset));
  }

  public void jsr_w(int pcOffset) {
    pw.printf("%s%3d: %s %+d (%d)\n", prefix, cf.getPc(), "jsr_w", pcOffset, (cf.getPc() + pcOffset));
  }

  public void l2d() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "l2d");
  }

  public void l2f() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "l2f");
  }

  public void l2i() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "l2i");
  }

  public void ladd() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ladd");
  }

  public void laload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "laload");
  }

  public void land() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "land");
  }

  public void lastore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lastore");
  }

  public void lcmp() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lcmp");
  }

  public void lconst_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lconst_0");
  }

  public void lconst_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lconst_1");
  }

  public void ldc_(int cpIntOrFloatOrStringIndex) {
    pw.printf("%s%3d: %s @%d(%s)\n", prefix, cf.getPc(), "ldc", cpIntOrFloatOrStringIndex,
            cf.getCpValue(cpIntOrFloatOrStringIndex));
  }

  public void ldc_w_(int cpIntOrFloatOrStringIndex) {
    pw.printf("%s%3d: %s @%d(%s)\n", prefix, cf.getPc(), "ldc_w", cpIntOrFloatOrStringIndex,
            cf.getCpValue(cpIntOrFloatOrStringIndex));
  }

  public void ldc2_w(int cpLongOrDoubleIndex) {
    pw.printf("%s%3d: %s @%d(%s)\n", prefix, cf.getPc(), "ldc2_w", cpLongOrDoubleIndex,
            cf.getCpValue(cpLongOrDoubleIndex));
  }

  public void ldiv() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "ldiv");
  }

  public void lload(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "lload", localVarIndex);
  }

  public void lload_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lload_0");
  }

  public void lload_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lload_1");
  }

  public void lload_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lload_2");
  }

  public void lload_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lload_3");
  }

  public void lmul() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lmul");
  }

  public void lneg() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lneg");
  }

  public void lookupswitch(int defaultPcOffset, int nEntries) {
    pw.printf("%s%3d: %s default:%+d\n", prefix, cf.getPc(), "lookupswitch", defaultPcOffset);
    cf.parseLookupSwitchEntries(this, nEntries);
  }
  public void lookupswitchEntry(int index, int match, int pcOffset){
    pw.printf("%s      %d : %+d (%d)\n", prefix, match, pcOffset, (cf.getPc() + pcOffset));
  }


  public void lor() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lor");
  }

  public void lrem() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lrem");
  }

  public void lreturn() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lreturn");
  }

  public void lshl() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lshl");
  }

  public void lshr() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lshr");
  }

  public void lstore(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "lstore", localVarIndex);
  }

  public void lstore_0() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lstore_0");
  }

  public void lstore_1() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lstore_1");
  }

  public void lstore_2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lstore_2");
  }

  public void lstore_3() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lstore_3");
  }

  public void lsub() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lsub");
  }

  public void lushr() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lushr");
  }

  public void lxor() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "lxor");
  }

  public void monitorenter() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "monitorenter");
  }

  public void monitorexit() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "monitorexit");
  }

  public void multianewarray(int cpClassIndex, int dimensions) {
    pw.printf("%s%3d: %s @%d(\"%s\") dim: %d\n", prefix, cf.getPc(), "multianewarray",
            cpClassIndex, cf.classNameAt(cpClassIndex), dimensions);
  }

  public void new_(int cpClassIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\")\n", prefix, cf.getPc(), "new",
            cpClassIndex, cf.classNameAt(cpClassIndex));
  }

  public void newarray(int typeCode) {
    pw.printf("%s%3d: %s %s[]\n", prefix, cf.getPc(), "newarray", cf.getTypeName(typeCode));
  }

  public void nop() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "nop");
  }

  public void pop() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "pop");
  }

  public void pop2() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "pop2");
  }

  public void putfield(int cpFieldRefIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\")\n", prefix, cf.getPc(), "putfield", cpFieldRefIndex,
            cf.fieldClassNameAt(cpFieldRefIndex),
            cf.fieldNameAt(cpFieldRefIndex),
            cf.fieldDescriptorAt(cpFieldRefIndex));
  }

  public void putstatic(int cpFieldRefIndex) {
    pw.printf("%s%3d: %s @%d(\"%s\",\"%s\",\"%s\")\n", prefix, cf.getPc(), "putstatic", cpFieldRefIndex,
            cf.fieldClassNameAt(cpFieldRefIndex),
            cf.fieldNameAt(cpFieldRefIndex),
            cf.fieldDescriptorAt(cpFieldRefIndex));
  }

  public void ret(int localVarIndex) {
    pw.printf("%s%3d: %s [%d]\n", prefix, cf.getPc(), "ret", localVarIndex);
  }

  public void return_() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "return");
  }

  public void saload() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "saload");
  }

  public void sastore() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "sastore");
  }

  public void sipush(int val) {
    pw.printf("%s%3d: %s %d\n", prefix, cf.getPc(), "sipush", val);
  }

  public void swap() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "swap");
  }

  public void tableswitch(int defaultPcOffset, int low, int high) {
    pw.printf("%s%3d: %s [%d..%d] default: %+d\n", prefix, cf.getPc(), "tableswitch", low, high, defaultPcOffset);
    cf.parseTableSwitchEntries(this, low, high);
  }
  public void tableswitchEntry(int val, int pcOffset){
    pw.printf("%s      %d: %+d (%d)\n", prefix, val, pcOffset, (cf.getPc() + pcOffset));
  }

  public void wide() {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "wide");
  }

  public void unknown(int bytecode) {
    pw.printf("%s%3d: %s\n", prefix, cf.getPc(), "");
  }


}
