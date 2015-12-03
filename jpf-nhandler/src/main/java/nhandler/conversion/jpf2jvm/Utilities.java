package nhandler.conversion.jpf2jvm;

import java.lang.reflect.Field;

import cmu.conditional.One;
import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.vm.ArrayFields;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import nhandler.conversion.ConversionException;

/**
 *  Helper methods needed for the conversion from JPF to JVM 
 * 
 * @author Nastaran Shafiei
 */ 
public class Utilities { 

  /**
   * Sets a primitive field of a JVM object to a value of the corresponding
   * field of the given JPF object.
   * 
   * @param fld
   *          a field of a JVM object which is of primitive type.
   * @param obj
   *          The JVM object that includes the field fld.
   * @param ei
   *          a JPF object which is corresponding to the given JVM object, obj.
   * 
   * @throws IllegalAccessException
   *           when method trying to access a private field of an JVM object
   *           whose "isAccessible" is not true. But that will not happen,
   *           because in "getJVMObj" before invoking this method we always
   *           invoke "fld.setAccessible(true)".
   * 
   * @throws ConversionException
   *           if the given field is not of primitive type
   */
  public static void setJVMPrimitiveField (Field fld, Object obj, ElementInfo ei, FieldInfo fi) throws IllegalAccessException, ConversionException {
    if (fi.isBooleanField()) {
      fld.setBoolean(obj, ei.getBooleanField(fi).getValue());
    } else if (fi.isByteField()) {
      fld.setByte(obj, ei.getByteField(fi).getValue());
    } else if (fi.isShortField()) {
      fld.setShort(obj, ei.getShortField(fi).getValue());
    } else if (fi.isIntField()) {
      fld.setInt(obj, ei.getIntField(fi).getValue());
    } else if (fi.isLongField()) {
      fld.setLong(obj, ei.getLongField(fi).getValue());
    } else if (fi.isCharField()) {
      fld.setChar(obj, ei.getCharField(fi).getValue());
    } else if (fi.isFloatField()) {
      fld.setFloat(obj, ei.getFloatField(fi).getValue());
    } else if (fi.isDoubleField()) {
      fld.setDouble(obj, ei.getDoubleField(fi).getValue());
    } else {
      throw new ConversionException("Unknown premitive type " + fi.getType());
    }
  }

  /**
   * Creates an array of primitive type which is corresponding to the given JPF
   * array.
   * 
   * @param ei
   *          An ElementInfo which represents a JPF array of primitive type
   * 
   * @return a JVM array of primitive type which is created corresponding to the
   *         given JPF array represented by ei
   * 
   * @throws ConversionException
   *           if the given array is not of primitive type
   */
  public static Object createJVMPrimitiveArr (ElementInfo ei) throws ConversionException {
    String type = ei.getType();
    Object JVMObj = null;

    // byte[]
    if (type.equals("[B")) {
//      JVMObj = ((ArrayFields) ei.getFields()).asByteArrayConcrete();
      Byte[] ByteArray = ((ArrayFields) ei.getFields()).asByteArrayConcrete();
        byte[] byteArray = new byte[ByteArray.length];
        for (int i = 0; i < ByteArray.length; i++) {
            byteArray[i] = ByteArray[i].byteValue();
        }
        JVMObj = byteArray;
    }
    // char[]
    else if (type.equals("[C")) {
      JVMObj = ((ArrayFields) ei.getFields()).asCharArray();
      if (JVMObj instanceof One) {
        JVMObj = ((One) JVMObj).getValue();
      }
    }
    // short[]
    else if (type.equals("[S")) {
      JVMObj = ((ArrayFields) ei.getFields()).asShortArray();
    }
    // int[]
    else if (type.equals("[I")) {
//      JVMObj = ((ArrayFields) ei.getFields()).asIntArray();
        Integer[] IntegerArray = ((ArrayFields) ei.getFields()).asIntArrayConcrete();
        int[] intArray = new int[IntegerArray.length];
        for (int i = 0; i < IntegerArray.length; i++) {
            intArray[i] = IntegerArray[i].intValue();
        }
        JVMObj = intArray;

    }
    // float[]
    else if (type.equals("[F")) {
      JVMObj = ((ArrayFields) ei.getFields()).asFloatArray();
    }
    // long[]
    else if (type.equals("[J")) {
      JVMObj = ((ArrayFields) ei.getFields()).asLongArray();
    }
    // double[]
    else if (type.equals("[D")) {
      JVMObj = ((ArrayFields) ei.getFields()).asDoubleArray();
    }
    // boolean[]
    else if (type.equals("[Z")) {
      JVMObj = ((ArrayFields) ei.getFields()).asBooleanArray();
    } else {
      throw new ConversionException("Unknown array type " + type);
    }
    return JVMObj;
  }

  public static boolean isPrimitiveClass (String name) {
    return (name.equals("boolean") || name.equals("byte") || name.equals("int") || name.equals("short") || name.equals("long") || name.equals("char") || name.equals("float") || name.equals("double"));
  }


  /**
   * Returns a class corresponding to the given primitive type
   * 
   * @param name
   *          primitive type name
   *          
   * @return class corresponding to the given primitive type
   */
  public static Class<?> getPrimitiveClass (String name) {
    if (name.equals("boolean")) {
      return boolean.class;
    } else if (name.equals("byte")) {
      return byte.class;
    } else if (name.equals("int")) {
      return int.class;
    } else if (name.equals("short")) {
      return short.class;
    } else if (name.equals("long")) {
      return long.class;
    } else if (name.equals("char")) {
      return char.class;
    } else if (name.equals("float")) {
      return float.class;
    } else if (name.equals("double")) { 
      return double.class; 
    }
    return null;
  }

  public static boolean isArray(String cname) {
    return cname.startsWith("[");
  }
}
