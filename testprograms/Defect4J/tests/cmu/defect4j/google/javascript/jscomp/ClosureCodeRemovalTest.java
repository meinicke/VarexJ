package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ClosureCodeRemovalTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRemoveAbstract() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testRemoveAbstract();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveMultiplySetAbstract() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testRemoveMultiplySetAbstract();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotRemoveNormal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testDoNotRemoveNormal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertionRemoval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testAssertionRemoval1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotRemoveOverride() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testDoNotRemoveOverride();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotRemoveNonQualifiedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testDoNotRemoveNonQualifiedName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStopRemovalAtNonQualifiedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testStopRemovalAtNonQualifiedName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertionRemoval2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testAssertionRemoval2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertionRemoval3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testAssertionRemoval3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssertionRemoval4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureCodeRemovalTest() {
				public void runTest() throws Exception {
					testAssertionRemoval4();
				}
			};
			testcase.run();
		}
	}

}