package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class LinkedFlowScopeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testOptimize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testOptimize();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJoin1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testJoin1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJoin2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testJoin2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJoin3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testJoin3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLongChain1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testLongChain1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLongChain2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testLongChain2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLongChain3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testLongChain3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindUniqueSlot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testFindUniqueSlot();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDiffer1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testDiffer1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDiffer2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LinkedFlowScopeTest() {
				public void runTest() throws Exception {
					testDiffer2();
				}
			};
			testcase.run();
		}
	}

}