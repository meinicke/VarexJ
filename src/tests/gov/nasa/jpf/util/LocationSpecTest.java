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

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

/**
 * unit test for gov.nasa.jpf.util.LocationSpec
 */
public class LocationSpecTest extends TestJPF {

  @Test
  public void testSingleLocation() {
    LocationSpec ls = LocationSpec.createLocationSpec("Foobar.java:42");
    System.out.println("# testing: " + ls);

    assertTrue(ls.matchesFile("Foobar.java"));
    assertTrue(!ls.isLineInterval());
    assertTrue(ls.getLine() == 42);

    assertFalse(ls.matchesFile("Bull"));

    assertTrue(ls.matchesFile("/x/y/Foobar.java"));
  }

  @Test
  public void testAbsoluteLocation() {
    LocationSpec ls = LocationSpec.createLocationSpec("/x/y/z/Foobar.java:42");
    System.out.println("# testing: " + ls);

    assertTrue(ls.matchesFile("/x/y/z/Foobar.java"));
  }

  @Test
  public void testPlatformLocation() {
    LocationSpec ls = LocationSpec.createLocationSpec("C:\\x\\y\\z\\Foobar.java:42");
    System.out.println("# testing: " + ls);

    assertTrue(ls.matchesFile("C:\\x\\y\\z\\Foobar.java"));
    assertTrue(ls.getLine() == 42);
  }


  @Test
  public void testRelativeLocation() {
    LocationSpec ls = LocationSpec.createLocationSpec("x/y/z/Foobar.java:42");
    System.out.println("# testing: " + ls);

    assertTrue(ls.matchesFile("x/y/z/Foobar.java"));
  }

  @Test
  public void testWildcards() {
    LocationSpec ls = LocationSpec.createLocationSpec("x/*/Foo*.java:42");
    System.out.println("# testing: " + ls);

    assertTrue(ls.matchesFile("x/y/z/Foobar.java"));
    assertTrue(ls.matchesFile("Fooboo.java"));
  }

  @Test
  public void testAbsoluteRange(){
    LocationSpec ls = LocationSpec.createLocationSpec("Foobar.java:42-48");
    System.out.println("# testing: " + ls);

    assertTrue(ls.isLineInterval());
    assertTrue(ls.getFromLine() == 42);
    assertTrue(ls.getToLine() == 48);
  }

  @Test
  public void testRelativeRange(){
    LocationSpec ls = LocationSpec.createLocationSpec("Foobar.java:42+6");
    System.out.println("# testing: " + ls);

    assertTrue(ls.isLineInterval());
    assertTrue(ls.getFromLine() == 42);
    assertTrue(ls.getToLine() == 48);
  }

  @Test
  public void testOpenRange(){
    LocationSpec ls = LocationSpec.createLocationSpec("Foobar.java:42+");
    System.out.println("# testing: " + ls);

    assertTrue(ls.isLineInterval());
    assertTrue(ls.getFromLine() == 42);
    assertTrue(ls.getToLine() == Integer.MAX_VALUE);
  }

}
