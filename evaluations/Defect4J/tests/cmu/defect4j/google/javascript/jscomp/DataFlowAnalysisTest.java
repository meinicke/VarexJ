package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DataFlowAnalysisTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSimpleLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DataFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLatticeArrayMinimizationWhenMidpointIsEven() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DataFlowAnalysisTest() {
				public void runTest() throws Exception {
					testLatticeArrayMinimizationWhenMidpointIsEven();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLatticeArrayMinimizationWhenMidpointRoundsDown() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DataFlowAnalysisTest() {
				public void runTest() throws Exception {
					testLatticeArrayMinimizationWhenMidpointRoundsDown();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLatticeArrayMinimizationWithTwoElements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DataFlowAnalysisTest() {
				public void runTest() throws Exception {
					testLatticeArrayMinimizationWithTwoElements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBranchedSimpleIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DataFlowAnalysisTest() {
				public void runTest() throws Exception {
					testBranchedSimpleIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaxIterationsExceededException() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DataFlowAnalysisTest() {
				public void runTest() throws Exception {
					testMaxIterationsExceededException();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DataFlowAnalysisTest() {
				public void runTest() throws Exception {
					testSimpleIf();
				}
			};
			testcase.run();
		}
	}

}