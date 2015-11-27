package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TypedScopeCreatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAbstractMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testAbstractMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testObjectLiteralCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testConstructorAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testGlobalThis1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThis2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testGlobalThis2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMethodsPrototypeTwoWays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testAddMethodsPrototypeTwoWays();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testStubProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testConstructorProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertyMethodWithoutAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPrototypePropertyMethodWithoutAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testEnumProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty1a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty2c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty2c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredProperty6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredProperty6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeInit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPrototypeInit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBogusPrototypeInit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testBogusPrototypeInit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredPrototypeProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredPrototypeProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredPrototypeProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredPrototypeProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumElement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testEnumElement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testNamespacedEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testEnumAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacesEnumAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testNamespacesEnumAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollectedFunctionStub() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testCollectedFunctionStub();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollectedFunctionStubLocal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testCollectedFunctionStubLocal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedFunctionStub() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testNamespacedFunctionStub();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedFunctionStubLocal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testNamespacedFunctionStubLocal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollectedCtorProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testCollectedCtorProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOnUnknownSuperClass1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertyOnUnknownSuperClass1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOnUnknownSuperClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertyOnUnknownSuperClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodBeforeFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testMethodBeforeFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodBeforeFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testMethodBeforeFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertiesOnInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertiesOnInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertiesOnInterface2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertiesOnInterface2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubsInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testStubsInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubsInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testStubsInExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubsInExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testStubsInExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubsInExterns4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testStubsInExterns4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertyInExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertyInExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyInExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertyInExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedStubsInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTypedStubsInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypesInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTypesInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyDeclarationOnInstanceType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertyDeclarationOnInstanceType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyDeclarationOnRecordType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testPropertyDeclarationOnRecordType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadObjectLiteralCast1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testBadObjectLiteralCast1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadObjectLiteralCast2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testBadObjectLiteralCast2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testConstructorNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForLoopIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testForLoopIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedConstructorAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testNamespacedConstructorAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType2a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType4a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType4a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType4b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType4b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType7b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType7b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType7c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType7c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureParameterTypesWithoutJSDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testClosureParameterTypesWithoutJSDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureParameterTypesWithJSDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testClosureParameterTypesWithJSDoc();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateExternProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDuplicateExternProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateExternProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDuplicateExternProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testAbstractMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethod3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testAbstractMethod3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethod4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testAbstractMethod4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnTypeInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testReturnTypeInference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnTypeInference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testReturnTypeInference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnTypeInference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testReturnTypeInference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnTypeInference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testReturnTypeInference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnTypeInference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testReturnTypeInference5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralTypesInferred() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testLiteralTypesInferred();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalQualifiedNameInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testGlobalQualifiedNameInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredObjectLitProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredObjectLitProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredObjectLitProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredObjectLitProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredObjectLitProperty3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredObjectLitProperty3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredObjectLitProperty4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredObjectLitProperty4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredObjectLitProperty5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredObjectLitProperty5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredObjectLitProperty6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredObjectLitProperty6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredObjectLitProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredObjectLitProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInferredObjectLitProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testInferredObjectLitProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredConstType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredConstType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredConstType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredConstType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredConstType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredConstType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredConstType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredConstType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredConstType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredConstType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadCtorInit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testBadCtorInit1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadCtorInit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testBadCtorInit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadIfaceInit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testBadIfaceInit1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadIfaceInit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testBadIfaceInit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testFunctionInHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testFunctionInAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testFunctionInOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInComma() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testFunctionInComma();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredCatchExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredCatchExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaredCatchExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testDeclaredCatchExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplateType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testTemplateType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testActiveXObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypedScopeCreatorTest() {
				public void runTest() throws Exception {
					testActiveXObject();
				}
			};
			testcase.run();
		}
	}

}