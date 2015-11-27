package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RemoveUnusedClassPropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue730() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testIssue730();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimple1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testSimple1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimple2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testSimple2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimple3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testSimple3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testObjLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExport() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testExport();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignOp1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testAssignOp1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignOp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testAssignOp2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInc1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testInc1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInc2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testInc2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSCompiler_renameProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testJSCompiler_renameProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testObjectKeys();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtern() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedClassPropertiesTest() {
				public void runTest() throws Exception {
					testExtern();
				}
			};
			testcase.run();
		}
	}

}