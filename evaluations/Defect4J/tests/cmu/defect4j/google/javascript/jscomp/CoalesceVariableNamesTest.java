package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CoalesceVariableNamesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergeThreeVarNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testMergeThreeVarNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDifferentBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testDifferentBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testLoops();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEscaped() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testEscaped();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoopInductionVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testLoopInductionVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchCase() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testSwitchCase();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicatedVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testDuplicatedVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testTryCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeadAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testDeadAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testParameter2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testParameter3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameter4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testParameter4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameter4b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testParameter4b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiveRangeChangeWithinCfgNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testLiveRangeChangeWithinCfgNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiveRangeChangeWithinCfgNode2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testLiveRangeChangeWithinCfgNode2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionNameReuse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testFunctionNameReuse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1401831() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testBug1401831();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeterministic() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testDeterministic();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarLiveRangeCross() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testVarLiveRangeCross();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1445366() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testBug1445366();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCannotReuseAnyParamsBug() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testCannotReuseAnyParamsBug();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForInWithAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testForInWithAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUsePseduoNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testUsePseduoNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaxVars() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CoalesceVariableNamesTest() {
				public void runTest() throws Exception {
					testMaxVars();
				}
			};
			testcase.run();
		}
	}

}