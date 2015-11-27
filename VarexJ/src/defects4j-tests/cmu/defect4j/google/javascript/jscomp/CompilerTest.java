package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CompilerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCodeBuilderColumnAfterResetDummy() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CompilerTest() {
				public void runTest() throws Exception {
					testCodeBuilderColumnAfterResetDummy();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCodeBuilderColumnAfterReset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CompilerTest() {
				public void runTest() throws Exception {
					testCodeBuilderColumnAfterReset();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCodeBuilderAppend() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CompilerTest() {
				public void runTest() throws Exception {
					testCodeBuilderAppend();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCyclicalDependencyInInputs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CompilerTest() {
				public void runTest() throws Exception {
					testCyclicalDependencyInInputs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalUndefined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CompilerTest() {
				public void runTest() throws Exception {
					testLocalUndefined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommonJSProvidesAndRequire() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CompilerTest() {
				public void runTest() throws Exception {
					testCommonJSProvidesAndRequire();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommonJSMissingRequire() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CompilerTest() {
				public void runTest() throws Exception {
					testCommonJSMissingRequire();
				}
			};
			testcase.run();
		}
	}

}