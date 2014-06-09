package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.util.Date;

public class JPF_java_util_Date extends NativePeer {

  static Date getDate (MJIEnv env, int dateRef){
    
    //<2do> that doesn't handle BaseCalendar.Date cdate yet
    long t = env.getLongField(dateRef, "fastTime");
    return new Date(t);
  }

  // avoid all the Calendar, TimeZone, CharSequence etc. frenzy just because
  // of a little Date conversion (that probably is only used in a print)
  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int dateRef){
    Date d = getDate(env,dateRef);
    String s = d.toString();

    int sRef = env.newString(s);
    return sRef;
  }
}
