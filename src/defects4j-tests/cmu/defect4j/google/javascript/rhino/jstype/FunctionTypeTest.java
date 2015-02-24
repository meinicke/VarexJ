package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FunctionTypeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRecursiveFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testRecursiveFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testPrint();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupAndInfOfReturnTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSupAndInfOfReturnTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefaultReturnType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testDefaultReturnType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupAndInfOfReturnTypesWithDifferentParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSupAndInfOfReturnTypesWithDifferentParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupAndInfWithDifferentParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSupAndInfWithDifferentParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupAndInfWithDifferentThisTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSupAndInfWithDifferentThisTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupAndInfWithDifferentThisTypes2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSupAndInfWithDifferentThisTypes2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupAndInfOfReturnTypesWithNumOfParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSupAndInfOfReturnTypesWithNumOfParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypeWithInterfaceThisType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSubtypeWithInterfaceThisType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrdinaryFunctionPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testOrdinaryFunctionPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCtorWithPrototypeSet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testCtorWithPrototypeSet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEmptyFunctionTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testEmptyFunctionTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfacePrototypeChain1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testInterfacePrototypeChain1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterfacePrototypeChain2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testInterfacePrototypeChain2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEquivalentTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testIsEquivalentTo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEquivalentToParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testIsEquivalentToParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEquivalentOptAndVarArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testIsEquivalentOptAndVarArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBindSignature() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testBindSignature();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallSignature1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testCallSignature1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallSignature2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testCallSignature2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTemplatedFunctionDerivedFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testTemplatedFunctionDerivedFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetImplementsOnInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionTypeTest() {
				public void runTest() throws Exception {
					testSetImplementsOnInterface();
				}
			};
			testcase.run();
		}
	}

}