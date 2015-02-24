package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CrossModuleMethodMotionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTwoMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testTwoMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMovePrototypeMethod1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMovePrototypeMethod1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMovePrototypeMethod2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMovePrototypeMethod2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMovePrototypeMethod3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMovePrototypeMethod3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMovePrototypeRecursiveMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMovePrototypeRecursiveMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCantMovePrototypeProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testCantMovePrototypeProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveMethodsInRightOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMoveMethodsInRightOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveMethodsInRightOrder2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMoveMethodsInRightOrder2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveMethodsUsedInTwoModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMoveMethodsUsedInTwoModules();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveMethodsUsedInTwoModules2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testMoveMethodsUsedInTwoModules2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoMethods2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testTwoMethods2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalFunctionsInGraph() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testGlobalFunctionsInGraph();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureVariableReads1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testClosureVariableReads1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureVariableReads2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testClosureVariableReads2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClosureVariableReads3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testClosureVariableReads3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoClosureVariableReads1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testNoClosureVariableReads1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoClosureVariableReads2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testNoClosureVariableReads2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctionClosureVariableReads() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testInnerFunctionClosureVariableReads();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue600() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testIssue600();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue600b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testIssue600b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue600c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testIssue600c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue600d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testIssue600d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue600e() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testIssue600e();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeOfThisAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleMethodMotionTest() {
				public void runTest() throws Exception {
					testPrototypeOfThisAssign();
				}
			};
			testcase.run();
		}
	}

}