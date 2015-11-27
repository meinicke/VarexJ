package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeSubstituteAlternateSyntaxTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMinimizeExprCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testMinimizeExprCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testArrayLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldOneChildBlocks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldOneChildBlocks();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldReturns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldReturns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCombineIfs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testCombineIfs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCombineIfs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testCombineIfs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCombineIfs3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testCombineIfs3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldAssignments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldAssignments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDuplicateStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveDuplicateStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotCond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testNotCond();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAndParenthesesCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testAndParenthesesCount();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLogicalOpStringCompare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldLogicalOpStringCompare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldNot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldNot();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldRegExpConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldRegExpConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVersionSpecificRegExpQuirks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testVersionSpecificRegExpQuirks();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldRegExpConstructorStringCompare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldRegExpConstructorStringCompare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContainsUnicodeEscape() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testContainsUnicodeEscape();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLiteralObjectConstructors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldLiteralObjectConstructors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLiteralArrayConstructors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldLiteralArrayConstructors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeWhileCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testMinimizeWhileCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeForCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testMinimizeForCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeCondition_example1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testMinimizeCondition_example1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLoopBreakLate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldLoopBreakLate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLoopBreakEarly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldLoopBreakEarly();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldConditionalVarDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldConditionalVarDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldReturnResult() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldReturnResult();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldStandardConstructors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldStandardConstructors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubsituteReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testSubsituteReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubsituteBreakForThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testSubsituteBreakForThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDuplicateReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveDuplicateReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDuplicateThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveDuplicateThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedIfCombine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testNestedIfCombine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldTrueFalse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testFoldTrueFalse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue291() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testIssue291();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testUndefined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSplitCommaExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testSplitCommaExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComma1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testComma1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComma2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testComma2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComma3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testComma3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComma4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testComma4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComma5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testComma5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringArraySplitting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testStringArraySplitting();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveElseCause() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveElseCause();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveElseCause1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveElseCause1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveElseCause2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveElseCause2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveElseCause3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveElseCause3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveElseCause4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testRemoveElseCause4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBindToCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testBindToCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBindToCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testBindToCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBindToCall3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testBindToCall3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleFunctionCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest() {
				public void runTest() throws Exception {
					testSimpleFunctionCall();
				}
			};
			testcase.run();
		}
	}

}