package cmu.peers;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;


public class MethodInvokeTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean a = false;
	@Conditional
	static boolean b = true;
	@Conditional
	static boolean c = true;
	@Conditional
	static boolean d = true;

	@Test
	public void invokeMethodOnMultipleObjectsTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			A object = new A();
			if (a) {
				object = new A();
			}
			
			A.class.getMethod("run").invoke(object);
			
		}
	}
	
	class A {
		 @SuppressWarnings("unused")
		public void run() {
			int i = 0;
		}
	}
	
}
