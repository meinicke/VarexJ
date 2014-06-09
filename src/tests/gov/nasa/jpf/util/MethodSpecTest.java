//
// Copyright (C) 2011 United States Government as represented by the
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

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * unit test for MethodSpecs
 */
public class MethodSpecTest extends TestJPF {

  @Test
  public void testConstruction(){

    //-- should be all non-null
    String spec = "x.y.Foo.bar(java.lang.String,^float[])";
    MethodSpec ms = MethodSpec.createMethodSpec(spec);
    System.out.println(spec + " => " + ms);
    assertTrue(ms != null);

    spec = "x.y.Foo+.*";
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(spec + " => " + ms);
    assertTrue(ms != null);

    spec = "*.foo(^int, ^double)";
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(spec + " => " + ms);
    assertTrue(ms != null);

    spec = "( ^int, ^double)";
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(spec + " => " + ms);
    assertTrue(ms != null);

    spec = ".foo";
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(spec + " => " + ms);
    assertTrue(ms != null);

    spec = ".(int)";
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(spec + " => " + ms);
    assertTrue(ms != null);

    spec = "!java.*.*";  // first '*' belongs to class spec, second to method
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(ms);
    assertTrue(ms != null);

    spec = "java.*"; // not what you think - the class spec is "java" and the method is "*"
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(ms);
    

    //--- should all produce null

    spec = "*.foo(^int, ^double";  // missing ')'
    ms = MethodSpec.createMethodSpec(spec);
    System.out.println(spec + " => " + ms);
    assertTrue(ms == null);


    //System.out.println("matches (java.lang.Object,*): " +
    //                    ms.matches("java.lang.Object", "*"));

  }
}
