package gov.nasa.jpf.vm;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.util.InvokationUtils;

public class JPF_java_net_Inet4Address extends NativePeer {
	
	@MJI
	 public static void init____V(MJIEnv env, int clsRef, FeatureExpr ctx) {
		InvokationUtils.invoke(java.net.Inet4Address.class, "init");
	}

}
