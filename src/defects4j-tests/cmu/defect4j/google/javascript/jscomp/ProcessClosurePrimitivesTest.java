package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ProcessClosurePrimitivesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSimpleProvides() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testSimpleProvides();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleProvides() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testMultipleProvides();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalOfProvidedObjLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalOfProvidedObjLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvidedDeclaredFunctionError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvidedDeclaredFunctionError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignment1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignment1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignment3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignment3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignment4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignment4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemovalFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testNoRemovalFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemovalFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testNoRemovalFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignmentInIf1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignmentInIf1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignmentInIf2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignmentInIf2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignmentInIf3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignmentInIf3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalMultipleAssignmentInIf4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalMultipleAssignmentInIf4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleDeclarationError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testMultipleDeclarationError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleDeclarationError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testMultipleDeclarationError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleDeclarationError3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testMultipleDeclarationError3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideAfterDeclarationError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideAfterDeclarationError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideErrorCases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideErrorCases();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalOfRequires() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRemovalOfRequires();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRequireErrorCases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRequireErrorCases();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateProvides() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testLateProvides();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingProvides() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testMissingProvides();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDependency() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testAddDependency();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidSetCssNameMapping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidSetCssNameMapping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidSetCssNameMappingWithType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidSetCssNameMappingWithType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetCssNameMappingNonStringValueReturnsError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testSetCssNameMappingNonStringValueReturnsError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetCssNameMappingValidity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testSetCssNameMappingValidity();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadCrossModuleRequire() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testBadCrossModuleRequire();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodCrossModuleRequire1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testGoodCrossModuleRequire1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodCrossModuleRequire2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testGoodCrossModuleRequire2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleAdditionalProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testSimpleAdditionalProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleAdditionalProvideAtEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testSimpleAdditionalProvideAtEnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleDottedAdditionalProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testSimpleDottedAdditionalProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlappingAdditionalProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testOverlappingAdditionalProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlappingAdditionalProvideAtEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testOverlappingAdditionalProvideAtEnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlappingDottedAdditionalProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testOverlappingDottedAdditionalProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRequireOfAdditionalProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRequireOfAdditionalProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingRequireWithAdditionalProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testMissingRequireWithAdditionalProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateRequire() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testLateRequire();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReorderedProvides() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testReorderedProvides();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReorderedProvides2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testReorderedProvides2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideOrder1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideOrder1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideOrder2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideOrder2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideOrder3a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideOrder3a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideOrder3b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideOrder3b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideOrder4a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideOrder4a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideOrder4b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideOrder4b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidBase9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testInvalidBase9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidBase1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidBase1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidBase2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidBase2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidBase3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidBase3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidBase4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidBase4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidBase5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidBase5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidBase6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testValidBase6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitAndExplicitProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testImplicitAndExplicitProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitProvideInIndependentModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testImplicitProvideInIndependentModules();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitProvideInIndependentModules2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testImplicitProvideInIndependentModules2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitProvideInIndependentModules3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testImplicitProvideInIndependentModules3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideInIndependentModules1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideInIndependentModules1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideInIndependentModules2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideInIndependentModules2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideInIndependentModules2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideInIndependentModules2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideInIndependentModules3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideInIndependentModules3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideInIndependentModules3b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideInIndependentModules3b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideInIndependentModules4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideInIndependentModules4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRequireOfBaseGoog() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testRequireOfBaseGoog();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourcePositionPreservation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testSourcePositionPreservation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoStubForProvidedTypedef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testNoStubForProvidedTypedef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoStubForProvidedTypedef2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testNoStubForProvidedTypedef2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoStubForProvidedTypedef4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testNoStubForProvidedTypedef4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProvideRequireSameFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ProcessClosurePrimitivesTest() {
				public void runTest() throws Exception {
					testProvideRequireSameFile();
				}
			};
			testcase.run();
		}
	}

}