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

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

/**
 * regression test for IdentityArrayObjectSet
 */
public class IdentityArrayObjectSetTest extends TestJPF {

  @Test
  public void testBasic(){
    String a = "a";
    String b = "b";
    
    IdentityArrayObjectSet<String> s = new IdentityArrayObjectSet<String>();
    
    assertTrue(  s.isEmpty());
    System.out.println(s);

    assertTrue(  s.add(a));
    assertTrue(  s.size() == 1);
    assertTrue(  s.contains(a));
    System.out.println(s);
    
    assertFalse( s.add(a)); // already in
    assertTrue(  s.size() == 1);
    System.out.println(s);
    
    assertTrue(  s.add(b));
    assertTrue(  s.size() == 2);
    assertTrue(  s.contains(b));
    System.out.println(s);

    assertTrue(  s.remove(a));
    assertTrue(  s.size() == 1);
    assertFalse( s.contains(a));
    assertTrue(  s.contains(b));
    System.out.println(s);
    
    assertFalse( s.remove(a)); // can't remove it a second time
    System.out.println(s);
    
    assertTrue(  s.remove(b));
    assertTrue(  s.isEmpty());
    System.out.println(s);
  }
}
