package sun.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/**
 * this is a placeholder for a Java 6 class, which we only have here to
 * support both Java 1.5 and 6 with the same set of env/ classes
 *
 * see sun.msic.SharedSecrets for details
 *
 * <2do> THIS IS GOING AWAY AS SOON AS WE OFFICIALLY SWITCH TO JAVA 6
 * (to be replaced with a native peer for the native methods of the lib class)
 */
public class ConstantPool {

  public int getSize() {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public Class<?> getClassAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public Class<?> getClassAtIfLoaded(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public Member getMethodAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public Member getMethodAtIfLoaded(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public Field getFieldAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public Field getFieldAtIfLoaded(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public String[] getMemberRefInfoAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public int getIntAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public long getLongAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public float getFloatAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public double getDoubleAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public String getStringAt(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

  public String getUTF8At(int index) {
    throw new UnsupportedOperationException("sun.reflect.ConstantPool not supported yet");
  }

}
