package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MoveFunctionDeclarationsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunctionDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MoveFunctionDeclarationsTest() {
				public void runTest() throws Exception {
					testFunctionDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionDeclarationsInModule() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MoveFunctionDeclarationsTest() {
				public void runTest() throws Exception {
					testFunctionDeclarationsInModule();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MoveFunctionDeclarationsTest() {
				public void runTest() throws Exception {
					testFunctionsExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoMoveDeepFunctionDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MoveFunctionDeclarationsTest() {
				public void runTest() throws Exception {
					testNoMoveDeepFunctionDeclarations();
				}
			};
			testcase.run();
		}
	}

}