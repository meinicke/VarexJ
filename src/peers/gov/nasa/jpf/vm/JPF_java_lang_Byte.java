package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

public class JPF_java_lang_Byte extends NativePeer {
  // <2do> at this point we deliberately do not override clinit

  @MJI
  public int valueOf__B__Ljava_lang_Byte_2 (MJIEnv env, int clsRef, byte val) {
    return env.valueOfByte(val);
  }
}
