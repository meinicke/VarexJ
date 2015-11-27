package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GroupVariableDeclarationsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGroupingVarsInForAndForInLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GroupVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testGroupingVarsInForAndForInLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroupingUninitializedVarsInScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GroupVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testGroupingUninitializedVarsInScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroupingInitializedVarsInScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GroupVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testGroupingInitializedVarsInScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroupingVarsNestedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GroupVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testGroupingVarsNestedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroupingVarsInnerFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GroupVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testGroupingVarsInnerFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroupingVarsFirstStatementNotVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GroupVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testGroupingVarsFirstStatementNotVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroupingVarsInScopeRegtest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GroupVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testGroupingVarsInScopeRegtest();
				}
			};
			testcase.run();
		}
	}

}