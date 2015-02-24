package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AstValidatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstValidatorTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDebugger() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstValidatorTest() {
				public void runTest() throws Exception {
					testDebugger();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidScript() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstValidatorTest() {
				public void runTest() throws Exception {
					testValidScript();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidStatement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstValidatorTest() {
				public void runTest() throws Exception {
					testValidStatement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstValidatorTest() {
				public void runTest() throws Exception {
					testValidExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstValidatorTest() {
				public void runTest() throws Exception {
					testValidExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidEmptyStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstValidatorTest() {
				public void runTest() throws Exception {
					testInvalidEmptyStatement();
				}
			};
			testcase.run();
		}
	}

}