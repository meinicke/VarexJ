package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class OptimizeArgumentsArrayTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMissingVarArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testMissingVarArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoVarArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testNoVarArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArgumentRefOnNamedParameter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testArgumentRefOnNamedParameter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoVarArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testTwoVarArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoFourArgsTwoUsed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testTwoFourArgsTwoUsed();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneRequired() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testOneRequired();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoRequiredSixthVarArgReferenced() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testTwoRequiredSixthVarArgReferenced();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoRequiredOneOptionalFifthVarArgReferenced() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testTwoRequiredOneOptionalFifthVarArgReferenced();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoRequiredTwoOptionalSixthVarArgReferenced() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testTwoRequiredTwoOptionalSixthVarArgReferenced();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctionsWithNamedArgumentInInnerFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testInnerFunctionsWithNamedArgumentInInnerFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctionsWithNamedArgumentInOutterFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testInnerFunctionsWithNamedArgumentInOutterFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctionsWithNamedArgumentInInnerAndOutterFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testInnerFunctionsWithNamedArgumentInInnerAndOutterFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctionsAfterArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testInnerFunctionsAfterArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoOptimizationWhenGetProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testNoOptimizationWhenGetProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoOptimizationWhenIndexIsNotNumberConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testNoOptimizationWhenIndexIsNotNumberConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoOptimizationWhenArgumentIsUsedAsFunctionCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testNoOptimizationWhenArgumentIsUsedAsFunctionCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.OptimizeArgumentsArrayTest() {
				public void runTest() throws Exception {
					testInnerFunctions();
				}
			};
			testcase.run();
		}
	}

}