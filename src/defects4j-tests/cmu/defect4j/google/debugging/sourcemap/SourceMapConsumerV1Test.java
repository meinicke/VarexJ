package cmu.defect4j.google.debugging.sourcemap;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SourceMapConsumerV1Test extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetMappingForLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testGetMappingForLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLineEdges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testLineEdges();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testColumnEdges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testColumnEdges();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegativeOneInLineMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testNegativeOneInLineMap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleParse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testSimpleParse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBlankLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testBlankLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCountFailure() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testCountFailure();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidCountFailure() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testInvalidCountFailure();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidJSONFailure() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testInvalidJSONFailure();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidHeaderFailure() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testInvalidHeaderFailure();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidPostHeaderToken() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testInvalidPostHeaderToken();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidMappingArrayFailure() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testInvalidMappingArrayFailure();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleLineFragments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testMultipleLineFragments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleMappingFragments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapConsumerV1Test() {
				public void runTest() throws Exception {
					testMultipleMappingFragments();
				}
			};
			testcase.run();
		}
	}

}