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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

import java.util.Locale;

public class JPF_java_util_Locale extends NativePeer {

  static Locale getLocale (MJIEnv env, int locref) {

    //--- check first if it's one of the standard locales (ci is obviously loaded at this point
    ClassInfo ci = env.getClassInfo(locref);  // Locale is final, so we can do this
    ElementInfo sei = ci.getStaticElementInfo();

    if (locref == sei.getReferenceField("US")) return Locale.US;
    if (locref == sei.getReferenceField("GERMAN")) return Locale.GERMAN;
    if (locref == sei.getReferenceField("ENGLISH")) return Locale.ENGLISH;
    if (locref == sei.getReferenceField("FRENCH")) return Locale.FRENCH;
    if (locref == sei.getReferenceField("JAPANESE")) return Locale.JAPANESE;
    if (locref == sei.getReferenceField("CHINESE")) return Locale.CHINESE;
    //... we should have a bunch more


    //--- if it wasn't any of these, get the fields and just construct it

    String country, language, variant;
    FieldInfo fiBase = ci.getInstanceField("baseLocale");
    if (fiBase != null){ // Java >= 1.7
      int baseLocref = env.getReferenceField(locref, fiBase);
      country = env.getStringObject(env.getReferenceField(baseLocref,"region"));
      language = env.getStringObject(env.getReferenceField(baseLocref, "language"));
      variant = env.getStringObject(env.getReferenceField(baseLocref, "variant"));
            
    } else {  // Java < 1.7
      country = env.getStringObject(env.getReferenceField(locref,"country"));
      language = env.getStringObject(env.getReferenceField(locref, "language"));
      variant = env.getStringObject(env.getReferenceField(locref, "variant"));
    }
    
    Locale locale = new Locale(language,country,variant); 
    return locale;
  }
  
  @MJI
  public int getDisplayName__Ljava_util_Locale_2__Ljava_lang_String_2 (MJIEnv env, int objref, int locref) {
    Locale locale = getLocale(env, locref);
    String name = locale.getDisplayName();
    return env.newString(name);
  }
  
  @MJI
  public int getDisplayVariant__Ljava_util_Locale_2__Ljava_lang_String_2 (MJIEnv env, int objref, int locref) {
    Locale locale = getLocale(env, locref);
    String variant = locale.getDisplayVariant();
    return env.newString(variant);    
  }
  
  @MJI
  public int getDisplayCountry__Ljava_util_Locale_2__Ljava_lang_String_2 (MJIEnv env, int objref, int locref) {
    Locale locale = getLocale(env, locref);
    String country = locale.getDisplayCountry();
    return env.newString(country);

  }

  @MJI
  public int getDisplayLanguage__Ljava_util_Locale_2__Ljava_lang_String_2 (MJIEnv env, int objref, int locref) {
    Locale locale = getLocale(env, locref);
    String language = locale.getDisplayLanguage();
    return env.newString(language);
  }

  @MJI
  public int getISO3Country____Ljava_lang_String_2 (MJIEnv env, int objref) {
    Locale locale = getLocale(env, objref);
    String s = locale.getISO3Country();
    return env.newString(s);    
  }

  @MJI
  public int getISO3Language____Ljava_lang_String_2 (MJIEnv env, int objref) {
    Locale locale = getLocale(env, objref);
    String s = locale.getISO3Language();
    return env.newString(s);
  }

  //--- the static ones
  @MJI
  public int getISOCountries_____3Ljava_lang_String_2 (MJIEnv env, int clsref) {
    String[] s = Locale.getISOCountries();

    int aref = env.newObjectArray("java.lang.String", s.length);
    for (int i=0; i<s.length; i++) {
      env.setReferenceArrayElement(aref, i, env.newString(s[i]));
    }
    
    return aref;
  }
  
  @MJI
  public int getISOLanguages_____3Ljava_lang_String_2 (MJIEnv env, int clsref) {
    String[] s = Locale.getISOLanguages();

    int aref = env.newObjectArray("java.lang.String", s.length);
    for (int i=0; i<s.length; i++) {
      env.setReferenceArrayElement(aref, i, env.newString(s[i]));
    }
    
    return aref;    
  }

}
