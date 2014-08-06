package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class JPF_java_io_ObjectOutputStream extends NativePeer {

  @MJI
  public void doublesToBytes___3DI_3BII__ (MJIEnv env, int clsRef,
                                                  int daRef, int dOff,
                                                  int baRef, int bOff,
                                                  int nDoubles, FeatureExpr ctx){
    int imax = dOff + nDoubles;
    for (int i=dOff, j=bOff; i<imax; i++){
      Conditional<Double> d = env.getDoubleArrayElement(daRef, i);
      long l = Double.doubleToLongBits(d.getValue());
      for (int k=0; k<8; k++){
        env.setByteArrayElement(ctx, baRef, j++, new One<>((byte)l));
        l >>= 8;
      }
    }
  }
  
  
}
