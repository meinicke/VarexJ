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

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * native peer for OutputStreamWriter, to avoid that we have the
 * char-to-byte conversion in JPF
 *
 * <2do> this needs to be de-staticed (see model class)
 */
public class JPF_java_io_OutputStreamWriter extends NativePeer {

  static final int BUF_SIZE=128; // needs to be the same as in the model class!
  static CharsetEncoder encoder;
  
  static CharBuffer in = CharBuffer.allocate(BUF_SIZE);
  static ByteBuffer out = ByteBuffer.allocate(BUF_SIZE*6); // worst case UTF-8

  public JPF_java_io_OutputStreamWriter() {
    encoder = Charset.defaultCharset().newEncoder();
  }

  @MJI
  public int encode___3CII_3B__I (MJIEnv env, int objref,
                                         int cref, int off, int len,
                                         int bref){
    if (len > BUF_SIZE){ // check for buffer overflow
      len = BUF_SIZE;
    }
    int imax = off+len;

    out.clear();
    in.clear();
    
    for (int i=off; i<imax; i++){
      in.put(env.getCharArrayElement(cref, i));
    }

    in.flip();
    encoder.encode(in,out,true);
    
    int n = out.position();
    for (int i=0; i<n; i++){
      env.setByteArrayElement(bref,i,out.get(i));
    }
    
    return n;
  }
  
  @MJI
  public int encode__Ljava_lang_String_2II_3B__I (MJIEnv env, int objref,
                                         int sref, int off, int len,
                                         int bref){
    int cref = env.getReferenceField(sref, "value");
    
    return encode___3CII_3B__I(env,objref,cref,off,len,bref);
  }
  
  @MJI
  public int encode__C_3B__I (MJIEnv env, int objref, char c, int bufref) {
    out.clear();
    
    in.clear();
    in.put(c);
    in.flip();

    encoder.encode(in,out,true);
    
    int n = out.position();
    for (int i=0; i<n; i++){
      env.setByteArrayElement(bufref,i,out.get(i));
    }
    
    return n;
  }
}
