package cmu.defect4j.google.javascript.rhino;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class IRTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmpty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testEmpty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParamList() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testParamList();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScript() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testScript();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScriptThrows() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testScriptThrows();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExprResult() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testExprResult();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue727_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testIssue727_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue727_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testIssue727_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue727_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.IRTest() {
				public void runTest() throws Exception {
					testIssue727_3();
				}
			};
			testcase.run();
		}
	}

}