package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.util.Calendar;
import java.util.Locale;

public class JPF_java_util_Calendar extends NativePeer {

  @MJI
  public void setWeekCountData__Ljava_util_Locale_2__ (MJIEnv env, int objref, int localeRef){
    Locale locale = JPF_java_util_Locale.getLocale(env, localeRef);
    Calendar c = Calendar.getInstance(locale);
    
    int n = c.getFirstDayOfWeek();
    env.setIntField(objref, "firstDayOfWeek", n);
    
    n = c.getMinimalDaysInFirstWeek();
    env.setIntField(objref, "minimalDaysInFirstWeek", n);
  }
  
}
