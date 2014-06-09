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

import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.Types;

import java.util.BitSet;

/**
 * utility class that can match methods/args against specs.
 * argument signatures can be given in dot notation (like javap), arguments
 * can be marked with a preceeding '^'
 * if the class or name part are omitted, "*" is assumed
 * a preceeding '!' means the match is inverted
 *
 * spec examples
 *   "x.y.Foo.*"
 *   "java.util.HashMap.add(java.lang.Object,^java.lang.Object)"
 *   "*.*(x.y.MyClass)"
 *   
 * Note: with a single '*' we can't tell if this is for the typename
 * or the method, so something like "java.*" is probably not doing
 * what you expect - it uses the wildcard for the method and 'java' for
 * the type
 *   
 * <2do> we should extend this to allow alternatives
 */
public class MethodSpec extends FeatureSpec {

  static class MethodParseData extends ParseData {
    String sigSpec;
  }

  static final char MARK = '^';  // to mark arguments

  String  sigSpec;  // this is only the argument part, including parenthesis
  BitSet  markedArgs;

  /**
   * factory method that includes the parser
   */
  public static MethodSpec createMethodSpec (String s){
    MethodParseData d = new MethodParseData();

    s = s.trim();
    String src = s;

    s = parseInversion(s,d);

    int i = s.indexOf(('('));
    if (i >= 0){ // we have a signature part
      int j = s.lastIndexOf(')');
      if (j > i){
        d.sigSpec = s.substring(i, j+1);
        s = s.substring(0, i);

      } else {
        return null; // error, unbalanced parenthesis
      }
    }

    parseTypeAndName(s,d);

    try {
      return new MethodSpec(src, d.typeSpec, d.nameSpec, d.sigSpec, d.matchInverted);
    } catch (IllegalArgumentException iax){
      return null;
    }
  }


  public MethodSpec (String rawSpec, String cls, String name, String argSig, boolean inverted){
    super(rawSpec,cls,name,inverted);

    if (argSig != null){
      parseSignature(argSig);
    }
  }

  /**
   * assumed to be comma separated type list using fully qualified dot notation 
   * like javap, but arguments can be marked with preceeding '^', 
   * like "(java.lang.String,^int[])"
   * spec includes parenthesis
   */
  void parseSignature (String spec){
    BitSet m = null;
    StringBuilder sb = new StringBuilder();
    String al = spec.substring(1, spec.length()-1);
    String[] args = al.split(",");

    sb.append('(');
    int i=0;
    for (String a : args){
      a = a.trim();
      if (a.length() > 0){
        if (a.charAt(0) == MARK){
          if (m == null){
            m = new BitSet(args.length);
          }
          m.set(i);
          a = a.substring(1);
        }
        String tc = Types.getTypeSignature(a, false);
        sb.append(tc);
        i++;

      } else {
        // error in arg type spec
      }
    }
    sb.append(')');

    sigSpec = sb.toString();
    markedArgs = m;
  }


  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("MethodSpec {");
    sb.append("matchInverted:");
    sb.append(matchInverted);
    if (clsSpec != null){
      sb.append(",clsSpec:\"");
      sb.append(clsSpec);
      sb.append('"');
    }
    if (nameSpec != null){
      sb.append(",nameSpec:\"");
      sb.append(nameSpec);
      sb.append('"');
    }
    if (sigSpec != null){
      sb.append(",sigSpec:\"");
      sb.append(sigSpec);
      sb.append('"');
    }
    if (markedArgs != null){
      sb.append(",marked:");
      sb.append(markedArgs);
    }
    sb.append('}');
    return sb.toString();
  }

  
  public BitSet getMarkedArgs () {
    return markedArgs;
  }

  public boolean isMarkedArg(int idx){
    return (markedArgs == null || markedArgs.get(idx));
  }


  //--- our matchers

  public boolean matches (Object feature){
    if (feature instanceof MethodInfo){
      return matches((MethodInfo)feature);
    } else {
      return false;
    }
  }

  public boolean matches (MethodInfo mi){
    boolean isMatch = false;

    ClassInfo ci = mi.getClassInfo();
    if (isMatchingType(ci)){
      if (nameSpec.matches(mi.getName())){
        if (sigSpec != null){
          // sigSpec includes '(',')' but not return type
          isMatch = mi.getSignature().startsWith(sigSpec);
        } else { // no sigSpec -> matches all signatures
          isMatch = true;
        }
      }
    }

    return (isMatch != matchInverted);
  }

  public boolean matches (String clsName, String mthName){
    boolean isMatch = clsSpec.matches(clsName) && nameSpec.matches(mthName);
    return isMatch != matchInverted;
  }

  public boolean matchesClass (String clsName){
    return clsSpec.matches(clsName) != matchInverted;
  }
}
