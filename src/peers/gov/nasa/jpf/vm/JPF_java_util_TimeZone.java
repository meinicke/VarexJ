//
// Copyright (C) 2007 United States Government as represented by the
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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * native peer for java.util.TimeZone
 * 
 * this is a (mostly) delegating implementation that became necessary because TimeZone has been
 * considerably changed in Java 1.7 (OpenJDK) and we need a version that is compatible with
 * pre and post 1.7 releases
 */
public class JPF_java_util_TimeZone extends NativePeer {


  //--- internals
  static TimeZone tz; // only used within (atomic) peer methods so that we don't have to instantiate all the time
  
  // we have to keep optional defaults here so that we don't change the host environment
  static String defaultID;
  static int defaultRawOffset;
  
  static {
    getHostDefaultValues();
  }
  
  private static TimeZone getTimeZone (MJIEnv env, int objRef){
    int rawOffset = env.getIntField(NativeMethodInfo.CTX, objRef, "rawOffset").getValue().intValue();
    tz.setRawOffset(rawOffset);
    return tz;
  }

  //--- native methods
  
  //--- the factory methods
  @MJI
  public int getTimeZone__Ljava_lang_String_2__Ljava_util_TimeZone_2 (MJIEnv env, int clsObjRef, int idRef){
    String id = env.getStringObject(null, idRef);
    TimeZone tz = TimeZone.getTimeZone(id);
    
    int rawOffset = tz.getRawOffset();
    String realId = tz.getID(); // could have been changed if id was unknown
    FeatureExpr ctx = NativeMethodInfo.CTX;
	if (!realId.equals(id)){
      idRef = env.newString(ctx, realId);
    }

    int tzRef = env.newObject(ctx, "java.util.TimeZone");
    env.setReferenceField(ctx, tzRef, "ID", idRef);
    env.setIntField(ctx, tzRef, "rawOffset", new One<>(rawOffset));
    
    return tzRef;
  }
  
  static void getHostDefaultValues(){
    tz = TimeZone.getDefault();
    defaultID = tz.getID();
    defaultRawOffset = tz.getRawOffset();
  }
  
  @MJI
  public int createDefaultZone____Ljava_util_TimeZone_2 (MJIEnv env, int clsObjRef){
    FeatureExpr ctx = NativeMethodInfo.CTX;
	int idRef = env.newString(ctx, defaultID);

    int tzRef = env.newObject(ctx, "java.util.TimeZone");
    env.setReferenceField(ctx, tzRef, "ID", idRef);
    env.setIntField(ctx, tzRef, "rawOffset", new One<>(defaultRawOffset));
    
    return tzRef;
  }

  @MJI
  public void setDefaultValues__Ljava_util_TimeZone_2 (MJIEnv env, int clsObjRef, int tzRef){
    defaultID = env.getStringField(tzRef, "ID");
    defaultRawOffset = env.getIntField( NativeMethodInfo.CTX, tzRef, "rawOffset").getValue().intValue();
  }
  
  //--- the ID queries
  @MJI
  public int getAvailableIDs_____3Ljava_lang_String_2 (MJIEnv env, int clsObjRef){
    String[] ids = TimeZone.getAvailableIDs();
    return env.newStringArray(NativeMethodInfo.CTX, ids);
  }
  
  @MJI
  public int getAvailableIDs__I___3Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int rawOffset){
    String[] ids = TimeZone.getAvailableIDs(rawOffset);
    return env.newStringArray(NativeMethodInfo.CTX, ids);    
  }

  @MJI
  public void setID__Ljava_lang_String_2__V (MJIEnv env, int objRef, int idRef){
    String id = env.getStringObject(null, idRef);
    TimeZone tz = TimeZone.getTimeZone(id);
    
    int rawOffset = tz.getRawOffset();
    String realId = tz.getID(); // could have been changed if id was unknown
    if (!realId.equals(id)){
      idRef = env.newString(NativeMethodInfo.CTX, realId);
    }
    
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "ID", idRef);
    env.setIntField(NativeMethodInfo.CTX, objRef, "rawOffset", new One<>(rawOffset));
  }
  
  @MJI
  public int getOffset__IIIIII__I (MJIEnv env, int objRef,
      int era, int year, int month, int day, int dayOfWeek, int milliseconds){
    TimeZone tz = getTimeZone( env, objRef);
    return tz.getOffset(era, year, month, day, dayOfWeek, milliseconds);
  }

  @MJI
  public int getOffset__J__I (MJIEnv env, int objRef, long date){
    TimeZone tz = getTimeZone( env, objRef);
    return tz.getOffset(date);
  }
  
  // unfortunately, this is not public in Java 1.7, so we can't delegate w/o reflection
  @MJI
  public int getOffsets__J_3I__I (MJIEnv env, int objRef, long date, int offsetsRef){
    TimeZone tz = getTimeZone( env, objRef);
    
    int rawOffset = tz.getRawOffset();
    int dstOffset = 0;
    if (tz.inDaylightTime(new Date(date))) {
      dstOffset = tz.getDSTSavings();
    }
    
    if (offsetsRef != MJIEnv.NULL) {
      env.setIntArrayElement( NativeMethodInfo.CTX, offsetsRef, 0, new One<>(rawOffset));
      env.setIntArrayElement( NativeMethodInfo.CTX, offsetsRef, 1, new One<>(dstOffset));
    }
    
    return (rawOffset + dstOffset);
  }

  @MJI
  public boolean inDaylightTime__J__Z (MJIEnv env, int objRef, long time){
    Date date = new Date(time);
    TimeZone tz = getTimeZone( env, objRef);
    return tz.inDaylightTime(date);
  }
  
  @MJI
  public boolean useDaylightTime____Z (MJIEnv env, int objRef){
    TimeZone tz = getTimeZone( env, objRef);
    return tz.useDaylightTime();
  }

  @MJI
  public int getDSTSavings____I (MJIEnv env, int objRef){
    TimeZone tz = getTimeZone( env, objRef);
    return tz.getDSTSavings();    
  }

  @MJI
  public int getDisplayName__ZILjava_util_Locale_2__Ljava_lang_String_2 (MJIEnv env, int objRef,
                                       boolean daylight, int style, int localeRef) {
    TimeZone tz = getTimeZone(env, objRef);
    Locale displayLocale = JPF_java_util_Locale.getLocale(env, localeRef);
    String s = tz.getDisplayName(daylight, style, displayLocale);
    
    int sref = env.newString(NativeMethodInfo.CTX, s);
    return sref;
  }
  
}

