package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FixedPointGraphTraversalTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGraph1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGraph10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FixedPointGraphTraversalTest() {
				public void runTest() throws Exception {
					testGraph10();
				}
			};
			testcase.run();
		}
	}

}