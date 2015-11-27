package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class UnreachableCodeEliminationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSwitchCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testSwitchCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUnreachableCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testRemoveUnreachableCode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveUseStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testNoRemoveUseStrict();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoRemoveUselessNameStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testNoRemoveUselessNameStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testRemoveDo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUselessStrings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testRemoveUselessStrings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUselessNameStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testRemoveUselessNameStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveUselessLiteralValueStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testRemoveUselessLiteralValueStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionalDeadCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testConditionalDeadCode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalRequiresRedeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testRemovalRequiresRedeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignPropertyOnCreatedObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testAssignPropertyOnCreatedObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUselessUnconditionalReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testUselessUnconditionalReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnlessUnconditionalContinue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testUnlessUnconditionalContinue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnlessUnconditonalBreak() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testUnlessUnconditonalBreak();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCascadedRemovalOfUnlessUnconditonalJumps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testCascadedRemovalOfUnlessUnconditonalJumps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue311() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue311();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue4177428a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue4177428a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue4177428b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue4177428b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue4177428c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue4177428c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue4177428_continue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue4177428_continue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue4177428_return() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue4177428_return();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue4177428_multifinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue4177428_multifinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue5215541_deadVarDeclar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testIssue5215541_deadVarDeclar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForInLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testForInLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryCatchFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.UnreachableCodeEliminationTest() {
				public void runTest() throws Exception {
					testTryCatchFinally();
				}
			};
			testcase.run();
		}
	}

}