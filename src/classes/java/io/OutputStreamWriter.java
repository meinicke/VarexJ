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
package java.io;

import gov.nasa.jpf.vm.Verify;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * natively convert char output into byte output
 *
 * <2do> - this needs to be reworked. It trades locks for saving heap objects,
 * and that is a choice between a rock and a hard place. We shouldn't call
 * write() from within the native encode() (which we would have to since this
 * could be any OutputStream). We shouldn't create a very short
 * living JPF byte[] object per write() call, since that kills the heap. We
 * shouldn't use an explicit lock since that blows up the state space. That
 * leaves us with atomic sections, but it's not really safe since clients
 * might use their own OutputStream classes with synchronized write() methods.
 * At least this would not go unnoticed
 */
public class OutputStreamWriter extends Writer {

  static final int BUF_SIZE=128;
  //private static Object lock = new Object();
  
  OutputStream out;
  
  byte[] buf = new byte[BUF_SIZE*6]; // worst case UTF-8 
  
  public OutputStreamWriter(OutputStream os) {
    out = os;
  }
  
  public OutputStreamWriter(OutputStream os, Charset cs) {
    out = os;
    throw new UnsupportedOperationException("OutputStreamWriter model does not fully implement this constructor");
  }
  
  public OutputStreamWriter(OutputStream os, CharsetEncoder end) {
    out = os;
    throw new UnsupportedOperationException("OutputStreamWriter model does not fully implement this constructor");
  }
  
  public OutputStreamWriter(OutputStream os, String charsetName) {
    out = os;
    throw new UnsupportedOperationException("OutputStreamWriter model does not fully implement this constructor");
  }
  
  public void close() throws IOException {
    out.close();
  }
  
  public void flush() {
    // nothing
  }

  void flushBuffer() {
    // nothing
  }
  
  public native String getEncoding();
  
  native int encode (char[] cbuf, int off, int len, byte[] buf);
  
  public void write(char[] cbuf, int off, int len) throws IOException {
    int w=0;
    
    //synchronized(lock){
    Verify.beginAtomic();
      while (w < len){
        int n = encode(cbuf, off+w, len-w, buf);
        out.write(buf, 0, n);
        w += n;
      }
    Verify.endAtomic();
    //}
  }
  
  private native int encode (char c, byte[] buf);

  public void write (int c) throws IOException {
    //synchronized(lock){
    Verify.beginAtomic();
      int n = encode((char)c, buf);
      out.write(buf,0,n);
    Verify.endAtomic();
    //}
  }
  
  private native int encode (String s, int off, int len, byte[] buf);
  
  public void write(String s, int off, int len) throws IOException {
    int w=0;
    
    //synchronized(lock){
    Verify.beginAtomic();
      while (w < len){
        int n = encode(s, off+w, len-w, buf);
        out.write(buf, 0, n);
        w += n;
      }
    Verify.endAtomic();
    //}
  }
}
