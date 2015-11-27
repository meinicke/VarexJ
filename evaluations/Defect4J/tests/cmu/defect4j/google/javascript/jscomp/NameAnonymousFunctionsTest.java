package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NameAnonymousFunctionsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSimpleVarAssignment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testSimpleVarAssignment();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToPrototype2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToPrototype2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToPrototype3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToPrototype3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToPrototype4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToPrototype4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeInitializer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testPrototypeInitializer();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToPropertyOfCallReturnValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToPropertyOfCallReturnValue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToPropertyOfArrayElement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToPropertyOfArrayElement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentToGetElem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testAssignmentToGetElem();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElemWithDashes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testGetElemWithDashes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultiplePrototypeInitializer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testMultiplePrototypeInitializer();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testRecursiveObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhatCausedIeToFail() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NameAnonymousFunctionsTest() {
				public void runTest() throws Exception {
					testWhatCausedIeToFail();
				}
			};
			testcase.run();
		}
	}

}