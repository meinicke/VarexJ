package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AliasStringsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeveral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testSeveral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortedOutput() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testSortedOutput();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiterals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testObjectLiterals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testFunctionCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegularExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testRegularExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBlackList() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testBlackList();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLongStableAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testLongStableAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLongStableAliasHashCollision() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testLongStableAliasHashCollision();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringsThatAreGlobalVarValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testStringsThatAreGlobalVarValues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringsInModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testStringsInModules();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringsInModules2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testStringsInModules2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testEmptyModules();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasStringsTest() {
				public void runTest() throws Exception {
					testGetProp();
				}
			};
			testcase.run();
		}
	}

}