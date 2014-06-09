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

/**
 * <2do> this class is a Q&D version to get some support for NumberFormats -
 * something we aren't too interested in yet. The model side has to be extended
 * to include all the delegation, but the real work should happen on the
 * peer side by forwarding to the real classes
 */

public class DecimalFormat extends NumberFormat implements Cloneable{
  private static final long serialVersionUID = 1L;

  /*
   * NOTE: if we would directly intercept the ctors, we would have to
   * explicitly call the superclass ctors from the native peer
   * (the 'id' handle gets initialized in the java.text.Format ctor) 
   */
  private native void init0();
  private native void init0(String pattern);
  private native void init0(int style);
  
  public DecimalFormat () {
    init0();
  }
  
  public DecimalFormat (String pattern) {
    init0(pattern);
  }
  
  public DecimalFormat(String pattern, DecimalFormatSymbols symbols) {
    // <2do> that's incomplete - has to delegate to the DecimalFormatSymbols
    // object, but should do so here in the model not the peer
    this(pattern);
  }
  
  DecimalFormat (int style) {
    init0(style);
  }
  // intercepted by native peer
  
  public StringBuffer format (Object obj, StringBuffer toAppendTo, FieldPosition pos) {
    // works for use case where pos = new FieldPosition(0)
    toAppendTo.append(obj.toString());
    return toAppendTo;
  }

  public Number parse(String source, ParsePosition pos){
    // interceptted by native peer
    return null;
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
  
  public String format (double number) {
    // intercepted by native peer
    return null;
  }

  public DecimalFormatSymbols getDecimalFormatSymbols() {
      return new DecimalFormatSymbols();
  }

  public String getPositivePrefix() {
      return "";
  }

  public String getNegativePrefix() {
      return "-";
  }

  public String getPositiveSuffix() {
      return "";
  }

  public String getNegativeSuffix() {
      return "";
  }

  public boolean isGroupingUsed() {
      return false;
  }

  public void setGroupingUsed(boolean newValue) {
    // intercepted by native peer
  }

  public boolean isParseIntegerOnly() {
      return false;
  }

  public void setParseIntegerOnly(boolean value) {
      // intercepted by native peer
  }
  // and probably a lot missing
}
