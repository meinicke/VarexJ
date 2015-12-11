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
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.util.test.TestJPF;

import java.util.HashMap;

import nhandler.conversion.ConversionException;
import nhandler.conversion.ConverterBase;
import nhandler.conversion.jvm2jpf.JVM2JPFConverter;

import converter.JVM2JPFTest.JVM2JPFTestConversion;

public class JPF_converter_JVM2JPFTest extends NativePeer {

  @MJI
  public static int createStringTest____Ljava_lang_String_2 (MJIEnv env, int objRef, FeatureExpr ctx) throws ConversionException{
    String s = new String("Hello World");

    ConverterBase.reset(env);

    // converting JVM String to JPF string
    int jpfObj = JVM2JPFConverter.obtainJPFObj(s, env, ctx);

    return jpfObj;
  }

  @MJI
  public static int createIntegerTest____Ljava_lang_Integer_2 (MJIEnv env, int objRef, FeatureExpr ctx) throws ConversionException{
    Integer i = new Integer(100);

    ConverterBase.reset(env);

    // converting JVM Integer to JPF Integer
    int jpfObj = JVM2JPFConverter.obtainJPFObj(i, env, ctx);

    return jpfObj;
  }

  @MJI
  public static int createArrayTest_____3Ljava_lang_String_2 (MJIEnv env, int objRef, FeatureExpr ctx) throws ConversionException{
    String[] arr = { "e1", "e2", "e3" };

    ConverterBase.reset(env);

    // converting JVM String array to JPF String array
    int jpfObj = JVM2JPFConverter.obtainJPFObj(arr, env, ctx);

    return jpfObj;
  }

  @MJI
  public static int createHashMapTest____Ljava_util_HashMap_2 (MJIEnv env, int objRef, FeatureExpr ctx) throws ConversionException{
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(0, "zero");
    map.put(1, "one");
    map.put(2, "two");

    ConverterBase.reset(env);

    // converting JVM map to JPF map
    int jpfObj = JVM2JPFConverter.obtainJPFObj(map, env, ctx);

    return jpfObj;
  }

  @MJI
  public static int createClassTest____Ljava_lang_Class_2 (MJIEnv env, int objRef, FeatureExpr ctx) throws ConversionException{
    JVM2JPFTestConversion.inc(10);
    Class<?> cls = JVM2JPFTestConversion.class;

    TestJPF.assertEquals(JVM2JPFTestConversion.i, 10);

    ConverterBase.reset(env);
    
    // converting JVM class to JPF class
    ClassInfo ci = JVM2JPFConverter.obtainJPFCls(cls, env, ctx);

    return ci.getClassObjectRef();
  }
}
