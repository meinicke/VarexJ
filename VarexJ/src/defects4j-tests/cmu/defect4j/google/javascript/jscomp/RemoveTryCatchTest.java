package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RemoveTryCatchTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRemoveTryCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveTryCatchTest() {
				public void runTest() throws Exception {
					testRemoveTryCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTryFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveTryCatchTest() {
				public void runTest() throws Exception {
					testRemoveTryFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveTryCatchFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveTryCatchTest() {
				public void runTest() throws Exception {
					testRemoveTryCatchFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreserveTryBlockContainingReturnStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveTryCatchTest() {
				public void runTest() throws Exception {
					testPreserveTryBlockContainingReturnStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreserveAnnotatedTryBlock() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveTryCatchTest() {
				public void runTest() throws Exception {
					testPreserveAnnotatedTryBlock();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfTryFinally() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveTryCatchTest() {
				public void runTest() throws Exception {
					testIfTryFinally();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfTryCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveTryCatchTest() {
				public void runTest() throws Exception {
					testIfTryCatch();
				}
			};
			testcase.run();
		}
	}

}