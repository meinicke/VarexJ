package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FlowSensitiveInlineVariablesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testSwitchCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testSimpleVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testSimpleForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testExported();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testSimpleAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineIncrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineIncrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineAssignmentOp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineAssignmentOp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineIntoLhsOfAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineIntoLhsOfAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiUse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testMultiUse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiUseInSameCfgNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testMultiUseInSameCfgNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotExitLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotExitLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiUseInTwoDifferentPath() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testMultiUseInTwoDifferentPath();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentBeforeDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testAssignmentBeforeDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarInConditionPath() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testVarInConditionPath();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiDefinitionsBeforeUse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testMultiDefinitionsBeforeUse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiDefinitionsInSameCfgNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testMultiDefinitionsInSameCfgNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotReachingDefinitions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNotReachingDefinitions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineLoopCarriedDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineLoopCarriedDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineWithinLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineWithinLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineCatchExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineCatchExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineCatchExpression1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineCatchExpression1a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineCatchExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineCatchExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineCatchExpression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineCatchExpression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineCatchExpression4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineCatchExpression4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefinitionAfterUse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDefinitionAfterUse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineSameVariableInStraightLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineSameVariableInStraightLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineInDifferentPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineInDifferentPaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineInMergedPath() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineInMergedPath();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIntoExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineIntoExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpression7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpression7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpression8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpression8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpression9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpression9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpression10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpression10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineExpressions13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineExpressions13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIfDefinitionMayNotReach() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineIfDefinitionMayNotReach();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineEscapedToInnerFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineEscapedToInnerFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineLValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineLValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadowedVariableInnerFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testShadowedVariableInnerFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineGetProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineGetProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineGetProp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineGetProp2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineGetProp3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineGetProp3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineGetEle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineGetEle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineConstructors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineConstructors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineArrayLits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineArrayLits();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineObjectLits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineObjectLits();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineRegExpLits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineRegExpLits();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstructorCallsIntoLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineConstructorCallsIntoLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveWithLabels() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testRemoveWithLabels();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAcrossSideEffect1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAcrossSideEffect1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAcrossSideEffect2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAcrossSideEffect2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAcrossSideEffect3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAcrossSideEffect3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAcrossSideEffect4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAcrossSideEffect4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanInlineAcrossNoSideEffect() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testCanInlineAcrossNoSideEffect();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDependOnOuterScopeVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testDependOnOuterScopeVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIfNameIsLeftSideOfAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineIfNameIsLeftSideOfAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidInlineArguments1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInvalidInlineArguments1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidInlineArguments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testInvalidInlineArguments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotOkToSkipCheckPathBetweenNodes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testNotOkToSkipCheckPathBetweenNodes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue698() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue698();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue777() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue777();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTransitiveDependencies1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testTransitiveDependencies1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTransitiveDependencies2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testTransitiveDependencies2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue794a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue794a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue794b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FlowSensitiveInlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue794b();
				}
			};
			testcase.run();
		}
	}

}