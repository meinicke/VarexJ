package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CrossModuleCodeMotionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunctionMovement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement5b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement5b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionMovement8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionMovement8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionNonMovement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionNonMovement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionNonMovement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testFunctionNonMovement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassMovement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClassMovement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassMovement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClassMovement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassMovement3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClassMovement3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassMovement4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClassMovement4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassMovement5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClassMovement5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassMovement6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClassMovement6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClassMovement7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClassMovement7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubMethodMovement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testStubMethodMovement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStubMethodMovement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testStubMethodMovement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoMoveSideEffectProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testNoMoveSideEffectProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignMovement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testAssignMovement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoClassMovement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testNoClassMovement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralMovement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testLiteralMovement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralMovement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testLiteralMovement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralMovement3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testLiteralMovement3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralMovement4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testLiteralMovement4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarMovement9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testVarMovement9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClone1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClone1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClone2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testClone2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug4118005() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testBug4118005();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyModule() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CrossModuleCodeMotionTest() {
				public void runTest() throws Exception {
					testEmptyModule();
				}
			};
			testcase.run();
		}
	}

}