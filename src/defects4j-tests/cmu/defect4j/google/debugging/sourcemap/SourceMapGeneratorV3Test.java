package cmu.defect4j.google.debugging.sourcemap;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SourceMapGeneratorV3Test extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMultilineMapping2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testMultilineMapping2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput0a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testGoldenOutput0a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWriteMetaMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testWriteMetaMap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicMapping1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testBasicMapping1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicMapping2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testBasicMapping2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWriteMetaMap2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testWriteMetaMap2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseSourceMetaMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testParseSourceMetaMap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSourceMapMerging() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testSourceMapMerging();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralMappings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testGoldenOutput0();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoldenOutput1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
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
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testBasicDeterminism();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicMappingGoldenOutput() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testBasicMappingGoldenOutput();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralMappingsGoldenOutput() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.debugging.sourcemap.SourceMapGeneratorV3Test() {
				public void runTest() throws Exception {
					testLiteralMappingsGoldenOutput();
				}
			};
			testcase.run();
		}
	}

}