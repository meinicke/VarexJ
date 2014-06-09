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

package java.text;

public abstract class NumberFormat extends Format {

  static final int INTEGER_STYLE=0;
  static final int NUMBER_STYLE=1;
    
  public static NumberFormat getIntegerInstance() {
    return new DecimalFormat(INTEGER_STYLE);
  }
  
  public static NumberFormat getNumberInstance() {
    return new DecimalFormat(NUMBER_STYLE);
  }

  public static NumberFormat getInstance() {
    return new DecimalFormat(NUMBER_STYLE);
  }
  
  public void setMaximumFractionDigits (int newValue){
    // intercepted by native peer
  }
  public void setMaximumIntegerDigits (int newValue){
    // intercepted by native peer
  }
  public void setMinimumFractionDigits(int newValue){
    // intercepted by native peer
  }
  public void setMinimumIntegerDigits(int newValue){
    // intercepted by native peer
  }
  
  public String format (long number) {
    // intercepted by native peer
    return null;
  }
  
  public String format (double d) {
    // intercepted by native peer
    return null;
  }

  public final Object parseObject (String source, ParsePosition pos) {
    return parse(source,pos);
  }

  public void setParseIntegerOnly(boolean value) {
      // intercepted by native peer
  }

  public boolean isParseIntegerOnly() {
      // intercepted by native peer
      return false;
  }

  public boolean isGroupingUsed() {
      return false;
  }

  public void setGroupingUsed(boolean newValue) {
    // intercepted by native peer
  }

  public abstract Number parse(String source,ParsePosition pos);

  // ..and probably a lot missing
  
}
