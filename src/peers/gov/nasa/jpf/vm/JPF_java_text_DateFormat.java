//
// Copyright (C) 2008 United States Government as represented by the
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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * this is just the minimal support for DateFormat.parse(String)
 */
public class JPF_java_text_DateFormat extends NativePeer {

  DateFormat getInstance (MJIEnv env, int objref) {
    Format fmt = JPF_java_text_Format.getInstance(env,objref);
    assert fmt instanceof SimpleDateFormat;

    return (DateFormat)fmt;
  }

  @MJI
  public void setTimeZone__Ljava_util_TimeZone_2__V(MJIEnv env, int objref,int timeZoneRef) {
    String timeZoneId = env.getStringField(timeZoneRef, "ID");
    TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
    DateFormat fmt = getInstance(env,objref);
    fmt.setTimeZone(timeZone);
    int calendarRef = env.getReferenceField(objref, "calendar");
    env.setReferenceField(calendarRef, "zone", timeZoneRef);
  }

  @MJI
  public int parse__Ljava_lang_String_2__Ljava_util_Date_2 (MJIEnv env, int objref, int strRef) {
    DateFormat f = getInstance(env,objref);
    String s = env.getStringObject(strRef);
    try {
      Date d = f.parse(s);
      long t = d.getTime();

      int dref = env.newObject("java.util.Date");
      env.setLongField(dref, "fastTime", t);
      return dref;

    } catch (ParseException px) {
      env.throwException("java.text.ParseException", px.getMessage());
      return 0;
    }
  }
  
  @MJI
  public void setLenient__Z__V (MJIEnv env, int objref, boolean isLenient) {
    DateFormat f = getInstance(env,objref);
    f.setLenient(isLenient);
  }
  
  @MJI
  public int format__Ljava_util_Date_2__Ljava_lang_String_2 (MJIEnv env, int objref, int dateRef) {
    DateFormat fmt = getInstance(env,objref);
    if (fmt != null) {
      Date d = env.getDateObject(dateRef);
      
      String s = fmt.format(d);
      int sref = env.newString(s);
      return sref;
    }
    
    return MJIEnv.NULL;
  }
}
