package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

import java.util.Calendar;
import java.util.Locale;

import cmu.conditional.One;

public class JPF_java_util_Calendar extends NativePeer {

  @MJI
  public void setWeekCountData__Ljava_util_Locale_2__ (MJIEnv env, int objref, int localeRef){
    Locale locale = JPF_java_util_Locale.getLocale(env, localeRef);
    Calendar c = Calendar.getInstance(locale);
    
    int n = c.getFirstDayOfWeek();
    env.setIntField(NativeMethodInfo.CTX, objref, "firstDayOfWeek", new One<>(n));
    
    n = c.getMinimalDaysInFirstWeek();
    env.setIntField(NativeMethodInfo.CTX, objref, "minimalDaysInFirstWeek", new One<>(n));
  }
  
}
