//
// Copyright (C) 2012 United States Government as represented by the
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

/**
 * wildcard supporting type specification to be used for JPF configuration.
 * This supports supertype spec ('+') and inversion ('-')
 * Examples:
 *   "x.y.Foo" : class x.y.Foo
 *   "+x.y.Foo" : everything that is an instance of x.y.Foo
 *   "x.y.*" : every class that starts with "x.y."
 *   "!x.y.*" : everything that does not start with "x.y."
 */
public class TypeSpec extends FeatureSpec {
  
  
  public static TypeSpec createTypeSpec (String s){
    ParseData d = new ParseData();

    s = s.trim();
    String src = s; // keep the original spec around

    s = parseInversion(s,d);
    parseType(s,d);
    
    try {
      return new TypeSpec(src, d.typeSpec, d.matchInverted);
    } catch (IllegalArgumentException iax){
      return null;
    }
  }
  
  protected TypeSpec (String rawSpec, String cls, boolean inverted){
    super(rawSpec,cls,null,inverted);
  }
  
  public boolean matches (Object o){
    if (o instanceof ClassInfo){
      return matches( (ClassInfo) o);
    } else {
      return false;
    }
  }
  
  public boolean matches (ClassInfo ci){
    return isMatchingType(ci);
  }
  
}
