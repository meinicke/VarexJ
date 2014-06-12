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

package java.text;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * (incomplete) model class for java.text.SimpleDate. See Format for details
 * about the native formatter delegation
 */
public class SimpleDateFormat extends DateFormat {

  // see DecimalFormat comments why we use explicit init0()'s

  private native void init0();
  private native void init0(String pattern);
  private native void init0(int timeStyle, int dateStyle);

  public SimpleDateFormat () {
    init0();
    initializeCalendar();
  }

  public SimpleDateFormat (String pattern) {
    if(pattern == null) {
      throw new NullPointerException();
    }
    init0(pattern);
    initializeCalendar();
  }

  public SimpleDateFormat (String pattern, Locale locale) {
    // <2do> bluntly ignoring locale for now
    this(pattern);
  }

  SimpleDateFormat (int timeStyle, int dateStyle, Locale locale){
    init0(timeStyle, dateStyle);
    initializeCalendar();
  }

  // unfortunately we can't override the DateFormat.format(String) because
  // it is final, and hence the compiler can do a INVOKE_SPECIAL
  native String format0 (long dateTime);

  public StringBuffer format (Date date, StringBuffer sb, FieldPosition pos) {
    String s = format0(date.getTime());
    sb.append(s);

    // we don't do FieldPositions yet

    return sb;
  }


  public Date parse (String arg0, ParsePosition arg1) {
    // TODO Auto-generated method stub
    return null;
  }

  private void initializeCalendar() {
    if (calendar == null) {
        calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
    }
  }

}
