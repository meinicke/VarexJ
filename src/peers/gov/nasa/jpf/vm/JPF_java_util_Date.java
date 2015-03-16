package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

import java.util.Date;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class JPF_java_util_Date extends NativePeer {

  static Date getDate (MJIEnv env, int dateRef, FeatureExpr ctx){
    
    //<2do> that doesn't handle BaseCalendar.Date cdate yet
    long t = env.getLongField(dateRef, "fastTime").simplify(ctx).getValue();
    return new Date(t);
  }

  // avoid all the Calendar, TimeZone, CharSequence etc. frenzy just because
  // of a little Date conversion (that probably is only used in a print)
  @MJI
  public int toString____Ljava_lang_String_2 (MJIEnv env, int dateRef, FeatureExpr ctx){
    Date d = getDate(env,dateRef, ctx);
    String s = d.toString();

    int sRef = env.newString(ctx, s);
    return sRef;
  }
}
