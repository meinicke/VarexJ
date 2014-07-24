package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_java_io_ObjectOutputStream extends NativePeer {

  @MJI
  public void doublesToBytes___3DI_3BII__ (MJIEnv env, int clsRef,
                                                  int daRef, int dOff,
                                                  int baRef, int bOff,
                                                  int nDoubles){
    int imax = dOff + nDoubles;
    for (int i=dOff, j=bOff; i<imax; i++){
      double d = env.getDoubleArrayElement(daRef, i);
      long l = Double.doubleToLongBits(d);
      for (int k=0; k<8; k++){
        env.setByteArrayElement(NativeMethodInfo.CTX, baRef, j++, (byte)l);
        l >>= 8;
      }
    }
  }
  
  
}
