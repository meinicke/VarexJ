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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

/**
 * MJI NativePeer class to intercept all System.out and System.err
 * printing. We handle all of this native, since it's already slow enough
 */
public class JPF_gov_nasa_jpf_ConsoleOutputStream extends NativePeer {
  
  /****************************************************************************
   * these are the native methods we intercept
   */

  @MJI
  public void $init____V (MJIEnv env, int objref) {
    // that's just a dummy because we have no OutputStream, which would cause
    // an exception in the PrintStream ctor
  }
  
  @MJI
  public void print__C__V (MJIEnv env, int objref, char c) {
    env.getVM().print(c);
  }

  @MJI
  public void print__D__V (MJIEnv env, int objref, double d) {
    env.getVM().print(d);
  }

  @MJI
  public void print__F__V (MJIEnv env, int objref, float f) {
    env.getVM().print(f);
  }

  @MJI
  public void print__I__V (MJIEnv env, int objref, int i) {
    env.getVM().print(i);
  }

  @MJI
  public void print__J__V (MJIEnv env, int objref, long j) {
    env.getVM().print(j);
  }

  @MJI
  public void print__Ljava_lang_String_2__V (MJIEnv env, int objRef,
                                                 int strRef) {
    env.getVM().print(env.getStringObject(strRef));
  }

  @MJI
  public void print__Z__V (MJIEnv env, int objref, boolean z) {
    env.getVM().print(z);
  }

  @MJI
  public void println____V (MJIEnv env, int objRef) {
    env.getVM().println();
  }

  @MJI
  public void println__C__V (MJIEnv env, int objref, char c) {
    env.getVM().print(c);
    env.getVM().println();
  }

  @MJI
  public void println__D__V (MJIEnv env, int objref, double d) {
    env.getVM().print(d);
    env.getVM().println();
  }

  @MJI
  public void println__F__V (MJIEnv env, int objref, float f) {
    env.getVM().print(f);
    env.getVM().println();
  }

  @MJI
  public void println__I__V (MJIEnv env, int objref, int i) {
    env.getVM().print(i);
    env.getVM().println();
  }

  @MJI
  public void println__J__V (MJIEnv env, int objref, long j) {
    env.getVM().print(j);
    env.getVM().println();
  }

  @MJI
  public void println__Ljava_lang_String_2__V (MJIEnv env, int objRef,
                                                   int strRef) {
    env.getVM().println(env.getStringObject(strRef));
  }

  @MJI
  public void write__I__V (MJIEnv env, int objRef, int b){
    env.getVM().print((char)(byte)b);
  }
  
  @MJI
  public void write___3BII__V (MJIEnv env, int objRef,
                                      int bufRef, int off, int len){
    
  }

  @MJI
  public void println__Z__V (MJIEnv env, int objref, boolean z) {
    env.getVM().print(z);
    env.getVM().println();
  }

  @MJI
  public int printf__Ljava_lang_String_2_3Ljava_lang_Object_2__Ljava_io_PrintStream_2
                   (MJIEnv env, int objref, int fmtRef, int argRef) {
    env.getVM().print(env.format(fmtRef,argRef));
    return objref;
  }
  
}
