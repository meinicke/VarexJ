package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ReplaceCssNamesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDoNotUseReplacementMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testDoNotUseReplacementMap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneArgWithUnknownStringLiterals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testOneArgWithUnknownStringLiterals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneArgWithSimpleStringLiterals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testOneArgWithSimpleStringLiterals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneArgWithCompositeClassNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testOneArgWithCompositeClassNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneArgWithCompositeClassNamesFull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testOneArgWithCompositeClassNamesFull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneArgWithCompositeClassNamesWithUnknownParts() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testOneArgWithCompositeClassNamesWithUnknownParts();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoArgsWithStringLiterals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testTwoArgsWithStringLiterals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoArsWithVariableFirstArg() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testTwoArsWithVariableFirstArg();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoArgsWithVariableFirstArgFull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testTwoArgsWithVariableFirstArgFull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testZeroArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testZeroArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testManyArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testManyArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonStringArgument() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testNonStringArgument();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSymbolMapStripsCallAndDoesntIssueWarnings() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testNoSymbolMapStripsCallAndDoesntIssueWarnings();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhitelistByPart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testWhitelistByPart();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhitelistByWhole() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testWhitelistByWhole();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhitelistWithDashes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceCssNamesTest() {
				public void runTest() throws Exception {
					testWhitelistWithDashes();
				}
			};
			testcase.run();
		}
	}

}