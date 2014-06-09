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
package java.util;

import java.io.Serializable;
import java.util.Date;

/**
 * a concrete TimeZone that forwards to the host VM. This is required to avoid Java version compatibility
 * problems
 * Note that we drop the abstract modifier
 */
public class TimeZone implements Serializable, Cloneable {

  private static final long serialVersionUID = 1L;

  private int rawOffset; 
  private String ID;
  
  private static TimeZone defaultZone;
  
  // public styles
  public static final int SHORT = 0;
  public static final int LONG = 1;
  
  // we keep construction on the peer side
  private static native TimeZone createDefaultZone();
  
  // both are always cloned
  public static native TimeZone getTimeZone (String ID);
  public static TimeZone getDefault() {
    return (TimeZone) (getDefaultRef().clone());
  }

  // called internally (e.g. by java.util.Date) - no clone here
  static TimeZone getDefaultRef(){
    if (defaultZone == null){
      defaultZone = createDefaultZone();
    }
    
    return defaultZone;
  }
  
  // clone handles CloneNotSupportedException
  public Object clone() {
    try {
      return (TimeZone) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new InternalError();
    }
  }
  
  public static void setDefault (TimeZone tz) {
    if (tz == null){ // that's a reset according to the API docs
      defaultZone = createDefaultZone();
    } else {
      defaultZone = tz;
    }
    
    setDefaultValues(defaultZone); // remember on the native side
  }
  private static native void setDefaultValues (TimeZone tz); 
  
  public static native String[] getAvailableIDs();
  public static native String[] getAvailableIDs(int rawOffset);
  
  // the public TimeZone() constructor of the original class can only be called from the
  // concrete derived classes we want to skip anyways
  
  public TimeZone (String ID){
    setID(ID);
  }
 
  // this will set ID and rawOffset
  public native void setID (String ID);
  
  public String getID (){
    return ID;
  }
  
  public native int getOffset (int era, int year, int month, int day, int dayOfWeek, int milliseconds);

  public native int getOffset (long date);
  
  // this is not public in Java 1.7
  native int getOffsets (long date, int[] offsets);
  
  public int getRawOffset (){
    return rawOffset;
  }
  public void setRawOffset (int offsetMillis){
    rawOffset = offsetMillis;
  }
  
  public boolean inDaylightTime (Date date) {
    return inDaylightTime(date.getTime());
  }
  private native boolean inDaylightTime (long time); 


  public native boolean useDaylightTime();

  public native boolean observesDaylightTime();
  
  public native int getDSTSavings();
  
  public String getDisplayName(){
    // <2do> should use Locale.Category.DISPLAY in Java 1.7
    return getDisplayName( false, LONG, Locale.getDefault());
  }
  public String getDisplayName (Locale locale) {
    return getDisplayName( false, LONG, locale);    
  }
  public String getDisplayName (boolean daylight, int style){
    return getDisplayName( daylight, style, Locale.getDefault());    
  }
  public native String getDisplayName (boolean daylight, int style, Locale locale);
}
