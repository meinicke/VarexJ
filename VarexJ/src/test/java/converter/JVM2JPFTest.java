/* 
 * Copyright (C) 2013  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

package converter;

import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.util.test.TestJPF;

import java.util.HashMap;

import org.junit.Test;

/**
 * This class tests the conversion form JVM to JPF, and it works along its
 * corresponding native peer which is JPF_converter_JVM2JPFTest.
 * 
 * The methods of this class create JPF objects/classes, and in the native
 * methods the similar objects/classes are first created in JVM, and then 
 * they are converted to JPF. Finally these testers check if the JPF 
 * objects/classes created directly in JPF are equal to (same as, for the 
 * case of classes) the converted ones returned by the native methods.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class JVM2JPFTest extends TestJPF {
  private final static String[] JPF_ARGS = {};

  private static MJIEnv env;

  public static void main (String[] args){
    runTestsOfThisClass(args);
  }

  public static void setEnv (MJIEnv env){
    JVM2JPFTest.env = env;
  }

  private native String createStringTest ();

  @Test
  public void convertStringTest (){
    if (verifyNoPropertyViolation()){
      String s1 = new String("Hello World");
      String s2 = createStringTest();

      assertEquals(s1, s2);
    }
  }

  private native Integer createIntegerTest ();

  @Test
  public void convertIntegerTest (){
    if (verifyNoPropertyViolation()){
      Integer i1 = new Integer(100);
      Integer i2 = createIntegerTest();

      assertEquals(i1, i2);
    }
  }

  private native String[] createArrayTest ();

  @Test
  public void convertArrayTest (){
    if (verifyNoPropertyViolation()){
      String[] arr1 = { "e1", "e2", "e3" };
      String[] arr2 = createArrayTest();

      assertEquals(arr1.length, arr2.length);
      assertEquals(arr1[0], arr2[0]);
      assertEquals(arr1[1], arr2[1]);
      assertEquals(arr1[2], arr2[2]);
    }
  }

  private native HashMap<Integer, String> createHashMapTest ();

  @Test
  public void convertHashMapTest (){
    if (verifyNoPropertyViolation()){
      HashMap<Integer, String> map1 = new HashMap<Integer, String>();
      map1.put(0, "zero");
      map1.put(1, "one");
      map1.put(2, "two");
      HashMap<Integer, String> map2 = createHashMapTest();

      assertEquals(map1, map2);
      assertEquals(map1.get(0), map2.get(0));
      assertEquals(map1.get(1), map2.get(1));
      assertEquals(map1.get(2), map2.get(2));
    }
  }

  public static class JVM2JPFTestConversion {
    protected static int i = 0;

    protected static void inc (int amount){
      i += amount;
    }

    protected static void set (int amount){
      i = amount;
    }
  }

  private native Class<?> createClassTest ();

  @Test
  public void convertClassTest () throws IllegalArgumentException, SecurityException, IllegalAccessException{
    if (verifyNoPropertyViolation()){
      Class<?> cls1 = createClassTest();
      Class<?> cls2 = JVM2JPFTestConversion.class;
      assertTrue(cls1 == cls2);
      assertEquals(JVM2JPFTestConversion.i, 10);
      assertEquals(cls1.getDeclaredFields()[0].getInt(cls1), 10);
    }
  }
}
