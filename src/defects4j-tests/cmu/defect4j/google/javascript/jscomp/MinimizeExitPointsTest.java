package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MinimizeExitPointsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBreakOptimization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MinimizeExitPointsTest() {
				public void runTest() throws Exception {
					testBreakOptimization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionReturnOptimization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MinimizeExitPointsTest() {
				public void runTest() throws Exception {
					testFunctionReturnOptimization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhileContinueOptimization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MinimizeExitPointsTest() {
				public void runTest() throws Exception {
					testWhileContinueOptimization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoContinueOptimization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MinimizeExitPointsTest() {
				public void runTest() throws Exception {
					testDoContinueOptimization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForContinueOptimization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MinimizeExitPointsTest() {
				public void runTest() throws Exception {
					testForContinueOptimization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCodeMotionDoesntBreakFunctionHoisting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MinimizeExitPointsTest() {
				public void runTest() throws Exception {
					testCodeMotionDoesntBreakFunctionHoisting();
				}
			};
			testcase.run();
		}
	}

}