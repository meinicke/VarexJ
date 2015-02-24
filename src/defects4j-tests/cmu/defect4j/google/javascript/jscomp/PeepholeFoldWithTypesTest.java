package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeFoldWithTypesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFoldTypeofObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testFoldTypeofObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldTypeofString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testFoldTypeofString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldTypeofNumber() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testFoldTypeofNumber();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldTypeofBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testFoldTypeofBoolean();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldTypeofUndefined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testFoldTypeofUndefined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontFoldTypeofUnionTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testDontFoldTypeofUnionTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontFoldTypeofSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testDontFoldTypeofSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontFoldTypeofWithTypeCheckDisabled() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldWithTypesTest() {
				public void runTest() throws Exception {
					testDontFoldTypeofWithTypeCheckDisabled();
				}
			};
			testcase.run();
		}
	}

}