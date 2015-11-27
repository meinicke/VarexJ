package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DeadAssignmentsEliminationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testMultiPaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedAsConditionsInSwitchStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testUsedAsConditionsInSwitchStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentSamples() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentSamples();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentInArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentInArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testParameters();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsedAsConditions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testUsedAsConditions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentInReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentInReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignAndReadInCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignAndReadInCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testErrorHandling() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testErrorHandling();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeadVarDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testDeadVarDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testGlobal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testInnerFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testInnerFunctions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSelfReAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testSelfReAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSelfIncrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testSelfIncrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentOp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentOp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentOpUsedAsLhs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentOpUsedAsLhs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentOpUsedAsCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentOpUsedAsCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeadIncrement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testDeadIncrement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeadButAlivePartiallyWithinTheExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testDeadButAlivePartiallyWithinTheExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutipleDeadAssignmentsButAlivePartiallyWithinTheExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testMutipleDeadAssignmentsButAlivePartiallyWithinTheExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeadPartiallyWithinTheExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testDeadPartiallyWithinTheExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentOpChain() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignmentOpChain();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncDecInSubExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIncDecInSubExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedReassignments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testNestedReassignments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncrementalReassignmentInForLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIncrementalReassignmentInForLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIdentityAssignments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIdentityAssignments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug8730257() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testBug8730257();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignToExtern() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testAssignToExtern();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297e() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297e();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297f() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297f();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297g() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297g();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue297h() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue297h();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testInExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testInExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue384a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue384a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue384b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue384b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue384c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue384c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue384d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DeadAssignmentsEliminationTest() {
				public void runTest() throws Exception {
					testIssue384d();
				}
			};
			testcase.run();
		}
	}

}