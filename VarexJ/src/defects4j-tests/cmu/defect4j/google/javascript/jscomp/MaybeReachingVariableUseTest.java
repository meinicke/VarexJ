package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MaybeReachingVariableUseTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testTryCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditional() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testConditional();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseAndDefInSameInstruction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testUseAndDefInSameInstruction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentInExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testAssignmentInExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentOps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testAssignmentOps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testInc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStraightLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MaybeReachingVariableUseTest() {
				public void runTest() throws Exception {
					testStraightLine();
				}
			};
			testcase.run();
		}
	}

}