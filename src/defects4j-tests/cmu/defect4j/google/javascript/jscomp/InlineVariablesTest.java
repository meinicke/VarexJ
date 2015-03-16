package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class InlineVariablesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInlineGlobal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineGlobal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineExportedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineExportedName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineExportedName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineExportedName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineDecrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineDecrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIntoRhsOfAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineIntoRhsOfAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineInFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineInFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineInFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineInFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineInFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineInFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineInFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineInFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineInFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineInFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAcrossModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAcrossModules();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotExitConditional1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotExitConditional1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotExitConditional2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotExitConditional2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotExitConditional3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotExitConditional3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotExitForLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotExitForLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotEnterSubscope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotEnterSubscope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotExitTry() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotExitTry();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotEnterCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotEnterCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotEnterFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotEnterFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideIfConditional() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideIfConditional();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyReadAtInitialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testOnlyReadAtInitialization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImmutableWithSingleReferenceAfterInitialzation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testImmutableWithSingleReferenceAfterInitialzation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleReferenceAfterInitialzation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testSingleReferenceAfterInitialzation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideIfBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideIfBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideAndConditional() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideAndConditional();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideAndBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideAndBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideOrBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideOrBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideHookBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideHookBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideHookConditional() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideHookConditional();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideOrBranchInsideIfConditional() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideOrBranchInsideIfConditional();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInsideOrBranchInsideIfConditionalWithConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInsideOrBranchInsideIfConditionalWithConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCrossFunctionsAsLeftLeaves() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testCrossFunctionsAsLeftLeaves();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoCrossFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoCrossFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCrossReferencingFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotCrossReferencingFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testChainedAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testChainedAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoCrossNewVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoCrossNewVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCrossFunctionCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotCrossFunctionCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCrossAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotCrossAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCrossDelete() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotCrossDelete();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCrossAssignmentPlus() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotCrossAssignmentPlus();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCrossIncrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotCrossIncrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotCrossConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotCrossConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoCrossVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoCrossVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlappingInlines() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testOverlappingInlines();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlappingInlineFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testOverlappingInlineFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIntoLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineIntoLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIntoFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineIntoFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIntoNamedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineIntoNamedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIntoNestedNonHoistedNamedFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineIntoNestedNonHoistedNamedFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineIntoNestedNamedFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineIntoNestedNamedFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineMutatedVariable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineMutatedVariable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineImmutableMultipleTimes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineImmutableMultipleTimes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineStringMultipleTimesIfNotWorthwhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineStringMultipleTimesIfNotWorthwhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineStringMultipleTimesWhenAliasingAllStrings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineStringMultipleTimesWhenAliasingAllStrings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineBackwards() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineBackwards();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineOutOfBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineOutOfBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterferingInlines() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInterferingInlines();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineIntoTryCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineIntoTryCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineConstants();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineStringWhenWorthwhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineStringWhenWorthwhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstantAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineConstantAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstantAliasWithAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineConstantAliasWithAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConstantAliasWithNonConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineConstantAliasWithNonConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCascadingInlines() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testCascadingInlines();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineFunctionDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2388531() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					test2388531();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testRecursiveFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnreferencedBleedingFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testUnreferencedBleedingFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencedBleedingFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testReferencedBleedingFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases1c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases1c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases1d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases1d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases2c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases2c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliases2d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliases2d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineAliasesInLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineAliasesInLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliasesInLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliasesInLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases3b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases3b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases4b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases4b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases5b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases5b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases6b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases6b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases7b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases7b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases8b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineAliases8b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSideEffectOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testSideEffectOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineParameterAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineParameterAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineParameterAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineParameterAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionAlias1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineFunctionAlias1a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionAlias1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineFunctionAlias1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionAlias2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineFunctionAlias2a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineFunctionAlias2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineFunctionAlias2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineCatchAlias1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineCatchAlias1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineCatchAlias2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineCatchAlias2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalsOnly1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testLocalsOnly1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalsOnly2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testLocalsOnly2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineUndefined1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineUndefined1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineUndefined2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineUndefined2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineUndefined3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineUndefined3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineUndefined4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineUndefined4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineUndefined5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineUndefined5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue90() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue90();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testThisAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisEscapedAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testThisEscapedAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineNamedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testInlineNamedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378ModifiedArguments1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378ModifiedArguments1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378ModifiedArguments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378ModifiedArguments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378EscapedArguments1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378EscapedArguments1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378EscapedArguments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378EscapedArguments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378EscapedArguments3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378EscapedArguments3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378EscapedArguments4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378EscapedArguments4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378ArgumentsRead1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378ArgumentsRead1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue378ArgumentsRead2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testIssue378ArgumentsRead2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsModifiedInOuterFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testArgumentsModifiedInOuterFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsModifiedInInnerFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testArgumentsModifiedInInnerFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineRedeclaredExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineRedeclaredExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug6598844() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testBug6598844();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineIncrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineIncrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotInlineIntoLhsOfAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotInlineIntoLhsOfAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotExitLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testDoNotExitLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePropertyFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testRenamePropertyFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineGetpropIntoCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesTest() {
				public void runTest() throws Exception {
					testNoInlineGetpropIntoCall();
				}
			};
			testcase.run();
		}
	}

}