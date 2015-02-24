package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefinitionsRemoverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRemoveAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefinitionsRemoverTest() {
				public void runTest() throws Exception {
					testRemoveAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefinitionsRemoverTest() {
				public void runTest() throws Exception {
					testRemoveVarAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefinitionsRemoverTest() {
				public void runTest() throws Exception {
					testRemoveFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefinitionsRemoverTest() {
				public void runTest() throws Exception {
					testRemoveLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveFunctionExpressionName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefinitionsRemoverTest() {
				public void runTest() throws Exception {
					testRemoveFunctionExpressionName();
				}
			};
			testcase.run();
		}
	}

}