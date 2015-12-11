package cmu.defect4j.google.debugging.sourcemap;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SourceMapGeneratorV1Test extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBasicMapping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testBasicMapping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralMappings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testLiteralMappings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultilineMapping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testMultilineMapping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiFunctionMapping() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testMultiFunctionMapping();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput0() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testGoldenOutput0();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionNameOutput1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testFunctionNameOutput1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionNameOutput2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testFunctionNameOutput2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionNameOutput3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testFunctionNameOutput3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionNameOutput4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testFunctionNameOutput4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testGoldenOutput1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testGoldenOutput2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testGoldenOutput3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testGoldenOutput4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testGoldenOutput5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicDeterminism() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV1Test() {
				public void runTest() throws Exception {
					testBasicDeterminism();
				}
			};
			testcase.run();
		}
	}

}