package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckDebuggerStatementTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCheckDebuggerStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckDebuggerStatementTest() {
				public void runTest() throws Exception {
					testCheckDebuggerStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningWhenExplicitlyDisabled() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckDebuggerStatementTest() {
				public void runTest() throws Exception {
					testNoWarningWhenExplicitlyDisabled();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckDebuggerKeywordMayAppearInComments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckDebuggerStatementTest() {
				public void runTest() throws Exception {
					testCheckDebuggerKeywordMayAppearInComments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckIsDisabledByDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckDebuggerStatementTest() {
				public void runTest() throws Exception {
					testCheckIsDisabledByDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckDebuggerStatementInEval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckDebuggerStatementTest() {
				public void runTest() throws Exception {
					testCheckDebuggerStatementInEval();
				}
			};
			testcase.run();
		}
	}

}