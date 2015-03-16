package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ControlStructureCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNextedWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testNextedWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreak() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testBreak();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakCrossFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testBreakCrossFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBreakCrossFunctionInFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testBreakCrossFunctionInFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueToSwitch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueToSwitch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueToSwitchWithNoCases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueToSwitchWithNoCases();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueToSwitchWithTwoCases() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueToSwitchWithTwoCases();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueToSwitchWithDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueToSwitchWithDefault();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueToLabelSwitch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueToLabelSwitch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueOutsideSwitch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueOutsideSwitch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueNotCrossFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueNotCrossFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContinueNotCrossFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testContinueNotCrossFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseOfWith1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testUseOfWith1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseOfWith2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testUseOfWith2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseOfWith3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ControlStructureCheckTest() {
				public void runTest() throws Exception {
					testUseOfWith3();
				}
			};
			testcase.run();
		}
	}

}