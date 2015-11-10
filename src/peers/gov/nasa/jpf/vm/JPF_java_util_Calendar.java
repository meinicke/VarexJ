package gov.nasa.jpf.vm;

import java.util.Calendar;
import java.util.Locale;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

public class JPF_java_util_Calendar extends NativePeer {

  @MJI
  public void setWeekCountData__Ljava_util_Locale_2__ (MJIEnv env, int objref, int localeRef, FeatureExpr ctx){
    Locale locale = JPF_java_util_Locale.getLocale(env, localeRef, ctx);
    Calendar c = Calendar.getInstance(locale);
    
    int n = c.getFirstDayOfWeek();
    env.setIntField(ctx, objref, "firstDayOfWeek", One.valueOf(n));
    
    n = c.getMinimalDaysInFirstWeek();
    env.setIntField(ctx, objref, "minimalDaysInFirstWeek", One.valueOf(n));
  }
  
}
