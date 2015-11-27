package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckAccessControlsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testThatNumbersArentDeprecated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testThatNumbersArentDeprecated();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeprecatedFunctionVariable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testDeprecatedFunctionVariable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningInGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningInGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeprecatedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testDeprecatedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningOnDeprecatedConstVariable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningOnDeprecatedConstVariable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningInGlobalScopeForCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningInGlobalScopeForCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningInDeprecatedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningInDeprecatedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningInNormalClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningInNormalClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForDeprecatedClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForDeprecatedClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningForDeprecatedClassInstance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningForDeprecatedClassInstance();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForDeprecatedSuperClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForDeprecatedSuperClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForDeprecatedSuperClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForDeprecatedSuperClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForPrototypeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForPrototypeProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningForNumbers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningForNumbers();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningInDeprecatedClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningInDeprecatedClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningInDeprecatedClass2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningInDeprecatedClass2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningInDeprecatedStaticMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningInDeprecatedStaticMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningInStaticMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningInStaticMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeprecatedObjLitKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testDeprecatedObjLitKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForSubclassMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForSubclassMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForSuperClassWithDeprecatedSubclassMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForSuperClassWithDeprecatedSubclassMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForSuperclassMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForSuperclassMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForSuperclassMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForSuperclassMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForBind() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForBind();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWarningForDeprecatedClassInGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testWarningForDeprecatedClassInGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningForPrototypeCopying() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningForPrototypeCopying();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarningOnDeprecatedPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoWarningOnDeprecatedPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrivateAccessForNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testPrivateAccessForNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrivateAccessForProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testPrivateAccessForProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrivateAccessForProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testPrivateAccessForProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrivateAccessForProperties3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testPrivateAccessForProperties3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrivateAccessForProperties4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testPrivateAccessForProperties4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoPrivateAccessForProperties8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoPrivateAccessForProperties8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtectedAccessForProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testProtectedAccessForProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtectedAccessForProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testProtectedAccessForProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtectedAccessForProperties3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testProtectedAccessForProperties3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtectedAccessForProperties4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testProtectedAccessForProperties4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtectedAccessForProperties5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testProtectedAccessForProperties5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtectedAccessForProperties6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testProtectedAccessForProperties6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoProtectedAccessForProperties1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoProtectedAccessForProperties1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoProtectedAccessForProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoProtectedAccessForProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoProtectedAccessForProperties3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoProtectedAccessForProperties3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoProtectedAccessForProperties4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoProtectedAccessForProperties4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoProtectedAccessForProperties5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoProtectedAccessForProperties5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoExceptionsWithBadConstructors1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoExceptionsWithBadConstructors1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoExceptionsWithBadConstructors2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNoExceptionsWithBadConstructors2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoodOverrideOfProtectedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testGoodOverrideOfProtectedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadOverrideOfProtectedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testBadOverrideOfProtectedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadOverrideOfPrivateProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testBadOverrideOfPrivateProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAccessOfStaticMethodOnPrivateConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testAccessOfStaticMethodOnPrivateConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAccessOfStaticMethodOnPrivateQualifiedConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testAccessOfStaticMethodOnPrivateQualifiedConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceofOfPrivateConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testInstanceofOfPrivateConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOkAssignmentOfDeprecatedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testOkAssignmentOfDeprecatedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBadReadOfDeprecatedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testBadReadOfDeprecatedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoboxedDeprecatedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testAutoboxedDeprecatedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoboxedPrivateProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testAutoboxedPrivateProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullableDeprecatedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNullableDeprecatedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullablePrivateProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testNullablePrivateProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantProperty14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testConstantProperty14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppressConstantProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testSuppressConstantProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppressConstantProperty2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testSuppressConstantProperty2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFinalClassCannotBeSubclassed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckAccessControlsTest() {
				public void runTest() throws Exception {
					testFinalClassCannotBeSubclassed();
				}
			};
			testcase.run();
		}
	}

}