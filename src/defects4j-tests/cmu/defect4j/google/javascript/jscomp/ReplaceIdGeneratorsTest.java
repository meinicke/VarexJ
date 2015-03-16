package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ReplaceIdGeneratorsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testSerialization1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testSerialization2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReusePreviousSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testReusePreviousSerialization1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReusePreviousSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testReusePreviousSerialization2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReusePreviousSerializationConsistent1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testReusePreviousSerializationConsistent1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleConsistent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testSimpleConsistent();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testSimpleStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoGenerators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testTwoGenerators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackwardCompat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testBackwardCompat();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedGenerators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testMixedGenerators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testLocalCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConditionalCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testConditionalCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConflictingIdGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testConflictingIdGenerator();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceIdGeneratorsTest() {
				public void runTest() throws Exception {
					testObjLit();
				}
			};
			testcase.run();
		}
	}

}