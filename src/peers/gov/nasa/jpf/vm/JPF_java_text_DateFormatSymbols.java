package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

import java.text.DateFormatSymbols;

import cmu.conditional.One;

public class JPF_java_text_DateFormatSymbols extends NativePeer {
  @MJI
  public void initializeData__Ljava_util_Locale_2__V (MJIEnv env, int objRef, int localeRef) {
    DateFormatSymbols dfs = new DateFormatSymbols();
    
    String[] eras = dfs.getEras();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "eras", env.newStringArray(NativeMethodInfo.CTX, eras));
    
    String[] months = dfs.getMonths();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "months", env.newStringArray(NativeMethodInfo.CTX, months));
    
    String[] shortMonths = dfs.getShortMonths();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "shortMonths", env.newStringArray(NativeMethodInfo.CTX, shortMonths));
    
    String[] weekdays = dfs.getWeekdays();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "weekdays", env.newStringArray(NativeMethodInfo.CTX, weekdays));
    
    String[] shortWeekdays = dfs.getShortWeekdays();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "shortWeekdays", env.newStringArray(NativeMethodInfo.CTX, shortWeekdays));
    
    String[] ampms = dfs.getAmPmStrings();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "ampms", env.newStringArray(NativeMethodInfo.CTX, ampms));
    
    String[][] zoneStrings = dfs.getZoneStrings();
    int aaref = env.newObjectArray("[Ljava.lang.String;", zoneStrings.length);
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "zoneStrings", aaref);
    for (int i=0; i<zoneStrings.length; i++){
      env.setReferenceArrayElement(NativeMethodInfo.CTX, aaref, i, new One<>(env.newStringArray(NativeMethodInfo.CTX, zoneStrings[i])));
    }
    
    String localPatternChars = dfs.getLocalPatternChars();
    env.setReferenceField(NativeMethodInfo.CTX, objRef, "localPatternChars", env.newString(NativeMethodInfo.CTX, localPatternChars));

  }
}
