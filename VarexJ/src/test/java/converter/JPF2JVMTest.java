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
 * This class tests the conversion form JPF to JVM, and it works along its
 * corresponding native peer which is JPF_converter_JPF2JVMTest.
 * 
 * The methods of this class create JPF objects and classes, and by invoking
 * native methods, the JPF object/class is converted to the JVM ones in the
 * native peer which if the object/class is created as expected.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class JPF2JVMTest extends TestJPF {
  private final static String[] JPF_ARGS = {};

  private static MJIEnv env;

  public static void main (String[] args){
    runTestsOfThisClass(args);
  }

  public static void setEnv (MJIEnv env){
    JPF2JVMTest.env = env;
  }

  private native void convertStringTest (String s);

  @Test
  public void convertStringTest (){
    if (verifyNoPropertyViolation("+nhandler.delegateUnhandledNative")){
      String s = new String("Hello World");
      convertStringTest(s);
    }
  }

  private native void convertIntegerTest (Integer i);

  @Test
  public void convertIntegerTest (){
    if (verifyNoPropertyViolation()){
      Integer i = new Integer(100);
      convertIntegerTest(i);
    }
  }

  private native void convertArrayTest (String[] arr);

  @Test
  public void convertArrayTest (){
    if (verifyNoPropertyViolation()){
      String[] arr = { "e1", "e2", "e3" };
      convertArrayTest(arr);
    }
  }

  private native void convertHashMapTest (HashMap<Integer, String> map);

  @Test
  public void convertHashMapTest (){
    if (verifyNoPropertyViolation()){
      HashMap<Integer, String> map = new HashMap<Integer, String>();
      map.put(0, "zero");
      map.put(1, "one");
      map.put(2, "two");
      convertHashMapTest(map);
    }
  }

  public static class JPF2JVMTestConversion {
    protected static int i = 0;

    protected static void inc (int amount){
      i += amount;
    }
  }

  private native void convertClassTest (Class<?> cls);

  @Test
  public void convertClassTest (){
    if (verifyNoPropertyViolation()){
      JPF2JVMTestConversion.inc(10);
      convertClassTest(JPF2JVMTestConversion.class);
    }
  }
}
