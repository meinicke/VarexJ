package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class VariableReferenceCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUnreferencedBleedingFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testUnreferencedBleedingFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencedBleedingFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testReferencedBleedingFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testCorrectCode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectShadowing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testCorrectShadowing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectRedeclare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testCorrectRedeclare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectRecursion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testCorrectRecursion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testCorrectCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRedeclare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testRedeclare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEarlyReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testEarlyReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrectEarlyReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testCorrectEarlyReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoubleDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testDoubleDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoubleDeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testDoubleDeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHoistedFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testHoistedFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHoistedFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testHoistedFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedFunction4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedFunction5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedFunction5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedFunction6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedFunction6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedFunction7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedFunction7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedRecursiveFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedRecursiveFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedRecursiveFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedRecursiveFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonHoistedRecursiveFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNonHoistedRecursiveFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarnInExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNoWarnInExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoWarnInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.VariableReferenceCheckTest() {
				public void runTest() throws Exception {
					testNoWarnInExterns2();
				}
			};
			testcase.run();
		}
	}

}