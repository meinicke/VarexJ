package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ClosureRewriteClassTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInnerClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testInnerClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplete1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testComplete1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasic1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testBasic1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalid1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testInvalid1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalid2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testInvalid2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalid3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testInvalid3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplete2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testComplete2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassWithStaticInitFn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testClassWithStaticInitFn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalid4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testInvalid4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalid5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testInvalid5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalid6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testInvalid6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasic2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testBasic2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasic3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureRewriteClassTest() {
				public void runTest() throws Exception {
					testBasic3();
				}
			};
			testcase.run();
		}
	}

}