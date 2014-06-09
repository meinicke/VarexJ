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

package java.io;


/**
 * how hard can it be to transform byte(s) into a char? I hate Unicode
 */
public class InputStreamReader extends Reader {

  static final int BUF_SIZE=128;
  private static Object lock = new Object(); // our peer has state
  
  InputStream in;
  byte[] bbuf = new byte[BUF_SIZE];
  String charSetName=null;
  
  public InputStreamReader (InputStream in){
    this.in = in;
  }  
  
  public InputStreamReader (InputStream in,String charSetName){
    this.in = in;
    this.charSetName = charSetName;
  }  
  
  public void close () throws IOException {
    in.close();
  }

  private native int decode (int b, boolean endOfInput);

  public boolean ready() {
    try {
      return (in.available() > 0);
    } catch (IOException iox){
      return false;
    }
  }
  
  public int read () throws IOException {    
    synchronized (lock){
      while (true){
        
        int b = in.read();
        if (b < 0){
          return -1;
        }

        int c = decode(b, (in.available() == 0));
        if (c >= 0 ) {
          return c;
        }
      }
    }
  }
    
  
  
  native int decode (byte[] inBuf,int len,
                            char[] outBuf, int off,
                            boolean endOfInput);

  
  public int read (char[] cbuf, int off, int len) throws IOException {
    int r = 0;
    boolean available = true;
    
    synchronized (lock){
      while (available && r < len){
        // <2do> - so what if that backtracks? the peer might have 
        // iteration-specific state that gets lost. see native peer comments        
        int b = in.read(bbuf, 0, Math.min(len-r,bbuf.length));
        if (b < 0){
          return (r == 0) ? -1 : r;
        }

        // true if we have not reach the end of the input stream "in"
        // and there are still more bytes available to be read
        available = (in.available() > 0);
        
        r += decode(bbuf,b, cbuf,off+r, !available);
      }
    }
      
    return r;
  }
  
}
