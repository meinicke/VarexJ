package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JSModuleGraphTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testModuleDepth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testModuleDepth();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeepestCommonDep() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testDeepestCommonDep();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeepestCommonDepInclusive() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testDeepestCommonDepInclusive();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTransitiveDepsDeepestFirst() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testGetTransitiveDepsDeepestFirst();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCoalesceDuplicateFiles() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testCoalesceDuplicateFiles();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManageDependencies1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testManageDependencies1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManageDependencies2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testManageDependencies2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoFiles() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testNoFiles();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManageDependencies3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testManageDependencies3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManageDependencies4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testManageDependencies4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToJson() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleGraphTest() {
				public void runTest() throws Exception {
					testToJson();
				}
			};
			testcase.run();
		}
	}

}