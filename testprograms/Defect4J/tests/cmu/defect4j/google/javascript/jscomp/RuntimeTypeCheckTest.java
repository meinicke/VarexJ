package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RuntimeTypeCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testUnion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testFunctionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testConstValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValueWithInnerFn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testValueWithInnerFn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testNullValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testValues();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipParamOK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testSkipParamOK();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUntypedParam() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testUntypedParam();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNativeClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testNativeClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testQualifiedClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerClasses() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerClasses();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplementedInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testImplementedInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtendedInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testExtendedInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplementedInterfaceOrdering() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testImplementedInterfaceOrdering();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplementedInterfaceOrderingGoogInherits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testImplementedInterfaceOrderingGoogInherits();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testInnerConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnNothing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testReturnNothing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RuntimeTypeCheckTest() {
				public void runTest() throws Exception {
					testInterface();
				}
			};
			testcase.run();
		}
	}

}