package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GatherSideEffectSubexpressionsCallbackTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIllegalArgumentIfNotAndOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest() {
				public void runTest() throws Exception {
					testIllegalArgumentIfNotAndOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAndOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest() {
				public void runTest() throws Exception {
					testAndOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalArgumentIfNoSideEffectAndOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest() {
				public void runTest() throws Exception {
					testIllegalArgumentIfNoSideEffectAndOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalArgumentIfNotHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest() {
				public void runTest() throws Exception {
					testIllegalArgumentIfNotHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalArgumentIfNoSideEffectHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest() {
				public void runTest() throws Exception {
					testIllegalArgumentIfNoSideEffectHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalArgumentIfHookKeepNeitherBranch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest() {
				public void runTest() throws Exception {
					testIllegalArgumentIfHookKeepNeitherBranch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

}