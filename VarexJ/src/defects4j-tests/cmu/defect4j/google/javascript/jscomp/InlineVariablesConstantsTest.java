package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class InlineVariablesConstantsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInlineVariablesConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testInlineVariablesConstants();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineArraysOrRegexps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testNoInlineArraysOrRegexps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineVariablesConstantsJsDocStyle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testInlineVariablesConstantsJsDocStyle();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConditionallyDefinedConstant1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testInlineConditionallyDefinedConstant1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConditionallyDefinedConstant2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testInlineConditionallyDefinedConstant2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineConditionallyDefinedConstant3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testInlineConditionallyDefinedConstant3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineDefinedConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testInlineDefinedConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineVariablesConstantsWithInlineAllStringsOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testInlineVariablesConstantsWithInlineAllStringsOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineWithoutConstDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testNoInlineWithoutConstDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoInlineAliases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InlineVariablesConstantsTest() {
				public void runTest() throws Exception {
					testNoInlineAliases();
				}
			};
			testcase.run();
		}
	}

}