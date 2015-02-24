package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class StatementFusionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFoldBlockWithStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testFoldBlockWithStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBlockIntoIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testFoldBlockIntoIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBlockReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testFoldBlockReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBlockThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testFoldBlockThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNothingToDo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testNothingToDo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldSwitch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testFoldSwitch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFuseIntoForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testFuseIntoForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoFuseIntoWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testNoFuseIntoWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoFuseIntoDo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testNoFuseIntoDo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoGlobalSchopeChanges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testNoGlobalSchopeChanges();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoFunctionBlockChanges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StatementFusionTest() {
				public void runTest() throws Exception {
					testNoFunctionBlockChanges();
				}
			};
			testcase.run();
		}
	}

}