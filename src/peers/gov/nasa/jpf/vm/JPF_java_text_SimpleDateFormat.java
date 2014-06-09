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

import gov.nasa.jpf.Config;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * (incomplete) native peer for SimpleDateFormat. See Format for details
 * about native formatter delegation
 */
public class JPF_java_text_SimpleDateFormat extends NativePeer {

  SimpleDateFormat getInstance (MJIEnv env, int objref) {
    Format fmt = JPF_java_text_Format.getInstance(env,objref);
    assert fmt instanceof SimpleDateFormat;

    return (SimpleDateFormat)fmt;
  }

  @MJI
  public void init0____V (MJIEnv env, int objref) {
    SimpleDateFormat fmt = new SimpleDateFormat();
    JPF_java_text_Format.putInstance(env,objref,fmt);
  }

  @MJI
  public void init0__Ljava_lang_String_2__V (MJIEnv env, int objref, int patternref) {
    String pattern = env.getStringObject(patternref);

    SimpleDateFormat fmt = new SimpleDateFormat(pattern);
    JPF_java_text_Format.putInstance(env,objref,fmt);
  }

  @MJI
  public void init0__II__V (MJIEnv env, int objref, int timeStyle, int dateStyle) {
    // we are lost here - can't call this SimpleDateFormat ctor because it's package private
    // (this is called - and has to be intercepted - from the DateFormat.getInstance() factory)

    DateFormat fmt = null;

    if (timeStyle < 0) {
      fmt = DateFormat.getDateInstance(dateStyle);
    } else if (dateStyle < 0) {
      fmt = DateFormat.getTimeInstance(timeStyle);
    } else {
      fmt = DateFormat.getDateTimeInstance(dateStyle, timeStyle);
    }

    JPF_java_text_Format.putInstance(env,objref,fmt);
  }

  @MJI
  public int format0 (MJIEnv env, int objref, long dateTime) {
    Date date = new Date(dateTime);
    SimpleDateFormat f = getInstance(env,objref);
    String s = f.format(date);
    return env.newString(s);
  }
}
