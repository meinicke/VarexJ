package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeCollectPropertyAssignmentsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testNegativeArrayIndex1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testNegativeArrayIndex1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEarlyUsage1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testEarlyUsage1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegativeArrayIndex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testNegativeArrayIndex2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFractionalArrayIndex1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testFractionalArrayIndex1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFractionalArrayIndex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testFractionalArrayIndex2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOptimizationOfPartiallyBuiltArray1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOptimizationOfPartiallyBuiltArray1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOptimization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOptimization2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOptimization3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOptimization3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOptimizationOfPartiallyBuiltArray2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOptimizationOfPartiallyBuiltArray2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOptimizationWithAHole1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOptimizationWithAHole1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOptimizationWithAHole2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOptimizationWithAHole2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEarlyUsage2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testEarlyUsage2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayTooSparseOptimization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayTooSparseOptimization1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayTooSparseOptimization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayTooSparseOptimization2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOutOfOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOutOfOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleNames1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testMultipleNames1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleNames2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testMultipleNames2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayReassignedInValue1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayReassignedInValue1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayReassignedInValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayReassignedInValue2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayReassignedInSubsequentVar1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayReassignedInSubsequentVar1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayReassignedInSubsequentVar2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayReassignedInSubsequentVar2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardReference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testForwardReference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForwardReference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testForwardReference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectOptimization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectOptimization1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectOptimization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectOptimization2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectReassignedInValue1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectReassignedInValue1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectReassignedInValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectReassignedInValue2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectFunctionRollup1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectFunctionRollup1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectFunctionRollup2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectFunctionRollup2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectFunctionRollup3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectFunctionRollup3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectFunctionRollup4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectFunctionRollup4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectFunctionRollup5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testObjectFunctionRollup5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompoundAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testCompoundAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayOptimization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignmentsTest() {
				public void runTest() throws Exception {
					testArrayOptimization1();
				}
			};
			testcase.run();
		}
	}

}