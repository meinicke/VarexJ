//
// Copyright  (C) 2007 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
//  (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
//  (NOSA), version 1.3.  The NOSA has been approved by the Open Source
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
import java.nio.charset.CharsetDecoder;

public class JPF_java_io_InputStreamReader extends NativePeer {

  static final int BUF_SIZE = 128;
  
  // <2do> decoder should be stored on a per-reader basis, since Charsets
  // might differ
  CharsetDecoder decoder;
  
  // ..same here - that's a shared resource with state! Only works for now
  // since all InputStreamReader decoding is protected by the same lock
  ByteBuffer in = ByteBuffer.allocate(BUF_SIZE);
  CharBuffer out = CharBuffer.allocate(BUF_SIZE);
 
  public JPF_java_io_InputStreamReader() {
    decoder = Charset.defaultCharset().newDecoder();
  }
  
  @MJI
  public int decode___3BI_3CIZ__I (MJIEnv env, int objref,
                                         int bref, int len, int cref, int off,
                                         boolean endOfInput){
    int c = -1;
    int lim = in.limit();
    
    if (lim < in.capacity()){ // left-over bytes
      in.clear();
      in.position(lim);
    } else {
      decoder.reset();
    }
    for (int i=0; i<len; i++){
      in.put(env.getByteArrayElement(bref,i));
    }
    in.flip();
    
    decoder.decode(in,out,endOfInput);
    
    int n = out.position();
    for (int i=0, j=off; i<n; i++,j++){
      env.setCharArrayElement(cref,j, out.get(i));
    }
    out.clear();
    if (n == len){
      in.clear();
    }
    
    return n;
  }
  
  
  // <2do> - that fails if we have a multi byte char and there is a backtrack
  // between decode() calls. Granted, that seems strange, but there is an
  // InputStream.read() in the loop which might just branch into user code
  @MJI
  public int decode__IZ__I (MJIEnv env, int objref, int b, boolean endOfInput){
    int c = -1;
    int lim = in.limit();
    
    // this is terrible overhead to get a single char, I must be doing something wrong..
    
    if (lim < in.capacity()){ // left-over bytes
      in.clear();
      in.position(lim);
    } else {
      decoder.reset();
    }
    
    in.put((byte)b);
    in.flip();
    
    decoder.decode(in,out,endOfInput);

    if (out.position() == 1){
      c = out.get(0);
      out.clear();
      in.clear();
    }
    
    return c;
  }
}
