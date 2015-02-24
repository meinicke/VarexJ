package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CollapseAnonymousFunctionsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInnerFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testInnerFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testLocalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testLocalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarNotImmediatelyBelowScriptOrBlock1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testVarNotImmediatelyBelowScriptOrBlock1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarNotImmediatelyBelowScriptOrBlock2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testVarNotImmediatelyBelowScriptOrBlock2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarNotImmediatelyBelowScriptOrBlock3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testVarNotImmediatelyBelowScriptOrBlock3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testMultipleVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleVar2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testMultipleVar2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBothScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testBothScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalScopeOnly1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testLocalScopeOnly1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalScopeOnly2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testLocalScopeOnly2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAlert() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAlert();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveInternal1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testRecursiveInternal1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveInternal2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testRecursiveInternal2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveExternal1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testRecursiveExternal1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveExternal2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testRecursiveExternal2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testConstantFunction1();
				}
			};
			testcase.run();
		}
	}

}