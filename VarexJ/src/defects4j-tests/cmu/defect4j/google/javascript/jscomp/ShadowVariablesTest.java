package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ShadowVariablesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testShadowSimple1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowSimple1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowSimple2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowSimple2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowMostUsedVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowMostUsedVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowBug1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowBug1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoShadowReferencedVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testNoShadowReferencedVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoShadowGlobalVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testNoShadowGlobalVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowBleedInFunctionName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowBleedInFunctionName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoShadowLessPopularName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testNoShadowLessPopularName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowFunctionName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowFunctionName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowLotsOfScopes1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowLotsOfScopes1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowLotsOfScopes2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowLotsOfScopes2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowLotsOfScopes3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowLotsOfScopes3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowLotsOfScopes4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowLotsOfScopes4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowLotsOfScopes5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowLotsOfScopes5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowWithShadowAlready() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testShadowWithShadowAlready();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptimal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testOptimal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSharingAcrossInnerScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testSharingAcrossInnerScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedLocal1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testExportedLocal1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedLocal2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testExportedLocal2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug4172539() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ShadowVariablesTest() {
				public void runTest() throws Exception {
					testBug4172539();
				}
			};
			testcase.run();
		}
	}

}