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
package gov.nasa.jpf.test.java.lang;

import gov.nasa.jpf.util.test.TestJPF;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Ignore;
import org.junit.Test;

/**
 * regression test for java.lang.Integer
 */
public class BoxObjectCacheTest extends TestJPF {
  private final static String[] JPF_ARGS = { "+vm.cache.low_byte=-100",
                                             "+vm.cache.high_byte=100",
                                             "+vm.cache.high_char=100",
                                             "+vm.cache.low_short=-100",
                                             "+vm.cache.high_short=100",
                                             "+vm.cache.low_int=-100",
                                             "+vm.cache.high_int=100",
                                             "+vm.cache.low_long=-100",
                                             "+vm.cache.high_long=100"}; 

  @Test
  public void testIntCache(){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Integer i1 = Integer.valueOf( 1);        // should be cached
      assertTrue( i1.intValue() == 1);
      
      Integer i2 = Integer.parseInt("1");
      assertTrue( i1 == i2);
      
      i1 = Integer.valueOf(110); // should be too large for cache
      assertTrue( i1.intValue() == 110);
      
      i2 = Integer.parseInt("110");
      assertTrue(i1 != i2);
    }
  }
  
  @Test
  public void testCharacterCache(){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Character c1 = Character.valueOf( '?');        // should be cached
      assertTrue( c1.charValue() == '?');
      
      Character c2 = '?'; // compiler does the boxing
      assertTrue( c1 == c2);
      
      c1 = Character.valueOf( '\u2107' ); // epsilon, if I'm not mistaken
      assertTrue( c1.charValue() == '\u2107');
      
      c2 = '\u2107'; // compiler does the boxing
      assertTrue(c1 != c2);
    }
  }

  @Test
  public void testByteCache(){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Byte b1 = Byte.valueOf( (byte)1);        // should be cached
      assertTrue( b1.byteValue() == 1);
      
      Byte b2 = Byte.parseByte("1");
      assertTrue( b1 == b2);
    }
  }

  @Test
  public void testShortCache(){
   if (verifyNoPropertyViolation(JPF_ARGS)){
     Short s1 = Short.valueOf((short)1);        // should be cached
     assertTrue( s1.shortValue() == 1);
     
     Short s2 = Short.parseShort("1");
     assertTrue( s1 == s2);
      
     s1 = Short.valueOf((short)110); // should be too large for cache
     assertTrue( s1.shortValue() == (short)110);
      
     s2 = Short.parseShort("110");
     assertTrue(s1 != s2);
    }
  }
  @Ignore// not native anymore
  @Test
  public void testLongCache(){
   if (verifyNoPropertyViolation(JPF_ARGS)){
     Long l1 = Long.valueOf((long)1);        // should be cached
     assertTrue( l1.longValue() == 1);
     
     Long l2 = Long.parseLong("1");
     assertTrue( l1 == l2);
      
     l1 = Long.valueOf((long)110); // should be too large for cache
     assertTrue( l1.longValue() == (long)110);
      
     l2 = Long.parseLong("110");
     assertTrue(l1 != l2);
    }
  }  

  @Test
  public void testBooleanCache(){
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Boolean b1 = Boolean.valueOf(true);        // should be cached
      assertTrue( b1.booleanValue() == true);
      
      Boolean b2 = Boolean.parseBoolean("true");
      assertTrue( b1 == b2);
    }
  }

  @Test
  public void testIntCacheBoxObject() throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Integer i1 = Integer.valueOf( 1);        // should be cached
      assertTrue( i1.intValue() == 1);
      
      Integer i2 = new Integer(1);
      Method m = Integer.class.getMethod("intValue", new Class[0]);
      Integer i3 = (Integer) m.invoke(i2, new Object[0]);
      assertTrue( i1 == i3);
    }
  }

//  @Test // no longer in peers
  public void testCharacterCacheBoxObject() throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Character c1 = Character.valueOf( '?');        // should be cached
      assertTrue( c1.charValue() == '?');
      
      Character c2 = new Character('?');
      Method m = Character.class.getMethod("charValue", new Class[0]);
      Character c3 = (Character) m.invoke(c2, new Object[0]);
      assertTrue( c1 == c3);
    }
  }

  @Ignore/* getValue no longer handled with peer class */ @Test
  public void testByteCacheBoxObject() throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Byte b1 = Byte.valueOf( (byte)1);        // should be cached
      assertTrue( b1.byteValue() == 1);
      
      Byte b2 = new Byte((byte)1);
      Method m = Byte.class.getMethod("byteValue", new Class[0]);
      Byte b3 = (Byte) m.invoke(b2, new Object[0]);
      assertTrue( b1 == b3);
    }
  }

  @Test
  public void testShortCacheBoxObject() throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Short s1 = Short.valueOf((short)1);        // should be cached
      assertTrue( s1.shortValue() == 1);
      
      Short s2 = new Short((short)1);
      Method m = Short.class.getMethod("shortValue", new Class[0]);
      Short s3 = (Short) m.invoke(s2, new Object[0]);
      assertTrue( s1 == s3);
    }
  }

  @Ignore// not native anymore
  @Test
  public void testLongCacheBoxObject() throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Long l1 = Long.valueOf((long)1);        // should be cached
      assertTrue( l1.longValue() == 1);
      
      Long l2 = new Long((long)1);
      Method m = Long.class.getMethod("longValue", new Class[0]);
      Long l3 = (Long) m.invoke(l2, new Object[0]);
      assertTrue( l1 == l3);
    }
  }

  @Test
  public void testBooleanCacheBoxObject() throws SecurityException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
    if (verifyNoPropertyViolation(JPF_ARGS)){
      Boolean b1 = Boolean.valueOf(true);        // should be cached
      assertTrue( b1.booleanValue() == true);
      
      Boolean b2 = new Boolean(true);
      Method m = Boolean.class.getMethod("booleanValue", new Class[0]);
      Boolean b3 = (Boolean) m.invoke(b2, new Object[0]);
      assertTrue( b1 == b3);
    }
  }
}