package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ProcessCommonJSModulesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSortInputs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessCommonJSModulesTest() {
				public void runTest() throws Exception {
					testSortInputs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarRenaming() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessCommonJSModulesTest() {
				public void runTest() throws Exception {
					testVarRenaming();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDash() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessCommonJSModulesTest() {
				public void runTest() throws Exception {
					testDash();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithoutExports() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessCommonJSModulesTest() {
				public void runTest() throws Exception {
					testWithoutExports();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExports() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessCommonJSModulesTest() {
				public void runTest() throws Exception {
					testExports();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModuleName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessCommonJSModulesTest() {
				public void runTest() throws Exception {
					testModuleName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGuessModuleName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessCommonJSModulesTest() {
				public void runTest() throws Exception {
					testGuessModuleName();
				}
			};
			testcase.run();
		}
	}

}