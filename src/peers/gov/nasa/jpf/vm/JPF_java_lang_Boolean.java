package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

public class JPF_java_lang_Boolean extends NativePeer {
  // <2do> at this point we deliberately do not override clinit

  @MJI
  public int valueOf__Z__Ljava_lang_Boolean_2 (MJIEnv env, int clsRef, boolean val) {
    return env.valueOfBoolean(val);
  }
}
