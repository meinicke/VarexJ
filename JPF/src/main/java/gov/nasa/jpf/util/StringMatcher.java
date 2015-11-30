//
// Copyright (C) 2009 United States Government as represented by the
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

package gov.nasa.jpf.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * simple wrapper around Patter/Matcher pairs, with patterns using '*' wildcards
 * same as StringSetMatcher but for single patterns
 */
public class StringMatcher {

  boolean isAnyPattern; // do we have a universal '*' pattern?

  Pattern pattern;
  Matcher matcher;

  public static boolean hasWildcard (String patternSpec){
    return (patternSpec.indexOf('*') >= 0);
  }

  public StringMatcher (String patternSpec){
    if (patternSpec.equals("*")) {
      isAnyPattern = true;
      // no need to compile this

    } else {
      Pattern p = createPattern(patternSpec);
      pattern = p;
      matcher = p.matcher(""); // gets reset upon use
    }
  }

  protected Pattern createPattern (String s){
    Pattern p;

    StringBuilder sb = new StringBuilder();

    int len = s.length();
    for (int j=0; j<len; j++){
      char c = s.charAt(j);
      switch (c){
      case '.' : sb.append("\\."); break;
      case '$' : sb.append("\\$"); break;
      case '[' : sb.append("\\["); break;
      case ']' : sb.append("\\]"); break;
      case '*' : sb.append(".*"); break;
      case '(' : sb.append("\\("); break;
      case ')' : sb.append("\\)"); break; 
      // <2do> and probably more..
      default:   sb.append(c);
      }
    }

    p = Pattern.compile(sb.toString());
    return p;
  }

  public boolean matches (String s){
    if (isAnyPattern){
      return true;
    } else {
      matcher.reset(s);
      return matcher.matches();
    }
  }

  public String toString() {
    if (isAnyPattern){
      return ".*";
    } else {
      return pattern.toString();
    }
  }
}
