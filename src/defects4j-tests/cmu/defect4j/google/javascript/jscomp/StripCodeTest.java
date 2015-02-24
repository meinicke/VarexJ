package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class StripCodeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testLoggerDefinedInConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInPrototype1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInPrototype1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInPrototype2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInPrototype2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInPrototype3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInPrototype3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInPrototype4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInPrototype4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInPrototype5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInPrototype5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedStatically() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedStatically();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInObjectLiteral1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInObjectLiteral1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInObjectLiteral2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInObjectLiteral2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInObjectLiteral3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInObjectLiteral3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInObjectLiteral4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInObjectLiteral4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedInPrototypeAndUsedInConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedInPrototypeAndUsedInConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerDefinedStaticallyAndUsedInConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerDefinedStaticallyAndUsedInConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerVarDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerVarDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerMethodCallByVariableType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerMethodCallByVariableType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubPropertyAccessByVariableName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testSubPropertyAccessByVariableName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrefixedVariableName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPrefixedVariableName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrefixedPropertyName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPrefixedPropertyName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrefixedClassName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPrefixedClassName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerClassDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testLoggerClassDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticLoggerPropertyDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testStaticLoggerPropertyDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticLoggerMethodDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testStaticLoggerMethodDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeFieldDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPrototypeFieldDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeFieldDefinitionWithoutAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPrototypeFieldDefinitionWithoutAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeMethodDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPrototypeMethodDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicPropertyAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPublicPropertyAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalCallWithStrippedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testGlobalCallWithStrippedType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassDefiningCallWithStripType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testClassDefiningCallWithStripType8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithEmptyStringKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testPropertyWithEmptyStringKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarinIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testVarinIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElemInIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testGetElemInIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignInIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testAssignInIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamePrefix() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testNamePrefix();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypePrefix() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testTypePrefix();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStripCallsToStrippedNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testStripCallsToStrippedNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStripVarsInitializedFromStrippedNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testStripVarsInitializedFromStrippedNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReportErrorOnStripInNestedAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testReportErrorOnStripInNestedAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewOperatior1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testNewOperatior1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewOperatior2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testNewOperatior2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrazyNesting1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testCrazyNesting1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrazyNesting2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testCrazyNesting2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrazyNesting3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testCrazyNesting3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrazyNesting4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testCrazyNesting4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrazyNesting5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StripCodeTest() {
				public void runTest() throws Exception {
					testCrazyNesting5();
				}
			};
			testcase.run();
		}
	}

}