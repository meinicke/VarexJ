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

import java.util.Arrays;

/**
 * right justified output
 * <2do> this is not worth a class! use a general TextFormatter
 */

public class Right {
  public static String format (String value, int spaces, char ch) {
    int vlen = value.length();
    int newLen = Math.max(spaces, vlen);
    char[] result = new char[newLen];
    int pivot = newLen - vlen;
    value.getChars(0, vlen, result, pivot);
    Arrays.fill(result, 0, pivot, ch);
    return new String(result);
  }

  public static String format (String value, int spaces) {
    return format(value, spaces, ' ');
  }

  public static String format (int value, int digits) {
    return format(Integer.toString(value),digits,' ');
  }
}
