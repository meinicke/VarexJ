package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RemoveUnusedVarsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRecursiveFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRecursiveFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRecursiveFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeJSCompiler_renameProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeJSCompiler_renameProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeJSCompiler_ObjectPropertyString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeJSCompiler_ObjectPropertyString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModule() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testModule();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReflectedMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testReflectedMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnusedVars() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveUnusedVars();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArgRemoval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testFunctionArgRemoval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArgRemovalFromCallSites() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testFunctionArgRemovalFromCallSites();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsDeadButEscaped() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testFunctionsDeadButEscaped();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarInControlStructure() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testVarInControlStructure();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRValueHoisting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRValueHoisting();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testFunctionWithName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testFunctionWithName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveGlobal1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveGlobal1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveGlobal2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveGlobal2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveGlobal3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveGlobal3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveGlobal4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveGlobal4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue168a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testIssue168a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue168b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testIssue168b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign5b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign5b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign6b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign6b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedAssign8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedAssign8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign3b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign3b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign7b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign7b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedPropAssign7c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUnusedPropAssign7c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedPropAssign9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testUsedPropAssign9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencies1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDependencies1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencies1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDependencies1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencies1c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDependencies1c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencies2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDependencies2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencies2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDependencies2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependencies2c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDependencies2c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalVarReferencesLocalVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testGlobalVarReferencesLocalVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalVarReferencesGlobalVar1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testLocalVarReferencesGlobalVar1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalVarReferencesGlobalVar2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testLocalVarReferencesGlobalVar2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallSiteInteraction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testCallSiteInteraction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallSiteInteraction_contructors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testCallSiteInteraction_contructors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArgRemovalCausingInconsistency() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testFunctionArgRemovalCausingInconsistency();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnusedVarsPossibleNpeCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveUnusedVarsPossibleNpeCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotOptimizeSetters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testDoNotOptimizeSetters();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveSingletonClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveSingletonClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInheritedClass12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testRemoveInheritedClass12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue618_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testIssue618_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue618_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testIssue618_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testNestedAssign1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testNestedAssign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedVarsTest() {
				public void runTest() throws Exception {
					testNestedAssign3();
				}
			};
			testcase.run();
		}
	}

}