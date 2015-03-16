package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class InstrumentFunctionsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEmpty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testEmpty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstrument() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testInstrument();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAppNameSetter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testAppNameSetter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testInit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testDeclare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNested() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testNested();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExitPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testExitPaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExitNoReturn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testExitNoReturn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPartialExitPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testPartialExitPaths();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExitTry() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testExitTry();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedExit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testNestedExit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProtobuffParseFail() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testProtobuffParseFail();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInitJsParseFail() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InstrumentFunctionsTest() {
				public void runTest() throws Exception {
					testInitJsParseFail();
				}
			};
			testcase.run();
		}
	}

}