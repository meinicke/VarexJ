package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TypeValidatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSubclass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeValidatorTest() {
				public void runTest() throws Exception {
					testSubclass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicMismatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeValidatorTest() {
				public void runTest() throws Exception {
					testBasicMismatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMismatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeValidatorTest() {
				public void runTest() throws Exception {
					testFunctionMismatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMismatch2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeValidatorTest() {
				public void runTest() throws Exception {
					testFunctionMismatch2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullUndefined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeValidatorTest() {
				public void runTest() throws Exception {
					testNullUndefined();
				}
			};
			testcase.run();
		}
	}

}