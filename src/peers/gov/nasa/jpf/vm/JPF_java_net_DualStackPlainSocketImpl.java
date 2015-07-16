package gov.nasa.jpf.vm;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.util.InvokationUtils;

public class JPF_java_net_DualStackPlainSocketImpl extends NativePeer {

	@MJI
	public static void initIDs____V(MJIEnv env, int clsRef, FeatureExpr ctx) {
		InvokationUtils.invoke("java.net.DualStackPlainSocketImpl", "initIDs");
	}
	
	@MJI
	 public static int socket0__ZZ__I(MJIEnv env, int clsRef, boolean stream, boolean v6Only, FeatureExpr ctx) {
		return (int) InvokationUtils.invoke("java.net.DualStackPlainSocketImpl", "socket0", stream, v6Only);
	}

}
