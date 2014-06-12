//
// Copyright (C) 2014 United States Government as represented by the
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

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.util.Locale;

/**
 * a PrintStream that doesn't print anything
 */
public class DevNullPrintStream extends PrintStream {
  
  public DevNullPrintStream(){
    super( new ByteArrayOutputStream());
  }
  
  public void flush(){}
  public void close(){}
  public boolean checkError(){
    return false;
  }
  protected void setError(){}
  protected void clearError(){}
  
  public void write(int a){}
  public void write(byte[] a, int b, int c){}
  public void print(boolean a){}
  public void print(char a){}
  public void print(int a){}
  public void print(long a){}
  public void print(float a){}
  public void print(double a){}
  public void print(char[] a){}
  public void print(String a){}
  public void print(Object a){}
  public void println(){}
  public void println(boolean a){}
  public void println(char a){}
  public void println(int a){}
  public void println(long a){}
  public void println(float a){}
  public void println(double a){}
  public void println(char[] a){}
  public void println(String a){}
  public void println(Object a){}
  
  public PrintStream printf(String a, Object... b){ return this; }
  public PrintStream printf(Locale a, String b, Object... c){ return this; }
  public PrintStream format(String a, Object... b){ return this; }
  public PrintStream format(Locale a, String b, Object... c){ return this; }
  public PrintStream append(CharSequence a){ return this; }
  public PrintStream append(CharSequence a, int b, int c){ return this; }
  public PrintStream append(char a){ return this; }

}
