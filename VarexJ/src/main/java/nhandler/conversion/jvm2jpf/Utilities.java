package nhandler.conversion.jvm2jpf;

import java.lang.reflect.Field;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.Fields;
import gov.nasa.jpf.vm.MJIEnv;
import nhandler.conversion.ConversionException;

/** 
 * Helper methods needed for the conversion from JVM to JPF
 * 
 * @author Nastaran Shafiei 
 */
public class Utilities {

  /**
   * Creates a new JPF array which has the same type and same size as the given
   * JVM array.
   * 
   * @param JVMArr
   *          a JVM array
   * 
   * @return a new JPF array of the same type and same size as the given JVM
   *         array.
   */
  public static int createNewJPFArray (Object JVMArr, MJIEnv env, FeatureExpr ctx){
    String type = JVMArr.getClass().getName();
    int JPFArr = MJIEnv.NULL;
    // byte[]
    if (type.equals("[B")){
      JPFArr = env.newByteArray(((byte[]) JVMArr).length);
    }
    // char[]
    else if (type.equals("[C")){
      JPFArr = env.newCharArray(ctx, ((char[]) JVMArr).length);
    }
    // short[]
    else if (type.equals("[S")){
      JPFArr = env.newShortArray(((short[]) JVMArr).length);
    }
    // int[]
    else if (type.equals("[I")){
      JPFArr = env.newIntArray(((int[]) JVMArr).length);
    }
    // float[]
    else if (type.equals("[F")){
      JPFArr = env.newFloatArray(((float[]) JVMArr).length);
    }
    // long[]
    else if (type.equals("[J")){
      JPFArr = env.newLongArray(((long[]) JVMArr).length);
    }
    // double[]
    else if (type.equals("[D")){
      JPFArr = env.newDoubleArray(((double[]) JVMArr).length);
    }
    // boolean[]
    else if (type.equals("[Z")){
      JPFArr = env.newBooleanArray(((boolean[]) JVMArr).length);
    }
    // Object[]
    else{
      JPFArr = env.newObjectArray(((Object[]) JVMArr).getClass().getComponentType().getName(), ((Object[]) JVMArr).length);
    }

    return JPFArr;
  }

  /**
   * Sets an element of the given JPF primitive array to the same value as the given JVM
   * object.
   * 
   * @param ei
   *          an object that represents the JPF array
   * @param index
   *          index of the element to be set
   * @param fld
   *          represents an array element in JVM
   * @param JVMObj
   *          the value of the filed in JVM
   * 
   * @throws IllegalAccessException
   *           method does not have access to the specified field
   * 
   * @throws ConversionException
   *           if the given field is not of primitive type
   */
  public static void setJPFPrimitiveField (FeatureExpr ctx, ElementInfo ei, int index, Field fld, Object JVMObj) throws IllegalAccessException, ConversionException{
    Fields fields = ei.getFields();
    if (fld.getType().getName().equals("boolean")){
      fields.setBooleanValue(ctx, index, One.valueOf(fld.getBoolean(JVMObj)));
    } else if (fld.getType().getName().equals("byte")) {
      fields.setByteValue(ctx, index, One.valueOf(fld.getByte(JVMObj)));
    } else if (fld.getType().getName().equals("int")) {
      fields.setIntValue(ctx, index, new One<>(fld.getInt(JVMObj)));
    } else if (fld.getType().getName().equals("short")) {
      fields.setShortValue(ctx, index, new One<>(fld.getShort(JVMObj)));
    } else if (fld.getType().getName().equals("long")) {
      fields.setLongValue(ctx, index, new One<>(fld.getLong(JVMObj)));
    } else if (fld.getType().getName().equals("char")) {
      fields.setCharValue(ctx, index, One.valueOf(fld.getChar(JVMObj)));
    } else if (fld.getType().getName().equals("float")) {
      fields.setFloatValue(ctx, index, new One<>(fld.getFloat(JVMObj)));
    } else if (fld.getType().getName().equals("double")) {
      fields.setDoubleValue(ctx, index, new One<>(fld.getDouble(JVMObj)));
    } else{
      throw new ConversionException("Unknown premitive type " + fld.getType().getName());
    }
  }

  /**
   * Sets a JPF array of primitive type according to the value of the given JVM
   * array.
   * 
   * @param ei
   *          an object that represents the JPF array of primitive type
   * @param JVMObj
   *          a JVM array of primitive type
   * 
   * @throws ConversionException
   *           if the given array is not of primitive type
   */
  public static void setJPFPrimitiveArr (FeatureExpr ctx, ElementInfo ei, Object JVMObj, MJIEnv env) throws ConversionException{
    String type = ei.getType();
    // byte[]
    if (type.equals("[B")){
      byte[] JVMArr = (byte[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++){
         env.setByteArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    }
    // char[]
    else if (type.equals("[C")){
      char[] JVMArr = (char[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++){
         env.setCharArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    }
    // short[]
    else if (type.equals("[S")){
      short[] JVMArr = (short[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++){
         env.setShortArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    }
    // int[]
    else if (type.equals("[I")){
      int[] JVMArr = (int[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++){
         env.setIntArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    }
    // float[]
    else if (type.equals("[F")){
      float[] JVMArr = (float[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++){
         env.setFloatArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    }
    // long[]
    else if (type.equals("[J")){
      long[] JVMArr = (long[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++){
        env.setLongArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    }
    // double[]
    else if (type.equals("[D")){
      double[] JVMArr = (double[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++){
         env.setDoubleArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    }
    // boolean[]
    else if (type.equals("[Z")){
      boolean[] JVMArr = (boolean[]) JVMObj;
      for (int i = 0; i < JVMArr.length; i++) {
        env.setBooleanArrayElement(ctx, ei.getObjectRef(), i, new One<>(JVMArr[i]));
      }
    } else{
      throw new ConversionException("Unknown array type " + type);
    }
  }
}
