package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CollapsePropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testNewOperator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNewOperator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCollapse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiLevelCollapse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testMultiLevelCollapse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDecrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDecrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testIncrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisusedEnumTag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testMisusedEnumTag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithGet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithGet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithGet2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithGet2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithGet3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithGet3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithSet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithSet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithSet2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithSet2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithSet3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithSet3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithGetAndSet1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithGetAndSet1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationWithDuplicateKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationWithDuplicateKeys();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignmentDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignmentDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignmentDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignmentDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignmentDepth3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignmentDepth3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignmentDepth4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignmentDepth4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectDeclaredToPreserveItsPreviousValue1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectDeclaredToPreserveItsPreviousValue1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectDeclaredToPreserveItsPreviousValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectDeclaredToPreserveItsPreviousValue2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectDeclaredToPreserveItsPreviousValue3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectDeclaredToPreserveItsPreviousValue3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth1_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth1_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth1_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth1_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth1_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth1_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth1_4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth1_4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth1_5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth1_5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth1_6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth1_6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalObjectNameInBooleanExpressionDepth3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalObjectNameInBooleanExpressionDepth3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionNameInBooleanExpressionDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionNameInBooleanExpressionDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionNameInBooleanExpressionDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionNameInBooleanExpressionDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForObjectDepth1_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForObjectDepth1_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForObjectDepth1_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForObjectDepth1_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForObjectDepth1_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForObjectDepth1_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForObjectDepth2_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForObjectDepth2_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForObjectDepth2_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForObjectDepth2_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumDepth1_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumDepth1_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumDepth1_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumDepth1_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumDepth1_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumDepth1_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumDepth1_4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumDepth1_4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumDepth2_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumDepth2_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumDepth2_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumDepth2_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumDepth2_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumDepth2_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumOfObjects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumOfObjects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForEnumOfObjects2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForEnumOfObjects2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForPropertyOfEnumOfObjects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForPropertyOfEnumOfObjects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForPropertyOfEnumOfObjects2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForPropertyOfEnumOfObjects2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMisusedConstructorTag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testMisusedConstructorTag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForFunctionDepth1_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForFunctionDepth1_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForCtorDepth1_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForCtorDepth1_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForFunctionDepth1_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForFunctionDepth1_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForCtorDepth1_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForCtorDepth1_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForFunctionDepth1_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForFunctionDepth1_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForCtorDepth1_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForCtorDepth1_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForFunctionDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForFunctionDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForCtorDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForCtorDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForClassDepth1_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForClassDepth1_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForClassDepth1_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForClassDepth1_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForClassDepth1_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForClassDepth1_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForClassDepth2_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForClassDepth2_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForClassDepth2_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForClassDepth2_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForClassDepth2_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForClassDepth2_3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasCreatedForClassProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasCreatedForClassProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedObjLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNestedObjLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDeclarationUsedInSameVarList() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDeclarationUsedInSameVarList();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropGetInsideAnObjLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropGetInsideAnObjLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitWithQuotedKeyThatDoesNotGetRead() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitWithQuotedKeyThatDoesNotGetRead();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitWithQuotedKeyThatGetsRead() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitWithQuotedKeyThatGetsRead();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithQuotedPropertyThatDoesNotGetRead() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionWithQuotedPropertyThatDoesNotGetRead();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithQuotedPropertyThatGetsRead() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionWithQuotedPropertyThatGetsRead();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignedToMultipleNames1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignedToMultipleNames1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignedToMultipleNames2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignedToMultipleNames2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitRedefinedInGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitRedefinedInGlobalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitRedefinedInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitRedefinedInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignedInTernaryExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignedInTernaryExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitAssignedInTernaryExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitAssignedInTernaryExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalVarSetToObjLitConditionally1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalVarSetToObjLitConditionally1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalVarSetToObjLitConditionally1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalVarSetToObjLitConditionally1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalVarSetToObjLitConditionally2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalVarSetToObjLitConditionally2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalVarSetToObjLitConditionally3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalVarSetToObjLitConditionally3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectPropertySetToObjLitConditionally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjectPropertySetToObjLitConditionally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPropertySetToObjLitConditionally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionPropertySetToObjLitConditionally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertySetToAnObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypePropertySetToAnObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectPropertyResetInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjectPropertyResetInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionPropertyResetInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionPropertyResetInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceResetInGlobalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNamespaceResetInGlobalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceResetInGlobalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNamespaceResetInGlobalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceResetInLocalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNamespaceResetInLocalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceResetInLocalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNamespaceResetInLocalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceDefinedInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNamespaceDefinedInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToObjectInLocalScopeDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToObjectInLocalScopeDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToObjectInLocalScopeDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToObjectInLocalScopeDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToFunctionInLocalScopeDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToFunctionInLocalScopeDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToFunctionInLocalScopeDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToFunctionInLocalScopeDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToUncollapsibleObjectInLocalScopeDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToUncollapsibleObjectInLocalScopeDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToUncollapsibleFunctionInLocalScopeDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToUncollapsibleFunctionInLocalScopeDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToUncollapsibleNamedCtorInLocalScopeDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToUncollapsibleNamedCtorInLocalScopeDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToUncollapsibleCtorInLocalScopeDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToUncollapsibleCtorInLocalScopeDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToUncollapsibleObjectInLocalScopeDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToUncollapsibleObjectInLocalScopeDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToUncollapsibleFunctionInLocalScopeDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToUncollapsibleFunctionInLocalScopeDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToUncollapsibleCtorInLocalScopeDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToUncollapsibleCtorInLocalScopeDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOfChildFuncOfUncollapsibleObjectDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOfChildFuncOfUncollapsibleObjectDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOfChildFuncOfUncollapsibleObjectDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOfChildFuncOfUncollapsibleObjectDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToChildFuncOfUncollapsibleObjectInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToChildFuncOfUncollapsibleObjectInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToChildTypeOfUncollapsibleObjectInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToChildTypeOfUncollapsibleObjectInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToChildOfUncollapsibleFunctionInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToChildOfUncollapsibleFunctionInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPropertyToChildOfUncollapsibleCtorInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAddPropertyToChildOfUncollapsibleCtorInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResetObjectPropertyInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testResetObjectPropertyInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResetFunctionPropertyInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testResetFunctionPropertyInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalNameReferencedInLocalScopeBeforeDefined1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalNameReferencedInLocalScopeBeforeDefined1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalNameReferencedInLocalScopeBeforeDefined2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalNameReferencedInLocalScopeBeforeDefined2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwiceDefinedGlobalNameDepth1_1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testTwiceDefinedGlobalNameDepth1_1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwiceDefinedGlobalNameDepth1_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testTwiceDefinedGlobalNameDepth1_2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwiceDefinedGlobalNameDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testTwiceDefinedGlobalNameDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCallDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionCallDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionCallDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionCallDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallToRedefinedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCallToRedefinedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapsePrototypeName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCollapsePrototypeName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencedPrototypeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReferencedPrototypeProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetStaticAndPrototypePropertiesOnFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testSetStaticAndPrototypePropertiesOnFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReadUndefinedPropertyDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReadUndefinedPropertyDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReadUndefinedPropertyDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReadUndefinedPropertyDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallUndefinedMethodOnObjLitDepth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCallUndefinedMethodOnObjLitDepth1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallUndefinedMethodOnObjLitDepth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCallUndefinedMethodOnObjLitDepth2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertiesOfAnUndefinedVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertiesOfAnUndefinedVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOfAnObjectThatIsNeitherFunctionNorObjLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOfAnObjectThatIsNeitherFunctionNorObjLit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunctionReferencingThis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testStaticFunctionReferencingThis1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunctionReferencingThis2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testStaticFunctionReferencingThis2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunctionReferencingThis3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testStaticFunctionReferencingThis3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticFunctionReferencingThis4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testStaticFunctionReferencingThis4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeMethodReferencingThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypeMethodReferencingThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorReferencingThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testConstructorReferencingThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSafeReferenceOfThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testSafeReferenceOfThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionReferenceOfThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalFunctionReferenceOfThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionGivenTwoNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionGivenTwoNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitWithUsedNumericKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitWithUsedNumericKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitWithUnusedNumericKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitWithUnusedNumericKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitWithNonIdentifierKeys() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitWithNonIdentifierKeys();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignments1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedAssignments1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedAssignments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignments3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedAssignments3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignments4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedAssignments4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignments5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedAssignments5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignments6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedAssignments6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignments7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedAssignments7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedVarAssignments1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedVarAssignments1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedVarAssignments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedVarAssignments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedVarAssignments3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedVarAssignments3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedVarAssignments4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedVarAssignments4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedVarAssignments5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testChainedVarAssignments5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPeerAndSubpropertyOfUncollapsibleProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPeerAndSubpropertyOfUncollapsibleProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComplexAssignmentAfterInitialAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testComplexAssignmentAfterInitialAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePrefixOfUncollapsibleProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testRenamePrefixOfUncollapsibleProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testMethodCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLitDefinedInLocalScopeIsLeftAlone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjLitDefinedInLocalScopeIsLeftAlone();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertiesOnBothSidesOfAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertiesOnBothSidesOfAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallOnUndefinedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCallOnUndefinedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPropOnUndefinedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGetPropOnUndefinedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAlias3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAlias3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAlias4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAlias4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAlias5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAlias5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAlias6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAlias6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAlias7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAlias7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalWriteToAncestor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalWriteToAncestor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalWriteToNonAncestor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalWriteToNonAncestor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalWriteToAncestor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalWriteToAncestor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalWriteToNonAncestor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalWriteToNonAncestor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonWellformedAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNonWellformedAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonWellformedAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNonWellformedAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAliasOfAncestor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAliasOfAncestor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalAliasOfAncestor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testGlobalAliasOfAncestor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAliasOfOtherName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAliasOfOtherName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalAliasOfFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testLocalAliasOfFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineGetpropIntoCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNoInlineGetpropIntoCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliasWithModifications() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testInlineAliasWithModifications();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapsePropertyOnExternType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCollapsePropertyOnExternType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseForEachWithoutExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCollapseForEachWithoutExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoCollapseForEachInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testNoCollapseForEachInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCollapsePropertyOnExternType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDoNotCollapsePropertyOnExternType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1704733() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testBug1704733();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1956277() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testBug1956277();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1974371() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testBug1974371();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumOfObjects1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testEnumOfObjects1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumOfObjects2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testEnumOfObjects3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumOfObjects4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testEnumOfObjects4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectOfObjects1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjectOfObjects1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferenceInAnonymousObject0() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReferenceInAnonymousObject0();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferenceInAnonymousObject1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReferenceInAnonymousObject1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferenceInAnonymousObject2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReferenceInAnonymousObject2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferenceInAnonymousObject3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReferenceInAnonymousObject3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferenceInAnonymousObject4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReferenceInAnonymousObject4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferenceInAnonymousObject5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testReferenceInAnonymousObject5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrashInCommaOperator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCrashInCommaOperator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrashInNestedAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testCrashInNestedAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwinReferenceCancelsChildCollapsing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testTwinReferenceCancelsChildCollapsing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropWithDollarSign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropWithDollarSign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropWithDollarSign2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropWithDollarSign2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropWithDollarSign3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropWithDollarSign3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropWithDollarSign4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropWithDollarSign4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropWithDollarSign5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropWithDollarSign5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testConstKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOnGlobalCtor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOnGlobalCtor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOnGlobalInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOnGlobalInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOnGlobalFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOnGlobalFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue389() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testIssue389();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedTopLevelName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasedTopLevelName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedTopLevelEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAliasedTopLevelEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignFunctionBeforeDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testAssignFunctionBeforeDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLitBeforeDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testObjectLitBeforeDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedef1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testTypedef1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypedef2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testTypedef2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testDelete11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreserveConstructorDoc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapsePropertiesTest() {
				public void runTest() throws Exception {
					testPreserveConstructorDoc();
				}
			};
			testcase.run();
		}
	}

}