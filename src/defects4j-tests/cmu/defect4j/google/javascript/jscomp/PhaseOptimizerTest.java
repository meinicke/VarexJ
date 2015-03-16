package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PhaseOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInfiniteLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testInfiniteLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneRun() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testOneRun();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoop1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testLoop1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoop2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testLoop2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoop3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testLoop3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotInfiniteLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testNotInfiniteLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCombined() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testCombined();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSanityCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testSanityCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConsumption1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testConsumption1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConsumption2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testConsumption2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConsumption3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testConsumption3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateLoop() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testDuplicateLoop();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPassOrdering() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testPassOrdering();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProgress() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PhaseOptimizerTest() {
				public void runTest() throws Exception {
					testProgress();
				}
			};
			testcase.run();
		}
	}

}