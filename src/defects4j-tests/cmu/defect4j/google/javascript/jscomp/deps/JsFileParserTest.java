package cmu.defect4j.google.javascript.jscomp.deps;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JsFileParserTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParseFile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testParseFile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiplePerLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testMultiplePerLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortcutMode1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testShortcutMode1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortcutMode2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testShortcutMode2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShortcutMode3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testShortcutMode3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncludeGoog1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testIncludeGoog1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncludeGoog2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testIncludeGoog2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncludeGoog3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testIncludeGoog3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncludeGoog4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.deps.JsFileParserTest() {
				public void runTest() throws Exception {
					testIncludeGoog4();
				}
			};
			testcase.run();
		}
	}

}