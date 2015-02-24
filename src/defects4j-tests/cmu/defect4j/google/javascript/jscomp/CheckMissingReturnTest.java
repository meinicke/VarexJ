package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckMissingReturnTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMissingReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingReturnTest() {
				public void runTest() throws Exception {
					testMissingReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnNotMissing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingReturnTest() {
				public void runTest() throws Exception {
					testReturnNotMissing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFinallyStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingReturnTest() {
				public void runTest() throws Exception {
					testFinallyStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testKnownConditions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingReturnTest() {
				public void runTest() throws Exception {
					testKnownConditions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testKnownWhileLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingReturnTest() {
				public void runTest() throws Exception {
					testKnownWhileLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiConditions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingReturnTest() {
				public void runTest() throws Exception {
					testMultiConditions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue779() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckMissingReturnTest() {
				public void runTest() throws Exception {
					testIssue779();
				}
			};
			testcase.run();
		}
	}

}