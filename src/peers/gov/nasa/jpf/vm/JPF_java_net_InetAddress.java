package gov.nasa.jpf.vm;

import java.net.InetAddress;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.util.InvokationUtils;

public class JPF_java_net_InetAddress extends NativePeer {

	@MJI
	public static void init____V(MJIEnv env, int clsRef, FeatureExpr ctx) {
		InvokationUtils.invoke(InetAddress.class, "init");
	}
}
