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
package gov.nasa.jpf.test.java.text;

import gov.nasa.jpf.util.test.TestJPF;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Test;

public class SimpleDateFormatTest extends TestJPF {

  @Test
  public void testFormatWithTimeZone() {
    if (verifyNoPropertyViolation()) {
      SimpleDateFormat df = (SimpleDateFormat) DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
      TimeZone timeZone = TimeZone.getTimeZone("GMT");
      df.setTimeZone(timeZone);
      Calendar calendar = new GregorianCalendar(timeZone);
      calendar.set(2010, 10, 10, 10, 10, 10);
      String time = "10:10"; // some locales don't print the secs
      assertTrue(df.format(calendar.getTime(), new StringBuffer(), new FieldPosition(0)).toString().contains(time));
      df.setTimeZone(TimeZone.getTimeZone("EST"));
      time = "5:10"; // see above
      assertTrue(df.format(calendar.getTime(), new StringBuffer(), new FieldPosition(0)).toString().contains(time));
    }
  }
}
