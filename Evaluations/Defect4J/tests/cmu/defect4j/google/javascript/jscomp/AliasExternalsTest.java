package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AliasExternalsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGlobalAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testGlobalAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaliasable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testUnaliasable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasableGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testAliasableGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasableAndUnaliasableGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testAliasableAndUnaliasableGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalAssigment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testGlobalAssigment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewOperator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testNewOperator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testGetProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoredOps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testIgnoredOps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testSetProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParentChild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testParentChild();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModulesWithoutDependencies() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testModulesWithoutDependencies();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModulesWithDependencies() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testModulesWithDependencies();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccessorPushedDeeper1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testPropAccessorPushedDeeper1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccessorPushedDeeper2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testPropAccessorPushedDeeper2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccessorPushedDeeper3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testPropAccessorPushedDeeper3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropAccessorNotPushedDeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testPropAccessorNotPushedDeeper();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropMutatorPushedDeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testPropMutatorPushedDeeper();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropMutatorNotPushedDeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testPropMutatorNotPushedDeeper();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalAliasPushedDeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testGlobalAliasPushedDeeper();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalAliasNotPushedDeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testGlobalAliasNotPushedDeeper();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoAliasAnnotationForSingleVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testNoAliasAnnotationForSingleVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoAliasAnnotationForMultiVarDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testNoAliasAnnotationForMultiVarDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoAliasAnnotationForFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AliasExternalsTest() {
				public void runTest() throws Exception {
					testNoAliasAnnotationForFunction();
				}
			};
			testcase.run();
		}
	}

}