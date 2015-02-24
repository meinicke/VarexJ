package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeIntegrationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTrueFalse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testTrueFalse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldOneChildBlocksIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldOneChildBlocksIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldOneChildBlocksStringCompare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldOneChildBlocksStringCompare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNecessaryDanglingElse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testNecessaryDanglingElse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldReturnsIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldReturnsIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookIfIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testHookIfIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDuplicateStatementsIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testRemoveDuplicateStatementsIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLogicalOpIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldLogicalOpIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBitwiseOpStringCompareIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldBitwiseOpStringCompareIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarLiftingIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testVarLiftingIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1438784() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testBug1438784();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldUselessWhileIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldUselessWhileIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldUselessForIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldUselessForIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldUselessDoIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldUselessDoIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeWhileConstantConditionIntegration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testMinimizeWhileConstantConditionIntegration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testMinimizeExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1509085() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testBug1509085();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBugIssue3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testBugIssue3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBugIssue43() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testBugIssue43();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldNegativeBug() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldNegativeBug();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoNormalizeLabeledExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testNoNormalizeLabeledExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinimizeExprCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testMinimizeExprCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTrueFalseFolding() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testTrueFalseFolding();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommaSplitingConstantCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testCommaSplitingConstantCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAvoidCommaSplitting() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testAvoidCommaSplitting();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldIfs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldIfs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldIfs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldIfs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldHook2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testFoldHook2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1059649() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testBug1059649();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testShortCircuit1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testShortCircuit2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testShortCircuit3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortCircuit4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeIntegrationTest() {
				public void runTest() throws Exception {
					testShortCircuit4();
				}
			};
			testcase.run();
		}
	}

}