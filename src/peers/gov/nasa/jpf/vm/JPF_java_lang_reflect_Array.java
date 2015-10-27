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
package gov.nasa.jpf.vm;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.reflect.Array library abstraction
 */
public class JPF_java_lang_reflect_Array extends NativePeer {
  @MJI
  public int getLength__Ljava_lang_Object_2__I (MJIEnv env, int clsObjRef, 
                                                    int objRef, FeatureExpr ctx) {
    if (objRef == MJIEnv.NULL) {
      env.throwException(ctx, "java.lang.NullPointerException", "array argument is null");
      return 0;
    }
    if (!env.isArray(objRef)) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "argument is not an array");
      return 0;
    }

    return env.getArrayLength(ctx, objRef);
  }
  
  @MJI
  public int newArray__Ljava_lang_Class_2I__Ljava_lang_Object_2 (MJIEnv env, int clsRef,
                                                                        int componentTypeRef, int length, FeatureExpr ctx) {
    ClassInfo ci = env.getReferredClassInfo(ctx, componentTypeRef);
    String clsName = ci.getName();
    
    return createNewArray( env, clsName, length, ctx);
  }
  
  static int createNewArray (MJIEnv env, String clsName, int length, FeatureExpr ctx) {
    int aRef = MJIEnv.NULL;
    
    if ("boolean".equals(clsName)) { aRef = env.newBooleanArray(length); }
    else if ("byte".equals(clsName)) { aRef = env.newByteArray(length); }
    else if ("char".equals(clsName)) { aRef = env.newCharArray(ctx, length); }
    else if ("short".equals(clsName)) { aRef = env.newShortArray(length); }
    else if ("int".equals(clsName)) { aRef = env.newIntArray(length); }
    else if ("long".equals(clsName)) { aRef = env.newLongArray(length); }
    else if ("float".equals(clsName)) { aRef = env.newFloatArray(length); }
    else if ("double".equals(clsName)) { aRef = env.newDoubleArray(length); }
    else { aRef = env.newObjectArray(clsName, length); }
    return aRef;    
  }
  
  @MJI
  public int multiNewArray__Ljava_lang_Class_2_3I__Ljava_lang_Object_2 (MJIEnv env, int clsRef,
                                                                               int componentTypeRef,
                                                                               int dimArrayRef, FeatureExpr ctx) {
    ClassInfo ci = env.getReferredClassInfo(ctx, componentTypeRef);
    String clsName = ci.getName();
    int n = env.getArrayLength(ctx, dimArrayRef);
    int i;

    clsName = Types.getTypeSignature(clsName, true);
    
    String arrayType = "[";
    for (i=2; i<n; i++) arrayType += '[';
    arrayType += clsName;
    
    int[] dim = new int[n];
    for (i=0; i<n; i++) {
      dim[i] = env.getIntArrayElement(dimArrayRef, i);
    }
    
    int aRef = createNewMultiArray(env, arrayType, dim, 0, ctx); 
    return aRef;
  }
  
  static int createNewMultiArray (MJIEnv env, String arrayType, int[] dim, int level, FeatureExpr ctx) {
    int aRef = MJIEnv.NULL;
    int len = dim[level];
    
    if (level < dim.length-1) {
      aRef = env.newObjectArray(arrayType, len);
    
      for (int i=0; i<len; i++) {
        int eRef = createNewMultiArray(env, arrayType.substring(1), dim, level+1, ctx);
        env.setReferenceArrayElement(ctx, aRef, i, new One<>(eRef));
      }
    } else {
      aRef = createNewArray( env, arrayType, len, ctx);
    }
    
    return aRef;
  }

  @MJI
  public int get__Ljava_lang_Object_2I__Ljava_lang_Object_2 (MJIEnv env, int clsRef,
                                                                    int aref, int index, FeatureExpr ctx){
    String at = env.getArrayType(aref);
	if (at.equals("int") || "I".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Integer");
      env.setIntField(ctx, vref, "value", new One<>(env.getIntArrayElement(aref,index)));
      return vref;
      
    } else if (at.equals("long") || "J".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Long");
      env.setLongField(ctx, vref, "value", env.getLongArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("double") || "D".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Double");
      env.setDoubleField(ctx, vref, "value", env.getDoubleArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("boolean") || "Z".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Boolean");
      env.setBooleanField(ctx, vref, "value", env.getBooleanArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("char") || "C".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Character");
      env.setCharField(ctx, vref, "value", env.getCharArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("byte") || "B".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Byte");
      env.setByteField(ctx, vref, "value", env.getByteArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("short") || "S".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Short");
      env.setShortField(ctx, vref, "value", env.getShortArrayElement(aref,index));
      return vref;

    } else if (at.equals("float") || "F".equals(at)){
      int vref = env.newObject(ctx, "java.lang.Float");
      env.setFloatField(ctx, vref, "value", env.getFloatArrayElement(aref,index));
      return vref;

    } else {
      return env.getReferenceArrayElement(aref, index).getValue();
    }
  }

  private static boolean check (MJIEnv env, int aref, int index, FeatureExpr ctx) {
    if (aref == MJIEnv.NULL) {
      env.throwException(ctx, "java.lang.NullPointerException", "array argument is null");
      return false;
    }
    if (!env.isArray(aref)) {
      env.throwException(ctx, "java.lang.IllegalArgumentException", "argument is not an array");
      return false;
    }
    if (index < 0 || index >= env.getArrayLength(ctx, aref)) {
      env.throwException(ctx, "java.lang.IndexOutOfBoundsException", "index " + index + " is out of bounds");
      return false;
    }
    return true;
  }

  @MJI
  public boolean getBoolean__Ljava_lang_Object_2I__Z (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getBooleanArrayElement(aref, index).getValue();
    }
    return false;
  }

  @MJI
  public static byte getByte__Ljava_lang_Object_2I__B (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getByteArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public char getChar__Ljava_lang_Object_2I__C (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getCharArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public short getShort__Ljava_lang_Object_2I__S (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getShortArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public int getInt__Ljava_lang_Object_2I__I (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getIntArrayElement(aref, index);
    }
    return 0;
  }

  @MJI
  public long getLong__Ljava_lang_Object_2I__J (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getLongArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public float getFloat__Ljava_lang_Object_2I__F (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getFloatArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public double getDouble__Ljava_lang_Object_2I__D (MJIEnv env, int clsRef, int aref, int index, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      return env.getDoubleArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public void setBoolean__Ljava_lang_Object_2IZ__V (MJIEnv env, int clsRef, int aref, int index, boolean val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setBooleanArrayElement(ctx, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setByte__Ljava_lang_Object_2IB__V (MJIEnv env, int clsRef, int aref, int index, byte val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setByteArrayElement(ctx, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setChar__Ljava_lang_Object_2IC__V (MJIEnv env, int clsRef, int aref, int index, char val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setCharArrayElement(ctx, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setShort__Ljava_lang_Object_2IS__V (MJIEnv env, int clsRef, int aref, int index, short val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setShortArrayElement(ctx, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setInt__Ljava_lang_Object_2II__V (MJIEnv env, int clsRef, int aref, int index, int val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setIntArrayElement(ctx, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setLong__Ljava_lang_Object_2IJ__V (MJIEnv env, int clsRef, int aref, int index, long val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setLongArrayElement(ctx, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setFloat__Ljava_lang_Object_2IF__V (MJIEnv env, int clsRef, int aref, int index, float val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setFloatArrayElement(ctx, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setDouble__Ljava_lang_Object_2ID__V (MJIEnv env, int clsRef, int aref, int index, double val, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
      env.setDoubleArrayElement(ctx, aref, index, new One<>(val));
    }
  }
  
  @MJI
  public void set__Ljava_lang_Object_2ILjava_lang_Object_2__V(MJIEnv env, int clsRef, int aref, int index, int valRef, FeatureExpr ctx) {
    if (check(env, aref, index, ctx)) {
    	String arrayType = env.getArrayType(aref);
    	if ("Z".equals(arrayType)) {
    		env.setBooleanArrayElement(ctx, aref, index, env.getBooleanValue(valRef));
    	} else if ("C".equals(arrayType)) {
    		env.setCharArrayElement(ctx, aref, index, env.getCharValue(valRef));
    	} else if ("S".equals(arrayType)) {
    		env.setShortArrayElement(ctx, aref, index, env.getShortValue(valRef));
    	} else if ("B".equals(arrayType)) {
    		env.setByteArrayElement(ctx, aref, index, env.getByteValue(valRef));
    	} else if ("I".equals(arrayType)) {
    		env.setIntArrayElement(ctx, aref, index, env.getIntValue(valRef));
    	} else if ("J".equals(arrayType)) {
    		env.setLongArrayElement(ctx, aref, index, env.getLongValue(valRef));
    	} else if ("F".equals(arrayType)) {
    		env.setFloatArrayElement(ctx, aref, index, env.getFloatValue(valRef));
    	} else if ("D".equals(arrayType)) {
    		env.setDoubleArrayElement(ctx, aref, index, env.getDoubleValue(valRef));
    	} else {
	    	env.setReferenceArrayElement(ctx, aref, index, new One<>(valRef));
    	}
    }
  }
  
}
