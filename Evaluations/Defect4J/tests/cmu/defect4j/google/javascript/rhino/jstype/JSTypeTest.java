package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JSTypeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunctionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNullType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUniversalConstructorType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testUniversalConstructorType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNoObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNoType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoResolvedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNoResolvedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testArrayType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckedUnknownType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCheckedUnknownType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAllType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testAllType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTheObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testTheObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumberObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNumberObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNumberValueType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNumberValueType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testDateType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegExpType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRegExpType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testStringObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringValueType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testStringValueType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionInstanceType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionInstanceType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeSubtyping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeSubtyping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeSubtypingWithInferredProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeSubtypingWithInferredProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeLeastSuperType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeLeastSuperType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeLeastSuperType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeLeastSuperType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeLeastSuperType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeLeastSuperType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeLeastSuperType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeLeastSuperType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordTypeGreatestSubType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordTypeGreatestSubType8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testApplyOfDateMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testApplyOfDateMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallOfDateMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCallOfDateMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionTypeRepresentation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionTypeRepresentation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionTypeRelationships() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionTypeRelationships();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProxiedFunctionTypeRelationships() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testProxiedFunctionTypeRelationships();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionSubTypeRelationships() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionSubTypeRelationships();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPrototypeAndImplicitPrototype1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionPrototypeAndImplicitPrototype1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPrototypeAndImplicitPrototype2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionPrototypeAndImplicitPrototype2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocOnPrototypeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testJSDocOnPrototypeProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVoidType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testVoidType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanValueType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testBooleanValueType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testBooleanObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testEnumType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumElementType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testEnumElementType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringEnumType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testStringEnumType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringObjectEnumType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testStringObjectEnumType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogBar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGoogBar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectTypePropertiesCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testObjectTypePropertiesCount();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testDefineProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectTypePropertiesCountWithShadowing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testObjectTypePropertiesCountWithShadowing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedGoogBar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNamedGoogBar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeChaining() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testPrototypeChaining();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceFunctionChaining() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testInstanceFunctionChaining();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanTestForEqualityWithCornerCases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCanTestForEqualityWithCornerCases();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTestForEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testTestForEquality();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingSimpleTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingSimpleTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingObjectTopOfObjects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingObjectTopOfObjects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingFunctionPrototypeType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingFunctionPrototypeType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingFunctionFixedArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingFunctionFixedArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingFunctionMultipleFixedArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingFunctionMultipleFixedArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingFunctionFixedArgsNotMatching() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingFunctionFixedArgsNotMatching();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingFunctionVariableArgsOneOnly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingFunctionVariableArgsOneOnly();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingFunctionVariableArgsBoth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingFunctionVariableArgsBoth();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingMostGeneralFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingMostGeneralFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSymmetryOfTestForEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSymmetryOfTestForEquality();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSymmetryOfLeastSupertype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSymmetryOfLeastSupertype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWeirdBug() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testWeirdBug();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSymmetryOfGreatestSubtype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSymmetryOfGreatestSubtype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReflexivityOfLeastSupertype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testReflexivityOfLeastSupertype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReflexivityOfGreatestSubtype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testReflexivityOfGreatestSubtype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLeastSupertypeUnresolvedNamedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testLeastSupertypeUnresolvedNamedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLeastSupertypeUnresolvedNamedType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testLeastSupertypeUnresolvedNamedType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLeastSupertypeUnresolvedNamedType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testLeastSupertypeUnresolvedNamedType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubclassOfUnresolvedNamedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubclassOfUnresolvedNamedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupertypeOfProxiedFunctionTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSupertypeOfProxiedFunctionTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeOfThisIsProxied() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testTypeOfThisIsProxied();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedTypeEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNamedTypeEquals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedTypeEquals2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNamedTypeEquals2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardDeclaredNamedTypeEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testForwardDeclaredNamedTypeEquals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardDeclaredNamedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testForwardDeclaredNamedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGreatestSubtypeSimpleTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGreatestSubtypeSimpleTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingDerivedExtendsNamedBaseType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testSubtypingDerivedExtendsNamedBaseType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNamedSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordAndObjectChain2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordAndObjectChain2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecordAndObjectChain3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRecordAndObjectChain3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullableNamedTypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNullableNamedTypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumTypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testEnumTypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionUnionSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testFunctionUnionSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testConstructorSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogBarSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGoogBarSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorWithArgSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testConstructorWithArgSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInstanceSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testInterfaceInstanceSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceInheritanceSubtypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testInterfaceInheritanceSubtypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousObjectChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testAnonymousObjectChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousEnumElementChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testAnonymousEnumElementChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArrayChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testParameterizedArrayChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedArrayChain2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testParameterizedArrayChain2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedObjectChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testParameterizedObjectChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedParameterizedTypeChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testMixedParameterizedTypeChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedTypeSubtypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testParameterizedTypeSubtypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterizedTypeRelations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testParameterizedTypeRelations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRestrictedTypeGivenToBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRestrictedTypeGivenToBoolean();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegisterProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRegisterProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegisterPropertyMemoization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testRegisterPropertyMemoization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGreatestSubtypeWithProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGreatestSubtypeWithProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodSetPrototypeBasedOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGoodSetPrototypeBasedOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLateSetPrototypeBasedOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testLateSetPrototypeBasedOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypeUnderEquality1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypeUnderEquality1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderEquality2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderEquality2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderEquality3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderEquality3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderEquality4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderEquality4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderEquality5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderEquality5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderEquality6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderEquality6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderInequality1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderInequality1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderInequality2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderInequality2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderInequality3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderInequality3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetTypesUnderInequality4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetTypesUnderInequality4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateRecordType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCreateRecordType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateOptionalType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCreateOptionalType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateAnonymousObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCreateAnonymousObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateAnonymousObjectType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCreateAnonymousObjectType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateObjectType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCreateObjectType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug903110() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testBug903110();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug904123() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testBug904123();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHasOwnProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testHasOwnProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamedTypeHasOwnProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testNamedTypeHasOwnProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfaceHasOwnProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testInterfaceHasOwnProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPropertyNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetPropertyNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAndSetJSDocInfoWithNamedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetAndSetJSDocInfoWithNamedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAndSetJSDocInfoWithObjectTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetAndSetJSDocInfoWithObjectTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetAndSetJSDocInfoWithNoType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testGetAndSetJSDocInfoWithNoType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectGetSubTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testObjectGetSubTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplementingType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testImplementingType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsTemplatedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testIsTemplatedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplatizedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testTemplatizedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPartiallyTemplatizedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testPartiallyTemplatizedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidTemplatizedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testInvalidTemplatizedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanCastTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testCanCastTo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeTest() {
				public void runTest() throws Exception {
					testUnknownType();
				}
			};
			testcase.run();
		}
	}

}