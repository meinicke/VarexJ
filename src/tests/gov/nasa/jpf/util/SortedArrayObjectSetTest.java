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
 * regression test for SortedArrayObjectSet
 */
public class SortedArrayObjectSetTest extends TestJPF {
  
  static class X implements Comparable<X> {
    String id;
    int x;
    
    X (String id, int x){
      this.id = id;
      this.x = x;
    }
    
    public int compareTo (X other){
      return (x - other.x);
    }
    
    public String toString(){
      return id;
    }
    
    public boolean equals(Object o){
      if (o instanceof X){
        X other = (X)o;
        if (x == other.x){
          if (id.equals(other.id)){
            return true;
          }
        }
      }
      
      return false;
    }
  }
  
  @Test
  public void testBasic(){
    SortedArrayObjectSet<X> s = new SortedArrayObjectSet<X>();
    
    X o1 = new X("1",1);
    X o2 = new X("20",20);
    X o3 = new X("5",5);
    X o4 = new X("7",7);
    
    s.add(o1);
    System.out.println(s);
    s.add(o2);
    System.out.println(s);
    s.add(o3);
    System.out.println(s);
    s.add(o4);
    System.out.println(s);
    s.add(o1);
    System.out.println(s);

    assertTrue(s.size() == 4);
    assertTrue(s.contains(o1));
    assertTrue(s.contains(o2));
    assertTrue(s.contains(o3));
    assertTrue(s.contains(o4));
    
    X o3a = new X("5a", 5);
    s.add(o3a);
    System.out.println(s);
    assertTrue(s.size() == 5);
    assertTrue(s.contains(o3a));
    
    s.remove(o3a);
    System.out.println(s);
    assertTrue(s.size() == 4);
    assertFalse(s.contains(o3a));
    assertTrue(s.contains(o3));
  }
}
