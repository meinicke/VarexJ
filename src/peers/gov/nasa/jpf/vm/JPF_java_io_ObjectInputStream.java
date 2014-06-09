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

public class JPF_java_io_ObjectInputStream extends NativePeer {

  @MJI
  public int latestUserDefinedLoader____Ljava_lang_ClassLoader_2 (MJIEnv env, int clsRef){
    // class loaders are not yet supported
    return MJIEnv.NULL;
  }
  
  @MJI
  public void bytesToDoubles___3BI_3DII__ (MJIEnv env, int clsRef,
                                                  int baRef, int bOff,
                                                  int daRef, int dOff,
                                                  int nDoubles){
    int imax = dOff + nDoubles;
    int j=bOff;
    
    for (int i=dOff; i<imax; i++){
      byte b0 = env.getByteArrayElement(baRef, j++);
      byte b1 = env.getByteArrayElement(baRef, j++);
      byte b2 = env.getByteArrayElement(baRef, j++);
      byte b3 = env.getByteArrayElement(baRef, j++);
      byte b4 = env.getByteArrayElement(baRef, j++);
      byte b5 = env.getByteArrayElement(baRef, j++);
      byte b6 = env.getByteArrayElement(baRef, j++);
      byte b7 = env.getByteArrayElement(baRef, j++);
      
      long bits = 0x00000000000000ff & b7;
      bits <<= 8;
      bits |= 0x00000000000000ff & b6;
      bits <<= 8;
      bits |= 0x00000000000000ff & b5;
      bits <<= 8;
      bits |= 0x00000000000000ff & b4;
      bits <<= 8;
      bits |= 0x00000000000000ff & b3;
      bits <<= 8;
      bits |= 0x00000000000000ff & b2;
      bits <<= 8;
      bits |= 0x00000000000000ff & b1;
      bits <<= 8;
      bits |= 0x00000000000000ff & b0;
      
      double d = Double.longBitsToDouble(bits);
      env.setDoubleArrayElement(daRef, i, d);
    }
  }

  @MJI
  public void bytesToFloats___3BI_3FII__ (MJIEnv env, int clsRef,
                                                 int baRef, int bOff,
                                                 int faRef, int fOff,
                                                 int nFloats){
    int imax = fOff + nFloats;
    int j=bOff;

    for (int i=fOff; i<imax; i++){
      byte b0 = env.getByteArrayElement(baRef, j++);
      byte b1 = env.getByteArrayElement(baRef, j++);
      byte b2 = env.getByteArrayElement(baRef, j++);
      byte b3 = env.getByteArrayElement(baRef, j++);

      int bits = 0x000000ff & b3;
      bits <<= 8;
      bits |= 0x000000ff & b2;
      bits <<= 8;
      bits |= 0x000000ff & b1;
      bits <<= 8;
      bits |= 0x000000ff & b0;

      float f = Float.intBitsToFloat(bits);
      env.setFloatArrayElement(faRef, i, f);
    }
  }
}
