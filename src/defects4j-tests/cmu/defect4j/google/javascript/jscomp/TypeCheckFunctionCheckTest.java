package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TypeCheckFunctionCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testWrongNumberOfArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testWrongNumberOfArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionAritySimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionAritySimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArityWithOptionalArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionArityWithOptionalArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionArityWithVarArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionArityWithVarArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarArgsLast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testVarArgsLast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOptArgsLast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testOptArgsLast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsWithJsDoc1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionsWithJsDoc1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsWithJsDoc2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionsWithJsDoc2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsWithJsDoc3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionsWithJsDoc3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsWithJsDoc4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionsWithJsDoc4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsWithJsDoc5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionsWithJsDoc5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsWithJsDoc6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionsWithJsDoc6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionsWithJsDoc7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionsWithJsDoc7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionWithDefaultCodingConvention() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testFunctionWithDefaultCodingConvention();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TypeCheckFunctionCheckTest() {
				public void runTest() throws Exception {
					testMethodCalls();
				}
			};
			testcase.run();
		}
	}

}