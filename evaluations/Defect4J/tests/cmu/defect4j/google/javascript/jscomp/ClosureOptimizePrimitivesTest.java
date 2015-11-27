package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ClosureOptimizePrimitivesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testObjectCreateNonConstKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureOptimizePrimitivesTest() {
				public void runTest() throws Exception {
					testObjectCreateNonConstKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectCreateOddParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureOptimizePrimitivesTest() {
				public void runTest() throws Exception {
					testObjectCreateOddParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectCreate1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureOptimizePrimitivesTest() {
				public void runTest() throws Exception {
					testObjectCreate1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectCreate2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureOptimizePrimitivesTest() {
				public void runTest() throws Exception {
					testObjectCreate2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectCreate3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureOptimizePrimitivesTest() {
				public void runTest() throws Exception {
					testObjectCreate3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectCreate4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureOptimizePrimitivesTest() {
				public void runTest() throws Exception {
					testObjectCreate4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectCreate5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureOptimizePrimitivesTest() {
				public void runTest() throws Exception {
					testObjectCreate5();
				}
			};
			testcase.run();
		}
	}

}