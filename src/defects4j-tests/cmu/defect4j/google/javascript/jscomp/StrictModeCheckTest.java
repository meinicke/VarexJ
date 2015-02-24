package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class StrictModeCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEval2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEval3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEval4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEval5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEval6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEval7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEval8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEval8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownVariable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testUnknownVariable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownVariable2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testUnknownVariable2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownVariable3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testUnknownVariable3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArguments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testArguments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArguments3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testArguments3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArguments4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testArguments4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArguments5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testArguments5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEvalAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEvalAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEvalAssignment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testEvalAssignment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignToArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testAssignToArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeleteVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testDeleteVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeleteFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testDeleteFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeleteArgument() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testDeleteArgument();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeleteProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testDeleteProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalName10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testIllegalName10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateObjectLiteralKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testDuplicateObjectLiteralKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionDecl() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testFunctionDecl();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionDecl2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testFunctionDecl2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.StrictModeCheckTest() {
				public void runTest() throws Exception {
					testArguments();
				}
			};
			testcase.run();
		}
	}

}