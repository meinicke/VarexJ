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

package java.util.regex;

/**
 * model of a regular expression matcher, to save memory and execution time
 */
public class Matcher {

  // this is the same trick like java.text.Format - avoiding a native
  // memory leak by means of overwriting a JPF state tracked index value
  // (well, it's still a leak since it never gets recycled unless we add a
  // finalizer, but it should be much less serious)
  static int nInstances;
  private int id = nInstances++; // just for peer implementation purposes 
  
  Pattern pattern;
  String input;    // that's an approximation (don't use CharSequence on the native side)
  
  Matcher() {
  }
  
  Matcher (Pattern pattern, CharSequence inp){
    this.pattern = pattern;
    this.input = inp.toString();
    
    register();
  }
  
  public Pattern pattern() {
    return pattern;
  }
  
  native void register();
  
  public native Matcher reset();
  
  public String group() {
    return group(0);
  }
  
  public native String group(int group);
  
  public native int groupCount();

  public Matcher reset(CharSequence inp) {
    this.input = inp.toString();
    return reset();
  }

  public native boolean matches();
  
  public native boolean find();
  
  public native boolean lookingAt();
  
  public int start() {
    return start(0);
  }
  
  public native int start(int group);
  
  public int end() {
    return end(0);
  }
  
  public native int end(int group);

  public native boolean hasTransparentBounds();

  public native Matcher useTransparentBounds(boolean b);

  public native boolean hasAnchoringBounds();

  public native Matcher useAnchoringBounds(boolean b);

  public native int regionStart();

  public native int regionEnd();

  public native Matcher region(int start, int end);

  public static native String quoteReplacement(String abc);

  public native String replaceAll(String replacement);

  public native String replaceFirst(String replacement);

  public native String toString();

  public native boolean hitEnd();

  public native boolean requireEnd();

  // TODO public native MatchResult toMatchResult();
  // TODO public native StringBuffer appendTail(StringBuffer sb);
  // TODO public native Matcher appendReplacement(StringBuffer sb, String replacement);
}
