//
// Copyright (C) 2013 United States Government as represented by the
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

package gov.nasa.jpf.util;

import gov.nasa.jpf.vm.ClassParseException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * common root for classes that read classes from binary data
 */
public class BinaryClassSource {

  protected byte[] data;
  
  protected int pos; // temp index value during parsing
  protected int pc; // bytecode pos relative to method code start
  
  protected int[] posStack;
  protected int top;
  
  protected BinaryClassSource (byte[] data, int pos){
   this.data = data;
   this.pos = pos;
  }
  
  protected BinaryClassSource (File file) throws ClassParseException {
    FileInputStream is = null;
    try {
      is = new FileInputStream(file);
      long len = file.length();
      if (len > Integer.MAX_VALUE || len <= 0){   // classfile of size > 2GB not supported
        error("cannot read file of size: " + len);
      }
      data = new byte[(int)len];
      readData(is);

    } catch (FileNotFoundException fnfx) {
      error("classfile not found: " + file.getPath());

    } finally {
      if (is != null) {
        try {
          is.close();
        } catch (IOException iox) {
          error("failed to close file: " + file.getPath());
        }
      }
    }
  }
  
  
  protected void readData (InputStream is) throws ClassParseException {
    try {
      int nRead = 0;

      while (nRead < data.length){
        int n = is.read(data, nRead, (data.length - nRead));
        if (n < 0){
          error("premature end of dex file: " + data.length + '/' + nRead);
        }
        nRead += n;
      }

    } catch (IOException iox){
      error("failed to read dex file");
    }
  }
  
  public void stopParsing(){
    throw new BailOut();
  }

  protected void error(String msg) throws ClassParseException {
    throw new ClassParseException(msg);
  }
  
  /**
   * obtain current classfile data. This is mainly provided to allow
   * on-the-fly classfile instrumentation with 3rd party libraries
   * 
   * BEWARE - this is not a copy, i.e. any modification of the returned data
   * might cause the parsing to fail.
   */
  public byte[] getData(){
    return data;
  }
  
  public int getPos(){
    return pos;
  }
  
  // for selective parsing
  public void setPos (int newPos){
    pos = newPos;
  }
  
  public void pushPos(){
    if (posStack == null){
      posStack = new int[4];
      posStack[0] = pos;
      top = 0;
    } else {
      top++;
      if (top == posStack.length){
        int[] newStack = new int[posStack.length * 2];
        System.arraycopy(posStack, 0, newStack, 0, posStack.length);
        posStack = newStack;
      }
      posStack[top] = pos;
    }
  }
  
  public void popPos(){
    if (top >= 0){
      pos = posStack[top];
      top--;
    }
  }
  
  //--- the low level type specific read methods
  
  public static String readModifiedUTF8String( byte[] data, int pos, int len) throws ClassParseException {
    
    int n = 0; // the number of chars in buf
    char[] buf = new char[len]; // it can't be more, but it can be less chars
    
    // \u0001 - \u007f             : single byte chars:  0xxxxxxx
    // \u0000 and \u0080 - \u07ff  : double byte chars:  110xxxxx, 10xxxxxx
    // \u0800 - \uffff             : tripple byte chars: 1110xxxx, 10xxxxxx, 10xxxxxx
    
    int max = pos+len;
    for (int i=pos; i<max; i++){
      int c = data[i] & 0xff;
      if ((c & 0x80) == 0){ // single byte char  0xxxxxxx
        buf[n++] = (char)c;
        
      } else {
        if ((c & 0x40) != 0){      // 11xxxxxx
          
          // for the sake of efficiency, we don't check for the trailing zero bit in the marker,
          // we just mask it out
          if ((c & 0x20) == 0) {   // 110xxxxx - double byte char
            buf[n++] = (char) (((c & 0x1f) << 6) | (data[++i] & 0x3f));
            
          } else {                 // 1110xxxx - tripple byte char
            buf[n++] = (char) (((c & 0x0f) << 12) | ((data[++i] & 0x3f) << 6) | (data[++i] & 0x3f));
          }
          
        } else {
          throw new ClassParseException("malformed modified UTF-8 input: ");
        }
      }
    }
    
    return new String(buf, 0, n);
  }
  
  public final int readByte(){
    return data[pos++];
  }

  public final int readUByte(){
    return (data[pos++] & 0xff);
  }
  
  public final byte[] read (int n){
    byte[] b = new byte[n];
    System.arraycopy(data,pos,b,0,n);
    pos += n;
    return b;
  }
  
  //--- debugging
  protected void dumpData (int startPos, int nBytes){
    System.out.printf("%d +%d: [", startPos, nBytes);
    for (int i=0; i<nBytes; i++){
      System.out.printf("%02X ", data[startPos+i]);
    }
    System.out.println(']');
  }
    
  protected String dataToString (int startPos, int nBytes){
    StringBuilder sb = new StringBuilder();
    int i1 = startPos + nBytes;
    for (int i=startPos; i<i1; i++){
      sb.append( Integer.toHexString(data[i]));
      sb.append(' ');
    }

    return sb.toString();
  }
}
