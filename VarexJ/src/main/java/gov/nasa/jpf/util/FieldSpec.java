//
// Copyright (C) 2010 United States Government as represented by the
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
import gov.nasa.jpf.vm.FieldInfo;

/**
 * utility class that can match FieldInfos against specs.
 * if the class or name part are omitted, "*" is assumed
 * a preceeding '!' means the match is inverted
 *
 * spec examples
 *   "x.y.Foo.bar  : field 'bar' in class 'x.y.Foo'
 *   "x.y.Foo+.bar : all 'bar' fields in 'x.y.Foo' and all its supertypes
 *   "x.y.Foo.*"   : all fields of x.y.Foo
 *   "*.myData"    : all fields names 'myData'
 *   "!x.y.*"      : all fields of types outside types in package x.y
 */
public class FieldSpec extends FeatureSpec {

  /**
   * factory method that includes the parser
   */
  public static FieldSpec createFieldSpec (String s){
    ParseData d = new ParseData();

    s = s.trim();
    String src = s;

    s = parseInversion(s,d);
    parseTypeAndName(s,d);

    try {
      return new FieldSpec(src, d.typeSpec, d.nameSpec, d.matchInverted);
    } catch (IllegalArgumentException iax){
      return null;
    }
  }


  public FieldSpec (String rawSpec, String cls, String name, boolean inverted){
    super(rawSpec,cls,name,inverted);
  }

  public boolean matches (Object feature){
    if (feature instanceof FieldInfo){
      return matches( (FieldInfo) feature);
    } else {
      return false;
    }
  }

  public boolean matches (FieldInfo fi){

    ClassInfo ci = fi.getClassInfo();
    if (isMatchingType(ci)) {
      if (nameSpec.matches(fi.getName()) != matchInverted) {
        return true;
      }
    }

    return matchInverted;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("FieldSpec {");
    if (clsSpec != null){
      sb.append("clsSpec:\"");
      sb.append(clsSpec);
      sb.append('"');
    }
    if (nameSpec != null){
      sb.append(",nameSpec:\"");
      sb.append(nameSpec);
      sb.append('"');
    }
    sb.append('}');
    return sb.toString();
  }
}
