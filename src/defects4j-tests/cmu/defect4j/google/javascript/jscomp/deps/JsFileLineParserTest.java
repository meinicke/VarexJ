package cmu.defect4j.google.javascript.jscomp.deps;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsFileLineParserTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSingleLine1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testSingleLine1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleLine2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testSingleLine2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiLine1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMultiLine1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiLine2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMultiLine2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiLine3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMultiLine3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiLine4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMultiLine4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiLine5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMultiLine5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiLine6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMultiLine6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedLine1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMixedLine1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedLine2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileLineParserTest() {
				public void runTest() throws Exception {
					testMixedLine2();
				}
			};
			testcase.run();
		}
	}

}