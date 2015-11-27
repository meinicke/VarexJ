package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FunctionToBlockMutatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMutateNoReturnWithoutResultAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateNoReturnWithoutResultAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateNoReturnWithResultAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateNoReturnWithResultAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateNoValueReturnWithoutResultAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateNoValueReturnWithoutResultAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateWithMultipleReturns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateWithMultipleReturns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateNoValueReturnWithResultAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateNoValueReturnWithResultAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateValueReturnWithoutResultAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateValueReturnWithoutResultAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateValueReturnWithResultAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateValueReturnWithResultAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateWithParameters1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateWithParameters1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateWithParameters2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateWithParameters2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateWithParameters3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateWithParameters3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutate8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutate8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateInitializeUninitializedVars1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateInitializeUninitializedVars1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateInitializeUninitializedVars2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateInitializeUninitializedVars2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateCallInLoopVars1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateCallInLoopVars1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutateFunctionDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionToBlockMutatorTest() {
				public void runTest() throws Exception {
					testMutateFunctionDefinition();
				}
			};
			testcase.run();
		}
	}

}