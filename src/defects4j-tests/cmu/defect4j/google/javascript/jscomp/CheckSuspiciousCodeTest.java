package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckSuspiciousCodeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSuspiciousSemi() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSuspiciousCodeTest() {
				public void runTest() throws Exception {
					testSuspiciousSemi();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSuspiciousCodeTest() {
				public void runTest() throws Exception {
					testComparison1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSuspiciousCodeTest() {
				public void runTest() throws Exception {
					testComparison2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSuspiciousCodeTest() {
				public void runTest() throws Exception {
					testComparison3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComparison4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSuspiciousCodeTest() {
				public void runTest() throws Exception {
					testComparison4();
				}
			};
			testcase.run();
		}
	}

}