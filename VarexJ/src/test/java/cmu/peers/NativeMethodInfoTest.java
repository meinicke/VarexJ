package cmu.peers;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import cmu.conditional.CachedFeatureExprFactory;
import cmu.conditional.ChoiceFactory;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.NativeMethodInfo;

public class NativeMethodInfoTest {

	@Test
	public void testGetUnconditionalArgs() throws Exception {
//		gov.nasa.jpf.vm.MJIEnv@5ec5ca56
//		403
//		Choice(!CONFIG_a, One(1.5707963267948966), One(0.0))
//		True
		
		Object[] args = new Object[4];
		args[0] = "MJI";
		args[1] = 403;
		args[2] = One.valueOf(3);
		args[3] = CachedFeatureExprFactory.True();
		List<Object[]> res = NativeMethodInfo.getUnconditionalArgs(args).toList();
		for (Object[] a : res) {
			for (Object o : a) {
				System.out.print(o);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void testGetUnconditionalArgs2() throws Exception {
//		gov.nasa.jpf.vm.MJIEnv@5ec5ca56
//		403
//		Choice(!CONFIG_a, One(1.5707963267948966), One(0.0))
//		True
		FeatureExpr feature = CachedFeatureExprFactory.createDefinedExternal("A");
		Object[] args = new Object[4];
		args[0] = "MJI";
		args[1] = 403;
		args[2] = ChoiceFactory.create(feature, One.valueOf(3), One.valueOf(0));
		args[3] = CachedFeatureExprFactory.True();
		List<Object[]> res = NativeMethodInfo.getUnconditionalArgs(args).toList();
		for (Object[] a : res) {
			for (Object o : a) {
				System.out.print(o);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void testGetUnconditionalArgs3() throws Exception {
		FeatureExpr feature = CachedFeatureExprFactory.createDefinedExternal("A");
		Object[] args = new Object[5];
		args[0] = "MJI";
		args[1] = 403;
		args[2] = ChoiceFactory.create(feature, One.valueOf(3), One.valueOf(0));
		args[3] = ChoiceFactory.create(feature, One.valueOf(5), One.valueOf(0));
		args[4] = CachedFeatureExprFactory.True();
		List<Object[]> res = NativeMethodInfo.getUnconditionalArgs(args).toList();
		for (Object[] a : res) {
			for (Object o : a) {
				System.out.print(o);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void testGetUnconditionalArgs4() throws Exception {
		FeatureExpr feature = CachedFeatureExprFactory.createDefinedExternal("A");
		FeatureExpr feature2 = CachedFeatureExprFactory.createDefinedExternal("B");
		Object[] args = new Object[5];
		args[0] = "MJI";
		args[1] = 403;
		args[2] = ChoiceFactory.create(feature, One.valueOf(3), One.valueOf(0));
		args[3] = ChoiceFactory.create(feature2, One.valueOf(5), One.valueOf(0));
		args[4] = CachedFeatureExprFactory.True();
		Map<Object[], FeatureExpr> res = NativeMethodInfo.getUnconditionalArgs(args).toMap();
		for (Entry<Object[], FeatureExpr> a : res.entrySet()) {
			for (Object o : a.getKey()) {
				System.out.print(o);
				System.out.print(" ");
			}
			System.out.println(a.getValue());
		}
	}
}
