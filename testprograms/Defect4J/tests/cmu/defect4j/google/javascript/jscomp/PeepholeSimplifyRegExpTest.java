package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeSimplifyRegExpTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testWaysOfMatchingEmptyString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testWaysOfMatchingEmptyString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCharsetFixup() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testCharsetFixup();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCharsetOptimizations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testCharsetOptimizations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGroups() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testGroups();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testBackReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleCharAlterations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testSingleCharAlterations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAlterations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testAlterations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAlterations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testNestedAlterations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEscapeSequencesAndNonLatinChars() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testEscapeSequencesAndNonLatinChars();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnchors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testAnchors();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRepetitions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testRepetitions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoreCharsets() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testMoreCharsets();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoreRegularExpression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testMoreRegularExpression();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrecedence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testPrecedence();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMalformedRegularExpressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeSimplifyRegExpTest() {
				public void runTest() throws Exception {
					testMalformedRegularExpressions();
				}
			};
			testcase.run();
		}
	}

}