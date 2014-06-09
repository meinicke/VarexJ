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
package java.lang;

import java.io.File;

/**
 * MJI model class for java.lang.StackTraceElement
 */
public class StackTraceElement {
  String clsName;
  String fileName;
  String mthName;
  int    line;
  
  public StackTraceElement() {
     // nothing to do
  }

  public StackTraceElement (String clsName, String mthName, String fileName, int line) {
    if (clsName == null) {
      throw new NullPointerException("Declaring class is null");
    } 

    if (mthName == null) {
      throw new NullPointerException("Method name is null");
    }

    this.clsName = clsName;
    this.mthName = mthName;
    this.fileName = fileName;
    this.line = line;
  }

  public String getClassName () {
    return clsName;
  }

  public String getFileName () {
    return fileName;
  }

  public int getLineNumber () {
    return line;
  }

  public String getMethodName () {
    return mthName;
  }

  public boolean isNativeMethod () {
    return false;
  }

  /**
  public int hashCode () {
    return 0;
  }
  **/

  public String toString () {
    StringBuilder sb = new StringBuilder();
    sb.append(clsName);
    sb.append('.');
    sb.append(mthName);
    sb.append("(");

    sb.append(new File(fileName).getName());
    
    if (line >= 0){
      sb.append(':');
      sb.append(line);
    }
    sb.append(')');
    return sb.toString();
  }
}
