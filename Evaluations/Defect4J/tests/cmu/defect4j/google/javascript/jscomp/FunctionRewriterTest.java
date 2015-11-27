package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FunctionRewriterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testReplaceReturnConst1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceReturnConst1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceReturnConst2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceReturnConst2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceReturnConst3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceReturnConst3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceGetter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceGetter1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceGetter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceGetter2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceSetter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceSetter1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceSetter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceSetter2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceSetter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceSetter3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceSetter4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceSetter4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceEmptyFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceEmptyFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceEmptyFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceEmptyFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceEmptyFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceEmptyFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceIdentityFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceIdentityFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReplaceIdentityFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testReplaceIdentityFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue538() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionRewriterTest() {
				public void runTest() throws Exception {
					testIssue538();
				}
			};
			testcase.run();
		}
	}

}