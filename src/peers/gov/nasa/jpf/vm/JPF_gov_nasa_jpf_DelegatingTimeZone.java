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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.util.Date;
import java.util.TimeZone;

/**
 * native peer for JPFs concrete TimeZone class, which is just delegating to the
 * host VM so that we are independent of Java versions 
 */
public class JPF_gov_nasa_jpf_DelegatingTimeZone extends NativePeer {

  //--- internals
  TimeZone tz; // only used within (atomic) peer methods
  
  private TimeZone getTimeZone (MJIEnv env, int objRef){
    int rawOffset = env.getIntField(objRef, "rawOffset");
    tz.setRawOffset(rawOffset);
    return tz;
  }

  //--- native methods
  @MJI
  public void setID__Ljava_lang_String_2__V (MJIEnv env, int objRef, int idRef){
    String id = env.getStringObject(idRef);
    TimeZone tz = TimeZone.getTimeZone(id);
    int rawOffset = tz.getRawOffset();
    
    env.setReferenceField(objRef, "ID", idRef);
    env.setIntField(objRef, "rawOffset", rawOffset);
  }
  
  @MJI
  public int getOffset__IIIIII__I (MJIEnv env, int objRef,
      int era, int year, int month, int day, int dayOfWeek, int milliseconds){
    TimeZone tz = getTimeZone( env, objRef);
    return tz.getOffset(era, year, month, day, dayOfWeek, milliseconds);
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
}
