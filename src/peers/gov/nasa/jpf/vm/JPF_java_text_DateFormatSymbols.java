package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

import java.text.DateFormatSymbols;

public class JPF_java_text_DateFormatSymbols extends NativePeer {
  @MJI
  public void initializeData__Ljava_util_Locale_2__V (MJIEnv env, int objRef, int localeRef) {
    DateFormatSymbols dfs = new DateFormatSymbols();
    
    String[] eras = dfs.getEras();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "eras", env.newStringArray(eras));
    
    String[] months = dfs.getMonths();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "months", env.newStringArray(months));
    
    String[] shortMonths = dfs.getShortMonths();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "shortMonths", env.newStringArray(shortMonths));
    
    String[] weekdays = dfs.getWeekdays();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "weekdays", env.newStringArray(weekdays));
    
    String[] shortWeekdays = dfs.getShortWeekdays();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "shortWeekdays", env.newStringArray(shortWeekdays));
    
    String[] ampms = dfs.getAmPmStrings();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "ampms", env.newStringArray(ampms));
    
    String[][] zoneStrings = dfs.getZoneStrings();
    int aaref = env.newObjectArray("[Ljava.lang.String;", zoneStrings.length);
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "zoneStrings", aaref);
    for (int i=0; i<zoneStrings.length; i++){
      env.setReferenceArrayElement(aaref, i, env.newStringArray(zoneStrings[i]));
    }
    
    String localPatternChars = dfs.getLocalPatternChars();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "localPatternChars", env.newString(NativeMethodInfo.CTX, localPatternChars));

  }
}
