package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeReplaceKnownMethodsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testStringIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testStringIndexOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringJoinAddSparse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testStringJoinAddSparse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoStringJoin() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testNoStringJoin();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringJoinAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testStringJoinAdd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringJoinAdd_b1992789() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testStringJoinAdd_b1992789();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldStringSubstr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testFoldStringSubstr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldStringSubstring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testFoldStringSubstring();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldStringCharAt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testFoldStringCharAt();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldStringCharCodeAt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testFoldStringCharCodeAt();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldStringSplit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testFoldStringSplit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJoinBug() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testJoinBug();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToUpper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testToUpper();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLower() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testToLower();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldParseNumbers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest() {
				public void runTest() throws Exception {
					testFoldParseNumbers();
				}
			};
			testcase.run();
		}
	}

}