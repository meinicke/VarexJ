package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class IgnoreCajaPropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IgnoreCajaPropertiesTest() {
				public void runTest() throws Exception {
					testPropertyKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IgnoreCajaPropertiesTest() {
				public void runTest() throws Exception {
					testVarKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFourChildFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IgnoreCajaPropertiesTest() {
				public void runTest() throws Exception {
					testFourChildFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IgnoreCajaPropertiesTest() {
				public void runTest() throws Exception {
					testSimpleKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPropertyKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.IgnoreCajaPropertiesTest() {
				public void runTest() throws Exception {
					testFunctionPropertyKey();
				}
			};
			testcase.run();
		}
	}

}