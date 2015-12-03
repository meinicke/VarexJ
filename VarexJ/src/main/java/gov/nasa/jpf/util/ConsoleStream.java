//
// Copyright (C) 2006 United States Government as represented by the
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

import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JTextArea;

/**
 * a utility that can be used to write logs which are displayed in a JTextArea
 */
public class ConsoleStream extends PrintStream {
  OutputStream os;
  JTextArea textArea;
  
  public ConsoleStream (JTextArea textArea) {
    super(System.out, true);
    this.textArea = textArea;
  }
  
  public void write (byte[] buf, int off, int len) {
    String s = new String(buf, off, len);
    textArea.append(s);
  }
  
  public void print( String s) {
    //super.print(s);
    textArea.append(s);
  }
  
  public void println (String s) {
    //super.println(s);
    textArea.append(s);
    textArea.append("\n");
  }
  
  public void print (Object o) {
    textArea.append(o.toString());
  }
  
  public void println (Object o) {
    println(o.toString());
  }
  
  public void println() {
    textArea.append("\n");
  }
}