package cmu.defect4j.google.javascript.jscomp.jsonml;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsonMLConversionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testObject0() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testObject0();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testArray();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArray1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testArray1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignOperators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testAssignOperators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testConditionals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDecIncOperators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testDecIncOperators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testDelete();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDirectives() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testDirectives();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testDoWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfElse1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testIfElse1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLabels() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testLabels();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLogicalExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testLogicalExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMathExpr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testMathExpr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMember() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testMember();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNew() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testNew();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOperators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testOperators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testReturnStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimplePrograms() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testSimplePrograms();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testSwitch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTry() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testTry();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeof() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testTypeof();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testUnaryExpressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testVarDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testWith();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegExp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testRegExp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testThrow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.jsonml.JsonMLConversionTest() {
				public void runTest() throws Exception {
					testWhile();
				}
			};
			testcase.run();
		}
	}

}