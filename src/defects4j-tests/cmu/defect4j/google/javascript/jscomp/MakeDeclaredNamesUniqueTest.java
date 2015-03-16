package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MakeDeclaredNamesUniqueTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMakeLocalNamesUniqueWithContext1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testMakeLocalNamesUniqueWithContext1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMakeLocalNamesUniqueWithContext2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testMakeLocalNamesUniqueWithContext2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMakeLocalNamesUniqueWithContext3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testMakeLocalNamesUniqueWithContext3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMakeLocalNamesUniqueWithContext4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testMakeLocalNamesUniqueWithContext4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMakeLocalNamesUniqueWithContext5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testMakeLocalNamesUniqueWithContext5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testArguments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMakeLocalNamesUniqueWithoutContext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testMakeLocalNamesUniqueWithoutContext();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyInversion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testOnlyInversion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyInversion2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testOnlyInversion2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyInversion3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testOnlyInversion3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOnlyInversion4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testOnlyInversion4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstRemovingRename1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testConstRemovingRename1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstRemovingRename2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest() {
				public void runTest() throws Exception {
					testConstRemovingRename2();
				}
			};
			testcase.run();
		}
	}

}