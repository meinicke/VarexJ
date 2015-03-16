package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckUnreachableCodeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCorrectSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testCorrectSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testIncorrectSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectIfReturns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testCorrectIfReturns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInCorrectIfReturns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testInCorrectIfReturns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectSwitchReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testCorrectSwitchReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInCorrectSwitchReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testInCorrectSwitchReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectLoopBreaksAndContinues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testCorrectLoopBreaksAndContinues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInCorrectLoopBreaksAndContinues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testInCorrectLoopBreaksAndContinues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUncheckedWhileInDo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testUncheckedWhileInDo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUncheckedConditionInFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testUncheckedConditionInFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testFunctionDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testVarDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReachableTryCatchFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testReachableTryCatchFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnreachableCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testUnreachableCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpuriousBreak() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testSpuriousBreak();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOfThrowsException() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testInstanceOfThrowsException();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFalseCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testFalseCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnreachableLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testUnreachableLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInfiniteLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testInfiniteLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuppression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckUnreachableCodeTest() {
				public void runTest() throws Exception {
					testSuppression();
				}
			};
			testcase.run();
		}
	}

}