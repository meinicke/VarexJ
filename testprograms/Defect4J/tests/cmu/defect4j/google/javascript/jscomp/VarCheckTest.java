package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class VarCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRecursiveFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testRecursiveFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencedVarNotDefined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testReferencedVarNotDefined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencedVarDefined1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testReferencedVarDefined1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencedVarDefined2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testReferencedVarDefined2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencedVarsExternallyDefined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testReferencedVarsExternallyDefined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiplyDeclaredVars1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testMultiplyDeclaredVars1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiplyDeclaredVars2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testMultiplyDeclaredVars2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiplyDeclaredVars3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testMultiplyDeclaredVars3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiplyDeclaredVars4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testMultiplyDeclaredVars4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarReferenceInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testVarReferenceInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropReferenceInExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testPropReferenceInExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropReferenceInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testPropReferenceInExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropReferenceInExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testPropReferenceInExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarInWithBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testVarInWithBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidFunctionExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testValidFunctionExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testRecursiveFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegalVarReferenceBetweenModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testLegalVarReferenceBetweenModules();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingModuleDependencyDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testMissingModuleDependencyDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testViolatedModuleDependencyDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testViolatedModuleDependencyDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingModuleDependencySkipNonStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testMissingModuleDependencySkipNonStrict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testViolatedModuleDependencySkipNonStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testViolatedModuleDependencySkipNonStrict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingModuleDependencySkipNonStrictNotPromoted() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testMissingModuleDependencySkipNonStrictNotPromoted();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testViolatedModuleDependencyNonStrictNotPromoted() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testViolatedModuleDependencyNonStrictNotPromoted();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependentStrictModuleDependencyCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testDependentStrictModuleDependencyCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndependentStrictModuleDependencyCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testIndependentStrictModuleDependencyCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStarStrictModuleDependencyCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testStarStrictModuleDependencyCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardVarReferenceInLocalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testForwardVarReferenceInLocalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardVarReferenceInLocalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testForwardVarReferenceInLocalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleSanityCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testSimpleSanityCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testLocalVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoLocalVars() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testTwoLocalVars();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctionLocalVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testInnerFunctionLocalVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoCreateVarsForLabels() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testNoCreateVarsForLabels();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVariableInNormalCodeUsedInExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testVariableInNormalCodeUsedInExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVariableInNormalCodeUsedInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testVariableInNormalCodeUsedInExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVariableInNormalCodeUsedInExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testVariableInNormalCodeUsedInExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVariableInNormalCodeUsedInExterns4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testVariableInNormalCodeUsedInExterns4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testCallInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreak() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testBreak();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VarCheckTest() {
				public void runTest() throws Exception {
					testContinue();
				}
			};
			testcase.run();
		}
	}

}