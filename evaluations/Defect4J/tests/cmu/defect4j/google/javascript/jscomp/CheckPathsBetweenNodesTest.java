package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckPathsBetweenNodesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSomeValidPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testSomeValidPaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManyValidPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testManyValidPaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCycles1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testCycles1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCycles2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testCycles2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCycles3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testCycles3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSomePath1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testSomePath1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSomePath2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testSomePath2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSomePathRevisiting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testSomePathRevisiting();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonInclusive() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckPathsBetweenNodesTest() {
				public void runTest() throws Exception {
					testNonInclusive();
				}
			};
			testcase.run();
		}
	}

}