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
 * simplified model of java.util.refex.Pattern, which otherwise
 * is very expensive in terms of state memory and execution costs
 */
public class Pattern {

  String regex;
  int flags;
  
  public static Pattern compile (String regex) {
    return new Pattern(regex, 0);
  }
  
  public static Pattern compile (String regex, int flags){
    return new Pattern(regex, flags);
  }
  
  private Pattern (String regex, int flags){
    this.regex = regex;
    this.flags = flags;
  }
  
  public Matcher matcher (CharSequence input){
    return new Matcher(this, input);
  }
  
  public String pattern() {
    return regex;
  }
  
  public String[] split (CharSequence input){
    return split(input,0);
  }

  public String[] split (CharSequence input, int limit){
    return split0(input.toString(), limit); // just to avoid the CharSequence charAt() hassle on the native side
  }

  private native String[] split0(String input, int limit);
  
  public String toString() {
    return regex;
  }
}
