package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CleanupPassesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCleanupPassOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CleanupPassesTest() {
				public void runTest() throws Exception {
					testCleanupPassOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoOptimizations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CleanupPassesTest() {
				public void runTest() throws Exception {
					testNoOptimizations();
				}
			};
			testcase.run();
		}
	}

}