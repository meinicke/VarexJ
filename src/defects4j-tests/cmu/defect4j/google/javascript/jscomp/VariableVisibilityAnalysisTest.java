package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class VariableVisibilityAnalysisTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableVisibilityAnalysisTest() {
				public void runTest() throws Exception {
					testFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableVisibilityAnalysisTest() {
				public void runTest() throws Exception {
					testParameters();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCapturedVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableVisibilityAnalysisTest() {
				public void runTest() throws Exception {
					testCapturedVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableVisibilityAnalysisTest() {
				public void runTest() throws Exception {
					testGlobals();
				}
			};
			testcase.run();
		}
	}

}