package java8;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

/**
 * Created by pcmehlitz on 4/1/15.
 */
public class JPF_java8_DefaultMethodTest$G1 extends NativePeer {
  @MJI
  public int foo____I (MJIEnv env, int objRef, FeatureExpr ctx){
    System.out.println("this is native G1.foo()");
    return 42;
  }
}
