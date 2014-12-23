package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;
import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class JPF_java_lang_Boolean extends NativePeer {
  // <2do> at this point we deliberately do not override clinit

  @MJI
  public int valueOf__Z__Ljava_lang_Boolean_2 (MJIEnv env, int clsRef, Conditional<Boolean> val, FeatureExpr ctx) {
    return env.valueOfBoolean(val.getValue());
  }
}
