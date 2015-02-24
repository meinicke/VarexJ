package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SideEffectsAnalysisTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDegenerateSafeMoves() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SideEffectsAnalysisTest() {
				public void runTest() throws Exception {
					testDegenerateSafeMoves();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVisibilitySafeMoves() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SideEffectsAnalysisTest() {
				public void runTest() throws Exception {
					testVisibilitySafeMoves();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDegenerateUnsafeMoves() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SideEffectsAnalysisTest() {
				public void runTest() throws Exception {
					testDegenerateUnsafeMoves();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVisibilityUnsafeMoves() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SideEffectsAnalysisTest() {
				public void runTest() throws Exception {
					testVisibilityUnsafeMoves();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVisibilityMoveCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SideEffectsAnalysisTest() {
				public void runTest() throws Exception {
					testVisibilityMoveCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVisibilityMergesParametersWithHeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SideEffectsAnalysisTest() {
				public void runTest() throws Exception {
					testVisibilityMergesParametersWithHeap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMovedSideEffectsMustHaveSameControlFlow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SideEffectsAnalysisTest() {
				public void runTest() throws Exception {
					testMovedSideEffectsMustHaveSameControlFlow();
				}
			};
			testcase.run();
		}
	}

}