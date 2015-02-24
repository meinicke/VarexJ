package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class BasicErrorManagerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testOrderingSourceName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingSourceName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingSourceName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingSourceName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingLineno1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingLineno1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingLineno2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingLineno2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingCheckLevel() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingCheckLevel();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingCharno1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingCharno1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingCharno2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingCharno2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingBothNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingBothNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrderingDescription() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.BasicErrorManagerTest() {
				public void runTest() throws Exception {
					testOrderingDescription();
				}
			};
			testcase.run();
		}
	}

}