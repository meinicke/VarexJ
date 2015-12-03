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

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.test.TestJPF;

import java.util.HashMap;

import nhandler.conversion.ConversionException;
import nhandler.conversion.ConverterBase;
import nhandler.conversion.jpf2jvm.JPF2JVMConverter;

import converter.JPF2JVMTest.JPF2JVMTestConversion;

/**
 * This is a native peer class which is used to test the conversion from JPF to
 * JVM. It works along with the test class JPF2JVMTest.
 * 
 * @author Nastaran Shafiei
 * @author Franck van Breugel
 */
public class JPF_converter_JPF2JVMTest extends NativePeer {

  @MJI
  public static void convertStringTest__Ljava_lang_String_2__V (MJIEnv env, int objRef, int jpfRef, FeatureExpr ctx) throws ConversionException, ClassNotFoundException{
    ConverterBase.reset(env);

    // converting JPF String to JVM string
    String s1 = (String) JPF2JVMConverter.obtainJVMObj(jpfRef, env, ctx);
    String s2 = new String("Hello World");

    TestJPF.assertEquals(s1, s2);
  }

  @MJI
  public static void convertIntegerTest__Ljava_lang_Integer_2__V (MJIEnv env, int objRef, int jpfRef, FeatureExpr ctx) throws ConversionException, ClassNotFoundException{
    ConverterBase.reset(env);

    // converting JPF Integer to JVM Integer
    Integer i1 = (Integer) JPF2JVMConverter.obtainJVMObj(jpfRef, env, ctx);

    Integer i2 = new Integer(100);

    TestJPF.assertEquals(i1, i2);
  }

  @MJI
  public static void convertArrayTest___3Ljava_lang_String_2__V (MJIEnv env, int objRef, int jpfArr, FeatureExpr ctx) throws ConversionException, ClassNotFoundException{
    ConverterBase.reset(env);

    // converting JPF String array to JVM String array
    String[] arr1 = (String[]) JPF2JVMConverter.obtainJVMObj(jpfArr, env, ctx);
    String[] arr2 = { "e1", "e2", "e3" };

    TestJPF.assertEquals(arr1.length, arr2.length);
    TestJPF.assertEquals(arr1[0], arr2[0]);
    TestJPF.assertEquals(arr1[1], arr2[1]);
    TestJPF.assertEquals(arr1[2], arr2[2]);
  }

  @MJI
  public static void convertHashMapTest__Ljava_util_HashMap_2__V (MJIEnv env, int objRef, int jpfMap, FeatureExpr ctx) throws ConversionException, ClassNotFoundException{
    ConverterBase.reset(env);

    // converting JPF HashMap to JVM HashMap
    @SuppressWarnings("unchecked")
	HashMap<Integer, String> map1 = (HashMap<Integer, String>) JPF2JVMConverter.obtainJVMObj(jpfMap, env, ctx);

    HashMap<Integer, String> map2 = new HashMap<Integer, String>();
    map2.put(0, "zero");
    map2.put(1, "one");
    map2.put(2, "two");

    TestJPF.assertEquals(map1, map2);
    TestJPF.assertEquals(map1.get(0), map2.get(0));
    TestJPF.assertEquals(map1.get(1), map2.get(1));
    TestJPF.assertEquals(map1.get(2), map2.get(2));
  }

  @MJI
  public static void convertClassTest__Ljava_lang_Class_2__V (MJIEnv env, int objRef, int jpfCls, FeatureExpr ctx) throws
         ConversionException, IllegalArgumentException, SecurityException, 
           IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
 
    ConverterBase.reset(env);

    // converting JPF Class to JVM Class
    Class<?> cls1 = (Class<?>) JPF2JVMConverter.obtainJVMCls(jpfCls, env, ctx);

    Class<?> cls2 = JPF2JVMTestConversion.class;

    TestJPF.assertEquals(cls1, cls2);
    TestJPF.assertEquals(JPF2JVMTestConversion.i, 10);
    TestJPF.assertEquals(cls1.getDeclaredFields()[0].getInt(cls1), 10);
  }
}
