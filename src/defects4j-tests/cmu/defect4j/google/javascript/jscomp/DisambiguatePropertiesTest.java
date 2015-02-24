package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DisambiguatePropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEnumOfObjects2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testEnumOfObjects2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumOfObjects3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testEnumOfObjects3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testOneType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testOneType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testOneType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeAndInstance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypeAndInstance();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeAndInstance2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypeAndInstance2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoTypes1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoTypes1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoTypes2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoTypes2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoTypes3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoTypes3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoFields();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoSeparateFieldsTwoTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoSeparateFieldsTwoTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoreUnknownType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testIgnoreUnknownType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoreUnknownType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testIgnoreUnknownType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnoreUnknownType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testIgnoreUnknownType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionTypeTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnionTypeTwoFields();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testConstructorFields();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testStaticProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupertypeWithSameField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSupertypeWithSameField();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testScopedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnresolvedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnresolvedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testNamedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnknownType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumOfObjects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testEnumOfObjects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUntypedExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUntypedExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionTypeInvalidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnionTypeInvalidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionAndExternTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnionAndExternTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTypedExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypesWithSameField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSubtypesWithSameField();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupertypeReferenceOfSubtypeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSupertypeReferenceOfSubtypeProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralNotRenamed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testObjectLiteralNotRenamed();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralReflected() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testObjectLiteralReflected();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralLends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testObjectLiteralLends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureInherits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testClosureInherits();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipNativeFunctionMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSkipNativeFunctionMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipNativeObjectMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSkipNativeObjectMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtendNativeType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testExtendNativeType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testStringFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnusedTypeInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnusedTypeInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceOfSuperclass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testInterfaceOfSuperclass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoInterfacesWithSomeInheritance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoInterfacesWithSomeInheritance();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidatingInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testInvalidatingInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleInterfaces() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testMultipleInterfaces();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceWithSupertypeImplementor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testInterfaceWithSupertypeImplementor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSuperInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceUnionWithCtor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testInterfaceUnionWithCtor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternInterfaceUnionWithCtor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testExternInterfaceUnionWithCtor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMismatchInvalidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testMismatchInvalidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testBadCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeterministicNaming() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testDeterministicNaming();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCustomInherits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testCustomInherits();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipNativeFunctionStaticProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSkipNativeFunctionStaticProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testErrorOnProtectedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testErrorOnProtectedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMismatchForbiddenInvalidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DisambiguatePropertiesTest() {
				public void runTest() throws Exception {
					testMismatchForbiddenInvalidation();
				}
			};
			testcase.run();
		}
	}

}