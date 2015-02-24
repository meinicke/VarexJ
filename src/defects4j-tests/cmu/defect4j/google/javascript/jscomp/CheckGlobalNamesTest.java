package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckGlobalNamesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRefToDefinedProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToDefinedProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToDefinedProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToDefinedProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToDefinedProperties3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToDefinedProperties3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallUndefinedFunctionGivesNoWaring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testCallUndefinedFunctionGivesNoWaring();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToPropertyOfAliasedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToPropertyOfAliasedName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToUndefinedProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToUndefinedProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToUndefinedProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToUndefinedProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToUndefinedProperty3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToUndefinedProperty3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToUndefinedProperty4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToUndefinedProperty4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToDescendantOfUndefinedProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToDescendantOfUndefinedProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToDescendantOfUndefinedProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToDescendantOfUndefinedProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToDescendantOfUndefinedProperty3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToDescendantOfUndefinedProperty3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefinedPrototypeMethodRefGivesNoWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testUndefinedPrototypeMethodRefGivesNoWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexPropAssignGivesNoWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testComplexPropAssignGivesNoWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedefGivesNoWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testTypedefGivesNoWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRefToDescendantOfUndefinedPropertyGivesCorrectWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testRefToDescendantOfUndefinedPropertyGivesCorrectWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceInjection() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testNamespaceInjection();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppressionOfUndefinedNamesWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testSuppressionOfUndefinedNamesWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningForSimpleVarModuleDep1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testNoWarningForSimpleVarModuleDep1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningForSimpleVarModuleDep2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testNoWarningForSimpleVarModuleDep2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningForGoodModuleDep1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testNoWarningForGoodModuleDep1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModuleDep1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testBadModuleDep1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadModuleDep2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testBadModuleDep2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSelfModuleDep() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testSelfModuleDep();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefinedModuleDep1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testUndefinedModuleDep1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateDefinedName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testLateDefinedName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateDefinedName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testLateDefinedName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateDefinedName3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testLateDefinedName3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateDefinedName4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testLateDefinedName4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateDefinedName5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testLateDefinedName5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateDefinedName6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testLateDefinedName6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOkLateDefinedName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testOkLateDefinedName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOkLateDefinedName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testOkLateDefinedName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPathologicalCaseThatsOkAnyway() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testPathologicalCaseThatsOkAnyway();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOkGlobalDeclExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testOkGlobalDeclExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadInterfacePropRef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testBadInterfacePropRef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceFunctionPropRef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testInterfaceFunctionPropRef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectPrototypeProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testObjectPrototypeProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCustomObjectPrototypeProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testCustomObjectPrototypeProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPrototypeProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testFunctionPrototypeProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndirectlyDeclaredProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testIndirectlyDeclaredProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogInheritsAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testGoogInheritsAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogInheritsAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckGlobalNamesTest() {
				public void runTest() throws Exception {
					testGoogInheritsAlias2();
				}
			};
			testcase.run();
		}
	}

}