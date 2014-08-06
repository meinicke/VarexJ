package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

import java.text.DateFormatSymbols;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class JPF_java_text_DateFormatSymbols extends NativePeer {
  @MJI
  public void initializeData__Ljava_util_Locale_2__V (MJIEnv env, int objRef, int localeRef, FeatureExpr ctx) {
    DateFormatSymbols dfs = new DateFormatSymbols();
    
    String[] eras = dfs.getEras();
    env.setReferenceField(ctx, objRef, "eras", env.newStringArray(ctx, eras));
    
    String[] months = dfs.getMonths();
    env.setReferenceField(ctx, objRef, "months", env.newStringArray(ctx, months));
    
    String[] shortMonths = dfs.getShortMonths();
    env.setReferenceField(ctx, objRef, "shortMonths", env.newStringArray(ctx, shortMonths));
    
    String[] weekdays = dfs.getWeekdays();
    env.setReferenceField(ctx, objRef, "weekdays", env.newStringArray(ctx, weekdays));
    
    String[] shortWeekdays = dfs.getShortWeekdays();
    env.setReferenceField(ctx, objRef, "shortWeekdays", env.newStringArray(ctx, shortWeekdays));
    
    String[] ampms = dfs.getAmPmStrings();
    env.setReferenceField(ctx, objRef, "ampms", env.newStringArray(ctx, ampms));
    
    String[][] zoneStrings = dfs.getZoneStrings();
    int aaref = env.newObjectArray("[Ljava.lang.String;", zoneStrings.length);
    env.setReferenceField(ctx, objRef, "zoneStrings", aaref);
    for (int i=0; i<zoneStrings.length; i++){
      env.setReferenceArrayElement(ctx, aaref, i, new One<>(env.newStringArray(ctx, zoneStrings[i])));
    }
    
    String localPatternChars = dfs.getLocalPatternChars();
    env.setReferenceField(ctx, objRef, "localPatternChars", env.newString(ctx, localPatternChars));

  }
}
