package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsMessageExtractorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSyntaxError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testSyntaxError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSyntaxError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testSyntaxError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractNewStyleMessage1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testExtractNewStyleMessage1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractNewStyleMessage2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testExtractNewStyleMessage2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractOldStyleMessage1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testExtractOldStyleMessage1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractOldStyleMessage2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testExtractOldStyleMessage2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractOldStyleMessage3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testExtractOldStyleMessage3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtractMixedMessages() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testExtractMixedMessages();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateUnnamedVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testDuplicateUnnamedVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMeaningAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JsMessageExtractorTest() {
				public void runTest() throws Exception {
					testMeaningAnnotation();
				}
			};
			testcase.run();
		}
	}

}