//
// Copyright (C) 2006 United States Government as represented by the
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

import java.lang.reflect.Array;
import java.lang.reflect.Field;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.ClinitRequired;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Fields;
import gov.nasa.jpf.vm.MJIEnv;

/**
 * Object transformer from Java objects to JPF objects
 * @author Ivan Mushketik
 */
public class ObjectConverter {
  /**
   * Create JPF object from Java object
 * @param env - MJI environment
 * @param javaObject - java object that is used to created JPF object from
   * @return reference to new JPF object
   */
  public static int JPFObjectFromJavaObject(FeatureExpr ctx, MJIEnv env, Object javaObject) throws ClinitRequired {
      Class<?> javaClass = javaObject.getClass();
      String typeName = javaClass.getName();
      int newObjRef = env.newObject(ctx, typeName);
      ElementInfo newObjEI = env.getModifiableElementInfo(newObjRef);

      ClassInfo ci = env.getClassInfo(newObjRef);

      while (ci != null) {
        for (FieldInfo fi : ci.getDeclaredInstanceFields()) {
          if (!fi.isReference()) {
            setJPFPrimitive(ctx, newObjEI, fi, javaObject);
          }
          else {
            try {
              Field arrField = getField(fi.getName(), javaClass);
              arrField.setAccessible(true);
              Object fieldJavaObj = arrField.get(javaObject);

              int fieldJPFObjRef;
              if (isArrayField(fi)) {
                fieldJPFObjRef = getJPFArrayRef(ctx, env, fieldJavaObj);
              } else {
                fieldJPFObjRef = JPFObjectFromJavaObject(ctx, env, fieldJavaObj);
              }

              newObjEI.setReferenceField(ctx, fi, new One<>(fieldJPFObjRef));

            } catch (NoSuchFieldException nsfx){
              throw new JPFException("JPF object creation failed, no such field: " + fi.getFullName(), nsfx);
            } catch (IllegalAccessException iax){
              throw new JPFException("JPF object creation failed, illegal access: " + fi.getFullName(), iax);
            }
          }
        }

        ci = ci.getSuperClass();
      }

      return newObjRef;
  }

  @SuppressWarnings("unused")
  private Object createObject(String className) {
    return null;
  }

  private static void setJPFPrimitive(FeatureExpr ctx, ElementInfo newObjEI, FieldInfo fi, Object javaObject) {
    try {

      String jpfTypeName = fi.getType();
      Class<?> javaClass = javaObject.getClass();
      Field javaField = getField(fi.getName(), javaClass);
      javaField.setAccessible(true);

      if (jpfTypeName.equals("char")) {
        newObjEI.setCharField(ctx, fi, new One<>(javaField.getChar(javaObject)));
      }
      else if (jpfTypeName.equals("byte")) {
        newObjEI.setByteField(ctx, fi, new One<>(javaField.getByte(javaObject)));
      }
      else if (jpfTypeName.equals("short")) {
        newObjEI.setShortField(ctx, fi, new One<>(javaField.getShort(javaObject)));
      }
      else if (jpfTypeName.equals("int")) {
        newObjEI.setIntField(ctx, fi, new One<>(javaField.getInt(javaObject)));
      }
      else if (jpfTypeName.equals("long")) {
        newObjEI.setLongField(ctx, fi, new One<>(javaField.getLong(javaObject)));
      }
      else if (jpfTypeName.equals("float")) {
        newObjEI.setFloatField(ctx, fi, new One<>(javaField.getFloat(javaObject)));
      }
      else if (jpfTypeName.equals("double")) {
        newObjEI.setDoubleField(ctx, fi, new One<>(javaField.getDouble(javaObject)));
      }
    }
    catch (Exception ex) {
      throw new JPFException(ex);
    }
  }

  private static Field getField(String fieldName, Class<?> javaClass) throws NoSuchFieldException {
    while (true) {
      try {
        Field field = javaClass.getDeclaredField(fieldName);
        return field;
      } catch (NoSuchFieldException ex) {
        // Try to search this field in a super class
        javaClass = javaClass.getSuperclass();

        // No more super class. Wrong field
        if (javaClass == null) {
          throw ex;
        }
      }
    }

  }

  // TODO jens implement all Types
  // TODO jens check seems to be to expensive
  private static int getJPFArrayRef(FeatureExpr ctx, MJIEnv env, Object javaArr) throws NoSuchFieldException, IllegalAccessException {
        
    Class<?> arrayElementClass = javaArr.getClass().getComponentType();

    int javaArrLength = Array.getLength(javaArr);
    int arrRef;

    if (arrayElementClass == Character.TYPE) {
      arrRef = env.newCharArray(FeatureExprFactory.True(), javaArrLength);
      ElementInfo charArrRef = env.getModifiableElementInfo(arrRef);
      char[] charArr = charArrRef.asCharArray().getValue();

      for (int i = 0; i < javaArrLength; i++) {
        charArr[i] = Array.getChar(javaArr, i);
      }
    }
    else if (arrayElementClass == Byte.TYPE) {
      arrRef = env.newByteArray(javaArrLength);
      ElementInfo byteArrRef = env.getModifiableElementInfo(arrRef);
//      byte[] byteArr = byteArrRef.asByteArray();
//
//      for (int i = 0; i < javaArrLength; i++) {
//        byteArr[i] = Array.getByte(javaArr, i);
//      }
      
      for (int i = 0; i < javaArrLength; i++) {
    	  byteArrRef.setIntElement(ctx, i, new One<>((int)Array.getByte(javaArr, i)));
      }
    }
    else if (arrayElementClass == Short.TYPE) {
      arrRef = env.newShortArray(javaArrLength);
      ElementInfo shortArrRef = env.getModifiableElementInfo(arrRef);
//      short[] shortArr = shortArrRef.asShortArray();

      for (int i = 0; i < javaArrLength; i++) {
    	  shortArrRef.setShortElement(ctx, i, new One<>(Array.getShort(javaArr, i)));
//        shortArr[i] = Array.getShort(javaArr, i);
      }
    }
    else if (arrayElementClass == Integer.TYPE) {
      arrRef = env.newIntArray(javaArrLength);
      ElementInfo intArrRef = env.getModifiableElementInfo(arrRef);
//      Conditional<Integer>[] array = intArrRef.asIntArray();
//      int[] intArr = new int[array.length];
//      for (int i = 0; i < array.length; i++) {
//    	  intArr[i] = array[i].getValue();
//      }
//      

      for (int i = 0; i < javaArrLength; i++) {
    	  intArrRef.setIntElement(ctx, i, new One<>(Array.getInt(javaArr, i)));
      }
    }
    else if (arrayElementClass == Long.TYPE) {
      arrRef = env.newLongArray(javaArrLength);
      ElementInfo longArrRef = env.getModifiableElementInfo(arrRef);
//      Conditional<Long>[] longArr = longArrRef.asLongArray();

      for (int i = 0; i < javaArrLength; i++) {
    	  longArrRef.setLongElement(ctx, i, new One<>(Array.getLong(javaArr, i)));
      }
    }
    else if (arrayElementClass == Float.TYPE) {
      arrRef = env.newFloatArray(javaArrLength);
      ElementInfo floatArrRef = env.getModifiableElementInfo(arrRef);
//      Conditional<Float>[] floatArr = floatArrRef.asFloatArray();

      for (int i = 0; i < javaArrLength; i++) {
    	  floatArrRef.setFloatElement(ctx, i, new One<>(Array.getFloat(javaArr, i)));
//        floatArr[i] = Array.getFloat(javaArr, i);
      }
    }
    else if (arrayElementClass == Double.TYPE) {
      arrRef = env.newDoubleArray(javaArrLength);
      ElementInfo floatArrRef = env.getModifiableElementInfo(arrRef);
//      double[] doubleArr = floatArrRef.asDoubleArray();

      for (int i = 0; i < javaArrLength; i++) {
    	  floatArrRef.setDoubleElement(ctx, i, new One<>(Array.getDouble(javaArr, i)));
//        doubleArr[i] = Array.getDouble(javaArr, i);
      }
    }
    else {
      arrRef = env.newObjectArray(arrayElementClass.getCanonicalName(), javaArrLength);
      ElementInfo arrayEI = env.getModifiableElementInfo(arrRef);

      Fields fields = arrayEI.getFields();

      for (int i = 0; i < javaArrLength; i++) {
        int newArrElRef;
        Object javaArrEl = Array.get(javaArr, i);        
        
        if (javaArrEl != null) {
          if (javaArrEl.getClass().isArray()) {
            newArrElRef = getJPFArrayRef(ctx, env, javaArrEl);
          }
          else {
            newArrElRef = JPFObjectFromJavaObject(ctx, env, javaArrEl);
          }
        }
        else {
          newArrElRef = MJIEnv.NULL;
        }

        fields.setReferenceValue(ctx, i, new One<>(newArrElRef));
      }
    }

    return arrRef;
  }

  // Do we need this??
  public static Object javaObjectFromJPFObject(ElementInfo ei) {
    try {
      String typeName = ei.getType();
      Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass(typeName);

      Object javaObject = clazz.newInstance();
      ClassInfo ci = ei.getClassInfo();
      while (ci != null) {

        for (FieldInfo fi : ci.getDeclaredInstanceFields()) {
          if (!fi.isReference()) {
            setJavaPrimitive(javaObject, ei, fi);
          }
        }

        ci = ci.getSuperClass();
      }

      return javaObject;
    } catch (Exception ex) {
      throw new JPFException(ex);
    }
  }

  private static void setJavaPrimitive(Object javaObject, ElementInfo ei, FieldInfo fi) throws NoSuchFieldException, IllegalAccessException {
    String primitiveType = fi.getName();
    String fieldName = fi.getName();

    Class<?> javaClass = javaObject.getClass();
    Field javaField = javaClass.getDeclaredField(fieldName);
    javaField.setAccessible(true);

    if (primitiveType.equals("char")) {
      javaField.setChar(javaObject, ei.getCharField(fi).getValue());
    }
    else if (primitiveType.equals("byte")) {
      javaField.setByte(javaObject, ei.getByteField(fi).getValue());
    }
    else if (primitiveType.equals("short")) {
      javaField.setShort(javaObject, ei.getShortField(fi).getValue());
    }
    else if (primitiveType.equals("int")) {
      javaField.setInt(javaObject, ei.getIntField(fi).getValue());
    }
    else if (primitiveType.equals("long")) {
      javaField.setLong(javaObject, ei.getLongField(fi).getValue());
    }
    else if (primitiveType.equals("float")) {
      javaField.setFloat(javaObject, ei.getFloatField(fi).getValue());
    }
    else if (primitiveType.equals("double")) {
      javaField.setDouble(javaObject, ei.getDoubleField(fi).getValue());
    }
    else {
      throw new JPFException("Can't convert " + primitiveType + " to " +
              javaField.getClass().getCanonicalName());
    }
  }

  private static boolean isArrayField(FieldInfo fi) {
    return fi.getType().lastIndexOf('[') >= 0;
  }


}
