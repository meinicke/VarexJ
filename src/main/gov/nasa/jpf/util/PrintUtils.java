//
// Copyright (C) 2012 United States Government as represented by the
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

import gov.nasa.jpf.vm.MJIEnv;

import java.io.PrintStream;

public class PrintUtils {

  public static void printChar (PrintStream ps, char c){
    switch (c) {
    case '\n': ps.print("\\n"); break;
    case '\r': ps.print("\\r"); break;
    case '\t': ps.print("\\t"); break;
    case '\b': ps.print("\\b"); break;
    case '\f': ps.print("\\f"); break;
    case '\'': ps.print("\\'"); break;
    case '\"': ps.print("\\\""); break;
    case '\\': ps.print("\\"); break;
    default: ps.print(c);
    }
  }
  
  public static void printCharLiteral (PrintStream ps, char c){
    ps.print('\'');
    printChar(ps, c);
    ps.print('\'');
  }
  
  public static void printStringLiteral (PrintStream ps, char[] data, int max){
    int i;
    if (max < 0){
      max = data.length;
    }
    
    ps.print('"');
    for (i=0; i<max; i++){
      printChar(ps, data[i]);
    }
    
    if (i< data.length){
      ps.print("...");
    }
    
    ps.print('"');
  }
  
  // this is mostly here so that we use the same convention
  public static void printReference (PrintStream ps, int ref){
    if (ref == MJIEnv.NULL){
      ps.print("null");
    } else {
      ps.print('@');
      ps.printf("%x", ref);
    }
  }
}
