package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NodeUtilTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIsFunctionExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsFunctionExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsFunctionExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsFunctionExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveChildBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveChildBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTryChild1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveTryChild1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTryChild2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveTryChild2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTryChild3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveTryChild3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTryChild4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveTryChild4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTryChild5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveTryChild5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveVarChild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveVarChild();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLabelChild1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveLabelChild1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveLabelChild2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveLabelChild2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveForChild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRemoveForChild();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergeBlock1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testMergeBlock1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergeBlock2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testMergeBlock2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergeBlock3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testMergeBlock3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSourceName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetSourceName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalValue1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testLocalValue1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testLocalValue2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testCallSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidDefine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testValidDefine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetNumberValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetNumberValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsNumbericResult() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsNumbericResult();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBooleanResult() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsBooleanResult();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMayBeString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testMayBeString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValidNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testValidNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetNearestFunctionName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetNearestFunctionName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetBestLValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetBestLValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsNaN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsNaN();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsExecutedExactlyOnce() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsExecutedExactlyOnce();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetBooleanValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetBooleanValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLiteralOrConstValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsLiteralOrConstValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetExpressionBooleanValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetExpressionBooleanValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStringValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetStringValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetArrayStringValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetArrayStringValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsObjectLiteralKey1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsObjectLiteralKey1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFunctionName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetFunctionName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFunctionName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetFunctionName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFunctionName3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetFunctionName3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFunctionName4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetFunctionName4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFunctionName5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetFunctionName5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContainsFunctionDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testContainsFunctionDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMayHaveSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testMayHaveSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectMethodSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testObjectMethodSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegExpSideEffect() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testRegExpSideEffect();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMayEffectMutableState() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testMayEffectMutableState();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsFunctionExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsFunctionExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContainsType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testContainsType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencesThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testReferencesThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetNodeTypeReferenceCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetNodeTypeReferenceCount();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsNameReferenceCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsNameReferenceCount();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetNameReferenceCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetNameReferenceCount();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetVarsDeclaredInBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testGetVarsDeclaredInBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsControlStructureCodeBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NodeUtilTest() {
				public void runTest() throws Exception {
					testIsControlStructureCodeBlock();
				}
			};
			testcase.run();
		}
	}

}