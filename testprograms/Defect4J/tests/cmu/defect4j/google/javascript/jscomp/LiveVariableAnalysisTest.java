package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class LiveVariableAnalysisTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEscaped() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testEscaped();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignAndReadInCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testAssignAndReadInCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testInnerFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStraightLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testStraightLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testConditions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testArrays();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testTwoPaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThreePaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testThreePaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHooks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testHooks();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testForLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testNestedLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitches() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testSwitches();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParam() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testParam();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExpressionInForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testExpressionInForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testArgumentsArray();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryCatchFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testTryCatchFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForInAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testForInAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExceptionThrowingAssignments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testExceptionThrowingAssignments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEscapedLiveness() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testEscapedLiveness();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1449316() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.LiveVariableAnalysisTest() {
				public void runTest() throws Exception {
					testBug1449316();
				}
			};
			testcase.run();
		}
	}

}