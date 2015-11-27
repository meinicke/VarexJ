package cmu.defect4j.google.javascript.jscomp.jsonml;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsonMLValidationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAssignExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testAssignExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBinaryExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testBinaryExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCaseValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testCaseValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCatchValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testCatchValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionalExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testConditionalExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCountExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testCountExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDataProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testDataProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeleteExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testDeleteExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoWhileStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testDoWhileStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testEmptyStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForInStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testForInStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testForStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionDeclValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testFunctionDeclValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testFunctionExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIdExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testIdExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIdPattValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testIdPattValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testIfStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvokeExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testInvokeExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJmpStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testJmpStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLabelledStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testLabelledStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testLiteralExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLogicalExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testLogicalExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testNewExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testObjectExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParamDeclValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testParamDeclValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegExpExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testRegExpExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testReturnStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testSwitchStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThisExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testThisExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testThrowStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testTryStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryExprValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testUnaryExprValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarDeclValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testVarDeclValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhileStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testWhileStmtValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStmtValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLValidationTest() {
				public void runTest() throws Exception {
					testWithStmtValidation();
				}
			};
			testcase.run();
		}
	}

}