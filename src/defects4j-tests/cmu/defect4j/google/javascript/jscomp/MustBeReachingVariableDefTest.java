package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MustBeReachingVariableDefTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentOp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testAssignmentOp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergeDefinitions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testMergeDefinitions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncAndDec() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testIncAndDec();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionParams1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testFunctionParams1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionParams2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testFunctionParams2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsObjectModifications() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testArgumentsObjectModifications();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsObjectEscaped() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testArgumentsObjectEscaped();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentsObjectEscapedDependents() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testArgumentsObjectEscapedDependents();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExpressionVariableReassignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testExpressionVariableReassignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergesWithOneDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testMergesWithOneDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRedefinitionUsingItself() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testRedefinitionUsingItself();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleDefinitionsWithDependence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testMultipleDefinitionsWithDependence();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testIf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditional() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testConditional();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseAndDefInSameInstruction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testUseAndDefInSameInstruction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentInExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testAssignmentInExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStraightLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MustBeReachingVariableDefTest() {
				public void runTest() throws Exception {
					testStraightLine();
				}
			};
			testcase.run();
		}
	}

}